package de.anhquan.quiz.client.modules;

import com.google.gwt.user.client.rpc.RemoteService;

import de.anhquan.quiz.shared.QuizItem;

public interface QuizService extends RemoteService{

	public QuizItem getQuizById(int quizId);
}
