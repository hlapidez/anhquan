package de.anhquan.quiz.client.modules;

import org.restlet.client.resource.ClientProxy;
import org.restlet.client.resource.Delete;
import org.restlet.client.resource.Get;
import org.restlet.client.resource.Put;
import org.restlet.client.resource.Result;

import de.anhquan.quiz.shared.QuizItem;

public interface QuizResourceProxy extends ClientProxy {

    @Get("json")
    public void getQuizItemById(Integer id, Result<QuizItem> callback);

    @Put("json")
	public void next(Result<Void> callback);

}
