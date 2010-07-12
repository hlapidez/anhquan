package de.anhquan.quiz.client.modules;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.anhquan.quiz.shared.QuizItem;

@RemoteServiceRelativePath("quizrpc")
public interface QuizService extends RemoteService{

	public QuizItem getQuizById(int quizId) throws IllegalArgumentException;
}
