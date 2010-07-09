package de.anhquan.quiz.shared;

import java.io.Serializable;


public class Solution<T> implements Serializable{

	private T value;
	
	public Solution(){
		
	}
	
	public Solution(T value){
		setValue(value);
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
	
}
