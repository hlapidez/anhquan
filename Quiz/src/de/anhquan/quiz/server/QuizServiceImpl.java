package de.anhquan.quiz.server;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.anhquan.quiz.client.modules.QuizService;
import de.anhquan.quiz.shared.Question;
import de.anhquan.quiz.shared.QuizResult;

public class QuizServiceImpl extends RemoteServiceServlet implements QuizService {

	private static final long serialVersionUID = 1L;

	private Log log = LogFactory.getLog(QuizServiceImpl.class);
	
	@Override
	public QuizResult getQuizById(int quizId) {
		log.trace("getQuizById: id = "+quizId);		

		QuizResult result = new QuizResult();
		result.setQuiz(null);
		result.setQuizCount(QuizDB.quizzes.size());
		
		for (Question question : QuizDB.quizzes) {
			log.trace("questId = "+question.getId());
			if (question.getId() == quizId){
				log.trace("FOUND!!!");
				result.setQuiz(question);
				break;
			}
		}
		return result;
	}

	@Override
	public QuizResult getQuizByName(String name) {
		log.trace("getQuizByName: name = "+name);		
		QuizResult result = new QuizResult();
		result.setQuiz(null);
		result.setQuizCount(QuizDB.quizzes.size());
		
		for (Question Question : QuizDB.quizzes) {
			if (Question.getName() == name){
				result.setQuiz(Question);
				break;
			}
		}
		return result;
	}

	@Override
	public QuizResult nextQuiz(int currentQuizId) {
			
		int nextId = currentQuizId + 1;
		log.trace("nextQuiz: nextId = "+nextId + " Question count = "+QuizDB.quizzes.size());	
		
		if (nextId>=QuizDB.quizzes.size())
			return null;
		return getQuizById(nextId);
	}

	@Override
	public QuizResult prevQuiz(int currentQuizId) {
		int prevId = currentQuizId - 1;
		if (prevId<0)
			return null;
		return getQuizById(prevId);
	}

	@Override
	public Integer getQuizCount() {
		return QuizDB.quizzes.size();
	}

}
