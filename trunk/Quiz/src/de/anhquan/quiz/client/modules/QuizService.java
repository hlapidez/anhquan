package de.anhquan.quiz.client.modules;

import com.google.gwt.user.client.rpc.RemoteService;

import de.anhquan.quiz.shared.QuizResult;

public interface QuizService extends RemoteService{

	public QuizResult getQuizById(int quizId);
	public QuizResult getQuizByName(String quizName);
	public QuizResult nextQuiz(int currentQuizId);
	public QuizResult prevQuiz(int currentQuizId);
	public Integer getQuizCount();
	
}
