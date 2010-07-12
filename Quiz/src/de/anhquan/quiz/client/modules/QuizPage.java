package de.anhquan.quiz.client.modules;

import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dev.util.collect.HashMap;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.anhquan.quiz.client.AbstractPage;
import de.anhquan.quiz.client.resources.i18n.AppMessages;
import de.anhquan.quiz.client.widgets.LoadingPanel;
import de.anhquan.quiz.client.widgets.NotificationPanel;
import de.anhquan.quiz.client.widgets.ToolTip;
import de.anhquan.quiz.client.widgets.TranslatedCheckBox;
import de.anhquan.quiz.client.widgets.TranslatedLabel;
import de.anhquan.quiz.client.widgets.TranslatedTextBox;
import de.anhquan.quiz.client.widgets.NotificationPanel.MessageType;
import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.Solution;
import de.anhquan.quiz.shared.TextSolution;

public class QuizPage extends AbstractPage {

	public QuizPage() {
		setName(AppMessages.INST.pageTraining());
	}

	@Override
	public Widget onInitialize() {
		GWT.log("QuizPage:onInitialize ");
		

		FlexTable panel = new FlexTable();
		panel.setWidget(1, 0, createToolbar());
		panel.setWidget(2, 0, createQuizInfoPanel());
		
		notification = new NotificationPanel();
		panel.setWidget(3, 0, notification);
		panel.setWidget(4, 0, createBody());
		
		quizValidator = new QuizValidator ();
		
		currentQuizId = -1;
		
		gotoNextQuiz();

		//NOTE: We have problem with unicode (d)encoding => use GWT RPC instead of RESTlet
//		quizResource = GWT
//        .create(QuizResourceProxy.class);
//        quizResource.getClientResource().setReference("/quiz");
//	   	quizResource.getClientResource().getClientInfo()
//	        .getAcceptedMediaTypes().add(
//	                new Preference<MediaType>(
//	                        MediaType.APPLICATION_JAVA_OBJECT_GWT));
//
//	   	quizResource.getClientResource().getClientInfo().getAcceptedCharacterSets().clear();
//	   	quizResource.getClientResource().getClientInfo().getAcceptedCharacterSets().add(new Preference<CharacterSet>(new CharacterSet(
//	            "ISO-8859-12", "ISO/IEC 8859-12 or Latin 7 character set")));
//
//	   	quizResource.getClientResource().getClientInfo().getAcceptedCharacterSets().add(new Preference<CharacterSet>(CharacterSet.DEFAULT));

		return panel;
	}

	int currentQuizId;
	QuizResourceProxy quizResource;
	
	private void prepareToChangeQuiz() {
		notification.clear();
		loadingPanel.setBusy();
		btNext.setEnabled(false);
		btPrev.setEnabled(false);
	}
	
