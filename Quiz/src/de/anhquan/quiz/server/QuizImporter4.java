package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter4 {

	static {
		
				
		//Question 1.4.40-126
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(401);
	    	
	    	q.setName("1.4.40-126");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-126.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen unbeschrankten Bahn\u00FCbergang","C\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua nh\u01B0ng kh\u00F4ng c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Eisenbahnunterf\u00FChrung","C\u00F3 \u0111\u01B0\u1EDDng ch\u1EA1y b\u00EAn d\u01B0\u1EDBi \u0111\u01B0\u1EDDng ray")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen beschrankten Bahn\u00FCbergang","C\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua v\u00E0 c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-127
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(402);
	    	
	    	q.setName("1.4.40-127");

			q.setText(new TranslatedString("Worauf weisen diese Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-127.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Bahn\u00FCbergang in der nach rechts f\u00FChrenden Stra\u00DFe","C\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua, sau \u0111\u00F3 ph\u00EDa b\u00EAn ph\u1EA3i c\u00F3 \u0111\u01B0\u1EDDng ch\u1EA1y ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf die Richtung, aus der ein Zug kommen kann","\u1EDE ph\u00EDa m\u0169i t\u00EAn, c\u00F3 th\u1EC3 c\u00F3 t\u00E0u ch\u1EA1y ra")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Umleitung, die den Bahn\u00FCbergang umgeht","Tr\u00EAn \u0111\u01B0\u1EDDng v\u00F2ng (\u0111\u01B0\u1EDDng d\u1EF1 ph\u00F2ng), c\u00F3 t\u00E0u ch\u1EA1y ngang")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-128
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(403);
	    	
	    	q.setName("1.4.40-128");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-128.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen beschrankten Bahn\u00FCbergang in etwa 240 m Entfernung","Kho\u1EA3ng 240m n\u1EEFa c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua v\u00E0 c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen beschrankten Bahn\u00FCbergang in etwa 80 m Entfernung","Kho\u1EA3ng 80m n\u1EEFa c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua v\u00E0 c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen unbeschrankten Bahn\u00FCbergang in etwa 240 m Entfernung","Kho\u1EA3ng 240m n\u1EEFa c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua nh\u01B0ng KH\u00D4NG c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-129
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(404);
	    	
	    	q.setName("1.4.40-129");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-129.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen unbeschrankten Bahn\u00FCbergang in etwa 240 m Entfernung","Kho\u1EA3ng 240m n\u1EEFa c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua nh\u01B0ng KH\u00D4NG c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen unbeschrankten Bahn\u00FCbergang in etwa 80 m Entfernung","Kho\u1EA3ng 80m n\u1EEFa c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua nh\u01B0ng KH\u00D4NG c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen beschrankten Bahn\u00FCbergang in etwa 240 m Entfernung","Kho\u1EA3ng 240m n\u1EEFa c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua v\u00E0 c\u00F3 r\u00E0o b\u1EA3o v\u1EC7")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-130
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(405);
	    	
	    	q.setName("1.4.40-130");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-130.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Bahn\u00FCbergang in etwa 160 m Entfernung","Kho\u1EA3ng 160 m n\u1EEFa s\u1EBD c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen Bahn\u00FCbergang in etwa 80 m Entfernung","Kho\u1EA3ng 80 m n\u1EEFa s\u1EBD c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen Bahn\u00FCbergang in etwa 240 m Entfernung","Kho\u1EA3ng 240 m n\u1EEFa s\u1EBD c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.40-131
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(406);
	    	
	    	q.setName("1.4.40-131");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.40-131.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Bahn\u00FCbergang in etwa 80 m Entfernung","Kho\u1EA3ng 80 m n\u1EEFa s\u1EBD c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen Bahn\u00FCbergang in etwa 160 m Entfernung","Kho\u1EA3ng 160 m n\u1EEFa s\u1EBD c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen Bahn\u00FCbergang in etwa 240 m Entfernung","Kho\u1EA3ng 240 m n\u1EEFa s\u1EBD c\u00F3 \u0111\u01B0\u1EDDng ray ch\u1EA1y qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(407);
	    	
	    	q.setName("1.4.41-001");

			q.setText(new TranslatedString("In welchem Fall m\u00FCssen Sie vor diesem Verkehrszeichen warten?","Trong tr\u01B0\u1EDDng h\u1EE3p n\u00E0o g\u1EB7p bi\u1EC3n n\u00E0y b\u1EA1n ph\u1EA3i d\u1EEBng l\u1EA1i ch\u1EDD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-001.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn ein Bahnbediensteter eine wei\u00DF-rot-wei\u00DFe Fahne schwenkt","Khi c\u00F3 nh\u00E2n vi\u00EAn \u0111\u01B0\u1EDDng s\u1EAFt v\u1EABy c\u1EDD tr\u1EAFng-\u0111\u1ECF-tr\u1EAFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie den \u00DCbergang nicht \u00FCberqueren k\u00F6nnen, ohne auf ihm\nanhalten zu m\u00FCssen","Khi b\u1EA1n kh\u00F4ng th\u1EC3 v\u01B0\u1EE3t \u1EDF ch\u1ED7 v\u01B0\u1EE3t, ohne auf ihm\nanhalten zu m\u00FCssen")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn sich ein Schienenfahrzeug n\u00E4hert","Khi \u1EDF g\u1EA7n c\u00F3 xe ch\u1EA1y tr\u00EAn \u0111\u01B0\u1EDDng ray")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(408);
	    	
	    	q.setName("1.4.41-002");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-002.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorsichtig und mit m\u00E4\u00DFiger Geschwindigkeit heranfahren","C\u1EA9n th\u1EADn v\u00E0 l\u00E1i v\u1EDBi t\u1ED1c \u0111\u1ED9 cao")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorfahrt gew\u00E4hren","Nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Als Rechtsabbieger sind Sie nicht wartepflichtig","Khi qu\u1EB9o ph\u1EA3i, b\u1EA1n kh\u00F4ng c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(409);
	    	
	    	q.setName("1.4.41-003");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei diesem Verkehrszeichen tun?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-003.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An der Haltlinie halten; wenn n\u00F6tig an der Sichtlinie erneut anhalten\nund Vorfahrt gew\u00E4hren","D\u1EEBng \u1EDF v\u1EA1ch stop (Haltlinie); khi c\u1EA7n thi\u1EBFt ph\u1EA3i d\u1EEBng l\u1EA7n n\u1EEFa \u1EDF v\u1EA1ch quan s\u00E1t (Sichtlinie) v\u00E0 nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn keine Haltlinie vorhanden ist, an der Sichtlinie anhalten","khi kh\u00F4ng c\u00F3 v\u1EA1ch stop, d\u1EEBng \u1EDF v\u1EA1ch quan s\u00E1t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur anhalten, wenn Querverkehr kommt","Ch\u1EC9 d\u1EEBng, khi c\u00F3 xe ch\u1EA1y c\u1EAFt ngang")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(410);
	    	
	    	q.setName("1.4.41-004");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-004.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen die Fahrtrichtungs\u00E4nderung nach rechts anzeigen","B\u1EA1n ph\u1EA3i ra d\u1EA5u hi\u1EC7u chuy\u1EC3n h\u01B0\u1EDBng sang ph\u1EA3i (nh\u00E1y \u0111\u00E8n xi-nhan ph\u1EA3i)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nur nach rechts weiterfahren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c ph\u00E9p \u0111i ti\u1EBFp theo h\u01B0\u1EDBng b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nicht nach rechts abbiegen","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(411);
	    	
	    	q.setName("1.4.41-005");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-005.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen die Fahrtrichtungs\u00E4nderung nach links anzeigen","B\u1EA1n ph\u1EA3i ra d\u1EA5u hi\u1EC7u chuy\u1EC3n h\u01B0\u1EDBng sang tr\u00E1i (nh\u00E1y \u0111\u00E8n xi-nhan tr\u00E1i)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nur nach links weiterfahren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c ph\u00E9p \u0111i ti\u1EBFp theo h\u01B0\u1EDBng b\u00EAn tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nicht nach links weiterfahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u00E1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(412);
	    	
	    	q.setName("1.4.41-006");

			q.setText(new TranslatedString("In welche Richtungen d\u00FCrfen Sie weiterfahren?","B\u1EA1n \u0111\u01B0\u1EE3c \u0111i ti\u1EBFp theo h\u01B0\u1EDBng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-006.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geradeaus","\u0110i th\u1EB3ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach rechts","Qu\u1EB9o ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach links","Qu\u1EB9o tr\u00E1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(413);
	    	
	    	q.setName("1.4.41-007");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich bei diesem Verkehrszeichen verhalten?","G\u1EB7p bi\u1EC3n b\u00E1o b\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-007.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen an Verkehrsinseln rechts vorbeifahren","B\u1EA1n ph\u1EA3i \u0111i qua Verkehrsinseln \u1EDF ph\u00EDa b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie sind verpflichtet, nach rechts abzubiegen","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o ph\u1EA3i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen vor diesem Zeichen nicht nach links abbiegen","Tr\u01B0\u1EDBc bi\u1EC3n b\u00E1o n\u00E0y, b\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u00E1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(414);
	    	
	    	q.setName("1.4.41-008");

			q.setText(new TranslatedString("Sie n\u00E4hern sich einer so gekennzeichneten Haltestelle. Wie \nverhalten Sie sich, wenn Sie dort Kinder sehen?","B\u1EA1n \u0111i g\u1EA7n tr\u1EA1m xe bus c\u00F3 bi\u1EC3n b\u00E1o nh\u01B0 h\u00ECnh v\u1EBD. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o khi th\u1EA5y tr\u1EBB con \u1EDF \u0111\u00F3?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-008.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern und bremsbereit bleiben","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 v\u00E0 s\u1EB5n s\u00E0ng phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Eine Verminderung der Geschwindigkeit ist nur erforderlich, wenn dort\nein Schulbus h\u00E4lt","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 ch\u1EC9 c\u1EA7n thi\u1EBFt khi \u1EDF \u0111\u00F3 c\u00F3 xe bus \u0111ang d\u1EEBng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Geschwindigkeit muss nicht vermindert werden, wenn ein Bus in\neiner Haltebucht h\u00E4lt","Kh\u00F4ng c\u1EA7n gi\u1EA3m t\u1ED1c \u0111\u1ED9, v\u00EC xe bus d\u1EEBng \u1EDF trong tr\u1EA1m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(415);
	    	
	    	q.setName("1.4.41-009");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-009.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Sonderweg f\u00FCr Fu\u00DFg\u00E4nger","\u0110\u01B0\u1EDDng \u0111\u1EB7c bi\u1EC7t cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf ein Verbot f\u00FCr Fahrrad- und Mofa-Fahrer","C\u1EA5m xe \u0111\u1EA1p v\u00E0 xe m\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf den Beginn eines verkehrsberuhigten Bereichs","B\u1EAFt \u0111\u1EA7u khu v\u1EF1c h\u1EA1n ch\u1EBF xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(416);
	    	
	    	q.setName("1.4.41-010");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei diesem Verkehrszeichen beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-010.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Diese Fu\u00DFg\u00E4ngerzone d\u00FCrfen Sie mit einem Kraftfahrzeug nicht\nbefahren","\u0110\u00E2y l\u00E0 khu v\u1EF1c \u0111i b\u1ED9, b\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c l\u00E1i xe c\u00F3 \u0111\u1ED9ng c\u01A1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In dieser Fu\u00DFg\u00E4ngerzone d\u00FCrfen Sie mit einem Kraftfahrzeug mit\nSchrittgeschwindigkeit fahren","Trong khu v\u1EF1c \u0111i b\u1ED9, b\u1EA1n \u0111\u01B0\u1EE3c l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 ng\u01B0\u1EDDi \u0111i b\u1ED9")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Als Anlieger d\u00FCrfen Sie in dieser Fu\u00DFg\u00E4ngerzone mit Kraftfahrzeugen\nfahren","Ng\u01B0\u1EDDi d\u00E2n s\u1ED1ng \u1EDF g\u1EA7n \u0111\u00F3 \u0111\u01B0\u1EE3c \u0111i xe c\u00F3 \u0111\u1ED9ng c\u01A1 trong khu v\u1EF1c \u0111i b\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-011
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(417);
	    	
	    	q.setName("1.4.41-011");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen diese Stra\u00DFe nicht benutzen?","Xe n\u00E0o kh\u00F4ng \u0111\u01B0\u1EE3c s\u1EED d\u1EE5ng \u0111\u01B0\u1EDDng c\u00F3 bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-011.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kraftfahrzeuge aller Art","T\u1EA5t c\u1EA3 c\u00E1c lo\u1EA1i xe c\u00F3 \u0111\u1ED9ng c\u01A1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Handfahrzeuge","Xe tay")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Motorr\u00E4der und Fahrr\u00E4der, die geschoben werden","Xe m\u00F4-t\u00F4, xe \u0111\u1EA1p lo\u1EA1i \u0111\u1EA9y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-012
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(418);
	    	
	    	q.setName("1.4.41-012");

			q.setText(new TranslatedString("Womit darf man hier nicht fahren?","Xe n\u00E0o kh\u00F4ng \u0111\u01B0\u1EE3c ch\u1EA1y \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-012.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Mofas","Xe m\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Kleinkraftr\u00E4dern","Xe \u0111\u1EA1p c\u00F3 \u0111\u1ED9ng c\u01A1 nh\u1ECF")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Leichtkraftr\u00E4dern","Xe \u0111\u1EA1p c\u00F3 \u0111\u1ED9ng c\u01A1 y\u1EBFu")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-013
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(419);
	    	
	    	q.setName("1.4.41-013");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei diesem Verkehrszeichen beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-013.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Aus dieser Stra\u00DFe k\u00F6nnen Fahrzeuge kommen","Xe \u0111\u01B0\u1EE3c \u0111i ra kh\u1ECFi \u0111\u01B0\u1EDDng n\u00E0y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nicht in diese Stra\u00DFe einfahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c \u0111i v\u00E0o \u0111\u01B0\u1EDDng n\u00E0y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen in diese Stra\u00DFe einfahren","B\u1EA1n \u0111\u01B0\u1EE3c \u0111i v\u00E0o \u0111\u01B0\u1EDDng n\u00E0y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-014
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(420);
	    	
	    	q.setName("1.4.41-014");

			q.setText(new TranslatedString("Was haben Sie bei diesem Verkehrszeichen zu beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-014.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nicht halten","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1ED7 l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen halten zum Be- oder Entladen","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1ED7 l\u1EA1i \u0111\u1EC3 ch\u1EA5t hay g\u1EE1 \u0111\u1ED3 \u0111\u1EA1c")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen halten, um Mitfahrer aussteigen zu lassen","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1ED7 l\u1EA1i \u0111\u1EC3 ng\u01B0\u1EDDi \u0111i c\u00F9ng xu\u1ED1ng xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-015
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(421);
	    	
	    	q.setName("1.4.41-015");

			q.setText(new TranslatedString("Was ist bei diesem Verkehrszeichen erlaubt?","Bi\u1EC3n n\u00E0y cho ph\u00E9p g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-015.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Halten zum Be- oder Entladen sowie zum Ein- oder Aussteigen","\u0110\u01B0\u1EE3c \u0111\u1EADu \u0111\u1EC3 ch\u1EA5t hay g\u1EE1 \u0111\u1ED3 \u0111\u1EA1c, hay cho ng\u01B0\u1EDDi l\u00EAn xu\u1ED1ng xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Halten bis zu 3 Minuten","Cho ph\u00E9p d\u1EEBng l\u00E2u nh\u1EA5t 3 ph\u00FAt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Parken, wenn eine Parkscheibe benutzt wird","Cho \u0111\u1EADu, khi c\u00F3 v\u00E9 \u0111\u1EADu xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-016
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(422);
	    	
	    	q.setName("1.4.41-016");

			q.setText(new TranslatedString("Was ist bei diesen Verkehrszeichen erlaubt?","Bi\u1EC3n n\u00E0y cho ph\u00E9p g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-016.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schwerbehinderte mit entsprechend nummeriertem Parkausweis\nd\u00FCrfen hier parken","Ng\u01B0\u1EDDi t\u00E0n t\u1EADt n\u1EB7ng c\u00F3 gi\u1EA5y ph\u00E9p \u0111\u1EADu xe v\u1EDBi s\u1ED1 t\u01B0\u01A1ng \u1EE9ng v\u1EDBi tr\u00EAn bi\u1EC3n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu \u1EDF \u0111\u00E2y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Halten zum Ein- oder Aussteigen f\u00FCr jeden","\u0110\u01B0\u1EE3c ph\u00E9p d\u1EEBng \u0111\u1EC3 cho ng\u01B0\u1EDDi l\u00EAn xu\u1ED1ng xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit einem Parkschein aus einem Parkscheinautomaten darf hier jeder\nunbegrenzt parken","C\u00F3 v\u00E9 \u0111\u1EADu xe mua t\u1EEB m\u00E1y t\u1EF1 \u0111\u1ED9ng, \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu \u1EDF \u0111\u00E2y kh\u00F4ng h\u1EA1n ch\u1EBF")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(423);
	    	
	    	q.setName("1.4.41-101");

			q.setText(new TranslatedString("Was wird durch diese Verkehrszeichen angek\u00FCndigt?","Bi\u1EC3n n\u00E0y th\u00F4ng b\u00E1o \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-101.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach 100 m folgt ein Stoppschild","100m n\u1EEFa s\u1EBD c\u00F3 bi\u1EC3n Stop")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach 100 m folgt erneut das Verkehrszeichen \u201EVorfahrt gew\u00E4hren!\u201C","100m n\u1EEFa s\u1EBD c\u00F3 b\u1EA3ng \u201Enh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn\u201C!")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach 100 m kann ohne anzuhalten weitergefahren werden","100m n\u1EEFa c\u00F3 th\u1EC3 \u0111i th\u1EB3ng ti\u1EBFp m\u00E0 kh\u00F4ng ph\u1EA3i d\u1EEBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(424);
	    	
	    	q.setName("1.4.41-102");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-102.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen dem Gegenverkehr Vorrang gew\u00E4hren","B\u1EA1n ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn cho xe ng\u01B0\u1EE3c chi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nicht abbiegen","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c qu\u1EB9o")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie haben Vorrang vor dem Gegenverkehr","B\u1EA1n c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn h\u01A1n xe ng\u01B0\u1EE3c chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(425);
	    	
	    	q.setName("1.4.41-103");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-103.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen links blinken","Ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan b\u00EAn tr\u00E1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nur nach links weiterfahren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i th\u1EB3ng ti\u1EBFp theo h\u01B0\u1EDBng b\u00EAn tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nicht nach links abbiegen","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u00E1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(426);
	    	
	    	q.setName("1.4.41-104");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-104.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen rechts blinken","B\u1EA1n ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhanh ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nur nach rechts weiterfahren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i ti\u1EBFp v\u1EC1 b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nicht nach rechts weiterfahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c \u0111i ti\u1EBFp v\u1EC1 b\u00EAn ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(427);
	    	
	    	q.setName("1.4.41-105");

			q.setText(new TranslatedString("Was sagt Ihnen dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y n\u00F3i cho b\u1EA1n bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-105.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen nur geradeaus weiterfahren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i th\u1EB3ng ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nicht geradeaus weiterfahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p \u0111i th\u1EB3ng ti\u1EBFp")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie befinden sich in einer Einbahnstra\u00DFe","B\u1EA1n \u0111ang \u0111i tr\u00EAn \u0111\u01B0\u1EDDng m\u1ED9t chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(428);
	    	
	    	q.setName("1.4.41-106");

			q.setText(new TranslatedString("In welche Richtungen d\u00FCrfen Sie weiterfahren?","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111i ti\u1EBFp theo h\u01B0\u1EDBng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-106.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach links","Qu\u1EB9o tr\u00E1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach rechts","Qu\u1EB9o ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Geradeaus","\u0110i th\u1EB3ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(429);
	    	
	    	q.setName("1.4.41-107");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich bei diesem Verkehrszeichen verhalten?","G\u1EB7p bi\u1EC3n b\u00E1o b\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-107.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen an Hindernissen links vorbeifahren","B\u1EA1n ph\u1EA3i \u0111i qua ch\u01B0\u1EDBng ng\u1EA1i v\u1EADt v\u1EC1 phesi tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie sind verpflichtet, nach links abzubiegen","B\u1EA1n ph\u1EA3i qu\u1EB9o tr\u00E1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen vor dem Zeichen nicht nach rechts abbiegen","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p tr\u01B0\u1EDBc bi\u1EC3n n\u00E0y qu\u1EB9o ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(430);
	    	
	    	q.setName("1.4.41-108");

			q.setText(new TranslatedString("Wie verhalten Sie sich im Bereich dieses Verkehrszeichens?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o trong khu v\u1EF1c c\u00F3 bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-108.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen halten","B\u1EA1n ph\u1EA3i d\u1EEBng l\u1EA1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen ein- oder aussteigende Fahrg\u00E4ste nicht gef\u00E4hrden","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p g\u00E2y nguy hi\u1EC3m cho kh\u00E1ch l\u00EAn xu\u1ED1ng xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen parken","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(431);
	    	
	    	q.setName("1.4.41-109");

			q.setText(new TranslatedString("Etwa 80 m vor Ihnen h\u00E4lt ein Schulbus auf der Fahrbahn. K\u00F6nnen \ndaraus Gefahren entstehen?","Tr\u01B0\u1EDBc b\u1EA1n kho\u1EA3ng 80m c\u00F3 m\u1ED9t xe bus h\u1ECDc sinh tr\u00EAn \u0111\u01B0\u1EDDng. C\u00F3 th\u1EC3 c\u00F3 nguy hi\u1EC3m di\u1EC5n ra \u1EDF \u0111\u00E2y kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-109.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, weil Kinder h\u00E4ufig \u00FCber die Stra\u00DFe rennen, um den Bus noch zu\nerreichen","C\u00F3, v\u00EC tr\u1EBB con th\u01B0\u1EDDng ch\u1EA1y qua d\u01B0\u1EDDng \u0111\u1EC3 b\u1EAFt k\u1ECBp xe bus")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, weil Kinder nicht immer auf k\u00FCrzestem Weg die Fahrbahn\n\u00FCberqueren","C\u00F3, v\u00EC tr\u1EBB con kh\u00F4ng ph\u1EA3i l\u00FAc n\u00E0o c\u0169ng b\u0103ng \u0111\u01B0\u1EDDng theo \u0111\u01B0\u1EDDng ng\u1EAFn nh\u1EA5t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nein, weil an jeder Schulbushaltestelle Sch\u00FClerlotsen den Verkehr\nsichern","Kh\u00F4ng, v\u00EC \u1EDF c\u00E1c tr\u1EA1m xe bus c\u1EE7a tr\u01B0\u1EDDng lu\u00F4n c\u00F3 ng\u01B0\u1EDDi b\u1EA3o v\u1EC7 h\u1ECDc sinh qua \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(432);
	    	
	    	q.setName("1.4.41-110");

			q.setText(new TranslatedString("Was haben Sie im Bereich dieses Verkehrszeichens zu beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC trong khu v\u1EF1c c\u00F3 bi\u1EC3n b\u00E1o n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-110.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen mit an- und abfahrenden Taxen rechnen","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD c\u00F3 xe taxi v\u00E0o ra")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen halten","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p d\u1EEBng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen parken","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(433);
	    	
	    	q.setName("1.4.41-111");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-111.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Radweg","\u0110\u01B0\u1EDDng d\u00E0nh cho xe \u0111\u1EA1p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf ein Verbot f\u00FCr Radfahrer","C\u1EA5m xe \u0111\u1EA1p")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf Radfahrer, die die Fahrbahn kreuzen","C\u00F3 xe \u0111\u1EA1p b\u0103ng qua \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(434);
	    	
	    	q.setName("1.4.41-112");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-112.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Reitweg, der f\u00FCr andere Verkehrsteilnehmer verboten ist","\u0110\u01B0\u1EDDng d\u00E0nh ri\u00EAng cho c\u01B0\u1EE1i ng\u1EF1a, c\u1EA5m c\u00E1c xe kh\u00E1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen Weg, den Reiter zu benutzen haben","\u0110\u01B0\u1EDDng cho ph\u00E9p c\u01B0\u1EE1i ng\u1EF1a")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf ein Verbot f\u00FCr Reiter","\u0110\u01B0\u1EDDng c\u1EA5m c\u01B0\u1EE1i ng\u1EF1a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(435);
	    	
	    	q.setName("1.4.41-113");

			q.setText(new TranslatedString("Wie muss sich ein Kraftfahrer in dieser Stra\u00DFe verhalten?","Ng\u01B0\u1EDDi l\u00E1i xe c\u00F3 \u0111\u1ED9ng c\u01A1 ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o tr\u00EAn \u0111\u01B0\u1EDDng n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-113.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Er darf nur mit Schrittgeschwindigkeit fahren","Anh ta ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Er muss auf Fu\u00DFg\u00E4nger besondere R\u00FCcksicht nehmen","Anh ta ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD \u0111\u1EBFn ng\u01B0\u1EDDi \u0111i b\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn keine Fu\u00DFg\u00E4nger in der N\u00E4he sind, darf schneller als\nSchrittgeschwindigkeit gefahren werden","Khi kh\u00F4ng c\u00F3 ng\u01B0\u1EDDi \u0111i b\u1ED9 \u1EDF g\u1EA7n, \u0111\u01B0\u1EE3c ph\u00E9p \u0111i nhanh h\u01A1n t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(436);
	    	
	    	q.setName("1.4.41-114");

			q.setText(new TranslatedString("Wer darf auf dieser Stra\u00DFe mit einem Kraftfahrzeug fahren?","Ai \u0111\u01B0\u1EE3c ph\u00E9p \u0111i xe c\u00F3 \u0111\u1ED9ng c\u01A1 v\u00E0o \u0111\u01B0\u1EDDng n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-114.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wer Waren liefern muss","Ng\u01B0\u1EDDi n\u00E0o c\u00F3 h\u00E0nh h\u00F3a chuy\u1EC3n \u0111\u1EBFn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wer etwas einkaufen will","Ng\u01B0\u1EDDi n\u00E0o mu\u1ED1n mua s\u1EAFp c\u00E1i g\u00EC \u0111\u00F3")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wer jemanden besuchen will","NG\u01B0\u1EDDi n\u00E0o mu\u1ED1n \u0111i th\u0103m ai \u0111\u00F3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(437);
	    	
	    	q.setName("1.4.41-115");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen den so gekennzeichneten \nSonderfahrstreifen benutzen?","Xe n\u00E0o \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng \u0111\u01B0\u1EDDng c\u00F3 bi\u1EC3n b\u00E1o d\u00E0nh cho xe \u0111\u1EB7c bi\u1EC7t n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-115.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Linienbusse","Bus tuy\u1EBFn (Linienbusse)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Lkw","Lkw (xe t\u1EA3i)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Pkw","Pkw (xe c\u00E1 nh\u00E2n)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-116
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(438);
	    	
	    	q.setName("1.4.41-116");

			q.setText(new TranslatedString("Wer darf in eine so beschilderte Stra\u00DFe einfahren?","Ai \u0111\u01B0\u1EE3c l\u00E1i xe v\u00E0o \u0111\u01B0\u1EDDng treo bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-116.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bewohner","Ng\u01B0\u1EDDi d\u00E2n s\u1ED1ng \u1EDF khu v\u1EF1c n\u00E0y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Besucher der Bewohner","Kh\u00E1ch \u0111\u1EBFn th\u0103m ng\u01B0\u1EDDi s\u1ED1ng \u1EDF khu v\u1EF1c n\u00E0y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrzeuge im Durchgangsverkehr","Xe \u0111i ngang qua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-117
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(439);
	    	
	    	q.setName("1.4.41-117");

			q.setText(new TranslatedString("Wie verhalten Sie sich, wenn Sie im Winter in eine so beschilderte \nStra\u00DFe einfahren?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi th\u1EA5y bi\u1EC3n n\u00E0y v\u00E0o m\u00F9a \u0111\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-117.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Soweit erforderlich, mit Schrittgeschwindigkeit fahren","Khi c\u1EA7n thi\u1EBFt, l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Wintersportler achten","Ch\u00FA \u00FD ng\u01B0\u1EDDi ch\u01A1i th\u1EC3 thao m\u00F9a \u0111\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Als Anlieger brauchen Sie auf der Fahrbahn keine besondere\nR\u00FCcksichtauf Wintersportler zu nehmen","N\u1EBFu l\u00E0 ng\u01B0\u1EDDi s\u1ED1ng trong khu v\u1EF1c n\u00E0y, b\u1EA1n kh\u00F4ng c\u1EA7n \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD ng\u01B0\u1EDDi ch\u01A1i th\u1EC3 thao m\u00F9a \u0111\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(440);
	    	
	    	q.setName("1.4.41-118");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen eine so beschilderte Stra\u00DFe nicht \nbefahren?","Xe n\u00E0o kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p l\u00E1i v\u00E0o \u0111\u01B0\u1EDDng c\u00F3 bi\u1EC3n b\u00E1o sau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-118.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Lkw","Lkw")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Pkw","Pkw")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Motorr\u00E4der","Xe m\u00E1y (Motorr\u00E4der)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-119
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(441);
	    	
	    	q.setName("1.4.41-119");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen eine so beschilderte Stra\u00DFe nicht \nbefahren?","Xe n\u00E0o kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p l\u00E1i v\u00E0o \u0111\u01B0\u1EDDng c\u00F3 bi\u1EC3n b\u00E1o sau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-119.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrr\u00E4der","Xe \u0111\u1EA1p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Motorr\u00E4der","Xe m\u00E1y")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Pkw","Pkw (xe h\u01A1i c\u00E1 nh\u00E2n)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-120
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(442);
	    	
	    	q.setName("1.4.41-120");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen eine so beschilderte Stra\u00DFe nicht \nbefahren?","Xe n\u00E0o kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p l\u00E1i v\u00E0o \u0111\u01B0\u1EDDng c\u00F3 bi\u1EC3n b\u00E1o sau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-120.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Motorr\u00E4der","Xe m\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Pkw","Pkw (xe h\u01A1i c\u00E1 nh\u00E2n)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Lkw","Lkw (xe t\u1EA3i)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-121
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(443);
	    	
	    	q.setName("1.4.41-121");

			q.setText(new TranslatedString("Worauf weisen diese Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-121.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf das Verbot der Einfahrt in 100 m Entfernung","C\u00F2n 100m n\u1EEFa l\u00E0 c\u00F3 bi\u1EC3n c\u1EA5m v\u00E0o \u0111\u01B0\u1EDDng n\u00E0y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Einbahnstra\u00DFe von 100 m L\u00E4nge","C\u00F3 \u0111\u01B0\u1EDDng 1 chi\u1EC1u d\u00E0i 100m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Zollstelle in 100 m Entfernung","C\u00F2n 100m n\u1EEFa c\u00F3 v\u0103n ph\u00F2ng d\u1ECBch v\u1EE5 kh\u00E1ch h\u00E0ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-122
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(444);
	    	
	    	q.setName("1.4.41-122");

			q.setText(new TranslatedString("Was sagt Ihnen dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y n\u00F3i cho b\u1EA1n bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-122.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen hier nicht wenden","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o \u1EDF \u0111\u00E2y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie befinden sich in einer Sackgasse und m\u00FCssen umkehren","B\u1EA1n \u0111ang \u1EDF ng\u00F5 c\u1EE5t m\u00E0 ph\u1EA3i quay ng\u01B0\u1EE3c l\u1EA1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen hier nicht links abbiegen","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u00E1i \u1EDF \u0111\u00E2y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-123
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(445);
	    	
	    	q.setName("1.4.41-123");

			q.setText(new TranslatedString("Was sagt Ihnen dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y n\u00F3i cho b\u1EA1n bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-123.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es darf nicht schneller als 60 km/h gefahren werden","Kh\u00F4ng \u0111\u01B0\u1EE3c ch\u1EA1y nhanh h\u01A1n 60 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Geschwindigkeit von 60 km/h ist in jedem Fall unbedenklich","T\u1ED1c \u0111\u1ED9 60 km/h lu\u00F4n an to\u00E0n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die empfohlene Mindestgeschwindigkeit betr\u00E4gt 60 km/h","T\u1ED1c \u0111\u1ED9 t\u1ED1i thi\u1EC3u \u0111\u1EC1 ngh\u1ECB l\u00E0 60 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-124
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(446);
	    	
	    	q.setName("1.4.41-124");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin? \nHier beginnt eine Zone mit einer","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?\n\n- \u1EDE \u0111\u00E2y b\u1EAFt \u0111\u1EA7u khu v\u1EF1c ..."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-124.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 zul\u00E4ssigen H\u00F6chstgeschwindigkeit von 30 km/h","V\u1EADn t\u1ED1c cao nh\u1EA5t cho ph\u00E9p l\u00E0 30 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 vorgeschriebenen Mindestgeschwindigkeit von 30 km/h","V\u1EADn t\u1ED1c t\u1ED1i thi\u1EC3u qui \u0111\u1ECBnh l\u00E0 30 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 Richtgeschwindigkeit von 30 km/h","V\u1EADn t\u1ED1c \u0111\u1EC1 ngh\u1ECB l\u00E0 30 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-125
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(447);
	    	
	    	q.setName("1.4.41-125");

			q.setText(new TranslatedString("Hier beginnt ein verkehrsberuhigter Gesch\u00E4ftsbereich. Wie m\u00FCssen \nSie sich verhalten?","\u0110\u00E2y b\u1EAFt \u0111\u1EA7u khu v\u1EF1c h\u1EA1n ch\u1EBF xe. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-125.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf regen Fu\u00DFg\u00E4ngerverkehr besonders achten","\u0110\u1EB7c bi\u1EC7t ch\u00FA \u00FD \u0111\u01B0\u1EDDng \u0111i b\u1ED9 \u0111\u00F4ng ng\u01B0\u1EDDi qua l\u1EA1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("H\u00F6chstparkdauer beachten","Th\u1EDDi gian \u0111\u01B0\u1EE3c \u0111\u1EADu xe t\u1ED1i \u0111a")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mindestgeschwindigkeit von 20 km/h einhalten","Gi\u1EEF v\u1EADn t\u1ED1c t\u1ED1i thi\u1EC3u l\u00E0 20 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-126
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(448);
	    	
	    	q.setName("1.4.41-126");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin? \nAuf das Ende einer Zone mit einer","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?\n\n- \u0110i ra ngo\u00E0i khu v\u1EF1c c\u00F3 ..."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-126.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 zul\u00E4ssigen H\u00F6chstgeschwindigkeit von 30 km/h","... v\u1EADn t\u1ED1c cao nh\u1EA5t \u0111\u01B0\u1EE3c ph\u00E9p l\u00E0 30 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 vorgeschriebenen Mindestgeschwindigkeit von 30 km/h","... v\u1EADn t\u1ED1c t\u1ED1i thi\u1EC3u \u0111\u01B0\u1EE3c qui \u0111\u1ECBnh l\u00E0 30 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 Richtgeschwindigkeit von 30 km/h","... v\u1EADn t\u1ED1c \u0111\u1EC1 ngh\u1ECB 30 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-127
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(449);
	    	
	    	q.setName("1.4.41-127");

			q.setText(new TranslatedString("Darf hier schneller als 60 km/h gefahren werden?","\u1EDE \u0111\u00E2y c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y nhanh h\u01A1n 60 km/h kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-127.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, wenn die Fahrbahn trocken ist","C\u00F3, khi \u0111\u01B0\u1EDDng tr\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, wenn die Fahrbahn nass ist","C\u00F3, khi \u0111\u01B0\u1EDDng \u01B0\u1EDBt")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-128
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(450);
	    	
	    	q.setName("1.4.41-128");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-128.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen mindestens mit 60 km/h fahren, sofern Sie nicht aus\nGr\u00FCnden der Verkehrssicherheit langsamer fahren m\u00FCssen","B\u1EA1n ph\u1EA3i ch\u1EA1y nhanh h\u01A1n 60 km/h, gi\u1EA3 s\u1EED b\u1EA1n kh\u00F4ng c\u00F3 l\u00FD do an to\u00E0n ph\u1EA3i ch\u1EA1y ch\u1EADm")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen diese Stra\u00DFe nicht benutzen, wenn Sie nicht mindestens\n60 km/h fahren k\u00F6nnen oder d\u00FCrfen","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c s\u1EED d\u1EE5ng \u0111\u01B0\u1EDDng n\u00E0y, khi b\u1EA1n kh\u00F4ng th\u1EC3 hay kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y t\u1ED1i thi\u1EC3u 60 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nicht schneller als 60 km/h fahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y nhanh h\u01A1n 60 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-129
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(451);
	    	
	    	q.setName("1.4.41-129");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen Sie bei diesem Verkehrszeichen \n\u00FCberholen?","Xe n\u00E0o g\u1EB7p bi\u1EC3n n\u00E0y \u0111\u01B0\u1EE3c ph\u00E9p v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-129.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Motorrad ohne Beiwagen","Xe m\u00E1y kh\u00F4ng c\u00F3 Beiwagen")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Motorrad mit Beiwagen","Xe m\u00E1y c\u00F3 Beiwagen")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Pkw","Pkw")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-130
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(452);
	    	
	    	q.setName("1.4.41-130");

			q.setText(new TranslatedString("Worauf weisen diese Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-130.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine \u00DCberholverbotsstrecke von 3 km L\u00E4nge","\u0110\u1ED9 d\u00E0i \u0111\u01B0\u1EDDng c\u1EA5m v\u01B0\u1EE3t l\u00E0 3 km")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf ein \u00DCberholverbot, das in 3 km Entfernung beginnt","\u0110i th\u00EAm 3km s\u1EBD c\u1EA5m v\u01B0\u1EE3t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Fahrbahn mit zwei Fahrstreifen f\u00FCr eine Richtung von 3 km\nL\u00E4nge","\u0110\u01B0\u1EDDng d\u00E0i 3km v\u1EDBi 2 l\u00E0n xe c\u1EE7a c\u00F9ng m\u1ED9t h\u01B0\u1EDBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-131
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(453);
	    	
	    	q.setName("1.4.41-131");

			q.setText(new TranslatedString("Worauf weisen diese Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-131.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf ein \u00DCberholverbot, das in 200 m Entfernung beginnt","\u0110i th\u00EAm 200m n\u1EEFa s\u1EBD c\u1EA5m v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine \u00DCberholverbotsstrecke von 200 m L\u00E4nge","\u0110\u1ED9 d\u00E0i \u0111\u01B0\u1EDDng c\u1EA5m v\u01B0\u1EE3t l\u00E0 200m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf ein \u00DCberholverbot, das nach 200 m endet","\u0110i th\u00EAm 200m n\u1EEFa l\u00E0 h\u1EBFt \u0111o\u1EA1n \u0111\u01B0\u1EDDng c\u1EA5m v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-132
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(454);
	    	
	    	q.setName("1.4.41-132");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-132.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf das Ende der Geschwindigkeitsbeschr\u00E4nkung","H\u1EBFt khu v\u1EF1c h\u1EA1n ch\u1EBF t\u1ED1c \u0111\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf ein Verbot, schneller als 60 km/h zu fahren","C\u1EA5m \u0111i nhanh h\u01A1n 60 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf den Anfang der Geschwindigkeitsbeschr\u00E4nkung","B\u1EAFt \u0111\u1EA7u khu v\u1EF1c h\u1EA1n ch\u1EBF t\u1ED1c \u0111\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-133
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(455);
	    	
	    	q.setName("1.4.41-133");

			q.setText(new TranslatedString("Welche Verbote werden mit diesem Verkehrszeichen aufgehoben?","Bi\u1EC3n n\u00E0y c\u1EA5m \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-133.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00DCberholverbote","C\u1EA5m v\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeitsbeschr\u00E4nkungen","H\u1EA1n ch\u1EBF t\u1ED1c \u0111\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Parkverbote","C\u1EA5m \u0111\u1EADu xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-134
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(456);
	    	
	    	q.setName("1.4.41-134");

			q.setText(new TranslatedString("Worauf weisen diese Verkehrszeichen hin? \nAuf ein Haltverbot,","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?\n\n- C\u1EA5m d\u1EEBng ..."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-134.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 das auf der Fahrbahn und auch auf dem Seitenstreifen gilt","... tr\u00EAn \u0111\u01B0\u1EDDng v\u00E0 c\u1EA3 tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 das nur auf dem Seitenstreifen gilt","... tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 das nur f\u00FCr Lkw gilt","... ch\u1EC9 \u00E1p d\u1EE5ng cho xe t\u1EA3i Lkw")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-135
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(457);
	    	
	    	q.setName("1.4.41-135");

			q.setText(new TranslatedString("Was ist in der hier beginnenden Zone erlaubt?","\u1EDE \u0111\u00E2y b\u1EAFt \u0111\u1EA7u khu v\u1EF1c cho ph\u00E9p \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-135.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Halten bis zu 3 Minuten","D\u1EEBng l\u00E2u nh\u1EA5t 3 ph\u00FAt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Halten zum Be- oder Entladen sowie zum Aus- oder Einsteigen","D\u1EEBng \u0111\u1EC3 ch\u1EA5t/d\u1EE1 \u0111\u1ED3 \u0111\u1EA1c ho\u1EB7c cho ng\u01B0\u1EDDi l\u00EAn/xu\u1ED1ng xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Parken, wenn eine Parkscheibe benutzt wird","\u0110\u1EADu xe, khi c\u00F3 v\u00E9 \u0111\u1EADu xe (Parkscheibe)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-136
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(458);
	    	
	    	q.setName("1.4.41-136");

			q.setText(new TranslatedString("Was endet hier?","Bi\u1EC3n n\u00E0y k\u1EBFt th\u00FAc \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-136.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine Zone mit eingeschr\u00E4nktem Haltverbot","H\u1EBFt khu v\u1EF1c c\u1EA5m v\u01B0\u1EE3t Eine Zone mit eingeschr\u00E4nktem Haltverbot")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Eine Zone mit absolutem Haltverbot","H\u1EBFt khu v\u1EF1c ho\u00E0n to\u00E0n c\u1EA5m d\u1EEBng l\u1EA1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vorausgegangene Streckenverbote","Vorausgegangene Streckenverbote")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-137
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(459);
	    	
	    	q.setName("1.4.41-137");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei dieser Linie in der Fahrbahnmitte beachten? \nSie d\u00FCrfen die Linie","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC v\u1EA1ch s\u01A1n gi\u1EEFa \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-137.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 nicht \u00FCberqueren oder \u00FCber ihr fahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c b\u0103ng qua hay v\u01B0\u1EE3t tr\u00EAn v\u1EA1ch n\u00E0y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 nur zum \u00DCberholen \u00FCberqueren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i l\u00EAn v\u1EA1ch n\u00E0y khi v\u01B0\u1EE3t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 nur \u00FCberqueren, wenn es der Gegenverkehr zul\u00E4sst","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c v\u01B0\u1EE3t khi xe ng\u01B0\u1EE3c chi\u1EC1u cho ph\u00E9p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-138
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(460);
	    	
	    	q.setName("1.4.41-138");

			q.setText(new TranslatedString("Was ist hier zu beachten (keine Vorfahrtstra\u00DFe)?","\u1EDE \u0111\u00E2y ph\u1EA3i ch\u00FA \u00FD g\u00EC (kh\u00F4ng c\u00F3 \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-138.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Parken ist erlaubt, wenn zwischen einem parkenden Fahrzeug und\nder Mittellinie ein Fahrstreifen von mindestens 3 m bleibt","\u0110\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu xe, khi kho\u1EA3ng c\u00E1ch gi\u1EEFa xe \u0111\u1EADu b\u00EAn \u0111\u01B0\u1EDDng v\u00E0 v\u1EA1ch s\u01A1n gi\u1EEFa \u0111\u01B0\u1EDDng t\u1ED1i thi\u1EC3u 3m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrzeuge d\u00FCrfen die Mittellinie nicht \u00FCberqueren oder \u00FCber ihr fahren","Xe kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p \u0111i l\u00EAn v\u1EA1ch hay v\u01B0\u1EE3t tr\u00EAn v\u1EA1ch s\u01A1n gi\u1EEFa \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Mittellinie darf \u00FCberfahren werden, wenn es der Gegenverkehr\nzul\u00E4sst","\u0110\u01B0\u1EE3c ph\u00E9p \u0111i tr\u00EAn v\u1EA1ch gi\u1EEFa \u0111\u01B0\u1EDDng, khi xe ng\u01B0\u1EE3c chi\u1EC1u cho ph\u00E9p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-139
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(461);
	    	
	    	q.setName("1.4.41-139");

			q.setText(new TranslatedString("Sie wollen \u00FCberholen. Wie verhalten Sie sich?","B\u1EA1n mu\u1ED1n v\u01B0\u1EE3t. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-139.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen beide Linien \u00FCberfahren, wenn dadurch niemand gef\u00E4hrdet\nwird","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111i l\u00EAn c\u1EA3 hai v\u1EA1ch s\u01A1n, khi kh\u00F4ng g\u00E2y nguy hi\u1EC3m cho ai")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen keine der beiden Linien \u00FCberfahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c \u0111i l\u00EAn 2 v\u1EA1ch s\u01A1n n\u00E0y")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nur die unterbrochene Linie \u00FCberfahren","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c ph\u00E9p \u0111i l\u00EAn v\u1EA1ch s\u01A1n \u0111\u1EE9t \u0111o\u1EA1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-140
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(462);
	    	
	    	q.setName("1.4.41-140");

			q.setText(new TranslatedString("Wann m\u00FCssen Sie blinken?","Khi n\u00E0o b\u1EA1n ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhen?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-140.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Verlassen des Kreisverkehrs","Khi ra kh\u1ECFi b\u00F9ng binh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Einfahren in den Kreisverkehr","Khi \u0111i v\u00E0o b\u00F9ng binh")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-141
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(463);
	    	
	    	q.setName("1.4.41-141");

			q.setText(new TranslatedString("Sie n\u00E4hern sich folgender Verkehrszeichen-Kombination. Was ist \nhier zu beachten?","B\u1EA1n \u0111i g\u1EA7n bi\u1EC3n b\u00E1o k\u1EBFt h\u1EE3p n\u00E0y, b\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-141.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die im Kreis befindlichen Fahrzeuge haben Vorfahrt","Xe \u0111ang ch\u1EA1y trong b\u00F9ng binh c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Verlassen des Kreises muss durch Blinken angezeigt werden","Khi ra kh\u1ECFi b\u00F9ng binh ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Einfahren in den Kreis muss geblinkt werden","Khi v\u00E0o b\u00F9ng binh ph\u1EA3i  nh\u00E1y \u0111\u00E8n xi-nhan")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-142
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(464);
	    	
	    	q.setName("1.4.41-142");

			q.setText(new TranslatedString("Was ist bei diesen Verkehrszeichen zu beachten?","G\u1EB7p bi\u1EC3n n\u00E0y ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-142.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Halten auf der Kreisfahrbahn ist verboten","C\u1EA5m d\u1EEBng l\u1EA1i trong b\u00F9ng binh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Einfahren in den Kreis ist zu blinken","V\u00E0o b\u00F9ng binh ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es darf nur mit Schrittgeschwindigkeit gefahren werden","Ch\u1EC9 \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-143
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(465);
	    	
	    	q.setName("1.4.41-143");

			q.setText(new TranslatedString("Was ist bei diesen Verkehrszeichen zu beachten?","G\u1EB7p bi\u1EC3n n\u00E0y ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-143.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dem Verkehr auf der Kreisfahrbahn ist Vorfahrt zu gew\u00E4hren","Ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn cho xe b\u00EAn trong b\u00F9ng binh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Verlassen der Kreisfahrbahn ist zu blinken","Khi r\u1EDDi b\u00F9ng binh ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Einfahren in den Kreisverkehr ist zu blinken","Khi v\u00E0o b\u00F9ng binh ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.41-144
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(466);
	    	
	    	q.setName("1.4.41-144");

			q.setText(new TranslatedString("Wie haben Sie sich bei dieser Verkehrszeichen-Kombination zu \nverhalten?","B\u1EA1n \u0111i g\u1EA7n bi\u1EC3n b\u00E1o k\u1EBFt h\u1EE3p n\u00E0y, b\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.41-144.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Verlassen des Kreises muss durch Blinken nach rechts angezeigt\nwerden","Khi r\u1EDDi b\u00F9ng binh ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan b\u00EAn ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Einfahren in den Kreisverkehr ist Vorfahrt zu gew\u00E4hren","Xe \u0111i v\u00E0o b\u00F9ng binh ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Einfahren nach links ist vorgeschrieben","\u0110i v\u00E0o v\u1EC1 b\u00EAn tr\u00E1i l\u00E0 \u0111\u01B0\u1EE3c ph\u00E9p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(467);
	    	
	    	q.setName("1.4.42-001");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin? \nAuf Vorfahrt","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-001.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 nur an der n\u00E4chsten Kreuzung oder Einm\u00FCndung","Quy\u1EC1n \u01B0u ti\u00EAn ch\u1EC9 \u00E1p d\u1EE5ng cho giao l\u1ED9 ho\u1EB7c ng\u00E3 t\u01B0 k\u1EBF ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 an allen Kreuzungen und Einm\u00FCndungen dieser Stra\u00DFe","Quy\u1EC1n \u01B0u ti\u00EAn \u00E1p d\u1EE5ng tr\u00EAn t\u1EA5t c\u1EA3 c\u00E1c giao l\u1ED9 v\u00E0 ng\u00E3 t\u01B0 tr\u00EAn \u0111\u01B0\u1EDDng n\u00E0y")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 bis zum Ortsende","Quy\u1EC1n \u01B0u ti\u00EAn \u00E1p d\u1EE5ng \u0111\u1EBFn cu\u1ED1i \u0111o\u1EA1n \u0111\u01B0\u1EDDng (Ortsende - \u0111\u1EBFn khi g\u1EB7p giao l\u1ED9 hay ng\u00E3 t\u01B0 kh\u00E1c l\u00E0 h\u1EBFt)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(468);
	    	
	    	q.setName("1.4.42-002");

			q.setText(new TranslatedString("Was ist bei diesen Verkehrszeichen zu beachten?","Khi g\u1EB7p bi\u1EC3n n\u00E0y b\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-002.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie bleiben auf der Vorfahrtstra\u00DFe, wenn Sie nach links abbiegen","B\u1EA1n s\u1EBD thu\u1ED9c \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn, khi b\u1EA1n qu\u1EB9o tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen nicht rechts abbiegen oder geradeaus fahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o ph\u1EA3i hay \u0111i th\u1EB3ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie m\u00FCssen die Vorfahrt der von rechts kommenden Fahrzeuge\nbeachten, wenn Sie geradeaus weiterfahren","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD quy\u1EC1n \u01B0u ti\u00EAn c\u1EE7a xe \u0111\u1EBFn t\u1EEB b\u00EAn ph\u1EA3i, khi b\u1EA1n \u0111i th\u1EB3ng ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(469);
	    	
	    	q.setName("1.4.42-003");

			q.setText(new TranslatedString("Welches Verkehrszeichen gibt Vorfahrt?","Bi\u1EC3n b\u00E1o n\u00E0o cho quy\u1EC1n \u01B0u ti\u00EAn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-003.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verkehrszeichen 2","Bi\u1EC3n s\u1ED1 2")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrszeichen 1","Bi\u1EC3n s\u1ED1 1")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrszeichen 3","Bi\u1EC3n s\u1ED1 3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(470);
	    	
	    	q.setName("1.4.42-004");

			q.setText(new TranslatedString("Was gilt nach diesem Verkehrszeichen?","Sau bi\u1EC3n b\u00E1o s\u1EBD ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-004.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("H\u00F6chstens mit Schrittgeschwindigkeit fahren","Ch\u1EA1y v\u1EDBi v\u1EADn t\u1ED1c cao nh\u1EA5t b\u1EB1ng v\u1EADn t\u1ED1c \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf spielende Kinder achten","Ch\u00FA \u00FD c\u00F3 tr\u1EBB con \u0111ang ch\u01A1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Parken ist w\u00E4hrend des Einkaufens \u00FCberall erlaubt","\u0110\u1EF1\u01A1c ph\u00E9p \u0111\u1EADu xe khi mua s\u1EAFm")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(471);
	    	
	    	q.setName("1.4.42-005");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-005.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf den Anfang einer Autobahn","B\u1EAFt \u0111\u1EA7u \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf das Ende der Autobahn","K\u1EBFt th\u00FAc \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf den Anfang einer Kraftfahrstra\u00DFe","B\u1EAFt \u0111\u1EA7u \u0111\u01B0\u1EDDng cho xe c\u00F3 \u0111\u1ED9ng c\u01A1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(472);
	    	
	    	q.setName("1.4.42-006");

			q.setText(new TranslatedString("Welchen Hinweis gibt dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y cho bi\u1EBFt th\u00F4ng tin g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-006.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Einbahnstra\u00DFe","\u0110\u01B0\u1EDDng 1 chi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Abbiegen verboten","C\u1EA5m qu\u1EB9o")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vorrang vor dem Gegenverkehr","Quy\u1EC1n \u01B0u ti\u00EAn cho xe ng\u01B0\u1EE3c chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(473);
	    	
	    	q.setName("1.4.42-007");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich hier einstellen?","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB g\u00EC \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-007.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass der flie\u00DFende Verkehr angehalten wird, um Kinder \u00FCber die\nStra\u00DFe zu lassen","Xe \u0111ang l\u01B0u th\u00F4ng ph\u1EA3i d\u1EEBng l\u1EA1i \u0111\u1EC3 tr\u1EBB con qua \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass hier Kinder h\u00E4ufiger als sonst \u00FCber die Fahrbahn laufen","\u1EDE \u0111\u00E2y th\u01B0\u1EDDng c\u00F3 tr\u1EBB con b\u0103ng qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dass hier Kinder unter Anleitung auf der Fahrbahn spielen","Tr\u1EBB em ch\u01A1i tr\u00EAn \u0111\u01B0\u1EDDng v\u00E0 c\u00F3 ng\u01B0\u1EDDi h\u01B0\u1EDBng d\u1EABn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(474);
	    	
	    	q.setName("1.4.42-008");

			q.setText(new TranslatedString("Welches Verhalten ist auf Stra\u00DFen mit solchen Schutzstreifen f\u00FCr \nRadfahrer richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 v\u1EA1ch ph\u00E2n c\u00E1ch b\u1EA3o v\u1EC7 ng\u01B0\u1EDDi \u0111i xe \u0111\u1EA1p?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-008.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie d\u00FCrfen die Markierung bei Bedarf \u00FCberfahren, wenn eine\nGef\u00E4hrdung von Radfahrern ausgeschlossen ist","N\u1EBFu c\u1EA7n thi\u1EBFt b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111i l\u00EAn v\u1EA1ch ph\u00E2n c\u00E1ch, khi \u0111\u1EA3m b\u1EA3o kh\u00F4ng c\u00F3 nguy hi\u1EC3m cho xe \u0111\u1EA1p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen den Schutzstreifen in keinem Fall befahren","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c \u0111i l\u00EAn v\u1EA1ch ph\u00E2n c\u00E1ch trong m\u1ECDi t\u00ECnh hu\u1ED1ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen den Schutzstreifen zum Parken mitbenutzen","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu xe trong v\u1EA1ch ph\u00E2n c\u00E1ch")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(475);
	    	
	    	q.setName("1.4.42-101");

			q.setText(new TranslatedString("Welches Verkehrszeichen gibt an der n\u00E4chsten Kreuzung Vorfahrt?","Bi\u1EC3n n\u00E0o d\u01B0\u1EDBi \u0111\u00E2y cho quy\u1EC1n \u01B0u ti\u00EAn \u1EDF giao l\u1ED9 k\u1EBF ti\u1EBFp?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-101.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verkehrszeichen 1","Bi\u1EC3n s\u1ED1 1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrszeichen 2","Bi\u1EC3n s\u1ED1 2")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrszeichen 3","Bi\u1EC3n s\u1ED1 3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(476);
	    	
	    	q.setName("1.4.42-102");

			q.setText(new TranslatedString("Welches Verkehrszeichen gibt Vorfahrt?","Bi\u1EC3n n\u00E0o cho quy\u1EC1n \u01B0u ti\u00EAn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-102.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verkehrszeichen 2","Bi\u1EC3n s\u1ED1 2")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrszeichen 1","Bi\u1EC3n s\u1ED1 1")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrszeichen 3","Bi\u1EC3n s\u1ED1 3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(477);
	    	
	    	q.setName("1.4.42-103");

			q.setText(new TranslatedString("Was sagt Ihnen dieses Zeichen?","Bi\u1EC3n n\u00E0y b\u00E1o cho b\u1EA1n \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-103.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorfahrtstra\u00DFe","\u0110\u01B0\u1EDDng \u01B0u ti\u00EAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Parkverbot au\u00DFerhalb geschlossener Ortschaften","C\u1EA5m \u0111\u1EADu xe ngo\u00E0i khu v\u1EF1c \u0111\u00F4 th\u1ECB")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kraftfahrstra\u00DFe","\u0110\u01B0\u1EDDng d\u00E0nh cho xe c\u00F3 \u0111\u1ED9ng c\u01A1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(478);
	    	
	    	q.setName("1.4.42-104");

			q.setText(new TranslatedString("Was ist au\u00DFerorts auf Vorfahrtstra\u00DFen erlaubt?","\u0110i\u1EC1u g\u00EC \u0111\u01B0\u1EE3c ph\u00E9p \u1EDF ngo\u00E0i khu v\u1EF1c \u0111\u00F4 tr\u1ECB tr\u00EAn \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-104.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Halten am rechten Fahrbahnrand","D\u1EEBng b\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng b\u00EAn ph\u1EA3i \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Parken auf dem Seitenstreifen","\u0110\u1EADu xe tr\u00EAn Seitenstreifen")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Parken auf der Fahrbahn","\u0110\u1EA1u xe tr\u00EAn Fahrbahn (l\u00E0n \u0111\u01B0\u1EDDng xe ch\u1EA1y)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(479);
	    	
	    	q.setName("1.4.42-105");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei diesen Verkehrszeichen beachten?","G\u1EB7p bi\u1EC3n n\u00E0y b\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-105.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie der Vorfahrtstra\u00DFe folgen, m\u00FCssen Sie links blinken","Khi b\u1EA1n \u0111i theo \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn, b\u1EA1n ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan tr\u00E1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie der Vorfahrtstra\u00DFe folgen, m\u00FCssen Sie auf Fu\u00DFg\u00E4nger\nR\u00FCcksicht nehmen, wenn n\u00F6tig warten","Khi b\u1EA1n \u0111i theo \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn, b\u1EA1n ph\u1EA3i nh\u00ECn ng\u01B0\u1EDDi \u0111i b\u1ED9 \u1EDF ph\u00EDa sau, n\u1EBFu c\u1EA7n thi\u1EBFt th\u00EC ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Fahrtrichtung nach links ist vorgeschrieben","\u0110i theo h\u01B0\u1EDBng b\u00EAn tr\u00E1i l\u00E0 \u0111i\u1EC1u ph\u1EA3i l\u00E0m theo lu\u1EADt giao th\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(480);
	    	
	    	q.setName("1.4.42-106");

			q.setText(new TranslatedString("Was endet hier?","\u1EDE \u0111\u00E2y k\u1EBFt th\u00FAc c\u00E1i g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-106.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine Vorfahrtstra\u00DFe","H\u1EBFt \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ein Zonenhaltverbot","H\u1EBFt khu v\u1EF1c c\u1EA5m \u0111\u1EADu")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vorausgegangene Streckenverbote","H\u1EBFt c\u1EA5m v\u01B0\u1EE3t ho\u1EB7c h\u1EA1n ch\u1EBF t\u1ED1c \u0111\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(481);
	    	
	    	q.setName("1.4.42-107");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei diesem Verkehrszeichen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-107.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ihren Vorrang d\u00FCrfen Sie nur dann nutzen, wenn die Engstelle frei ist","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c s\u1EED d\u1EE5ng quy\u1EC1n \u01B0u ti\u00EAn khi \u0111o\u1EA1n \u0111\u01B0\u1EDDng h\u1EB9p \u0111\u00E3 tr\u1ED1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Trotz Vorrang m\u00FCssen Sie sich auf ein Anhalten einstellen","D\u00F9 c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn, b\u1EA1n c\u0169ng ph\u1EA3i trong t\u01B0 th\u1EBF chu\u1EA9n b\u1ECB d\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie m\u00FCssen dem Gegenverkehr Vorrang gew\u00E4hren","B\u1EA1n ph\u1EA3i nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn cho xe ng\u01B0\u1EE3c chi\u1EC1uSie m\u00FCssen dem Gegenverkehr Vorrang gew\u00E4hren")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(482);
	    	
	    	q.setName("1.4.42-108");

			q.setText(new TranslatedString("Was bedeutet dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-108.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ende einer geschlossenen Ortschaft","H\u1EBFt khu v\u1EF1c \u0111\u00F4 th\u1ECB (geschlossenen Ortschaft)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Anfang einer geschlossenen Ortschaft","B\u1EAFt \u0111\u1EA7u khu v\u1EF1c \u0111\u00F4 th\u1ECB")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beginn einer Umleitung","B\u1EAFt \u0111\u1EA7u \u0111\u01B0\u1EDDng d\u1EF1 ph\u00F2ng (\u0111\u01B0\u1EDDng thay th\u1EBF)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(483);
	    	
	    	q.setName("1.4.42-109");

			q.setText(new TranslatedString("Was ist bei diesen Verkehrszeichen erlaubt?","Bi\u1EC3n n\u00E0y cho ph\u00E9p g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-109.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bewohner mit entsprechend nummeriertem Parkausweis d\u00FCrfen hier\nparken","Ng\u01B0\u1EDDi s\u1ED1ng \u1EDF khu v\u1EF1c n\u00E0y c\u00F3 gi\u1EA5y ph\u00E9p \u0111\u1EADu xe v\u1EDBi s\u1ED1 \u0111\u0103ng k\u00FD nh\u01B0 tr\u00EAn bi\u1EC3n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu \u1EDF \u0111\u00E2y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Alle Bewohner d\u00FCrfen jeden dieser Parkpl\u00E4tze benutzen","T\u1EA5t c\u1EA3 ng\u01B0\u1EDDi d\u00E2n \u1EDF khu v\u1EF1c n\u00E0y \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng 1 ch\u1ED7 \u0111\u1EADu")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Solange noch andere Parkpl\u00E4tze frei sind, darf jeder diesen Parkplatz\nbenutzen","Mi\u1EC5n l\u00E0 c\u00F3 ch\u1ED7 tr\u1ED1ng, ai c\u0169ng \u0111\u01B0\u1EE3c \u0111\u1EADu")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(484);
	    	
	    	q.setName("1.4.42-110");

			q.setText(new TranslatedString("D\u00FCrfen Sie hier parken?","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu \u1EDF \u0111\u00E2y kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-110.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, als Schwerbehinderter mit amtlichem Parkausweis","C\u00F3, n\u1EBFu l\u00E0 ng\u01B0\u1EDDi t\u00E0n t\u1EADt c\u00F3 gi\u1EA5y ph\u00E9p \u0111\u1EADu xe h\u1EE3p l\u1EC7")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, als Begleitperson von Blinden mit amtlichem Parkausweis","C\u00F3, n\u1EBFu l\u00E0 ng\u01B0\u1EDDi d\u1EABn \u0111\u01B0\u1EDDng cho ng\u01B0\u1EDDi m\u00F9a v\u00E0 c\u00F3 gi\u1EA5y ph\u00E9p \u0111\u1EADu xe h\u1EE3p l\u1EC7")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, f\u00FCr kurzfristige Eink\u00E4ufe","C\u00F3, cho nh\u1EEFng ai \u0111i mua s\u1EAFm trong th\u1EDDi gian ng\u1EAFn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(485);
	    	
	    	q.setName("1.4.42-111");

			q.setText(new TranslatedString("Was ist hier beim Parken zu beachten?","\u0110\u1EADu xe \u1EDF \u0111\u00E2y ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-111.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die auf dem Parkschein angegebene Parkzeit darf nicht \u00FCberschritten\nwerden","Ng\u01B0\u1EDDi c\u00F3 v\u00E9 \u0111\u1EADu xe c\u0169ng kh\u00F4ng \u0111\u01B0\u1EE3c \u0111\u1EADu qu\u00E1 th\u1EDDi gian cho ph\u00E9p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Parkschein muss f\u00FCr Kontrollen gut lesbar ausgelegt sein","V\u00E9 \u0111\u1EADu xe ph\u1EA3i \u0111\u1EC3 \u1EDF ch\u1ED7 d\u1EC5 \u0111\u1ECDc \u0111\u1ED1i v\u1EDBi ng\u01B0\u1EDDi qu\u1EA3n l\u00FD \u0111\u1EADu xe (Kontroller)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Parkschein und Parkscheibe sind gleichgestellt","V\u00E9 \u0111\u1EADu xe v\u00E0 th\u1EBB \u0111\u1EADu xe c\u00F3 gi\u00E1 tr\u1ECB nh\u01B0 nhau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(486);
	    	
	    	q.setName("1.4.42-112");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen hier parken?","Xe n\u00E0o \u0111\u01B0\u1EE3c \u0111\u1EADu \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-112.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrzeuge bis 2,8 t zul\u00E4ssiger Gesamtmasse","Xe c\u00F3 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng l\u00EAn t\u1EDBi 2,8 t\u1EA5n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Motorr\u00E4der","Xe m\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrzeuge \u00FCber 3,5 t zul\u00E4ssiger Gesamtmasse","Xe c\u00F3 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng tr\u00EAn 3,5 t\u1EA5n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(487);
	    	
	    	q.setName("1.4.42-115");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-115.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf das Ende eines verkehrsberuhigten Bereichs","H\u1EBFt khu v\u1EF1c h\u1EA1n ch\u1EBF xe c\u1ED9 (verkehrsberuhigten Bereichs)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf ein Verbot f\u00FCr Fu\u00DFg\u00E4nger und Kraftwagen","C\u1EA5m ng\u01B0\u1EDDi \u0111i b\u1ED9 v\u00E0 xe c\u00F3 \u0111\u1ED9ng c\u01A1")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-116
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(488);
	    	
	    	q.setName("1.4.42-116");

			q.setText(new TranslatedString("Wie hoch muss die durch die Bauart bestimmte \nH\u00F6chstgeschwindigkeit eines Kraftfahrzeugs mindestens sein, \nwenn man diese Stra\u00DFe benutzen will?","Khi s\u1EED d\u1EE5ng \u0111\u01B0\u1EDDng n\u00E0y, v\u1EADn t\u1ED1c cao nh\u1EA5t c\u1EE7a xe c\u00F3 \u0111\u1ED9ng c\u01A1 ph\u1EA3i t\u1ED1i thi\u1EC3u l\u00E0 bao nhi\u00EAu ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-116.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("61 km/h","61 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("51 km/h","51 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("81 km/h","81 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-117
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(489);
	    	
	    	q.setName("1.4.42-117");

			q.setText(new TranslatedString("In welchen F\u00E4llen d\u00FCrfen Sie die Leitlinie \u00FCberfahren?","Trong tr\u01B0\u1EDDng h\u1EE3p n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p v\u01B0\u1EE3t qua v\u1EA1ch \u0111\u1EE9t \u0111o\u1EA1n \u1EDF gi\u1EEFa \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-117.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Um an einem Hindernis vorbeizufahren","Khi v\u01B0\u1EE3t qua ch\u01B0\u1EDBng ng\u1EA1i v\u1EADt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zum \u00DCberholen","Khi v\u01B0\u1EE3t xe kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In keinem Fall","Kh\u00F4ng c\u00F3 tr\u01B0\u1EDDng h\u1EE3p n\u00E0o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(490);
	    	
	    	q.setName("1.4.42-118");

			q.setText(new TranslatedString("Fu\u00DFg\u00E4nger wollen die Stra\u00DFe \u00FCberqueren. Wie muss man sich \nverhalten?","Ng\u01B0\u1EDDi \u0111i b\u1ED9 mu\u1ED1n b\u0103ng qua \u0111\u01B0\u1EDDng. Ng\u01B0\u1EDDi \u0111i xe ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-118.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit m\u00E4\u00DFiger Geschwindigkeit an den Fu\u00DFg\u00E4nger\u00FCberweg\nheranfahren, wenn n\u00F6tig warten","L\u00E1i xe qua v\u1EA1ch sang \u0111\u01B0\u1EDDng v\u1EDBi t\u1ED1c \u0111\u1ED9 v\u1EEBa ph\u1EA3i, khi c\u1EA7n thi\u1EBFt th\u00EC ph\u1EA3i d\u1EEBng l\u1EA1i ch\u1EDD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Am Fu\u00DFg\u00E4nger\u00FCberweg nicht \u00FCberholen","Kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p v\u01B0\u1EE3t qua v\u1EA1ch qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Man darf \u00FCberholen, solange noch kein Fu\u00DFg\u00E4nger auf der Fahrbahn\nist","\u0110\u01B0\u1EE3c ph\u00E9p v\u01B0\u1EE3t, ch\u1EC9 khi kh\u00F4ng c\u00F3 ng\u01B0\u1EDDi \u0111i b\u1ED9 tr\u00EAn l\u00E0n xe ch\u1EA1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-119
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(491);
	    	
	    	q.setName("1.4.42-119");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-119.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine Sackgasse","Ng\u00F5 c\u1EE5t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Unterf\u00FChrung","\u0110\u01B0\u1EDDng b\u00EAn d\u01B0\u1EDBi c\u1EA7u v\u01B0\u1EE3t, hay \u0111\u01B0\u1EDDng h\u1EA7m b\u0103ng qua \u0111\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine f\u00FCr den Fahrzeugverkehr gesperrte Stra\u00DFe","\u0110\u01B0\u1EDDng ch\u1EB7n xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-120
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(492);
	    	
	    	q.setName("1.4.42-120");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-120.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine Erste-Hilfe-Station","Tr\u1EA1m c\u1EA5p c\u1EE9u (Erste-Hilfe-Station)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Kreuzung","Ng\u00E3 t\u01B0")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Gefahrstelle","\u0110i\u1EC3m nguy hi\u1EC3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-122
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(493);
	    	
	    	q.setName("1.4.42-122");

			q.setText(new TranslatedString("Welche Bedeutung hat dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-122.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Seitenstreifen ist nicht gen\u00FCgend befestigt","L\u1EC1 \u0111\u01B0\u1EDDng kh\u00F4ng \u0111\u1EE7 c\u1EE9ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es zeigt an, wie geparkt werden muss","Bi\u1EC3n ch\u1EC9 c\u00E1ch ph\u1EA3i \u0111\u1EADu xe th\u1EBF n\u00E0o")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es empfiehlt das Parken auf dem Seitenstreifen","Bi\u1EC3n \u0111\u1EC3 ngh\u1ECB ph\u1EA3i \u0111\u1EADu xe \u1EDF tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-123
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(494);
	    	
	    	q.setName("1.4.42-123");

			q.setText(new TranslatedString("Welche Bedeutung hat dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-123.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Seitenstreifen ist f\u00FCr Fahrzeuge \u00FCber 3,5 t zul\u00E4ssiger\nGesamtmasse nicht gen\u00FCgend befestigt","\u0110\u1ED1i v\u1EDBi xe c\u00F3 tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p t\u1EEB 3,5 t\u1EA5n tr\u1EDF l\u00EAn, l\u1EC1 \u0111\u01B0\u1EDDng kh\u00F4ng \u0111\u1EE7 c\u1EE9ng (s\u1EBD b\u1ECB l\u00FAn khi \u0111\u1EADu)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es warnt davor, den Seitenstreifen mit Zugmaschinen zu benutzen","Bi\u1EC3n c\u1EA3nh b\u00E1o r\u1EB1ng l\u1EC1 \u0111\u01B0\u1EDDng \u0111\u01B0\u1EE3c s\u1EED d\u1EE5ng cho xe Zugmaschinen (lo\u1EA1i xe t\u1EA3i d\u00E0i to c\u00F3 trang b\u1ECB m\u00E1y m\u00F3c nhi\u1EC1u)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es zeigt an, wie hier Lkw geparkt werden m\u00FCssen","Bi\u1EC3n cho bi\u1EBFt, xe Lkw ph\u1EA3i \u0111\u1EADu \u1EDF \u0111\u00E2y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-124
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(495);
	    	
	    	q.setName("1.4.42-124");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-124.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine Zollstelle","Tr\u1EA1m h\u1ED7 tr\u1EE3 kh\u00E1ch h\u00E0ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine geb\u00FChrenpflichtige Stra\u00DFe","\u0110\u01B0\u1EDDng thu ph\u00ED")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-125
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(496);
	    	
	    	q.setName("1.4.42-125");

			q.setText(new TranslatedString("Was ist bei diesem Verkehrszeichen zu beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi g\u1EB7p bi\u1EC3n n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-125.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Stra\u00DFenbeleuchtung brennt nicht die ganze Nacht","\u0110\u00E8n \u0111\u01B0\u1EDDng kh\u00F4ng \u0111\u01B0\u1EE3c chi\u1EBFu s\u00E1ng su\u1ED1t \u0111\u00EAm")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrzeuge d\u00FCrfen hier ohne Beleuchtung die ganze Nacht geparkt\nwerden","Xe \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu \u1EDF \u0111\u00E2y su\u1ED1t \u0111\u00EAm m\u00E0 kh\u00F4ng b\u1EADt \u0111\u00E8n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrzeuge d\u00FCrfen hier nicht geparkt werden","Xe kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu \u1EDF \u0111\u00E2y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-126
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(497);
	    	
	    	q.setName("1.4.42-126");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-126.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine Bundesstra\u00DFe","\u0110\u01B0\u1EDDng li\u00EAn bang")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es darf nicht schneller als 35 km/h gefahren werden","Kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y nhanh h\u01A1n 35 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es muss mindestens 35 km/h gefahren werden","Ph\u1EA3i ch\u1EA1y t\u1ED1i thi\u1EC3u 35 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-128
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(498);
	    	
	    	q.setName("1.4.42-128");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-128.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine in der Regel weniger befahrene Autobahnstrecke","\u0110o\u1EA1n \u0111\u01B0\u1EDDng cao t\u1ED1c th\u01B0\u1EDDng c\u00F3 \u00EDt xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine Stelle, an der man die Autobahn verlassen muss","Khu v\u1EF1c ph\u1EA3i r\u1EDDi kh\u1ECFi \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf eine vorgeschriebene Umleitung f\u00FCr Fahrzeuge mit gef\u00E4hrlichen\nG\u00FCtern","\u0110\u01B0\u1EDDng thay th\u1EBF cho xe c\u00F3 \u0111\u1ED9ng c\u01A1 ch\u1EDF h\u00E0ng h\u00F3a nguy hi\u1EC3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-129
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(499);
	    	
	    	q.setName("1.4.42-129");

			q.setText(new TranslatedString("Sie fahren mit Tagfahrlicht in einen so gekennzeichneten \nbeleuchteten Tunnel. Wie verhalten Sie sich?","B\u1EA1n l\u00E1i xe v\u1EDBi \u0111\u00E8n chi\u1EBFu ban ng\u00E0y trong m\u1ED9t \u0111\u01B0\u1EDDng h\u1EA7m \u0111\u01B0\u1EE3c chi\u1EBFu s\u00E1ng c\u00F3 b\u1EA3ng hi\u1EC7u d\u01B0\u1EDBi \u0111\u00E2y. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-129.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich schalte das Abblendlicht ein","T\u00F4i b\u1EADt \u0111\u00E8n pha (Abblendlicht)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich brauche kein Licht einzuschalten","T\u00F4i kh\u00F4ng c\u1EA7n b\u1EADt \u0111\u00E8n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich schalte das Standlicht ein","T\u00F4i b\u1EADt \u0111\u00E8n b\u00EAn h\u00F4ng (Standlicht)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.4.42-130
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(500);
	    	
	    	q.setName("1.4.42-130");

			q.setText(new TranslatedString("Worauf weist dieses Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.4.42-130.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In der n\u00E4chsten Pannenbucht kann ein Fahrzeug stehen","\u1EDE Pannenbucht k\u1EBF ti\u1EBFp, c\u00F3 th\u1EC3 d\u1EEBng xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Im Falle einer Panne soll in der angek\u00FCndigten Pannenbucht gehalten\nwerden","Trong tr\u01B0\u1EDDng h\u1EE3p xe c\u00F3 s\u1EF1 c\u1ED1, \u0111\u01B0\u1EE3c ph\u00E9p d\u1EEBng l\u1EA1i Pannenbucht nh\u01B0 \u0111\u00E3 th\u00F4ng b\u00E1o tr\u00EAn bi\u1EC3n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Um eine Pause zu machen, darf hier gehalten werden","D\u1EEBng l\u1EA1i ngh\u1EC9, \u0111\u01B0\u1EE3c ph\u00E9p d\u1EEBng xe \u1EDF \u0111\u00E2y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
