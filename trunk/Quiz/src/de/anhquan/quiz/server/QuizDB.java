package de.anhquan.quiz.server;

import java.util.ArrayList;
import java.util.List;

import de.anhquan.quiz.shared.QuizItem;

public class QuizDB {

	public static final List<QuizItem> quizzes = new ArrayList<QuizItem>();
	
	static{
		new QuizImporter0();
	}

	protected static void addQuiz(QuizItem q) {
		quizzes.add(q);
		
		
	}
	
	public static QuizItem getQuizById(int quizId){
		System.out.println();
		for (QuizItem quiz : QuizDB.quizzes) {
			if (quiz.getId() == quizId){
				quiz.getInfo().setQuizCount(QuizDB.quizzes.size());
				return quiz;
			}
		}
		return null;
	}
	
	public static QuizItem getQuizByNumber(String name){
		for (QuizItem quiz : QuizDB.quizzes) {
			if (quiz.getName() == name)
				return quiz;
		}
		return null;
	}
}
