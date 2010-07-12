package de.anhquan.quiz.client.widgets;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.Random;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;

import de.anhquan.quiz.client.resources.i18n.AppConstants;
import de.anhquan.quiz.client.resources.i18n.AppMessages;

public class NotificationPanel extends HorizontalPanel{

	
	public enum MessageType{
		ERROR,
		ANSWER_CORRECT,
		ANSWER_INCORRECT,
		FAILURE,
		HINT, 
		BLANK
	}
	
	HTML notification;
	
	public NotificationPanel(){
		setStyleName("notification");
		notification = new HTML();
		add (notification);
	}

	public void setMessage(MessageType msgType, String msg) {
		notification.setHTML(msg);
		
		switch (msgType){
			case ANSWER_CORRECT:
				notification.setStyleName("notification-answer-correct");
				break;
				
			case ANSWER_INCORRECT:
				notification.setStyleName("notification-answer-incorrect");
				break;
				
			case ERROR:
				notification.setStyleName("notification-error");
				break;
				
			case FAILURE:
				notification.setStyleName("notification-failure");
				break;
				
			case HINT:
				notification.setStyleName("notification-hint");
				break;
				
			default:
				notification.setStyleName("notification-blank");
		}
	}

	public void congratulate() {
		int k = 1 + Random.nextInt(4);
		String str;
		switch(k){
		case 1:
			str = AppMessages.INST.congratulation1("Jerry");
			break;
		case 2:
			str = AppMessages.INST.congratulation2("Jerry");
			break;
		case 3:
			str = AppMessages.INST.congratulation3("Jerry");
			break;
		case 4:
			str = AppMessages.INST.congratulation4("Jerry");
			break;
		default:
			str = AppMessages.INST.congratulation5("Jerry");
		}
		setMessage(MessageType.ANSWER_CORRECT, str);
	}

	public void saySorry() {
		int k = 1 + Random.nextInt(4);
		String str;
		switch(k){
		case 1:
			str = AppMessages.INST.sorryTryAgain1("Jerry");
			break;
		case 2:
			str = AppMessages.INST.sorryTryAgain2("Jerry");
			break;
		case 3:
			str = AppMessages.INST.sorryTryAgain3("Jerry");
			break;
		case 4:
			str = AppMessages.INST.sorryTryAgain4("Jerry");
			break;
		default:
			str = AppMessages.INST.sorryTryAgain5("Jerry");
		}
		setMessage(MessageType.ANSWER_INCORRECT, str);
	}
	
	public void clear(){
		setMessage(MessageType.BLANK, "");

	}
	
}
