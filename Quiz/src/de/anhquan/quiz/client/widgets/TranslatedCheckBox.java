package de.anhquan.quiz.client.widgets;

import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;

import de.anhquan.quiz.shared.TranslatedString;

public class TranslatedCheckBox extends HorizontalPanel {

	TranslatedLabel text;
	CheckBox cbAnswer;
	CheckBox cbSolution;
	Label feedback;
	HorizontalPanel solutionPanel;
	
	public TranslatedCheckBox(){
		super();
		
		solutionPanel = new HorizontalPanel();
		feedback = new Label();
		solutionPanel.add (feedback);
		text = new TranslatedLabel();
		cbSolution = new CheckBox();
		cbSolution.setEnabled(false);
		solutionPanel.add (cbSolution);
		feedback.setWidth("50px");
		solutionPanel.setVisible(false);
		add(solutionPanel);
		
		cbAnswer = new CheckBox();
		add (cbAnswer);
		add (text);
		
		setCellVerticalAlignment(solutionPanel, HorizontalPanel.ALIGN_MIDDLE);
		setCellVerticalAlignment(cbAnswer, HorizontalPanel.ALIGN_MIDDLE);
		setCellVerticalAlignment(text, HorizontalPanel.ALIGN_MIDDLE);
		
		text.setStyleName("");
	}
	
	public void setContent(TranslatedString str) {
		text.setContent(str);
	}
	
	public CheckBox getCheckBox (){
		return cbAnswer;
	}

	public void showSolution(boolean showText, boolean value, boolean isCorrect) {
		if (showText){
			solutionPanel.setVisible(true);
			cbSolution.setValue(value);
			if (isCorrect)
				feedback.setText("Correct");
			else
				feedback.setText("Wrong");
		}
		else
			cbAnswer.setValue(value);
	}
}
