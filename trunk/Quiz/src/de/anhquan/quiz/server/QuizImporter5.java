package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter5 {

	static {
		
				
		//Question 1.4.42-131
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(501);
	    	
	    	q.setName("1.4.42-131");

			q.setText(new TranslatedString("Was ist bei diesem Verkehrszeichen zu tun?","L\u00E0m g\u00EC v\u1EDBi bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-131.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sonnenbrille abnehmen","B\u1ECF k\u00EDnh r\u00E2m ra")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abblendlicht einschalten","B\u1EADt \u0111\u00E8n pha Abblendlicht")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Warnblinklicht einschalten","B\u1EADn \u0111\u00E8n c\u1EA3nh b\u00E1o Warnblinklicht")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-132
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(502);
	    	
	    	q.setName("1.4.42-132");

			q.setText(new TranslatedString("Sie fahren in einen so gekennzeichneten, hell erleuchteten Tunnel. \nWie verhalten Sie sich?","Sie fahren in einen so gekennzeichneten, hell erleuchteten Tunnel.\nB\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-132.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich fahre mit Abblendlicht","Ich fahre mit Abblendlicht")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich fahre ohne Licht","Ich fahre ohne Licht")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich fahre mit Tagfahrlicht","Ich fahre mit Tagfahrlicht")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.43-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(503);
	    	
	    	q.setName("1.4.43-101");

			q.setText(new TranslatedString("Worauf k\u00F6nnen rot-wei\u00DFe Warntafeln an Fahrzeugen hinweisen?","D\u1EA5u hi\u1EC7u s\u1ECDc tr\u1EAFng \u0111\u1ECF d\u00E1n tr\u00EAn 1 xe cho ta bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Anh\u00E4nger, der innerhalb einer geschlossenen Ortschaft auf\nder Fahrbahn abgestellt ist","C\u00F3 r\u01A1-mooc, m\u00E0 \u0111\u1ED3 ch\u1EDF b\u00EAn trong \u0111\u01B0\u1EE3c d\u1EE1 xu\u1ED1ng tr\u00EAn \u0111\u01B0\u1EDDng \u1EDF trong khu \u0111\u00F4 th\u1ECB")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf ein Fahrzeug mit \u00DCberbreite","Xe \u1EDF b\u1EC1 ngang m\u1EDF r\u1ED9ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf ein Gefahrgutfahrzeug","Xe ch\u1EDF h\u00E0ng nguy hi\u1EC3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(504);
	    	
	    	q.setName("1.5.01-001");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie im Interesse der Umweltschonung achten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi quan t\u00E2m \u0111\u1EBFn b\u1EA3o v\u1EC7 m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("L\u00E4ngeres Laufenlassen des Motors im Stand vermeiden","Tr\u00E1nh s\u1EED d\u1EE5ng \u0111\u1ED9ng c\u01A1 qu\u00E1 l\u00E2u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unn\u00FCtzes Hin- und Herfahren vermeiden","Tr\u00E1nh \u0111i t\u1EDBi \u0111i lui m\u1ED9t c\u00E1ch v\u00F4 ngh\u0129a (kh\u00F4ng c\u1EA7n thi\u1EBFt)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("H\u00E4ufig mit hoher Drehzahl fahren","L\u00E1i xe th\u01B0\u1EDDng xuy\u00EAn v\u1EDBi v\u1EADn t\u1ED1c v\u00F2ng quay cao (s\u1ED1 cao)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(505);
	    	
	    	q.setName("1.5.01-002");

			q.setText(new TranslatedString("Wodurch k\u00F6nnen Sie bei l\u00E4ngerem Warten vor geschlossenen \nBahnschranken die Umwelt schonen und Kraftstoff sparen?","B\u1EA1n l\u00E0m g\u00EC \u0111\u1EC3 b\u1EA3o v\u1EC7 m\u00F4i tr\u01B0\u1EDDng v\u00E0 ti\u1EBFt ki\u1EC7m nhi\u00EAn li\u1EC7u khi ch\u1EDD l\u00E2u \u1EDF barrier \u0111\u01B0\u1EDDng t\u00E0u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Abstellen des Motors","T\u1EAFt \u0111\u1ED9ng c\u01A1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Schalten in den Leerlauf","Chuy\u1EC3n sang ch\u1EA1y theo qu\u00E1n t\u00EDnh (\u0111\u1ED9ng c\u01A1 ng\u1EEBng ho\u1EA1t \u0111\u1ED9ng)")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(506);
	    	
	    	q.setName("1.5.01-003");

			q.setText(new TranslatedString("Was muss regelm\u00E4\u00DFig gewartet werden, um zu hohen \nKraftstoffverbrauch und \u00FCberm\u00E4\u00DFigen Schadstoffaussto\u00DF zu \nvermeiden?","C\u00E1i g\u00EC ph\u1EA3i \u0111\u01B0\u1EE3c b\u1EA3o d\u01B0\u1EE1ng th\u01B0\u1EDDng xuy\u00EAn, \u0111\u1EC3 t\u0103ng hi\u1EC7u qu\u1EA3 nhi\u00EAn li\u1EC7u v\u00E0 gi\u1EA3m kh\u00ED th\u1EA3i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Motor-Luftfilter","B\u1ED9 l\u1ECDc kh\u00ED m\u00F4-t\u01A1")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vergaser oder Einspritzanlage","B\u1ED9 ch\u1EBF h\u00F2a kh\u00ED hay b\u1ED9 tr\u1ED9n nhi\u00EAn li\u1EC7u trong")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Z\u00FCndanlage","H\u1EC7 th\u1ED1ng \u0111\u00E1nh l\u1EEDa")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(507);
	    	
	    	q.setName("1.5.01-004");

			q.setText(new TranslatedString("Wie wirkt sich eine wesentliche Unterschreitung des empfohlenen \nReifendrucks aus?","L\u1ED1p xe kh\u00F4ng \u0111\u1EE7 \u0111\u1ED9 c\u0103ng c\u1EA7n thi\u1EBFt s\u1EBD \u1EA3nh h\u01B0\u1EDFng th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Kraftstoffverbrauch nimmt zu","T\u0103ng m\u1EE9c \u0111\u1ED9 s\u1EED d\u1EE5ng nhi\u00EAn li\u1EC7u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Reifenabrieb nimmt zu","T\u0103ng \u0111\u1ED9 m\u00F2n c\u1EE7a l\u1ED1p xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Schadstoffaussto\u00DF nimmt ab","Gi\u1EA3m kh\u00ED th\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(508);
	    	
	    	q.setName("1.5.01-005");

			q.setText(new TranslatedString("Wann sollten Sie den Motor abstellen, um Kraftstoff zu sparen und \ndie Umweltbelastung zu vermindern?","Khi n\u00E0o b\u1EA1n n\u00EAn t\u1EAFt \u0111\u1ED9ng c\u01A1, \u0111\u1EC3 ti\u1EBFt ki\u1EC7m nhi\u00EAn li\u1EC7u v\u00E0 gi\u1EA3m kh\u00ED th\u1EA3i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie in einem Verkehrsstau l\u00E4nger warten m\u00FCssen","Khi b\u1EA1n ph\u1EA3i ch\u1EDD l\u00E2u l\u00FAc k\u1EB9t xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie vor Bahn\u00FCberg\u00E4ngen oder Baustellen warten m\u00FCssen","Khi b\u1EA1n ph\u1EA3i ch\u1EDD t\u00E0u \u0111i qua \u0111\u01B0\u1EDDng ho\u1EB7c ch\u1EDD \u1EDF c\u00F4ng tr\u01B0\u1EDDng x\u00E2y d\u1EF1ng tr\u00EAn \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Sie bei einem STOP-Schild anhalten","Khi b\u1EA1n d\u1EEBng \u1EDF bi\u1EC3n STOP")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(509);
	    	
	    	q.setName("1.5.01-006");

			q.setText(new TranslatedString("Ihr Kraftfahrzeug verliert etwas \u00D6l. Wie viel Trinkwasser kann \nbereits durch einen Tropfen \u00D6l ungenie\u00DFbar werden? \nBis zu","Xe c\u1EE7a b\u1EA1n ti\u00EAu th\u1EE5 m\u1ED9t s\u1ED1 l\u01B0\u1EE3ng d\u1EA7u. Bao nhi\u00EAu n\u01B0\u1EDBc c\u1EA7n \u0111\u1EC3 l\u00E0m ra 1 gi\u1ECDt d\u1EA7u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("600 Liter","L\u00EAn \u0111\u1EBFn 600 l\u00EDt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("50 Liter","L\u00EAn \u0111\u1EBFn 50 l\u00EDt")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("1 Liter","L\u00EAn \u0111\u1EBFn 1 l\u00EDt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(510);
	    	
	    	q.setName("1.5.01-007");

			q.setText(new TranslatedString("Was soll man beim Tanken beachten?","Ch\u00FAng ta c\u1EA7n ch\u00FA \u00FD g\u00EC \u1EDF tr\u1EA1m x\u0103ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Keine Kraftstoffd\u00E4mpfe einatmen","Kh\u00F4ng \u0111\u01B0\u1EE3c h\u00EDt h\u01A1i x\u0103ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nicht nachtanken, wenn der Tank voll ist und die Zapfpistole\nabgeschaltet hat","Kh\u00F4ng \u0111\u1ED5 x\u0103ng, khi b\u00ECnh x\u0103ng \u0111\u1EA7y v\u00E0 v\u00F2i b\u01A1m x\u0103ng \u0111\u00E3 t\u1EAFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("m\u00F6glichst randvoll tanken","\u0111\u1ED5 \u0111\u1EA7y x\u0103ng \u0111\u1EBFn m\u1EE9c t\u1ED1i \u0111a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(511);
	    	
	    	q.setName("1.5.01-008");

			q.setText(new TranslatedString("An einem Fahrzeug sind Motor und Schalld\u00E4mpfer \u201Efrisiert\u201C. \nWelche Folgen kann das haben?","Trong xe, \u0111\u1ED9ng c\u01A1 v\u00E0 b\u1ED9 ph\u1EADm gi\u1EA3m \u00E2m \u0111\u01B0\u1EE3c t\u00E2n trang (\u201Efrisiert\u201C).\n\u0110i\u1EC1u g\u00EC sau \u0111\u00E2y c\u00F3 th\u1EC3 c\u00F3?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die L\u00E4rmbel\u00E4stigung nimmt zu","T\u0103ng m\u1EE9c \u00F4 nhi\u1EC5m ti\u1EBFng \u1ED3n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Schadstoffaussto\u00DF wird gr\u00F6\u00DFer","Kh\u00ED th\u1EA3i nhi\u1EC1u h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Kraftstoffverbrauch sinkt erheblich","Ti\u00EAu th\u1EE5 nhi\u00EAn li\u1EC7u gi\u1EA3m t\u01B0\u01A1ng \u0111\u1ED1i nhi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(512);
	    	
	    	q.setName("1.5.01-101");

			q.setText(new TranslatedString("Andere Fahrer machen Sie auf anhaltend starkes Qualmen Ihres \nAuspuffs aufmerksam. Was m\u00FCssen Sie tun?","L\u00E1i xe kh\u00E1c gi\u00FAp b\u1EA1n nh\u1EADn ra r\u1EB1ng xe b\u1EA1n li\u00EAn t\u1EE5c th\u1EA3i kh\u00F3i ra nhi\u1EC1u. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Motor umgehend \u00FCberpr\u00FCfen lassen","L\u1EADp t\u1EE9c ki\u1EC3m tra m\u00F4-t\u01A1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sofort die Kraftstoffmarke wechseln","L\u1EADp t\u1EE9c lo\u1EA1i x\u0103ng kh\u00E1c")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nichts, weil niemand gef\u00E4hrdet wird","Kh\u00F4ng l\u00E0m g\u00EC, v\u00EC ch\u1EB3ng ai b\u1ECB nguy hi\u1EC3m c\u1EA3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(513);
	    	
	    	q.setName("1.5.01-102");

			q.setText(new TranslatedString("Wodurch kann beim Fahren eine vermeidbare L\u00E4rmbel\u00E4stigung \nentstehen?","Khi l\u00E1i xe, nh\u1EEFng y\u1EBFu t\u1ED1 g\u00E2y \u00F4 nhi\u1EC5m ti\u1EBFng \u1ED3n n\u00E0o c\u00F3 th\u1EC3 tr\u00E1nh \u0111\u01B0\u1EE3c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch unn\u00F6tig starkes Beschleunigen","T\u0103ng t\u1ED1c nhanh m\u1ED9t c\u00E1ch kh\u00F4ng c\u1EA7n thi\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch schadhafte Schalld\u00E4mpfer","\u1ED0ng b\u00F4 b\u1ECB h\u1ECFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Fahren mit niedriger Drehzahl","\u0110i xe v\u1EDBi v\u1EADn t\u1ED1c v\u00F2ng quay nh\u1ECF")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(514);
	    	
	    	q.setName("1.5.01-103");

			q.setText(new TranslatedString("Wie soll man schalten, um besonders umweltbewusst und sparsam \nzu fahren?","L\u00E0m sao \u0111\u1EC3 khi chuy\u1EC3n s\u1ED1, v\u1EEBa ti\u1EBFt ki\u1EC7m v\u1EEBa th\u00E2n thi\u1EC7n v\u1EDBi m\u00F4i tr\u01B0\u1EDDng nh\u1EA5t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("So fr\u00FCh wie m\u00F6glich hochschalten","L\u00EAn s\u1ED1 c\u00E0ng s\u1EDBm c\u00E0ng t\u1ED1t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("So sp\u00E4t wie m\u00F6glich zur\u00FCckschalten","Gi\u1EA3m s\u1ED1 c\u00E0ng tr\u1EC5 c\u00E0ng t\u1ED1t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Gange bis in den oberen Drehzahlbereich ausfahren und dann\nschalten","Th\u1EA3 s\u1ED1 \u0111\u1EBFn kho\u1EA3ng t\u1ED1c \u0111\u1ED9 quay l\u1EDBn, r\u1ED3i sang s\u1ED1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(515);
	    	
	    	q.setName("1.5.01-104");

			q.setText(new TranslatedString("Was ist f\u00FCr umweltschonendes und energiesparendes Fahren \nwichtig?","\u0110i\u1EC1u g\u00EC quan tr\u1ECDng \u0111\u1ED1i v\u1EDBi l\u00E1i xe th\u00E2n thi\u1EC7n v\u1EDBi m\u00F4i tr\u01B0\u1EDDng v\u00E0 ti\u1EBFt ki\u1EC7m n\u0103ng l\u01B0\u1EE3ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kraftstoffverbrauch regelm\u00E4\u00DFig kontrollieren","Th\u01B0\u1EDDng xuy\u00EAn ki\u1EC3m tra m\u1EE9c \u0111\u1ED9 ti\u00EAu th\u1EE5 nhi\u00EAn li\u1EC7u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Regelm\u00E4\u00DFig Motoreinstellung \u00FCberpr\u00FCfen lassen","Th\u01B0\u1EDDng xuy\u00EAn ki\u1EC3m tra thi\u1EBFt l\u1EADp c\u1EE7a m\u00F4-t\u01A1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Regelm\u00E4\u00DFige Motorw\u00E4sche, mindestens viermal im Jahr","Th\u01B0\u1EDDng xuy\u00EAn r\u1EEDa \u0111\u1ED9ng c\u01A1, \u00EDt nh\u1EA5t 4 l\u1EA7n trong 1 n\u0103m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(516);
	    	
	    	q.setName("1.5.01-105");

			q.setText(new TranslatedString("In welchen Drehzahlbereichen des Motors ist der \nKraftstoffverbrauch g\u00FCnstiger?","\u1EDE kho\u1EA3ng t\u1ED1c \u0111\u1ED9 v\u00F2ng quay n\u00E0o c\u1EE7a m\u00F4-t\u01A1 th\u00EC ti\u00EAu th\u1EE5 n\u0103ng l\u01B0\u1EE3ng \u00EDt h\u01A1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In niedrigeren","Kho\u1EA3ng th\u1EA5p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In h\u00F6heren","Kho\u1EA3ng cao")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(517);
	    	
	    	q.setName("1.5.01-106");

			q.setText(new TranslatedString("Wodurch wird Kraftstoff verschwendet und die Umwelt belastet?","\u0110i\u1EC1u g\u00EC g\u00E2y l\u00E3ng ph\u00ED nhi\u00EAn li\u1EC7u v\u00E0 t\u1ED5n h\u1EA1i m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch hektische Fahrweise","C\u00E1ch l\u00E1i xe v\u1ED9i v\u00E0ng h\u1EA5p t\u1EA5p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn beim Warten vor Ampeln \u201Emit dem Gas gespielt\u201C wird","Khi ch\u1EDD \u1EDF ch\u1ED1t \u0111\u00E8n xanh \u0111\u00E8n \u0111\u1ECF, \"ngh\u1ECBch v\u1EDBi gas\"")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn bergab im gro\u00DFen Gang gefahren wird","Khi xu\u1ED1ng d\u1ED1c, \u0111i v\u1EDBi s\u1ED1 cao")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(518);
	    	
	    	q.setName("1.5.01-107");

			q.setText(new TranslatedString("Wodurch erreichen Sie einen g\u00FCnstigen Kraftstoffverbrauch und \ngeringen Schadstoffaussto\u00DF?","L\u00E0m g\u00EC \u0111\u1EC3 ti\u1EBFt ki\u1EC7m nhi\u00EAn li\u1EC7u v\u00E0 g\u00E2y \u00EDt kh\u00ED th\u1EA3i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch einen technisch einwandfreien und richtig eingestellten Motor","M\u00F4-t\u01A1 \u0111\u01B0\u1EE3c thi\u1EBFt l\u1EADp \u0111\u00FAng v\u00E0 kh\u00F4ng c\u00F3 l\u1ED7i v\u1EC1 m\u1EB7t k\u1EF9 thu\u1EADt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch eine ausgeglichene Fahrweise in niedrigen Drehzahlbereichen","C\u00E1ch l\u00E1i xe c\u00E2n b\u1EB1ng trong kho\u1EA3ng v\u1EADn t\u1ED1c quay th\u1EA5p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch volles Ausfahren aller G\u00E4nge","\u0110i h\u1EBFt s\u1ED1 (\u0111i v\u1EDBi s\u1ED1 cao nh\u1EA5t!?!)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(519);
	    	
	    	q.setName("1.5.01-108");

			q.setText(new TranslatedString("Was weist auf \u00FCberh\u00F6hten Kraftstoffverbrauch wegen starkem \nVerschlei\u00DF oder falscher Einstellung des Motors hin?","\u0110i\u1EC1u g\u00EC cho th\u1EA5y s\u1EF1 l\u00E3ng ph\u00ED nhi\u00EAn li\u1EC7u ho\u1EB7c \u0111i\u1EC1u ch\u1EC9nh \u0111\u1ED9ng c\u01A1 sai?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Starker, dunkler Auspuffqualm","Kh\u00F3i th\u1EA3i \u0111en \u0111\u1EB7c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kondenswasser, das aus dem Auspuff kommt","N\u01B0\u1EDBc ng\u01B0ng t\u1EE5 \u1EDF n\u01A1i c\u00F3 kh\u00F3i xe th\u1EA3i ra")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(520);
	    	
	    	q.setName("1.5.01-109");

			q.setText(new TranslatedString("Welche Fahrweise f\u00FChrt zu hohem Kraftstoffverbrauch?","C\u00E1ch l\u00E1i xe n\u00E0o d\u1EABn \u0111\u1EBFn vi\u1EC7c ti\u00EAu th\u1EE5 nhi\u1EC1u nhi\u00EAn li\u1EC7u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rasantes Anfahren und unn\u00F6tiges Beschleunigen","Kh\u1EDFi \u0111\u1ED9ng nhanh v\u00E0 t\u0103ng t\u1ED1c kh\u00F4ng c\u1EA7n thi\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Volles Ausfahren aller G\u00E4nge","\u0110i h\u1EBFt s\u1ED1 !?!")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahren mit hoher Geschwindigkeit","\u0110i v\u1EDBi t\u1ED1c \u0111\u1ED9 cao")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(521);
	    	
	    	q.setName("1.5.01-110");

			q.setText(new TranslatedString("Wie fahren Sie umweltbewusst?","B\u1EA1n l\u00E1i xe nh\u01B0 th\u1EBF n\u00E0o \u0111\u1EC3 th\u00E2n thi\u1EC7n v\u1EDBi m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rechtzeitig Gas wegnehmen und Schwung ausnutzen, wenn die\nn\u00E4chste Ampel \u201ERot\u201C zeigt","Nh\u1EA3 ga \u0111\u00FAng l\u00FAc v\u00E0 t\u1EADn d\u1EE5ng \u0111\u00E0 ch\u1EA1y c\u1EE7a xe (qu\u00E1n t\u00EDnh), khi nh\u00ECn th\u1EA5y \u0111\u00E8n giao th\u00F4ng k\u1EBF ti\u1EBFp chuy\u1EC3n \u0111\u1ECF")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("unn\u00F6tiges Beschleunigen und unn\u00F6tiges Abbremsen vermeiden","Tr\u00E1nh t\u0103ng t\u1ED1c v\u00E0 phanh kh\u00F4ng c\u1EA7n thi\u1EBFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei \u201EGr\u00FCn\u201C immer voll beschleunigen","Khi \u0111\u00E8n xanh lu\u00F4n t\u0103ng t\u1ED1c t\u1ED1i \u0111a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(522);
	    	
	    	q.setName("1.5.01-111");

			q.setText(new TranslatedString("W\u00E4hrend der Hauptverkehrszeiten verbraucht Ihr Fahrzeug im \nStadtverkehr mehr Kraftstoff als sonst. Warum?","V\u00E0o gi\u1EDD cao \u0111i\u1EC3m, xe b\u1EA1n \u0111i trong th\u00E0nh ph\u1ED1 s\u1EBD ti\u00EAu th\u1EE5 nhi\u00EAn li\u1EC7u nhi\u1EC1u h\u01A1n c\u00E1c gi\u1EDD kh\u00E1c. T\u1EA1i sao?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil h\u00E4ufiger gebremst und beschleunigt werden muss","Do ph\u1EA3i phanh v\u00E0 t\u0103ng t\u1ED1c th\u01B0\u1EDDng xuy\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil \u00F6fter in h\u00F6heren G\u00E4ngen gefahren werden muss","Do ph\u1EA3i th\u01B0\u1EDDng xuy\u00EAn h\u01A1n l\u00E1i v\u1EDBi s\u1ED1 cao")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(523);
	    	
	    	q.setName("1.5.01-112");

			q.setText(new TranslatedString("Wie lassen sich mit weniger Kraftstoff mehr Kilometer fahren?","L\u00E0m c\u00E1ch n\u00E0o \u0111\u1EC3 \u0111i \u0111\u01B0\u1EE3c nhi\u1EC1u kilomet h\u01A1n v\u1EDBi \u00EDt nhi\u00EAn li\u1EC7u h\u01A1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("So beschleunigen, dass rasch der h\u00F6chstm\u00F6gliche Gang erreicht wird","T\u0103ng t\u1ED1c, nhanh ch\u00F3ng \u0111i\u1EC1u  beschleunigen, dass rasch der h\u00F6chstm\u00F6gliche Gang erreicht wird")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorausschauend fahren, um h\u00E4ufiges Beschleunigen und Bremsen zu\nvermeiden","Khi l\u00E1i xe ph\u1EA3i d\u1EF1 \u0111o\u00E1n tr\u01B0\u1EDBc, \u0111\u1EC3 tr\u00E1nh t\u0103ng t\u1ED1c v\u00E0 phanh li\u00EAn t\u1EE5c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Alle G\u00E4nge voll ausfahren","Alle G\u00E4nge voll ausfahren")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(524);
	    	
	    	q.setName("1.5.01-113");

			q.setText(new TranslatedString("Was k\u00F6nnen Sie tun, um die Umwelt zu schonen?","B\u1EA1n c\u00F3 th\u1EC3 l\u00E0m g\u00EC, \u0111\u1EC3 l\u00E0m \u0111\u1EB9p m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kurzstreckenfahrten, z.B. zum nahe gelegenen Briefkasten,\nvermeiden","Tr\u00E1nh l\u00E1i xe \u0111\u01B0\u1EDDng t\u1EAFt, ch\u1EB3ng h\u1EA1n \u0111\u1EC3 \u0111\u1EBFn th\u00F9ng th\u01B0 \u1EDF g\u1EA7n.")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahren mit Vollgas vermeiden","Tr\u00E1nh \u0111i h\u1EBFt ga (\u0111\u1EA1p ch\u00E2n ga h\u1EBFt c\u1EE1)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrten in \u00FCberf\u00FCllte Innenst\u00E4dte vermeiden","Tr\u00E1nh l\u00E1i xe v\u00E0o b\u00EAn trong th\u00E0nh ph\u1ED1 qu\u00E1 \u0111\u00F4ng ng\u01B0\u1EDDi")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.5.01-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(525);
	    	
	    	q.setName("1.5.01-114");

			q.setText(new TranslatedString("Was kann dazu beitragen, Kraftstoff zu sparen und die \nUmweltbelastung zu verringern?","\u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 gi\u00FAp ti\u1EBFt ki\u1EC7m nhi\u00EAn li\u1EC7u v\u00E0 gi\u1EA3m \u00F4 nhi\u1EC5m m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schon beim Kauf eines Kraftfahrzeugs auf den Kraftstoffverbrauch\nachten","Khi mua xe ph\u1EA3i ch\u00FA \u00FD m\u1EE9c ti\u00EAu th\u1EE5 nhi\u00EAn li\u1EC7u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch vorausschauende Fahrweise zu einem gleichm\u00E4\u00DFigen\nVerkehrsfluss beitragen","L\u00E1i xe v\u1EC1 ph\u00EDa tr\u01B0\u1EDBc \u0111\u1EC3 t\u1EA1o d\u00F2ng ch\u1EA3y giao th\u00F4ng th\u00F4ng su\u1ED1t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach M\u00F6glichkeit \u00F6ffentliche Verkehrsmittel benutzen, mit dem\nFahrrad fahren oder zu Fu\u00DF gehen","N\u1EBFu c\u00F3 th\u1EC3 th\u00EC s\u1EED d\u1EE5ng ph\u01B0\u01A1ng ti\u1EC7n giao th\u00F4ng c\u00F4ng c\u1ED9ng, \u0111i xe \u0111\u1EA1p ho\u1EB7c \u0111i b\u1ED9")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.7.01-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(526);
	    	
	    	q.setName("1.7.01-001");

			q.setText(new TranslatedString("N\u00E4sse kann die Wirkung von Trommelbremsen beeintr\u00E4chtigen. \nWas ist zu tun?","\u01AF\u1EDBt c\u00F3 th\u1EC3 \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn hi\u1EC7u qu\u1EA3 c\u1EE7a m\u00E1 phanh."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Bremse vorsichtig trocken fahren","Phanh ph\u1EA3i \u0111\u01B0\u1EE3c ch\u00FA \u00FD lu\u00F4n kh\u00F4")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Bremse mehrfach im Stand bet\u00E4tigen","S\u1EED d\u1EE5ng phanh nhi\u1EC1u l\u1EA7n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bremsfl\u00FCssigkeit nachf\u00FCllen","?\n\u0110\u1ED5 \u0111\u1EA7y d\u1EA7u phanh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.7.01-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(527);
	    	
	    	q.setName("1.7.01-003");

			q.setText(new TranslatedString("Wodurch wird die Gr\u00F6\u00DFe der Fliehkraft in Kurven beeinflusst?","\u0110i\u1EC1u g\u00EC \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn \u0111\u1ED9 l\u1EDBn c\u1EE7a l\u1EF1c ly t\u00E2m trong v\u00F2ng cua?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch den Kurvenradius","B\u00E1n k\u00EDnh v\u00F2ng cua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch die Geschwindigkeit","T\u1ED1c \u0111\u1ED9 xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch den Fahrtwind","Lu\u1ED3ng kh\u00F4ng kh\u00ED")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.7.01-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(528);
	    	
	    	q.setName("1.7.01-004");

			q.setText(new TranslatedString("Sie fahren auf einer Landstra\u00DFe. Pl\u00F6tzlich f\u00E4hrt vor Ihnen ein \nTraktor auf die Stra\u00DFe. Wie erreichen Sie einen m\u00F6glichst kurzen \nBremsweg?","B\u1EA1n \u0111ang \u0111i tr\u00EAn Landstra\u00DFe. \n\u0110\u1ED9t nhi\u00EAn tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 m\u1ED9t xe m\u00E1y c\u00E0y tr\u00EAn \u0111\u01B0\u1EDDng. L\u00E0m sao \u0111\u1EC3 c\u00F3 \u0111\u01B0\u1EDDng phanh ng\u1EAFn nh\u1EA5t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sofort kr\u00E4ftig bremsen und allm\u00E4hlich nachlassen, wenn die Situation\nes zul\u00E4sst (degressives Bremsen)","L\u1EADp t\u1EE9c phanh v\u00E0 nh\u1EA3 phanh t\u1EEB t\u1EEB, khi t\u00ECnh hu\u1ED1ng cho ph\u00E9p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Erst vorsichtig und dann zunehmend kr\u00E4ftiger bremsen (progressives\nBremsen)","\u0110\u1EA7u ti\u00EAn c\u1EA9n th\u1EADn ch\u00FA \u00FD v\u00E0 sau \u0111\u00F3 \u0111\u1EA1p phanh m\u1EA1nh d\u1EA7n l\u00EAn (phanh g\u1EA5p)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In kurzen Abst\u00E4nden mehrfach kr\u00E4ftig bremsen (Stotterbremse)","\u1EDE kho\u1EA3ng c\u00E1ch g\u1EA7n, phanh m\u1EA1nh nhi\u1EC1u l\u1EA7n (phanh nh\u1EA5p)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.8.01-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(529);
	    	
	    	q.setName("1.8.01-001");

			q.setText(new TranslatedString("Was wird in das Verkehrszentralregister eingetragen?","$esc.java($quiz.translatedQuestion)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Straftaten im Zusammenhang mit der Teilnahme am Stra\u00DFenverkehr","Straftaten li\u00EAn quan \u0111\u1EBFn ng\u01B0\u1EDDi tham gia giao th\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verkehrsordnungswidrigkeiten mit Bu\u00DFgeld","Ti\u1EC1n ph\u1EA1t do g\u00E2y r\u1ED1i tr\u1EADt t\u1EF1 giao th\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrsordnungswidrigkeiten mit Verwarnungsgeld","Ti\u1EC1n c\u1EA3nh c\u00E1o do g\u00E2y r\u1ED1i tr\u1EADt t\u1EF1 giao th\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.8.01-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(530);
	    	
	    	q.setName("1.8.01-002");

			q.setText(new TranslatedString("Wann werden im Verkehrszentralregister eingetragene \nOrdnungswidrigkeiten fr\u00FChestens getilgt?","S\u1EDBm nh\u1EA5t l\u00E0 khi n\u00E0o m\u1ED9t Ordnungswidrigkeiten \u0111\u00E3 \u0111\u0103ng k\u00FD \u0111\u01B0\u1EE3c x\u00F3a \u1EDF trung t\u00E2m \u0111\u0103ng k\u00FD xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach zwei Jahren","Sau 2 n\u0103m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach einem Jahr","Sau 1 n\u0103m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach f\u00FCnf Jahren","Sau 5 n\u0103m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.01-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(531);
	    	
	    	q.setName("2.1.01-001");

			q.setText(new TranslatedString("Was kann in Kurven zum Schleudern f\u00FChren?","\u0110i\u1EC1u g\u00EC d\u1EABn \u0111\u1EBFn b\u1ECB tr\u01B0\u1EE3t trong v\u00F2ng cua?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Defekte Sto\u00DFd\u00E4mpfer","Phu\u1ED9c nh\u00FAn gi\u1EA3m s\u00F3c b\u1ECB h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu niedriger oder stark unterschiedlicher Reifendruck","C\u00E1c b\u00E1nh \u0111\u01B0\u1EE3c b\u01A1m qu\u00E1 non hay qu\u00E1 c\u0103ng kh\u00F4ng \u0111\u1EC1u nhau")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zu geringe Beladung","\u00CDt t\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.01-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(532);
	    	
	    	q.setName("2.1.01-002");

			q.setText(new TranslatedString("Warum m\u00FCssen Sie besonders vorsichtig sein, wenn Sie ein Ihnen \nunbekanntes Fahrzeug fahren wollen?","T\u1EA1i sao b\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD khi l\u00E1i xe l\u1EA1?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Bedienungseinrichtungen und die Abmessungen des\nFahrzeugs ungewohnt sein k\u00F6nnen","V\u00EC b\u1EA1n kh\u00F4ng quen v\u1EDBi c\u00E1ch \u0111i\u1EC1u khi\u1EC3n v\u00E0 k\u00EDch th\u01B0\u1EDBc c\u1EE7a xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Sie noch nicht wissen, wie das Fahrzeug beim Bremsen reagiert","V\u00EC b\u1EA1n kh\u00F4ng bi\u1EBFt tr\u01B0\u1EDBc \u0111\u01B0\u1EE3c xe s\u1EBD ph\u1EA3n \u1EE9ng th\u1EBF n\u00E0o khi phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Sie noch nicht wissen, wie sich das Fahrzeug bei h\u00F6herer\nGeschwindigkeit in Kurven verh\u00E4lt","V\u00EC b\u1EA1n kh\u00F4ng bi\u1EBFt tr\u01B0\u1EDBc \u0111\u01B0\u1EE3c, xe s\u1EBD th\u1EBF n\u00E0o khi \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 cao v\u00E0o cua")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.01-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(533);
	    	
	    	q.setName("2.1.01-003");

			q.setText(new TranslatedString("Was kann in Kurven zum Schleudern f\u00FChren?","\u0110i\u1EC1u g\u00EC d\u1EABn \u0111\u1EBFn b\u1ECB tr\u01B0\u1EE3t trong v\u00F2ng cua?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Starkes Bremsen","Phanh g\u1EA5p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schnelles Fahren auf nasser Fahrbahn","\u0110i nhanh tr\u00EAn \u0111\u01B0\u1EDDng \u01B0\u1EDBt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Leichtes Beschleunigen am Kurvenausgang","T\u0103ng t\u1ED1c nh\u1EB9 \u1EDF cu\u1ED1i \u0111o\u1EA1n cua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.01-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(534);
	    	
	    	q.setName("2.1.01-004");

			q.setText(new TranslatedString("Wodurch kann eine Gef\u00E4hrdung entstehen?","\u0110i\u1EC1u g\u00EC d\u1EABn \u0111\u1EBFn nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Kurvenschneiden","C\u1EAFt cua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch zu sp\u00E4tes Abblenden","Gi\u1EA3m t\u1ED1c qu\u00E1 tr\u1EC5 (?!?!?!?)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch zu gro\u00DFen Abstand nach vorn","Gi\u1EEF kho\u1EA3ng c\u00E1ch an to\u00E0n qu\u00E1 l\u1EDBn v\u1EDBi xe ph\u00EDa tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.01-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(535);
	    	
	    	q.setName("2.1.01-005");

			q.setText(new TranslatedString("Wie verhalten Sie sich hier, wenn der wei\u00DFe Pkw nicht stehen \nbleibt?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o? hier, khi xe Pkw m\u00E0u tr\u1EAFng kh\u00F4ng d\u1EEBng l\u1EA1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.01-005.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit verringern, auf die Vorfahrt verzichten","Gi\u1EA3m t\u1ED1c, nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Hupen und versuchen, noch vor dem Pkw vorbeizukommen","B\u00F3p c\u00F2i v\u00E0 c\u1ED1 \u0111i qua xe Pkw")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.01-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(536);
	    	
	    	q.setName("2.1.01-101");

			q.setText(new TranslatedString("Wodurch kann eine Gef\u00E4hrdung entstehen?","\u0110i\u1EC1u g\u00EC d\u1EABn \u0111\u1EBFn nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch eine stark einseitig wirkende Fu\u00DFbremse","Do phanh ch\u00E2n c\u00F3 t\u00E1c d\u1EE5ng m\u1EA1nh \u1EDF m\u1ED9t b\u00EAn (l\u1EC7ch)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch zu gro\u00DFes Spiel in der Lenkung","Do c\u00F3 gro\u00DFes Spiel \u1EDF tay l\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch gest\u00F6rten Empfang des Verkehrsfunks","Do b\u1ED9 thu t\u00EDn hi\u1EC7u radio v\u1EC1 th\u00F4ng tin giao th\u00F4ng b\u1ECB h\u1ECFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.02-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(537);
	    	
	    	q.setName("2.1.02-001");

			q.setText(new TranslatedString("Sie fahren auf einer schmalen Stra\u00DFe. 20 m vor Ihnen betritt \npl\u00F6tzlich ein Fu\u00DFg\u00E4nger die Fahrbahn. Wann ist trotz \nGefahrbremsung ein Zusammenprall unvermeidbar? \nBei einer Geschwindigkeit von","B\u1EA1n l\u00E1i xe tr\u00EAn \u0111\u01B0\u1EDDng h\u1EB9p. Tr\u01B0\u1EDBc xe b\u1EA1n 20m \u0111\u1ED9t nhi\u00EAn xu\u1EA5t hi\u1EC7n ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111i tr\u00EAn l\u00F2ng \u0111\u01B0\u1EDDng. Khi n\u00E0o th\u00EC d\u00F9 \u0111\u00E3 phanh g\u1EA5p v\u1EABn kh\u00F4ng tr\u00E1nh kh\u1ECFi va ch\u1EA1m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("50 km/h","Khi t\u1ED1c \u0111\u1ED9 l\u00E0 50 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("30 km/h","Khi t\u1ED1c \u0111\u1ED9 l\u00E0 30 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("20 km/h","Khi t\u1ED1c \u0111\u1ED9 l\u00E0 20 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-015
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(538);
	    	
	    	q.setName("2.1.03-015");

			q.setText(new TranslatedString("Was kann auf nasser Fahrbahn zu Aquaplaning (Wassergl\u00E4tte) \nf\u00FChren?","\u0110i\u1EC1u g\u00EC d\u1EABn \u0111\u1EBFn tr\u01B0\u1EE3t xe tr\u00EAn \u0111\u01B0\u1EDDng \u01B0\u1EDBt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Hohe Geschwindigkeit","T\u1ED1c \u0111\u1ED9 cao")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abgefahrene Reifen","L\u1ED1p m\u00F2n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Spurrillen in der Fahrbahn","Do c\u00F3 r\u00E3nh tr\u00EAn \u0111\u01B0\u1EDDng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-016
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(539);
	    	
	    	q.setName("2.1.03-016");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich auf dieser Landstra\u00DFe verhalten?","B\u1EA1n x\u1EED l\u00FD th\u1EBF n\u00E0o tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.03-016.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00DCberholvorgang abbrechen und wieder rechts einordnen","B\u1ECF v\u01B0\u1EE3t v\u00E0 \u0111i l\u1EA1i v\u00E0o l\u00E0n ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zum Vorausfahrenden gro\u00DFen Abstand halten","Gi\u1EEF kho\u1EA3ng c\u00E1ch an to\u00E0n l\u1EDBn h\u01A1n v\u1EDBi xe \u0111i tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Z\u00FCgig \u00FCberholen","C\u1EE9 v\u01B0\u1EE3t ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-017
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(540);
	    	
	    	q.setName("2.1.03-017");

			q.setText(new TranslatedString("Warum kann das \u00DCberholen hier gef\u00E4hrlich sein?","T\u1EA1i sao v\u01B0\u1EE3t \u1EDF \u0111\u00E2y l\u1EA1i nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.03-017.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil auf dem \u00DCberholstreifen noch Schneematsch liegt","V\u00EC tr\u00EAn l\u00E0n v\u01B0\u1EE3t c\u00F3 tuy\u1EBFt \u0111\u1ECDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil hochgeschleuderter Schneematsch die Sicht behindern kann","V\u00EC tuy\u1EBFt v\u0103ng l\u00EAn l\u00E0m c\u1EA3n t\u1EA7m nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Stra\u00DFe unter dem Schneematsch zus\u00E4tzlich noch vereist sein\nkann","V\u00EC \u0111\u01B0\u1EDDng tuy\u1EBFt c\u00F3 th\u1EC3 b\u1ECB \u0111\u00F4ng \u0111\u00E1 n\u1EEFa")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-018
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(541);
	    	
	    	q.setName("2.1.03-018");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten, wenn Ihr Fahrzeug von starkem \nSeitenwind erfasst wird?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p gi\u00F3 m\u1EA1nh th\u1ED5i ngang?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gegenlenken","B\u1EBB l\u00E1i ng\u01B0\u1EE3c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit herabsetzen","Gi\u1EA3m t\u1ED1c \u0111\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Stark beschleunigen","T\u0103ng t\u1ED1c m\u1EA1nh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-020
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(542);
	    	
	    	q.setName("2.1.03-020");

			q.setText(new TranslatedString("Wann kann starker Seitenwind besonders gef\u00E4hrlich werden?","Khi n\u00E0o th\u00EC gi\u00F3 m\u1EA1nh th\u1ED5i ngang \u0111\u1EB7c bi\u1EC7t nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim \u00DCberholen von Lastz\u00FCgen","Khi v\u01B0\u1EE3t xe t\u1EA3i l\u1EDBn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Befahren von Br\u00FCcken","Khi \u0111i tr\u00EAn c\u1EA7u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Vorbeifahren an Waldschneisen","Khi \u0111i qua \u0111\u01B0\u1EDDng r\u1EEBng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-021
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(543);
	    	
	    	q.setName("2.1.03-021");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie hier rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.03-021.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ihr Fahrzeug kann durch den starken Seitenwind nach links gedr\u00FCckt\nwerden","Xe b\u1EA1n c\u00F3 th\u1EC3 b\u1ECB gi\u00F3 \u0111\u1EA9y m\u1EA1nh v\u1EC1 b\u00EAn tr\u00E1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie \u00FCberholen, zieht Ihr Fahrzeug beim Einfahren in den\nWindschatten des Lkw nach rechts","Khi v\u01B0\u1EE3t, xe b\u1EA1n b\u1ECB k\u00E9o v\u00E0o b\u00EAn ph\u1EA3i khi \u0111i v\u00E0o v\u00F9ng khu\u1EA5t gi\u00F3 che b\u1EDFi xe t\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das vor Ihnen fahrende Fahrzeug kann nach rechts gedr\u00FCckt werden","Xe \u0111i tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 th\u1EC3 b\u1ECB \u0111\u1EA9y v\u1EC1 b\u00EAn ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-022
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(544);
	    	
	    	q.setName("2.1.03-022");

			q.setText(new TranslatedString("Es herrscht starker Seitenwind von rechts. Wann sind Sie beim \n\u00DCberholen besonders gef\u00E4hrdet?","C\u00F3 gi\u00F3 t\u1EA1t m\u1EA1nh t\u1EEB b\u00EAn ph\u1EA3i. L\u00FAc n\u00E0o v\u01B0\u1EE3t th\u00EC \u0111\u1EB7c bi\u1EC7t nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.03-022.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Einfahren in den Windschatten des Lkw","Khi \u0111i v\u00E0o v\u00F9ng khu\u1EA5t gi\u00F3 che b\u1EDFi xe t\u1EA3i Lkw")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Herausfahren aus dem Windschatten des Lkw","Khi \u0111i ra kh\u1ECFi v\u00F9ng khu\u1EA5t gi\u00F3 che b\u1EDFi xe t\u1EA3i Lkw")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Fahrstreifenwechsel nach dem \u00DCberholen","Khi chuy\u1EC3n l\u00E0n sau khi v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-023
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(545);
	    	
	    	q.setName("2.1.03-023");

			q.setText(new TranslatedString("Warum m\u00FCssen Sie bei starkem Regen die Geschwindigkeit \nverringern?","T\u1EA1i sao b\u1EA1n ph\u1EA3i gi\u1EA3m t\u1ED1c khi c\u00F3 m\u01B0a to?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil der Bremsweg l\u00E4nger wird","V\u00EC kho\u1EA3ng c\u00E1ch phanh d\u00E0i h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Sicht schlechter wird","V\u00EC t\u1EA5m nh\u00ECn k\u00E9m h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Aquaplaning (Wassergl\u00E4tte) auftreten kann","V\u00EC c\u00F3 th\u1EC3 b\u1ECB tr\u01B0\u1EE3t n\u01B0\u1EDBc")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-024
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(546);
	    	
	    	q.setName("2.1.03-024");

			q.setText(new TranslatedString("Was beeintr\u00E4chtigt hier die Verkehrssicherheit?","\u0110i\u1EC1u g\u00EC l\u00E0m gi\u1EA3m s\u1EF1 an t\u00F2an giao th\u00F4ng \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.03-024.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die schlechte Sicht","T\u1EA7m nh\u00ECn k\u00E9m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die verminderte Bodenhaftung der Reifen auf der nassen Fahrbahn","Ma s\u00E1t gi\u1EEFa l\u1ED1p xe v\u1EDBi m\u1EB7t \u0111\u01B0\u1EDDng gi\u1EA3m tr\u00EAn \u0111\u01B0\u1EDDng \u01B0\u1EDBt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Abblendlicht des Gegenverkehrs","\u0110\u00E8n pha c\u1EE7a xe ng\u01B0\u1EE3c chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-025
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(547);
	    	
	    	q.setName("2.1.03-025");

			q.setText(new TranslatedString("Wozu kann eine pl\u00F6tzliche Verschlechterung des \nFahrbahnzustandes f\u00FChren?","Ch\u1EA5t l\u01B0\u1EE3ng \u0111\u01B0\u1EDDng x\u1EA5u b\u1EA5t ng\u1EDD c\u00F3 th\u1EC3 d\u1EABn \u0111\u1EBFn \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu Schleuder- und Rutschgefahr","Nguy hi\u1EC3m do tr\u01B0\u1EE3t xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu ver\u00E4nderten Reifenger\u00E4uschen","Ti\u1EBFng l\u1ED1p xe thay \u0111\u1ED5i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zu l\u00E4ngerem Reaktionsweg","Kho\u1EA3ng c\u00E1ch ph\u1EA3n \u1EE9ng d\u00E0i h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-026
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(548);
	    	
	    	q.setName("2.1.03-026");

			q.setText(new TranslatedString("Sie fahren auf einer Allee mit dichtem Baumbestand au\u00DFerhalb \ngeschlossener Ortschaften. Pl\u00F6tzlich bricht die Sonne durch. Was \nm\u00FCssen Sie beachten?","B\u1EA1n l\u00E1i xe tr\u00EAn \u0111\u1EA1i l\u1ED9 c\u00F3 h\u00E0ng c\u00E2y d\u00E0y \u0111\u1EB7c \u1EDF b\u00EAn ngo\u00E0i khu \u0111\u00F4 th\u1ECB. \u0110\u1ED9t nhi\u00EAn tr\u1EDDi c\u00F3 n\u1EAFng. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.03-026.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Geschwindigkeit muss an die ver\u00E4nderten Sichtverh\u00E4ltnisse\nangepasst werden","\u0110i\u1EC1u ch\u1EC9nh t\u1ED1c \u0111\u1ED9 \u0111\u1EC3 ph\u00F9 h\u1EE3p v\u1EDBi kh\u1EA3 n\u0103ng quan s\u00E1t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Sch\u00E4tzen von Entfernungen wird durch den st\u00E4ndigen Wechsel\nvon Licht und Schatten erschwert","Do s\u1EF1 thay \u0111\u1ED5i li\u00EAn t\u1EE5c c\u1EE7a b\u00F3ng n\u1EAFng n\u00EAn c\u0169ng kh\u00F3 \u01B0\u1EDBc l\u01B0\u1EE3c \u0111\u01B0\u1EE3c kho\u1EA3ng c\u00E1ch")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der st\u00E4ndige Wechsel von Licht und Schatten macht es schwer,\nandere Verkehrsteilnehmer rechtzeitig zu erkennen","Do s\u1EF1 thay \u0111\u1ED5i li\u00EAn t\u1EE5c c\u1EE7a b\u00F3ng n\u1EAFng n\u00EAn s\u1EBD kh\u00F3 nh\u1EADn ra xe kh\u00E1c \u0111\u00FAng l\u00FAc")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-027
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(549);
	    	
	    	q.setName("2.1.03-027");

			q.setText(new TranslatedString("Welche Besonderheiten ergeben sich beim Befahren von Alleen?","\u0110i\u1EC1u \u0111\u1EB7c bi\u1EC7t n\u00E0o khi l\u00E1i xe tr\u00EAn \u0111\u1EA1i l\u1ED9?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kurven sind oft besonders eng und un\u00FCbersichtlich","C\u00E1c kh\u00FAc cua th\u01B0\u1EDDng r\u1EA5t h\u1EB9p v\u00E0 hay b\u1ECB t\u1EA3ng l\u01A1")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geringe Breite der Fahrbahn und ihre oft gew\u00F6lbte Form zwingen bei\nGegenverkehr zu besonderer Vorsicht","\u0110\u01B0\u1EDDng h\u1EB9p v\u00E0 d\u1EA1ng d\u00F2m b\u1EAFt ch\u00FAng ta ph\u1EA3i \u0111\u1EB7c bi\u1EBFt ch\u00FA \u00FD xe ng\u01B0\u1EE3c chi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die B\u00E4ume verschaffen seitlichen Schutz","C\u00E2y t\u1EA1o h\u00E0ng r\u00E0o b\u1EA3o v\u1EC7 hai b\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(550);
	    	
	    	q.setName("2.1.03-101");

			q.setText(new TranslatedString("Wo tritt besonders h\u00E4ufig Aquaplaning (Wassergl\u00E4tte) auf?","\u1EDE \u0111\u00E2u \u0111\u1EB7c bi\u1EC7t hay b\u1ECB tr\u01B0\u1EE3t n\u01B0\u1EDBc?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Fahrbahnsenken","\u0110o\u1EA1n \u0111\u01B0\u1EDDng tr\u0169ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Spurrillen in der Fahrbahn","N\u01A1i c\u00F3 r\u00E3nh tr\u00EAn \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An Bahn\u00FCberg\u00E4ngen","N\u01A1i c\u00F3 \u0111\u01B0\u1EDDng ray c\u1EAFt ngang")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(551);
	    	
	    	q.setName("2.1.03-102");

			q.setText(new TranslatedString("Wozu f\u00FChrt Aquaplaning (Wassergl\u00E4tte)?","\u0110i\u1EC1u g\u00EC do tr\u01B0\u1EE3t n\u01B0\u1EDBc g\u00E2y ra?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug l\u00E4sst sich nicht mehr lenken und abbremsen","Xe kh\u00F4ng n\u00EAn b\u1EBB l\u00E1i ho\u1EB7c phanh th\u00EAm n\u1EEFa")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug kann von der Fahrbahn abkommen","Xe c\u00F3 th\u1EC3 v\u0103ng ra kh\u1ECFi \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Lenkung wird schwerg\u00E4ngig","Tay l\u00E1i n\u1EB7ng \u0111i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(552);
	    	
	    	q.setName("2.1.03-103");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich einstellen, wenn es nach l\u00E4ngerer \nTrockenheit anf\u00E4ngt zu regnen?","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn c\u00E1c t\u00ECnh hu\u1ED1ng n\u00E0o, khi g\u1EB7p m\u01B0a sau m\u1ED9t th\u1EDDi gian d\u00E0i kh\u00F4 h\u1EA1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine gef\u00E4hrliche Schmierschicht auf der Fahrbahn","L\u1EDBp b\u00F9n b\u1EA9n nguy hi\u1EC3m tr\u00EAn \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf schlechtere Sicht gleich nach Einschalten der Scheibenwischer","T\u1EA7m nh\u00ECn k\u00E9m ngay sau khi b\u1EADn thanh lau k\u00EDnh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen k\u00FCrzeren Bremsweg","Kho\u1EA3ng c\u00E1ch phanh g\u1EAFn l\u1EA1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(553);
	    	
	    	q.setName("2.1.03-104");

			q.setText(new TranslatedString("Es f\u00E4ngt an zu regnen. Warum m\u00FCssen Sie den Sicherheitsabstand \nsofort vergr\u00F6\u00DFern?","Tr\u1EDDi b\u1EAFt \u0111\u1EA7u m\u01B0a. T\u1EA1i sao b\u1EA1n ph\u1EA3i l\u1EADp t\u1EE9c t\u0103ng kho\u1EA3ng c\u00E1ch an to\u00E0n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil sich ein Schmierfilm bilden kann, der den Bremsweg verl\u00E4ngert","V\u00EC l\u1EDBp b\u00F9n b\u1EA9n \u0111\u01B0\u1EE3c h\u00ECnh th\u00E0nh s\u1EBD l\u00E0m t\u0103ng kho\u1EA3ng c\u00E1ch phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Sicht schlechter werden kann und die Scheibenwischer nicht\nsofort ein klares Sichtfeld schaffen","V\u00EC t\u1EA7m nh\u00ECn b\u1ECB k\u00E9m \u0111i v\u00E0 thanh g\u1EA1t n\u01B0\u1EDBc kh\u00F4ng th\u1EC3 t\u1EA1o kho\u1EA3ng nh\u00ECn r\u00F5 ngay \u0111\u01B0\u1EE3c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil die Bremsen schneller ansprechen","V\u00EC phanh ho\u1EA1t \u0111\u1ED9ng nhanh h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(554);
	    	
	    	q.setName("2.1.03-105");

			q.setText(new TranslatedString("Sie fahren au\u00DFerorts bei dichtem Nebel auf einer Bundesstra\u00DFe. \nD\u00FCrfen Sie auf der Fahrbahnmitte st\u00E4ndig \u00FCber der Leitlinie fahren?","B\u1EA1n l\u00E1i xe \u1EDF khu v\u1EF1c ngo\u1EA1i \u00F4 tr\u00EAn \u0111\u01B0\u1EDDng li\u00EAn bang v\u00E0 g\u1EB7p s\u01B0\u01A1ng m\u00F9 d\u00E0y \u0111\u1EB7c.\nB\u1EA1n c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p l\u00E1i xe \u1EDF gi\u1EEFa \u0111\u01B0\u1EDDng tr\u00EAn v\u1EA1ch \u0111\u1EE9t n\u00E9t kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein, weil der Gegenverkehr gef\u00E4hrdet werden kann","Kh\u00F4ng, v\u00EC s\u1EBD g\u00E2y nguy hi\u1EC3m cho xe ng\u01B0\u1EE3c chi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, wenn Nebelscheinwerfer und Nebelschlussleuchte eingeschaltet\nsind","C\u00F3, v\u00EC c\u00F3 b\u1EADt \u0111\u00E8n d\u00F9ng trong s\u01B0\u01A1ng m\u00F9")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, weil man weniger in Gefahr ger\u00E4t, von der Fahrbahn abzukommen","C\u00F3, v\u00EC weil man weniger in Gefahr ger\u00E4t, von der Fahrbahn abzukommen")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(555);
	    	
	    	q.setName("2.1.03-106");

			q.setText(new TranslatedString("Was m\u00FCssen Sie am Tage bei einer pl\u00F6tzlich auftretenden \nNebelbank tun?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi ban ng\u00E0y \u0111\u1ED9t nhi\u00EAn g\u1EB7p s\u01B0\u01A1ng m\u00F9?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit sofort den Sichtverh\u00E4ltnissen anpassen","L\u1EADp t\u1EE9c \u0111i\u1EC1u ch\u1EC9nh t\u1ED1c \u0111\u1ED9 cho ph\u00F9 h\u1EE3p v\u1EDBi t\u1EA7m quan s\u00E1t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abblendlicht einschalten","B\u1EADt \u0111\u00E8n chi\u1EBFu g\u1EA7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur Standlicht einschalten","Ch\u1EC9 b\u1EADt \u0111\u00E8n \u0111\u1EE9ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(556);
	    	
	    	q.setName("2.1.03-107");

			q.setText(new TranslatedString("Wie k\u00F6nnen Sie ausreichende Sicht durch die Frontscheibe \nerhalten?","L\u00E0m th\u1EBF n\u00E0o \u0111\u1EC3 gi\u1EEF \u0111\u1EE7 t\u1EA7m quan s\u00E1t qua k\u00EDnh ch\u1EAFn gi\u00F3 ph\u00EDa tr\u01B0\u1EDBc?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Nebel den Scheibenwischer von Zeit zu Zeit einschalten","Khi v\u00E0o s\u01B0\u01A1ng m\u00F9, l\u00E2u l\u00E2u l\u1EA1i b\u1EADt th\u00E0nh g\u1EA1t n\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Schneematsch die Scheibenwischer schon einschalten, bevor\nIhnen andere Fahrzeuge Matsch auf die Scheibe schleudern","G\u1EB7p tuy\u1EBFt \u0111\u1ECDng, b\u1EADt thanh lau k\u00EDnh, tr\u01B0\u1EDBc b\u1EA1n l\u00E0m v\u0103ng tuy\u1EBFt t\u1EEB thanh lau k\u00EDnh v\u00E0o xe kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei innen beschlagener Scheibe L\u00FCftung ausschalten und Fenster\ngeschlossen halten","Khi k\u00EDnh b\u1ECB m\u1EDD, b\u1EADt th\u00F4ng gi\u00F3 v\u00E0 \u0111\u00F3ng c\u1EEDa s\u1ED5")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.03-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(557);
	    	
	    	q.setName("2.1.03-108");

			q.setText(new TranslatedString("Sie wollen beim Befahren einer Allee \u00FCberholen. Worauf m\u00FCssen \nSie besonders achten?","B\u1EA1n mu\u1ED1n v\u01B0\u1EE3t tr\u00EAn \u0111\u1EA1i l\u1ED9. B\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wegen der geringen Fahrbahnbreite k\u00F6nnen selbst Radfahrer bei\nGegenverkehr h\u00E4ufig nicht \u00FCberholt werden","Do chi\u1EC1u ngang h\u1EB9p, n\u00EAn th\u01B0\u1EDDng \u00EDt v\u01B0\u1EE3t xe \u0111\u1EA1p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim \u00FCberfahren der Mitte einer gew\u00F6lbten Fahrbahn wechselt auch\ndie Fahrzeugneigung","Beim \u00FCberfahren der Mitte einer gew\u00F6lbten Fahrbahn wechselt auch\ndie Fahrzeugneigung")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrzeuge mit hohen Aufbauten weichen h\u00E4ufig \u00C4sten aus, die in die\nFahrbahn hineinragen","Fahrzeuge mit hohen Aufbauten weichen h\u00E4ufig \u00C4sten aus, die in die\nFahrbahn hineinragen")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.04-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(558);
	    	
	    	q.setName("2.1.04-001");

			q.setText(new TranslatedString("Sie erkennen nachts auf einer Landstra\u00DFe Fu\u00DFg\u00E4nger auf Ihrer \nSeite. Wie verhalten Sie sich, wenn Sie durch ein \nentgegenkommendes Fahrzeug geblendet werden?","B\u1EA1n ph\u00E1t hi\u1EC7n th\u1EA5y ng\u01B0\u1EDDi \u0111i b\u1ED9 tr\u00EAn ph\u1EA7n \u0111\u01B0\u1EDDng c\u1EE7a m\u00ECnh khi \u0111ang \u0111i tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe v\u00E0o ban \u0111\u00EAm. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o, khi b\u1EA1n b\u1ECB l\u00F3a m\u1EAFt b\u1EDFi xe \u0111\u1ED1i di\u1EC7n"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern und notfalls anhalten","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 v\u00E0 n\u1EBFu c\u1EA7n th\u00EC d\u1EEBng l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Aufblenden und mit unverminderter Geschwindigkeit weiterfahren","B\u1EADt \u0111\u00E8n chi\u1EBFu xa v\u00E0 gi\u1EEF nguy\u00EAn t\u1ED1c \u0111\u1ED9 \u0111i ti\u1EBFp")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beschleunigen, um m\u00F6glichst schnell aus dem Bereich der Blendung\nherauszukommen","T\u0103ng t\u1ED1c \u0111\u1EC3 nhanh ch\u00F3ng tho\u00E1t kh\u1ECFi v\u00F9ng b\u1ECB l\u00F3a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.04-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(559);
	    	
	    	q.setName("2.1.04-002");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten, wenn im Fernlicht pl\u00F6tzlich Wild \nauftaucht?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o, khi \u0111\u1ED9t nhi\u00EAn xu\u1EA5t hi\u1EC7n th\u00FA r\u1EEBng trong v\u00F9ng \u0111\u00E8n chi\u1EBFu xa?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sofort abblenden","L\u1EADp t\u1EE9c b\u1EADt \u0111\u00E8n chi\u1EBFu g\u1EA7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Hupen und bremsen","B\u1EA5m c\u00F2i v\u00E0 \u0111\u1EA1p phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Fernlicht unver\u00E4ndert weiterfahren","C\u1EE9 \u0111\u1EC3 \u0111\u00E8n chi\u1EBFu xa v\u00E0 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.04-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(560);
	    	
	    	q.setName("2.1.04-003");

			q.setText(new TranslatedString("Welche Gefahren k\u00F6nnen entstehen, wenn Sie mit Fernlicht fahren?","Nh\u1EEFng nguy hi\u1EC3m n\u00E0o c\u00F3 th\u1EC3 x\u1EA3y ra n\u1EBFu b\u1EA1n ch\u1EA1y xe v\u1EDBi \u0111\u00E8n chi\u1EBFu xa?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Entgegenkommende werden geblendet und k\u00F6nnen deshalb\nFu\u00DFg\u00E4nger auf ihrer Fahrbahnseite nicht rechtzeitig erkennen","Xe \u0111\u1ED1i di\u1EC7n b\u1ECB l\u00F3a v\u00E0 c\u00F3 th\u1EC3 kh\u00F4ng k\u1ECBp nh\u1EADn ra ng\u01B0\u1EDDi \u0111i b\u1ED9 \u1EDF ph\u00EDa \u0111\u01B0\u1EDDng b\u00EAn h\u1ECD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wild auf der Fahrbahn wird geblendet und bleibt im Lichtkegel stehen","Th\u00FA r\u1EEBng b\u1ECB l\u00F3a m\u1EAFt v\u00E0 \u0111\u1EE9ng im nh\u00ECn \u0111\u00E8n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Liegen gebliebene Fahrzeuge auf der eigenen Fahrbahnseite werden\nzu sp\u00E4t erkannt","S\u1EBD kh\u00F4ng k\u1ECBp nh\u00ECn th\u1EA5y nh\u1EEFng xe \u0111ang \u0111\u1EADu \u1EDF b\u00EAn \u0111\u01B0\u1EDDng c\u1EE7a m\u00ECnh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.04-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(561);
	    	
	    	q.setName("2.1.04-004");

			q.setText(new TranslatedString("Sie befahren nachts eine Allee mit geringer Fahrbahnbreite. Was \nm\u00FCssen Sie beachten?","B\u1EA1n l\u00E1i xe tr\u1EDDi t\u1ED1i tr\u00EAn \u0111\u1EA1i l\u1ED9 v\u1EDBi chi\u1EC1u ngang c\u1EE7a \u0111\u01B0\u1EDDng h\u1EB9p. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die dicht am Fahrbahnrand stehenden B\u00E4ume sind schwer zu\nerkennen","Kh\u00F3 nh\u1EADn ra nh\u1EEFng c\u00E2y m\u1ECDc s\u00E1t l\u1EC1 \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Gegenverkehr f\u00E4hrt m\u00F6glicherweise wegen der dicht am\nFahrbahnrand stehenden B\u00E4ume auf der Stra\u00DFenmitte","Do \u0111\u01B0\u1EDDng h\u1EB9p n\u00EAn xe ng\u01B0\u1EE3c chi\u1EC1u c\u00F3 kh\u1EA3 n\u0103ng \u0111i ra gi\u1EEFa \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Fernlicht kann die Allee auch mit hoher Geschwindigkeit sicher\nbefahren werden","N\u1EBFu b\u1EADt \u0111\u00E8n chi\u1EBFu xa th\u00EC c\u00F3 th\u1EC3 \u0111i nhanh m\u1ED9t c\u00E1ch an to\u00E0n tr\u00EAn \u0111\u1EA1i l\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.04-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(562);
	    	
	    	q.setName("2.1.04-101");

			q.setText(new TranslatedString("Bei Dunkelheit blendet ein entgegenkommendes Fahrzeug nicht ab. \nWas k\u00F6nnen Sie tun, um noch einigerma\u00DFen sehen zu k\u00F6nnen?","V\u00E0o tr\u1EDDi t\u1ED1i, xe ng\u01B0\u1EE3c chi\u1EC1u kh\u00F4ng c\u00FAp \u0111\u00E8n pha xu\u1ED1ng. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC \u0111\u1EC3 c\u00F3 th\u1EC3 nh\u00ECn th\u1EA5y \u0111\u00F4i ch\u00FAt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nicht in die aufgeblendeten Scheinwerfer, sondern zum rechten\nFahrbahnrand schauen","Kh\u00F4ng nh\u00ECn v\u00E0o \u0111\u00E8n pha m\u00E0 nh\u00ECn v\u1EC1 ph\u00EDa l\u1EC1 b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auch Fernlicht einschalten","C\u0169ng b\u1EADt \u0111\u00E8n chi\u1EBFu xa")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sonnenblende herunterklappen","G\u1EADp mi\u1EBFng che n\u1EAFng xu\u1ED1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.04-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(563);
	    	
	    	q.setName("2.1.04-102");

			q.setText(new TranslatedString("Bei Dunkelheit und Regen kommen Ihnen auf einer Landstra\u00DFe \nFahrzeuge mit Abblendlicht entgegen. Was m\u00FCssen Sie \nber\u00FCcksichtigen?","V\u00E0o tr\u1EDBi t\u1ED1i v\u00E0 m\u01B0a tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe b\u1EA1n g\u1EB7p xe \u0111\u1ED1i di\u1EC7n b\u1EADt \u0111\u00E8n pha chi\u1EBFu xa. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Spiegelung auf der nassen Fahrbahn k\u00F6nnen Sie geblendet\nwerden","B\u1EA1n c\u00F3 th\u1EC3 b\u1ECB l\u00F3a m\u1EAFt do ph\u1EA3n chi\u1EBFu t\u1EEB n\u01B0\u1EDBc tr\u00EAn m\u1EB7t \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Schlieren auf der Windschutzscheibe verschlechtert sich die\nSicht","S\u1EF1 kh\u00F4ng \u0111\u1ED3ng nh\u1EA5t c\u1EE7a k\u00EDnh ch\u1EAFn gi\u00F3 s\u1EBD l\u00E0m gi\u1EA3m t\u1EA7m nh\u00ECn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Einschalten von Fernlicht k\u00F6nnen Sie eine Blendung vermeiden","B\u1EA1n c\u00F3 th\u1EC3 gi\u1EA3m l\u00F3a m\u1EAFt b\u1EB1ng c\u00E1ch b\u1EADt \u0111\u00E8n chi\u1EBFu xa")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.05-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(564);
	    	
	    	q.setName("2.1.05-001");

			q.setText(new TranslatedString("Sie fahren schon lange mit h\u00F6herer Geschwindigkeit. Welche \nAuswirkungen kann dies haben?","B\u1EA1n l\u00E1i xe l\u00E2u v\u1EDBi t\u1ED1c \u0111\u1ED9 cao. \u1EA2nh h\u01B0\u1EDFng n\u00E0o c\u00F3 th\u1EC3 c\u00F3?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Gef\u00FChl f\u00FCr die Geschwindigkeit l\u00E4sst nach","M\u1EA5t c\u1EA3m gi\u00E1c v\u1EC1 t\u1ED1c \u0111\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Konzentrationsf\u00E4higkeit nimmt ab","Gi\u1EA3m kh\u1EA3 n\u0103ng t\u1EADp trung")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Gef\u00FChl f\u00FCr die richtige Kurvengeschwindigkeit w\u00E4chst","C\u1EA3m gi\u00E1c v\u1EC1 t\u1ED1c \u0111\u1ED9 cua t\u0103ng l\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.05-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(565);
	    	
	    	q.setName("2.1.05-002");

			q.setText(new TranslatedString("Wozu kann langes Fahren mit h\u00F6herer Geschwindigkeit f\u00FChren?","L\u00E1i xe t\u1ED1c \u0111\u1ED9 cao l\u00E2u d\u1EABn \u0111\u1EBFn \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Gef\u00FChl f\u00FCr die Geschwindigkeit l\u00E4sst nach","M\u1EA5t c\u1EA3m gi\u00E1c v\u1EC1 t\u1ED1c \u0111\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es wird zu dicht aufgefahren","L\u00E1i xe qu\u00E1 g\u1EA7n xe kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Reaktionsbereitschaft nimmt zu","Kh\u1EA3 n\u0103ng ph\u1EA3n \u1EE9ng t\u0103ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.05-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(566);
	    	
	    	q.setName("2.1.05-003");

			q.setText(new TranslatedString("Sie fahren mit h\u00F6herer Geschwindigkeit. Wo k\u00F6nnen Sie besonders \nvon Hindernissen \u00FCberrascht werden?","B\u1EA1n l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 cao. \u1EDE \u0111\u00E2u b\u1EA1n hay g\u1EB7p ch\u01B0\u1EDBng ng\u1EA1i v\u1EADt b\u1EA5t ng\u1EDD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Waldgebieten (Wildwechsel)","\u1EDE g\u1EA7n r\u1EEBng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Hinter Bergkuppen","Sau \u0111\u1EC9nh \u0111\u1ED3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf Autobahnen","Tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.05-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(567);
	    	
	    	q.setName("2.1.05-004");

			q.setText(new TranslatedString("Wann besteht die Gefahr, dass die eigene Geschwindigkeit \nuntersch\u00E4tzt wird?","Khi n\u00E0o c\u00F3 nguy hi\u1EC3m do \u0111\u00E1nh gi\u00E1 th\u1EA5p t\u1ED1c \u0111\u1ED9 c\u1EE7a m\u00ECnh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn die Stra\u00DFe breit und ohne Randbebauung ist","Khi \u0111\u01B0\u1EDDng r\u1ED9ng v\u00E0 kh\u00F4ng c\u00F3 c\u00F4ng tr\u00ECnh n\u00E0o b\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn man schon lange mit h\u00F6herer Geschwindigkeit gefahren ist","Khi b\u1EA1n \u0111\u00E3 \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 cao l\u00E2u r\u1ED3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn die Randbebauung der Stra\u00DFe st\u00E4ndig wechselt","Khi c\u00E1c c\u00F4ng tr\u00ECnh b\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng thay \u0111\u1ED5i th\u01B0\u1EDDng xuy\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.05-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(568);
	    	
	    	q.setName("2.1.05-005");

			q.setText(new TranslatedString("Was kann zu einer gef\u00E4hrlichen Untersch\u00E4tzung der eigenen \nGeschwindigkeit f\u00FChren?","\u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 d\u1EABn \u0111\u1EBFn \u0111\u00E1nh gi\u00E1 th\u1EA5p t\u1ED1c \u0111\u1ED9?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langes Fahren mit h\u00F6herer Geschwindigkeit","L\u00E1i xe l\u00E2u v\u1EDBi t\u1ED1c \u0111\u1ED9 cao")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahren auf einer breiten, gut ausgebauten Stra\u00DFe","L\u00E1i xe tr\u00EAn \u0111\u01B0\u1EDDng r\u1ED9ng v\u00E0 \u0111\u01B0\u1EE3c x\u00E2y d\u1EF1ng t\u1ED1t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Starkes Motoren- und Reifenger\u00E4usch","Ti\u1EBFng m\u00F4-t\u01A1 v\u00E0 ti\u1EBFng l\u1ED1p to")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.05-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(569);
	    	
	    	q.setName("2.1.05-006");

			q.setText(new TranslatedString("Sie n\u00E4hern sich mit hoher Geschwindigkeit einer engen Linkskurve. \nWarum m\u00FCssen Sie bereits vor der Kurve die Geschwindigkeit \nvermindern? \nWeil Sie","B\u1EA1n \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 cao g\u1EA7n kh\u00FAc cua tr\u00E1i h\u1EB9p. T\u1EA1i sao b\u1EA1n ph\u1EA3i gi\u1EA3m t\u1ED1c \u0111\u1ED9 tr\u01B0\u1EDBc khi v\u00E0o cua?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 sonst nach rechts aus der Kurve fliegen","V\u00EC b\u1EA1n c\u00F3 th\u1EC3 bay ra kh\u1ECFi cua v\u1EC1 b\u00EAn ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 ins Schleudern geraten, wenn Sie erst in der Kurve bremsen","V\u00EC b\u1EA1n b\u1ECB tr\u01B0\u1EE3t b\u00EAn, khi b\u1EA1n phanh \u1EDF trong v\u00F2ng cua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 sonst nach links aus der Kurve fliegen","V\u00EC b\u1EA1n bay ra kh\u1ECFi cua v\u1EC1 b\u00EAn tr\u00E1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.05-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(570);
	    	
	    	q.setName("2.1.05-007");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.05-007.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langsam fahren, weil jederzeit Kinder zwischen den geparkten\nFahrzeugen hervorlaufen k\u00F6nnen","\u0110i ch\u1EADm, v\u00EC l\u00FAc n\u00E0o c\u0169ng c\u00F3 th\u1EC3 c\u00F3 tr\u1EBB con ch\u1EA1y ra gi\u1EEFa c\u00E1c xe \u0111ang \u0111\u1EADu")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langsam fahren, weil an einem der Fahrzeuge eine T\u00FCr zur\nFahrbahnseite ge\u00F6ffnet werden k\u00F6nnte","\u0110i ch\u1EADm, v\u00EC c\u00F3 th\u1EC3 c\u00F3 xe m\u1EDF c\u1EEDa v\u1EC1 ph\u00EDa l\u00F2ng \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die allgemein h\u00F6chstzul\u00E4ssige Geschwindigkeit ausnutzen, weil keine\nkonkrete Gefahr erkennbar ist","T\u1EADn d\u1EE5ng t\u1ED1i \u0111a t\u1ED1c \u0111\u1ED9 cho ph\u00E9p v\u00EC kh\u00F4ng c\u00F3 nguy hi\u1EC3m r\u00F5 r\u00E0ng n\u00E0o c\u00F3 th\u1EC3 tr\u00F4ng th\u1EA5y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.05-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(571);
	    	
	    	q.setName("2.1.05-101");

			q.setText(new TranslatedString("Was ist f\u00FCr die Wahl der Geschwindigkeit beim Befahren von Alleen \nmit geringer Fahrbahnbreite von besonderer Bedeutung?","\u0110i\u1EC1u g\u00EC c\u00F3 \u00FD ngh\u0129a quan tr\u1ECDng khi l\u1EF1a ch\u1ECDn t\u1ED1c \u0111\u1ED9 tr\u00EAn \u0111\u01B0\u1EDDng \u0111\u1EA1i l\u1ED9 c\u00F3 chi\u1EC1u ngang h\u1EB9p?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das gleichzeitige Absch\u00E4tzen des Seitenabstands zu den B\u00E4umen\nund zum Gegenverkehr","\u01AF\u1EDBc l\u01B0\u1EE3ng \u0111\u1ED3ng th\u1EDDi kho\u1EA3ng c\u00E1ch b\u00EAn v\u1EDBi c\u00E2y tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng v\u00E0 v\u1EDBi xe ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass bei einem entgegenkommenden breiten Fahrzeug unter\nUmst\u00E4nden in der halben \u00FCbersehbaren Strecke angehalten werden \nmuss","Tr\u00E1nh xe ng\u01B0\u1EE3c chi\u1EC1u c\u00F3 b\u1EC1 ngang r\u1ED9ng trong tr\u01B0\u1EDDng h\u1EE3p \u0111o\u1EA1n \u0111\u01B0\u1EDDng c\u00F3 th\u1EC3 \u0111\u01B0\u1EE3c nh\u00ECn th\u1EA5y t\u01B0\u01A1ng \u0111\u1ED1i r\u00F5")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die schnell wechselnden Lichtverh\u00E4ltnisse erleichtern das Absch\u00E4tzen\nder seitlichen Abst\u00E4nde","\u0110i\u1EC1u ki\u1EC7n \u00E1nh s\u00E1ng thay \u0111\u1ED5i nhanh gi\u00FAp cho vi\u1EC7c \u01B0\u1EDBc l\u01B0\u1EE3ng kho\u1EA3ng c\u00E1ch b\u00EAn d\u1EC5 h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.06-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(572);
	    	
	    	q.setName("2.1.06-001");

			q.setText(new TranslatedString("Was f\u00FChrt beim \u00DCberholen auf Autobahnen h\u00E4ufig zu schweren \nUnf\u00E4llen?","\u0110i\u1EC1u g\u00EC th\u01B0\u1EDDng d\u1EABn \u0111\u1EBFn tai n\u1EA1n nghi\u00EAm tr\u1ECDng khi v\u01B0\u1EE3t xe kh\u00E1c tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mangelhafte Beobachtung des r\u00FCckw\u00E4rtigen Verkehrs","Thi\u1EBFu quan s\u00E1t xe ch\u1EA1y sau")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahren mit zu geringem Abstand","L\u00E1i xe v\u1EDBi kho\u1EA3ng c\u00E1ch gi\u1EEFa c\u00E1c xe qu\u00E1 ng\u1EAFn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahren mit doppeltem Sicherheitsabstand","L\u00E1i xe v\u1EDBi kho\u1EA3ng c\u00E1ch gi\u1EEFa c\u00E1c xe g\u1EA5p hai l\u1EA7n kho\u1EA3ng c\u00E1ch an to\u00E0n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.06-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(573);
	    	
	    	q.setName("2.1.06-002");

			q.setText(new TranslatedString("Warum kann es gef\u00E4hrlich sein, wenn Sie als Letzter einer Kolonne \nsofort \u00FCberholen, nachdem der Gegenverkehr gerade abgerissen \nist?","T\u1EA1i sao l\u1EA1i nguy hi\u1EC3m khi b\u1EA1n l\u00E0 ng\u01B0\u1EDDi cu\u1ED1i c\u00F9ng trong h\u00E0ng v\u01B0\u1EE3t xe kh\u00E1c ngay sau khi h\u1EBFt xe ng\u01B0\u1EE3c chi\u1EC1u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Sie damit rechnen m\u00FCssen, dass auch andere zum \u00DCberholen\nausscheren","V\u00EC b\u1EA1n ph\u1EA3i t\u00EDnh r\u1EB1ng, ng\u01B0\u1EDDi kh\u00E1c c\u0169ng v\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil der \u00DCberholweg nicht ausreichen k\u00F6nnte","V\u00EC \u0111o\u1EA1n \u0111\u01B0\u1EDDng v\u01B0\u1EE3t c\u00F3 th\u1EC3 kh\u00F4ng \u0111\u1EE7")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil ein eventuell notwendiges Wiedereinscheren in die Kolonne zu\neinem Unfall f\u00FChren kann","V\u00EC chuy\u1EC3n h\u00E0ng c\u1EA7n thi\u1EBFt sau khi v\u01B0\u1EE3t c\u00F3 th\u1EC3 d\u1EABn t\u1EDBi tai n\u1EA1n trong h\u00E0ng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.06-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(574);
	    	
	    	q.setName("2.1.06-003");

			q.setText(new TranslatedString("Was m\u00FCssen Sie beachten, wenn Sie \u00FCberholen wollen?","Ph\u1EA3i ch\u00FA \u00FD g\u00EC khi v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.06-003.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Transporter k\u00F6nnte zum \u00DCberholen des vor ihm fahrenden\nFahrzeugs ansetzen","Xe t\u1EA3i c\u00F3 th\u1EC3 v\u01B0\u1EE3t xe \u0111ang ch\u1EA1y ph\u00EDa tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es k\u00F6nnte Gegenverkehr auftauchen","C\u00F3 th\u1EC3 xu\u1EA5t hi\u1EC7n xe ng\u01B0\u1EE3c chi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Da kein Gegenverkehr zu sehen ist, k\u00F6nnen Sie unbedenklich\n\u00FCberholen","Khi kh\u00F4ng nh\u00ECn th\u1EA5y xe ng\u01B0\u1EE3c chi\u1EC1u, b\u1EA1n c\u00F3 th\u1EC3 v\u01B0\u1EE3t m\u1ED9t c\u00E1ch an to\u00E0n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.06-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(575);
	    	
	    	q.setName("2.1.06-004");

			q.setText(new TranslatedString("D\u00FCrfen Sie auf dieser Autobahn den schwarzen Pkw rechts \n\u00FCberholen?","B\u1EA1n c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p v\u01B0\u1EE3t xe Pkw m\u00E0u \u0111en tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.06-004.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein, weil auf dem linken Fahrstreifen keine Fahrzeugschlange ist","Kh\u00F4ng, v\u00EC b\u00EAn l\u00E0n tr\u00E1i kh\u00F4ng c\u00F3 Fahrzeugschlange")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, wenn Sie dabei nicht schneller als 80 km/h fahren","C\u00F3, v\u00EC b\u1EA1n kh\u00F4ng l\u00E1i nhanh h\u01A1n 80 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, weil zum \u00DCberholen ausreichend Platz ist","C\u00F3, v\u00EC c\u00F3 \u0111\u1EE7 ch\u1ED7 \u0111\u1EC3 v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.06-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(576);
	    	
	    	q.setName("2.1.06-005");

			q.setText(new TranslatedString("Die Pkw fahren mit etwa 30 km/h. D\u00FCrfen Sie beide noch vor der \nKurve \u00FCberholen? \nNein, weil","Xe Pkw l\u00E1i v\u1EDBi t\u1ED1c \u0111\u1ED9 kho\u1EA3ng 30 km/h. B\u1EA1n c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p v\u01B0\u1EE3t c\u1EA3 hai tr\u01B0\u1EDBc v\u00F2ng cua kh\u00F4ng?\n- Kh\u00F4ng, v\u00EC"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.06-005.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Ihr \u00DCberholweg zu lang w\u00FCrde","\u2013 Kho\u1EA3ng c\u00E1ch phanh c\u1EE7a xe b\u1EA1n qu\u00E1 d\u00E0i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 der helle Pkw zum \u00DCberholen ausscheren k\u00F6nnte","\u2013 xe Pkw m\u00E0u s\u00E1ng c\u0169ng c\u00F3 th\u1EC3 v\u01B0\u1EE3t xe kia")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 die unterbrochene Linie nicht \u00FCberfahren werden darf","\u2013 Kh\u00F4ng \u0111\u01B0\u1EE3c \u0111i l\u00EAn v\u1EA1ch \u0111\u1EE9t n\u00E9t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.06-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(577);
	    	
	    	q.setName("2.1.06-006");

			q.setText(new TranslatedString("Der \u00DCberholende hat sich offensichtlich versch\u00E4tzt. Was m\u00FCssen \nSie tun?","Xe v\u01B0\u1EE3t \u0111\u1EB1ng tr\u01B0\u1EDBc r\u00F5 r\u00E0ng \u0111\u00E3 t\u00EDnh to\u00E1n sai. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.06-006.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sofort bremsen und nach rechts ausweichen","Phanh g\u1EA5p v\u00E0 tr\u00E1nh v\u1EC1 b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wie bisher weiterfahren","\u0110i ti\u1EBFp nh\u01B0 c\u0169")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.06-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(578);
	    	
	    	q.setName("2.1.06-101");

			q.setText(new TranslatedString("Ein Auto \u00FCberholt Sie. Obwohl der Gegenverkehr gef\u00E4hrlich nahe \nherangekommen ist, bricht der Fahrer den \u00DCberholvorgang nicht \nab. Wie verhalten Sie sich?","M\u1ED9t xe v\u01B0\u1EE3t xe b\u1EA1n. M\u1EB7c d\u00F9 xe ng\u01B0\u1EE3c chi\u1EC1u t\u1EDBi g\u1EA7n kh\u00E1 nguy hi\u1EC3m, xe \u0111ang v\u01B0\u1EE3t c\u0169ng kh\u00F4ng b\u1ECF v\u01B0\u1EE3t, B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit verringern und \u00E4u\u00DFerst rechts fahren","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 v\u00E0 \u0111i s\u00E1t b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrspur beibehalten und Geschwindigkeit erh\u00F6hen","Gi\u1EEF l\u00E0n v\u00E0 t\u0103ng t\u1ED1c")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit unverminderter Geschwindigkeit weiterfahren","\u0110i ti\u1EBFp v\u00E0 ko gi\u1EA3m t\u1ED1c \u0111\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.06-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(579);
	    	
	    	q.setName("2.1.06-102");

			q.setText(new TranslatedString("D\u00FCrfen Sie die Radfahrer \u00FCberholen?","B\u1EA1n c\u00F3 \u0111\u01B0\u1EE3c v\u01B0\u1EE3t m\u1EA5y xe \u0111\u1EA1p n\u00E0y kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.06-102.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein, weil Sie keine ausreichende Sicht haben","Kh\u00F4ng, v\u00EC b\u1EA1n kh\u00F4ng c\u00F3 \u0111\u1EE7 g\u00F3c nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein, weil Sie bei Gegenverkehr keinen ausreichenden Seitenabstand\nzu den Radfahrern h\u00E4tten","Kh\u00F4ng, v\u00EC b\u1EA1n c\u00F3 th\u1EC3 s\u1EBD koo \u0111\u1EE7 kho\u1EA3ng c\u00E1ch b\u00EAn v\u1EDBi xe \u0111\u1EA1p khi c\u00F3 xe \u0111\u1ED1i di\u1EC7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, weil Sie sich darauf verlassen d\u00FCrfen, dass ein\nEntgegenkommender abbremst und nach rechts ausweicht","C\u00F3, v\u00EC b\u1EA1n ch\u1EAFc ch\u1EAFn l\u00E0 xe ng\u01B0\u1EE3c chi\u1EC1u s\u1EBD phanh m\u00E0 \u0111i v\u1EC1 b\u00EAn ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(580);
	    	
	    	q.setName("2.1.07-001");

			q.setText(new TranslatedString("Sie fahren auf einer Landstra\u00DFe in einer Kolonne. Wie m\u00FCssen Sie \nsich verhalten?","B\u1EA1n l\u00E1i xe trong h\u00E0ng tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("");
			
			q.setCategory("");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sicherheitsabstand einhalten","Gi\u1EEF kho\u1EA3ng c\u00E1ch an to\u00E0n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vorausfahrende durch Hupen und Blinken zum \u00DCberholen auffordern","B\u1EA1n b\u1EA5m c\u00F2i v\u00E0 nh\u00E1y \u0111\u00E8n v\u1EDBi xe \u0111i tr\u01B0\u1EDBc \u0111\u1EC3 y\u00EAu c\u1EA7u v\u01B0\u1EE3t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch \u201EKolonnenspringen\u201C versuchen, schneller voranzukommen","C\u1ED1 g\u1EAFng \u201Enh\u1EA3y h\u00E0ng\u201C \u0111\u1EC3 \u0111i nhanh h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(581);
	    	
	    	q.setName("2.1.07-002");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie auf diesem Autobahnparkplatz rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn t\u00ECnh hu\u1ED1ng g\u00EC trong b\u00E3i \u0111\u1EADu xe c\u1EE7a \u0111\u01B0\u1EDDng cao t\u1ED1c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.07-002.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit pl\u00F6tzlich auf die Fahrbahn tretenden Personen","Ch\u00FA \u00FD c\u00F3 ng\u01B0\u1EDDi \u0111\u1ED9t ng\u1ED9t xu\u1ED1ng \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Rutschgefahr beim Bremsen","Ch\u00FA \u00FD b\u1ECB tr\u01B0\u1EE3t khi phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Gegenverkehr","Ch\u00FA \u00FD xe ng\u01B0\u1EE3c chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(582);
	    	
	    	q.setName("2.1.07-003");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten, wenn sich auf dieser \nAu\u00DFerortsstra\u00DFe ein Stau gebildet hat?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o, khi b\u1ECB k\u1EB9t xe tr\u00EAn \u0111\u01B0\u1EDDng \u1EDF ngo\u1EA1i th\u00E0nh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.07-003.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf die linke Seite Ihres Fahrstreifens fahren und in der Mitte eine\nfreie Gasse schaffen","\u0110i s\u00E1t v\u1EC1 r\u00ECa tr\u00E1i c\u1EE7a l\u00E0n \u0111\u01B0\u1EDDng m\u00ECnh \u0111ang \u0111i \u0111\u1EC3 t\u1EA1o m\u1ED9t l\u1ED1i \u0111i nh\u1ECF \u1EDF gi\u1EEFa")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("So weit wie m\u00F6glich zur Mitte fahren, um die Ursache des Staus\nfeststellen zu k\u00F6nnen","C\u00E0ng \u0111i v\u00E0o gi\u1EEFa c\u00E0ng t\u1ED1t, \u0111\u1EC3 c\u00F3 th\u1EC3 nh\u00ECn th\u1EA5y nguy\u00EAn nh\u00E2n k\u1EB9t xe")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf den Seitenstreifen wechseln und dort weiterfahren","Chuy\u1EC3n sang l\u1EC1 \u0111\u01B0\u1EDDng v\u00E0 \u1EDF \u0111\u00F3 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(583);
	    	
	    	q.setName("2.1.07-004");

			q.setText(new TranslatedString("Wie verhalten Sie sich, wenn Sie geradeaus weiterfahren wollen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o, khi mu\u1ED1n \u0111i th\u1EB3ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.07-004.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abbremsen und dem Vorausfahrenden den Fahrstreifenwechsel\nerm\u00F6glichen","Phanh v\u00E0 nh\u01B0\u1EDDng xe \u0111i tr\u01B0\u1EDBc chuy\u1EC3n l\u00E0n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die anderen Fahrzeuge auf dem linken Fahrstreifen \u00FCberholen, weil\ndie Ampel \u201EGr\u00FCn\u201C zeigt","V\u01B0\u1EE3t xe kh\u00E1c \u1EDF l\u00E0n tr\u00E1i v\u00EC \u0111\u00E8n giao th\u00F4ng \u0111ang \u201EXanh\u201C")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Den Vorausfahrenden durch Hupen darauf hinweisen, dass er so kurz\nvor der Kreuzung nicht den Fahrstreifen wechseln darf","B\u1EA5m c\u00F2i v\u1EDBi xe \u0111i tr\u01B0\u1EDBc \u0111\u1EC3 b\u00E1o anh ta kh\u00F4ng \u0111\u01B0\u1EE3c chuy\u1EC3n l\u00E0n tr\u01B0\u1EDBc giao l\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(584);
	    	
	    	q.setName("2.1.07-005");

			q.setText(new TranslatedString("Vorn parkt ein Pkw ein. Der vor Ihnen fahrende Wagen weicht auf \nden linken Fahrstreifen aus. Wie sollten Sie sich verhalten?","Ph\u00EDa tr\u01B0\u1EDBc c\u00F3 xe Pkw \u0111ang v\u00E0o ch\u1ED7 \u0111\u1EADu. \nVorn parkt ein Pkw ein. Xe \u0111i tr\u01B0\u1EDBc b\u1EA1n th\u00EC \u0111ang r\u1EDDi l\u00E0n tr\u00E1i. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.07-005.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn der r\u00FCckw\u00E4rtige Verkehr es zul\u00E4sst, auch auf den linken\nFahrstreifen wechseln","Khi xe ph\u00EDa sau cho ph\u00E9p, t\u00F4i c\u0169ng chuy\u1EC3n sang l\u00E0n tr\u00E1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn \u00DCberholende Fahrzeuge folgen, rechts bleiben, langsam fahren\nund n\u00F6tigenfalls anhalten","\u0110i theo xe \u0111ang v\u01B0\u1EE3t, gi\u1EEF l\u00E0n tr\u00E1i, \u0111i ch\u1EADm v\u00E0 c\u00F3 th\u1EC3 ph\u1EA3i d\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Hupen und mit unverminderter Geschwindigkeit in den linken\nFahrstreifen hineinzw\u00E4ngen","B\u1EA5m c\u00F2i v\u00E0 l\u00E1ch sang l\u00E0n tr\u00E1i m\u00E0 kh\u00F4ng gi\u1EA3m t\u1ED1c \u0111\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(585);
	    	
	    	q.setName("2.1.07-006");

			q.setText(new TranslatedString("Sie n\u00E4hern sich den abgebildeten Fahrzeugen. Wie verhalten Sie \nsich?","B\u1EA1n \u0111i g\u1EA7n c\u00E1c xe nh\u01B0 minh h\u1ECDa. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.07-006.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beobachten, ob der Zug weiterhin auf dem Seitenstreifen bleibt","Ch\u00FA \u00FD xem xe t\u1EA3i c\u00F3 ti\u1EBFp tr\u00EAn l\u00E0n \u0111\u01B0\u1EDDng \u0111\u00F3 kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dem Zug das \u00FCberwechseln auf die Fahrbahn erm\u00F6glichen, wenn er\nlinks blinkt","T\u1EA1o \u0111i\u1EC1u ki\u1EC7n cho xe t\u1EA3i chuy\u1EC3n l\u00E0n khi xe \u0111\u00F3 nh\u00E1y xi-nhan b\u00EAn tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn der Zug links blinkt, Lichthupe bet\u00E4tigen und z\u00FCgig vorbeifahren","Khi xe t\u1EA3i nh\u00E1y xi-nhan b\u00EAn tr\u00E1i, nh\u00E1y \u0111\u00E8n v\u00E0 \u0111i ti\u1EBFp kh\u00F4ng d\u1EEBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(586);
	    	
	    	q.setName("2.1.07-101");

			q.setText(new TranslatedString("Wann kann ein schnell fahrender Pkw auf trockener, gerader Stra\u00DFe \nseitw\u00E4rts ausbrechen?","Khi n\u00E0o m\u1ED9t xe Pkw \u0111i nhanh tr\u00EAn \u0111\u01B0\u1EDDng th\u1EB3ng v\u00E0 kh\u00F4 b\u1ECB k\u00E9o v\u1EC1 m\u1ED9t b\u00EAn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn er pl\u00F6tzlich von starkem Seitenwind erfasst wird","Khi \u0111\u1ED9t nhi\u00EAn c\u00F3 gi\u00F3 t\u1EA1t b\u00EAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn ein Reifen platzt","Khi m\u1ED9t b\u00E1nh b\u1ECB n\u1ED5")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn pl\u00F6tzlich Gegenwind auftritt","Khi \u0111\u1ED9t nhi\u00EAn c\u00F3 gi\u00F3 ng\u01B0\u1EE3c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(587);
	    	
	    	q.setName("2.1.07-102");

			q.setText(new TranslatedString("Was erleichtert das Fahren im Kolonnenverkehr?","\u0110i\u1EC1u g\u00EC l\u00E0m cho vi\u1EC7c \u0111i xe trong h\u00E0ng d\u1EC5 d\u00E0ng h\u01A1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Beobachten der Kolonne durch die Scheiben der\nVorausfahrenden","Ch\u00FA \u00FD h\u00E0ng qua k\u00EDnh xe tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Leicht versetztes Fahren im eigenen Fahrstreifen","B\u1EBB l\u00E1i nh\u1EB9 tr\u00EAn l\u00E0n c\u1EE7a m\u00ECnh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahren mit st\u00E4ndig eingeschaltetem Warnblinklicht","Lu\u00F4n b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(588);
	    	
	    	q.setName("2.1.07-103");

			q.setText(new TranslatedString("Sie halten mit Ihrem Fahrzeug an, um einen Mitfahrer rechts \naussteigen zu lassen. Dort verl\u00E4uft ein Radweg. Was m\u00FCssen Sie \ntun?","B\u1EA1n d\u1EEBng xe \u0111\u1EC3 ng\u01B0\u1EDDi \u0111i c\u00F9ng xu\u1ED1ng xe \u1EDF ph\u00EDa b\u00EAn tay ph\u1EA3i. \u1EDE \u0111\u00F3 c\u00F3 \u0111\u01B0\u1EDDng d\u00E0nh cho xe \u0111\u1EA1p. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sich vergewissern, dass kein Radfahrer kommt, und erst dann die T\u00FCr\n\u00F6ffnen lassen","Ch\u1EAFc ch\u1EAFn r\u1EB1ng kh\u00F4ng c\u00F3 xe \u0111\u1EA1p \u0111ang \u0111i t\u1EDBi r\u1ED3i m\u1EDBi m\u1EDF c\u1EEDa xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Den Verkehr im linken Au\u00DFenspiegel beobachten und den Mitfahrer\nm\u00F6glichst rasch aussteigen lassen","Quan s\u00E1t \u0111\u01B0\u1EDDng qua g\u01B0\u01A1ng chi\u1EBFu h\u1EADu b\u00EAn tr\u00E1i v\u00E0 \u0111\u1EC3 ng\u01B0\u1EDDi \u0111\u00F3 r\u1EDDi kh\u1ECFi xe th\u1EADt nhanh.")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(589);
	    	
	    	q.setName("2.1.07-104");

			q.setText(new TranslatedString("Sie fahren in eine Rechtskurve; ein Motorradfahrer kommt Ihnen \nmit hoher Geschwindigkeit entgegen. Womit m\u00FCssen Sie rechnen? \nDer Motorradfahrer","B\u1EA1n \u0111i v\u00E0o cua ph\u1EA3i, c\u00F3 xe m\u00F4-t\u00F4 \u0111i ng\u01B0\u1EE3c chi\u1EC1u v\u1EDBi t\u1ED1c \u0111\u1ED9 cao. B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?\n- Xe m\u00F4-t\u00F4 ..."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 k\u00F6nnte wegen starker Schr\u00E4glage mit seinem Oberk\u00F6rper in Ihren\nFahrstreifen hineinragen","c\u00F3 th\u1EC3 l\u1EA5n ph\u1EA7n \u0111\u1EA7u qua ph\u1EA7n \u0111\u01B0\u1EDDng c\u1EE7a b\u1EA1n do nghi\u00EAng nhi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 muss die Kurve wegen der Fliehkraft dicht am \u00E4u\u00DFeren\nFahrbahnrand durchfahren","ph\u1EA3i \u0111i s\u00E1t l\u1EC1 b\u00EAn ngo\u00E0i cua do t\u00E1c d\u1EE5ng c\u1EE7a l\u1EF1c ly t\u00E2m")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(590);
	    	
	    	q.setName("2.1.07-105");

			q.setText(new TranslatedString("Was m\u00FCssen Sie nach einem Wildunfall (z.B. mit einem Reh) tun?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi \u0111\u1EE5ng ph\u1EA3i th\u00FA r\u1EEBng (ch\u1EB3ng h\u1EA1n m\u1ED9t con h\u01B0\u01A1u)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anhalten, Warnblinkanlage einschalten und Unfallstelle absichern","D\u1EEBng xe, b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o v\u00E0 b\u1EA3o v\u1EC7 khu v\u1EF1c tai n\u1EA1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Polizei oder das n\u00E4chste Forstamt unterrichten","B\u00E1o c\u1EA3nh s\u00E1t ho\u1EB7c tr\u1EA1m ki\u1EC3m l\u00E2m g\u1EA7n nh\u1EA5t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ohne anzuhalten weiterfahren","\u0110i ti\u1EBFp kh\u00F4ng d\u1EEBng l\u1EA1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(591);
	    	
	    	q.setName("2.1.07-106");

			q.setText(new TranslatedString("Bei schneller Autobahnfahrt platzt ein Reifen an Ihrem Pkw. Wie \nverhalten Sie sich?","\u0110ang \u0111i nhanh tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn th\u00EC xe b\u1EA1n b\u1ECB n\u1ED5 l\u1ED1p. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gas wegnehmen, wenn n\u00F6tig gegenlenken und vorsichtig abbremsen","Nh\u1EA3 ga, n\u1EBFu c\u1EA7n th\u00EC ph\u1EA3i b\u1EBB l\u00E1i ng\u01B0\u1EE3c l\u1EA1i v\u00E0 phanh c\u1EA9n th\u1EADn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("M\u00F6glichst auf dem Seitenstreifen anhalten, Warnblinklicht einschalten\nund Warndreieck aufstellen","C\u1ED1 g\u1EAFng \u0111i v\u00E0o l\u00E0n b\u00EAn \u0111\u01B0\u1EDDng, b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o v\u00E0 \u0111\u1EB7t bi\u1EC3n tam gi\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sofort Vollbremsung durchf\u00FChren, anschlie\u00DFend auf den\nSeitenstreifen wechseln","L\u1EADp t\u1EE9c phanh g\u1EA5p, sau \u0111\u00F3 chuy\u1EC3n v\u00E0o l\u00E0n b\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(592);
	    	
	    	q.setName("2.1.07-107");

			q.setText(new TranslatedString("Auf einer schmalen Stra\u00DFe wollen Sie in einer Steigung einen \nRadfahrer \u00FCberholen. Wie verhalten Sie sich?","Tr\u00EAn m\u1ED9t con \u0111\u01B0\u1EDDng h\u1EB9p b\u1EA1n mu\u1ED1n v\u01B0\u1EE3t 1 xe \u0111\u1EA1p tr\u00EAn 1 con d\u1ED1c. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gr\u00F6\u00DFeren Seitenabstand einhalten, weil der Radfahrer zu pendeln\nbeginnen kann","Gi\u1EEF kho\u1EA3ng c\u00E1ch b\u00EAn l\u1EDBn, v\u00EC ng\u01B0\u1EDDi l\u00E1i xe \u0111\u1EA1p c\u00F3 th\u1EC3 b\u1EAFt \u0111\u1EA7u \u0111\u1EA1p pedal")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Den Gegenverkehr vor dem \u00DCberholen passieren lassen","\u0110\u1EC3 xe ng\u01B0\u1EE3c chi\u1EC1u qua tr\u01B0\u1EDBc r\u1ED3i v\u01B0\u1EE3t sau")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dicht am Radfahrer vorbeifahren, um den Gegenverkehr nicht zu\nbehindern","V\u01B0\u1EE3t s\u00E1t xe \u0111\u1EA1p \u0111\u1EC3 kh\u00F4ng c\u1EA3n \u0111\u01B0\u1EDDng xe ng\u01B0\u1EE3c chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.07-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(593);
	    	
	    	q.setName("2.1.07-108");

			q.setText(new TranslatedString("Was m\u00FCssen Sie \u00FCber die Benutzung der R\u00FCckspiegel wissen?","B\u1EA1n ph\u1EA3i bi\u1EBFt g\u00EC v\u1EC1 vi\u1EC7c s\u1EED d\u1EE5ng g\u01B0\u01A1ng chi\u1EBFu h\u1EADu?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrzeuge und Fu\u00DFg\u00E4nger in einem toten Winkel k\u00F6nnen Sie nicht\nsehen","Xe v\u00E0 ng\u01B0\u1EDDi \u0111i b\u1ED9 m\u00E0 \u1EDF g\u00F3c ch\u1EBFt l\u00E0 b\u1EA1n kh\u00F4ng th\u1EA5y \u0111\u01B0\u1EE3c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("R\u00FCckspiegel m\u00FCssen auf den Fahrer eingestellt sein","G\u01B0\u01A1ng h\u1EADu ph\u1EA3i \u0111\u01B0\u1EE3c \u0111i\u1EC1u ch\u1EC9nh theo ng\u01B0\u1EDDi l\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach rechts hat der Innenspiegel keinen toten Winkel","\u1EDE h\u01B0\u1EDBng b\u00EAn ph\u1EA3i th\u00EC g\u01B0\u01A1ng g\u1EAFn trong kh\u00F4ng c\u00F3 g\u00F3c ch\u1EBFt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.08-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(594);
	    	
	    	q.setName("2.1.08-002");

			q.setText(new TranslatedString("Sie n\u00E4hern sich den abgebildeten Fahrzeugen. Wie verhalten Sie \nsich?","B\u1EA1n \u0111i g\u1EA7n xe nh\u01B0 minh h\u1ECDa. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.08-002.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf dem mittleren Fahrstreifen bleiben, Geschwindigkeit verringern\nund die Pkw nicht \u00FCberholen","Gi\u1EEF nguy\u00EAn l\u00E0n gi\u1EEFa, gi\u1EA3m t\u1ED1c v\u00E0 kh\u00F4ng v\u01B0\u1EE3t xe Pkw")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf dem mittleren Fahrstreifen \u00FCberholen","V\u01B0\u1EE3t \u1EDF l\u00E0n gi\u1EEFa")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf den linken Fahrstreifen \u00FCberwechseln und die Lichthupe bet\u00E4tigen","Chuy\u1EC3n l\u00E0n v\u01B0\u1EE3t \u1EDF l\u00E0n tr\u00E1i v\u00E0 s\u1EED d\u1EE5ng \u0111\u00E8n nh\u00E1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.08-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(595);
	    	
	    	q.setName("2.1.08-005");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie hier rechnen?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD \u0111\u1EBFn g\u00EC \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.08-005.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einem Fahrstreifenwechsel des Vorausfahrenden","Ch\u00FA \u00FD xe \u0111i tr\u01B0\u1EDBc chuy\u1EC3n l\u00E0n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einer Verdichtung des Verkehrs hinter der Unterf\u00FChrung","Ch\u00FA \u00FD c\u00F3 nhi\u1EC1u xe d\u1ED3n l\u1EA1i ph\u00EDa sau g\u1EA7m c\u1EA7u v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit dem Ende des rechten Fahrstreifens","Ch\u00FA \u00FD c\u00F3 th\u1EC3 h\u1EBFt \u0111\u01B0\u1EDDng \u1EDF l\u00E0n ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.08-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(596);
	    	
	    	q.setName("2.1.08-006");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich hier verhalten?","B\u1EA1n ph\u1EA3i l\u00E0m th\u1EBF n\u00E0o \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.08-006.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit nochmals kontrollieren, gegebenenfalls abbremsen","\u0110i\u1EC1u khi\u1EC3n t\u1ED1c \u0111\u1ED9 l\u1EA7n n\u1EEFa, n\u1EBFu c\u1EA7n ph\u1EA3i phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Erst in der Kurve abbremsen, um den nachfolgenden Verkehr nicht zu\nbehindern","\u0110\u1EA7u ti\u00EAn phanh trong cua \u0111\u1EC3 kh\u00F4ng c\u1EA3n \u0111\u01B0\u1EDDng xe \u0111i sau")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.08-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(597);
	    	
	    	q.setName("2.1.08-007");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie hier rechnen?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD \u0111\u1EBFn g\u00EC \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.08-007.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einem Stau in der Kurve","C\u00F3 k\u1EB9t sau trong cua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass die Kurve enger wird","Cua s\u1EBD h\u1EB9p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Gegenverkehr","Xe ng\u01B0\u1EE3c chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.08-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(598);
	    	
	    	q.setName("2.1.08-008");

			q.setText(new TranslatedString("Hier bildet sich ein Stau. Wie verhalten Sie sich richtig?","\u1EDE \u0111\u00E2y \u0111ang k\u1EB9t xe. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o cho \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.08-008.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("M\u00F6glichst Warnblinklicht einschalten, um nachfolgende Fahrzeuge zu\nwarnen","C\u00F3 th\u1EC3 b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o \u0111\u1EC3 th\u00F4ng b\u00E1o cho xe ph\u00EDa sau")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("So weit rechts wie m\u00F6glich fahren, um links Platz f\u00FCr eine Gasse zu\nmachen","\u0110i xa v\u1EC1 b\u00EAn ph\u1EA3i c\u00E0ng t\u1ED1t \u0111\u1EC3 t\u1EA1o l\u1ED1i \u0111i nh\u1ECF \u1EDF b\u00EAn tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("So weit links wie m\u00F6glich fahren, um rechts Platz f\u00FCr eine Gasse zu\nmachen","\u0110i xa v\u1EC1 b\u00EAn tr\u00E1i c\u00E0ng t\u1ED1t, \u0111\u1EC3 t\u1EA1o l\u1ED1i \u0111i nh\u1ECF \u1EDF b\u00EAn ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.08-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(599);
	    	
	    	q.setName("2.1.08-101");

			q.setText(new TranslatedString("Sie n\u00E4hern sich dem Lastzug, der gerade mit etwa 60 km/h auf Ihren \nFahrstreifen wechselt. Welche M\u00F6glichkeiten haben Sie?","B\u1EA1n \u0111i g\u1EA7n xe t\u1EA3i, xe \u0111\u00F3 v\u1EEBa chuy\u1EC3n l\u00E0n v\u1EDBi t\u1ED1c \u0111\u1ED9 kho\u1EA3ng 60 km/h. B\u1EA1n c\u00F3 th\u1EC3 l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.1.08-101.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dem Lastzug das \u00FCberwechseln erm\u00F6glichen und den Fahrstreifen\nbeibehalten","T\u1EA1o \u0111i\u1EC1u ki\u1EC7n cho xe t\u1EA3i v\u01B0\u1EE3t v\u00E0 gi\u1EEF nguy\u00EAn l\u00E0n \u0111\u01B0\u1EDDng c\u1EE7a m\u00ECnh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unter sorgf\u00E4ltiger Beachtung nachfolgender Fahrzeuge auf den linken\nFahrstreifen wechseln","C\u1EA9n th\u1EADn ch\u00FA \u00FD xe ph\u00EDa sau khi chuy\u1EC3n sang l\u00E0n tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrstreifen beibehalten, Lichthupe bet\u00E4tigen und Gas geben","Gi\u1EEF nguy\u00EAn l\u00E0n \u0111\u01B0\u1EDDng, nh\u00E1y \u0111\u00E8n v\u00E0 \u0111\u1EA1p gas")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.10-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(600);
	    	
	    	q.setName("2.1.10-001");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, wenn Sie bei einer n\u00E4chtlichen Fahrt auf freier \nStrecke Erm\u00FCdungserscheinungen sp\u00FCren (Lidschwere, Fr\u00F6steln, \npl\u00F6tzliches Erschrecken usw.)?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC, khi l\u00E1i xe ban \u0111\u00EAm tr\u00EAn \u0111\u01B0\u1EDDng v\u1EAFng v\u00E0 c\u1EA3m th\u1EA5y c\u00F3 d\u1EA5u hi\u1EC7u m\u1EC7t m\u1ECFi (m\u00ED m\u1EAFt n\u1EB7ng, \u1EDBn l\u1EA1nh, gi\u1EADt m\u00ECnh, ...)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrt f\u00FCr ausreichende Pause unterbrechen","D\u1EEBng l\u1EA1i ngh\u1EC9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Radio einschalten und weiterfahren","B\u1EADt radio v\u00E0 \u0111i ti\u1EBFp")));
		    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
