package de.anhquan.quiz.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Solution<T> implements IsSerializable{

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