	private void updateCurrentQuiz(){
		prepareToChangeQuiz();
		quizContent.setVisible(false);
		ServicePool.RPC_QUIZ.getQuizById(currentQuizId, new AsyncCallback<QuizItem>() {
			
			@Override
			public void onSuccess(QuizItem result) {
				QuizPage.this.showQuiz(result);
				loadingPanel.clear();
			}
			
			@Override
			public void onFailure(Throwable caught) {
				notification.setMessage(MessageType.ERROR, "Throwable: "+caught.getMessage());
				loadingPanel.clear();
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
	LoadingPanel loadingPanel;
	
	QuizItem quiz = null;
	private QuizValidator quizValidator;

	Panel quizContent;
	Panel answerPanel;

	Button btPrev;
	Button btNext;
	Button btAnswer;
	Button btSolution;
	Button btHint;
	Button btWhyWrong;
	Button btNote;
	
	ToolTip hint;
	ToolTip whyWrong;
	ToolTip note;

	public void showQuiz(QuizItem result) {
		quiz = result;
		if (quiz == null) {
			return;
		}
		
		quizValidator.reset();
		
		updateQuizInfo();

		// status
		currentQuizId = quiz.getId();
		History.newItem(this.getHistoryToken()+"&quiz_id="+currentQuizId);
		
		int quizCount = quiz.getInfo().getQuizCount();
		btPrev.setEnabled(currentQuizId > 0);
		btNext.setEnabled(currentQuizId < (quizCount-1));
		btAnswer.setEnabled(true);
		 
		// common
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
		
		//hint
		txt = quiz.getHint();
		if (isEmpty(txt)) txt = AppMessages.INST.emptyHint();
		hint.setHTML(txt);
		
		//whyWrong
		txt = quiz.getWhyWrong();
		if (isEmpty(txt)) txt = AppMessages.INST.emptyWhyWrong();
		whyWrong.setHTML(txt);
		
		//note
		txt = quiz.getNote();
		if (isEmpty(txt)) txt = AppMessages.INST.emptyNote();
		note.setHTML(txt);
	}

	private boolean isEmpty(String txt) {
		return (txt==null) || (txt.length()==0);
	}

	private NotificationPanel notification;
	private HTML txtQuestionInfo;

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

			image.setUrl("http://laixeducviet.appspot.com/img/"+url);
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

	protected void validateAnswer() {

		if (quiz == null) {
			notification.setMessage(MessageType.HINT, "Please select a question first!");
		}
		else{
			if (quizValidator.validate()){
				notification.congratulate();
			}
			else{
				notification.saySorry();
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

	private Widget createToolbar() {
		Panel toolbar = new HorizontalPanel();
		btNext = new Button(AppMessages.INST.btNext());
		btNext.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				gotoNextQuiz();
			}
		});
		btPrev = new Button(AppMessages.INST.btPrevious());
		btPrev.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				gotoPrevQuiz();
			}
		});

		btAnswer = new Button(AppMessages.INST.btAnswer());
		btAnswer.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				btAnswer.setEnabled(false);
				validateAnswer();
			}
		});
		
		btSolution = new Button(AppMessages.INST.btSolution());
		btSolution.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				showSolution();
			}
		});
		
		hint = new ToolTip();
		btHint = new Button(AppMessages.INST.btHint());
		btHint.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				GWT.log("Show hint");
					hint.showRelativeTo(btHint);
			}
		});
		
		whyWrong = new ToolTip();
		btWhyWrong = new Button(AppMessages.INST.btWhyWrong());
		btWhyWrong.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				GWT.log("Show whywrong");
					whyWrong.showRelativeTo(btWhyWrong);
			}
		});
		
		note = new ToolTip();
		btNote = new Button(AppMessages.INST.btNote());
		btNote.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				GWT.log("Show note");
				note.showRelativeTo(btNote);
			}
		});
		
		CheckBox cbMark = new CheckBox("Remember it!");
		
		toolbar.add(btPrev);
		toolbar.add(btNext);
		toolbar.add(btNote);		
		toolbar.add(btWhyWrong);
		toolbar.add(btHint);
		toolbar.add(btSolution);
		toolbar.add(btAnswer);
		toolbar.add(cbMark);

		loadingPanel = new LoadingPanel();
		
		toolbar.add(loadingPanel);
		
		return toolbar;
	}

	protected void showWhyWrong() {
		
		
	}

	protected void showHint() {
		// TODO Auto-generated method stub
		
	}

	protected void showSolution() {
		quizValidator.showSolution();
	}

	@Override
	public void preRender() {
		super.preRender();
		
		GWT.log("QuizPage:preRender ");

		String id = getParameters().get("quiz_id");
	
		if (!isEmpty(id))
		{
			
			int i = Integer.parseInt(id);
			
			if (i!=currentQuizId){
				
				currentQuizId = i;
				GWT.log("Set CurrentQuizID for the first time currentQuizId= " + currentQuizId);
				updateCurrentQuiz();
			}
		}
		
		GWT.log("preRender id = " + id);
		
	}
}
