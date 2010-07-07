package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.Question;

public class QuizPool {

	public Question getQuizById(int quizId){
		for (Question quiz : QuizDB.quizzes) {
			if (quiz.getId() == quizId)
				return quiz;
		}
		return null;
	}
	
	public Question getQuizByNumber(String name){
		for (Question quiz : QuizDB.quizzes) {
			if (quiz.getName() == name)
				return quiz;
		}
		return null;
	}
}
