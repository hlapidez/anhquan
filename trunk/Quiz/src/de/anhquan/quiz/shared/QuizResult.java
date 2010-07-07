package de.anhquan.quiz.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class QuizResult implements IsSerializable {

	private Question question;
	private int quizCount;

	public Question getQuiz() {
		return question;
	}

	public void setQuiz(Question question) {
		this.question = question;
	}

	public int getQuizCount() {
		return quizCount;
	}

	public void setQuizCount(int quizCount) {
		this.quizCount = quizCount;
	}

}
