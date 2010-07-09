package de.anhquan.quiz.client.modules;

import java.util.List;

import org.restlet.client.data.MediaType;
import org.restlet.client.data.Preference;
import org.restlet.client.resource.Result;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseUpEvent;
import com.google.gwt.event.dom.client.MouseUpHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.user.client.ui.PopupPanel.PositionCallback;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.anhquan.quiz.client.AbstractPage;
import de.anhquan.quiz.client.resources.Images;
import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.Solution;
import de.anhquan.quiz.shared.TextSolution;

public class QuizPage extends AbstractPage {

	public QuizPage() {
		setName("Silly Quiz");
	}

	@Override
	public Widget onInitialize() {
		FlexTable panel = new FlexTable();
		panel.setWidget(1, 0, createHeader());
		panel.setWidget(2, 0, createBody());
		panel.setWidget(3, 0, createFooter());

		currentQuizId = -1;
		
		quizResource = GWT
        .create(QuizResourceProxy.class);
        quizResource.getClientResource().setReference("/quiz");
	   	 quizResource.getClientResource().getClientInfo()
	        .getAcceptedMediaTypes().add(
	                new Preference<MediaType>(
	                        MediaType.APPLICATION_JAVA_OBJECT_GWT));

		gotoNextQuiz();
		return panel;
	}

	int currentQuizId;
	QuizResourceProxy quizResource;

	private void prepareToChangeQuiz() {
		setLoading(true, "Loading ...");
		btNext.setEnabled(false);
		btPrev.setEnabled(false);
	}
	
	private void updateCurrentQuiz(){
		prepareToChangeQuiz();
		quizContent.setVisible(false);
		
	   	quizResource.getQuizItemById(currentQuizId, new Result<QuizItem>() {
			
			@Override
			public void onSuccess(QuizItem result) {
				QuizPage.this.updateQuiz(result);
				setLoading(false, "");
			}
			
			@Override
			public void onFailure(Throwable caught) {
				caught.printStackTrace();
				setNotification("Throwable: "+caught.getMessage());
				setLoading(false, "");
			}
		});
	}

	public void gotoNextQuiz() {
		currentQuizId++;
		updateCurrentQuiz();
	}

	public void gotoPrevQuiz() {
		currentQuizId--;
		updateCurrentQuiz();
	}

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
	
	QuizItem quiz = null;

	public void updateQuiz(QuizItem result) {
		quiz = result;

		if (quiz == null) {
			setNotification("QUESTION IS EMPTY");
			return;
		}

		// status
		currentQuizId = quiz.getId();
		int quizCount = quiz.getInfo().getQuizCount();
		btPrev.setEnabled(currentQuizId > 0);
		btNext.setEnabled(currentQuizId < (quizCount-1));

		// common
		setNotification("Question "+(currentQuizId+1)+"/"+quizCount);
		question.setHTML(quiz.getText().getOrigin());
		transQuestion.setHTML(quiz.getText().getTranslation());

		// image
		updateImage(quiz.getImage());

		quizContent.setVisible(true);
		
		answerPanel.clear();
		String txt  = quiz.getAnswerHeader().getOrigin(); 
		if (!isEmpty(txt)){
			answerHeader = new HTML(txt);
			answerPanel.add(answerHeader);
		}
		
		List<Choice> choices = quiz.getChoices();
		for (Choice choice : choices) {
			Solution s = choice.isSolution();
			if (s instanceof TextSolution){
				HorizontalPanel txtPanel = new HorizontalPanel();
				String str = choice.getText().getOrigin();
				String[] ss = str.split(QuizItem.TEXT_INPUT_SEPARATOR);
				
				txtPanel.add(new HTML(ss[0]));
		
				answerText = new TextBox();
				txtPanel.add(answerText);
		
				txtPanel.add(new HTML(ss[1]));
				
				answerPanel.add(txtPanel);
			}
			else if (s instanceof BooleanSolution){
				CheckBox cb = new CheckBox();
				cb.setText(choice.getText().getOrigin());
				answerPanel.add(cb);
			}
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
		}

	}

//	Panel answerTextPanel;
//	Panel choicePanel;
	Panel quizContent;
	Panel answerPanel;
	HTML transQuestion;
	PopupPanel transQuestionPanel;

	private Widget createBody() {
		quizContent = new VerticalPanel();
		question = new HTML();
		quizContent.add(question);
		transQuestionPanel = new PopupPanel();
		transQuestionPanel.setGlassEnabled(false);
		transQuestionPanel.setAutoHideEnabled(true);
		transQuestionPanel.setModal(true);
		transQuestion = new HTML();
		transQuestionPanel.add(transQuestion);
		
		question.addMouseUpHandler(new MouseUpHandler() {
			
			@Override
			public void onMouseUp(MouseUpEvent event) {
				transQuestionPanel.showRelativeTo(question);				
			}
		});
		
		question.addMouseOutHandler(new MouseOutHandler() {
			
			@Override
			public void onMouseOut(MouseOutEvent event) {
				transQuestionPanel.setVisible(false);
			}
		});
		

		imageHolder = new SimplePanel();
		quizContent.add(imageHolder);
		answerHeader = new HTML();
		quizContent.add(answerHeader);

		answerPanel = new VerticalPanel();
		quizContent.add(answerPanel);

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