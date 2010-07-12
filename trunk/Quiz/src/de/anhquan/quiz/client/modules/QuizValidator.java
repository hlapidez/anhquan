package de.anhquan.quiz.client.modules;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.ui.TextBox;

import de.anhquan.quiz.client.widgets.TranslatedCheckBox;
import de.anhquan.quiz.client.widgets.TranslatedTextBox;
import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.TextSolution;

public class QuizValidator {

	
	public QuizValidator(){
		simpleValidators = new ArrayList<SimpleValidator>();
	}
	
	public void reset(){
		simpleValidators.clear();
	}
	
	public abstract class SimpleValidator{
		public abstract boolean validate();
		
		public abstract void showSolution(boolean showText);
	}

	public class BooleanValidator extends SimpleValidator{

		BooleanSolution solution;
		TranslatedCheckBox checkbox;
		boolean isCorrect;
		
		public BooleanValidator(BooleanSolution solution, TranslatedCheckBox checkbox) {
			this.solution = solution;
			this.checkbox = checkbox;
		}

		@Override
		public boolean validate() {
			isCorrect = solution.getValue() == checkbox.getCheckBox().getValue();
						
			return isCorrect;
		}

		@Override
		public void showSolution(boolean showText) {
			checkbox.showSolution(showText, solution.getValue(),isCorrect);
		}
		
	}
	
	public class TextValidator  extends SimpleValidator{

		TextSolution solution;
		TranslatedTextBox answerBox;
		boolean isCorrect;
		
		public TextValidator(TextSolution solution, TranslatedTextBox answerText) {
			this.solution = solution;
			this.answerBox = answerText;
		}

		@Override
		public boolean validate() {
			isCorrect = (solution.getValue().compareToIgnoreCase(answerBox.getValue())==0);
			return isCorrect;
		}

		@Override
		public void showSolution(boolean showText) {
			answerBox.showSolution(showText, solution.getValue(), isCorrect);
		}
		
	}
	
	List<SimpleValidator> simpleValidators;
	
	public void add(BooleanSolution s, TranslatedCheckBox cb) {
		simpleValidators.add(new BooleanValidator(s, cb));
	}

	public void add(TextSolution s, TranslatedTextBox answerText) {
		simpleValidators.add(new TextValidator(s, answerText));
	}

	public boolean validate() {
		
		boolean total = true;
		
		for (SimpleValidator v : simpleValidators) {
			boolean isCorrect = v.validate();
			total = total && isCorrect;
			v.showSolution(true);
		}
		
		return total;
	}
	
	public void showSolution(){
		for (SimpleValidator v : simpleValidators) {
			v.showSolution(false);
		}
	}
}
