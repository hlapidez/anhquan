package de.anhquan.quiz.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class SerializedBoolean implements IsSerializable {

	private boolean value;
	
	public static final SerializedBoolean TRUE = new SerializedBoolean(true);
	public static final SerializedBoolean FALSE = new SerializedBoolean(false);
	
	public SerializedBoolean(){
		value = false;
	}
	
	public SerializedBoolean(boolean value){
		this.value = value;
	}

	public boolean isValue() {
		return value;
	}

	public void setValue(boolean value) {
		this.value = value;
	}
	
}