package de.anhquan.quiz.shared;

import com.google.gwt.user.client.rpc.IsSerializable;

public class TranslatedString implements IsSerializable{

	private String origin;
	private String translation;
	
	public static final TranslatedString EMPTY = new TranslatedString();
	public TranslatedString(){
		this("","");
	}
	
	public TranslatedString(String origin){
		this(origin,"");
	}
	
	public TranslatedString(String origin, String translation){
		setOrigin(origin);
		setTranslation(translation);
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}
	
	
}
