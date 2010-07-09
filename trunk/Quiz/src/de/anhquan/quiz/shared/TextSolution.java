package de.anhquan.quiz.shared;

import java.io.Serializable;

public class TextSolution implements Solution, Serializable {
	private static final long serialVersionUID = 1L;
	private String value;

	public TextSolution() {

	}

	public TextSolution(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
