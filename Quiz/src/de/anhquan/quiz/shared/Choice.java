package de.anhquan.quiz.shared;

import java.io.Serializable;


public class Choice implements Serializable {

	private static final long serialVersionUID = 1L;
	TranslatedString text;
	Solution solution;

	public Choice() {
		setSolution(null);
		setText(TranslatedString.EMPTY);
	}

	public Choice(Solution solution, TranslatedString text) {
		setSolution(solution);
		setText(text);
	}

	public TranslatedString getText() {
		return text;
	}

	public void setText(TranslatedString text) {
		this.text = text;
	}

	public Solution isSolution() {
		return solution;
	}

	public void setSolution(Solution solution) {
		this.solution = solution;
	}

}
