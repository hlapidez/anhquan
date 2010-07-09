package de.anhquan.quiz.shared;

import java.io.Serializable;

public class BooleanSolution implements Solution, Serializable {
	private static final long serialVersionUID = 1L;

	private boolean value;

	public BooleanSolution() {
		value = false;
	}

	public BooleanSolution(boolean b) {
		value = b;
	}

	public boolean getValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}

}
