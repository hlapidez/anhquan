package de.anhquan.quiz.client.modules;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.anhquan.quiz.shared.QuizItem;

public interface QuizServiceAsync {
	public void getQuizById(int quizId, AsyncCallback<QuizItem> callback);
}
