package de.anhquan.quiz.server;

import java.util.ArrayList;
import java.util.List;

import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.Question;
import de.anhquan.quiz.shared.SerializedBoolean;
import de.anhquan.quiz.shared.Solution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizDB {

	public static final List<Question> quizzes;
	
	static {
		quizzes = new ArrayList<Question>();
		
		Question q;
		
//		q = new Question();
//		q.setText(new TranslatedString("What is the meaning of life?", "Was ist der Sinn des Lebens?"));
//		q.setAnswerHeader(new TranslatedString("The result is","Das Ergebnis ist"));
//		q.addChoice(new Choice<SerializedBoolean>(new Solution<SerializedBoolean>(new SerializedBoolean(false)), new TranslatedString("41","41")));
//		q.addChoice(new Choice<SerializedBoolean>(new Solution<SerializedBoolean>(new SerializedBoolean(true)), new TranslatedString("42","42")));
//		q.addChoice(new Choice<SerializedBoolean>(new Solution<SerializedBoolean>(new SerializedBoolean(false)), new TranslatedString("43","43")));
//		q.setImage("http://www.cotygonzales.com/wp-content/uploads/2008/12/meaning_of_life.png");
//		q.setPoint(5);
//		q.setSubCategory("Basic");
//		q.setCategory("Dummy");
//		addQuiz(q);
		
		
//		q = new Question();
//		q.setText(new TranslatedString("Two quarters is equal to one half?", "Zwei Quartalen ist in Höhe der Hälfte?"));
//		q.setAnswerHeader(new TranslatedString("The result is","Das Ergebnis ist"));
//		q.addChoice(new Choice<SerializedBoolean>(new Solution(new SerializedBoolean(false)), new TranslatedString("False","Falsch")));
//		q.addChoice(new Choice<SerializedBoolean>(new Solution(new SerializedBoolean(false)), new TranslatedString("True","Richtig")));
//		q.setImage("http://sujeevitham.files.wordpress.com/2009/10/quiz-kids.jpg");
//		q.setPoint(3);
//		q.setSubCategory("Kids");
//		q.setCategory("Math");		
//		addQuiz(q);
//		
		q = new Question();
		q.setText(new TranslatedString("Are girls dumber than boys? Or is it the other way around?", "Sind Mädchen dümmer als Jungen? Oder ist es umgekehrt?"));
		Solution s = new Solution<SerializedBoolean>(SerializedBoolean.FALSE);
		TranslatedString txt = new TranslatedString();
		txt.setOrigin("Hey, just because I am a girl, it doesn't make me dumb");
		txt.setTranslation("dd");
		Choice c = new Choice();
		c.setSolution(s);
		c.setText(txt);
		
		q.addChoice(c);
		
		q.addChoice(new Choice<SerializedBoolean>(new Solution(new SerializedBoolean(false)), new TranslatedString("Hey, just because I am a girl, it doesn't make me dumb","Hey, nur weil ich ein Mädchen bin, macht es nicht mich stumm")));
		q.addChoice(new Choice<SerializedBoolean>(new Solution(new SerializedBoolean(false)), new TranslatedString("Men like me have bigger brains. It's science!","Männer wie ich haben größere Gehirne. Es ist Wissenschaft!")));
		q.addChoice(new Choice<SerializedBoolean>(new Solution(new SerializedBoolean(false)), new TranslatedString("I am a girl, and clearly smarter than my guy friends","I am a girl, and clearly smarter than my guy friends")));
		q.setImage("http://aslcdn.celebuzz.com/images/2007/03/tyra030207-thumb.jpg");
		q.setPoint(2);
		q.setSubCategory("Girl");
		q.setCategory("Funny");
		addQuiz(q);
		
		q = new Question();
		q.setText(new TranslatedString("Are you human?", "Sind Sie man?"));
		q.addChoice(new Choice<String>(new Solution<String>("2"), new TranslatedString("1 + 1 = "+Question.TEXT_INPUT_SEPARATOR+" ?")));
		q.setImage(null);
		q.setPoint(1);		
		q.setSubCategory("Kids");
		q.setCategory("Math");
		addQuiz(q);
	}

	private static void addQuiz(Question q) {
		q.setId(quizzes.size());
		quizzes.add(q);
	}
}
