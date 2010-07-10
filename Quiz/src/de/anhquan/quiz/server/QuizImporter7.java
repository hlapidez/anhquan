package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter7 {

	static {
		
				
		//Question 2.2.17-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(701);
	    	
	    	q.setName("2.2.17-112");

			q.setText(new TranslatedString("Welche Beleuchtungseinrichtungen des Kraftfahrzeugs m\u00FCssen \nwiederholt werden, wenn sie z.B. durch Anbauger\u00E4te oder \nLadungstr\u00E4ger verdeckt werden?","Nh\u1EEFng \u0111i\u1EC1u ch\u1EC9nh n\u00E0o c\u1EE7a h\u1EC7 th\u1ED1ng chi\u1EBFu s\u00E1ng c\u1EA7n ph\u1EA3i \u0111\u01B0\u1EE3c thi\u1EBFt l\u1EADp l\u1EA1i sau khi \u0111\u00E8n b\u1ECB c\u00E1c b\u1ED9 ph\u1EADn g\u1EAFn th\u00EAm ho\u1EB7c h\u00E0ng h\u00F3a che khu\u1EA5t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Blinker und Bremsleuchten","\u0110\u00E8n xi-nhan v\u00E0 \u0111\u00E8n phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schlussleuchten, R\u00FCckstrahler und Kennzeichenbeleuchtung","\u0110\u00E8n h\u1EADu, k\u00EDnh ph\u1EA3n quang v\u00E0 \u0111\u00E8n bi\u1EC3n s\u1ED1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("R\u00FCckfahrscheinwerfer und Arbeitsscheinwerfer","\u0110\u00E8n d\u1EF1 ph\u00F2ng v\u00E0 \u0111\u00E8n l\u00E0m vi\u1EC7c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(702);
	    	
	    	q.setName("2.2.18-003");

			q.setText(new TranslatedString("Welche Richtgeschwindigkeit gilt f\u00FCr Pkw und Motorr\u00E4der auf \nAutobahnen? \n_____ km/h","T\u1ED1c \u0111\u1ED9 khuy\u1EBFn c\u00E1o \u00E1p d\u1EE5ng cho xe Pkw v\u00E0 xe m\u00F4-t\u00F4 2 b\u00E1nh tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn l\u00E0 bao nhi\u00EAu?\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n130 km/h "), new TranslatedString("\n\n\n130 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(703);
	    	
	    	q.setName("2.2.18-005");

			q.setText(new TranslatedString("Wie muss man sich bei einem Stau auf Autobahnen und \nKraftfahrstra\u00DFen mit zwei Fahrstreifen verhalten?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi b\u1ECB k\u1EB9t xe tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn v\u00E0 tr\u00EAn \u0111\u01B0\u1EDDng d\u00E0nh cho xe c\u01A1 gi\u1EDBi c\u00F3 2 l\u00E0n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rechtsfahrende m\u00FCssen \u00E4u\u00DFerst rechts, Linksfahrende \u00E4u\u00DFerst links\nheranfahren, so dass f\u00FCr Einsatzfahrzeuge eine freie Gasse entsteht","Xe \u0111i tr\u00EAn l\u00E0n ph\u1EA3i \u0111i s\u00E1t b\u00EAn ph\u1EA3i, xe \u0111i tr\u00EAn l\u00E0n tr\u00E1i \u0111i s\u00E1t b\u00EAn tr\u00E1i \u0111\u1EC3 ch\u1EEBa \u0111\u01B0\u1EDDng tr\u1ED1ng nh\u1ECF \u1EDF gi\u1EEFa d\u00E0nh cho xe c\u1EA3nh s\u00E1t/c\u1EE9u th\u01B0\u01A1ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Alle Fahrzeuge m\u00FCssen auf den rechten Seitenstreifen ausweichen","T\u1EA5t c\u1EA3 c\u00E1c xe ph\u1EA3i chuy\u1EC3n sang l\u00E0n ph\u1EA3i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die freie Gasse hinter den Einsatzfahrzeugen ausnutzen","T\u1EADn d\u1EE5ng \u0111\u01B0\u1EDDng tr\u1ED1ng ph\u00EDa sau xe c\u1EA3nh s\u00E1t/c\u1EE9u th\u01B0\u01A1ng \u0111\u1EC3 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(704);
	    	
	    	q.setName("2.2.18-006");

			q.setText(new TranslatedString("Sie n\u00E4hern sich auf dem linken von zwei Fahrstreifen einem \nFahrzeug, das gerade zum \u00DCberholen ausschert. Wie verhalten Sie \nsich?","B\u1EA1n \u0111\u1EBFn g\u1EA7n m\u1ED9t xe \u1EDF l\u00E0n \u0111\u01B0\u1EDDng th\u1EE9 hai ph\u00EDa b\u00EAn tr\u00E1i, xe \u0111\u00F3 v\u1EEBa l\u1EA1ng qua \u0111\u1EC3 v\u01B0\u1EE3t. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zum Vorausfahrenden ausreichenden Abstand einhalten","Gi\u1EEF \u0111\u1EE7 kho\u1EA3ng c\u00E1ch an to\u00E0n v\u1EDBi xe \u0111i tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Den Vorausfahrenden \u00FCberholen lassen","\u0110\u1EC3 xe \u0111i tr\u01B0\u1EDBc v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dichter auffahren, hupen und blinken","\u0110i g\u1EA7n, b\u1EA5m c\u00F2i v\u00E0 b\u1EADt \u0111\u00E8n nh\u00E1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(705);
	    	
	    	q.setName("2.2.18-007");

			q.setText(new TranslatedString("Sie fahren bei geringer Verkehrsdichte auf einer Autobahn. Wie \nlange d\u00FCrfen Sie den linken Fahrstreifen benutzen?","B\u1EA1n l\u00E1i xe tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c \u0111ang c\u00F3 nhi\u1EC1u xe san s\u00E1t. B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng l\u00E0n b\u00EAn tr\u00E1i bao l\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Solange es n\u00F6tig ist, um andere Fahrzeuge zu \u00FCberholen","\u0110\u1EE7 l\u00E2u \u0111\u1EC3 v\u01B0\u1EE3t xe kh\u00E1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Solange Sie hinter einem Fahrzeug fahren, das auf dem linken\nFahrstreifen \u00FCberholt","Khi b\u1EA1n \u0111i sau m\u1ED9t xe \u0111ang v\u01B0\u1EE3t tr\u00EAn l\u00E0n tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("St\u00E4ndig, solange kein anderes Fahrzeug Sie \u00FCberholen will","L\u00E2u, mi\u1EC5n l\u00E0 kh\u00F4ng c\u00F3 xe n\u00E0o mu\u1ED1n v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(706);
	    	
	    	q.setName("2.2.18-008");

			q.setText(new TranslatedString("Sie haben Ihre Autobahnausfahrt verpasst. Wie verhalten Sie sich?","B\u1EA1n \u0111i l\u1ED1 qua l\u1ED1i ra c\u1EE7a \u0111\u01B0\u1EDDng cao t\u1ED1c. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bis zur n\u00E4chsten Ausfahrt weiterfahren","\u0110i ti\u1EBFp \u0111\u1EBFn l\u1ED1i ra k\u1EBF ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf dem Seitenstreifen zur\u00FCckfahren","\u0110i ng\u01B0\u1EE3c l\u1EA1i \u1EDF ph\u00EDa l\u1EC1 \u0111\u01B0\u1EDDng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(707);
	    	
	    	q.setName("2.2.18-009");

			q.setText(new TranslatedString("Was gilt auf Kraftfahrstra\u00DFen?","\u0110i\u1EC1u g\u00EC \u00E1p d\u1EE5ng tr\u00EAn \u0111\u01B0\u1EDDng Kraftfahrstra\u00DFen ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenden verboten","C\u1EA5m quay \u0111\u1EA7u xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Einfahren nur an Kreuzungen und Einm\u00FCndungen","Ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i v\u00E0o \u1EDF ng\u00E3 t\u01B0 ho\u1EB7c giao l\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei Dunkelheit darf schneller gefahren werden, als es die Reichweite\ndes Abblendlichts zul\u00E4sst","V\u00E0o tr\u1EDDi t\u1ED1i, ch\u1EC9 \u0111\u01B0\u1EE3c ph\u00E9p \u0111i nhanh trong t\u1EA7m chi\u1EBFu s\u00E1ng c\u1EE7a \u0111\u00E8n g\u1EA7n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(708);
	    	
	    	q.setName("2.2.18-010");

			q.setText(new TranslatedString("Welche H\u00F6chstgeschwindigkeit muss in den Fahrzeugpapieren \neingetragen sein, um Autobahnen benutzen zu d\u00FCrfen? \nMehr als _____ km/h","T\u1ED1c \u0111\u1ED9 tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn \u0111\u01B0\u1EE3c ghi trong gi\u1EA5y t\u1EDD c\u1EE7a xe l\u00E0 bao nhi\u00EAu?\nL\u1EDBn h\u01A1n ___\n#Note:\n<ul>\n<li><strong>H\u00F6chstgeschwindigkeit</strong>: ()</li>\n</ul>\n#Hint:\nT\u1ED1c \u0111\u1ED9 n\u00E0y ch\u1EADm kh\u00F4ng ng\u1EDD \u0111\u1EA5y. kh\u00F4ng ph\u1EA3i l\u00E0 80 km/h, m\u00E0 l\u00E0 l\u1EDBn h\u01A1n 60 km/h"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\nMehr als 60 km/h "), new TranslatedString("\n\n\nMehr als 60 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-011
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(709);
	    	
	    	q.setName("2.2.18-011");

			q.setText(new TranslatedString("Auf einer Autobahn mit 3 Fahrstreifen hat sich ein Stau gebildet. \nWo ist die Gasse f\u00FCr Rettungsfahrzeuge zu bilden?","C\u00F3 k\u1EB9t xe tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn c\u00F3 3 l\u00E0n. L\u1ED1i \u0111i nh\u1ECF d\u00E0nh cho xe c\u1EA5p c\u1EE9u \u0111\u01B0\u1EE3c t\u1EA1o \u1EDF \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zwischen dem linken und dem mittleren Fahrstreifen","Gi\u1EEFa l\u00E0n tr\u00E1i v\u00E0 l\u00E0n gi\u1EEFa")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zwischen dem mittleren und dem rechten Fahrstreifen","Gi\u1EEFa l\u00E0n gi\u1EEFa v\u00E0 l\u00E0n ph\u1EA3i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf dem Seitenstreifen","Tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(710);
	    	
	    	q.setName("2.2.18-101");

			q.setText(new TranslatedString("Ihr Fahrzeug ist auf der Autobahn liegen geblieben. Was ist beim \nAbschleppen zu beachten?","Xe b\u1EA1n b\u1ECB d\u1EEBng tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn. Khi xe b\u1ECB k\u00E9o \u0111i ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Autobahn muss bei der n\u00E4chsten Ausfahrt verlassen werden","\u1EDE l\u1ED1i ra k\u1EBF ti\u1EBFp (Ausfahrt) ph\u1EA3i r\u1EDDi kh\u1ECFi \u0111\u01B0\u1EDDng cao t\u1ED1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("W\u00E4hrend des Abschleppens haben beide Fahrzeuge Warnblinklicht\neinzuschalten","Trong khi xe b\u1ECB k\u00E9o, c\u1EA3 hai xe ph\u1EA3i b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Autobahn darf bis zu der Ausfahrt befahren werden, die einer\ngeeigneten Werkstatt am n\u00E4chsten liegt","Die Autobahn darf bis zu der Ausfahrt befahren werden, die einer\ngeeigneten Werkstatt am n\u00E4chsten liegt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.18-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(711);
	    	
	    	q.setName("2.2.18-102");

			q.setText(new TranslatedString("Was gilt auf Autobahnen?","\u0110i\u1EC1u g\u00EC \u00E1p d\u1EE5ng tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Halten auf der Fahrbahn und auf dem Seitenstreifen verboten","C\u1EA5m d\u1EEBng tr\u00EAn l\u00F2ng \u0111\u01B0\u1EDDng v\u00E0 l\u1EC1 \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("R\u00FCckw\u00E4rtsfahren verboten","C\u1EA5m \u0111i l\u00F9i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei Dunkelheit darf unter keinen Umst\u00E4nden schneller gefahren\nwerden, als es die Reichweite des Abblendlichts zul\u00E4sst","V\u00E0o tr\u1EDDi t\u1ED1i c\u00F3 th\u1EC3 \u0111i nhanh kh\u00F4ng c\u00F3 \u0111i\u1EC1u ki\u1EC7n, mi\u1EC5n l\u00E0 t\u1EA7m nh\u00ECn n\u1EB1m trong gi\u1EDBi h\u1EA1n c\u1EE7a \u0111\u00E8n pha")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(712);
	    	
	    	q.setName("2.2.21-102");

			q.setText(new TranslatedString("Sie sind mit einem Lkw mit Anh\u00E4nger unterwegs und wollen \ngef\u00E4lligkeitshalber eine Person mitnehmen. Wo d\u00FCrfen Sie diese \nunterbringen?","B\u1EA1n \u0111ang l\u00E1i xe t\u1EA3i Lkw c\u00F3 k\u00E9o theo r\u01A1-mooc v\u00E0 mu\u1ED1n \u0111\u00F3n 1 ng\u01B0\u1EDDi n\u1EEFa \u0111i c\u00F9ng. B\u1EA1n \u0111\u01B0\u1EE3c ch\u1EDF ng\u01B0\u1EDDi \u0111\u00F3 \u1EDF \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Im F\u00FChrerhaus","Trong khoang l\u00E1i (cabin)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf der Ladefl\u00E4che des Lkw","Trong khoang h\u00E0ng c\u1EE7a xe t\u1EA3i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf der Ladefl\u00E4che des Anh\u00E4ngers","Trong khoang h\u00E0ng c\u1EE7a r\u01A1-mooc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(713);
	    	
	    	q.setName("2.2.21-103");

			q.setText(new TranslatedString("Wof\u00FCr m\u00FCssen Sie vor Antritt einer Fahrt mit Ihrem Pkw sorgen?","Tr\u01B0\u1EDBc khi kh\u1EDFi h\u00E0nh b\u1EA1n ph\u1EA3i quan t\u00E2m \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass auch die Mitfahrer die vorhandenen Sicherheitsgurte anlegen\nk\u00F6nnen","Ng\u01B0\u1EDDi \u0111i c\u00F9ng c\u00F3 th\u1EC3 th\u1EAFt d\u00E2y an to\u00E0n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass Sie nach hinten ausreichende Sicht haben","C\u00F3 \u0111\u1EE7 t\u1EA7m nh\u00ECn ph\u00EDa sau")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass keine Gegenst\u00E4nde (z.B. Verbandkasten, Autoatlas,\nFotoapparat) lose auf der hinteren Ablage liegen","Kh\u00F4ng \u0111\u1ED3 v\u1EADt n\u00E0o nh\u01B0 h\u1ED9p c\u1EA5p c\u1EE9u, s\u00E1ch b\u1EA3n \u0111\u1ED3, m\u00E1y \u1EA3nh,... \u0111\u01B0\u1EE3c \u0111\u1EC3 tr\u00EAn b\u1EC7 sau h\u00E0ng gh\u1EBF sau")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(714);
	    	
	    	q.setName("2.2.21-104");

			q.setText(new TranslatedString("Wie d\u00FCrfen Sie in Ihrem Pkw ein Kleinkind mitnehmen?","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EDF theo tr\u1EBB em b\u1EB1ng xe Pkw nh\u01B0 th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In einer f\u00FCr das Kind geeigneten R\u00FCckhalteeinrichtung mit Pr\u00FCfzeichen","C\u00F3 d\u1EE5ng c\u1EE5 h\u1ED7 tr\u1EE3 tr\u1EBB em")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf dem Scho\u00DF einer erwachsenen Person","C\u00F3 ng\u01B0\u1EDDi l\u1EDBn Auf dem Scho\u00DF")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In einer Baby-Tragetasche auf den hinteren Sitzen","C\u00F3 gh\u1EBF tr\u1EBB em \u1EDF ch\u1ED7 ng\u1ED3i ph\u00EDa sau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(715);
	    	
	    	q.setName("2.2.21-105");

			q.setText(new TranslatedString("Wie d\u00FCrfen Sie in Ihrem Pkw ein f\u00FCnfj\u00E4hriges Kind mitnehmen?","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EDF theo 1 \u0111\u1EE9a tr\u1EBB 5 tu\u1ED5i tr\u00EAn xe Pkw nh\u01B0 th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In einem f\u00FCr das Kind geeigneten Kindersitz mit Pr\u00FCfzeichen","C\u00F3 gh\u1EBF ng\u1ED3i th\u00EDch h\u1EE3p, gh\u1EBF c\u00F3 tem ch\u1EE9ng nh\u1EADn ch\u1EA5t l\u01B0\u1EE3ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einem hinteren Sitz mit serienm\u00E4\u00DFigem Dreipunktgurt","Gh\u1EBF ng\u1ED3i sau c\u00F3 d\u00E2y an to\u00E0n 3 \u0111i\u1EC3m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf der hinteren Sitzbank mit angelegtem Beckengurt","B\u0103ng gh\u1EBF sau c\u00F3 \u0111ai th\u1EAFt h\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(716);
	    	
	    	q.setName("2.2.21-106");

			q.setText(new TranslatedString("Wie d\u00FCrfen Sie in Ihrem Pkw ein elfj\u00E4hriges Kind von 140 cm Gr\u00F6\u00DFe \nmitnehmen?","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EDF theo 1 \u0111\u1EE9a tr\u1EBB 11 tu\u1ED5i cao 140 cm tr\u00EAn xe Pkw nh\u01B0 th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einer Sitzerh\u00F6hung mit Pr\u00FCfzeichen und mit angelegtem\nDreipunktgurt","C\u00F3 l\u00F3t gh\u1EBF (\u0111\u01B0\u1EE3c ch\u1EE9ng nh\u1EADn ch\u1EA5t l\u01B0\u1EE3ng) v\u00E0 c\u00F3 \u0111ai an to\u00E0n 3 \u0111i\u1EC3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit angelegtem Dreipunktgurt","C\u00F3 \u0111ai an to\u00E0n 3 \u0111i\u1EC3m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf der hinteren Sitzbank mit angelegtem Beckengurt","B\u0103ng gh\u1EBF sau c\u00F3 \u0111ai th\u1EAFt h\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(717);
	    	
	    	q.setName("2.2.21-107");

			q.setText(new TranslatedString("Was ist bei der Verwendung eines Kindersitzes mit Pr\u00FCfzeichen zu \nbeachten?","Khi d\u00F9ng gh\u1EBF ng\u1ED3i cho tr\u1EBB c\u00F3 tem ki\u1EC3m tra ch\u1EA5t l\u01B0\u1EE3ng, b\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Kindersitz muss f\u00FCr die Gr\u00F6\u00DFe und das Gewicht des Kindes\ngeeignet sein","Gh\u1EBF ng\u1ED3i cho tr\u1EBB ph\u1EA3i ph\u00F9 h\u1EE3p v\u1EDBi tr\u1ECDng l\u01B0\u1EE3ng v\u00E0 \u0111\u1ED9 l\u1EDBn c\u1EE7a tr\u1EBB")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Kindersitz muss f\u00FCr die Anbringung auf dem vorgesehenen\nFahrzeugsitz geeignet sein","Gh\u1EBF ng\u1ED3i cho tr\u1EBB ph\u1EA3i g\u1EAFn v\u1EEBa v\u1EDBi gh\u1EBF ng\u1ED3i c\u00F3 s\u1EB5n trong xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Au\u00DFer dem Pr\u00FCfzeichen ist nichts weiter zu beachten","Ngo\u00E0i tem ki\u1EC3m tra ch\u1EA5t l\u01B0\u1EE3ng, b\u1EA1n kh\u00F4ng c\u1EA7n ch\u00FA \u00FD g\u00EC kh\u00E1c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(718);
	    	
	    	q.setName("2.2.21-108");

			q.setText(new TranslatedString("Warum ist es gef\u00E4hrlich, Sicherheitsgurte nicht anzulegen?","T\u1EA1i sao kh\u00F4ng th\u1EAFt d\u00E2y an to\u00E0n th\u00EC nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil man sich schon bei einer Aufprallgeschwindigkeit von ca. 20\nkm/h nicht mehr ausreichend abst\u00FCtzen kann","V\u00EC ch\u1EC9 c\u1EA7n v\u1EADn t\u1ED1c va ch\u1EA1m kho\u1EA3ng 20 km/h th\u00EC \u0111\u00E3 kh\u00F4ng k\u1ECBp gi\u1EEF c\u01A1 th\u1EC3 ng\u1ED3i y\u00EAn \u0111\u01B0\u1EE3c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil man bei einem Unfall aus dem Fahrzeug geschleudert werden\nkann","V\u00EC ng\u01B0\u1EDDi c\u00F3 th\u1EC3 b\u1ECB v\u0103ng ra kh\u1ECFi xe khi b\u1ECB tai n\u1EA1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Im Stadtverkehr ist es wegen der geringen Geschwindigkeit\nungef\u00E4hrlich","Trong th\u00E0nh ph\u1ED1 kh\u00F4ng nguy hi\u1EC3m do t\u1ED1c \u0111\u1ED9 ch\u1EADm")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(719);
	    	
	    	q.setName("2.2.21-109");

			q.setText(new TranslatedString("Warum ist es gef\u00E4hrlich, wenn Personen auf den hinteren Sitzen die \nSicherheitsgurte nicht benutzen?","T\u1EA1i sao l\u1EA1i nguy hi\u1EC3m khi ng\u01B0\u1EDDi ng\u1ED3i sau kh\u00F4ng th\u1EAFt d\u00E2y an to\u00E0n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil schon bei niedriger Geschwindigkeit die R\u00FCckenlehnen der\nVordersitze nicht mehr ausreichend vor Verletzungen sch\u00FCtzen","V\u00EC ngay \u1EDF t\u1ED1c \u0111\u1ED9 th\u1EA5p, m\u1EB7t sau c\u1EE7a gh\u1EBF tr\u01B0\u1EDBc c\u0169ng kh\u00F4ng \u0111\u1EE7 \u0111\u1EC3 b\u1EA3o v\u1EC7 cho b\u1EA1n kh\u1ECFi b\u1ECB th\u01B0\u01A1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil sie bei einem Aufprall Fahrer und Beifahrer zus\u00E4tzlich gef\u00E4hrden","V\u00EC khi c\u00F3 va ch\u1EA1m th\u00EC c\u1EA3 l\u00E1i xe v\u00E0 ng\u01B0\u1EDDi \u0111i c\u00F9ng \u0111\u1EC1u b\u1ECB nguy hi\u1EC3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil dann die Schutzwirkung des Airbags wegf\u00E4llt","V\u00EC m\u1EA5t t\u00E1c d\u1EE5ng b\u1EA3o v\u1EC7 c\u1EE7a t\u00FAi kh\u00ED")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(720);
	    	
	    	q.setName("2.2.21-110");

			q.setText(new TranslatedString("Wann brauchen Sie den Sicherheitsgurt nicht anzulegen?","Khi n\u00E0o th\u00EC kh\u00F4ng c\u1EA7n d\u00F9ng d\u00E2y an to\u00E0n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Fahrten mit Schrittgeschwindigkeit","Khi l\u00E1i v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei Fahrten in \u201ETempo-30-Zonen\u201C","Khi l\u00E1i trong khu v\u1EF1c h\u1EA1n ch\u1EBF t\u1ED1c \u0111\u1ED9 \u201ETempo-30-Zonen\u201C (V\u00F9ng t\u1ED1c \u0111\u1ED9 30)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Au\u00DFerorts in einem Fahrzeug mit Airbag","\u1EDE ngo\u1EA1i \u00F4 trong khi c\u00F3 t\u00FAi kh\u00ED")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(721);
	    	
	    	q.setName("2.2.21-111");

			q.setText(new TranslatedString("Ab welcher Aufprallgeschwindigkeit m\u00FCssen Sie mit schweren oder \nt\u00F6dlichen Verletzungen rechnen, wenn Sie keinen Sicherheitsgurt \nangelegt haben?","Khi kh\u00F4ng th\u1EAFt d\u00E2y an to\u00E0n, t\u1ED1c \u0111\u1ED9 va ch\u1EA1m n\u00E0o b\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn kh\u1EA3 n\u0103ng b\u1ECB th\u01B0\u01A1ng n\u1EB7ng ho\u1EB7c ch\u1EBFt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ab 30 km/h","T\u1EEB 30 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ab 50 km/h","T\u1EEB 50 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ab 80 km/h","T\u1EEB 80 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(722);
	    	
	    	q.setName("2.2.21-112");

			q.setText(new TranslatedString("Ein Pkw ist mit zwei Frontairbags ausger\u00FCstet. Auf welchen \nSitzpl\u00E4tzen m\u00FCssen Sicherheitsgurte angelegt werden?","M\u1ED9t xe Pkw \u0111\u01B0\u1EE3c trang b\u1ECB hai t\u00FAi kh\u00ED \u0111\u1EB1ng tr\u01B0\u1EDBc. Gh\u1EBF n\u00E0o ph\u1EA3i c\u00F3 d\u00E2y an to\u00E0n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf allen Sitzen","T\u1EA5t c\u1EA3 c\u00E1c gh\u1EBF")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nicht auf den Vordersitzen","Kh\u00F4ng trang b\u1ECB cho gh\u1EBF ng\u1ED3i ph\u00EDa tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur auf den Vordersitzen","Ch\u1EC9 trang b\u1ECB cho gh\u1EBF ng\u1ED3i ph\u00EDa tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(723);
	    	
	    	q.setName("2.2.21-113");

			q.setText(new TranslatedString("Was bedeutet dieser Warnhinweis? \nAuf einem so gekennzeichneten Beifahrerplatz mit betriebsbereitem","Decal c\u1EA3nh b\u00E1o n\u00E0y c\u00F3 ngh\u0129a g\u00EC?\nTr\u00EAn gh\u1EBF ng\u1ED3i c\u00F3 d\u00E1n decal n\u00E0y ..."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.2.21-113.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 darf kein Kindersitz entgegen der Fahrtrichtung angebracht werden","\u2013 kh\u00F4ng \u0111\u01B0\u1EE3c g\u1EAFn gh\u1EBF tr\u1EBB em ng\u01B0\u1EE3c v\u1EDBi h\u01B0\u1EDBng xe ch\u1EA1y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 darf ein Kindersitz nur in Fahrtrichtung angebracht werden","\u2013 \u0111\u01B0\u1EE3c g\u1EAFn gh\u1EBF tr\u1EBB em ch\u1EC9 theo h\u01B0\u1EDBng xe ch\u1EA1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 muss der Kindersitz in der dargestellten Weise angebracht werden","\u2013 ph\u1EA3i g\u1EAFn gh\u1EBF tr\u1EBB em theo h\u01B0\u1EDBng d\u1EABn \u0111\u01B0\u1EE3c minh h\u1ECDa")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(724);
	    	
	    	q.setName("2.2.21-114");

			q.setText(new TranslatedString("Sie wollen nach einem Kindergeburtstag mehrere kleine Kinder \nnach Hause bringen. Was ist bei der Bef\u00F6rderung in Ihrem Pkw zu \nbeachten?","Sau ti\u1EC7c sinh nh\u1EADt con, b\u1EA1n mu\u1ED1n ch\u1EDF th\u00EAm nhi\u1EC1u \u0111\u1EE9a tr\u1EBB kh\u00E1c v\u1EC1 nh\u00E0. \nKhi ch\u1EDF b\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Kinder sind mit den vorgeschriebenen R\u00FCckhalteeinrichtungen zu\nsichern","Tr\u1EBB ph\u1EA3i \u0111\u01B0\u1EE3c gi\u1EEF an to\u00E0n v\u1EDBi gh\u1EBF ng\u1ED3i an to\u00E0n d\u00E0nh ri\u00EAng cho tr\u1EBB")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("R\u00FCckhalteeinrichtungen f\u00FCr Kinder brauchen innerhalb geschlossener\nOrtschaften nicht benutzt zu werden","Gh\u1EBF ng\u1ED3i an to\u00E0n d\u00E0nh ri\u00EAng cho tr\u1EBB kh\u00F4ng c\u1EA7n thi\u1EBFt trong th\u00E0nh ph\u1ED1")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Anschnallen der Kinder mit den vorhandenen Sicherheitsgurten\nreicht","Th\u1EAFt d\u00E2y an to\u00E0n cho tr\u1EBB v\u1EDBi d\u00E2y an to\u00E0n g\u1EAFn s\u1EB5n l\u00E0 \u0111\u1EE7\nreicht")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(725);
	    	
	    	q.setName("2.2.21-115");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie achten, wenn Sie ein Fahrzeug mit \nBeifahrer-Airbag fahren wollen?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC, khi b\u1EA1n mu\u1ED1n l\u00E1i xe c\u00F3 t\u00FAi kh\u00ED \u1EDF gh\u1EBF ng\u1ED3i cho ng\u01B0\u1EDDi \u0111i c\u00F9ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine nach hinten gerichtete R\u00FCckhalteeinrichtung f\u00FCr Kinder darf auf\ndem Beifahrersitz nicht angebracht werden","Kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p g\u1EAFn gh\u1EBF tr\u1EBB em ng\u01B0\u1EE3c v\u1EC1 ph\u00EDa sau tr\u00EAn gh\u1EBF ng\u1ED3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf dem Beifahrersitz darf eine nach vorn gerichtete\nR\u00FCckhalteeinrichtung f\u00FCr Kinder angebracht werden","Tr\u00EAn gh\u1EBF ng\u1ED3i \u0111\u01B0\u1EE3c ph\u00E9p g\u1EAFn gh\u1EBF tr\u1EBB em h\u01B0\u1EDBng v\u1EC1 ph\u00EDa tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf dem Beifahrersitz darf eine nach hinten gerichtete\nR\u00FCckhalteeinrichtung f\u00FCr Kinder angebracht werden","Tr\u00EAn gh\u1EBF ng\u1ED3i \u0111\u01B0\u1EE3c ph\u00E9p g\u1EAFn gh\u1EBF tr\u1EBB em h\u01B0\u1EDBng v\u1EC1 ph\u00EDa sau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-116
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(726);
	    	
	    	q.setName("2.2.21-116");

			q.setText(new TranslatedString("Ihr Fahrzeug hat auf den R\u00FCcksitzen keine Kopfst\u00FCtzen. Was kann \ngeschehen, wenn Sie dort Personen mitnehmen?","Gh\u1EBF sau c\u1EE7a xe b\u1EA1n kh\u00F4ng c\u00F3 \u0111\u1EC7m k\u00EA \u0111\u1EA7u. \u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 x\u1EA3y ra khi b\u1EA1n ch\u1EDF th\u00EAm ng\u01B0\u1EDDi?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei einem Heckaufprall erh\u00F6ht sich das Verletzungsrisiko f\u00FCr diese\nPersonen","Khi tai n\u1EA1n \u1EDF ph\u00EDa sau s\u1EBD t\u0103ng cao nguy c\u01A1 b\u1ECB th\u01B0\u01A1ng cho ng\u01B0\u1EDDi \u0111i c\u00F9ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es besteht kein erh\u00F6htes Verletzungsrisiko","Kh\u00F4ng n\u00E2ng cao nguy c\u01A1 b\u1ECB th\u01B0\u01A1ng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-117
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(727);
	    	
	    	q.setName("2.2.21-117");

			q.setText(new TranslatedString("Was ist bei Kopfst\u00FCtzen zu beachten?","Ph\u1EA3i ch\u00FA \u00FD g\u00EC v\u1EC1 mi\u1EBFng \u0111\u1EC7m k\u00EA \u0111\u1EA7u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie sind nach der Kopfh\u00F6he entsprechend der Betriebsanleitung\neinzustellen","G\u1EAFn mi\u1EBFng k\u00EA \u0111\u1EA7u ph\u00F9 h\u1EE3p v\u1EDBi h\u01B0\u1EDBng d\u1EABn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie werden werksseitig optimal eingestellt","Mi\u1EBFng k\u00EA \u0111\u1EA7u \u0111\u00E3 \u0111\u01B0\u1EE3c thi\u1EBFt l\u1EADp t\u1ED1i \u01B0u t\u1EEB x\u01B0\u1EDFng s\u1EA3n xu\u1EA5t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf den R\u00FCcksitzen ersetzen sie den Sicherheitsgurt","\u1EDE gh\u1EBF ng\u1ED3i sau, mi\u1EBFng k\u00EA \u0111\u1EA7u thay cho d\u00E2y an to\u00E0n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(728);
	    	
	    	q.setName("2.2.21-118");

			q.setText(new TranslatedString("W\u00E4hrend der Fahrt leuchtet die Airbagkontrollleuchte st\u00E4ndig. Was \nm\u00FCssen Sie tun?","Trong khi l\u00E1i, \u0111\u00E8n t\u00EDn hi\u1EC7u c\u1EE7a t\u00FAi kh\u00ED lu\u00F4n s\u00E1ng. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine Werkstatt aufsuchen","\u0110\u1EBFn x\u01B0\u1EDFng s\u1EEDa xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Fahrzeug sofort aus dem Stra\u00DFenverkehr entfernen","L\u1EADp t\u1EE9c \u0111\u01B0a xe r\u1EDDi kh\u1ECFi \u0111\u01B0\u1EDDng giao th\u00F4ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nichts, weil das ein Signal f\u00FCr die Werkstatt ist","Kh\u00F4ng l\u00E0m g\u00EC, v\u00EC \u0111\u00E8n \u0111\u00F3 d\u00E0nh cho x\u01B0\u1EDFng s\u1EEDa xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-119
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(729);
	    	
	    	q.setName("2.2.21-119");

			q.setText(new TranslatedString("Wie kann verhindert werden, dass ein Kind w\u00E4hrend der Fahrt die \nhintere T\u00FCr \u00F6ffnet?","L\u00E0m sao \u0111\u1EC3 tr\u00E1nh kh\u00F4ng cho tr\u1EBB m\u1EDF c\u1EEDa sau trong khi l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kindersicherung der hinteren T\u00FCren bet\u00E4tigen","Trang b\u1ECB ch\u1ED1t an to\u00E0n tr\u1EBB em \u1EDF c\u1EEDa sau")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("T\u00FCren fest schlie\u00DFen","\u0110\u00F3ng ch\u1EB7t c\u1EEDa")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.21-120
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(730);
	    	
	    	q.setName("2.2.21-120");

			q.setText(new TranslatedString("D\u00FCrfen Sie auf der Ladefl\u00E4che Ihres Lkw Personen bef\u00F6rdern?","B\u1EA1n c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EDF ng\u01B0\u1EDDi trong khoang ch\u1EDF h\u00E0ng c\u1EE7a xe t\u1EA3i Lkw kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, wenn diese dort notwendige Arbeiten auszuf\u00FChren haben","\u0110\u01B0\u1EE3c, n\u1EBFu ng\u01B0\u1EDDi \u0111\u00F3 c\u1EA7n ti\u1EBFn h\u00E0nh l\u00E0m c\u00F4ng vi\u1EC7c c\u1EA7n thi\u1EBFt \u1EDF \u0111\u00F3")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, wenn diese die Ladung begleiten m\u00FCssen","\u0110\u01B0\u1EE3c, n\u1EBFu h\u00E0nh l\u00FD ph\u1EA3i \u0111\u01B0\u1EE3c h\u1ED9 t\u1ED1ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, zum Sichern der Ladung","\u0110\u01B0\u1EE3c, \u0111\u1EC3 gi\u1EEF an to\u00E0n cho h\u00E0nh l\u00FD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(731);
	    	
	    	q.setName("2.2.22-101");

			q.setText(new TranslatedString("Welche Bedeutung haben wei\u00DFe Tafeln mit einem schwarzen \u201EA\u201C \nan einem Lkw? \nDer Lkw","B\u1EA3ng m\u00E0u tr\u1EAFng v\u1EDBi m\u1ED9t ch\u1EEF A m\u00E0u \u0111en tr\u00EAn xe Lkw c\u00F3 \u00FD ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 transportiert Abfall","Xe Lkw ch\u1EDF r\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 transportiert Gefahrgut","Xe Lkw ch\u1EDF h\u00E0ng nguy hi\u1EC3m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 wird von einem Anf\u00E4nger gefahren","Xe Lkw do ng\u01B0\u1EDDi m\u1EDBi bi\u1EBFt l\u00E1i \u0111i\u1EC1u khi\u1EC3n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(732);
	    	
	    	q.setName("2.2.22-102");

			q.setText(new TranslatedString("Was m\u00FCssen Sie ber\u00FCcksichtigen, wenn Sie auf dem Dach Ihres \nPkw Gep\u00E4ck bef\u00F6rdern wollen?","B\u1EA1n ph\u1EA3i d\u1EF1 t\u00EDnh \u0111i\u1EC1u g\u00EC khi ch\u1EDF h\u00E0nh l\u00FD tr\u00EAn n\u00F3c xe Pkw?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Fahreigenschaften werden nachteilig beeinflusst","T\u00EDnh ch\u1EA5t c\u1EE7a xe b\u1ECB \u1EA3nh h\u01B0\u1EDFng x\u1EA5u \u0111i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die zul\u00E4ssige Gesamtmasse darf nicht \u00FCberschritten werden","T\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t qu\u00E1 m\u1EE9c cho ph\u00E9p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die vom Fahrzeughersteller angegebene Dachlast (Betriebsanleitung)\ndarf nicht \u00FCberschritten werden","Kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t qu\u00E1 th\u00F4ng s\u1ED1 t\u1EA3i tr\u00EAn n\u00F3c theo qui \u0111\u1ECBnh c\u1EE7a nh\u00E0 s\u1EA3n xu\u1EA5t xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(733);
	    	
	    	q.setName("2.2.22-103");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich einstellen, wenn Sie auf dem Dach Ihres \nPkw Gep\u00E4ck bef\u00F6rdern?","B\u1EA1n ph\u1EA3i d\u1EF1 t\u00EDnh \u0111i\u1EC1u g\u00EC khi ch\u1EDF h\u00E0nh l\u00FD tr\u00EAn n\u00F3c xe Pkw?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass sich das Fahrzeug in Kurven st\u00E4rker neigt","Xe s\u1EBD b\u1ECB nghi\u00EAng nhi\u1EC1u h\u01A1n khi v\u00E0o cua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass die Seitenwindempfindlichkeit zunimmt","Xe s\u1EBD ph\u1EA3n \u1EE9ng nh\u1EA1y h\u01A1n khi c\u00F3 gi\u00F3 t\u1EA1t ngang")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dass das Fahrverhalten durch die erh\u00F6hte Schwerpunktlage\nverbessert wird","Ph\u1EA3n \u1EE9ng c\u1EE7a xe s\u1EBD t\u1ED1n h\u01A1n v\u00EC tr\u1ECDng t\u00E2m l\u1EDBn h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(734);
	    	
	    	q.setName("2.2.22-104");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, wenn Sie auf dem Dach Ihres Pkw Fahrr\u00E4der \nmitnehmen?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi ch\u1EDF theo xe \u0111\u1EA1p tr\u00EAn n\u00F3c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Haltevorrichtung und Fahrr\u00E4der sicher befestigen","Bu\u1ED9c ch\u1EB7t gi\u00E1 \u0111\u1EE1 v\u00E0 xe \u0111\u1EA1p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Hohe Geschwindigkeiten vermeiden","Tr\u00E1nh \u0111i t\u1ED1c \u0111\u1ED9 cao")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Befestigung regelm\u00E4\u00DFig kontrollieren","Th\u01B0\u1EDDng xuy\u00EAn ki\u1EC3m tra \u0111\u1ED9 ch\u1EAFc ch\u1EAFn")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(735);
	    	
	    	q.setName("2.2.22-105");

			q.setText(new TranslatedString("Was ist beim Transport von Fahrr\u00E4dern auf einem Hecktragesystem \nzu pr\u00FCfen?","Ph\u1EA3i ki\u1EC3m tra g\u00EC khi ch\u1EDF theo xe \u0111\u1EA1p b\u1EB1ng gi\u00E1 treo ph\u00EDa sau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ob das System nach Herstellerangaben f\u00FCr das Fahrzeug geeignet ist","H\u1EC7 th\u1ED1ng gi\u00E1 \u0111\u1EE1 c\u00F3 ph\u00F9 h\u1EE3p v\u1EDBi h\u01B0\u1EDBng d\u1EABn c\u1EE7a nh\u00E0 s\u1EA3n xu\u1EA5t xe kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ob das System und die Fahrr\u00E4der sicher befestigt sind","H\u1EC7 th\u1ED1ng gia \u0111\u1EE1 v\u00E0 xe c\u00F3 \u0111\u01B0\u1EE3c bu\u1ED9c ch\u1EB7t kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ob Beleuchtungseinrichtungen oder das Kennzeichen verdeckt\nwerden","H\u1EC7 th\u1ED1ng \u0111\u00E8n chi\u1EBFu ho\u1EB7c bi\u1EC3n b\u00E1o c\u00F3 b\u1ECB che kh\u00F4ng\nwerden")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(736);
	    	
	    	q.setName("2.2.22-106");

			q.setText(new TranslatedString("Sie wollen Urlaubsgep\u00E4ck auf dem Dach Ihres voll besetzten Pkw \nmitnehmen. Wodurch wird die Dachlast begrenzt?","B\u1EA1n mu\u1ED1n ch\u1EA5t h\u00E0nh l\u00FD \u0111i ngh\u1EC9 m\u00E1t tr\u00EAn n\u00F3c xe v\u00EC trong xe \u0111\u00E3 \u0111\u1EA7y. Gi\u1EDBi h\u1EA1n t\u1EA3i tr\u00EAn n\u00F3c \u0111\u1EBFn \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch die Angaben des Fahrzeugherstellers in der Betriebsanleitung","Theo th\u00F4ng s\u1ED1 k\u1EF9 thu\u1EADt c\u1EE7a nh\u00E0 s\u1EA3n xu\u1EA5t xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch die zul\u00E4ssige Gesamtmasse des Pkw","\u0110\u1EBFn t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p c\u1EE7a xe Pkw")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch die Angaben \u00FCber die Dachlast im Fahrzeugschein","\u0110\u1EBFn th\u00F4ng s\u1ED1 t\u1EA3i tr\u00EAn n\u00F3c ghi trong gi\u1EA5y \u0111\u0103ng k\u00FD xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(737);
	    	
	    	q.setName("2.2.22-107");

			q.setText(new TranslatedString("Was haben Sie zu beachten, wenn Sie Ladung transportieren \nwollen?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi mu\u1ED1n t\u1EA3i h\u00E0ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Ladung muss sicher befestigt sein und darf keinen vermeidbaren\nL\u00E4rm verursachen","T\u1EA3i ph\u1EA3i \u0111\u01B0\u1EE3c gi\u1EEF ch\u1EB7t ch\u1EBD v\u00E0 kh\u00F4ng g\u00E2y ti\u1EBFng \u1ED3n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Einzelne Gegenst\u00E4nde, z.B. Pf\u00E4hle, Stangen, waagerecht liegende\nPlatten, d\u00FCrfen seitlich \u00FCber den Umriss des Fahrzeuges hinausragen","M\u1ED9t v\u00E0i \u0111\u1ED3 v\u1EADt nh\u01B0 thanh, \u1ED1ng d\u00E0i, nh\u1EEFng b\u1EA3ng d\u00E0i theo chi\u1EC1u ngang, \u0111\u01B0\u1EE3c ph\u00E9p nh\u00F4 ra theo chi\u1EC1u ngang c\u1EE7a xe")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(738);
	    	
	    	q.setName("2.2.22-108");

			q.setText(new TranslatedString("Wie ist eine Ladung bei Dunkelheit oder schlechter Sicht kenntlich \nzu machen, wenn sie seitlich mehr als 40 cm \u00FCber die \nBegrenzungsleuchten des Fahrzeugs hinausragt?","B\u1EA1n l\u00E0m g\u00EC \u0111\u1EC3 nh\u1EADn bi\u1EBFt \u0111\u01B0\u1EE3c h\u00E0ng h\u00F3a ch\u1EDF v\u00E0o ban \u0111\u00EAm ho\u1EB7c n\u01A1i c\u00F3 t\u1EA7m nh\u00ECn k\u00E9m, khi m\u00F3n h\u00E0ng nh\u00F4 ra h\u01A1n 40cm kh\u1ECFi \u0111\u00E8n t\u00EDn hi\u1EC7u ngang?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach vorn durch wei\u00DFes Licht","D\u00F9ng \u0111\u00E8n tr\u1EAFng ph\u00EDa tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach hinten durch rotes Licht","D\u00F9ng \u0111\u00E8n \u0111\u1ECF ph\u00EDa sau")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Einschalten der Warnblinkanlage","B\u1EADt \u0111\u00E8n t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o (h\u1EC7 th\u1ED1ng 2 \u0111\u00E8n hai b\u00EAn c\u00F9ng ch\u1EDBp t\u1EAFt)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(739);
	    	
	    	q.setName("2.2.22-109");

			q.setText(new TranslatedString("Wie hoch darf eine rote Leuchte, die eine nach hinten \nhinausragende Ladung kennzeichnet, h\u00F6chstens \u00FCber der \nFahrbahn angebracht sein?","\u0110\u00E8n \u0111\u1ECF ph\u00EDa sau \u0111\u1EC3 \u0111\u00E1nh d\u1EA5u c\u00F3 h\u00E0ng h\u00F3a nh\u00F4 ra \u0111\u01B0\u1EE3c cao bao nhi\u00EAu, cao nh\u1EA5t l\u00E0 b\u1EB1ng \u0111\u1ED9 cao cho ph\u00E9p \u0111\u01B0\u1EE3c k\u00FD hi\u1EC7u tr\u00EAn \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("1,50 m","1,50 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("2,00 m","2,00 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("2,50 m","2,50 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(740);
	    	
	    	q.setName("2.2.22-110");

			q.setText(new TranslatedString("Was ist bei der Beladung von Fahrzeugen zu beachten?","Ph\u1EA3i ch\u00FA \u00FD g\u00EC khi xe mang t\u1EA3i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ladung, die mehr als 1 Meter \u00FCber die R\u00FCckstrahler nach hinten\nhinausragt, muss gekennzeichnet werden","T\u1EA3i, n\u1EBFu nh\u00F4 ra ph\u00EDa sau h\u01A1n 1 m\u00E9t ph\u00EDa tr\u00EAn t\u1EA5m ph\u1EA3n quang, ph\u1EA3i \u0111\u01B0\u1EE3c \u0111\u00E1nh d\u1EA5u hi\u1EC7u nh\u1EADn bi\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ladung darf oberhalb einer H\u00F6he von 2,50 m maximal 50 cm nach\nvorn hinausragen","T\u1EA3i \u0111\u01B0\u1EE3c ph\u00E9p nh\u00F4 cao t\u1ED1i \u0111a 2,5m v\u00E0 50 cm v\u1EC1 ph\u00EDa tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ladung darf in keinem Fall nach vorn \u00FCber das ziehende Fahrzeug\nhinausragen","T\u1EA3i \u0111\u01B0\u1EE3c ph\u00E9p nh\u00F4 ra ph\u00EDa tr\u01B0\u1EDBc trong m\u1ECDi t\u00ECnh hu\u1ED1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(741);
	    	
	    	q.setName("2.2.22-111");

			q.setText(new TranslatedString("Bis zu welcher H\u00F6he darf die Ladung nicht nach vorn \u00FCber das \nFahrzeug hinausragen? \n_____ m","\u1EDE \u0111\u1ED9 cao bao nhi\u00EAu th\u00EC t\u1EA3i kh\u00F4ng \u0111\u01B0\u1EE3c nh\u00F4 ra ph\u00EDa tr\u01B0\u1EDBc?\n____ m\n#Note:\n<ul>\n<li><strong>n\u1EBFu cao t\u1EEB 2,5m tr\u1EDF l\u00EAn th\u00EC kh\u00F4ng \u0111\u01B0\u1EE3c nh\u00F4 ra ph\u00EDa tr\u01B0\u1EDBc</strong>: </li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n2,5 m "), new TranslatedString("\n\n\n2,5 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(742);
	    	
	    	q.setName("2.2.22-112");

			q.setText(new TranslatedString("Unter welchen Bedingungen darf die Ladung nach vorne \u00FCber das \nFahrzeug hinausragen?","Trong \u0111i\u1EC1u ki\u1EC7n n\u00E0o th\u00EC t\u1EA3i \u0111\u01B0\u1EE3c ph\u00E9p nh\u00F4 ra ph\u00EDa tr\u01B0\u1EDBc?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn die Ladung oberhalb einer H\u00F6he von 2,50 m nicht mehr als 50\ncm hinausragt","Khi t\u1EA3i cao h\u01A1n 2,5m k\u00F4 \u0111\u01B0\u1EE3c nh\u00F4 qu\u00E1 50 cm")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn die Ladung mit einer roten Leuchte kenntlich gemacht ist","Khi t\u1EA3i \u0111\u01B0\u1EE3c \u0111\u00E1nh d\u1EA5u hi\u1EC7u nh\u1EADn bi\u1EBFt b\u1EB1ng \u0111\u00E8n \u0111\u1ECF")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(743);
	    	
	    	q.setName("2.2.22-113");

			q.setText(new TranslatedString("W\u00E4hrend einer Pause stellen Sie fest, dass ein Zurrgurt gerissen \nist. Was tun Sie?","Trong khi d\u1EEBng l\u1EA1i b\u1EA1n ki\u1EC3m tra th\u1EA5y d\u00E2y ch\u1EB1ng h\u00E0ng b\u1ECB tr\u01B0\u1EE3t. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrt fortsetzen, sobald der Zurrgurt ausgetauscht ist","\u0110i ti\u1EBFp mi\u1EC5n l\u00E0 thay d\u00E2y ch\u1EB1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrt fortsetzen, wenn durch andere ausreichende Sicherungsmittel\ndie Ladung gesichert ist","\u0110i ti\u1EBFp, khi \u0111\u1EA3m b\u1EA3o bu\u1ED9c h\u00E0ng h\u00F3a b\u1EB1ng c\u00E1c c\u00F4ng c\u1EE5 \u0111\u1EE7 an to\u00E0n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrt fortsetzen, weil die Ladung beim Verrutschen durch die\nBordw\u00E4nde aufgefangen wird","\u0110i ti\u1EBFp, v\u00EC b\u1EAFt \u0111\u1EA7u th\u1EA5y t\u1EA3i tr\u01B0\u1EE3t tr\u00EAn khoang ch\u1EE9a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.22-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(744);
	    	
	    	q.setName("2.2.22-114");

			q.setText(new TranslatedString("Gelten die Anforderungen an eine ordnungsgem\u00E4\u00DFe \nLadungssicherung f\u00FCr alle Kleintransporter?","Nh\u1EEFng y\u00EAu c\u1EA7u theo qui \u0111\u1ECBnh v\u1EC1 an to\u00E0n v\u1EADn t\u1EA3i c\u00F3 \u00E1p d\u1EE5ng cho xe v\u1EADn t\u1EA3i nh\u1ECF kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie gelten f\u00FCr alle Kleintransporter","\u00C1p d\u1EE5ng cho t\u1EA5t c\u1EA3 c\u00E1c xe v\u1EADn t\u1EA3i nh\u1ECF")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie gelten nur f\u00FCr Kleintransporter mit offener Ladefl\u00E4che","Ch\u1EC9 \u00E1p d\u1EE5ng cho nh\u1EEFng xe v\u1EADn t\u1EA3i nh\u1ECF c\u00F3 khoang ch\u1EDF m\u1EDF")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie gelten nur f\u00FCr Kleintransporter ohne Trennwand zum Laderaum","Ch\u1EC9 \u00E1p d\u1EE5ng \u0111\u1ED1i v\u1EDBi xe v\u1EADn t\u1EA3i nh\u1ECF kh\u00F4ng c\u00F3 v\u00E1ch ng\u0103n v\u1EDBi khoang ch\u1EE9a h\u00E0ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-030
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(745);
	    	
	    	q.setName("2.2.23-030");

			q.setText(new TranslatedString("Wann d\u00FCrfen Sie ein Kraftfahrzeug auf \u00F6ffentlichen Stra\u00DFen nicht in \nBetrieb nehmen?","Khi n\u00E0o th\u00EC kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u01B0a xe c\u00F3 \u0111\u1ED9ng c\u01A1 v\u00E0o ho\u1EA1t \u0111\u1ED9ng tr\u00EAn \u0111\u01B0\u1EDDng c\u00F4ng c\u1ED9ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn es nicht verkehrssicher ist","Khi xe kh\u00F4ng an to\u00E0n giao kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn keine Haftpflichtversicherung besteht","Khi xe kh\u00F4ng c\u00F3 b\u1EA3o hi\u1EC3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Sie den Fahrzeugbrief nicht besitzen","Khi b\u1EA1n kh\u00F4ng s\u1EDF h\u1EEFu gi\u1EA5y \u0111\u0103ng k\u00FD xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-031
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(746);
	    	
	    	q.setName("2.2.23-031");

			q.setText(new TranslatedString("Was kann dazu f\u00FChren, dass Sie Warnsignale \u00FCberh\u00F6ren?","\u0110i\u1EC1u g\u00EC d\u1EABn t\u1EDBi vi\u1EC7c b\u1EA1n kh\u00F4ng nghe th\u1EA5y t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu lautes Radio","Radio b\u1EADt qu\u00E1 to")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Benutzung von Kopfh\u00F6rern","S\u1EED d\u1EE5ng c\u00E1i tai nghe (nh\u1EA1c)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu lautes Auspuffger\u00E4usch","Ti\u1EBFng n\u1ED5 \u1EDF \u1ED1ng x\u1EA3 qu\u00E1 to")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-032
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(747);
	    	
	    	q.setName("2.2.23-032");

			q.setText(new TranslatedString("In welchen F\u00E4llen m\u00FCssen Sie die Verlegung des \nFahrzeugstandortes in den Bezirk einer anderen Zulassungsstelle \nmelden?","Khi n\u00E0o b\u1EA1n ph\u1EA3i \u0111\u0103ng k\u00FD l\u1EA1i khu v\u1EF1c s\u1EED d\u1EE5ng xe \u1EDF trung t\u00E2m \u0111\u0103ng k\u00FD kh\u00E1c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei vor\u00FCbergehender Verlegung f\u00FCr mehr als 3 Monate","S\u1EDBm h\u01A1n 3 th\u00E1ng tr\u01B0\u1EDBc khi chuy\u1EC3n ch\u1ED7")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei endg\u00FCltiger Verlegung","Sau khi chuy\u1EC3n ch\u1ED7")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei vor\u00FCbergehender Verlegung f\u00FCr weniger als 3 Monate","Trong v\u00F2ng 3 th\u00E1ng tr\u01B0\u1EDBc khi chuy\u1EC3n ch\u1ED7")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-033
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(748);
	    	
	    	q.setName("2.2.23-033");

			q.setText(new TranslatedString("Sie haben Ihr zugelassenes Fahrzeug verkauft. Der K\u00E4ufer hat \nbezahlt. Was m\u00FCssen Sie tun?","B\u1EA1n b\u00E1n xe c\u00F3 \u0111\u0103ng k\u00FD. Ng\u01B0\u1EDDi mua \u0111\u00E3 tr\u1EA3 ti\u1EC1n. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Namen und Anschrift des K\u00E4ufers unverz\u00FCglich der Zulassungsstelle\nmitteilen","Th\u00F4ng b\u00E1o ngay t\u00EAn v\u00E0 \u0111\u1ECBa ch\u1EC9 ng\u01B0\u1EDDi mua cho c\u01A1 quan qu\u1EA3n l\u00FD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dem K\u00E4ufer die Fahrzeugpapiere (Fahrzeugschein und Fahrzeugbrief\noder Betriebserlaubnis) gegen Empfangsbest\u00E4tigung aush\u00E4ndigen","N\u1ED9p h\u00F3a \u0111\u01A1n c\u00F9ng v\u1EDBi gi\u1EA5y t\u1EDD \u0111\u0103ng k\u00FD xe c\u1EE7a ng\u01B0\u1EDDi mua (b\u1EB1ng l\u00E1i, gi\u1EA5y \u0111\u0103ng k\u00FD xe, ...)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Pr\u00FCfplakette vom amtlichen Kennzeichen entfernen","X\u00F3a tem \u0111\u0103ng ki\u1EC3m tr\u00EAn bi\u1EC3n s\u1ED1 \u0111\u0103ng k\u00FD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-034
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(749);
	    	
	    	q.setName("2.2.23-034");

			q.setText(new TranslatedString("Was ist bei amtlichen Kennzeichen wichtig?","\u0110i\u1EC1u g\u00EC quan tr\u1ECDng v\u1EC1 bi\u1EC3n s\u1ED1 \u0111\u0103ng k\u00FD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen an den vorgesehenen Stellen fest angebracht sein","B\u1EA1n ph\u1EA3i g\u1EAFn ch\u1EAFc ch\u1EAFn \u1EDF ph\u00EDa tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen immer gut lesbar sein","Bi\u1EC3n ph\u1EA3i \u0111\u1ECDc \u0111\u01B0\u1EE3c r\u00F5 r\u00E0ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die hinteren Kennzeichen m\u00FCssen bei Dunkelheit beleuchtet sein","Bi\u1EC3n s\u1ED1 ph\u00EDa sau ph\u1EA3i ph\u00E1t s\u00E1ng v\u00E0o bu\u1ED5i t\u1ED1i")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-035
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(750);
	    	
	    	q.setName("2.2.23-035");

			q.setText(new TranslatedString("Was ist vorgeschrieben, wenn die Haftpflichtversicherung Ihres \nFahrzeugs erloschen ist? \nDas Fahrzeug","\u0110i\u1EC1u g\u00EC l\u00E0 b\u1EAFt bu\u1ED9c khi b\u1EA3o hi\u1EC3m xe h\u1EBFt h\u1EA1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 darf im Stra\u00DFenverkehr nicht mehr benutzt werden","Xe kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng n\u1EEFa")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 muss bei der Zulassungsstelle abgemeldet werden","Xe ph\u1EA3i \u0111\u01B0\u1EE3c ng\u01B0ng \u0111\u0103ng k\u00FD t\u1EA1i c\u01A1 quan qu\u1EA3n l\u00FD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 muss bei der Zulassungsstelle vorgef\u00FChrt werden","Xe ph\u1EA3i \u0111\u01B0\u1EE3c tr\u00ECnh di\u1EC7n t\u1EA1i c\u01A1 quan qu\u1EA3n l\u00FD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-036
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(751);
	    	
	    	q.setName("2.2.23-036");

			q.setText(new TranslatedString("Was d\u00FCrfen Sie am amtlichen Kennzeichen ver\u00E4ndern?","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p thay \u0111\u1ED5i g\u00EC \u1EDF bi\u1EC3n s\u1ED1 \u0111\u0103ng k\u00FD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es darf nichts ver\u00E4ndert werden","Kh\u00F4ng \u0111\u01B0\u1EE3c thay \u0111\u1ED5i g\u00EC")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zum Schutz der Beschriftung eine Folie aufkleben","\u0110\u1EC3 b\u1EA3o v\u1EC7 ch\u1EEF tr\u00EAn bi\u1EC3n s\u1ED1, d\u00E1n m\u1ED9t l\u1EDBp Folie l\u00EAn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bunte Aufkleber aufbringen","D\u00E1n/b\u00F3c c\u00E1c decal m\u00E0u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-037
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(752);
	    	
	    	q.setName("2.2.23-037");

			q.setText(new TranslatedString("Sie haben ein zugelassenes Fahrzeug erworben. Was m\u00FCssen Sie \ntun?","B\u1EA1n m\u1EDBi mua xe c\u00F3 \u0111\u0103ng k\u00FD. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC ti\u1EBFp?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unverz\u00FCglich umschreiben lassen","Chuy\u1EC3n t\u00EAn ngay")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Zulassungsbeh\u00F6rde einen Versicherungsnachweis vorlegen","Tr\u00ECnh b\u00E1o gi\u1EA5y ch\u1EE9ng nh\u1EADn an to\u00E0n l\u00EAn c\u01A1 quan c\u1EA5p ph\u00E9p")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(753);
	    	
	    	q.setName("2.2.23-101");

			q.setText(new TranslatedString("Was ist bei Fahrzeugen mit Planen zu beachten?","Ph\u1EA3i ch\u00FA \u00FD g\u00EC v\u1EDBi xe c\u00F3 b\u1EA3n \u0111\u1ED3?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Planen d\u00FCrfen die Sicht des Fahrers \u00FCber die Au\u00DFenspiegel nach\nhinten nicht behindern","B\u1EA3n \u0111\u1ED3 kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p che t\u1EA7m nh\u00ECn c\u1EE7a l\u00E1i xe qua g\u01B0\u01A1ng h\u1EADu b\u00EAn ngo\u00E0i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unbeladene Anh\u00E4nger mit hohen Planenaufbauten sind gegen\nSeitenwind besonders empfindlich","Unbeladene Anh\u00E4nger mit hohen Planenaufbauten sind gegen\nSeitenwind besonders empfindlich")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei Fahrzeugen mit Planen kann auf eine besondere Sicherung der\nLadung verzichtet werden","Bei Fahrzeugen mit Planen kann auf eine besondere Sicherung der\nLadung verzichtet werden")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(754);
	    	
	    	q.setName("2.2.23-103");

			q.setText(new TranslatedString("Was m\u00FCssen Sie einstellen, wenn Sie ein fremdes Fahrzeug fahren \nwollen?","B\u1EA1n ph\u1EA3i \u0111i\u1EC1u ch\u1EC9nh g\u00EC khi b\u1EA1n l\u00E1i xe l\u1EA1?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sitz, Kopfst\u00FCtze, Sicherheitsgurt","Ch\u1ED7 ng\u1ED3i, \u0111\u1EC7m b\u1EA3o v\u1EC7 \u0111\u1EA7u, d\u00E2y an to\u00E0n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Innenspiegel, Au\u00DFenspiegel","G\u01B0\u01A1ng trong, g\u01B0\u01A1ng ngo\u00E0i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Tageskilometerzahler","\u0110\u1ED3ng h\u1ED3 \u0111\u1EBFm kilomet")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(755);
	    	
	    	q.setName("2.2.23-104");

			q.setText(new TranslatedString("Wie sichert man einen Pkw mit Schaltgetriebe am Berg gegen \nWegrollen?","L\u00E1i xe v\u1EDBi h\u1ED9p s\u1ED1 \u0111i\u1EC1u khi\u1EC3n tay, l\u00E0m sao \u0111\u1EC3 tr\u00E1nh b\u1ECB tr\u01B0\u1EE3t tr\u00EAn n\u00FAi?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Feststellbremse bet\u00E4tigen","D\u00F9ng phanh tay")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ersten Gang oder R\u00FCckw\u00E4rtsgang einlegen","\u0110\u1EC3 s\u1ED1 1 ho\u1EB7c s\u1ED1 l\u00F9i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Schalthebel in Leerlaufstellung bringen","\u0110\u1EC3 s\u1ED1 0")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(756);
	    	
	    	q.setName("2.2.23-105");

			q.setText(new TranslatedString("Wie sichert man einen Pkw mit automatischer Kraft\u00FCbertragung \ngegen Wegrollen?","L\u00E0m sao \u0111\u1EC3 tr\u00E1nh b\u1ECB tr\u01B0\u1EE3t d\u1ED1c khi l\u00E1i xe v\u00F3i h\u1ED9p s\u1ED1 t\u1EF1 \u0111\u1ED9ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Feststellbremse bet\u00E4tigen","D\u00F9ng phanh tay")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wahlhebel in P-Stellung bringen","\u0110\u1EC3 ch\u1EBF \u0111\u1ED9 P")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wahlhebel in N-Stellung bringen","\u0110\u1EC3 ch\u1EBF d\u1ED9 N")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(757);
	    	
	    	q.setName("2.2.23-106");

			q.setText(new TranslatedString("Wie haben Sie sich beim R\u00FCckw\u00E4rtsfahren zu verhalten?","B\u1EA1n x\u1EED l\u00FD th\u1EBF n\u00E0o khi l\u00E1i l\u00F9i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Haupts\u00E4chlich nach hinten schauen; au\u00DFerdem nach vorn und zur\nSeite absichern","Ch\u1EE7 y\u1EBFu quan s\u00E1t ph\u00EDa sau, ngo\u00E0i ra c\u0169ng c\u1EA7n \u0111\u1EA3m b\u1EA3o an to\u00E0n ph\u00EDa tr\u01B0\u1EDBc v\u00E0 hai b\u00EAn.")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Besonders aufmerksam und langsam fahren","\u0110\u1EB7c bi\u1EC7t ch\u00FA \u00FD v\u00E0 l\u00E1i ch\u1EADm")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Niemals ohne Warnblinklicht fahren","Kh\u00F4ng bao gi\u1EDD \u0111\u01B0\u1EE3c l\u00E1i l\u00F9i m\u00E0 kh\u00F4ng b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(758);
	    	
	    	q.setName("2.2.23-107");

			q.setText(new TranslatedString("Wodurch kann Ihre Sicht beeintr\u00E4chtigt werden?","\u0110i\u1EC1u g\u00EC \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn t\u1EA7m nh\u00ECn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch die Ladung","Do t\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch abgenutzte Wischerbl\u00E4tter (Schlierenbildung)","\u0110\u1EC7m cao su c\u1EE7a thanh g\u1EA1t lau k\u00EDnh b\u1ECB m\u00F2n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch verschmierte Scheiben","K\u00EDnh ch\u1EAFn gi\u00F3 b\u1EA9n")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(759);
	    	
	    	q.setName("2.2.23-108");

			q.setText(new TranslatedString("Ihr Fahrzeug ist vereist. Was m\u00FCssen Sie tun, bevor Sie losfahren? \nEis entfernen","Xe b\u1EA1n b\u1ECB \u0111\u00F4ng \u0111\u00E1. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC tr\u01B0\u1EDBc khi ch\u1EA1y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 von Front- und Heckscheibe","G\u1EE1 b\u1ECF \u0111\u00E1 \u1EDF k\u00EDnh tr\u01B0\u1EDBc v\u00E0 sau")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 von Seitenscheiben und Spiegeln","G\u1EE1 b\u1ECF \u0111\u00E1 \u1EDF k\u00EDnh b\u00EAn v\u00E0 g\u01B0\u01A1ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 vom Glasschiebedach","G\u1EE1 b\u1ECF \u0111\u00E1 \u1EDF k\u00EDnh tr\u00EAn n\u00F3c xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(760);
	    	
	    	q.setName("2.2.23-109");

			q.setText(new TranslatedString("Ihr Fahrzeug hat Heckscheibenheizung und beheizbare \nAu\u00DFenspiegel. Was m\u00FCssen Sie vor dem Losfahren tun, wenn das \nFahrzeug vereist ist? \nEis entfernen","Xe b\u1EA1n c\u00F3 trang b\u1ECB s\u01B0\u1EDFi ch\u1ED1ng \u0111\u00F4ng \u1EDF c\u1EEDa sau v\u00E0 k\u00EDnh ngo\u00E0i. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC tr\u01B0\u1EDBc khi kh\u1EDFi h\u00E0nh khi xe b\u1EA1n b\u1ECB \u0111\u00F4ng \u0111\u00E1.?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 von Front- und Seitenscheiben","G\u1EE1 b\u1ECF \u0111\u00E1 \u1EDF k\u00EDnh tr\u01B0\u1EDBc v\u00E0 k\u00EDnh b\u00EAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 von Heckscheibe und Au\u00DFenspiegeln","G\u1EE1 b\u1ECF \u0111\u00E1 \u1EDF k\u00EDnh sau v\u00E0 g\u01B0\u01A1ng ngo\u00E0i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 vom Glasschiebedach","G\u1EE1 b\u1ECF \u0111\u00E1 \u1EDF k\u00EDnh tr\u00EAn n\u00F3c xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(761);
	    	
	    	q.setName("2.2.23-110");

			q.setText(new TranslatedString("F\u00FCr welche Fahrzeugf\u00FChrer ist die Benutzung eines Mobil- oder \nAutotelefons ohne Freisprecheinrichtung w\u00E4hrend der Fahrt \nverboten? \nF\u00FChrern von:","T\u00E0i x\u1EBF xe n\u00E0o khi \u0111ang l\u00E1i xe b\u1ECB c\u1EA5m d\u00F9ng \u0111i\u1EC7n tho\u1EA1i g\u1EAFn tr\u00EAn xe ho\u1EB7c \u0111i\u1EC7n tho\u1EA1i di \u0111\u1ED9ng, lo\u1EA1i kh\u00F4ng c\u00F3 loa n\u00F3i chuy\u1EC7n b\u00EAn ngo\u00E0i ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Pkw","T\u00E0i x\u1EBF xe Pkw")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Lkw","T\u00E0i x\u1EBF xe t\u1EA3i Lkw")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kraftr\u00E4dern","T\u00E0i x\u1EBF xe m\u00F4 t\u00F4")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(762);
	    	
	    	q.setName("2.2.23-112");

			q.setText(new TranslatedString("Sie wollen in Ihrem Pkw telefonieren. Was ist hierbei zu beachten?","B\u1EA1n mu\u1ED1n n\u00F3i chuy\u1EC7n \u0111i\u1EC7n tho\u1EA1i trong xe. \u0110i\u1EC1u g\u00EC c\u1EA7n ch\u00FA \u00FD trong tr\u01B0\u1EDDng h\u1EE3p n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der H\u00F6rer des Autotelefons oder das Handy darf w\u00E4hrend der Fahrt\nvom Fahrer nicht aufgenommen oder gehalten werden","Trong khi \u0111ang l\u00E1i, t\u00E0i x\u1EBF kh\u00F4ng \u0111\u01B0\u1EE3c b\u1ED1c m\u00E1y ho\u1EB7c c\u1EA7m tai nghe \u0111i\u1EC7n tho\u1EA1i g\u1EAFn trong xe ho\u1EB7c \u0111i\u1EC7n tho\u1EA1i di \u0111\u1ED9ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Aus Sicherheitsgr\u00FCnden sollte auch auf das Telefonieren mit\nFreisprecheinrichtung w\u00E4hrend der Fahrt nach M\u00F6glichkeit verzichtet \nwerden","V\u00EC l\u00FD do an to\u00E0n, n\u00EAn h\u1EA1n ch\u1EBF t\u1ED1i \u0111a n\u00F3i chuy\u1EC7n qua \u0111i\u1EC7n tho\u1EA1i v\u1EDBi h\u1EC7 th\u1ED1ng loa r\u1EDDi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei stehendem Fahrzeug und laufendem Motor darf der Fahrer auch\nohne Freisprecheinrichtung telefonieren","Khi xe d\u1EEBng v\u00E0 \u0111\u1ED9ng c\u01A1 v\u1EABn n\u1ED5, t\u00E0i x\u1EBF \u0111\u01B0\u1EE3c ph\u00E9p nghe \u0111i\u1EC7n tho\u1EA1i ngay c\u1EA3 v\u1EDBi h\u1EC7 th\u1ED1ng kh\u00F4ng c\u00F3 loa r\u1EDDi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.23-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(763);
	    	
	    	q.setName("2.2.23-113");

			q.setText(new TranslatedString("Ein auflaufgebremster Wohnanh\u00E4nger mit einer Achse wird im \nGef\u00E4lle abgestellt. Wie ist er gegen Wegrollen zu sichern?","Nh\u00E0 di \u0111\u1ED9ng c\u00F3 phanh Auflauf v\u00E0 m\u1ED9t tr\u1EE5c \u0111\u01B0\u1EE3c \u0111\u1EADu \u1EDF m\u1ED9t con d\u1ED1c. L\u00E0m sao \u0111\u1EC3 ch\u1ED1ng xe b\u1ECB tr\u00F4i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Feststellbremse anziehen","K\u00E9o phanh tay")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unterlegkeile vor die R\u00E4der legen","\u0110\u1EB7t mi\u1EBFng n\u00EAm \u0111\u1EC3 ch\u1EB7n tr\u01B0\u1EDBc b\u00E1nh xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Je einen Unterlegkeil vor und hinter ein Rad legen","\u0110\u1EB7t tr\u01B0\u1EDBc m\u1ED7i b\u00E1nh 2 mi\u1EBFng ch\u1EB7n m\u1ED9t ph\u00EDa tr\u01B0\u1EDBc, m\u1ED9t ph\u00EDa sau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.26-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(764);
	    	
	    	q.setName("2.2.26-102");

			q.setText(new TranslatedString("Sie kommen unerwartet auf einem Fu\u00DFg\u00E4nger\u00FCberweg zum Stehen. \nWie verhalten Sie sich?","B\u1EA1n \u0111\u1ED9t nhi\u00EAn b\u1ECB d\u1EEBng \u1EDF gi\u1EEFa v\u1EA1ch qua \u0111\u01B0\u1EDDng cho ng\u01B0\u1EDDi \u0111i b\u1ED9.\nB\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Etwas vorw\u00E4rts oder r\u00FCckw\u00E4rts fahren, um den \u00DCberweg so weit wie\nm\u00F6glich frei zu machen","\u0110i ti\u1EBFn l\u00EAn hay l\u00F9i xu\u1ED1ng m\u1ED9t ch\u00FAt \u0111\u1EC3 t\u1EA1o kho\u1EA3ng tr\u1ED1ng c\u00E0ng r\u1ED9ng c\u00E0ng t\u1ED1t cho ng\u01B0\u1EDDi \u0111i qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Halbseitig auf den Gehweg fahren, um damit den \u00DCberweg frei zu\nmachen","L\u00E1i xe l\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng cho ng\u01B0\u1EDDi \u0111i b\u1ED9 m\u1ED9t n\u1EEDa \u0111\u1EC3 t\u1EA1o kho\u1EA3ng tr\u1ED1ng cho \u0111\u01B0\u1EDDng b\u0103ng qua")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Keinesfalls r\u00FCckw\u00E4rts fahren, auch wenn hinten frei ist","Trong m\u1ECDi t\u00ECnh hu\u1ED1ng kh\u00F4ng c\u00F3 l\u00F9i l\u1EA1i, cho d\u00F9 \u0111\u1EB1ng sau c\u00F2n tr\u1ED1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.30-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(765);
	    	
	    	q.setName("2.2.30-101");

			q.setText(new TranslatedString("Auf welche Zeit erstreckt sich das Fahrverbot an Sonn- und \nFeiertagen? \nVon 0 Uhr bis _____ Uhr","V\u00E0o ch\u1EE7 nh\u1EADt v\u00E0 ng\u00E0y l\u1EC5, th\u1EDDi gian n\u00E0o trong ng\u00E0y th\u00EC lu\u1EADt c\u1EA5m l\u00E1i xe \u00E1p d\u1EE5ng ?\nT\u1EEB 0 gi\u1EDD \u0111\u1EBFn _____________ gi\u1EDD\n#Note:\n<ul>\n<li><strong>erstrecken</strong>: to extend, to range over sth. </li>\n</ul>\n#Hint:\ng\u1EA7n nh\u01B0 nguy\u00EAn ng\u00E0y"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\nVon 0 Uhr bis 22 Uhr "), new TranslatedString("\n\n\nVon 0 Uhr bis 22 Uhr ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.30-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(766);
	    	
	    	q.setName("2.2.30-102");

			q.setText(new TranslatedString("F\u00FCr welche Fahrzeuge gilt das Fahrverbot an Sonn- und \nFeiertagen?","Xe n\u00E0o b\u1ECB c\u1EA5m trong ng\u00E0y l\u1EC5 v\u00E0 ch\u1EE7 nh\u1EADt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("F\u00FCr Lkw mit einer zul\u00E4ssigen Gesamtmasse \u00FCber 7,5 t","C\u00E1c xe Lkw c\u00F3 t\u1EA3i tr\u1ECDng cho ph\u00E9p tr\u00EAn 7,5 t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("F\u00FCr alle Lkw mit Anh\u00E4nger","T\u1EA5t c\u1EA3 c\u00E1c xe Lkw c\u00F3 r\u01A1-mooc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("F\u00FCr Zugmaschinen mit Anh\u00E4ngern","Xe c\u00F4ng n\u00F4ng c\u00F3 r\u01A1-mooc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.32-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(767);
	    	
	    	q.setName("2.2.32-101");

			q.setText(new TranslatedString("Sie fahren aus unbefestigtem Gel\u00E4nde (z.B. Acker, Baustelle) auf \neine \u00F6ffentliche Stra\u00DFe und verschmutzen diese erheblich. Wer ist \nf\u00FCr die Beseitigung dieses Verkehrshindernisses verantwortlich?","B\u1EA1n \u0111i xe t\u1EEB khu v\u1EF1c kh\u00F4ng an to\u00E0n (v\u00ED d\u1EE5 c\u00E1nh \u0111\u1ED3ng, c\u00F4ng tr\u01B0\u1EDDng) v\u00E0o \u0111\u01B0\u1EDDng c\u00F4ng c\u1ED9ng v\u00E0 kh\u00E1 b\u1EA9n. Ai l\u00E0 ng\u01B0\u1EDDi ch\u1ECBu tr\u00E1ch nhi\u1EC7m d\u1ECDn d\u1EB9p c\u00E1c ch\u01B0\u1EDBng ng\u1EA1i v\u1EADt tr\u00EAn \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie als Verursacher","B\u1EA1n l\u00E0 ng\u01B0\u1EDDi g\u00E2y ra")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das zust\u00E4ndige Stra\u00DFenbauamt","\u0110\u01A1n v\u1ECB thi c\u00F4ng c\u00F3 th\u1EA9m quy\u1EC1n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Anlieger dieses Stra\u00DFenabschnitts","Ng\u01B0\u1EDDi d\u00E2n sinh s\u1ED1ng \u1EDF g\u1EA7n khu v\u1EF1c \u0111\u01B0\u1EDDng \u0111\u00F3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.32-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(768);
	    	
	    	q.setName("2.2.32-102");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, um eine Gef\u00E4hrdung anderer durch von Ihrem \nFahrzeug gefallene Ausr\u00FCstungs- oder Ladungsteile zu verhindern? \nJe nach Situation","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC \u0111\u1EC3 tr\u00E1nh nguy hi\u1EC3m g\u00E2y ra do r\u01A1i d\u1EE5ng c\u1EE5 hay h\u00E0nh l\u00FD trong xe ra?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 die Teile selbst beseitigen","Sau khi b\u1ECB r\u01A1i, b\u1EA1n t\u1EF1 d\u1ECDn d\u1EB9p c\u00E1c \u0111\u1ED3 b\u1ECB r\u01A1i.")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 die Gefahrstelle absichern und umgehend Stra\u00DFendienst oder\nPolizei verst\u00E4ndigen","Sau khi b\u1ECB r\u01A1i, b\u1EA1n b\u1EA3o v\u1EC7 an to\u00E0n khu v\u1EF1c nguy hi\u1EC3m v\u00E0 l\u1EADp t\u1EE9c g\u1ECDi d\u1ECBch v\u1EE5 d\u1ECDn \u0111\u01B0\u1EDDng ho\u1EB7c c\u1EA3nh s\u00E1t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 weiterfahren und das n\u00E4chste Ordnungsamt informieren","Sau khi b\u1ECB r\u01A1i, \u0111i ti\u1EBFp v\u00E0 b\u00E1o cho \u0111\u1ED9i b\u1EA3o v\u1EC7 tr\u1EADt t\u1EF1 g\u1EA7n nh\u1EA5t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.37-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(769);
	    	
	    	q.setName("2.2.37-001");

			q.setText(new TranslatedString("Welche Bedeutung haben diese Zeichen f\u00FCr Sie?","C\u00E1c bi\u1EC3n b\u00E1o n\u00E0y c\u00F3 \u00FD ngh\u0129a g\u00EC v\u1EDBi b\u1EA1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.2.37-001.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Verkehr auf den beiden rechten Fahrstreifen ist freigegeben","Hai l\u00E0n b\u00EAn ph\u1EA3i \u0111\u01B0\u1EE3c s\u1EED d\u1EE5ng \u0111\u1EC3 \u0111i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die beiden linken Fahrstreifen darf ich nicht benutzen","Hai l\u00E0n b\u00EAn tr\u00E1i kh\u00F4ng \u0111\u01B0\u1EE3c s\u1EED d\u1EE5ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die beiden linken Fahrstreifen darf ich nur zum \u00DCberholen benutzen","Hai l\u00E0n b\u00EAn tr\u00E1i ch\u1EC9 \u0111\u01B0\u1EE3c d\u00F9ng \u0111\u1EC3 v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.37-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(770);
	    	
	    	q.setName("2.2.37-002");

			q.setText(new TranslatedString("Sie fahren mit ungef\u00E4hr 40 km/h. Etwa 10 m vor Ihnen wechselt die \nAmpel von \u201EGr\u00FCn\u201C auf \u201EGelb\u201C. Wie verhalten Sie sich?","B\u1EA1n l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 kho\u1EA3ng 40 km/h. Kho\u1EA3ng 10 m ph\u00EDa tr\u01B0\u1EDBc c\u00F3 \u0111\u00E8n giao th\u00F4ng \u0111ang chuy\u1EC3n t\u1EEB xanh sang v\u00E0ng. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weiterfahren","D\u1EEBng l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Anhalten","\u0110i ti\u1EBFp")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.37-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(771);
	    	
	    	q.setName("2.2.37-003");

			q.setText(new TranslatedString("Sie fahren mit ungef\u00E4hr 40 km/h. Etwa 40 m vor Ihnen wechselt die \nAmpel von \u201EGr\u00FCn\u201C auf \u201EGelb\u201C. Wie verhalten Sie sich?","B\u1EA1n l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 kho\u1EA3ng 40 km/h. Kho\u1EA3ng 40 m ph\u00EDa tr\u01B0\u1EDBc c\u00F3 \u0111\u00E8n giao th\u00F4ng \u0111ang chuy\u1EC3n t\u1EEB xanh sang v\u00E0ng. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anhalten","D\u1EEBng l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren","\u0110i ti\u1EBFp")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.37-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(772);
	    	
	    	q.setName("2.2.37-004");

			q.setText(new TranslatedString("Sie n\u00E4hern sich einer Ampel, die schon l\u00E4nger \u201EGr\u00FCn\u201C zeigt. Wie \nverhalten Sie sich?","B\u1EA1n l\u00E1i xe g\u1EA7n \u0111\u00E8n giao th\u00F4ng, khi \u0111\u00F3 \u0111\u00E3 b\u1EADt xanh t\u1EEB l\u00E2u. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Ampel aufmerksam beobachten","Ch\u00FA \u00FD \u0111\u00E8n giao th\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit erh\u00F6hter Bereitschaft zum Anhalten weiterfahren","\u0110i ti\u1EBFp v\u1EDBi t\u01B0 th\u1EBF s\u1EB5n s\u00E0ng d\u1EEBng l\u1EA1i \u1EDF m\u1EE9c cao nh\u1EA5t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beschleunigen, auch wenn dabei ein Tempolimit \u00FCberschritten wird","T\u0103ng t\u1ED1c, nh\u01B0ng v\u1EABn ch\u1EA1y ch\u1EADm h\u01A1n t\u1ED1c \u0111\u1ED9 cho ph\u00E9p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.37-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(773);
	    	
	    	q.setName("2.2.37-005");

			q.setText(new TranslatedString("Die Ampel hat gerade auf \u201EGelb\u201C gewechselt. Wie verhalten Sie \nsich als Linksabbieger?","\u0110\u00E8n giao th\u00F4ng v\u1EEBa chuy\u1EC3n sang \u201EV\u00E0ng\u201C. N\u1EBFu qu\u1EB9o mu\u1ED1n qu\u1EB9o tr\u00E1i b\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.2.37-005.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anhalten","D\u1EEBng l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Z\u00FCgig abbiegen","Qu\u1EB9o ti\u1EBFp kh\u00F4ng d\u1EEBng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.40-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(774);
	    	
	    	q.setName("2.4.40-001");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.40-001.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Seitenwind Geschwindigkeit herabsetzen","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 v\u00EC c\u00F3 gi\u00F3 t\u1EA1t ngang")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Gegenlenken einstellen","Gi\u1EEF tay l\u00E1i ng\u01B0\u1EE3c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf Flugbetrieb einstellen","G\u1EA7n s\u00E2n bay")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.40-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(775);
	    	
	    	q.setName("2.4.40-002");

			q.setText(new TranslatedString("Wie verhalten Sie sich auf einer Autobahn bei diesem \nVerkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.40-002.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Aufmerksamkeit erh\u00F6hen, vorsorglich Abstand vergr\u00F6\u00DFern","T\u0103ng s\u1EF1 t\u1EADp trung, c\u1EA9n th\u1EADn t\u0103ng kho\u1EA3ng c\u00E1ch an to\u00E0n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Stau abbremsen und Warnblinklicht einschalten","Khi g\u1EB7p k\u1EB9t xe th\u00EC phanh v\u00E0 b\u1EADt \u0111\u00E8n xi-nhan")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei Stau auf den Seitenstreifen wechseln und dort weiterfahren","Khi g\u1EB7p k\u1EB9t xe \u0111\u1ED5i v\u00E0o l\u00E0n \u0111\u01B0\u1EDDng b\u00EAn l\u1EC1 v\u00E0 t\u1EEB \u0111\u00F3 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.40-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(776);
	    	
	    	q.setName("2.4.40-003");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich bei diesem Verkehrszeichen verhalten?","G\u1EB7p bi\u1EC3n b\u00E1o b\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.40-003.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vor der Kurve vermindern","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 tr\u01B0\u1EDBc khi v\u00E0o cua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("M\u00F6glichst weit rechts fahren","\u0110i h\u1EBFt c\u1EE1 v\u1EC1 b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor der Kurve links blinken","Tr\u01B0\u1EDBc khi v\u00E0o cua, b\u1EADt \u0111\u00E8n xi-nhan")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.40-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(777);
	    	
	    	q.setName("2.4.40-004");

			q.setText(new TranslatedString("Wie verhalten Sie sich im Bereich dieser Gefahrstrecke?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o trong khu v\u1EF1c nguy hi\u1EC3m n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.40-004.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langsamer fahren, auf Wild achten","\u0110i ch\u1EADm, c\u1EA9n th\u1EADn c\u00F3 th\u00FA r\u1EEBng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abblenden und bremsen, wenn Wild in Sicht kommt","\u0110i ch\u1EADm l\u1EA1i v\u00E0 phanh, khi nh\u00ECn th\u1EA5y c\u00F3 th\u00FA r\u1EEBng \u0111\u1EBFn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nicht vor Wild ausweichen, wenn der Gegenverkehr gef\u00E4hrdet w\u00FCrde","Kh\u00F4ng tr\u00E1nh th\u00FA r\u1EEBng, v\u00EC g\u00E2y nguy hi\u1EC3m cho xe ng\u01B0\u1EE3c chi\u1EC1u")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.41-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(778);
	    	
	    	q.setName("2.4.41-101");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei diesem Verkehrszeichen beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi th\u1EA5y bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.41-101.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schneeketten benutzen","S\u1EED d\u1EE5ng x\u00EDch qu\u1EA5n l\u1ED1p xe \u0111\u1EC3 \u0111i tr\u00EAn tuy\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zul\u00E4ssige H\u00F6chstgeschwindigkeit 50 km/h","T\u1ED1c \u0111\u1ED9 cao nh\u1EA5t \u0111\u01B0\u1EE3c ph\u00E9p l\u00E0 50 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kettenfahrzeuge haben Vorfahrt","Kettenfahrzeuge haben Vorfahrt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.41-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(779);
	    	
	    	q.setName("2.4.41-102");

			q.setText(new TranslatedString("Welches Verkehrszeichen bezieht sich auf die Zul\u00E4ssige \nGesamtmasse?","Bi\u1EC3n b\u00E1o n\u00E0o \u0111\u1EC1 c\u1EADp \u0111\u1EBFn t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p?\n(S\u1ED1 1 hay s\u1ED1 2)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nr. 1","S\u1ED1 1")));
				q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nr. 2","S\u1ED1 2")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.41-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(780);
	    	
	    	q.setName("2.4.41-103");

			q.setText(new TranslatedString("Welches Verkehrszeichen bezieht sich auf die tats\u00E4chliche Masse?","Bi\u1EC3n b\u00E1o n\u00E0o \u0111\u1EC1 c\u1EADp \u0111\u1EBFn tr\u1ECDng l\u01B0\u1EE3ng th\u1EF1c t\u1EBF?\n(S\u1ED1 1 hay s\u1ED1 2)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nr. 1","S\u1ED1 1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nr. 2","S\u1ED1 2")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.41-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(781);
	    	
	    	q.setName("2.4.41-104");

			q.setText(new TranslatedString("F\u00FCr welche Fahrzeuge ist das Befahren einer so beschilderten \nStra\u00DFe verboten? \nF\u00FCr Fahrzeuge, deren","Xe n\u00E0o b\u1ECB c\u1EA5m \u0111i v\u00E0o \u0111\u01B0\u1EDDng c\u00F3 treo bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.41-104.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("tats\u00E4chliche Achslast 2 t \u00FCberschreitet","Xe c\u00F3 tr\u1ECDng l\u01B0\u1EE3ng th\u1EF1c t\u1EBF v\u01B0\u1EE3t qu\u00E1 2 t\u1EA5n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("zul\u00E4ssige Achslast 2 t \u00FCberschreitet","Xe c\u00F3 T\u1EA3i tr\u1ECDng cho ph\u00E9p v\u01B0\u1EE3t qu\u00E1 2 t\u1EA5n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("zul\u00E4ssige Gesamtmasse 2 t nicht \u00FCberschreitet","Xe c\u00F3 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p kh\u00F4ng v\u01B0\u1EE3t qu\u00E1 2 t\u1EA5n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.41-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(782);
	    	
	    	q.setName("2.4.41-105");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.41-105.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf ein Verbot f\u00FCr Fahrzeuge, deren Breite einschlie\u00DFlich Ladung 2 m\n\u00FCberschreitet","C\u1EA5m xe c\u00F3 \u0111\u1ED9 r\u1ED9ng xe (bao g\u1ED3m c\u1EA3 \u0111\u1ED3 \u0111\u1EA1c ch\u1EDF theo) v\u01B0\u1EE3t qu\u00E1 2m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Fahrbahn von 2 m Breite","\u0110\u01B0\u1EDDng r\u1ED9ng 2 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen vorgeschriebenen Seitenabstand von mindestens 2 m zu\nanderen Fahrzeugen","Kho\u1EA3ng c\u00E1ch b\u00EAn \u0111\u1EBFn c\u00E1c xe kh\u00E1c theo qui \u0111\u1ECBnh ph\u1EA3i t\u1ED1i thi\u1EC3u 2 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.41-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(783);
	    	
	    	q.setName("2.4.41-106");

			q.setText(new TranslatedString("Durch welche Fahrzeuge k\u00F6nnen bei Missachtung dieses \nVerkehrszeichens schwere Unf\u00E4lle entstehen? \nDurch Fahrzeuge mit folgenden Abmessungen einschlie\u00DFlich Ladung:","Xe n\u00E0o c\u00F3 th\u1EC3 g\u00E2y ra tai n\u1EA1n nghi\u00EAm tr\u1ECDng n\u1EBFu kh\u00F4ng ch\u00FA \u00FD \u0111\u1EBFn bi\u1EC3n b\u00E1o n\u00E0y?\n\u0110\u1ED1i v\u1EDBi xe c\u00F3 k\u00EDch th\u01B0\u1EDBc nh\u01B0 sau (t\u00EDnh c\u1EA3 \u0111\u1ED3 \u0111\u1EA1c t\u1EA3i tr\u00EAn xe)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.41-106.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("L\u00E4nge 8 m, Breite 2,5 m, H\u00F6he 4 m","D\u00E0i 8 m, R\u1ED9ng 2,5 m, Cao 4 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("L\u00E4nge 10 m, Breite 3,9 m, H\u00F6he 3 m","D\u00E0i 10 m, R\u1ED9ng 3,9 m, Cao 3 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("L\u00E4nge 4 m, Breite 2,5 m, H\u00F6he 2,5 m","D\u00E0i 4 m, R\u1ED9ng 2,5 m, Cao 2,5 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.41-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(784);
	    	
	    	q.setName("2.4.41-107");

			q.setText(new TranslatedString("Mit welchen Fahrzeugen d\u00FCrfen Sie eine so gekennzeichnete Stra\u00DFe \nnicht befahren?","V\u1EDBi lo\u1EA1i xe n\u00E0o b\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng \u0111\u01B0\u1EDDng c\u00F3 bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.41-107.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Pkw mit Wohnanh\u00E4nger, Gesamtl\u00E4nge des Zuges 11 m","Xe Pkw c\u00F3 k\u00E9o theo nh\u00E0 \u0111i \u0111\u1ED9ng (Wohnanh\u00E4nger), chi\u1EC1u d\u00E0i xe t\u1ED5ng c\u1ED9ng 11m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Traktor mit Anh\u00E4nger, Gesamtl\u00E4nge des Zuges 12 m","Xe m\u00E1y c\u00E0y c\u00F3 r\u01A1-mooc (Anh\u00E4nger), chi\u1EC1u d\u00E0i xe t\u1ED5ng c\u1ED9ng 12m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Lkw mit einer L\u00E4nge von 9 m einschlie\u00DFlich Ladung","Xe Lkw v\u1EDBi chi\u1EC1u d\u00E0i 9m k\u1EC3 c\u1EA3 t\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(785);
	    	
	    	q.setName("2.4.42-001");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-001.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf das Ende der Autobahn","Cu\u1ED1i \u0111\u01B0\u1EDDng cao t\u1ED1c (autobahn)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf das Ende der Kraftfahrstra\u00DFe","Cu\u1ED1i \u0111\u01B0\u1EDDng cho \u00F4-t\u00F4 (Kraftfahrstra\u00DFe)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine vor\u00FCbergehende Sperrung der Autobahn","Barrie c\u1EA3n kh\u00F4ng cho \u0111i v\u00E0o autobahn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(786);
	    	
	    	q.setName("2.4.42-002");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-002.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf das Ende der Kraftfahrstra\u00DFe","Cu\u1ED1i \u0111\u01B0\u1EDDng cho \u00F4-t\u00F4")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf das Ende der Autobahn","Cu\u1ED1i \u0111\u01B0\u1EDDng cao t\u1ED1c (autobahn)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf ein Verbot f\u00FCr Kraftwagen","C\u1EA5m xe c\u00F3 \u0111\u1ED9ng c\u01A1 Kraftwagen")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(787);
	    	
	    	q.setName("2.4.42-003");

			q.setText(new TranslatedString("Was bedeutet dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-003.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es empfiehlt, auch unter g\u00FCnstigen Bedingungen nicht schneller als\n80 km/h zu fahren","D\u01B0\u1EDBi \u0111i\u1EC1u ki\u1EC7n b\u00ECnh th\u01B0\u1EDDng \u0111\u1EC1 ngh\u1ECB kh\u00F4ng ch\u1EA1y nhanh h\u01A1n 80 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es empfiehlt, diese Stra\u00DFe nur mit Kraftfahrzeugen zu benutzen, die\nmindestens 80 km/h fahren k\u00F6nnen","\u0110\u1EC1 ngh\u1ECB \u0111\u01B0\u1EDDng n\u00E0y ch\u1EC9 s\u1EED d\u1EE5ng cho xe c\u00F3 \u0111\u1ED9ng c\u01A1, nh\u1EEFng xe c\u00F3 th\u1EC3 ch\u1EA1y t\u1ED1i thi\u1EC3u 80 km/h")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(788);
	    	
	    	q.setName("2.4.42-004");

			q.setText(new TranslatedString("Worauf weisen solche Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-004.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf die Nummer einer Autobahn","S\u1ED1 c\u1EE7a \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf die Entfernung bis zur n\u00E4chsten Tankstelle","Kho\u1EA3ng c\u00E1ch \u0111\u1EBFn tr\u1EA1m x\u0103ng k\u1EBF ti\u1EBFp")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf die Nummer einer Europastra\u00DFe","S\u1ED1 c\u1EE7a \u0111\u01B0\u1EDDng xuy\u00EAn ch\u00E2u \u00C2u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(789);
	    	
	    	q.setName("2.4.42-005");

			q.setText(new TranslatedString("Worauf weist die Zahl \u201E26\u201C in diesem Verkehrszeichen hin?","S\u1ED1 \u201E26\u201C trong bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-005.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf die Autobahnausfahrt Nummer 26","\u0110\u01B0\u1EDDng ra kh\u1ECFi Autobahn (Autobahnausfahrt) mang s\u1ED1 26")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf die A 26","\u0110\u01B0\u1EDDng Autobahn s\u1ED1 26")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf die Entfernung von der Ausfahrt bis D\u00FCsseldorf-Benrath","Auf die Entfernung von der Ausfahrt bis D\u00FCsseldorf-Benrath")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(790);
	    	
	    	q.setName("2.4.42-006");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-006.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine Bedarfsumleitung f\u00FCr den Autobahnverkehr","\u0110\u01B0\u1EDDng d\u1EF1 ph\u00F2ng cho xe ch\u1EA1y tr\u00EAn Autobahn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine U-Bahnstation","Ga t\u00E0u \u0111i\u1EC7n ng\u1EA7m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf die Bundesstra\u00DFe 22","\u0110\u01B0\u1EDDng li\u00EAn bang s\u1ED1 22")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(791);
	    	
	    	q.setName("2.4.42-007");

			q.setText(new TranslatedString("Was gilt nach diesem Verkehrszeichen?","C\u00F3 \u0111i\u1EC1u g\u00EC sau bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-007.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zul\u00E4ssige H\u00F6chstgeschwindigkeit 50 km/h","T\u1ED1c \u0111\u1ED9 t\u1ED1i \u0111a cho ph\u00E9p 50 km/h")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Freie Wahl markierter Fahrstreifen f\u00FCr Kraftfahrzeuge bis 3,5 t\nzul\u00E4ssiger Gesamtmasse","T\u1EF1 do ch\u1ECDn l\u1EC1 \u0111\u01B0\u1EDDng \u0111\u01B0\u1EE3c \u0111\u00E1nh d\u1EA5u \u0111\u1ED1i v\u1EDBi c\u00E1c xe t\u1EA3i tr\u1ECDng cho ph\u00E9p t\u1ED1i \u0111a 3,5t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Freie Wahl markierter Fahrstreifen f\u00FCr alle Kraftfahrzeuge","T\u1EF1 do ch\u1ECDn l\u1EC1 \u0111\u01B0\u1EDDng \u0111\u01B0\u1EE3c \u0111\u00E1nh d\u1EA5u \u0111\u1ED1i v\u1EDBi t\u1EA5t c\u1EA3 c\u00E1c xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(792);
	    	
	    	q.setName("2.4.42-101");

			q.setText(new TranslatedString("Was gilt nach diesem Verkehrszeichen?","Bi\u1EC3n n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-101.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00DCberholen darf nicht durch Hupen angek\u00FCndigt werden","V\u01B0\u1EE3c kh\u00F4ng \u0111\u01B0\u1EE3c b\u00F3p c\u00F2i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Parkende Pkw d\u00FCrfen mit der Parkleuchte gesichert werden","Xe Pkw \u0111ang \u0111\u1EADu \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng \u0111\u00E8n b\u00E1o \u0111\u1EADu xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei Dunkelheit darf mit Standlicht gefahren werden","Khi tr\u1EDDi t\u1ED1i \u0111\u01B0\u1EE3c ph\u00E9p d\u00F9ng \u0111\u00E8n Standlicht")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.42-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(793);
	    	
	    	q.setName("2.4.42-102");

			q.setText(new TranslatedString("Wie darf hier mit Fahrzeugen bis 2,8 t zul\u00E4ssiger Gesamtmasse \ngeparkt werden?","Xe c\u00F3 tr\u1ECDng l\u01B0\u1EE3ng t\u1ED1i \u0111a 2,8t \u0111\u01B0\u1EE3c \u0111\u1EADu nh\u01B0 th\u1EBF n\u00E0o \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.42-102.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Pkw entsprechend der Abbildung","Xe Pkw \u0111\u1EADu nh\u01B0 h\u00ECnh v\u1EBD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wohnwagen entsprechend der Abbildung","Xe Wohnwagen \u0111\u1EADu nh\u01B0 h\u00ECnh v\u1EBD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kleine Pkw auch quer zur Fahrtrichtung","Xe Pkw nh\u1ECF \u0111\u1EADu ch\u00E9o theo hu\u1ED1ng xe ch\u1EA1y!???")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.43-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(794);
	    	
	    	q.setName("2.4.43-001");

			q.setText(new TranslatedString("Sie n\u00E4hern sich auf dem rechten Fahrstreifen einer Autobahn \ndieser Verkehrseinrichtung. Wie verhalten Sie sich?","Tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn b\u1EA1n \u0111ang \u0111i tr\u00EAn l\u00E0n b\u00EAn ph\u1EA3i th\u00EC g\u1EB7p bi\u1EC3n n\u00E0y. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.43-001.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf den linken Fahrstreifen wechseln, gegebenenfalls im\nRei\u00DFverschlussverfahren","\u0111\u1ED5i sang l\u00E0n tr\u00E1i, n\u1EBFu c\u00F3 th\u1EC3 \u0111\u01B0\u1EE3c th\u00EC s\u1EED d\u1EE5ng \u0111\u01B0\u1EDDng n\u1ED1i d\u1EA1ng phec-m\u01A1-tuya")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei starkem Verkehr auf dem linken Fahrstreifen rechts vorbeifahren","khi c\u00F3 nhi\u1EC1u xe \u1EDF l\u00E0n tr\u00E1i th\u00EC \u0111\u01B0\u1EE3c v\u01B0\u1EE3t \u1EDF l\u00E0n ph\u1EA3i")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.4.43-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(795);
	    	
	    	q.setName("2.4.43-002");

			q.setText(new TranslatedString("Sie brauchen Hilfe auf der Autobahn. Welche Information gibt Ihnen \ndaf\u00FCr der Pfeil am Leitpfosten?","B\u1EA1n c\u1EA7n s\u1EF1 gi\u00FAp \u0111\u1EE1 tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn. M\u0169i t\u00EAn tr\u00EAn nh\u1EEFng c\u1EE5c b\u00EAn \u0111\u01B0\u1EDDng cung c\u1EA5p th\u00F4ng tin g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.4.43-002.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("N\u00E4chste Notrufs\u00E4ule in Pfeilrichtung","Tr\u1EA1m \u0111i\u1EC7n tho\u1EA1i c\u1EA5p c\u1EE9u g\u1EA7n nh\u1EA5t theo h\u01B0\u1EDBng m\u0169i t\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("N\u00E4chster Parkplatz in Pfeilrichtung","N\u01A1i \u0111\u1EADu xe g\u1EA7n nh\u1EA5t theo h\u01B0\u1EDBng m\u0169i t\u00EAn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("N\u00E4chste Ausfahrt in Pfeilrichtung","L\u1ED1i ra \u0111\u01B0\u1EDDng cao t\u1ED1c (Ausfahrt) theo h\u01B0\u1EDBng m\u0169i t\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(796);
	    	
	    	q.setName("2.5.01-003");

			q.setText(new TranslatedString("Welche Effekte treten beim Fahren mit hoher Geschwindigkeit auf?","Nh\u1EEFng \u1EA3nh h\u01B0\u1EDFng n\u00E0o g\u00E2y ra do vi\u1EC7c ch\u1EA1y xe nhanh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Erh\u00F6hter Kraftstoffverbrauch","T\u0103ng m\u1EE9c s\u1EED d\u1EE5ng nhi\u00EAn li\u1EC7u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Erh\u00F6hter Schadstoffaussto\u00DF","T\u0103ng l\u01B0\u1EE3ng kh\u00ED th\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verringerter L\u00E4rmpegel","Gi\u1EA3m ti\u1EBFng \u1ED3n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(797);
	    	
	    	q.setName("2.5.01-004");

			q.setText(new TranslatedString("Wodurch l\u00E4sst sich Kraftstoff einsparen?","C\u00E1i g\u00EC gi\u00FAp ti\u1EBFt ki\u1EC7m nhi\u00EAn li\u1EC7u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch fr\u00FChes Hochschalten","Nhanh ch\u00F3ng t\u0103ng s\u1ED1")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch sp\u00E4tes Zur\u00FCckschalten","Ch\u1EADm v\u1EC1 s\u1ED1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch h\u00E4ufiges Fahren im oberen Drehzahlbereich","Th\u01B0\u1EDDng ch\u1EA1y v\u1EDBi s\u1ED1 cao")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(798);
	    	
	    	q.setName("2.5.01-005");

			q.setText(new TranslatedString("Wodurch kann L\u00E4rm vermieden werden?","C\u00E1i g\u00EC c\u00F3 th\u1EC3 tr\u00E1nh g\u00E2y \u1ED3n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Starkes Beschleunigen m\u00F6glichst vermeiden","N\u1EBFu c\u00F3 th\u1EC3, tr\u00E1nh t\u0103ng t\u1ED1c nhanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Abschalten des Motors bei l\u00E4ngerem Warten oder Halten","T\u1EAFt \u0111\u1ED9ng c\u01A1 khi ch\u1EDD l\u00E2u ho\u1EB7c d\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Fahren mit hoher Drehzahl","\u0110i v\u1EDBi s\u1ED1 cao")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(799);
	    	
	    	q.setName("2.5.01-006");

			q.setText(new TranslatedString("Wodurch wird vermeidbarer L\u00E4rm verursacht?","Nh\u1EEFng g\u00EC g\u00E2y ra ti\u1EBFng \u1ED3n c\u00F3 th\u1EC3 tr\u00E1nh \u0111\u01B0\u1EE3c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Fahren mit defekter Auspuffanlage","L\u00E1i xe v\u1EDBi \u1ED1ng b\u00F4 b\u1ECB h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch \u201ESpielen\u201C mit dem Gas im Stand","Ngh\u1ECBch ga khi d\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Hupen bei Gefahr","B\u00F3p c\u00F2i khi th\u1EA5y nguy hi\u1EC3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(800);
	    	
	    	q.setName("2.5.01-007");

			q.setText(new TranslatedString("Warum ist scharfes Anfahren zu vermeiden?","T\u1EA1i sao n\u00EAn tr\u00E1nh kh\u1EDFi \u0111\u1ED9ng v\u1ED9i v\u00E3?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil der entstehende L\u00E4rm andere bel\u00E4stigt","V\u00EC ti\u1EBFng \u1ED3n \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn ng\u01B0\u1EDDi kh\u00E1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil st\u00E4rkerer Reifenverschlei\u00DF entsteht","V\u00EC g\u00E2y m\u00F2n l\u1ED1p nhi\u1EC1u h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil dadurch die Hinterradbremse stark belastet wird","V\u00EC l\u00E0m phanh h\u1EADu r\u1EA5t n\u1EB7ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
