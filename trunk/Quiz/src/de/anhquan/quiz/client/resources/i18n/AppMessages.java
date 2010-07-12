package de.anhquan.quiz.client.resources.i18n;

import com.google.gwt.core.client.GWT;
import com.google.gwt.i18n.client.Messages;

public interface AppMessages extends Messages{

	public static AppMessages INST = (AppMessages) GWT.create(AppMessages.class);

	String congratulation1(String user);
	String congratulation2(String user);
	String congratulation3(String user);
	String congratulation4(String user);
	String congratulation5(String user);

	String sorryTryAgain1(String user);
	String sorryTryAgain2(String user);
	String sorryTryAgain3(String user);
	String sorryTryAgain4(String user);
	String sorryTryAgain5(String user);
	
	@DefaultMessage ("Loading ...")
	String loading();
	
	@DefaultMessage ("Answer")
	String btAnswer();
	
	@DefaultMessage ("Previous")
	String btPrevious();
	
	@DefaultMessage ("Next")
	String btNext();
	
	@DefaultMessage ("Solution")
	String btSolution();
	
	@DefaultMessage ("Hint")
	String btHint();
	
	@DefaultMessage ("Why wrong?")
	String btWhyWrong();
	
	@DefaultMessage ("Note")
	String btNote();
	
	@DefaultMessage ("There is no note")
	String emptyNote();
	
	@DefaultMessage ("Sorry. No one updates it")
	String emptyWhyWrong();
	
	@DefaultMessage ("There is no hint")
	String emptyHint();
	
}
