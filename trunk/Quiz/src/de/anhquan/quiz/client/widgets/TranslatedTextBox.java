package de.anhquan.quiz.client.widgets;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.TextBox;

import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TranslatedString;

public class TranslatedTextBox extends HorizontalPanel {

	ToolTip solution;
	TextBox answerTextBox;
	HTML beforePart;
	HTML afterPart;

	
	public TranslatedTextBox(){
		super();
		
		beforePart = new HTML();
		add(beforePart);

		answerTextBox = new TextBox();
		add(answerTextBox);

		afterPart = new HTML();
		add(afterPart);
		
		solution = new ToolTip();
		
		setCellVerticalAlignment(answerTextBox, HorizontalPanel.ALIGN_MIDDLE);
		setCellVerticalAlignment(beforePart, HorizontalPanel.ALIGN_MIDDLE);
		setCellVerticalAlignment(afterPart, HorizontalPanel.ALIGN_MIDDLE);
	
	}
	
	public void setContent(TranslatedString str) {
		String origin = str.getOrigin();
		String[] ss = origin.split(QuizItem.TEXT_INPUT_SEPARATOR);
		
		if (ss.length==2){
			beforePart.setHTML(ss[0]);
			afterPart.setHTML(ss[1]);
		}
		else{
			beforePart.setHTML("");
			afterPart.setHTML("");		
		}			
	}
	
	public void showSolution(String solutionText, boolean isCorrect) {
		solution.setHTML("<strong>Solution:</strong> "+solutionText);
		solution.showRelativeTo(answerTextBox);
	}

	public String getValue() {
		return answerTextBox.getValue();
	}
}
