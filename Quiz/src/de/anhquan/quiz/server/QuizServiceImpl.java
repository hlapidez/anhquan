package de.anhquan.quiz.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.anhquan.quiz.client.modules.QuizService;
import de.anhquan.quiz.shared.QuizItem;

public class QuizServiceImpl extends RemoteServiceServlet implements QuizService {

	private static final long serialVersionUID = 1L;

	@Override
	public QuizItem getQuizById(int id) {
		System.out.println("QuizServiceImpl: getQuizById: "+id);
		
		if (id<1)
			id=1;
		QuizItem item = QuizDB.getQuizById(id);
		System.out.println("Goto: "+id + " - item "+item);
		return item;
	}

}
