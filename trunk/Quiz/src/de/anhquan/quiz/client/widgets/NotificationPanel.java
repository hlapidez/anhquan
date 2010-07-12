package de.anhquan.quiz.client.widgets;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;

import de.anhquan.quiz.client.widgets.NotificationPanel.MessageType;

public class NotificationPanel extends HorizontalPanel{

	
	public enum MessageType{
		ERROR,
		ANSWER_CORRECT,
		ANSWER_INCORRECT,
		FAILURE,
		HINT, 
		BLANK
	}
	
	HTML notification = new HTML();
	
	public NotificationPanel(){
		
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
	
	
}
