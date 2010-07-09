package de.anhquan.quiz.shared;

import java.io.Serializable;


public class Choice<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	TranslatedString text;
	Solution<T> solution;

	public Choice() {
		setSolution(null);
		setText(TranslatedString.EMPTY);
	}

	public Choice(Solution<T> solution, TranslatedString text) {
		setSolution(solution);
		setText(text);
	}

	public TranslatedString getText() {
		return text;
	}

	public void setText(TranslatedString text) {
		this.text = text;
	}

	public Solution<T> isSolution() {
		return solution;
	}

	public void setSolution(Solution<T> solution) {
		this.solution = solution;
	}

}
