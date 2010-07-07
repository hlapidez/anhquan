package de.anhquan.quiz.server;

import org.restlet.client.resource.ClientResource;
import org.restlet.client.resource.Result;
import org.restlet.resource.Get;
import org.restlet.resource.ResourceException;
import org.restlet.resource.ServerResource;

import de.anhquan.quiz.client.modules.QuizResource;
import de.anhquan.quiz.shared.QuizResult;

public class QuizResourceImpl extends ServerResource implements QuizResource{

	@Override
	public ClientResource getClientResource() throws ResourceException{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getQuizById(int quizId, Result<QuizResult> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getQuizByName(String quizName, Result<QuizResult> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nextQuiz(int currentQuizId, Result<QuizResult> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void prevQuiz(int currentQuizId, Result<QuizResult> callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getQuizCount(Result<Integer> callback) {
		// TODO Auto-generated method stub
		
	}

}
