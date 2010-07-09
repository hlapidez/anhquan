package de.anhquan.quiz.shared;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class QuizItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private TranslatedString text;
    
    private TranslatedString answerHeader;

    private String name;
    
    private String image;
    
    private String category;
    
    private String subCategory;

//    private List<Choice<?>> choices;
    
    private int point;

    private int id;

    public QuizItem() {
    }

    public QuizItem(TranslatedString answerHeader, String name,
            int point) {
        super();
        this.answerHeader = answerHeader;
        this.name = name;
        this.point = point;
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


//	public List<Choice<?>> getChoices() {
//		return choices;
//	}
//
//	public void setChoices(List<Choice<?>> choices) {
//		this.choices = choices;
//	}
//	
//	public void addChoice(Choice<?> choice){
//		if (choices==null)
//			choices = new ArrayList<Choice<?>>();
//		this.choices.add(choice);
//	}
//	
//	public void removeChoice(Choice<?> choice){
//		if (choices==null)
//			return;
//		this.choices.remove(choice);
//	}
	
}
