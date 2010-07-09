package de.anhquan.quiz.shared;

import java.io.Serializable;


public class TranslatedString implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
