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
		return QuizDB.quizzes.get(0);
	}

	@Override
	public QuizItem gotoItem(Integer step) {
		
		System.out.println("GogoItem: "+1);
		if (curQuizId==null)
			curQuizId = -1;
		
		curQuizId+= 1;
		
		return QuizDB.quizzes.get(curQuizId);
	}




}
