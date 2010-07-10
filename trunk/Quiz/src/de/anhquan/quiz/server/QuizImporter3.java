package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter3 {

	static {
		
				
		//Question 1.2.36-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(301);
	    	
	    	q.setName("1.2.36-003");

			q.setText(new TranslatedString("Welche Bedeutung haben Weisungen von Polizeibeamten?","H\u01B0\u1EDBng d\u1EABn c\u1EE7a c\u1EA3nh s\u00E1t giao th\u00F4ng c\u00F3 \u00FD ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ihnen ist Folge zu leisten","B\u1EA1n ph\u1EA3i tu\u00E2n theo nh\u1EEFng h\u01B0\u1EDBng d\u1EABn \u0111\u00F3")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ihnen ist nur Folge zu leisten, wenn sie mit den aufgestellten\nVerkehrszeichen \u00FCbereinstimmen","B\u1EA1n ch\u1EC9 tu\u00E2n theo nh\u1EEFng h\u01B0\u1EDBng d\u1EABn \u0111\u00F3, khi n\u00F3 ph\u00F9 h\u1EE3p v\u1EDBi bi\u1EC3n \u01B0u ti\u00EAn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie entbinden von der eigenen Sorgfaltspflicht","Sie entbinden von der eigenen Sorgfaltspflicht")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(302);
	    	
	    	q.setName("1.2.36-004");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.36-004.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der gelbe Pkw muss die Kreuzung r\u00E4umen","Xe Pkw m\u00E0u v\u00E0ng ph\u1EA3i l\u00E0m tr\u1ED1ng ng\u00E3 t\u01B0")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss mich auf die Weiterfahrt vorbereiten","T\u00F4i ph\u1EA3i chu\u1EA9n b\u1ECB \u0111i ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf schon jetzt abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o b\u00E2y gi\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(303);
	    	
	    	q.setName("1.2.36-005");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.36-005.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor der Kreuzung warten","D\u1EEBng tr\u01B0\u1EDBc ng\u00E3 t\u01B0")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ohne zu halten abbiegen","Qu\u1EB9o m\u00E0 kh\u00F4ng d\u1EEBng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(304);
	    	
	    	q.setName("1.2.36-006");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.36-006.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kreuzung z\u00FCgig \u00FCberqueren","\u0110i qua ng\u00E3 t\u01B0 lu\u00F4n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor der Kreuzung auf weitere Weisungen des Polizeibeamten warten","Tr\u01B0\u1EDBc ng\u00E3 t\u01B0 ch\u1EDD h\u01B0\u1EDBng d\u1EABn ti\u1EBFp theo c\u1EE7a c\u1EA3nh s\u00E1t")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(305);
	    	
	    	q.setName("1.2.36-007");

			q.setText(new TranslatedString("Im R\u00FCckspiegel sehen Sie auf dem Dach eines unmittelbar hinter \nIhnen fahrenden Streifenwagens in roter Leuchtschrift \u201ESTOP \nPOLIZEI\u201C. F\u00FCr wen gilt dies?","Qua g\u01B0\u01A1ng h\u1EADu b\u1EA1n th\u1EA5y ngay sau xe b\u1EA1n c\u00F3 xe c\u1EA3nh s\u00E1t v\u1EDBi bi\u1EC3n \u201ESTOP POLIZEI\u201C m\u00E0u \u0111\u1ECF. Bi\u1EC3n n\u00E0y b\u00E1o cho ai?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nur f\u00FCr Sie","Ch\u1EC9 d\u00E0nh cho b\u1EA1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("F\u00FCr alle nachfolgenden Fahrzeuge","Cho t\u1EA5t c\u1EA3 nh\u1EEFng xe \u0111i sau")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("F\u00FCr alle Fahrzeuge, die sich auf der Stra\u00DFe befinden","Cho t\u1EA5t c\u1EA3 nh\u1EEFng xe \u0111ang \u0111i tr\u00EAn \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(306);
	    	
	    	q.setName("1.2.36-008");

			q.setText(new TranslatedString("An einem direkt vor Ihnen fahrenden Polizeifahrzeug leuchtet \n\u201EBITTE FOLGEN\u201C auf. Welche Bedeutung hat dies?","Ngay tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 xe c\u1EA3nh s\u00E1t v\u1EDBi bi\u1EC3n b\u00E1o ph\u00E1t s\u00E1ng \u201EBITTE FOLGEN\u201C (h\u00E3y \u0111i theo). \u0110i\u1EC1u n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nur Sie m\u00FCssen dem Polizeifahrzeug folgen","Ch\u1EC9 c\u00F3 b\u1EA1n ph\u1EA3i \u0111i theo xe c\u1EA3nh s\u00E1t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Alle Fahrzeuge, die in gleicher Richtung fahren, m\u00FCssen dem\nPolizeifahrzeug folgen","T\u1EA5t c\u1EA3 c\u00E1c xe \u0111ang \u0111i c\u00F9ng h\u01B0\u1EDBng, ph\u1EA3i \u0111i theo xe c\u1EA3nh s\u00E1t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur Schwertransporte m\u00FCssen dem Polizeifahrzeug folgen","Ch\u1EC9 nh\u1EEFng xe t\u1EA3i n\u1EB7ng ph\u1EA3i \u0111i theo xe c\u1EA3nh s\u00E1t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(307);
	    	
	    	q.setName("1.2.36-009");

			q.setText(new TranslatedString("Ein Polizeifahrzeug \u00FCberholt Sie und schert vor Ihnen ein. Auf dem \nDach erscheint in roter Leuchtschrift \u201EBITTE FOLGEN\u201C. F\u00FCr wen \ngilt dies?","M\u1ED9t xe c\u1EA3nh s\u00E1t v\u01B0\u1EE3t xe b\u1EA1n v\u00E0 \u00E9p v\u00E0o tr\u01B0\u1EDBc xe b\u1EA1n. Tr\u00EAn n\u00F3c xe l\u00E0 bi\u1EC3n ph\u00E1t s\u00E1ng \u201EBITTE FOLGEN\u201C. \u0110i\u1EC1u n\u00E0y \u00E1p d\u1EE5ng cho ai?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nur f\u00FCr Sie","Ch\u1EC9 cho b\u1EA1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur f\u00FCr vor dem Polizeifahrzeug fahrende Fahrzeuge","Ch\u1EC9 cho nh\u1EEFng xe \u0111i tr\u01B0\u1EDBc xe c\u1EA3nh s\u00E1t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("F\u00FCr alle Fahrzeuge, die in gleicher Richtung fahren","Cho t\u1EA5t c\u1EA3 nh\u1EEFng xe \u0111ang \u0111i c\u00F9ng h\u01B0\u1EDBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(308);
	    	
	    	q.setName("1.2.36-010");

			q.setText(new TranslatedString("Aus einem unmittelbar vor Ihnen fahrenden Polizeifahrzeug wird \nIhnen eine rot leuchtende Winkerkelle gezeigt. Was bedeutet dies?","Ngay tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 xe c\u1EA3nh s\u00E1t v\u1EDBi \u0111\u00E8n \u0111\u1ECF xoay tr\u00F2n. \u0110i\u1EC1u n\u00E0y c\u00F3 ngh\u0129a l\u00E0 g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen dem Fahrzeug folgen und hinter ihm anhalten","B\u1EA1n ph\u1EA3i \u0111i \u0111i theo ph\u00EDa sau xe c\u1EA3nh s\u00E1t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie werden aufgefordert, abzubiegen","B\u1EA1n b\u1ECB y\u00EAu c\u1EA7u ph\u1EA3i qu\u1EB9o")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie m\u00FCssen das Zeichen nicht beachten","B\u1EA1n kh\u00F4ng ph\u1EA3i ch\u00FA \u00FD d\u1EA5u hi\u1EC7u \u0111\u00F3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(309);
	    	
	    	q.setName("1.2.36-101");

			q.setText(new TranslatedString("Was gilt hier?","\u0110i\u1EC1u g\u00EC \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.36-101.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Kreuzung darf \u00FCberquert werden","\u0110\u01B0\u1EE3c ph\u00E9p \u0111i qua ng\u00E3 t\u01B0")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor dem Einfahren in die Kreuzung muss auf weitere Zeichen des\nPolizeibeamten gewartet werden","Tr\u01B0\u1EDBc khi \u0111i v\u00E0o ng\u00E3 t\u01B0 ph\u1EA3i ch\u1EDD h\u01B0\u1EDBng d\u1EABn kh\u00E1c c\u1EE7a c\u1EA3nh s\u00E1t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Abbiegen ist nicht zul\u00E4ssig","Qu\u1EB9o l\u00E0 kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(310);
	    	
	    	q.setName("1.2.37-001");

			q.setText(new TranslatedString("Was gilt hier?","\u0110i\u1EC1u g\u00EC \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-001.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rechtsabbieger d\u00FCrfen fahren","\u0110\u01B0\u1EE3c qu\u1EB9o ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geradeausfahrer und Linksabbieger m\u00FCssen warten","Ai \u0111i th\u1EB3ng ho\u1EB7c qu\u1EB9o tr\u00E1i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Alle Fahrzeuge m\u00FCssen rechts abbiegen","T\u1EA5t c\u1EA3 c\u00E1c xe \u0111\u1EC1u ph\u1EA3i qu\u1EB9o ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(311);
	    	
	    	q.setName("1.2.37-002");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-002.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der gr\u00FCne Pkw muss warten","Xe Pkw m\u00E0u xanh l\u00E1 ph\u1EA3i ch\u1EDD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf unter Beachtung der Verkehrszeichen abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o khi ch\u00FA \u00FD xe c\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf erst abbiegen, wenn die Ampel \u201EGr\u00FCn\u201C zeigt","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o, khi \u0111\u00E8n \u0111ang \u201EXanh\u201C")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(312);
	    	
	    	q.setName("1.2.37-003");

			q.setText(new TranslatedString("Wie verhalten Sie sich in dieser Situation?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o \u1EDF t\u00ECnh hu\u1ED1ng n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-003.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Kreuzung ohne anzuhalten \u00FCberqueren","\u0110i ti\u1EBFp qua ng\u00E3 t\u01B0 m\u00E0 kh\u00F4ng d\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An der Sichtlinie anhalten","D\u1EEBng \u1EDF v\u1EA1ch quan s\u00E1t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An der Haltlinie anhalten","D\u1EEBng \u1EDF v\u1EA1ch stop")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(313);
	    	
	    	q.setName("1.2.37-004");

			q.setText(new TranslatedString("Die Ampel zeigt gelbes Blinklicht. Welches Verhalten ist richtig?","\u0110\u00E8n \u0111ang v\u00E0ng. C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-004.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit erh\u00F6hter Vorsicht heranfahren, gegebenenfalls Vorfahrt gew\u00E4hren","C\u1EA9n th\u1EADn cao \u0111\u1ED9 khi \u0111i v\u00E0o, n\u1EBFu c\u1EA7n th\u00EC ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Warten bis zum Lichtzeichenwechsel","Ch\u1EDD \u0111\u1EBFn khi chuy\u1EC3n \u0111\u00E8n")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(314);
	    	
	    	q.setName("1.2.37-005");

			q.setText(new TranslatedString("Wo m\u00FCssen Sie warten?","B\u1EA1n ph\u1EA3i ch\u1EDD \u1EDF \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-005.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An der Haltlinie","\u1EDE v\u1EA1ch stop")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An der Sichtlinie","\u1EDE v\u1EA1ch quan s\u00E1t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In H\u00F6he der Ampel","\u1EDE ngang t\u1EA7m \u0111\u00E8n giao th\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(315);
	    	
	    	q.setName("1.2.37-006");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich hier verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-006.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Z\u00FCgig links abbiegen","Qu\u1EB9o lu\u00F4n v\u1EC1 b\u00EAn tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Erst den Gegenverkehr durchfahren lassen","\u0110\u1EC3 xe ng\u01B0\u1EE3c chi\u1EC1u \u0111i qua tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Abwarten, bis der gr\u00FCne Pfeil erlischt","Ch\u1EDD \u0111\u1EBFn khi \u0111\u00E8n m\u0169i t\u00EAn xanh t\u1EAFt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(316);
	    	
	    	q.setName("1.2.37-007");

			q.setText(new TranslatedString("Was ist bei dieser Ampel mit Gr\u00FCnpfeilschild erlaubt?","\u0110\u00E8n xanh \u0111\u00E8n \u0111\u1ECF nh\u01B0 th\u1EBF n\u00E0y c\u00F9ng v\u1EDBi \u0111\u00E8n m\u0169i t\u00EAn xanh cho ph\u00E9p \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-007.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rechtsabbiegen aus dem rechten Fahrstreifen nach vorherigem\nAnhalten, sofern niemand behindert oder gef\u00E4hrdet wird","Qu\u1EB9o ph\u1EA3i v\u00E0o l\u00E0n b\u00EAn ph\u1EA3i sau khi \u0111\u00E3 d\u1EEBng l\u1EA1i quan s\u00E1t \u0111\u1EC3 kh\u00F4ng g\u00E2y nguy hi\u1EC3m hay c\u1EA3n tr\u1EDF ng\u01B0\u1EDDi kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Rechtsabbiegen ohne anzuhalten","Qu\u1EB9o ph\u1EA3i kh\u00F4ng c\u1EA7n d\u1EEBng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Rechtsabbiegen, nur wenn die Ampel \u201EGr\u00FCn\u201C zeigt","Qu\u1EB9o ph\u1EA3i, khi khi \u0111\u00E8n xanh \u0111\u00E8n \u0111\u1ECF chuy\u1EC3n sang \u201Exanh\u201C")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(317);
	    	
	    	q.setName("1.2.37-008");

			q.setText(new TranslatedString("Wann darf bei dieser Ampel mit Gr\u00FCnpfeilschild nach rechts \nabgebogen werden?","Khi n\u00E0o \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o ph\u1EA3i khi g\u1EB7p \u0111\u00E8n giao th\u00F4ng n\u00E0y v\u1EDBi m\u0169i t\u00EAn m\u00E0u xanh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-008.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn eine Gef\u00E4hrdung anderer Verkehrsteilnehmer, insbesondere\nFu\u00DFg\u00E4nger und Fahrzeuge im Querverkehr, ausgeschlossen ist","Khi kh\u00F4ng g\u00E2y nguy hi\u1EC3m cho ng\u01B0\u1EDDi tham gia giao th\u00F4ng kh\u00E1c, \u0111\u1EB7c bi\u1EC7t l\u00E0 ng\u01B0\u1EDDi \u0111i b\u1ED9 v\u00E0 xe \u1EDF ph\u00EDa \u0111\u01B0\u1EDDng c\u1EAFt ngang")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn eine Behinderung anderer Verkehrsteilnehmer, insbesondere\nFu\u00DFg\u00E4nger und Fahrzeuge im Querverkehr, ausgeschlossen ist","Khi kh\u00F4ng g\u00E2y c\u1EA3n tr\u1EDF cho ng\u01B0\u1EDDi tham gia giao th\u00F4ng kh\u00E1c, \u0111\u1EB7c bi\u1EC7t l\u00E0 ng\u01B0\u1EDDi \u0111i b\u1ED9 v\u00E0 xe \u1EDF ph\u00EDa \u0111\u01B0\u1EDDng c\u1EAFt ngang")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn nur einzelne Fu\u00DFg\u00E4nger geringf\u00FCgig behindert werden","Khi ch\u1EC9 h\u01A1i g\u00E2y c\u1EA3n tr\u1EDF \u0111\u1ED1i v\u1EDBi m\u1ED9t s\u1ED1 ng\u01B0\u1EDDi \u0111i b\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(318);
	    	
	    	q.setName("1.2.37-009");

			q.setText(new TranslatedString("Wo ist bei dieser Ampel mit Gr\u00FCnpfeilschild vor dem Abbiegen \nnach rechts anzuhalten?","Ph\u1EA3i d\u1EEBng \u1EDF \u0111\u00E2u khi mu\u1ED1n qu\u1EB9o ph\u1EA3i \u1EDF \u0111\u00E8n xanh \u0111\u00E8n \u0111\u1ECF c\u00F3 m\u0169i t\u00EAn xanh nh\u01B0 th\u1EBF n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-009.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An der Haltlinie","\u1EDE v\u1EA1ch stop")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn keine Haltlinie vorhanden ist, vor der Kreuzung oder\nEinm\u00FCndung","Khi kh\u00F4ng c\u00F3 v\u1EA1ch stop, ph\u1EA3i d\u1EEBng tr\u01B0\u1EDBc ng\u00E3 t\u01B0 ho\u1EB7c giao l\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es muss nicht angehalten werden","Kh\u00F4ng ph\u1EA3i d\u1EEBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(319);
	    	
	    	q.setName("1.2.37-101");

			q.setText(new TranslatedString("Sie wollen bei \u201EGr\u00FCn\u201C nach links abbiegen; links neben Ihnen will \neine Stra\u00DFenbahn geradeaus weiterfahren. Was ist richtig?","B\u1EA1n mu\u1ED1n qu\u1EB9o tr\u00E1i khi \u0111\u00E8n \u201EXanh\u201C; b\u00EAn c\u1EA1nh ph\u00EDa tay tr\u00E1i xe b\u1EA1n c\u00F3 m\u1ED9t t\u00E0u \u0111i\u1EC7n mu\u1ED1n \u0111i th\u1EB3ng. \u0110i\u1EC1u g\u00EC l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen warten","B\u1EA1n ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Stra\u00DFenbahn muss warten","T\u00E0u \u0111i\u1EC7n ph\u1EA3i ch\u1EDD")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Gegenseitige Verst\u00E4ndigung, weil keine Regel besteht","T\u1EF1 ph\u1ED1i h\u1EE3p nhau v\u00EC kh\u00F4ng c\u00F3 lu\u1EADt n\u00E0o c\u1EA3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(320);
	    	
	    	q.setName("1.2.37-102");

			q.setText(new TranslatedString("Sie haben sich versehentlich rechts eingeordnet, obwohl Sie nach \nlinks abbiegen mochten. Wie d\u00FCrfen Sie weiterfahren?","Do nh\u1EA7m n\u00EAn b\u1EA1n \u0111i v\u00E0o ph\u1EA7n \u0111\u01B0\u1EDDng b\u00EAn ph\u1EA3i trong khi b\u1EA1n mu\u1ED1n qu\u1EB9o tr\u00E1i. B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111i ti\u1EBFp nh\u01B0 th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-102.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geradeaus","\u0110i th\u1EB3ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach rechts","Qu\u1EB9o ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach links, sobald die Ampel daf\u00FCr \u201EGr\u00FCn\u201C zeigt","Qu\u1EB9o tr\u00E1i, mi\u1EC5n l\u00E0 \u0111\u00E8n giao th\u00F4ng \u0111ang \u201EXanh\u201C")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.37-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(321);
	    	
	    	q.setName("1.2.37-103");

			q.setText(new TranslatedString("Was bedeuten diese Dauerlichtzeichen?","\u0110\u00E8n l\u00E0n th\u1EBF n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.37-103.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss von Fahrstreifen 2 auf 1 wechseln","T\u00F4i ph\u1EA3i chuy\u1EC3n t\u1EEB l\u00E0n 2 s\u00E1ng l\u00E0n 1")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Fahrstreifen 3 und 4 darf ich nicht benutzen","T\u00F4i kh\u00F4ng \u0111\u01B0\u1EE3c s\u1EED d\u1EE5ng l\u00E0n 3 v\u00E0 4")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Wechsel von Fahrstreifen 2 auf 1 ist der nachfolgende Verkehr\nin jedem Fall wartepflichtig","Khi chuy\u1EC3n t\u1EEB l\u00E0n 2 sang l\u00E0n 1, xe \u0111i sau trong m\u1ECDi t\u00ECnh hu\u1ED1ng ph\u1EA3i c\u00F3 tr\u00E1ch nhi\u1EC7m nh\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.38-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(322);
	    	
	    	q.setName("1.2.38-001");

			q.setText(new TranslatedString("Es n\u00E4hert sich ein Fahrzeug mit blauem Blinklicht und Einsatzhorn. \nWie verhalten Sie sich?","C\u00F3 xe v\u1EDBi \u0111\u00E8n nh\u00E1y m\u00E0u xanh v\u00E0 c\u00F2i h\u00FA \u0111\u1EBFn g\u1EA7n. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dem Fahrzeug Platz machen","T\u1EA1o kho\u1EA3ng tr\u1ED1ng cho xe n\u00E0y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn n\u00F6tig, vorsichtig auf den Gehweg ausweichen","N\u1EBFu c\u1EA7n thi\u1EBFt, c\u1EA9n th\u1EADn tr\u00E1nh l\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Immer scharf bremsen und sofort stehen bleiben","Phanh g\u1EA5p v\u00E0 d\u1EEBng l\u1EA1i l\u1EADp t\u1EE9c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.38-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(323);
	    	
	    	q.setName("1.2.38-002");

			q.setText(new TranslatedString("Sie h\u00F6ren ein Einsatzhorn. Welche Fragen m\u00FCssen Sie sich in \ndiesem Moment stellen?","B\u1EA1n nghe c\u00F3 c\u00F2i h\u00FA. C\u00E2u h\u1ECFi n\u00E0o b\u1EA1n ph\u1EA3i t\u1EF1 \u0111\u1EB7t ra trong l\u00FAc n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Woher kommt das Einsatzfahrzeug?","Xe c\u00F3 c\u00F2i h\u00FA t\u1EEB h\u01B0\u1EDBng n\u00E0o ch\u1EA1y \u0111\u1EBFn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("K\u00F6nnte das Einsatzfahrzeug durch mich behindert werden?","T\u00F4i c\u00F3 c\u1EA3n tr\u1EDF xe c\u00F3 c\u00F2i h\u00FA kh\u00F4ng?")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Darf das Fahrzeug das Einsatzhorn \u00FCberhaupt benutzen?","Xe \u0111\u00F3 c\u00F3 th\u1EF1c s\u1EF1 \u0111\u01B0\u1EE3c ph\u00E9p g\u1EAFn c\u00F2i h\u00FA kh\u00F4ng?")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.38-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(324);
	    	
	    	q.setName("1.2.38-003");

			q.setText(new TranslatedString("Wovor kann gelbes Blinklicht auf einem Fahrzeug warnen?","\u0110\u00E8n nh\u00E1y m\u00E0u v\u00E0ng tr\u00EAn m\u1ED9t xe c\u1EA3nh b\u00E1o \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor Gefahren an einer Arbeits- oder Unfallstelle","Nguy hi\u1EC3m \u1EDF khu v\u1EF1c c\u00F4ng tr\u01B0\u1EDDng thi c\u00F4ng ho\u1EB7c n\u01A1i x\u1EA3y ra tai n\u1EA1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor einem Fahrzeug mit ungew\u00F6hnlicher Breite","Xe c\u00F3 chi\u1EC1u ngang b\u1EA5t th\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor einem langsam fahrenden Gro\u00DFraumtransport","Xe t\u1EA3i l\u1EDBn ch\u1EA1y ch\u1EADm")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.38-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(325);
	    	
	    	q.setName("1.2.38-101");

			q.setText(new TranslatedString("Was kann es bedeuten, wenn an einem Fahrzeug blaues Blinklicht \n\u2013 jedoch kein Einsatzhorn \u2013 eingeschaltet ist?","Khi m\u1ED9t xe b\u1EADt \u0111\u00E8n nh\u00E1y xanh - kh\u00F4ng c\u00F3 c\u00F2i h\u00FA - th\u00EC c\u00F3 \u00FD ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An einer Unfallstelle wird vor Gefahren gewarnt","C\u1EA3nh b\u00E1o tr\u01B0\u1EDBc nguy hi\u1EC3m \u1EDF khu v\u1EF1c c\u00F3 tai n\u1EA1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es wird vor einer Einsatzstelle der Feuerwehr gewarnt","C\u1EA3nh b\u00E1o tr\u01B0\u1EDBc n\u01A1i xe c\u1EE9u h\u1ECFa \u0111ang ho\u1EA1t \u0111\u1ED9ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ein Abschleppwagen f\u00E4hrt zu einem Einsatz","Xe th\u00F9ng \u0111\u1EC3 k\u00E9o xe vi ph\u1EA1m \u0111ang l\u00E0m nhi\u1EC7m v\u1EE5")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.38-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(326);
	    	
	    	q.setName("1.2.38-102");

			q.setText(new TranslatedString("Welche Bedeutung kann das blaue Blinklicht allein (ohne \nEinsatzhorn) haben?","N\u1EBFu c\u00F3 m\u1ED7i \u0111\u00E8n ch\u1EDBp nh\u00E1y xanh m\u00E0 kh\u00F4ng c\u00F3 c\u00F2i h\u00FA th\u00EC c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug befindet sich auf einer Einsatzfahrt. Sie sollten ihm\nPlatz machen","Xe \u0111\u00F3 \u0111ang l\u00E0m nhi\u1EC7m v\u1EE5. B\u1EA1n n\u00EAn tr\u00E1nh \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ank\u00FCndigung eines geschlossenen Verbandes","Th\u00F4ng b\u00E1o c\u00F3 \u0111o\u00E0n xe \u0111ang \u0111i tr\u00EAn \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ohne Einsatzhorn hat das blaue Blinklicht keine Bedeutung","\u0110\u00E8n nh\u00E1y m\u00E0 k\u00F4 c\u00F3 c\u00F2i h\u00FA th\u00EC v\u00F4 ngh\u0129a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(327);
	    	
	    	q.setName("1.3.01-001");

			q.setText(new TranslatedString("An welchen Stellen ohne vorfahrtregelnde Verkehrszeichen gilt die \nRegel \u201Erechts vor links\u201C?","\u1EDE ch\u1ED7 n\u00E0o khi kh\u00F4ng c\u00F3 bi\u1EC3n b\u00E1o \u01B0u ti\u00EAn th\u00EC lu\u1EADt \u201Erechts vor links\u201C \u0111\u01B0\u1EE3c \u00E1p d\u1EE5ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Stra\u00DFenkreuzungen und -einm\u00FCndungen","\u1EDE ng\u00E3 t\u01B0 ho\u1EB7c n\u01A1i v\u00E0o \u0111\u1EA7u \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An Grundst\u00FCcksausfahrten","T\u1EA1i \u0111i\u1EC3m ausfahrt")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Am Ende eines verkehrsberuhigten Bereiches","Khi h\u1EBFt khu v\u1EF1c h\u1EA1n ch\u1EBF xe c\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(328);
	    	
	    	q.setName("1.3.01-002");

			q.setText(new TranslatedString("An welchen Stellen ohne vorfahrtregelnde Verkehrszeichen gilt die \nRegel \u201Erechts vor links\u201C?","\u1EDE ch\u1ED7 n\u00E0o kh\u00F4ng c\u00F3 bi\u1EC3n b\u00E1o \u01B0u ti\u00EAn th\u00EC lu\u1EADt \u201Erechts vor links\u201C \u0111\u01B0\u1EE3c \u00E1p d\u1EE5ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Stra\u00DFenkreuzungen und -einm\u00FCndungen","\u1EDE ng\u00E3 t\u01B0, giao l\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An Einm\u00FCndungen mit abgesenktem Bordstein","\u1EDE giao l\u1ED9 c\u00F3 l\u1EC1 \u0111\u01B0\u1EDDng th\u1EA5p")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wo Feld- oder Waldwege in eine andere Stra\u00DFe m\u00FCnden","\u1EDE n\u01A1i m\u00E0 \u0111\u01B0\u1EDDng ru\u1ED9ng ho\u1EB7c \u0111\u01B0\u1EDDng r\u1EEBng giao v\u1EDBi \u0111\u01B0\u1EDDng kh\u00E1c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(329);
	    	
	    	q.setName("1.3.01-003");

			q.setText(new TranslatedString("Sie kommen an eine Kreuzung, an der Sie die Vorfahrtlage nicht \ngleich \u00FCberblicken. Wie verhalten Sie sich?","B\u1EA1n \u0111i t\u1EDBi ng\u00E3 t\u01B0, v\u00E0 ch\u1ED7 n\u00E0y b\u1EA1n ch\u01B0a n\u1EAFm r\u00F5 c\u00E1c h\u01B0\u1EDBng \u01B0u ti\u00EAn."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warten, beobachten und sich gegebenenfalls mit anderen\nverst\u00E4ndigen","Ch\u1EDD, quan s\u00E1t v\u00E0 ph\u1ED1i h\u1EE3p v\u1EDBi c\u00E1c xe kh\u00E1c n\u1EBFu c\u00F3 th\u1EC3")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach der Regel \u201Erechts vor links\u201C fahren","Ch\u1EC9 \u0111i theo lu\u1EADt \u201Erechts vor links\u201C")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Als Geradeausfahrer immer durchfahren","Lu\u00F4n \u0111i th\u1EB3ng qua lu\u00F4n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(330);
	    	
	    	q.setName("1.3.01-004");

			q.setText(new TranslatedString("Sie wollen eine Vorfahrtstra\u00DFe \u00FCberqueren. Die Sicht nach beiden \nSeiten ist durch parkende Fahrzeuge stark eingeschr\u00E4nkt. Wie \nverhalten Sie sich? \n(Mofa: Klingeln statt Hupzeichen)","B\u1EA1n mu\u1ED1n qu\u1EB9o v\u00E0o \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn. T\u1EA7m nh\u00ECn t\u1EEB hai ph\u00EDa b\u1ECB h\u1EA1n ch\u1EBF do c\u00E1c xe \u0111ang \u0111\u1EADu che khu\u1EA5t. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorsichtig in die Kreuzung hineintasten","C\u1EA9n th\u1EADn \u0111i v\u00E0o ng\u00E3 t\u01B0")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Kreuzung m\u00F6glichst schnell \u00FCberqueren","Qu\u1EB9o nhanh qua ng\u00E3 t\u01B0 c\u00E0ng nhanh c\u00E0ng t\u1ED1t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Den kreuzenden Verkehr durch Hupzeichen warnen","C\u1EA3nh b\u00E1o c\u00E1c xe \u1EDF ng\u00E3 t\u01B0 b\u1EB1ng c\u00F2i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(331);
	    	
	    	q.setName("1.3.01-005");

			q.setText(new TranslatedString("Sie wollen nach rechts in eine Vorfahrtstra\u00DFe einbiegen. Auf welche \nVerkehrsteilnehmer m\u00FCssen Sie achten?","B\u1EA1n mu\u1ED1n qu\u1EB9o ph\u1EA3i v\u00E0o \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD c\u00E1c ph\u01B0\u01A1ng ti\u1EC7n tham gia giao th\u00F4ng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf von links und von rechts kommende Fahrzeuge","C\u00E1c xe t\u1EEB b\u00EAn tr\u00E1i v\u00E0 b\u00EAn ph\u1EA3i t\u1EDBi")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Fu\u00DFg\u00E4nger und Radfahrer, die rechts neben oder noch hinter\nIhnen sind","Ng\u01B0\u1EDDi \u0111i b\u1ED9 v\u00E0 xe \u0111\u1EA1p \u1EDF ngay ph\u1EA3i b\u00EAn ph\u1EA3i v\u00E0 ph\u00EDa sau")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur auf die von links kommenden Fahrzeuge","Ch\u1EC9 nh\u1EEFng xe t\u1EEB b\u00EAn tr\u00E1i \u0111\u1EBFn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(332);
	    	
	    	q.setName("1.3.01-006");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-006.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Radfahrer muss warten","Xe \u0111\u1EA1p ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(333);
	    	
	    	q.setName("1.3.01-007");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-007.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den Radfahrer durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111\u1EA1p qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den Motorradfahrer durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem Radfahrer abbiegen","T\u00F4i \u0111\u01B0\u1EE3c qu\u1EB9o tr\u01B0\u1EDBc xe \u0111\u1EA1p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(334);
	    	
	    	q.setName("1.3.01-008");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-008.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich lasse den gr\u00FCnen Pkw durchfahren","T\u00F4i \u0111\u1EC3 xe Pkw m\u00E0u xanh qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich biege vor dem gr\u00FCnen Pkw links ab","T\u00F4i qu\u1EB9o tr\u01B0\u1EDBc xe Pkw m\u00E0u xanh")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den roten Pkw vorbeilassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Pkw m\u00E0u \u0111\u1ECF qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(335);
	    	
	    	q.setName("1.3.01-009");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-009.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich lasse den blauen Lkw durchfahren","T\u00F4i \u0111\u1EC3 xe Lkw m\u00E0u xanh qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich lasse den gelben Pkw durchfahren","T\u00F4i \u0111\u1EC3 xe Pkw m\u00E0u v\u00E0ng qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem gelben Pkw abbiegen","T\u00F4i qu\u1EB9o tr\u01B0\u1EDBc xe Pkw m\u00E0u v\u00E0ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(336);
	    	
	    	q.setName("1.3.01-010");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-010.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den Radfahrer durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111\u1EA1p qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf vor dem Motorrad fahren","T\u00F4i \u0111\u01B0\u1EE3c \u0111i tr\u01B0\u1EDBc xe m\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Radfahrer muss mich vorbeilassen","Xe \u0111\u1EA1p ph\u1EA3i \u0111\u1EC3 t\u00F4i \u0111i qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-011
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(337);
	    	
	    	q.setName("1.3.01-011");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-011.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den Radfahrer abbiegen lassen","T\u00F4i \u0111\u1EC3 xe \u0111\u1EA1p qu\u1EB9o tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den blauen Pkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Pkw m\u00E0u xanh qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der blaue Pkw muss mich abbiegen lassen","Xe Pkw m\u00E0u xanh ph\u1EA3i \u0111\u1EC3 t\u00F4i qu\u1EB9o tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-012
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(338);
	    	
	    	q.setName("1.3.01-012");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-012.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich lasse den blauen Pkw abbiegen","T\u00F4i \u0111\u1EC3 xe Pkw m\u00E0u xanh qu\u1EB9o tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der blaue Pkw muss warten","Xe Pkw m\u00F9a xanh ph\u1EA3i ch\u1EDD")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Motorrad darf vor mir abbiegen","Xe m\u00E1y \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc t\u00F4i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-013
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(339);
	    	
	    	q.setName("1.3.01-013");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-013.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf als Erster die Kreuzung \u00FCberqueren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc ti\u00EAn \u1EDF ng\u00E3 t\u01B0")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den roten Lkw abbiegen lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Lkw m\u00E0u \u0111\u1ECF qu\u1EB9o tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den Radfahrer abbiegen lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111\u1EA1p qu\u1EB9o tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-014
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(340);
	    	
	    	q.setName("1.3.01-014");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-014.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Radfahrer muss warten","Xe \u0111\u1EA1p ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-015
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(341);
	    	
	    	q.setName("1.3.01-015");

			q.setText(new TranslatedString("Welches Verhalten ist richtig? \n(Mofa: \u201Eanderen\u201C streichen)","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-015.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf vor den beiden anderen Pkw abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc 2 xe Pkw")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss die beiden anderen Pkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 2 xe Pkw \u0111i tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss nur den blauen Pkw durchfahren lassen","T\u00F4i ch\u1EC9 ph\u1EA3i \u0111\u1EC3 xe Pkw m\u00E0u xanh qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-016
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(342);
	    	
	    	q.setName("1.3.01-016");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-016.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den blauen Lkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Lkw m\u00E0u xanh qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den Traktor abbiegen lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y c\u00E0y qu\u1EB9o tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Traktor muss mich durchfahren lassen","Xe m\u00E1y c\u00E0y ph\u1EA3i \u0111\u1EC3 t\u00F4i \u0111i tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-017
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(343);
	    	
	    	q.setName("1.3.01-017");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-017.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss das Motorrad durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich fahre vor dem Bus","T\u00F4i \u0111i tr\u01B0\u1EDBc xe bus")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den Bus durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe l\u00E1y qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-018
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(344);
	    	
	    	q.setName("1.3.01-018");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-018.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss das Motorrad durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich fahre vor dem Bus","T\u00F4i \u0111i tr\u01B0\u1EDBc xe t\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den Bus durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe bus qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-019
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(345);
	    	
	    	q.setName("1.3.01-019");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-019.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss die Stra\u00DFenbahn durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 t\u00E0u \u0111i\u1EC7n qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss das Motorrad durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Stra\u00DFenbahn muss mich vorher abbiegen lassen","Xe \u0111i\u1EC7n ph\u1EA3i kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t tr\u01B0\u1EDBc xe c\u1EE7a t\u00F4i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-020
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(346);
	    	
	    	q.setName("1.3.01-020");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-020.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf als Erster fahren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p l\u00E0 ng\u01B0\u1EDDi \u0111i tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den roten Pkw vorlassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Pkw \u0111\u1ECF qua tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss die Stra\u00DFenbahn vorlassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111i\u1EC7n qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-021
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(347);
	    	
	    	q.setName("1.3.01-021");

			q.setText(new TranslatedString("Welches Verhalten ist richtig? \nIch darf","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?\n- T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-021.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 erst nach dem Motorrad abbiegen","qu\u1EB9o sau xe m\u00E1y \u0111\u1EA7u ti\u00EAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 vor dem gelben Pkw abbiegen","qu\u1EB9o tr\u01B0\u1EDBc xe Pkw m\u00E0u v\u00E0ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 als Erster abbiegen","qu\u1EB9o \u0111\u1EA7u ti\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-022
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(348);
	    	
	    	q.setName("1.3.01-022");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-022.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss die Stra\u00DFenbahn vorbeilassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111i\u1EC7n qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den Traktor vorbeilassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y c\u00E0y qua tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor der Stra\u00DFenbahn abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc t\u00E0u \u0111i\u1EC7n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-023
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(349);
	    	
	    	q.setName("1.3.01-023");

			q.setText(new TranslatedString("Welches Verhalten ist richtig? \nIch muss","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-023.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 den Radfahrer durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111\u1EA1p qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 den Bus durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe bus qu\u00E1 tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 zun\u00E4chst an der Haltlinie anhalten","T\u00F4i ph\u1EA3i d\u1EEBng tr\u01B0\u1EDBc ti\u00EAn \u1EDF v\u1EA1ch stop")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-024
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(350);
	    	
	    	q.setName("1.3.01-024");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-024.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem Motorrad die Kreuzung \u00FCberqueren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o \u1EDF ng\u00E3 t\u01B0 tr\u01B0\u1EDBc xe m\u00E1y")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-025
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(351);
	    	
	    	q.setName("1.3.01-025");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-025.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der gelbe Pkw muss warten","Xe Pkw m\u00E0u v\u00E0ng ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-026
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(352);
	    	
	    	q.setName("1.3.01-026");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-026.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der gr\u00FCne Pkw muss warten","Xe Pkw m\u00E0u xanh l\u00E1 ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-027
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(353);
	    	
	    	q.setName("1.3.01-027");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-027.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf durchfahren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p \u0111i qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den gelben Pkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Pkw m\u00E0u v\u00E0ng qua tr\u01B0\u1EDBc")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-028
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(354);
	    	
	    	q.setName("1.3.01-028");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-028.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss das Motorrad vorbeifahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Motorrad muss warten","Xe m\u00E1y ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-029
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(355);
	    	
	    	q.setName("1.3.01-029");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-029.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf als Erster fahren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p \u0111i tr\u01B0\u1EDBc ti\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den roten Pkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3  xe Pkw m\u00E0u \u0111\u1ECF \u0111i qua tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf erst als Letzter in die Kreuzung einfahren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p \u0111i v\u00E0o ng\u00E3 t\u01B0 sau c\u00F9ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-030
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(356);
	    	
	    	q.setName("1.3.01-030");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-030.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss das Motorrad durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den blauen Pkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3  xe Pkw m\u00E0u xanh da tr\u1EDDi \u0111i qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem blauen Pkw fahren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p \u0111i tr\u01B0\u1EDBc xe Pkw m\u00E0u xanh da tr\u1EDDi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-031
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(357);
	    	
	    	q.setName("1.3.01-031");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-031.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den roten Pkw vorbeilassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Pkw m\u00E0u \u0111\u1ECF \u0111i qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf vor dem blauen Lkw abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc xe Lkw m\u00E0u xanh da tr\u1EDDi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den blauen Lkw vorlassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Lkw m\u00E0u xanh da tr\u1EDDi \u0111i qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-032
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(358);
	    	
	    	q.setName("1.3.01-032");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-032.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den gelben Lkw vorbeilassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Lkw m\u00E0u v\u00E0ng \u0111i qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf vor dem gr\u00FCnen Pkw abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc xe Pkw m\u00E0u xanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den gr\u00FCnen Pkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Pkw m\u00E0u xanh \u0111i qua tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-033
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(359);
	    	
	    	q.setName("1.3.01-033");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-033.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf durchfahren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p \u0111i qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss dem blauen Pkw Vorfahrt gew\u00E4hren","T\u00F4i ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn cho xe Pkw m\u00E0u xanh da tr\u1EDDi")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss dem gr\u00FCnen Pkw Vorfahrt gew\u00E4hren","T\u00F4i ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn cho xe Pkw m\u00E0u l\u00E1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(360);
	    	
	    	q.setName("1.3.01-101");

			q.setText(new TranslatedString("Wer muss warten?","Ai ph\u1EA3i ch\u1EDD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-101.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Pkw, der aus dem Feldweg kommt","Xe Pkw, chi\u1EBFc \u0111ang \u0111i t\u1EEB \u0111\u01B0\u1EDDng ru\u1ED9ng l\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(361);
	    	
	    	q.setName("1.3.01-102");

			q.setText(new TranslatedString("Sie wollen aus diesem Feldweg links abbiegen. Wer muss warten?","B\u1EA1n mu\u1ED1n qu\u1EB9o tr\u00E1i t\u1EEB trong \u0111\u01B0\u1EDDng ru\u1ED9ng. Ai ph\u1EA3i ch\u1EDD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-102.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Kraftfahrzeug auf der Landstra\u00DFe","C\u00E1c xe c\u00F3 \u0111\u1ED9ng c\u01A1 tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(362);
	    	
	    	q.setName("1.3.01-103");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-103.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Mofa muss warten","Xe Mofa ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(363);
	    	
	    	q.setName("1.3.01-104");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-104.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der gelbe Pkw muss warten","Xe Pkw m\u00E0u v\u00E0ng ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(364);
	    	
	    	q.setName("1.3.01-105");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-105.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss das Motorrad vorbeilassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe m\u00E1y \u0111i qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich darf vor dem blauen Pkw fahren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p \u0111i tr\u01B0\u1EDBc xe Pkw m\u00E0u xanh da tr\u1EDDi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem Motorrad fahren","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p \u0111i tr\u01B0\u1EDBc xe m\u00E1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(365);
	    	
	    	q.setName("1.3.01-106");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-106.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss dem roten Pkw Vorfahrt gew\u00E4hren","T\u00F4i ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn cho xe Pkw m\u00E0u \u0111\u1ECF")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich habe Vorfahrt vor dem blauen Pkw","T\u00F4i c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn tr\u01B0\u1EDBc xe Pkw m\u00E0u xanh da tr\u1EDDi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss dem blauen Pkw Vorfahrt gew\u00E4hren","T\u00F4i ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn cho xe Pkw m\u00E0u xanh da tr\u1EDDi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(366);
	    	
	    	q.setName("1.3.01-107");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-107.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den Radfahrer durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111\u1EA1p \u0111i qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich verzichte auf meine Vorfahrt, um die Kreuzung nicht zu verstopfen","T\u00F4i b\u1ECF quy\u1EC1n \u01B0u ti\u00EAn c\u1EE7a m\u00ECnh, \u0111\u1EC3 kh\u00F4ng l\u00E0m c\u1EA3n tr\u1EDF \u1EDF ng\u00E3 t\u01B0")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem Radfahrer links abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc xe \u0111\u1EA1p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(367);
	    	
	    	q.setName("1.3.01-108");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-108.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den Radfahrer durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111\u1EA1p qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem Radfahrer abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc xe \u0111\u1EA1p")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der blaue Lkw darf zuerst fahren","Xe Lkw m\u00E0u xanh da tr\u1EDDi \u0111\u01B0\u1EE3c ph\u00E9p \u0111i tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(368);
	    	
	    	q.setName("1.3.01-109");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.3.01-109.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich fahre zuerst","T\u00F4i \u0111i tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss den gelben Pkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe Pkw m\u00E0u v\u00E0ng qua tr\u01B0\u1EDBc")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.3.01-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(369);
	    	
	    	q.setName("1.3.01-110");

			q.setText(new TranslatedString("Sie fahren au\u00DFerhalb geschlossener Ortschaften und wollen nach \nrechts in eine Vorfahrtstra\u00DFe einbiegen. Worauf m\u00FCssen Sie \nachten?","B\u1EA1n l\u00E1i xe ngo\u00E0i khu v\u1EF1c \u0111\u00F4 th\u1ECB v\u00E0 mu\u1ED1n qu\u1EB9o ph\u1EA3i v\u00E0o \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Von rechts k\u00F6nnte sich ein \u00DCberholendes Fahrzeug n\u00E4hern","T\u1EEB b\u00EAn ph\u1EA3i c\u00F3 th\u1EC3 c\u00F3 xe \u0111ang v\u01B0\u1EE3t ch\u1EA1y t\u1EDBi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich muss beim Rechtsabbiegen nur nach links schauen","T\u00F4i ch\u1EC9 ph\u1EA3i ch\u00FA \u00FD \u1EDF b\u00EAn tr\u00E1i khi qu\u1EB9o ph\u1EA3i")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(370);
	    	
	    	q.setName("1.4.40-001");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-001.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern","Gi\u1EA3m t\u1ED1c \u0111\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremsbereit sein","S\u1EB5n s\u00E0ng phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur den von rechts kommenden Verkehr beobachten","Ch\u1EC9 ch\u00FA \u00FD xe \u0111\u1EBFn t\u1EEB b\u00EAn ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(371);
	    	
	    	q.setName("1.4.40-002");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei diesem Verkehrszeichen ber\u00FCcksichtigen?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-002.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Bremsweg ist im Gef\u00E4lle l\u00E4nger als in der Ebene","Kho\u1EA3ng c\u00E1ch phanh \u1EDF \u0111\u01B0\u1EDDng d\u1ED1c d\u00E0i h\u01A1n \u1EDF \u0111\u01B0\u1EDDng b\u1EB1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei l\u00E4ngerer Bet\u00E4tigung der Bremse kann die Bremswirkung\nnachlassen","Nh\u1EA5n nhanh l\u00E2u c\u00F3 th\u1EC3 l\u00E0m gi\u1EA3m hi\u1EC7u qu\u1EA3 phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Bremswirkung wird besser, wenn kein Getriebegang eingelegt ist","Hi\u1EC7u qu\u1EA3 phanh s\u1EBD t\u1ED1t h\u01A1n, khi kh\u00F4ng c\u00F3 \u0111\u1EC3 s\u1ED1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(372);
	    	
	    	q.setName("1.4.40-004");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-004.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dem Gegenverkehr Vorrang einr\u00E4umen","Nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn cho xe ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei zwei Fahrstreifen f\u00FCr eine Richtung das Rei\u00DFverschlussverfahren\nanwenden","\u1EDE c\u1EA3 hai l\u00E0n \u0111\u01B0\u1EDDng c\u1EE7a c\u00F9ng m\u1ED9t h\u01B0\u1EDBng, s\u1EED d\u1EE5ng Rei\u00DFverschlussverfahren")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Sie bei zwei Fahrstreifen f\u00FCr eine Richtung auf dem linken\nfahren, haben Sie absoluten Vorrang","Khi b\u1EA1n \u0111i tr\u00EAn \u0111\u01B0\u1EDDng hai l\u00E0n c\u1EE7a c\u00F9ng m\u1ED9t h\u01B0\u1EDBng, b\u1EA1n lu\u00F4n c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(373);
	    	
	    	q.setName("1.4.40-005");

			q.setText(new TranslatedString("Sie sehen dieses Verkehrszeichen. Womit m\u00FCssen Sie rechnen?","Khi th\u1EA5y bi\u1EC3n b\u00E1o n\u00E0y, b\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-005.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Gegenverkehr","Ch\u00FA \u00FD xe ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Blendung durch den Gegenverkehr bei Nacht","V\u00E0o ban \u0111\u00EAm s\u1EBD kh\u00F4ng/kh\u00F3 nh\u00ECn th\u1EA5y xe ng\u01B0\u1EE3c chi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Vorrang des Gegenverkehrs","Ch\u00FA \u00FD quy\u1EC1n \u01B0u ti\u00EAn thu\u1ED9c v\u1EC1 xe ng\u01B0\u1EE3c chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(374);
	    	
	    	q.setName("1.4.40-006");

			q.setText(new TranslatedString("Welches Verhalten verlangt dieses Verkehrszeichen von Ihnen?","B\u1EA1n \u0111\u01B0\u1EE3c y\u00EAu c\u1EA7u ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-006.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("H\u00F6chste Aufmerksamkeit","T\u1EADp trung cao \u0111\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremsbereitschaft","S\u1EB5n s\u00E0ng phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern","Gi\u1EA3m t\u1ED1c \u0111\u1ED9")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(375);
	    	
	    	q.setName("1.4.40-007");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie bei diesem Verkehrszeichen rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn t\u00ECnh hu\u1ED1ng n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-007.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Radfahrern, welche die Fahrbahn kreuzen","C\u00F3 xe \u0111\u1EA1p b\u0103ng qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit einer Unterf\u00FChrung f\u00FCr Radfahrer","C\u00F3 \u0111\u01B0\u1EDDng h\u1EA7m b\u0103ng qua \u0111\u01B0\u1EDDng d\u00E0nh cho xe \u0111\u1EA1p")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit einem Verkehrsverbot f\u00FCr Radfahrer","C\u1EA5m xe \u0111\u1EA1p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(376);
	    	
	    	q.setName("1.4.40-101");

			q.setText(new TranslatedString("Sie fahren au\u00DFerorts an diesem Verkehrszeichen vorbei. In welcher \nEntfernung ist die Gefahrstelle zu erwarten?","B\u1EA1n \u0111i ngo\u00E0i th\u00E0nh ph\u1ED1 v\u00E0 g\u1EB7p bi\u1EC3n n\u00E0y. Kho\u1EA3ng c\u00E1ch bao xa s\u1EBD \u0111\u1EBFn \u0111i\u1EC3m nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-101.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zwischen 150 m und 250 m","T\u1EEB 150 m \u0111\u1EBFn 250 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zwischen 50 m und 150 m","T\u1EEB 50 m \u0111\u1EBFn 150 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zwischen 250 m und 350 m","T\u1EEB 250 m \u0111\u1EBFn 350 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(377);
	    	
	    	q.setName("1.4.40-102");

			q.setText(new TranslatedString("Was haben Sie bei diesen Verkehrszeichen zu beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-102.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen mit schlechtem Fahrbahnrand rechnen","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn tr\u01B0\u1EDDng h\u1EE3p s\u1EBD g\u1EB7p l\u00E0n \u0111\u01B0\u1EDDng x\u1EA5u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie m\u00FCssen \u00E4u\u00DFerst rechts fahren","B\u1EA1n ph\u1EA3i \u0111i h\u1EBFt v\u1EC1 b\u00EAn ph\u1EA3i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen auf dem angrenzenden Gehweg parken","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu tr\u00EAn \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9 b\u00EAn c\u1EA1nh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(378);
	    	
	    	q.setName("1.4.40-103");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich bei diesen Verkehrszeichen einstellen? \nDarauf, dass","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-103.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 auf der Fahrbahn Wintersport betrieben wird","C\u00F3 ng\u01B0\u1EDDi ch\u01A1i th\u1EC3 thao m\u00F9a \u0111\u00F4ng tr\u00EAn \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 auf der Fahrbahn Schnee- oder Eisgl\u00E4tte herrscht","Tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 tuy\u1EBFt hay \u0111\u00E1 tr\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 Wintersport nur auf den Gehwegen stattfindet","C\u00E1c tr\u00F2 th\u1EC3 thao m\u00F9a \u0111\u00F4ng ch\u1EC9 c\u00F3 tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(379);
	    	
	    	q.setName("1.4.40-104");

			q.setText(new TranslatedString("Was sagt Ihnen dieses Verkehrszeichen? \nEs kommt","Bi\u1EC3n n\u00E0y n\u00F3i cho b\u1EA1n bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-104.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 eine scharfe Rechtskurve","C\u00F3 kh\u00FAc cua ph\u1EA3i g\u1EA5p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 eine starke Steigung","C\u00F3 \u0111\u01B0\u1EDDng r\u1EA5t d\u1ED1c")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 eine Kreuzung mit abknickender Vorfahrt","\u1EDE ng\u00E3 t\u01B0 m\u00E0 xe qu\u1EB9o tr\u00E1i/ph\u1EA3i c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(380);
	    	
	    	q.setName("1.4.40-105");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-105.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern","Gi\u1EA3m t\u1ED1c \u0111\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("m\u00F6glichst weit rechts fahren","C\u00E0ng \u0111i xa b\u00EAn ph\u1EA3i c\u00E0ng t\u1ED1t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Gleich nach der Rechtskurve kr\u00E4ftig beschleunigen","Ngay sau kh\u00FAc cua b\u00EAn ph\u1EA3i, b\u1EA1n t\u0103ng t\u1ED1c nhi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(381);
	    	
	    	q.setName("1.4.40-106");

			q.setText(new TranslatedString("Was kommt nach diesen Verkehrszeichen?","\u0110i\u1EC1u g\u00EC s\u1EBD c\u00F3 sau bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-106.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ein Gef\u00E4lle von 800 m L\u00E4nge","C\u00F3 \u0111o\u1EA1n d\u1ED1c xu\u1ED1ng d\u00E0i 800m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Eine Steigung in 800 m Entfernung","C\u00F2n 800m l\u00E0 \u0111\u1EBFn \u0111o\u1EA1n d\u1ED1c l\u00EAn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ein Gef\u00E4lle in 800 m Entfernung","C\u00F2n 800m l\u00E0 \u0111\u1EBFn \u0111o\u1EA1n d\u1ED1c xu\u1ED1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(382);
	    	
	    	q.setName("1.4.40-107");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-107.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("N\u00F6tigenfalls herunterschalten","Gi\u1EA3m s\u1ED1 khi c\u1EA7n thi\u1EBFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Heraufschalten, um die Geschwindigkeit beizubehalten","Gi\u1EA3m s, um die Geschwindigkeit beizubehalten")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bremsen, damit in diesem Gef\u00E4lle die Geschwindigkeit nicht zu hoch\nwird","Bremsen, damit in diesem Gef\u00E4lle die Geschwindigkeit nicht zu hoch\nwird")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(383);
	    	
	    	q.setName("1.4.40-108");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, wenn Sie sich diesem Verkehrszeichen \nn\u00E4hern?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi \u0111i g\u1EA7n bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-108.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit verringern","Gi\u1EA3m t\u1ED1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Geschwindigkeit erh\u00F6hen","T\u0103ng t\u1ED1c")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch schnelle Lenkbewegungen den Unebenheiten ausweichen","L\u1EAFc tay l\u00E1i nhanh \u0111\u1EC3 tr\u00E1nh nh\u1EEFng ch\u1ED7 kh\u00F4ng b\u1EB1ng ph\u1EB3ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(384);
	    	
	    	q.setName("1.4.40-109");

			q.setText(new TranslatedString("Welche Gefahren k\u00F6nnen sich durch Nichtbeachten dieses \nVerkehrszeichens ergeben?","Nguy hi\u1EC3m n\u00E0o c\u00F3 th\u1EC3 x\u1EA3y ra khi b\u1EA1n kh\u00F4ng ch\u00FA \u00FD bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-109.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug k\u00F6nnte schleudern und den Gegenverkehr gef\u00E4hrden","C\u00F3 th\u1EC3 b\u1ECB l\u1EA1ng xe v\u00E0 g\u00E2y nguy hi\u1EC3m cho xe ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug k\u00F6nnte einen Achs- oder Federbruch erleiden","C\u00F3 th\u1EC3 b\u1ECB g\u00E3y tr\u1EE5c ho\u1EB7c phu\u1ED9c nh\u00FAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Ladung k\u00F6nnte besch\u00E4digt werden","T\u1EA3i c\u00F3 th\u1EC3 b\u1ECB h\u1ECFng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(385);
	    	
	    	q.setName("1.4.40-110");

			q.setText(new TranslatedString("Wovor warnt dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y c\u1EA3nh b\u00E1o \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-110.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor unerwartetem Glatteis","B\u1EA5t ng\u1EDD g\u1EB7p \u0111\u01B0\u1EDDng \u0111\u00F4ng \u0111\u00E1")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor unerwarteter Schneegl\u00E4tte","B\u1EA5t ng\u1EDD g\u1EB7p \u0111\u01B0\u1EDDng ph\u1EE7 tuy\u1EBFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor unerwarteter Lawinengefahr","B\u1EA5t ng\u1EDD c\u00F3 tuy\u1EBFt l\u1EDF")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(386);
	    	
	    	q.setName("1.4.40-111");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-111.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langsam fahren bei Gl\u00E4ttegefahr","\u0110i ch\u1EADm tr\u00E1nh nguy hi\u1EC3m do \u0111\u01B0\u1EDDng tr\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ruckartige Lenkbewegungen bei Glatteis vermeiden","Gi\u1EA3m thi\u1EC3u vi\u1EC7c xoay tay l\u00E1i tr\u00EAn \u0111\u01B0\u1EDDng tr\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Abstand zum Vorausfahrenden sofort verringern","Gi\u1EA3m kho\u1EA3ng c\u00E1ch an to\u00E0n v\u1EDBi xe \u0111i tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(387);
	    	
	    	q.setName("1.4.40-112");

			q.setText(new TranslatedString("Wovor warnt dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y c\u1EA3nh b\u00E1o \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-112.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor Schleudergefahr bei verschmutzter Fahrbahn","Nguy c\u01A1 tr\u01B0\u1EE3t xe do \u0111\u01B0\u1EDDng b\u1EA9n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor Schleudergefahr bei nasser Fahrbahn","Nguy c\u01A1 tr\u01B0\u1EE3t xe do \u0111\u01B0\u1EDDng \u01B0\u1EDBt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor alkoholisierten Autofahrern","C\u00F3 ng\u01B0\u1EDDi l\u00E1i xe say r\u01B0\u1EE3u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(388);
	    	
	    	q.setName("1.4.40-113");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei einer so gekennzeichneten Gefahrstelle \nvermeiden?","G\u1EB7p bi\u1EC3n n\u00E0y, b\u1EA1n ph\u1EA3i tr\u00E1nh l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-113.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Starkes Beschleunigen","T\u0103ng t\u1ED1c nhi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Pl\u00F6tzliche Lenkbewegungen","\u0110\u1ED9t ng\u1ED9t xoay tai l\u00E1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geringen Abstand zum vorausfahrenden Fahrzeug","Kho\u1EA3ng c\u00E1ch an to\u00E0n ng\u1EAFn v\u1EDBi xe \u0111i tr\u01B0\u1EDBc")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(389);
	    	
	    	q.setName("1.4.40-114");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-114.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit verringern","Gi\u1EA3m t\u1ED1c \u0111\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nicht mehr \u00FCberholen","Kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor Erreichen der Verengung immer anhalten","Lu\u00F4n d\u1EEBng l\u1EA1i tr\u01B0\u1EDBc khi v\u00E0o \u0111o\u1EA1n \u0111\u01B0\u1EDDng h\u1EB9p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(390);
	    	
	    	q.setName("1.4.40-115");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie bei diesen Verkehrszeichen rechnen?","G\u1EB7p bi\u1EC3n n\u00E0y b\u1EA1n t\u00EDnh th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-115.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einer verengten Fahrbahn in etwa 50 m Entfernung","Kho\u1EA3ng 50 m n\u1EEFa s\u1EBD c\u00F3 \u0111\u01B0\u1EDDng h\u1EB9p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit einer verengten Fahrbahn von 50 m L\u00E4nge","C\u00F3 \u0111\u01B0\u1EDDng h\u1EB9p d\u00E0i 50m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit einer Ausweichstelle in 50 m Entfernung","Kho\u1EA3ng 50 m n\u1EEFa s\u1EBD c\u00F3 \u0111o\u1EA1n \u0111\u01B0\u1EDDng m\u1EDF r\u1ED9ng \u0111\u1EC3 v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-116
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(391);
	    	
	    	q.setName("1.4.40-116");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie bei diesem Verkehrszeichen rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn t\u00ECnh hu\u1ED1ng n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-116.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Verkehr von Baustellenfahrzeugen","Ch\u00FA \u00FD xe c\u00F4ng tr\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Arbeitern auf der Fahrbahn","Ch\u00FA \u00FD c\u00F4ng nh\u00E2n tr\u00EAn \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Baumaterial auf der Fahrbahn","Ch\u00FA \u00FD v\u1EADt li\u1EC7u x\u00E2y d\u1EF1ng tr\u00EAn \u0111\u01B0\u1EDDng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-117
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(392);
	    	
	    	q.setName("1.4.40-117");

			q.setText(new TranslatedString("Was erwartet Sie bei diesen Verkehrszeichen?","Khi g\u1EB7p bi\u1EC3n n\u00E0y, b\u1EA1n s\u1EBD g\u1EB7p g\u00EC ti\u1EBFp theo?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-117.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine Baustelle, die in etwa 100 m Entfernung beginnt","Kho\u1EA3ng 100m n\u1EEFa s\u1EBD c\u00F3 c\u00F4ng tr\u01B0\u1EDDng x\u00E2y d\u1EF1ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Eine Baustelle, die nach 100 m endet","100m n\u1EEFa l\u00E0 \u0111i qua c\u00F4ng tr\u01B0\u1EDDng x\u00E2y d\u1EF1ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Eine Baustelle, die eine L\u00E4nge von 100 m hat","C\u00F3 c\u00F4ng tr\u01B0\u1EDDng x\u00E2y d\u1EF1ng d\u00E0i 100m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(393);
	    	
	    	q.setName("1.4.40-118");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie bei diesem Verkehrszeichen rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn t\u00ECnh hu\u1ED1ng n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-118.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einem Stau","C\u00F3 k\u1EB9t xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit pl\u00F6tzlichem Bremsen der Vorausfahrenden","Xe \u0111i tr\u01B0\u1EDBc \u0111\u1ED9t ng\u1ED9t phanh l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Erweiterung der Fahrbahn auf drei Fahrstreifen","\u0110\u01B0\u1EDDng m\u1EDF r\u1ED9ng th\u00E0nh 3 l\u00E0n xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-119
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(394);
	    	
	    	q.setName("1.4.40-119");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-119.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beobachten, ob die Br\u00FCcke befahrbar ist","Ch\u00FA \u00FD xem c\u1EA7u c\u00F3 m\u1EDF cho xe qua kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anhalten, wenn die Br\u00FCcke ausgeschwenkt ist","D\u1EEBng l\u1EA1i, khi c\u1EA7u \u0111\u01B0\u1EE3c n\u00E2ng l\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, wenn sich kein Zug n\u00E4hert","\u0110i ti\u1EBFp, khi kh\u00F4ng c\u00F3 t\u00E0u \u1EDF g\u1EA7n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-120
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(395);
	    	
	    	q.setName("1.4.40-120");

			q.setText(new TranslatedString("Was haben Sie bei diesem Verkehrszeichen zu beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-120.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Stra\u00DFe f\u00FChrt auf ein Ufer zu","\u0110\u01B0\u1EDDng \u0111i tr\u00EAn b\u1EDD s\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Dunkelheit oder schlechter Sicht kann Verwechslungsgefahr\nzwischen Wasseroberfl\u00E4che und Fahrbahn bestehen","Khi tr\u1EDDi t\u1ED1i ho\u1EB7c t\u1EA7m nh\u00ECn k\u00E9m c\u00F3 th\u1EC3 g\u00E2y nguy hi\u1EC3m do nh\u1EA7m l\u1EABn gi\u1EEFa m\u1EB7t \u0111\u01B0\u1EDDng v\u00E0 m\u1EB7t n\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Ein- und Ausfahrstelle f\u00FCr schwimmf\u00E4hige Fahrzeuge ist\nfreizuhalten","\u0110\u1EC3 \u0111\u01B0\u1EDDng tr\u1ED1ng cho xe l\u1ED9i n\u01B0\u1EDBc l\u00EAn xu\u1ED1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-121
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(396);
	    	
	    	q.setName("1.4.40-121");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-121.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine Ampel","C\u00F3 \u0111\u00E8n xanh \u0111\u00E8n \u0111\u1ECF")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Zollstelle","C\u00F3 v\u0103n ph\u00F2ng kh\u00E1ch h\u00E0ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen Bahn\u00FCbergang mit rotem Blinklicht","C\u00F3 t\u00E0u ch\u1EA1y qua \u0111\u01B0\u1EDDng khi \u0111\u00E8n \u0111\u1ECF nh\u00E1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-122
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(397);
	    	
	    	q.setName("1.4.40-122");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-122.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Fu\u00DFg\u00E4nger\u00FCberweg","C\u00F3 v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Unterf\u00FChrung f\u00FCr Fu\u00DFg\u00E4nger","C\u00F3 \u0111\u01B0\u1EDDng h\u1EA7m qua \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Haltestelle f\u00FCr Schulbusse","C\u00F3 tr\u1EA1m d\u1EEBng xe bus")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-123
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(398);
	    	
	    	q.setName("1.4.40-123");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie bei diesem Verkehrszeichen rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn t\u00ECnh hu\u1ED1ng n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-123.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit stark verschmutzter Fahrbahn","\u0110\u01B0\u1EDDng r\u1EA5t b\u1EA9n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Weidetieren auf der Fahrbahn","C\u00F3 tr\u00E2u b\u00F2 tr\u00EAn \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Wildwechsel","C\u00F3 th\u00FA r\u1EEBng qua \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-124
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(399);
	    	
	    	q.setName("1.4.40-124");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie bei diesem Verkehrszeichen rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn t\u00ECnh hu\u1ED1ng n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-124.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit pl\u00F6tzlich auftretendem Flugl\u00E4rm","\u0110\u1ED9t nhi\u00EAn c\u00F3 ti\u1EBFng \u1ED3n c\u1EE7a m\u00E1y bay")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit der Ablenkung anderer Verkehrsteilnehmer","Ng\u01B0\u1EDDi tham gia giao th\u00F4ng kh\u00E1c b\u1ECB ph\u00E2n t\u00E1n t\u01B0 t\u01B0\u1EDFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit einer Ein- oder Ausfahrt zum Flugplatz","C\u00F3 \u0111\u01B0\u1EDDng v\u00E0o/ra s\u00E2n bay")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-125
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(400);
	    	
	    	q.setName("1.4.40-125");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-125.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen beschrankten Bahn\u00FCbergang","C\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua v\u00E0 c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen unbeschrankten Bahn\u00FCbergang","C\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua nh\u01B0ng kh\u00F4ng c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen Bauzaun, der die Fahrbahn einengt","C\u00F3 h\u00E0ng r\u00E0o c\u1EA3n \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
