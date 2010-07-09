package de.anhquan.quiz.shared;

import org.restlet.resource.Delete;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.Put;

/**
 * The resource associated to a contact.
 */
public interface QuizResource {

//    @Get
//    public Contact retrieve();
//
//    @Put
//    public void store(QuizItem item);
//    
    @Get("json")
    public QuizItem getQuizItemById(Integer id);

//    @Delete
//    public void removeQuizItemById(Integer id);

    @Put("json")
	public void next();
    
}