package de.anhquan.quiz.shared;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.rpc.IsSerializable;

public class Question implements IsSerializable {

	public static final String TEXT_INPUT_SEPARATOR = "___";
	private TranslatedString text = TranslatedString.EMPTY;
	private TranslatedString answerHeader = TranslatedString.EMPTY;

	private List<Choice<?>> choices;

	private int point;
	private int id;
	private String name;
	
	private String image;
	
	private String category;
	
	private String subCategory;
	
	public Question(){
		
	}

	public TranslatedString getText() {
		return text;
	}

	public void setText(TranslatedString text) {
		this.text = text;
	}

	public TranslatedString getAnswerHeader() {
		return answerHeader;
	}

	public void setAnswerHeader(TranslatedString answerHeader) {
		this.answerHeader = answerHeader;
	}

	public List<Choice<?>> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice<?>> choices) {
		this.choices = choices;
	}
	
	public void addChoice(Choice<?> choice){
		if (choices==null)
			choices = new ArrayList<Choice<?>>();
		this.choices.add(choice);
	}
	
	public void removeChoice(Choice<?> choice){
		if (choices==null)
			return;
		this.choices.remove(choice);
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSubCategory() {
		return subCategory;
	}

	public void setSubCategory(String subCategory) {
		this.subCategory = subCategory;
	}

}
