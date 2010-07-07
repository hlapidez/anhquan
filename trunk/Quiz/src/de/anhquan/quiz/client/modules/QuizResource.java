package de.anhquan.quiz.client.modules;

import org.restlet.client.resource.ClientProxy;
import org.restlet.client.resource.Get;
import org.restlet.client.resource.Result;

import de.anhquan.quiz.shared.QuizResult;


public interface QuizResource extends ClientProxy {
		
    @Get
    public void getQuizById(int quizId, Result<QuizResult> callback);

    @Get
    public void getQuizByName(String quizName, Result<QuizResult> callback);

    @Get
    public void nextQuiz(int currentQuizId, Result<QuizResult> callback);

    @Get
    public void prevQuiz(int currentQuizId, Result<QuizResult> callback);

    @Get
    public void getQuizCount(Result<Integer> callback);

}
