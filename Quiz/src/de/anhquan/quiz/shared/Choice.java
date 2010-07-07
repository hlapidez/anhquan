package de.anhquan.quiz.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Choice<T> implements IsSerializable {

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
