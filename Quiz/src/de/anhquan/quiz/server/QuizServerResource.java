package de.anhquan.quiz.server;

import org.restlet.resource.ServerResource;

import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.QuizResource;

/**
 * The server side implementation of the Restlet resource.
 */
public class QuizServerResource extends ServerResource implements
        QuizResource {

	private Integer curQuizId;
	public QuizServerResource(){
		curQuizId = null;
	}
	
	@Override
	public QuizItem getQuizItemById(Integer id) {
		QuizItem item = QuizDB.getQuizById(id);
		
		return item;
	}

	@Override
	public QuizItem gotoItem(Integer id) {
		
		return QuizDB.getQuizById(id);
	}




}
