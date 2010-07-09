package de.anhquan.quiz.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuizItem implements Serializable {

    private static final long serialVersionUID = 1L;

	public static final String TEXT_INPUT_SEPARATOR = "___";

    private TranslatedString text = TranslatedString.EMPTY;
    
    private TranslatedString answerHeader = TranslatedString.EMPTY;

    private String name;
    
    private String image;
    
    private String category;
    
    private String subCategory;

    private List<Choice> choices;
    
    private int point;

    private int id;
    
    private QuizInfo info;

    public QuizItem() {
    	this(TranslatedString.EMPTY,"",0);
    }

    public QuizItem(TranslatedString answerHeader, String name,
            int point) {
        super();
        this.answerHeader = answerHeader;
        this.name = name;
        this.point = point;
        choices = new ArrayList<Choice>();
        info = new QuizInfo();
        
    }

    public int getPoint() {
        return point;
    }

	public TranslatedString getAnswerHeader() {
        return answerHeader;
    }


    public String getName() {
        return name;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setAnswerHeader(TranslatedString header) {
        this.answerHeader = header;
    }

    public void setName(String name) {
        this.name = name;
    }

	public TranslatedString getText() {
		return text;
	}

	public void setText(TranslatedString text) {
		this.text = text;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Choice> getChoices() {
		return choices;
	}

	public void setChoices(List<Choice> choices) {
		this.choices = choices;
	}
	
	public void addChoice(Choice choice){
		this.choices.add(choice);
	}
	
	public void removeChoice(Choice choice){
		this.choices.remove(choice);
	}

	public QuizInfo getInfo() {
		return info;
	}

	public void setInfo(QuizInfo info) {
		this.info = info;
	}
	
}
