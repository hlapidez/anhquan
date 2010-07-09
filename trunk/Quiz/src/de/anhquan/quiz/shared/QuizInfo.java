package de.anhquan.quiz.shared;

import java.io.Serializable;
import java.util.Date;

public class QuizInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	private int quizCount;
	
	private Date startTime;
	
	public int getQuizCount() {
		return quizCount;
	}

	public void setQuizCount(int quizCount) {
		this.quizCount = quizCount;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

}