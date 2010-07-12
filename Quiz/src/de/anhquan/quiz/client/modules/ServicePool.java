package de.anhquan.quiz.client.modules;

import com.google.gwt.core.client.GWT;

public class ServicePool {

	public static StaticContentServiceAsync RPC_STATIC_CONTENT;
	
	public static QuizServiceAsync RPC_QUIZ;
	
	
	static {
		RPC_QUIZ = GWT.create(QuizService.class);
		//((ServiceDefTarget) RPC_QUIZ).setServiceEntryPoint(GWT.getModuleBaseURL() + "quizrpc");
		
		RPC_STATIC_CONTENT =  GWT.create(StaticContentService.class);
		//((ServiceDefTarget) RPC_STATIC_CONTENT).setServiceEntryPoint(GWT.getModuleBaseURL() + "staticrpc");
		
	}
	
}
