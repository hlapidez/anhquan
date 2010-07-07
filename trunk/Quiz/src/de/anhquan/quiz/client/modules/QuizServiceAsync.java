package de.anhquan.quiz.client.modules;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.anhquan.quiz.shared.QuizResult;

public interface QuizServiceAsync {
	public void getQuizById(int quizId, AsyncCallback<QuizResult> callback);
	public void getQuizByName(String name, AsyncCallback<QuizResult> callback);
	public void nextQuiz(int currentQuizId, AsyncCallback<QuizResult> callback);
	public void prevQuiz(int currentQuizId, AsyncCallback<QuizResult> callback);
	public void getQuizCount(AsyncCallback<Integer> callback);
	
}
