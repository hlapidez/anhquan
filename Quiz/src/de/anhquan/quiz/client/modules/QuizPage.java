package de.anhquan.quiz.client.modules;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.anhquan.quiz.client.AbstractPage;
import de.anhquan.quiz.client.resources.Images;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.Question;
import de.anhquan.quiz.shared.QuizResult;
import de.anhquan.quiz.shared.Solution;

public class QuizPage extends AbstractPage {

	public QuizPage() {
		setName("Demo2");
	}

	@Override
	public Widget onInitialize() {
		FlexTable panel = new FlexTable();
		panel.setWidget(1, 0, createHeader());
		panel.setWidget(2, 0, createBody());
		panel.setWidget(3, 0, createFooter());

		currentQuizId = -1;
		quizSrv = GWT.create(QuizService.class);
		((ServiceDefTarget) quizSrv).setServiceEntryPoint(GWT.getModuleBaseURL() + "quiz");

		gotoNextQuiz();
		return panel;
	}

	int currentQuizId;
	QuizServiceAsync quizSrv = null;

	private void prepareToChangeQuiz() {
		setLoading(true, "Loading ...");
		btNext.setEnabled(false);
		btPrev.setEnabled(false);
	}

	public void gotoNextQuiz() {
		prepareToChangeQuiz();
		quizContent.setVisible(false);
		quizSrv.nextQuiz(currentQuizId, new AsyncCallback<QuizResult>() {

			@Override
			public void onSuccess(QuizResult result) {
				QuizPage.this.updateQuiz(result);
				setLoading(false, "");
			}

			@Override
			public void onFailure(Throwable caught) {
				setNotification(caught.getMessage());
				setLoading(false, "");
			}
		});
	}

	public void gotoPrevQuiz() {
		prepareToChangeQuiz();
		quizContent.setVisible(false);
		quizSrv.prevQuiz(currentQuizId, new AsyncCallback<QuizResult>() {

			@Override
			public void onSuccess(QuizResult result) {
				QuizPage.this.updateQuiz(result);
				setLoading(false, "");
			}

			@Override
			public void onFailure(Throwable caught) {
				setNotification(caught.getMessage());
				setLoading(false, "");
			}
		});
	}

	CheckBox answerA;
	CheckBox answerB;
	CheckBox answerC;
	TextBox answerText;
	HTML prefixAnswerText;
	HTML suffixAnswerText;
	Image image = null;
	HTML question;
	HTML answerHeader;
	Panel imageHolder;
	Label loadingMsg;
	Panel loadingPanel;
	Image loadingIcon;

	Question quiz = null;

	public void updateQuiz(QuizResult result) {
		quiz = result.getQuiz();

		if (quiz == null) {
			setNotification("QUESTION IS EMPTY");
			return;
		}

		// status
		currentQuizId = quiz.getId();
		btPrev.setEnabled(currentQuizId > 0);
		btNext.setEnabled(currentQuizId < (result.getQuizCount() - 1));

		// common
		setNotification("");
		question.setHTML(quiz.getText().getOrigin());

		// image
		updateImage(quiz.getImage());

		quizContent.setVisible(true);
		
		answerPanel.clear();
		String txt  = quiz.getAnswerHeader().getOrigin(); 
		if (!isEmpty(txt)){
			answerHeader = new HTML(txt);
			answerPanel.add(answerHeader);
		}
		
		List<Choice<?>> choices = quiz.getChoices();
		for (Choice<?> choice : choices) {
			Solution s = choice.isSolution();
			Object value = s.getValue();
			if (value instanceof String){
				HorizontalPanel txtPanel = new HorizontalPanel();
				String str = choice.getText().getOrigin();
				String[] ss = str.split(Question.TEXT_INPUT_SEPARATOR);
				
				txtPanel.add(new HTML(ss[0]));
		
				answerText = new TextBox();
				txtPanel.add(answerText);
		
				txtPanel.add(new HTML(ss[1]));
				
				answerPanel.add(txtPanel);
			}
//			else if (value instanceof SerializedBoolean){
//				CheckBox cb = new CheckBox();
//				cb.setText(choice.getText().getOrigin());
//				answerPanel.add(cb);
//			}
		}
		
	}

