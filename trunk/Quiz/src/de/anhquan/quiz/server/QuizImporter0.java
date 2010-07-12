package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter0 {

	static {
		
				
		//Question 1.1.01-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(1);
	    	
	    	q.setName("1.1.01-001");

			q.setText(new TranslatedString("Was versteht man unter defensivem Fahren?","L\u00E1i xe ph\u00F2ng v\u1EC7 \u0111\u01B0\u1EE3c hi\u1EC3u nh\u01B0 th\u1EBF n\u00E0o?\n(<em>\u0110\u00E2y l\u00E0 c\u00E2u kh\u00F3, xin xem ph\u1EA7n gi\u1EA3i th\u00EDch t\u1EEB b\u00EAn d\u01B0\u1EDBi \u0111\u1EC3 hi\u1EC3u th\u00EAm</em>)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setHint("It is also possible to change the property name bound to a constant accessor");
			
			q.setWhyWrong("Here is the same example using annotations to store the default values");
			
			q.setNote("This works for UTF-8 like for any other supported encoding, as long as the appropriate locale has been selected");
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nicht auf dem eigenen Recht bestehen","Kh\u00F4ng v\u1EADn d\u1EE5ng c\u1EE9ng nh\u1EAFc c\u00E1c quy\u1EC1n m\u00E0 lu\u1EADt giao th\u00F4ng \u00E1p d\u1EE5ng m\u00ECnh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Fehlern anderer rechnen","T\u00EDnh to\u00E1n \u0111\u1EBFn sai l\u1EA7m c\u1EE7a ng\u01B0\u1EDDi l\u00E1i xe kh\u00E1c")));
			q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vorsorglich an jeder Kreuzung anhalten","Th\u1EADn tr\u1ECDng d\u1EEBng \u1EDF c\u00E1c giao l\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(2);
	    	
	    	q.setName("1.1.01-002");

			q.setText(new TranslatedString("Was kann zu Auffahrunf\u00E4llen f\u00FChren?","C\u00E1i g\u00EC c\u00F3 th\u1EC3 g\u00E2y ra tai n\u1EA1n Auffahrunf\u00E4llen?\n(<em>Xem ngh\u0129a t\u1EEB Auffahrunf\u00E4llen \u1EDF ph\u1EA7n gi\u1EA3i th\u00EDch t\u1EEB b\u00EAn d\u01B0\u1EDBi</em>)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unerwartet starkes Bremsen","Phanh g\u1EA5p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unaufmerksamkeit","Kh\u00F4ng t\u1EADp trung")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu dichtes Auffahren","Ch\u1EA1y xe qu\u00E1 s\u00E1t \u0111u\u00F4i xe tr\u01B0\u1EDBc")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(3);
	    	
	    	q.setName("1.1.01-101");

			q.setText(new TranslatedString("Sie fahren innerorts hinter einem Fahrzeug mit ortsfremdem \nKennzeichen. \nWas k\u00F6nnte geschehen? \nDer Vorausfahrende","B\u1EA1n l\u00E1i xe trong th\u00E0nh ph\u1ED1 ph\u00EDa sau m\u1ED9t xe c\u00F3 bi\u1EC3n s\u1ED1 l\u1EA1.\n\u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 x\u1EA3y ra?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("bremst unerwartet","Xe ch\u1EA1y tr\u01B0\u1EDBc phanh \u0111\u1ED9t ng\u1ED9t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("bet\u00E4tigt den Blinker vor dem Abbiegen zu sp\u00E4t","Xe ch\u1EA1y tr\u01B0\u1EDBc b\u1EADt \u0111\u00E8n t\u00EDn hi\u1EC7u qu\u00E1 tr\u1EC5 khi qu\u1EB9o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("h\u00E4lt unerwartet an, um nach dem Weg zu fragen","Xe ch\u1EA1y tr\u01B0\u1EDBc d\u1EEBng xe \u0111\u1ED9t ng\u1ED9t \u0111\u1EC3 h\u1ECFi \u0111\u01B0\u1EDDng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(4);
	    	
	    	q.setName("1.1.01-102");

			q.setText(new TranslatedString("Was sind vermeidbare Behinderungen im flie\u00DFenden Verkehr?","Nh\u1EEFng tr\u1EDF ng\u1EA1i n\u00E0o c\u00F3 th\u1EC3 tr\u00E1nh \u0111\u01B0\u1EE3c khi \u0111ang \u0111i tr\u00EAn \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abw\u00FCrgen des Motors","Ch\u1EBFt m\u00E1y (m\u00F4-t\u01A1 ng\u01B0ng ho\u1EA1t \u0111\u1ED9ng \u0111\u1ED9t ng\u1ED9t m\u1ED9t c\u00E1ch kh\u00F4ng mong mu\u1ED1n)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langsamfahren ohne triftigen Grund","Ch\u1EA1y xe ch\u1EADm m\u00E0 kh\u00F4ng c\u00F3 l\u00FD do thuy\u1EBFt ph\u1EE5c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Liegenbleiben wegen Kraftstoffmangels","D\u1EEBng l\u1EA1i do h\u1EBFt x\u0103ng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(5);
	    	
	    	q.setName("1.1.01-103");

			q.setText(new TranslatedString("Warum darf man nicht unn\u00F6tig langsam fahren?","T\u1EA1i sao kh\u00F4ng \u0111\u01B0\u1EE3c l\u00E1i xe ch\u1EADm m\u1ED9t c\u00E1ch kh\u00F4ng c\u1EA7n thi\u1EBFt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil der Verkehrsfluss behindert wird","V\u00EC g\u00E2y c\u1EA3n tr\u1EDF giao th\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Gefahr von Auffahrunf\u00E4llen erh\u00F6ht wird","T\u0103ng s\u1EF1 nguy hi\u1EC3m c\u1EE7a tai n\u1EA1n \u201CAuffahrunf\u00E4llen\u201D")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Nachfolgende zu gef\u00E4hrlichem \u00DCberholen verleitet werden","S\u1EBD d\u1EABn \u0111\u1EBFn nguy hi\u1EC3m khi v\u01B0\u1EE3t cho xe \u0111i sau")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(6);
	    	
	    	q.setName("1.1.01-104");

			q.setText(new TranslatedString("Wodurch kann eine Gef\u00E4hrdung entstehen?","\u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 d\u1EABn \u0111\u1EBFn nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch abgefahrene Reifen","Do l\u1ED1p m\u00F2n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch zu hoch eingestellte Scheinwerfer","Do \u0111\u00E8n pha chi\u1EBFu xa \u0111\u1EC3 qu\u00E1 cao")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch auff\u00E4llige Lackierung des Fahrzeugs","Do m\u00E0u s\u01A1n c\u1EE7a xe thu h\u00FAt s\u1EF1 ch\u00FA \u00FD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(7);
	    	
	    	q.setName("1.1.01-105");

			q.setText(new TranslatedString("Wodurch kann eine Gef\u00E4hrdung entstehen?","\u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 d\u1EABn \u0111\u1EBFn nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch liegen gebliebene Fahrzeuge, die nicht vorschriftsm\u00E4\u00DFig\nabgesichert sind","Do xe d\u1EEBng b\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng kh\u00F4ng \u0111\u1EA3m b\u1EA3o \u0111\u00FAng qui t\u1EAFc an to\u00E0n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch zu hohe Geschwindigkeit","Do \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 qu\u00E1  cao")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Einschalten der Beleuchtung am Tage","Do b\u1EADt \u0111\u00E8n xe v\u00E0o ban ng\u00E0y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(8);
	    	
	    	q.setName("1.1.01-106");

			q.setText(new TranslatedString("Was kann zum Abkommen von der Fahrbahn f\u00FChren?","Was kann zum Abkommen von der Fahrbahn f\u00FChren?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu hohe Geschwindigkeit","\u0110i qu\u00E1 nhanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unaufmerksamkeit, Ablenkung","ph\u00E2n t\u00E1n t\u01B0 t\u01B0\u1EDFng, m\u1EA5t t\u1EADp trung")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00DCberm\u00FCdung","qu\u00E1 m\u1EC7t m\u1ECFi")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(9);
	    	
	    	q.setName("1.1.01-107");

			q.setText(new TranslatedString("Welche Anzeichen warnen w\u00E4hrend der Fahrt vor aufkommender \nM\u00FCdigkeit","D\u1EA5u hi\u1EC7u n\u00E0o c\u1EA3nh b\u00E1o ng\u01B0\u1EDDi l\u00E1i \u0111ang b\u1EAFt \u0111\u1EA7u m\u1EC7t m\u1ECFi?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schwere Augenlider","M\u00ED m\u1EAFt n\u1EB7ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("H\u00E4ufiges G\u00E4hnen","Hay ng\u00E1p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verk\u00FCrzte Reaktionszeit","Ph\u1EA3n \u1EE9ng nhanh (th\u1EDDi gian ph\u1EA3n \u1EE9ng ng\u1EAFn)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(10);
	    	
	    	q.setName("1.1.01-108");

			q.setText(new TranslatedString("Welche Folge kann Missachtung von M\u00FCdigkeitszeichen nach sich \nziehen?","Kh\u00F4ng quan t\u00E2m \u0111\u1EBFn c\u00E1c d\u1EA5u hi\u1EC7u m\u1EC7t m\u1ECFi c\u00F3 th\u1EC3 d\u1EABn \u0111\u1EBFn \u0111i\u1EC1u g\u00EC d\u01B0\u1EDBi \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sekundenschlaf","Ng\u1EE7 trong gi\u00E2y l\u00E1t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Konzentrationsmangel","M\u1EA5t t\u1EADp trung")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrfehler","L\u1ED7i l\u00E1i xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(11);
	    	
	    	q.setName("1.1.01-109");

			q.setText(new TranslatedString("Was ist zu tun, wenn Sie w\u00E4hrend er Fahrt Anzeichen von \nM\u00FCdigkeit sp\u00FCren?","Ng\u01B0\u1EDDi l\u00E1i xe ph\u1EA3i l\u00E0m g\u00EC khi anh ta c\u1EA3m th\u1EA5y m\u1EC7t m\u1ECFi?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unverz\u00FCglich eine Pause einlegen","L\u1EADp t\u1EE9c d\u1EEBng l\u1EA1i ngh\u1EC9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sich in frischer Luft bewegen","V\u1EADn \u0111\u1ED9ng c\u01A1 th\u1EC3 trong kh\u00F4ng kh\u00ED trong l\u00E0nh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Anregende Musik h\u00F6ren","Nghe nh\u1EA1c s\u00F4i \u0111\u1ED9ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.01-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(12);
	    	
	    	q.setName("1.1.01-110");

			q.setText(new TranslatedString("Wie wirkt sich M\u00FCdigkeit beim Fahren aus?","S\u1EF1 m\u1EC7t m\u1ECFi d\u1EABn \u0111\u1EBFn \u0111i\u1EC1u g\u00EC khi l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nachlassende Aufmerksamkeit","Gi\u1EA3m s\u1EF1 t\u1EADp trung")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eingeschr\u00E4nkte Wahrnehmung","S\u1EF1 nh\u1EADn bi\u1EBFt (nguy hi\u1EC3m) b\u1ECB h\u1EA1n ch\u1EBF")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verz\u00F6gerte Reaktionen","Ph\u1EA3n \u1EE9ng ch\u1EADm")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(13);
	    	
	    	q.setName("1.1.02-001");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie in Wohnvierteln mit geringem Verkehr rechnen?","Trong khu v\u1EF1c d\u00E2n c\u01B0 \u00EDt xe c\u1ED9, b\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass spielende Kinder auf die Fahrbahn laufen","Tr\u1EBB con \u0111ang ch\u01A1i ch\u1EA1y xu\u1ED1ng \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass Fu\u00DFg\u00E4nger und Radfahrer h\u00E4ufig unaufmerksam sind","Ng\u01B0\u1EDDi \u0111i b\u1ED9 v\u00E0 xe \u0111\u1EA1p th\u01B0\u1EDDng kh\u00F4ng ch\u00FA \u00FD c\u1EA9n th\u1EADn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dass Erwachsene sich immer verkehrsgerecht verhalten","Ng\u01B0\u1EDDi l\u1EDBn lu\u00F4n tu\u00E2n th\u1EE7 lu\u1EADt giao th\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(14);
	    	
	    	q.setName("1.1.02-002");

			q.setText(new TranslatedString("In einem Wohngebiet rollt ein Ball vor Ihr Fahrzeug. Wie m\u00FCssen \nSie reagieren?","Trong khu d\u00E2n c\u01B0 c\u00F3 m\u1ED9t qu\u1EA3 b\u00F3ng l\u0103n tr\u01B0\u1EDBc xe b\u1EA1n. B\u1EA1n ph\u1EA3i ph\u1EA3n \u1EE9ng th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sofort bremsen, weil Kinder auf die Fahrbahn laufen k\u00F6nnten","Phanh l\u1EADp t\u1EE9c, v\u00EC tr\u1EBB con c\u00F3 th\u1EC3 ch\u1EA1y xu\u1ED1ng \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, weil Kinder gelernt haben am Fahrbahnrand stehen zu\nbleiben","\u0110i ti\u1EBFp, v\u00EC tr\u1EBB con \u0111\u00E3 \u0111\u01B0\u1EE3c h\u1ECDc lu\u00F4n ph\u1EA3i \u0111i tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dem Ball ausweichen und weiterfahren","Tr\u00E1nh qu\u1EA3 b\u00F3ng v\u00E0 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(15);
	    	
	    	q.setName("1.1.02-003");

			q.setText(new TranslatedString("Sie n\u00E4hern sich Kindern, die auf dem Gehweg spielen. Wie m\u00FCssen \nSie sich verhalten? \n(Mofa: klingeln statt hupen)","B\u1EA1n l\u00E1i xe g\u1EA7n \u0111\u00E1m tr\u1EBB \u0111ang ch\u01A1i tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langsamer fahren und bremsbereit sein","\u0110i ch\u1EADm v\u00E0 s\u1EB5n s\u00E0ng phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unver\u00E4ndert weiterfahren, um den nachfolgenden Verkehr nicht zu\nbehindern","C\u1EE9 \u0111i ti\u1EBFp, \u0111\u1EC3 kh\u00F4ng c\u1EA3n tr\u1EDF xe ph\u00EDa sau")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur kr\u00E4ftig hupen und weiterfahren","Ch\u1EC9 b\u00F3p c\u00F2i to v\u00E0 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(16);
	    	
	    	q.setName("1.1.02-004");

			q.setText(new TranslatedString("Womit ist zu rechnen, wenn man sich Kindern n\u00E4hert?","B\u1EA1n ph\u1EA3i t\u00EDnh to\u00E1n \u0111\u1EBFn nh\u1EEFng \u0111i\u1EC1u g\u00EC, khi b\u1EA1n \u0111i g\u1EA7n tr\u1EBB em?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit un\u00FCberlegtem Verhalten der Kinder","Tr\u1EBB h\u00E0nh \u0111\u1ED9ng b\u1EA5t c\u1EA9n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit schnellem und richtigem Reagieren der Kinder","Tr\u1EBB ph\u1EA3n \u1EE9ng nhanh v\u00E0 ch\u00EDnh x\u00E1c")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit verkehrsgerechtem Verhalten der Kinder","Tr\u1EBB tu\u00E2n th\u1EE7 theo \u0111\u00FAng lu\u1EADt giao th\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(17);
	    	
	    	q.setName("1.1.02-005");

			q.setText(new TranslatedString("Mit welchem Verhalten von Kindern m\u00FCssen Sie an Zebrastreifen \nrechnen?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD c\u00E1c h\u00E0nh vi g\u00EC c\u1EE7a tr\u1EBB \u1EDF v\u1EA1ch qua \u0111\u01B0\u1EDDng (v\u1EA1ch ng\u1EF1a v\u1EB1n)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie laufen auf den Zebrastreifen, ohne auf den Verkehr zu achten","Tr\u1EBB ch\u1EA1y xu\u1ED1ng v\u1EA1ch qua \u0111\u01B0\u1EDDng m\u00E0 kh\u00F4ng ch\u00FA \u00FD xe c\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie kehren ohne erkennbaren Grund auf dem Zebrastreifen um und\nlaufen zur\u00FCck","Tr\u1EBB ch\u1EA1y \u00E0o ra \u0111\u01B0\u1EDDng v\u1EDBi l\u00FD do kh\u00F3 m\u00E0 bi\u1EBFt \u0111\u01B0\u1EE3c, r\u1ED3i ch\u1EA1y ng\u01B0\u1EE3c l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie sch\u00E4tzen Geschwindigkeit und Entfernung herannahender\nFahrzeuge immer richtig ein und warten am Fahrbahnrand","Tr\u1EBB bi\u1EBFt \u01B0\u1EDBc l\u01B0\u1EE3ng t\u1ED1c \u0111\u1ED9 v\u00E0 kho\u1EA3ng c\u00E1ch c\u1EE7a xe ch\u1EA1y t\u1EDBi v\u00E0 ch\u1EDD b\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(18);
	    	
	    	q.setName("1.1.02-006");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen? \nDer Junge","B\u1EA1n ph\u1EA3i t\u00EDnh to\u00E1n \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-006.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 k\u00F6nnte im n\u00E4chsten Augenblick losfahren","Ng\u01B0\u1EDDi thanh ni\u00EAn c\u00F3 th\u1EC3 \u0111\u1ED9t ng\u1ED9t ch\u1EA1y ti\u1EBFp")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 wird vielleicht noch nach links schauen, aber trotzdem losfahren","Ng\u01B0\u1EDDi thanh ni\u00EAn c\u00F3 th\u1EC3 nh\u00ECn qua tr\u00E1i, nh\u01B0ng r\u1ED3i l\u1EA1i ch\u1EA1y ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 wird Sie in jedem Fall vorbeifahren lassen","Ng\u01B0\u1EDDi thanh ni\u00EAn lu\u00F4n lu\u00F4n nh\u01B0\u1EDDng b\u1EA1n ch\u1EA1y qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(19);
	    	
	    	q.setName("1.1.02-007");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten? \nDie Kinder","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-007.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 genau beobachten und vorsichtig weiterfahren","Ch\u00FA \u00FD b\u1ECDn tr\u1EBB v\u00E0 c\u1EA9n th\u1EADn \u0111i ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 nicht weiter beachten, weil sie auf dem Gehweg sind","Kh\u00F4ng ch\u00FA \u00FD b\u1ECDn tr\u1EBB, v\u00EC ch\u00FAng \u0111ang \u0111i tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(20);
	    	
	    	q.setName("1.1.02-008");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich einstellen? \nDas M\u00E4dchen vor Ihnen","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn t\u00ECnh hu\u00F4ng n\u00E0o?\nDas M\u00E4dchen vor Ihnen"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-008.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 k\u00F6nnte links abbiegen, um dem anderen zu folgen","C\u00F4 g\u00E1i tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 th\u1EC3 qu\u1EB9o tr\u00E1i \u0111\u1EC3 ch\u1EA1y theo xe \u0111\u1EA1p kia")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 k\u00F6nnte links abbiegen, ohne ein Richtungszeichen zu geben","C\u00F4 g\u00E1i tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 th\u1EC3 qu\u1EB9o tr\u00E1i m\u00E0 kh\u00F4ng gi\u01A1 tay xin \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 wird mit Sicherheit geradeaus weiterfahren, weil es kein\nRichtungszeichen gibt","C\u00F4 g\u00E1i tr\u01B0\u1EDBc xe b\u1EA1n c\u1EA9n th\u1EADn \u0111i th\u1EB3ng ti\u1EBFp, v\u00EC c\u00F4 ta kh\u00F4ng gi\u01A1 tay xin \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(21);
	    	
	    	q.setName("1.1.02-009");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-009.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sofort stark bremsen und bremsbereit bleiben","L\u1EADp t\u1EE9c phanh m\u1EA1nh v\u00E0 s\u1EB5n s\u00E0ng phanh ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit gleicher Geschwindigkeit weiterfahren, weil die Kinder bestimmt\nstehen bleiben","Gi\u1EEF nguy\u00EAn t\u1ED1c \u0111\u1ED9 \u0111i ti\u1EBFp, v\u00EC b\u1ECDn tr\u1EBB ch\u1EAFc ch\u1EAFn s\u1EBD \u0111\u1EE9ng ch\u1EDD")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit gleicher Geschwindigkeit weiterfahren, um einen Nachfolgenden\nnicht zu behindern","Gi\u1EEF nguy\u00EAn t\u1ED1c \u0111\u1ED9 \u0111i ti\u1EBFp, \u0111\u1EC3 kh\u00F4ng c\u1EA3n tr\u1EDF xe \u0111i sau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(22);
	    	
	    	q.setName("1.1.02-010");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-010.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eines der Kinder k\u00F6nnte umkehren, um den Ball zu holen","M\u1ED9t \u0111\u1EE9a trong \u0111\u00E1m tr\u1EBB c\u00F3 th\u1EC3 ch\u1EA1y ng\u01B0\u1EE3c l\u1EA1i \u0111\u1EC3 l\u1EA5y qu\u1EA3 b\u00F3ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das M\u00E4dchen k\u00F6nnte umkehren und zu den anderen laufen","\u0110\u1EE9a b\u00E9 g\u00E1i c\u00F3 th\u1EC3 quay ng\u01B0\u1EE3c l\u1EA1i, \u0111\u1EC3 ch\u1EA1y theo m\u1EA5y \u0111\u1EE9a kia")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Kinder werden bestimmt am Fahrbahnrand warten, bis Sie\nvorbeigefahren sind","B\u1ECDn tr\u1EBB ch\u1EDD \u1EDF l\u1EC1 \u0111\u01B0\u1EDDng \u0111\u1EBFn khi xe b\u1EA1n ch\u1EA1y qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-011
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(23);
	    	
	    	q.setName("1.1.02-011");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten? \n(Mofa: klingeln statt hupen)","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-011.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern, bremsbereit bleiben und vorsichtig\nvorbeifahren","Gi\u1EA3m t\u1ED1c \u0111\u1ED9, s\u1EB5n s\u00E0ng phanh v\u00E0 c\u1EA9n th\u1EADn l\u00E1i xe qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Hupen und mit gleicher Geschwindigkeit weiterfahren","B\u00F3p c\u00F2i v\u00E0 gi\u1EEF nguy\u00EAn t\u1ED1c \u0111\u1ED9 \u0111i ti\u1EBFp")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nicht hupen, aber mit gleicher Geschwindigkeit weiterfahren, da die\nKinder am linken Fahrbahnrand sind","Kh\u00F4ng b\u00F3p c\u00F2i, nh\u01B0ng gi\u1EEF nguy\u00EAn t\u1ED1c \u0111\u1ED9 \u0111i ti\u1EBFp v\u00EC b\u1ECDn tr\u1EBB \u0111ang \u1EDF l\u1EC1 \u0111\u01B0\u1EDDng b\u00EAn tr\u00E1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-012
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(24);
	    	
	    	q.setName("1.1.02-012");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-012.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sofort bremsen und bremsbereit bleiben","L\u1EADp t\u1EE9c phanh l\u1EA1i v\u00E0 s\u1EB5n s\u00E0ng phanh ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Einfach weiterfahren","\u0110\u01A1n gi\u1EA3n \u0111i ti\u1EBFp")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-013
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(25);
	    	
	    	q.setName("1.1.02-013");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-013.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abbremsen und notfalls anhalten","Phanh xe l\u1EA1i v\u00E0 g\u1ECDi c\u1EE9u h\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Links weiterfahren","Ti\u1EBFp t\u1EE5c \u0111i v\u1EC1 l\u1EC1 b\u00EAn tr\u00E1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur Warnzeichen geben und weiterfahren","Ch\u1EC9 \u0111\u01B0a t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o (b\u00F3p c\u00F2i) v\u00E0 c\u1EE9 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-014
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(26);
	    	
	    	q.setName("1.1.02-014");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen, wenn \u00E4ltere Menschen die Fahrbahn \n\u00FCberqueren?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC, khi ng\u01B0\u1EDDi gi\u00E0 b\u0103ng qua \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie achten oft nicht auf den Fahrzeugverkehr","H\u1ECD th\u01B0\u1EDDng kh\u00F4ng ch\u00FA \u00FD xe ch\u1EA1y tr\u00EAn \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie bleiben manchmal pl\u00F6tzlich auf der Fahrbahn stehen","H\u1ECD \u0111\u00F4i khi \u0111\u1ED9t nhi\u00EAn d\u1EEBng l\u1EA1i gi\u1EEFa \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie kehren manchmal auf halbem Wege um","H\u1ECD \u0111\u00F4i khi ra gi\u1EEFa \u0111\u01B0\u1EDDng r\u1ED3i \u0111i ng\u01B0\u1EE3c l\u1EA1i")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-015
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(27);
	    	
	    	q.setName("1.1.02-015");

			q.setText(new TranslatedString("Ein Fu\u00DFg\u00E4nger mit einem wei\u00DFen Stock will vor Ihnen die Fahrbahn \n\u00FCberqueren. Wie m\u00FCssen Sie sich verhalten?","M\u1ED9t ng\u01B0\u1EDDi \u0111i b\u1ED9 v\u1EDBi c\u00E2y g\u1EADy tr\u1EAFng chu\u1EA9n b\u1ECB b\u0103ng qua \u0111\u01B0\u1EDDng ph\u00EDa tr\u01B0\u1EDBc xe c\u1EE7a b\u1EA1n.\nB\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern und n\u00F6tigenfalls anhalten","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 v\u00E0 c\u00F3 th\u1EC3 d\u1EEBng l\u1EA1i khi c\u1EA7n thi\u1EBFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, weil Blinde die Fahrbahn nicht ohne Begleitung\n\u00FCberqueren d\u00FCrfen","Ti\u1EBFp t\u1EE5c \u0111i, v\u00EC ng\u01B0\u1EDDi m\u00F9 kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p b\u0103ng qua \u0111\u01B0\u1EDDng khi kh\u00F4ng c\u00F3 ng\u01B0\u1EDDi \u0111i c\u00F9ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Warnzeichen geben und mit gleicher Geschwindigkeit weiterfahren","Ra t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o v\u00E0 gi\u1EEF nguy\u00EAn t\u1ED1c \u0111\u1ED9 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-016
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(28);
	    	
	    	q.setName("1.1.02-016");

			q.setText(new TranslatedString("Welches Verhalten \u00E4lterer Fu\u00DFg\u00E4nger ist an Zebrastreifen h\u00E4ufig zu \nbeobachten?","C\u1EA7n ch\u00FA \u00FD nh\u1EEFng c\u00E1ch x\u1EED l\u00FD n\u00E0o c\u1EE7a ng\u01B0\u1EDDi gi\u00E0 \u0111i b\u1ED9 \u1EDF v\u1EA1ch qua \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie blicken weder nach links noch nach rechts","H\u1ECD nh\u00ECn qua tr\u00E1i r\u1ED3i nh\u00ECn qua ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie betreten unerwartet die Fahrbahn","H\u1ECD \u0111\u1ED9t ng\u1ED9t \u0111i xu\u1ED1ng \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie kehren manchmal auf halbem Wege um","H\u1ECD \u0111\u00F4i khi \u0111i ra gi\u1EEFa \u0111\u01B0\u1EDDng r\u1ED3i quay ng\u01B0\u1EE3c l\u1EA1i")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-017
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(29);
	    	
	    	q.setName("1.1.02-017");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich einstellen?","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn c\u00E1c t\u00ECnh hu\u1ED1ng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-017.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger wechseln h\u00E4ufig die Stra\u00DFenseite","Ng\u01B0\u1EDDi \u0111i b\u1ED9 th\u01B0\u1EDDng chuy\u1EC3n l\u1EC1 \u0111\u01B0\u1EDDng (t\u1EEB tr\u00E1i qua ph\u1EA3i v\u00E0 ng\u01B0\u1EE3c l\u1EA1i)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Parkende Fahrzeuge erschweren die Sicht","Xe \u0111ang \u0111\u1EADu che t\u1EA7m nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger betreten manchmal unachtsam die Fahrbahn","Ng\u01B0\u1EDDi \u0111i b\u1ED9 th\u01B0\u1EDDng lao xu\u1ED1ng \u0111\u01B0\u1EDDng m\u00E0 kh\u00F4ng ch\u00FA \u00FD g\u00EC c\u1EA3")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-018
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(30);
	    	
	    	q.setName("1.1.02-018");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-018.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger \u2013 insbesondere Kinder \u2013 kommen pl\u00F6tzlich zwischen den\nFahrzeugen hervor","Ng\u01B0\u1EDDi \u0111i b\u1ED9 - \u0111\u1EB7c bi\u1EC7t l\u00E0 tr\u1EBB con - \u0111\u1ED9t ng\u1ED9t \u0111i qua gi\u1EEFa c\u00E1c xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("T\u00FCren werden zur Stra\u00DFenseite oft unachtsam ge\u00F6ffnet","C\u1EEDa xe \u0111\u01B0\u1EE3c m\u1EDF m\u1ED9t c\u00E1ch b\u1EA5t c\u1EA9n v\u1EC1 ph\u00EDa l\u00F2ng \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anfahrende Fahrzeuge scheren unerwartet aus","Xe m\u1EDBi kh\u1EDFi \u0111\u1ED9ng c\u00F3 th\u1EC3 \u0111\u1ED9t ng\u1ED9t chuy\u1EC3n h\u01B0\u1EDBng (ch\u1EA1y v\u00E0o gi\u1EEFa \u0111\u01B0\u1EDDng)")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-019
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(31);
	    	
	    	q.setName("1.1.02-019");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-019.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Personen \u00FCberqueren vor dem Bus die Stra\u00DFe","Ng\u01B0\u1EDDi ta b\u0103ng qua \u0111\u01B0\u1EDDng ph\u00EDa tr\u01B0\u1EDBc xe bus")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Personen rennen von links \u00FCber die Stra\u00DFe, um den Bus zu erreichen","C\u00F3 ng\u01B0\u1EDDi ch\u1EA1y qua \u0111\u01B0\u1EDDng t\u1EEB b\u00EAn tr\u00E1i \u0111\u1EC3 b\u1EAFt k\u1ECBp xe bus")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Bus f\u00E4hrt pl\u00F6tzlich r\u00FCckw\u00E4rts","Xe bus \u0111\u1ED9t ng\u1ED9t l\u00F9i l\u1EA1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-020
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(32);
	    	
	    	q.setName("1.1.02-020");

			q.setText(new TranslatedString("Die Stra\u00DFenbahn ist an der Haltestelle gerade zum Stehen \ngekommen. Unter welchen Voraussetzungen d\u00FCrfen Sie mit \nSchrittgeschwindigkeit vorbeifahren \n(Mofa: Klingel statt Hupe)","T\u00E0u \u0111i\u1EC7n s\u1EAFp d\u1EEBng \u1EDF b\u1EBFn. V\u1EDBi nh\u1EEFng \u0111i\u1EC1u ki\u1EC7n n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111i qua v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-020.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn eine Gef\u00E4hrdung ein- oder aussteigender Fahrg\u00E4ste\nausgeschlossen ist","Khi kh\u00F4ng th\u1EC3 c\u00F3 nguy hi\u1EC3m cho ng\u01B0\u1EDDi l\u00EAn xu\u1ED1ng t\u00E0u \u0111i\u1EC7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn ein- oder aussteigende Fahrg\u00E4ste nicht behindert werden","Khi kh\u00F4ng c\u1EA3n tr\u1EDF ng\u01B0\u1EDDi l\u00EAn xu\u1ED1ng t\u00E0u \u0111i\u1EC7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Sie die Fahrg\u00E4ste mit der Hupe gewarnt haben und diese\ndaraufhin stehen bleiben","Khi b\u1EA1n c\u1EA3nh b\u00E1o kh\u00E1ch \u0111i t\u00E0u b\u1EB1ng t\u00EDn hi\u1EC7u c\u00F2i v\u00E0 h\u1ECD d\u1EEBng l\u1EA1i ch\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-021
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(33);
	    	
	    	q.setName("1.1.02-021");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-021.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor Ihnen k\u00F6nnten Fu\u00DFg\u00E4nger auf die Fahrbahn treten","Tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 th\u1EC3 c\u00F3 ng\u01B0\u1EDDi \u0111i b\u1ED9 b\u0103ng qua \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kinder k\u00F6nnten pl\u00F6tzlich zwischen den Fahrzeugen hervorkommen","Tr\u1EBB con c\u00F3 th\u1EC3 \u0111\u1ED9t ng\u1ED9t ch\u1EA1y gi\u1EEFa c\u00E1c xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fu\u00DFg\u00E4nger warten auf jeden Fall, bis Sie vorbeigefahren sind","Ng\u01B0\u1EDDi \u0111i b\u1ED9 lu\u00F4n \u0111\u1EE3i \u0111\u1EBFn khi b\u1EA1n \u0111i qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-022
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(34);
	    	
	    	q.setName("1.1.02-022");

			q.setText(new TranslatedString("Womit ist zu rechnen, wenn Kinder an einer Ampel warten? \nDass die Kinder","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC, khi g\u1EB7p tr\u1EBB con \u0111\u1EE3i \u1EDF c\u1ED9t \u0111\u00E8n giao th\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 schon losrennen, wenn die Ampel in meiner Fahrtrichtung von Gr\u00FCn\nauf Gelb umschaltet","Khi \u0111\u00E8n \u1EDF h\u01B0\u1EDBng t\u00F4i ch\u1EA1y \u0111ang chuy\u1EC3n t\u1EEB xanh sang v\u00E0ng, th\u00EC b\u1ECDn tr\u1EBB \u0111\u00E3 ch\u1EA1y xu\u1ED1ng \u0111\u01B0\u1EDDng r\u1ED3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 auch bei Rot loslaufen, weil es ihnen zu lange dauert","B\u1ECDn tr\u1EBB ch\u1EA1y xu\u1ED1ng \u0111\u01B0\u1EDDng ngay c\u1EA3 khi c\u00F3 \u0111\u00E8n \u0111\u1ECF, v\u00EC ch\u00FAng th\u1EA5y ph\u1EA3i ch\u1EDD qu\u00E1 l\u00E2u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 sich gegenseitig auf die Fahrbahn schubsen","B\u1ECDn tr\u1EBB x\u00F4 nhau xu\u1ED1ng \u0111\u01B0\u1EDDng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-023
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(35);
	    	
	    	q.setName("1.1.02-023");

			q.setText(new TranslatedString("Ein Radweg, auf dem eine Gruppe von Kindern f\u00E4hrt, endet. \nWomit muss gerechnet werden? \nDass die Kinder","\u1EDE cu\u1ED1i \u0111\u01B0\u1EDDng cho xe \u0111\u1EA1p, c\u00F3 m\u1ED9t nh\u00F3m tr\u1EBB \u0111ang ch\u1EA1y xe.\nNh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC ph\u1EA3i t\u00EDnh \u0111\u1EBFn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 bedenkenlos auf die Fahrbahn wechseln","\u0110\u1ED5i h\u01B0\u1EDBng ch\u1EA1y xu\u1ED1ng \u0111\u01B0\u1EDDng m\u00E0 kh\u00F4ng c\u1EA7n suy ngh\u0129 g\u00EC")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 zu weit in die Fahrbahn kommen","\u0110i qu\u00E1 xa v\u00E0o gi\u1EEFa l\u00F2ng \u0111\u01B0\u1EDDng c\u1EE7a xe \u00F4 t\u00F4")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 absteigen und warten, bis alles frei ist","Xu\u1ED1ng y\u00EAn xe, v\u00E0 ch\u1EDD \u0111\u1EBFn khi \u0111\u01B0\u1EDDng tr\u1ED1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-024
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(36);
	    	
	    	q.setName("1.1.02-024");

			q.setText(new TranslatedString("Was ist hier richtig? \n(Bremslicht an)","\u0110i\u1EC1u g\u00EC \u1EDF \u0111\u00E2y l\u00E0 \u0111\u00FAng? (\u0110\u00E8n phanh \u0111ang b\u1EADt)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-024.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Man darf mit Schrittgeschwindigkeit rechts vorbeifahren, wenn\nFahrg\u00E4ste nicht behindert werden und eine Gef\u00E4hrdung ausgeschlossen","Xe \u0111\u01B0\u1EE3c ph\u00E9p \u0111i qua v\u1EC1 b\u00EAn ph\u1EA3i v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9, khi kh\u00F4ng l\u00E0m c\u1EA3n tr\u1EDF v\u00E0 g\u00E2y nguy hi\u1EC3m cho kh\u00E1ch \u0111i t\u00E0u \u0111i\u1EC7n.")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn niemand behindert oder gef\u00E4hrdet wird, darf man rechts auch\nschneller als mit Schrittgeschwindigkeit vorbeifahren","Khi kh\u00F4ng ai b\u1ECB c\u1EA3n tr\u1EDF ho\u1EB7c nguy hi\u1EC3m,\n\u0111\u01B0\u1EE3c ph\u00E9p \u0111i nhanh h\u01A1n t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9 \u0111\u1EC3 v\u01B0\u1EE3t qua \u1EDF l\u1EC1 b\u00EAn ph\u1EA3i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Fahrg\u00E4ste m\u00FCssen vor dem Einsteigen den flie\u00DFenden Verkehr\ndurchlassen","Kh\u00E1ch \u0111i t\u00E0u \u0111i\u1EC7n ph\u1EA3i \u0111\u1EC3 cho xe c\u1ED9 l\u01B0u th\u00F4ng tr\u01B0\u1EDBc khi l\u00EAn t\u00E0u.")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-025
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(37);
	    	
	    	q.setName("1.1.02-025");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen hier nur mit Schrittgeschwindigkeit und \nunter Ausschluss jeglicher Gef\u00E4hrdung der Fahrg\u00E4ste \nvorbeifahren? \n(Warnblinklicht an) \nAlle Fahrzeuge, die","Xe n\u00E0o \u1EDF \u0111\u00E2y \u0111\u01B0\u1EE3c ph\u00E9p \u0111i qua v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9 v\u00E0 khi \u0111\u1EA3m b\u1EA3o kh\u00F4ng c\u00F3 nguy hi\u1EC3m cho kh\u00E1ch \u0111i xe bus?\n(\u0110\u00E8n c\u1EA3nh b\u00E1o \u0111ang b\u1EADt)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-025.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("in gleicher Richtung fahren","T\u1EA5t c\u1EA3 c\u00E1c xe \u1EDF c\u00F9ng h\u01B0\u1EDBng xe bus \u0111\u01B0\u1EE3c ch\u1EA1y qua.")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("entgegenkommen","T\u1EA5t c\u1EA3 c\u00E1c xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-026
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(38);
	    	
	    	q.setName("1.1.02-026");

			q.setText(new TranslatedString("Was m\u00FCssen Sie in dieser Situation beachten? \n(Warnblinklicht an) \nSie d\u00FCrfen","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC trong t\u00ECnh hu\u1ED1ng n\u00E0y?\n(\u0110\u00E8n c\u1EA3nh b\u00E1o \u0111ang b\u1EADt)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-026.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("den Bus so lange nicht \u00FCberholen, wie er noch f\u00E4hrt","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t xe bus khi xe \u0111\u00F3 v\u1EABn \u0111ang ch\u1EA1y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("an dem haltenden Bus mit Schrittgeschwindigkeit vorbeifahren, wenn\neine Gef\u00E4hrdung von Fahrg\u00E4sten ausgeschlossen ist","B\u1EA1n \u0111\u01B0\u1EE3c v\u01B0\u1EE3t qua xe bus (khi \u0111\u00F3 \u0111\u00E3 d\u1EEBng) v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9, khi \u0111\u1EA3m b\u1EA3o kh\u00F4ng c\u00F3 nguy hi\u1EC3m cho kh\u00E1ch \u0111i xe bus")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("den Bus \u00FCberholen, solange er noch f\u00E4hrt","B\u1EA1n \u0111\u01B0\u1EE3c v\u01B0\u1EE3t xe bus, cho d\u00F9 xe \u0111\u00F3 v\u1EABn \u0111ang ch\u1EA1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(39);
	    	
	    	q.setName("1.1.02-101");

			q.setText(new TranslatedString("Warum sind \u00E4ltere Fu\u00DFg\u00E4nger im Verkehr mehr gef\u00E4hrdet als \nj\u00FCngere?","T\u1EA1i sao tr\u00EAn \u0111\u01B0\u1EDDng th\u00EC ng\u01B0\u1EDDi \u0111i b\u1ED9 l\u1EDBn tu\u1ED5i nguy hi\u1EC3m nhi\u1EC1u h\u01A1n ng\u01B0\u1EDDi tr\u1EBB?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie sehen und h\u00F6ren oft schlechter","H\u1ECD th\u01B0\u1EDDng nh\u00ECn v\u00E0 nghe k\u00E9m h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie reagieren langsamer und sind weniger beweglich","H\u1ECD ph\u1EA3n \u1EE9ng ch\u1EADm h\u01A1n v\u00E0 di chuy\u1EC3n ch\u1EADm h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie sch\u00E4tzen die Geschwindigkeit von Fahrzeugen oft falsch ein","H\u1ECD th\u01B0\u1EDDng \u01B0\u1EDBc l\u01B0\u1EE3ng sai t\u1ED1c \u0111\u1ED9 ch\u1EA1y c\u1EE7a xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(40);
	    	
	    	q.setName("1.1.02-102");

			q.setText(new TranslatedString("Sie wollen rechts abbiegen. Worauf m\u00FCssen Sie sich einstellen?","B\u1EA1n mu\u1ED1n qu\u1EB9o ph\u1EA3i. B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn c\u00E1c t\u00ECnh hu\u1ED1ng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-102.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Lkw wird anhalten","Xe Lkw s\u1EBD d\u1EEBng l\u1EA1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Fu\u00DFg\u00E4nger k\u00F6nnte den Lkw vorbeilassen und dann vor Ihnen die\nFahrbahn \u00FCberqueren","Ng\u01B0\u1EDDi \u0111i b\u1ED9 c\u00F3 th\u1EC3 \u0111\u1EC3 xe t\u1EA3i ch\u1EA1y qua v\u00E0 b\u0103ng qua \u0111\u01B0\u1EDDng ngay tr\u01B0\u1EDBc xe b\u1EA1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach dem Abbiegen des Lkw k\u00F6nnen Fu\u00DFg\u00E4nger von der\ngegen\u00FCberliegenden Seite kommen","Sau khi xe Lkw qu\u1EB9o, ng\u01B0\u1EDDi \u0111i b\u1ED9 \u1EDF ph\u00EDa \u0111\u1ED1i di\u1EC7n c\u00F3 th\u1EC3 ch\u1EA1y \u0111\u1EBFn")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(41);
	    	
	    	q.setName("1.1.02-103");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-103.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fr\u00FCh abbremsen, um den Fu\u00DFg\u00E4ngern deutlich zu machen, dass Sie\nihnen Vortritt gew\u00E4hren","Phanh t\u1EEB xa \u0111\u1EC3 ng\u01B0\u1EDDi \u0111i b\u1ED9 c\u00F3 th\u1EC3 th\u1EA5y r\u00F5 r\u1EB1ng b\u1EA1n \u0111ang nh\u01B0\u1EDDng \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur anhalten, wenn die Fu\u00DFg\u00E4nger nicht stehen bleiben","Ch\u1EC9 d\u1EEBng l\u1EA1i khi ng\u01B0\u1EDDi \u0111i b\u1ED9 kh\u00F4ng d\u1EEBng l\u1EA1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Einfach durchfahren","\u0110\u01A1n gi\u1EA3n \u0111i qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(42);
	    	
	    	q.setName("1.1.02-104");

			q.setText(new TranslatedString("Was m\u00FCssen Sie an solchen Haltestellen beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC \u1EDF nh\u1EEFng tr\u1EA1m xe \u0111i\u1EC7n nh\u01B0 th\u1EBF n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-104.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger verlassen manchmal unachtsam die Verkehrsinsel","Ng\u01B0\u1EDDi \u0111i b\u1ED9 th\u01B0\u1EDDng r\u1EDDi l\u1EC1 \u0111\u01B0\u1EDDng m\u1ED9t c\u00E1ch b\u1EA5t c\u1EA9n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger rennen oft \u00FCber die Fahrbahn, um die Stra\u00DFenbahn noch\nzu erreichen","Ng\u01B0\u1EDDi \u0111i b\u1ED9 th\u01B0\u1EDDng ch\u1EA1y qua \u0111\u01B0\u1EDDng \u0111\u1EC3 b\u1EAFt k\u1ECBp t\u00E0u \u0111i\u1EC7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Solange T\u00FCren der Stra\u00DFenbahn ge\u00F6ffnet sind, ist Vorbeifahren\nverboten","Khi c\u1EEDa t\u00E0u \u0111i\u1EC7n v\u1EABn m\u1EDF, c\u1EA5m kh\u00F4ng c\u00F3 xe n\u00E0o \u0111\u01B0\u1EE3c ch\u1EA1y qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(43);
	    	
	    	q.setName("1.1.02-105");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-105.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ausreichend Seitenabstand zur Fu\u00DFg\u00E4ngerin einhalten","Gi\u1EEF \u0111\u1EE7 kho\u1EA3ng c\u00E1ch b\u00EAn v\u1EDBi ng\u01B0\u1EDDi ph\u1EE5 n\u1EEF")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorsichtig links vorbeifahren","C\u1EA9n th\u1EADn \u0111i qua \u1EDF ph\u00EDa b\u00EAn tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Den Fu\u00DFg\u00E4nger mit dem Mofa durch Hupen auffordern, auf den\nGehweg \u00FCberzuwechseln","B\u1EA5m c\u00F2i \u0111\u1EC3 y\u00EAu c\u1EA7u ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111ang d\u1EAFt xe m\u00E1y di chuy\u1EC3n v\u00E0o l\u1EC1 \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(44);
	    	
	    	q.setName("1.1.02-106");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-106.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anhalten, um den Fu\u00DFg\u00E4ngern das \u00DCberqueren der Fahrbahn zu\nerm\u00F6glichen","D\u1EEBng l\u1EA1i, \u0111\u1EC3 ng\u01B0\u1EDDi \u0111i b\u1ED9 b\u0103ng qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, solange nicht mehr als zwei Fu\u00DFg\u00E4nger die Fahrbahn\n\u00FCberqueren wollen","\u0110i ti\u1EBFp, mi\u1EC5n l\u00E0 khi hai ng\u01B0\u1EDDi \u0111i b\u1ED9 kh\u00F4ng mu\u1ED1n b\u0103ng qua \u0111\u01B0\u1EDDng n\u1EEFa")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, weil die Fu\u00DFg\u00E4nger noch auf dem Gehweg sind","\u0110i ti\u1EBFp, v\u00EC ng\u01B0\u1EDDi \u0111i b\u1ED9 v\u1EABn c\u00F2n \u0111\u1EE9ng tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(45);
	    	
	    	q.setName("1.1.02-107");

			q.setText(new TranslatedString("Auf dem Gehweg l\u00E4uft ein Kind mit einem Hund an der Leine. \nKann hieraus eine Gefahr entstehen?","Tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng, c\u00F3 m\u1ED9t \u0111\u1EE9a tr\u1EBB \u0111ang ch\u1EA1y c\u00F9ng m\u1ED9t con ch\u00F3 (c\u00F3 bu\u1ED9c d\u00E2y).\n\u1EDE \u0111\u00E2y c\u00F3 th\u1EC3 c\u00F3 nguy hi\u1EC3m x\u1EA3y ra kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, wenn der Hund pl\u00F6tzlich auf die Fahrbahn l\u00E4uft und das Kind\nhinter sich herzieht","C\u00F3, khi con ch\u00F3 ch\u1EA1y do tu\u1ED9t d\u00E2y v\u00E0 \u0111\u1EE9a tr\u1EBB \u0111u\u1ED5i theo")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, wenn der Hund sich losrei\u00DFt und das Kind hinterherrennt","C\u00F3, khi con ch\u00F3 b\u1EA5t ng\u1EDD ch\u1EA1y xu\u1ED1ng l\u00F2ng \u0111\u01B0\u1EDDng v\u00E0 \u0111\u1EE9a tr\u1EBB \u0111u\u1ED5i theo")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nein, weil Hunde den Verkehr scheuen","Kh\u00F4ng, v\u00EC ch\u00F3 s\u1EE3 xe c\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(46);
	    	
	    	q.setName("1.1.02-108");

			q.setText(new TranslatedString("Was m\u00FCssen Sie in dieser Situation beachten? \n(Warnblinklicht an) \nSie d\u00FCrfen","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC trong t\u00ECnh hu\u1ED1ng n\u00E0y?\n(\u0110\u00E8n c\u1EA3nh b\u00E1o \u0111ang b\u1EADt)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-108.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("nur mit Schrittgeschwindigkeit vorbeifahren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i qua v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("nur vorbeifahren, wenn eine Gef\u00E4hrdung von Fahrg\u00E4sten\nausgeschlossen ist","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i qua khi kh\u00F4ng c\u00F3 nguy hi\u1EC3m cho kh\u00E1ch \u0111i xe bus")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("in keinem Fall vorbeifahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y qua trong b\u1EA5t k\u1EF3 t\u00ECnh hu\u1ED1ng n\u00E0o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(47);
	    	
	    	q.setName("1.1.02-109");

			q.setText(new TranslatedString("Was ist in dieser Situation richtig? \n(Warnblinklicht aus)","\u0110i\u1EC1u g\u00EC trong t\u00ECnh hu\u1ED1ng n\u00E0y l\u00E0 \u0111\u00FAng?\n(\u0110\u00E8n c\u1EA3nh b\u00E1o \u0111ang t\u1EAFt)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-109.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die entgegenkommenden Pkw d\u00FCrfen nur vorsichtig an dem Bus\nvorbeifahren","Xe Pkw \u0111i h\u01B0\u1EDBng \u0111\u1ED1i di\u1EC7n ch\u1EC9 \u0111\u01B0\u1EE3c v\u01B0\u1EE3t qua xe bus m\u1ED9t c\u00E1ch c\u1EA9n th\u1EADn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nur vorsichtig an dem Bus vorbeifahren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c v\u01B0\u1EE3t qua xe bus m\u1ED9t c\u00E1ch c\u1EA9n th\u1EADn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Als Gegenverkehr brauchen Sie den Bus nicht besonders zu\nbeachten","L\u00E0 xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u v\u1EDBi xe bus, b\u1EA1n kh\u00F4ng c\u1EA7n \u0111\u1EB7c bi\u1EC7t quan s\u00E1t xe bus")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.02-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(48);
	    	
	    	q.setName("1.1.02-110");

			q.setText(new TranslatedString("Was ist in dieser Situation richtig? \n(Warnblinklicht an)","\u0110i\u1EC1u g\u00EC trong t\u00ECnh hu\u1ED1ng n\u00E0y l\u00E0 \u0111\u00FAng?\n(\u0110\u00E8n c\u1EA3nh b\u00E1o \u0111ang b\u1EADt)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.02-110.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf beiden Fahrstreifen darf h\u00F6chstens mit Schrittgeschwindigkeit an\ndem Bus vorbeigefahren werden","Tr\u00EAn c\u1EA3 hai l\u00E0n \u0111\u01B0\u1EDDng, xe ch\u1EC9 \u0111\u01B0\u1EE3c ch\u1EA1y t\u1ED1i \u0111a v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9 \u0111\u1EC3 v\u01B0\u1EE3t xe bus")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf beiden Fahrstreifen muss angehalten werden, wenn sonst\nFahrg\u00E4ste gef\u00E4hrdet w\u00FCrden","Tr\u00EAn c\u1EA3 hai l\u00E0n \u0111\u01B0\u1EDDng, xe ph\u1EA3i d\u1EEBng l\u1EA1i khi c\u00F3 th\u1EBF c\u00F3 nguy hi\u1EC3m cho kh\u00E1ch \u0111i xe bus")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Fahrzeuge auf dem linken Fahrstreifen d\u00FCrfen ohne besondere\nVorsicht an dem Bus vorbeifahren","Xe \u1EDF l\u00E0n tr\u00E1i \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y m\u00E0 kh\u00F4ng c\u1EA7n \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD \u0111\u1EBFn xe bus khi v\u01B0\u1EE3t qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(49);
	    	
	    	q.setName("1.1.03-001");

			q.setText(new TranslatedString("Wo m\u00FCssen Sie besonders mit starker Fahrbahnverschmutzung \nund Rutschgefahr rechnen?","\u1EDE \u0111\u00E2u b\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD \u0111\u1EBFn r\u00E1c b\u1EA9n tr\u00EAn \u0111\u01B0\u1EDDng v\u00E0 kh\u1EA3 n\u0103ng b\u1ECB tr\u01B0\u1EE3t xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Baustellen","\u1EDE c\u00F4ng tr\u01B0\u1EDDng x\u00E2y d\u1EF1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Einm\u00FCndungen von Feldwegen","\u1EDE giao l\u1ED9 v\u1EDBi c\u00E1c \u0111\u01B0\u1EDDng xuy\u00EAn qua c\u00E1nh \u0111\u1ED3ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An innerst\u00E4dtischen Kreuzungen","An innerst\u00E4dtischen Kreuzungen")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(50);
	    	
	    	q.setName("1.1.03-002");

			q.setText(new TranslatedString("Warum m\u00FCssen Sie bei N\u00E4sse einen erheblich gr\u00F6\u00DFeren \nSicherheitsabstand einhalten als bei trockener Fahrbahn?","T\u1EA1i sao khi \u0111\u01B0\u1EDDng \u01B0\u1EDBt, b\u1EA1n ph\u1EA3i gi\u1EEF kho\u1EA3ng c\u00E1ch an to\u00E0n l\u1EDBn h\u01A1n so v\u1EDBi khi \u0111\u01B0\u1EDDng kh\u00F4?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil sich der Kontakt zwischen Reifen und Fahrbahn verschlechtert","Weil sich der Kontakt zwischen Reifen und Fahrbahn verschlechtert")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil durch Spritzwasser die Sicht beeintr\u00E4chtigt werden kann","N\u01B0\u1EDBc t\u1EEB m\u1EB7t \u0111\u01B0\u1EDDng b\u1EAFn l\u00EAn c\u1EA3n tr\u1EDF t\u1EA7m nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil der Bremsweg l\u00E4nger wird","Kho\u1EA3ng c\u00E1ch phanh s\u1EBD d\u00E0i h\u01A1n")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(51);
	    	
	    	q.setName("1.1.03-003");

			q.setText(new TranslatedString("Wo m\u00FCssen Sie besonders mit Fahrbahnvereisung rechnen?","\u1EDE \u0111\u00E2u b\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD \u0111\u1EBFn \u0111\u01B0\u1EDDng tr\u01A1n \u0111\u00E1?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Br\u00FCcken","Tr\u00EAn c\u1EA7u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Strecken, die durch Wald f\u00FChren","Tr\u00EAn \u0111o\u1EA1n \u0111\u01B0\u1EDDng xuy\u00EAn qua r\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf stark befahrenen Strecken","Tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 nhi\u1EC1u xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(52);
	    	
	    	q.setName("1.1.03-004");

			q.setText(new TranslatedString("Welche Besonderheiten ergeben sich in der kalten Jahreszeit beim \nBefahren von Alleen?","\u0110i\u1EC1u \u0111\u1EB7c bi\u1EC7t g\u00EC x\u1EA3y ra trong m\u00F9a l\u1EA1nh khi \u0111i xe tr\u00EAn \u0111\u01B0\u1EDDng h\u1EBBm v\u00E0o m\u00F9a l\u1EA1nh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nasses Laub sowie Reif-, Eis- und Schneegl\u00E4tte sind vor allem auf\ngew\u00F6lbten Fahrbahnen besonders gef\u00E4hrlich","C\u00E1c ngu\u1ED3n \u1EA9m \u01B0\u1EDBt nh\u01B0 b\u0103ng \u0111\u00E1, b\u00F4ng tuy\u1EBFt \u0111\u1EB7c bi\u1EC7t g\u00E2y nguy hi\u1EC3m tr\u00EAn \u0111\u01B0\u1EDDng g\u1ED3 gh\u1EC1")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf gepflasterten Fahrbahnen entsteht h\u00E4ufiger und \u00FCberraschender\nReif- und Eisgl\u00E4tte als auf anderen Fahrbahnen","Tr\u00EAn \u0111\u01B0\u1EDDng g\u1EA1ch th\u01B0\u1EDDng c\u00F3 nh\u1EEFng t\u1EA3ng b\u0103ng, \u0111\u00E1 h\u01A1n c\u00E1c \u0111\u01B0\u1EDDng kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Alleen sind im Winter besonders sicher, weil die Baumkronen die\nStra\u00DFe vor Schnee sch\u00FCtzen","C\u00E1c \u0111\u01B0\u1EDDng nh\u1ECF v\u00E0o m\u00F9a \u0111\u00F4ng th\u00EC \u0111\u1EB7c bi\u1EC7t an to\u00E0n, do c\u00F3 c\u00E1c v\u00F2m c\u00E2y che tuy\u1EBFt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(53);
	    	
	    	q.setName("1.1.03-101");

			q.setText(new TranslatedString("Warum sollen Sie hier vorsichtig fahren?","T\u1EA1i sao \u1EDF \u0111\u00E2y b\u1EA1n c\u1EA7n l\u00E1i xe c\u1EA9n th\u1EADn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.03-101.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil der Stra\u00DFenverlauf un\u00FCbersichtlich ist","V\u00EC \u0111\u01B0\u1EDDng ch\u1EA1y ph\u00EDa tr\u01B0\u1EDBc b\u1ECB khu\u1EA5t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Fahrbahnoberfl\u00E4che ungleichm\u00E4\u00DFig ist","V\u00EC m\u1EB7t \u0111\u01B0\u1EDDng kh\u00F4ng b\u1EB1ng ph\u1EB3ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil der Gegenverkehr die Kurve schneiden k\u00F6nnte","V\u00EC xe \u0111\u1ED1i di\u1EC7n c\u00F3 th\u1EC3 c\u1EAFt cua")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(54);
	    	
	    	q.setName("1.1.03-102");

			q.setText(new TranslatedString("Warum m\u00FCssen Sie auf dieser Stra\u00DFe besonders aufmerksam \nfahren?","Warum m\u00FCssen Sie auf dieser Stra\u00DFe besonders aufmerksam\nfahren?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.03-102.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Fahrbahnoberfl\u00E4che uneben und unterschiedlich griffig ist","V\u00EC m\u1EB7t \u0111\u01B0\u1EDDng kh\u00F4ng b\u1EB1ng ph\u1EB3ng v\u00E0 \u0111\u1ED9 ma s\u00E1t kh\u00E1c nhau")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil eine Stra\u00DFenbahn entgegenkommen k\u00F6nnte","V\u00EC t\u00E0u \u0111i\u1EC7n c\u00F3 th\u1EC3 ch\u1EA1y t\u1EDBi")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil das Fahren auf den Schienen gef\u00E4hrlich ist","V\u00EC l\u00E1i xe tr\u00EAn \u0111\u01B0\u1EDDng ray th\u00EC nguy hi\u1EC3m")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(55);
	    	
	    	q.setName("1.1.03-103");

			q.setText(new TranslatedString("Warum ist hier ein gro\u00DFer Sicherheitsabstand n\u00F6tig?","T\u1EA1i sao \u1EDF \u0111\u00E2y l\u1EA1i c\u1EA7n kho\u1EA3ng c\u00E1ch an to\u00E0n l\u1EDBn h\u01A1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.03-103.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil sonst Spritzwasser die Sicht erschwert","V\u00EC n\u01B0\u1EDBc b\u1EAFn l\u00EAn l\u00E0m gi\u1EA3m t\u1EA7m nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil der Anhalteweg l\u00E4nger als bei trockener Stra\u00DFe ist","V\u00EC \u0111\u1ED9 tr\u01B0\u1EE3t khi phanh s\u1EBD d\u00E0i h\u01A1n khi \u0111i tr\u00EAn \u0111\u01B0\u1EDDng kh\u00F4")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Sie sonst auf Wasserlachen zu sp\u00E4t reagieren k\u00F6nnen","V\u00EC b\u1EA1n c\u00F3 th\u1EC3 ph\u1EA3n \u1EE9ng ch\u1EADm tr\u00EAn v\u0169ng n\u01B0\u1EDBc")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(56);
	    	
	    	q.setName("1.1.03-104");

			q.setText(new TranslatedString("Die Stra\u00DFe ist auf einem kurzen St\u00FCck vereist. Was sollen Sie hier \nm\u00F6glichst vermeiden?","\u0110\u01B0\u1EDDng \u0111i b\u1ECB \u0111\u00F4ng \u0111\u00E1 m\u1ED9t \u0111o\u1EA1n. B\u1EA1n n\u00EAn tr\u00E1nh l\u00E0m g\u00EC \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beschleunigen","T\u0103ng t\u1ED1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremsen","Phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Lenkbewegungen","Xoay tay l\u00E1i")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(57);
	    	
	    	q.setName("1.1.03-105");

			q.setText(new TranslatedString("Wie k\u00F6nnen Sie beim Fahren gefahrlos feststellen, ob die Fahrbahn \nvereist ist?","B\u1EA1n c\u00F3 th\u1EC3 l\u00E0m g\u00EC \u0111\u1EC3 gi\u1EEF an to\u00E0n khi \u0111i tr\u00EAn \u0111\u01B0\u1EDDng b\u1ECB \u0111\u00F3ng b\u0103ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei ganz langsamer Fahrt bremsen","Phanh t\u1EEB t\u1EEB")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Lenkung ruckartig hin- und herbewegen","L\u1EAFc tay l\u00E1i t\u1EDBi lui m\u1ED9t c\u00E1ch \u0111\u1ED9t ng\u1ED9t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kr\u00E4ftig Gas geben","L\u00EAn ga m\u1EA1nh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(58);
	    	
	    	q.setName("1.1.03-106");

			q.setText(new TranslatedString("Sie fahren auf einer stark verschneiten Landstra\u00DFe mit \nGegenverkehr. Die Fahrbahn ist durch einen Schneepflug ger\u00E4umt. \nWorauf m\u00FCssen Sie achten?","B\u1EA1n \u0111i xe tr\u00EAn \u0111\u01B0\u1EDDng tuy\u1EBFt r\u01A1i nhi\u1EC1u v\u00E0 c\u00F3 xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u.\n\u0110\u01B0\u1EDDng \u0111i \u0111\u01B0\u1EE3c xe c\u00E0o tuy\u1EBFt l\u00E0m s\u1EA1ch.\nB\u1EA1n c\u1EA7n ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger k\u00F6nnen wegen der aufgeh\u00E4uften Schneemassen die\nFahrbahn nicht verlassen und verengen diese zus\u00E4tzlich","Do \u0111\u1ED1ng tuy\u1EBFt, ng\u01B0\u1EDDi \u0111i b\u1ED9 c\u00F3 th\u1EC3 \u0111i xu\u1ED1ng \u0111\u01B0\u1EDDng \u0111\u1EC3 tr\u00E1nh v\u00E0 l\u00E0m h\u1EB9p th\u00EAm \u0111\u01B0\u1EDDng \u0111i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nur so schnell fahren, dass eine Gef\u00E4hrdung von\nFu\u00DFg\u00E4ngern in jedem Fall ausgeschlossen ist","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i nhanh khi kh\u00F4ng c\u00F3 nguy hi\u1EC3m cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf Fu\u00DFg\u00E4nger brauchen Sie nicht besonders zu achten, weil diese\nauf den flie\u00DFenden Verkehr R\u00FCcksicht nehmen m\u00FCssen","\u0110\u1ED1i v\u1EDBi ng\u01B0\u1EDDi \u0111i b\u1ED9 kh\u00F4ng c\u1EA7n \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD, v\u00EC h\u1ECD ph\u1EA3i ch\u00FA \u00FD lu\u1ED3ng xe \u0111i ph\u00EDa sau.")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(59);
	    	
	    	q.setName("1.1.03-107");

			q.setText(new TranslatedString("Warum kann hier das Rechtsabbiegen gef\u00E4hrlich werden?","T\u1EA1i sao \u1EDF \u0111\u00E2y qu\u1EB9o ph\u1EA3i l\u1EA1i nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.03-107.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Sie m\u00F6glicherweise nicht rechtzeitig anhalten k\u00F6nnen, wenn\nFu\u00DFg\u00E4nger die Seitenstra\u00DFe \u00FCberqueren","Do b\u1EA1n kh\u00F4ng c\u00F3 th\u1EC3 d\u1EEBng k\u1ECBp th\u1EDDi khi c\u00F3 ng\u01B0\u1EDDi \u0111i b\u1ED9 b\u0103ng qua \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Fahrzeuge, die aus der Seitenstra\u00DFe kommen, beim Abbremsen\nins Schleudern geraten k\u00F6nnen","V\u00EC xe kh\u00E1c, t\u1EEB \u0111\u01B0\u1EDDng b\u00EAn c\u1EA1nh t\u1EDBi, c\u00F3 th\u1EC3 b\u1ECB tr\u01B0\u1EE3t khi qu\u1EB9o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Ihr Fahrzeug bei zu schnellem Abbiegen ins Schleudern geraten\nkann","V\u00EC khi qu\u1EB9o nhanh, xe b\u1EA1n c\u00F3 th\u1EC3 b\u1ECB tr\u01B0\u1EE3t")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(60);
	    	
	    	q.setName("1.1.03-108");

			q.setText(new TranslatedString("Warum m\u00FCssen Sie hier besonders vorsichtig fahren?","T\u1EA1i sao \u1EDF \u0111\u00E2y b\u1EA1n c\u1EA7n \u0111\u1EB7c bi\u1EC7t l\u00E1i xe c\u1EA9n th\u1EADn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.03-108.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Fahrbahn glatt ist","Do \u0111\u01B0\u1EDDng tr\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Sicht durch die Kurve behindert ist","V\u00EC t\u1EA7m nh\u00ECn b\u1ECB h\u1EA1n ch\u1EBF \u1EDF kh\u00FAc cua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Fahrbahn durch den falsch parkenden Pkw verengt ist","Do \u0111\u01B0\u1EDDng b\u1ECB h\u1EB9p \u0111i do xe Pkw \u0111\u1EADu sai")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(61);
	    	
	    	q.setName("1.1.03-109");

			q.setText(new TranslatedString("Wo m\u00FCssen Sie besonders mit pl\u00F6tzlich auftretendem Nebel \nrechnen?","B\u1EA1n c\u1EA7n ch\u00FA \u00FD nh\u1EEFng ch\u1ED7 n\u00E0o \u0111\u1ED9t ng\u1ED9t c\u00F3 s\u01B0\u01A1ng m\u00F9?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Flussl\u00E4ufen","\u1EDE s\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Moorgebieten","\u1EDE \u0111\u1EA7m l\u1EA7y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Seen","\u1EDE h\u1ED3")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.03-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(62);
	    	
	    	q.setName("1.1.03-110");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, wenn vor Ihnen ein Nebelfeld die Sicht stark \nbehindert?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi b\u1ECB s\u01B0\u01A1ng m\u00F9 che t\u1EA7m nh\u00ECn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit rechtzeitig den Sichtverh\u00E4ltnissen anpassen","\u0110i\u1EC1u ch\u1EC9nh t\u1ED1c \u0111\u1ED9 k\u1ECBp th\u1EDDi \u0111\u1EC3 ph\u00F9 h\u1EE3p v\u1EDBi t\u1EA7m nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abstand zum vorausfahrenden Fahrzeug vergr\u00F6\u00DFern","T\u0103ng kho\u1EA3ng c\u00E1ch an to\u00E0n v\u1EDBi xe ph\u00EDa tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dicht aufschlie\u00DFen, um sich an den Schlussleuchten des\nvorausfahrenden Fahrzeugs zu orientieren","\u0110i s\u00E1t, \u0111\u1EC3 c\u00F3 th\u1EC3 \u0111\u1ECBnh h\u01B0\u1EDBng b\u1EB1ng \u0111\u00E8n h\u1EADu c\u1EE7a xe ph\u00EDa tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.04-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(63);
	    	
	    	q.setName("1.1.04-001");

			q.setText(new TranslatedString("Sie biegen von einer hell erleuchteten in eine dunkle Stra\u00DFe ein. \nWas m\u00FCssen Sie dabei ber\u00FCcksichtigen?","B\u1EA1n qu\u1EB9o t\u1EEB \u0111\u01B0\u1EDDng s\u00E1ng v\u00E0o \u0111\u01B0\u1EDDng t\u1ED1i. B\u1EA1n c\u1EA7n ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Augen gew\u00F6hnen sich nur langsam an die Dunkelheit","M\u1EAFt ng\u01B0\u1EDDi th\u00EDch nghi ch\u1EADm v\u1EDBi b\u00F3ng t\u1ED1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Hindernisse sind schlechter zu erkennen als vorher","Kh\u1EA3 n\u0103ng nh\u1EADn bi\u1EBFt s\u1EBD k\u00E9m h\u01A1n so v\u1EDBi tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Schon beim Abbiegen haben sich Ihre Augen vollst\u00E4ndig an die\nDunkelheit gew\u00F6hnt","Ngay khi qu\u1EB9o, m\u1EAFt b\u1EA1n \u0111\u00E3 ho\u00E0n to\u00E0n quen v\u1EDBi b\u00F3ng t\u1ED1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.04-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(64);
	    	
	    	q.setName("1.1.04-101");

			q.setText(new TranslatedString("Im Herbst kommen Ihnen am Tage eine Reihe von Pkw mit \neingeschaltetem Abblendlicht entgegen. Womit m\u00FCssen Sie \nbesonders rechnen?","V\u00E0o m\u00F9a thu, ban ng\u00E0y b\u1EA1n th\u1EA5y 1 \u0111o\u00E0n xe Pkw \u0111i t\u1EEB h\u01B0\u1EDBng \u0111\u1ED1i di\u1EC7n v\u00E0 c\u00F3 b\u1EADt \u0111\u00E8n pha. B\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit pl\u00F6tzlich auftretenden Nebelb\u00E4nken","S\u01B0\u01A1ng m\u00F9 \u0111\u1ED9t nhi\u00EAn xu\u1EA5t hi\u1EC7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit starken Regenschauern","C\u00F3 m\u01B0a to")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit verschmutzter Fahrbahn","\u0110\u01B0\u1EDDng \u0111i d\u01A1 b\u1EA9n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.04-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(65);
	    	
	    	q.setName("1.1.04-102");

			q.setText(new TranslatedString("Kann es gef\u00E4hrlich werden, wenn man von einer hell erleuchteten \nin eine dunkle Stra\u00DFe abbiegt?","C\u00F3 nguy hi\u1EC3m kh\u00F4ng, khi qu\u1EB9o xe t\u1EEB \u0111\u01B0\u1EDDng \u0111\u01B0\u1EE3c chi\u1EBFu s\u00E1ng t\u1ED1t v\u00E0o \u0111\u01B0\u1EDDng t\u1ED1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, weil sich die Augen nicht so schnell an die Dunkelheit anpassen\nk\u00F6nnen","C\u00F3, v\u00EC m\u1EAFt ng\u01B0\u1EDDi kh\u00F4ng th\u1EC3 th\u00EDch nghi nhanh v\u1EDBi b\u00F3ng t\u1ED1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, weil Fu\u00DFg\u00E4nger schlechter zu erkennen sind","C\u00F3, v\u00EC s\u1EBD kh\u00F3 nh\u1EADn ra ng\u01B0\u1EDDi \u0111i b\u1ED9 h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nein, wenn Sie mit Abblendlicht fahren","Kh\u00F4ng, n\u1EBFu c\u00F3 b\u1EADt \u0111\u00E8n pha chi\u1EBFu g\u1EA7n (\u0111\u00E8n c\u1ED1t)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.04-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(66);
	    	
	    	q.setName("1.1.04-103");

			q.setText(new TranslatedString("Was m\u00FCssen Sie hier tun, wenn Sie geblendet werden?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi b\u1ECB l\u00F3a m\u1EAFt"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.04-103.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zum rechten Fahrbahnrand schauen","Nh\u00ECn v\u1EC1 ph\u00EDa l\u1EC1 b\u00EAn ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit notfalls vermindern","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 n\u1EBFu c\u1EA7n thi\u1EBFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beschleunigen, um schneller aus dem Lichtkegel herauszukommen","T\u0103ng t\u1ED1c \u0111\u1EC3 nhanh ch\u00F3ng tho\u00E1t kh\u1ECFi lu\u1ED3ng s\u00E1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.04-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(67);
	    	
	    	q.setName("1.1.04-104");

			q.setText(new TranslatedString("Weshalb ist es m\u00F6glich, dass ein Fahrer das Zeichen \u201EVorfahrt \ngew\u00E4hren!\u201C an der n\u00E4chsten Kreuzung nicht wahrnimmt?","Weshalb ist es m\u00F6glich, dass ein Fahrer das Zeichen \u201EVorfahrt\ngew\u00E4hren!\u201C an der n\u00E4chsten Kreuzung nicht wahrnimmt?\nT\u1EA1i sao l\u1EA1i c\u00F3 kh\u1EA3 n\u0103ng, m\u1ED9t ng\u01B0\u1EDDi l\u00E1i xe kh\u00F4ng nh\u00ECn th\u1EA5y b\u1EA3ng \u201E\u0110\u01B0\u1EE3c \u01B0u ti\u00EAn\u201C \u1EDF giao l\u1ED9 k\u1EBF ti\u1EBFp?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.04-104.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die durchgehende Beleuchtung kann zu der Annahme verleiten, an\nder Kreuzung Vorfahrt zu haben","Die durchgehende Beleuchtung kann zu der Annahme verleiten, an\nder Kreuzung Vorfahrt zu haben")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ausbau und Verlauf der Stra\u00DFe erwecken den Eindruck einer\nVorfahrtstra\u00DFe","Ausbau und Verlauf der Stra\u00DFe erwecken den Eindruck einer\nVorfahrtstra\u00DFe")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.04-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(68);
	    	
	    	q.setName("1.1.04-105");

			q.setText(new TranslatedString("Warum kann das Befahren dieser ungleichm\u00E4\u00DFig beleuchteten \nStra\u00DFe gef\u00E4hrlich werden?","T\u1EA1i sao \u0111i tr\u00EAn \u0111\u01B0\u1EDDng chi\u1EBFu s\u00E1ng chi\u1EBFu s\u00E1ng kh\u00F4ng \u0111\u1EC1u l\u1EA1i nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.04-105.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Fu\u00DFg\u00E4nger, die in einem Dunkelfeld die Stra\u00DFe \u00FCberqueren,\nleicht \u00FCbersehen werden k\u00F6nnen","V\u00EC ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111i qua \u0111\u01B0\u1EDDng trong v\u00F9ng t\u1ED1i s\u1EBD kh\u00F3 \u0111\u01B0\u1EE3c nh\u1EADn ra")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil schlecht beleuchtete Fahrzeuge in den Dunkelfeldern schwer zu\nerkennen sind","V\u00EC trong t\u1ED1i kh\u00F3 nh\u1EADn \u0111\u01B0\u1EE3c xe c\u00F3 \u00E1nh s\u00E1ng y\u1EBFu.")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil entgegenkommende Kraftfahrzeuge erst sp\u00E4t zu erkennen sind","V\u00EC kh\u00F3 nh\u1EADn ra xe \u0111\u1ED1i di\u1EC7n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.04-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(69);
	    	
	    	q.setName("1.1.04-106");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie hier rechnen?","\u1EDE \u0111\u00E2y b\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn nh\u1EEFng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.04-106.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass Ihr Fahrzeug von anderen nicht rechtzeitig gesehen wird","Xe kh\u00E1c kh\u00F3 nh\u00ECn th\u1EA5y xe b\u1EA1n k\u1ECBp th\u1EDDi")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass Sie entgegenkommende Fahrzeuge erst sp\u00E4t erkennen","B\u1EA1n s\u1EBD ch\u1EADm nh\u00ECn th\u1EA5y xe \u0111\u1ED1i di\u1EC7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass sich Ampeln von den bunten Lichtreklamen kaum abheben","\u0110\u00E8n giao th\u00F4ng kh\u00F4ng n\u1ED5i b\u1EADt gi\u1EEFa c\u00E1c \u0111\u00E8n neon m\u00E0u")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.05-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(70);
	    	
	    	q.setName("1.1.05-001");

			q.setText(new TranslatedString("Wo f\u00FChrt schnelles Fahren h\u00E4ufig zu Unf\u00E4llen?","Ch\u1EA1y xe nhanh th\u01B0\u1EDDng d\u1EABn \u0111\u1EBFn tai n\u1EA1n \u1EDF \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Stra\u00DFenkreuzungen und -einm\u00FCndungen","Ng\u00E3 t\u01B0 v\u00E0 c\u00E1c giao l\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Fu\u00DFg\u00E4nger\u00FCberwegen","V\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Kurven","Kh\u00FAc cua")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.05-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(71);
	    	
	    	q.setName("1.1.05-002");

			q.setText(new TranslatedString("Wo ist zu schnelles Fahren besonders gef\u00E4hrlich?","Wo ist zu schnelles Fahren besonders gef\u00E4hrlich?\n\u1EDE ch\u1ED7 n\u00E0o m\u00E0 l\u00E1i xe qu\u00E1 nhanh \u0111\u1EB7c bi\u1EC7t nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In un\u00FCbersichtlichen Kurven","\u1EDE ch\u1ED7 cua khu\u1EA5t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Fahrbahnverengungen","Kh\u00FAc \u0111\u01B0\u1EDDng h\u1EB9p l\u1EA1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Bahn\u00FCberg\u00E4ngen","Ch\u1ED7 c\u00F3 \u0111\u01B0\u1EDDng t\u00E0u ch\u1EA1y ngang")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.05-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(72);
	    	
	    	q.setName("1.1.05-003");

			q.setText(new TranslatedString("Wie durchfahren Sie enge Kurven?","B\u1EA1n ph\u1EA3i \u0111i qua kh\u00FAc cua h\u1EB9p nh\u01B0 th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor der Kurve Geschwindigkeit vermindern","Tr\u01B0\u1EDBc khi v\u00E0o cua, gi\u1EA3m t\u1ED1c \u0111\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Erst beim \u00DCbergang in die Gerade wieder beschleunigen","Ngay khi h\u1EBFt cua b\u1EAFt \u0111\u1EA7u v\u00E0o \u0111o\u1EA1n \u0111\u01B0\u1EDDng th\u1EB3ng l\u00E0 t\u0103ng t\u1ED1c ngay")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Erst im Scheitelpunkt der Kurve Geschwindigkeit vermindern","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 khi \u0111\u00E3 v\u00E0o cua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.05-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(73);
	    	
	    	q.setName("1.1.05-004");

			q.setText(new TranslatedString("Welche Gefahren k\u00F6nnen in diesem Wohngebiet auftreten?","Welche Gefahren k\u00F6nnen in diesem Wohngebiet auftreten?\n\u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 g\u00E2y nguy hi\u1EC3m \u1EDF khu d\u00E2n c\u01B0?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.05-004.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es wird zu schnell gefahren","L\u00E1i xe qu\u00E1 nhanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Einm\u00FCndungen werden \u00FCbersehen","C\u00E1c giao l\u1ED9 kh\u00F4ng \u0111\u01B0\u1EE3c ch\u00FA \u00FD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kinder k\u00F6nnen unerwartet auf die Stra\u00DFe laufen","Tr\u1EBB con b\u1EA5t ng\u1EDD ch\u1EA1y ra \u0111\u01B0\u1EDDng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.05-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(74);
	    	
	    	q.setName("1.1.05-101");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich einstellen?","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn c\u00E1c t\u00ECnh hu\u1ED1ng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.05-101.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf ein Fahrzeug, das hinter der Kurve in Ihrer Richtung langsam\nf\u00E4hrt","C\u00F3 xe ch\u1EA1y ch\u1EADm r\u00F9 sau kh\u00FAc cua tr\u00EAn c\u00F9ng h\u01B0\u1EDBng ch\u1EA1y c\u1EE7a b\u1EA1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf schnellen Gegenverkehr, der die Kurve schneiden wird","Xe \u0111\u1ED1i di\u1EC7n ch\u1EA1y nhanh c\u00F3 th\u1EC3 c\u1EAFt cua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Wildwechsel hinter der Kurve","Th\u00FA r\u1EEBng b\u0103ng qua \u0111\u01B0\u1EDDng ngay sau kh\u00FAc cua")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(75);
	    	
	    	q.setName("1.1.06-001");

			q.setText(new TranslatedString("Radfahrer und Fu\u00DFg\u00E4nger sind auf der Fahrbahn. Was ist beim \n\u00FCberholen zu beachten? \n(Mofa: klingeln statt hupen) \nSie d\u00FCrfen","Xe \u0111\u1EA1p v\u00E0 ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111ang \u0111i tr\u00EAn \u0111\u01B0\u1EDDng.\nB\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 nur mit ausreichendem Seitenabstand (mindestens 1,5 m)\n\u00FCberholen","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c v\u01B0\u1EE3t khi \u0111\u1EE7 kho\u1EA3ng c\u00E1ch an to\u00E0n b\u00EAn (t\u1ED1i thi\u1EC3u l\u00E0 1,5m)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 nicht \u00FCberholen, wenn Sie einen ausreichenden Seitenabstand\nwegen Gegenverkehr nicht einhalten k\u00F6nnen","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t khi b\u1EA1n kh\u00F4ng th\u1EC3 gi\u1EEF \u0111\u1EE7 kho\u1EA3ng c\u00E1ch an to\u00E0n b\u00EAn v\u1EDBi xe \u0111\u1ED1i di\u1EC7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 mit einem Seitenabstand von weniger als 1,0 m \u00FCberholen, wenn\nSie rechtzeitig hupen","B\u1EA1n \u0111\u01B0\u1EE3c v\u01B0\u1EE3t v\u1EDBi kho\u1EA3ng c\u00E1ch b\u00EAn \u00EDt h\u01A1n 1,0m, khi \u0111\u00E3 b\u00F3p c\u00F2i \u0111\u00FAng l\u00FAc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(76);
	    	
	    	q.setName("1.1.06-002");

			q.setText(new TranslatedString("Ist es leichtsinnig, noch kurz vor einer Kreuzung einen Lastzug zu \n\u00FCberholen?","C\u00F3 b\u1EA5t c\u1EA9n kh\u00F4ng khi b\u1EA1n v\u01B0\u1EE3t qua m\u1ED9t xe Lastzug \u1EDF giao l\u1ED9?\n(<em>Xem gi\u1EA3i th\u00EDch v\u00E0 h\u00ECnh minh h\u1ECDa xe Lastzug \u1EDF ph\u1EA7n gi\u1EA3i th\u00EDch t\u1EEB</em>)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, weil der Lastzug die Sicht auf wichtige Verkehrszeichen\nverdecken kann","C\u00F3, v\u00EC xe Lastzug c\u00F3 th\u1EC3 che khu\u1EA5t c\u00E1c bi\u1EC3n b\u00E1o quan tr\u1ECDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, weil der Lastzug die Sicht auf den Querverkehr verdeckt","c\u00F3 , v\u00EC xe Lastzug c\u00F3 th\u1EC3 che khu\u1EA5t d\u00F2ng xe \u0111ang ch\u1EA1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nein, weil Lastz\u00FCge meist langsam fahren","kh\u00F4ng, v\u00EC xe Lastzug th\u01B0\u1EDDng \u0111i ch\u1EADm")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(77);
	    	
	    	q.setName("1.1.06-101");

			q.setText(new TranslatedString("Sie wollen einen Radfahrer \u00FCberholen. Reichen dabei 50 cm \nSeitenabstand aus?","B\u1EA1n mu\u1ED1n v\u01B0\u1EE3t m\u1ED9t chi\u1EBFc xe \u0111\u1EA1p. Kho\u1EA3ng c\u00E1ch an to\u00E0n b\u00EAn ph\u1EA3i l\u00E0 50 cm \u0111\u00FAng kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein, weil der Radfahrer pl\u00F6tzlich ausschwenken k\u00F6nnte","Kh\u00F4ng, v\u00EC xe \u0111\u1EA1p c\u00F3 th\u1EC3 b\u1EA5t ng\u1EDD b\u1ECB l\u1EA1ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, wenn Sie vorher Warnzeichen gegeben haben","\u0110\u00FAng, n\u1EBFu b\u1EA1n \u0111\u00E3 ra t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o tr\u01B0\u1EDBc \u0111\u00F3")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, solange Sie nicht schneller als 40 km/h fahren","\u0110\u00FAng, mi\u1EC5n l\u00E0 b\u1EA1n kh\u00F4ng ch\u1EA1y nhanh h\u01A1n 40 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(78);
	    	
	    	q.setName("1.1.06-102");

			q.setText(new TranslatedString("Warum kann \u00FCberholen auch auf \u00FCbersichtlichen und geraden \nFahrbahnen gef\u00E4hrlich sein? \nWeil die Geschwindigkeit des Gegenverkehrs oft","T\u1EA1i sao khi v\u01B0\u1EE3t tr\u00EAn \u0111\u01B0\u1EDDng th\u1EB3ng v\u00E0 t\u1EA7m nh\u00ECn r\u00F5 r\u00E0ng c\u0169ng c\u00F3 th\u1EC3 nguy hi\u1EC3m?\n\n- V\u00EC t\u1ED1c \u0111\u1ED9 c\u1EE7a xe \u0111\u1ED1i di\u1EC7n th\u01B0\u1EDDng"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 zu niedrig eingesch\u00E4tzt wird","\u0111\u01B0\u1EE3c \u01B0\u1EDBc l\u01B0\u1EE3ng qu\u00E1 th\u1EA5p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 zu hoch eingesch\u00E4tzt wird","\u0111\u01B0\u1EE3c \u01B0\u1EDBc l\u01B0\u1EE3ng qu\u00E1 cao")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(79);
	    	
	    	q.setName("1.1.06-103");

			q.setText(new TranslatedString("Welche Fehler machen das \u00DCberholen auch auf \u00FCbersichtlichen und \ngeraden Fahrbahnen gef\u00E4hrlich?","Nh\u1EEFng nguy hi\u1EC3m n\u00E0o g\u00E2y ra nguy hi\u1EC3m khi v\u01B0\u1EE3t tr\u00EAn \u0111\u01B0\u1EDDng th\u1EB3ng v\u00E0 c\u00F3 t\u1EA7m nh\u00ECn r\u00F5 r\u00E0ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Entfernung eines entgegenkommenden Fahrzeugs wird zu gro\u00DF\neingesch\u00E4tzt","Kho\u1EA3ng c\u00E1ch \u0111\u1EBFn xe ng\u01B0\u1EE3c chi\u1EC1u \u0111\u01B0\u1EE3c \u01B0\u1EDBc t\u00EDnh qu\u00E1 l\u1EDBn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der eigene \u00DCberholweg wird zu kurz eingesch\u00E4tzt","\u0110\u1ECDan \u0111\u01B0\u1EDDng v\u01B0\u1EE3t \u0111\u01B0\u1EE3c \u01B0\u1EDBc t\u00EDnh qu\u00E1 ng\u1EAFn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der eigene \u00DCberholweg wird zu lang eingesch\u00E4tzt","\u0110\u1ECDan \u0111\u01B0\u1EDDng v\u01B0\u1EE3t \u0111\u01B0\u1EE3c \u01B0\u1EDBc t\u00EDnh qu\u00E1 d\u00E0i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(80);
	    	
	    	q.setName("1.1.06-104");

			q.setText(new TranslatedString("Wann wird ein \u00DCberholender gef\u00E4hrdet? \nWenn der Eingeholte","Khi n\u00E0o th\u00EC xe mu\u1ED1n v\u01B0\u1EE3t b\u1ECB nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 pl\u00F6tzlich beschleunigt","Khi xe b\u1ECB v\u01B0\u1EE3t \u0111\u1ED9t ng\u1ED9t t\u0103ng t\u1ED1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 zum \u00FCberholen ausschert","Khi xe b\u1ECB v\u01B0\u1EE3t \u0111\u1ED5i l\u00E0n \u0111\u1EC3 v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 seine Geschwindigkeit stark verringert","Khi xe b\u1ECB v\u01B0\u1EE3t gi\u1EA3m t\u1ED1c \u0111\u1ED9 nhi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(81);
	    	
	    	q.setName("1.1.06-105");

			q.setText(new TranslatedString("In welchen F\u00E4llen muss das \u00DCberholen abgebrochen werden?","Trong t\u00ECnh hu\u1ED1ng n\u00E0o b\u1EA1n ph\u1EA3i b\u1ECF kh\u00F4ng v\u01B0\u1EE3t n\u1EEFa?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn der Eingeholte pl\u00F6tzlich beschleunigt","Khi xe b\u1ECB v\u01B0\u1EE3t \u0111\u1ED9t nhi\u00EAn t\u0103ng t\u1ED1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn durch unerwarteten Gegenverkehr Gefahr entsteht","Khi c\u00F3 xe ng\u01B0\u1EE3c chi\u1EC1u \u0111\u1ED9t nhi\u00EAn xu\u1EA5t hi\u1EC7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn der Eingeholte seine Geschwindigkeit stark verringert","Khi xe ph\u00EDa tr\u01B0\u1EDBc gi\u1EA3m t\u1ED1c \u0111\u1ED9 nhi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(82);
	    	
	    	q.setName("1.1.06-106");

			q.setText(new TranslatedString("Wann ist das \u00DCberholen verboten?","Khi n\u00E0o th\u00EC b\u1ECB c\u1EA5m v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie nicht wesentlich schneller fahren k\u00F6nnen als der zu\n\u00DCberholende","Khi b\u1EA1n kh\u00F4ng th\u1EC3 ch\u1EA1y nhanh h\u01A1n xe ph\u00EDa tr\u01B0\u1EDBc \u0111\u1EE7 \u0111\u1EC3 v\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie nicht die gesamte \u00DCberholstrecke \u00FCberblicken","Khi b\u1EA1n kh\u00F4ng th\u1EC3 quan s\u00E1t to\u00E0n b\u1ED9 \u0111o\u1EA1n \u0111\u01B0\u1EDDng v\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn die Verkehrslage unklar ist","Khi t\u00ECnh tr\u1EA1ng giao th\u00F4ng kh\u00F4ng r\u00F5 r\u00E0ng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(83);
	    	
	    	q.setName("1.1.06-107");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie in dieser Situation rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn nh\u1EEFng g\u00EC trong t\u00ECnh hu\u1ED1ng n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.06-107.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Radfahrerin wird links an dem parkenden Pkw vorbeifahren","C\u00F4 g\u00E1i \u0111i xe \u0111\u1EA1p s\u1EBD tr\u00E1nh v\u1EC1 b\u00EAn tr\u00E1i chi\u1EBFc Pkw \u0111ang \u0111\u1EADu v\u1EC1 b\u00EAn tr\u00E1i \u0111\u1EC3 v\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Gegenverkehr","C\u00F3 xe ng\u01B0\u1EE3c chi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Radfahrerin wird absteigen, um Sie vorbeizulassen","C\u00F4 g\u00E1i \u0111i xe \u0111\u1EA1p xu\u1ED1ng xe \u0111\u1EC3 ch\u1EDD b\u1EA1n \u0111i qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(84);
	    	
	    	q.setName("1.1.06-108");

			q.setText(new TranslatedString("Worauf stellen Sie sich ein?","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB g\u00EC ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.06-108.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf stark schwankende Fahrweise des Radfahrers mit der Last auf\ndem Gep\u00E4cktr\u00E4ger","Xe \u0111\u1EA1p ch\u1EDF gi\u1ECF h\u00E0ng n\u1EB7ng c\u00F3 th\u1EC3 nghi\u00EAng ng\u1EA3 kh\u00F4ng v\u1EEFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass der entferntere Radfahrer nach links pendelt","Xe \u0111\u1EA1p th\u1EE9 hai \u1EDF \u0111\u1EB1ng xa qu\u1EB9o tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dass beide Radfahrer ohne Pendelbewegungen dicht am Bordstein\nweiterfahren","Hai xe \u0111\u1EA1p s\u1EBD kh\u00F4ng \u0111\u1EA1p m\u00E0 s\u1EBD ch\u1EA1y theo qu\u00E1n t\u00EDnh s\u00E1t theo l\u1EC1 \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(85);
	    	
	    	q.setName("1.1.06-109");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen, wenn Sie \u00FCberholen wollen?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC, khi b\u1EA1n mu\u1ED1n v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.06-109.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit unsicherer Fahrweise des Radfahrers","C\u00E1ch l\u00E1i xe kh\u00F4ng an to\u00E0n c\u1EE7a ng\u01B0\u1EDDi \u0111i xe \u0111\u1EA1p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit pl\u00F6tzlich auftauchendem Gegenverkehr","Xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u \u0111\u1ED9t nhi\u00EAn xu\u1EA5t hi\u1EC7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Rutschgefahr und verl\u00E4ngertem Anhalteweg","B\u1ECB tr\u01B0\u1EE3t v\u00E0 kho\u1EA3ng c\u00E1ch phanh d\u00E0i h\u01A1n")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.06-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(86);
	    	
	    	q.setName("1.1.06-110");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.06-110.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Den Radfahrer erst hinter dem stehenden Pkw \u00FCberholen","V\u01B0\u1EE3t xe \u0111\u1EA1p n\u00E0y khi xe n\u00E0y c\u00F2n \u1EDF ph\u00EDa sau xe Pkw")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorsichtig an dem stehenden Pkw vorbeifahren, weil pl\u00F6tzlich\nGegenverkehr kommen kann","C\u1EA9n th\u1EADn v\u01B0\u1EE3t xe Pkw, v\u00EC xe ng\u01B0\u1EE3c chi\u1EC1u c\u00F3 th\u1EC3 \u0111\u1ED9t ng\u1ED9t xu\u1EA5t hi\u1EC7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Den Radfahrer in H\u00F6he des stehenden Pkw z\u00FCgig \u00FCberholen","Tho\u1EA3i m\u00E1i v\u01B0\u1EE3t xe \u0111\u1EA1p khi xe \u0111\u1EA1p \u1EDF ph\u00EDa \u0111\u1EA7u xe Pkw")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(87);
	    	
	    	q.setName("1.1.07-001");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen, wenn vor Ihnen ein Lastzug in eine \nenge Stra\u00DFe nach rechts abbiegen will? \nEr wird","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC, khi tr\u01B0\u1EDBc b\u1EA1n c\u00F3 m\u1ED9t xe t\u1EA3i Lastzug \u0111i tr\u00EAn \u0111\u01B0\u1EDDng h\u1EB9p v\u00E0 \u0111ang mu\u1ED1n qu\u1EB9o ph\u1EA3i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 seine Geschwindigkeit stark vermindern","Xe t\u1EA3i gi\u1EA3m t\u1ED1c \u0111\u1ED9 nhi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 vor dem Abbiegen nach links ausscheren","Tr\u01B0\u1EDBc khi qu\u1EB9o, xe t\u1EA3i s\u1EBD chuy\u1EC3n l\u00E0n sang tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 sich besonders weit rechts einordnen","\u0110i s\u00E1t v\u1EC1 ph\u00EDa ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(88);
	    	
	    	q.setName("1.1.07-002");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie innerorts an Kreuzungen und Einm\u00FCndungen \nbesonders achten?","B\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD g\u00EC \u1EDF giao l\u1ED9 v\u00E0 \u0111\u1EA7u \u0111\u01B0\u1EDDng trong khu d\u00E2n c\u01B0?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kreuzende oder einm\u00FCndende Stra\u00DFen k\u00F6nnen bevorrechtigt sein,\nobwohl sie schmal und weniger gut ausgebaut sind","\u0110\u01B0\u1EDDng \u01B0u ti\u00EAn h\u01A1n c\u0169ng c\u00F3 th\u1EC3 l\u00E0 \u0111\u01B0\u1EDDng c\u1EAFt ngang ho\u1EB7c \u0111\u01B0\u1EDDng n\u1ED1i m\u1EB7c d\u00F9 nh\u1EEFng \u0111\u01B0\u1EDDng n\u00E0y h\u1EB9p v\u00E0 x\u1EA5u h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die breitere Stra\u00DFe ist immer bevorrechtigt","\u0110\u01B0\u1EDDng r\u1ED9ng h\u01A1n lu\u00F4n \u0111\u01B0\u1EE3c \u01B0u ti\u00EAn h\u01A1n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An allen Kreuzungen und Einm\u00FCndungen gilt ausnahmslos die Regel\n\u201Erechts vor links\u201C","\u1EDE t\u1EA5t c\u1EA3 c\u00E1c giao l\u1ED9 v\u00E0 \u0111\u1EA7u \u0111\u01B0\u1EDDng lu\u00F4n \u00E1p d\u1EE5ng lu\u1EADt \u201Erechts vor links\u201C (lu\u1EADt  \u201Eph\u1EA3i \u0111i tr\u01B0\u1EDBc tr\u00E1i\u201C)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(89);
	    	
	    	q.setName("1.1.07-003");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-003.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einem vor dem Bus fahrenden Pkw","Ch\u00FA \u00FD c\u00F3 xe Pkw \u0111ang \u0111i tr\u01B0\u1EDBc xe bus (\u0110\u1EC3 \u00FD trong h\u00ECnh minh h\u1ECDa, sau g\u00F3c khu\u1EA5t c\u00F3 th\u1EC3 c\u00F3 xe nh\u1ECF \u0111ang ch\u1EA1y tr\u01B0\u1EDBc xe bus)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur mit dem von rechts kommenden Bus","Ch\u1EC9 ch\u00FA \u00FD nh\u1EEFng xe \u1EDF b\u00EAn ph\u1EA3i xe bus \u0111ang \u0111i t\u1EDBi")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(90);
	    	
	    	q.setName("1.1.07-004");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich einstellen?","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn c\u00E1c t\u00ECnh hu\u1ED1ng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-004.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass pl\u00F6tzlich Gegenverkehr auftaucht","\u0110\u1ED9t nhi\u00EAn xu\u1EA5t hi\u1EC7n xe ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass der Lkw-Fahrer pl\u00F6tzlich auf die Fahrbahn springt","T\u00E0i x\u1EBF xe Lkw \u0111\u1ED9t ng\u1ED9t nh\u1EA3y xu\u1ED1ng \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass Verkehrszeichen durch den Lkw verdeckt sind","Xe Lkw che khu\u1EA5t c\u00E1c bi\u1EC3n b\u00E1o giao th\u00F4ng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(91);
	    	
	    	q.setName("1.1.07-005");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich einstellen?","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn c\u00E1c t\u00ECnh hu\u1ED1ng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-005.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass von rechts ein Fahrzeug kommt","C\u00F3 xe t\u1EEB l\u1ED1i b\u00EAn ph\u1EA3i ch\u1EA1y t\u1EDBi")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass sich Ihr Bremsweg durch Feuchtigkeit und Laub verl\u00E4ngert","Kho\u1EA3ng c\u00E1ch phanh s\u1EBD d\u00E0i h\u01A1n do \u0111\u1ED9 \u1EA9m v\u00E0 l\u00E1 c\u00E2y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dass ein von rechts kommendes Fahrzeug auf seine Vorfahrt\nverzichtet","Xe \u0111\u1EBFn t\u1EEB con \u0111\u01B0\u1EDDng b\u00EAn ph\u1EA3i chi\u1EBFm quy\u1EC1n \u01B0u ti\u00EAn h\u01A1n xe b\u1EA1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(92);
	    	
	    	q.setName("1.1.07-006");

			q.setText(new TranslatedString("Warum m\u00FCssen Sie hier besonders vorsichtig sein?","T\u1EA1i sao b\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-006.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil beim Bremsen erh\u00F6hte Rutschgefahr besteht","Khi phanh c\u00F3 th\u1EC3 b\u1ECB tr\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil ein Fahrzeug von rechts kommen k\u00F6nnte","V\u00EC c\u00F3 th\u1EC3 c\u00F3 xe t\u1EEB b\u00EAn ph\u1EA3i ch\u1EA1y \u0111\u1EBFn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil das von links kommende Auto Vorfahrt hat","V\u00EC xe \u0111\u1EBFn t\u1EEB b\u00EAn tr\u00E1i c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(93);
	    	
	    	q.setName("1.1.07-007");

			q.setText(new TranslatedString("Wann kann das Verhalten der Radfahrerin f\u00FCr Sie gef\u00E4hrlich \nwerden? \nWenn die Radfahrerin","Khi n\u00E0o th\u00EC c\u00E1ch x\u1EED l\u00FD c\u1EE7a ng\u01B0\u1EDDi \u0111i xe \u0111\u1EA1p g\u00E2y nguy hi\u1EC3m cho b\u1EA1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-007.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 auf die Fahrbahn \u00FCberwechselt, ohne auf den Verkehr zu achten","Khi c\u00F4 \u1EA5y qu\u1EB9o xu\u1ED1ng \u0111\u01B0\u1EDDng v\u00E0 kh\u00F4ng ch\u00FA \u00FD \u0111\u1EBFn xe kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 am Ende des Radweges anh\u00E4lt","Khi c\u00F4 \u1EA5y d\u1EEBng \u1EDF cu\u1ED1i \u0111o\u1EA1n \u0111\u01B0\u1EDDng d\u00E0nh cho xe \u0111\u1EA1p")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 unerlaubt auf dem Gehweg weiterf\u00E4hrt","Khi c\u00F4 \u1EA5y ti\u1EBFp t\u1EE5c \u0111i tr\u00EAn v\u00ECa h\u00E8 (d\u00F9 kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(94);
	    	
	    	q.setName("1.1.07-008");

			q.setText(new TranslatedString("Sie wollen aus einer Reihe parkender Fahrzeuge in den flie\u00DFenden \nVerkehr einfahren. Hinter Ihnen parkt ein Lastzug. Wie beurteilen \nSie diese Situation?","B\u1EA1n mu\u1ED1n r\u1EDDi kh\u1ECFi h\u00E0ng \u0111\u1EADu xe v\u00E0 \u0111i nh\u1EADp v\u00E0o d\u00F2ng xe tr\u00EAn \u0111\u01B0\u1EDDng. Ph\u00EDa sau b\u1EA1n c\u00F3 m\u1ED9t xe Lkw \u0111ang \u0111\u1EADu. B\u1EA1n ph\u1EA3i t\u00EDnh to\u00E1n t\u00ECnh hu\u1ED1ng n\u00E0y th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wegen der verdeckten Sicht k\u00F6nnen Sie herannahende Fahrzeuge\nerst sp\u00E4t sehen","Do xe Lastzug che t\u1EA7m nh\u00ECn, b\u1EA1n s\u1EBD ch\u1EADm nh\u00ECn th\u1EA5y xe \u0111i t\u1EDBi t\u1EEB ph\u00EDa tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wegen der verdeckten Sicht k\u00F6nnen von hinten herannahende\nFahrzeuge Ihr Fahrzeug erst sp\u00E4t sehen","Do b\u1ECB che t\u1EA7m nh\u00ECn, b\u1EA1n s\u1EBD ch\u1EADm nh\u00ECn th\u1EA5y xe \u0111i t\u1EDBi t\u1EEB ph\u00EDa sau")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Einfahren ist hier ungef\u00E4hrlich, weil Sie sich im Schutz des hinter\nIhnen stehenden Lastzugs befinden","\u0110i xu\u1ED1ng \u0111\u01B0\u1EDDng \u1EDF \u0111\u00E2y kh\u00F4ng nguy hi\u1EC3m, v\u00EC b\u1EA1n \u0111\u01B0\u1EE3c xe Lastzug b\u1EA3o v\u1EC7 t\u1EEB ph\u00EDa sau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(95);
	    	
	    	q.setName("1.1.07-009");

			q.setText(new TranslatedString("Sie n\u00E4hern sich einer Schule. Kinder verlassen das Schulgel\u00E4nde. \nWomit m\u00FCssen Sie rechnen? \nDass Kinder","B\u1EA1n \u0111i g\u1EA7n t\u1EDBi m\u1ED9t tr\u01B0\u1EDDng h\u1ECDc. Tr\u1EBB con \u0111ang r\u1EDDi s\u00E2n tr\u01B0\u1EDDng. B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 ausgelassen auf die Fahrbahn st\u00FCrmen","Tr\u1EBB con ch\u1EA1y \u00E0o m\u1ED9t c\u00E1ch v\u00F4 t\u1ED5 ch\u1EE9c xu\u1ED1ng \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 mit ihren Fahrr\u00E4dern unvorsichtig auf die Fahrbahn fahren","Tr\u1EBB con ch\u1EA1y xe \u0111\u1EA1p \u00E0o xu\u1ED1ng \u0111\u01B0\u1EDDng m\u1ED9t c\u00E1ch b\u1EA5t c\u1EA9n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 sich immer verkehrsgerecht verhalten","Tr\u1EBB con lu\u00F4n tu\u00E2n th\u1EE7 lu\u1EADt giao th\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(96);
	    	
	    	q.setName("1.1.07-010");

			q.setText(new TranslatedString("Worauf kann Warnblinklicht hinweisen?","\u0110\u00E8n c\u1EA3nh b\u00E1o cho ta bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf liegen gebliebene Fahrzeuge","C\u00F3 xe ch\u1EBFt m\u00E1y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Schulbusse, bei denen Kinder ein- oder aussteigen","C\u00F3 xe bus, tr\u1EBB con ch\u1EA1y l\u00EAn / xu\u1ED1ng xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Stau","C\u00F3 k\u1EB9t xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-011
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(97);
	    	
	    	q.setName("1.1.07-011");

			q.setText(new TranslatedString("Vor Ihnen will ein gro\u00DFer M\u00E4hdrescher nach rechts abbiegen. Was \nist richtig? \nDer M\u00E4hdrescher","Vor Ihnen will ein gro\u00DFer M\u00E4hdrescher nach rechts abbiegen. Was\nTr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 xe g\u1EB7t l\u00FAa mu\u1ED1n qu\u1EB9o ph\u1EA3i. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 wird beim Abbiegen weit nach links ausschwenken","Xe g\u1EB7t l\u00FAa s\u1EBD qu\u1EB9o xa qua b\u00EAn tr\u00E1i tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 wird vor dem Abbiegen sehr langsam werden","Xe g\u1EB7t l\u00FAa s\u1EBD \u0111i r\u1EA5t ch\u1EADm tr\u01B0\u1EDBc khi qu\u1EB9o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 kann wegen der Hinterradlenkung nicht ausschwenken","Xe g\u1EB7t l\u00FAa do tr\u1EE5c l\u00E1i ph\u00EDa sau c\u00F3 th\u1EC3 kh\u00F4ng xoay \u0111\u01B0\u1EE3c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-012
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(98);
	    	
	    	q.setName("1.1.07-012");

			q.setText(new TranslatedString("Wie verhalten Sie sich in dieser Situation?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o \u1EDF t\u00ECnh hu\u1ED1ng n\u00E0y??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-012.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anhalten, wenn ein gefahrloses Vorbeifahren nicht m\u00F6glich ist","D\u1EEBng l\u1EA1i \u0111\u1EBFn khi kh\u00F4ng c\u00F2n nguy hi\u1EC3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unver\u00E4ndert weiterfahren, weil die Zugmaschine warten muss","C\u1EE9 \u0111i ti\u1EBFp v\u00EC xe h\u00FAt b\u1EE5i ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-013
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(99);
	    	
	    	q.setName("1.1.07-013");

			q.setText(new TranslatedString("Sie fahren hinter einem landwirtschaftlichen Fahrzeug mit hoch \nbeladenem Anh\u00E4nger. Womit m\u00FCssen Sie rechnen?","B\u1EA1n \u0111i sau m\u1ED9t xe c\u00F4ng n\u00F4ng c\u00F3 ch\u1EA5t h\u00E0ng cao \u1EDF r\u01A1-mooc. \nB\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor allem beim Bremsen oder beim Abbiegen k\u00F6nnen Teile der\nLadung herunterfallen","Khi phanh ho\u1EB7c qu\u1EB9o, \u0111\u1ED3 \u0111\u1EA1c tr\u00EAn r\u01A1-mooc c\u00F3 th\u1EC3 r\u01A1i xu\u1ED1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Blinker k\u00F6nnen verdeckt sein, so dass schlecht zu erkennen ist,\nwenn der Zug abbiegen will","\u0110\u00E8n xi-nhan c\u00F3 th\u1EC3 b\u1ECB che khu\u1EA5t, do \u0111\u00F3 b\u1EA1n kh\u00F4ng bi\u1EBFt khi n\u00E0o xe \u0111\u00F3 qu\u1EB9o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Zug hat wegen der Beladung einen besonders kurzen Bremsweg","Xe \u0111\u00F3 c\u00F3 kho\u1EA3ng c\u00E1ch phanh ng\u1EAFn do ph\u1EA3i ch\u1EDF n\u1EB7ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(100);
	    	
	    	q.setName("1.1.07-101");

			q.setText(new TranslatedString("Sie wollen eine landwirtschaftliche Zugmaschine mit nach hinten \nherausragendem Anbauger\u00E4t \u00FCberholen. Was ist zu beachten?","B\u1EA1n mu\u1ED1n v\u01B0\u1EE3t m\u1ED9t xe c\u00F4ng n\u00F4ng c\u00F3 g\u1EAFn m\u00E1y m\u00F3c \u1EDF ph\u00EDa sau. \nB\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Abbiegen kann das Anbauger\u00E4t ausschwenken","Khi qu\u1EB9o, c\u00E1i m\u00E1y ph\u00EDa sau c\u00F3 th\u1EC3 b\u1ECB xoay")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die hintere Beleuchtung kann stark verschmutzt oder verdeckt sein,\nso dass eingeschaltete Blinkleuchten schlecht oder gar nicht zu sehen \nsind","\u0110\u00E8n h\u1EADu b\u1ECB m\u1EDD hay b\u1ECB che khu\u1EA5t n\u00EAn s\u1EBD nh\u00ECn kh\u00F4ng r\u00F5 ho\u1EB7c kh\u00F4ng nh\u00ECn th\u1EA5y \u0111\u00E8n xi-nhan c\u00F3 b\u1EADt hay kh\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zugmaschinen k\u00F6nnen wegen ihrer niedrigen Geschwindigkeit immer\ngefahrlos \u00FCberholt werden","Xe m\u00E1y c\u00E0y lu\u00F4n \u0111i ch\u1EADm n\u00EAn khi v\u01B0\u1EE3t xe n\u00E0y s\u1EBD kh\u00F4ng nguy hi\u1EC3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
