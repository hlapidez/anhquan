package de.anhquan.quiz.client.modules;

import java.util.List;

import org.restlet.client.data.MediaType;
import org.restlet.client.data.Preference;
import org.restlet.client.resource.Result;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.anhquan.quiz.client.AbstractPage;
import de.anhquan.quiz.client.resources.Images;
import de.anhquan.quiz.client.widgets.TranslatedCheckBox;
import de.anhquan.quiz.client.widgets.TranslatedLabel;
import de.anhquan.quiz.client.widgets.TranslatedTextBox;
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
		panel.setWidget(2, 0, createQuizInfoPanel());
		panel.setWidget(3, 0, createNotificationPanel());
		panel.setWidget(4, 0, createBody());
		

		quizValidator = new QuizValidator ();
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
				QuizPage.this.showQuiz(result);
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

	Image image = null;
	TranslatedLabel question;
	TranslatedLabel answerHeader;
	Panel imageHolder;
	Label loadingMsg;
	Panel loadingPanel;
	Image loadingIcon;
	
	QuizItem quiz = null;
	private QuizValidator quizValidator;

	Panel quizContent;
	Panel answerPanel;

	Button btPrev;
	Button btNext;
	Button btAnswer;

	public void showQuiz(QuizItem result) {
		quiz = result;
		if (quiz == null) {
			return;
		}
		
		quizValidator.reset();
		
		updateQuizInfo();

		// status
		currentQuizId = quiz.getId();
		int quizCount = quiz.getInfo().getQuizCount();
		btPrev.setEnabled(currentQuizId > 0);
		btNext.setEnabled(currentQuizId < (quizCount-1));
		btAnswer.setEnabled(true);
		
		// common
		setNotification("");
		question.setContent(quiz.getText());

		// image
		updateImage(quiz.getImage());

		quizContent.setVisible(true);
		
		answerPanel.clear();
		String txt  = quiz.getAnswerHeader().getOrigin(); 
		if (!isEmpty(txt)){
			answerHeader = new TranslatedLabel();
			answerHeader.setContent(quiz.getAnswerHeader());
			answerPanel.add(answerHeader);
		}
		
		List<Choice> choices = quiz.getChoices();
		for (Choice choice : choices) {
			Solution s = choice.isSolution();
			if (s instanceof TextSolution){
		
				TranslatedTextBox txtBox = new TranslatedTextBox();
				txtBox.setContent(choice.getText());
				answerPanel.add(txtBox);
				
				quizValidator.add((TextSolution)s, txtBox);
			}
			else if (s instanceof BooleanSolution){
				TranslatedCheckBox cb = new TranslatedCheckBox();
				cb.setContent(choice.getText());
				answerPanel.add(cb);
				
				quizValidator.add ((BooleanSolution)s, cb);
			}
		}
		
	}

	private boolean isEmpty(String txt) {
		return (txt==null) || (txt.length()==0);
	}

	private HTML notification;
	private HTML txtQuestionInfo;

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
	
	
	private Widget createQuizInfoPanel(){
		Panel panel = new HorizontalPanel();
		
		txtQuestionInfo = new HTML();
		panel.add(txtQuestionInfo);
		
		return panel;
	}
	
	private void updateQuizInfo(){
		if (quiz==null){
			return;
		}
		
		String html = "<strong>Question</strong> #"+quiz.getId() + "/" + quiz.getInfo().getQuizCount()+ " [ "+quiz.getName() + " ] Category:" + quiz.getCategory() + " - " + quiz.getSubCategory();
		txtQuestionInfo.setHTML(html);
	}


	private Widget createNotificationPanel() {
		// notification
		Panel panel = new HorizontalPanel();
		
		notification = new HTML();
		notification.setStyleName("Notification-Panel");
		
		panel.add(notification);
		return panel;
	}

	protected void validateAnswer() {

		if (quiz == null) {
			setNotification("Please select a question first!");
		}
		else{
			if (quizValidator.validate()){
				setNotification("Congratulation!");
			}
			else{
				setNotification("Dont give it up. You will do it right next time!");
			}
		}

	}


	private Widget createBody() {
		quizContent = new VerticalPanel();
		question = new TranslatedLabel();
		quizContent.add(question);
		
		imageHolder = new SimplePanel();
		quizContent.add(imageHolder);
		answerHeader = new TranslatedLabel();
		quizContent.add(answerHeader);

		answerPanel = new VerticalPanel();
		quizContent.add(answerPanel);

		return quizContent;
	}

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

		btAnswer = new Button("Answer");
		btAnswer.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				btAnswer.setEnabled(false);
				validateAnswer();
			}
		});
		
		CheckBox cbMark = new CheckBox("Remember it!");
		
		header.add(btPrev);
		header.add(btNext);
		header.add(btAnswer);
		header.add(cbMark);



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