	private boolean isEmpty(String txt) {
		return (txt==null) || (txt.length()==0);
	}

	private HTML notification;

	private void setNotification(String text) {
		notification.setHTML(text);
	}

	private void updateImage(String url) {
		imageHolder.setVisible(false);
		if (image != null) {
			imageHolder.remove(image);
		}

		image = null;
		if ((url == null) || (url.length() == 0)) {
			imageHolder.setVisible(false);
		} else {
			System.out.println("Show image : " + url);
			imageHolder.setVisible(true);
			image = new Image();
			image.setVisible(true);

			image.setUrl(url);
			imageHolder.add(image);
		}
	}

	private Widget createFooter() {
		Panel footer = new VerticalPanel();

		// notification
		Panel notificationPanel = new HorizontalPanel();
		notification = new HTML();
		notificationPanel.add(notification);
		footer.add(notificationPanel);

		// toolbar
		Panel toolbar = new HorizontalPanel();
		Button btAnswer = new Button("Answer");
		btAnswer.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				validateAnswer();
			}
		});

		toolbar.add(btAnswer);

		Button btSolution = new Button("Solution");
		toolbar.add(btSolution);

		CheckBox cbMark = new CheckBox("Remember it!");
		toolbar.add(cbMark);

		footer.add(toolbar);

		// solution
		HTML solution = new HTML();
		footer.add(solution);

		return footer;
	}

	protected void validateAnswer() {

		if (quiz == null) {
			setNotification("Please select a question first!");
			return;
		}

	}

//	Panel answerTextPanel;
//	Panel choicePanel;
	Panel quizContent;
	Panel answerPanel;

	private Widget createBody() {
		quizContent = new VerticalPanel();
		question = new HTML();
		quizContent.add(question);

		imageHolder = new SimplePanel();
		quizContent.add(imageHolder);
		answerHeader = new HTML();
		quizContent.add(answerHeader);

		answerPanel = new VerticalPanel();
		quizContent.add(answerPanel);
//		// answer with text input
//		answerTextPanel = new HorizontalPanel();
//		prefixAnswerText = new HTML();
//		answerTextPanel.add(prefixAnswerText);
//
//		answerText = new TextBox();
//		answerTextPanel.add(answerText);
//
//		suffixAnswerText = new HTML();
//		answerTextPanel.add(suffixAnswerText);
//		quizContent.add(answerTextPanel);
//
//		// multiple choice answer
//		choicePanel = new VerticalPanel();
//		answerA = new CheckBox();
//		choicePanel.add(answerA);
//
//		answerB = new CheckBox();
//		choicePanel.add(answerB);
//
//		answerC = new CheckBox();
//		choicePanel.add(answerC);
//		quizContent.add(choicePanel);

		return quizContent;
	}

	Button btPrev;
	Button btNext;

	private Widget createHeader() {
		Panel header = new HorizontalPanel();
		btNext = new Button("Next");
		btNext.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				gotoNextQuiz();
			}
		});
		btPrev = new Button("Previous");
		btPrev.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				gotoPrevQuiz();
			}
		});

		header.add(btPrev);
		header.add(btNext);

		loadingPanel = new HorizontalPanel();
		loadingMsg = new Label("");
		loadingIcon = new Image(Images.INST.loadingIcon());
		loadingPanel.add(loadingIcon);
		loadingPanel.add(loadingMsg);
		setLoading(false, "");

		header.add(loadingPanel);

		return header;
	}

	private void setLoading(boolean busy, String text) {
		loadingIcon.setVisible(busy);
		loadingMsg.setText(text);
	}

}
