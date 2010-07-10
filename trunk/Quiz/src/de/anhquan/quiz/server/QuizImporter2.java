package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter2 {

	static {
		
				
		//Question 1.2.09-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(201);
	    	
	    	q.setName("1.2.09-109");

			q.setText(new TranslatedString("Sie befinden sich im Kreisverkehr. Was ist zu beachten?","B\u1EA1n \u1EDF trong b\u00F9n binh. Nh\u1EEFng \u0111i\u1EC1u g\u00EC ph\u1EA3i ch\u00FA \u00FD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine Mittelinsel darf nur \u00FCberfahren werden, wenn dies aufgrund der\nFahrzeuggr\u00F6\u00DFe unvermeidbar ist","V\u00F2ng tr\u00F2n ch\u00EDnh gi\u1EEFa b\u00F9ng binh \u0111\u01B0\u1EE3c ph\u00E9p \u0111i l\u00EAn ch\u1EC9 khi c\u00F3 xe qu\u00E1 to kh\u00F4ng tr\u00E1nh \u0111\u01B0\u1EE3c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Im Kreisverkehr ist das Halten auf der Fahrbahn verboten","Trong b\u00F9ng binh, c\u1EA5m kh\u00F4ng \u0111\u01B0\u1EE3c d\u1EEBng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Verlassen des Kreises muss durch Blinken angezeigt werden","Khi r\u1EDDi kh\u1ECFi b\u00F9ng binh, ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.10-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(202);
	    	
	    	q.setName("1.2.10-001");

			q.setText(new TranslatedString("Sie wollen aus einem Grundst\u00FCck nach rechts in eine Stra\u00DFe \neinbiegen. Von links kommt ein Radfahrer. Wer muss warten?","B\u1EA1n mu\u1ED1n qu\u1EB9o ph\u1EA3i t\u1EEB m\u1ED9t m\u1EA3nh \u0111\u1EA5t b\u00EAn \u0111\u01B0\u1EDDng v\u00E0o trong \u0111\u01B0\u1EDDng \u0111i. C\u00F3 xe \u0111\u1EA1p \u0111i t\u1EEB b\u00EAn tr\u00E1i t\u1EDBi. Ai ph\u1EA3i ch\u1EDD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen warten","B\u1EA1n ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Radfahrer muss warten","Xe \u0111\u1EA1p ph\u1EA3i ch\u1EDD")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beide m\u00FCssen anhalten und sich dann verst\u00E4ndigen","C\u1EA3 hai ph\u1EA3i d\u1EEBng v\u00E0 ph\u1ED1i h\u1EE3p nhau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.10-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(203);
	    	
	    	q.setName("1.2.10-002");

			q.setText(new TranslatedString("Sie wollen aus einem Grundst\u00FCck \u00FCber den Gehweg auf die \nFahrbahn einbiegen. Worauf m\u00FCssen Sie achten?","B\u1EA1n \u0111ang \u1EDF tr\u00EAn m\u1ED9t m\u1EA3nh \u0111\u1EA5t mu\u1ED1n qu\u1EB9o v\u00E0o l\u00F2ng \u0111\u01B0\u1EDDng qua ph\u1EA7n \u0111\u01B0\u1EDDng c\u1EE7a ng\u01B0\u1EDDi \u0111i b\u1ED9. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verkehrsteilnehmer auf dem Gehweg d\u00FCrfen nicht gef\u00E4hrdet werden","Kh\u00F4ng \u0111\u1EF1\u01A1c g\u00E2y nguy hi\u1EC3m cho ng\u01B0\u1EDDi tham gia giao th\u00F4ng tr\u00EAn ph\u1EA7n \u0111\u01B0\u1EDDng c\u1EE7a ng\u01B0\u1EDDi \u0111i b\u1ED9 (v\u00ED d\u1EE5 xe \u0111\u1EA1p, ng\u01B0\u1EDDi \u0111i b\u1ED9)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gegebenenfalls ist ein Einweisen erforderlich","N\u1EBFu c\u1EA7n thi\u1EBFt ph\u1EA3i c\u00F3 ng\u01B0\u1EDDi ch\u1EC9 d\u1EABn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Immer zuerst auf den flie\u00DFenden Verkehr auf der Fahrbahn","Lu\u00F4n ch\u00FA \u00FD \u0111\u1EBFn c\u00E1c xe tr\u00EAn \u0111\u01B0\u1EDDng tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.10-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(204);
	    	
	    	q.setName("1.2.10-003");

			q.setText(new TranslatedString("Sie wollen aus einem verkehrsberuhigten Bereich in eine Stra\u00DFe \neinfahren. Wie m\u00FCssen Sie sich verhalten?","B\u1EA1n mu\u1ED1n \u0111i ra t\u1EEB khu v\u1EF1c h\u1EA1n ch\u1EBF xe c\u1ED9 v\u00E0o m\u1ED9t con \u0111\u01B0\u1EDDng b\u00ECnh th\u01B0\u1EDDng. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger auf dem Gehweg vorbeigehen lassen","\u0110\u1EC3 ng\u01B0\u1EDDi \u0111i b\u1ED9 tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng \u0111i qua tr\u01B0\u1EDBc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrzeugen Vorrang gew\u00E4hren","Nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Regel \u201Erechts vor links\u201C beachten","Ch\u00FA \u00FD lu\u1EADt \u201Erechts vor links\u201C")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.10-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(205);
	    	
	    	q.setName("1.2.10-004");

			q.setText(new TranslatedString("Sie wollen aus einem verkehrsberuhigten Bereich in eine Stra\u00DFe \neinfahren. Von links kommt ein Radfahrer. Wer muss warten?","B\u1EA1n mu\u1ED1n \u0111i ra t\u1EEB khu v\u1EF1c h\u1EA1n ch\u1EBF xe c\u1ED9 v\u00E0o m\u1ED9t con \u0111\u01B0\u1EDDng b\u00ECnh th\u01B0\u1EDDng. T\u1EEB b\u00EAn tr\u00E1i c\u00F3 m\u1ED9t xe \u0111\u1EA1p ch\u1EA1y t\u1EDBi. Ai ph\u1EA3i ch\u1EDD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen warten","B\u1EA1n ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Radfahrer muss warten","Xe \u0111\u1EA1p ph\u1EA3i ch\u1EDD")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beide m\u00FCssen anhalten und sich dann verst\u00E4ndigen","C\u1EA3 hai ph\u1EA3i d\u1EEBng l\u1EA1i v\u00E0 t\u1EF1 nh\u01B0\u1EDDng nhau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.10-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(206);
	    	
	    	q.setName("1.2.10-005");

			q.setText(new TranslatedString("Sie kommen aus einer Stra\u00DFe mit abgesenktem Bordstein und \nwollen in eine andere Stra\u00DFe einbiegen. Von links kommt ein Pkw. \nWas gilt hier?","B\u1EA1n \u0111i t\u1EEB m\u1ED9t \u0111\u01B0\u1EDDng c\u00F3 l\u1EC1 \u0111\u01B0\u1EDDng th\u1EA5p v\u00E0o m\u1ED9t con \u0111\u01B0\u1EDDng kh\u00E1c.\nT\u1EEB b\u00EAn tr\u00E1i c\u00F3 m\u1ED9t xe Pkw ch\u1EA1y t\u1EDBi. \u0110i\u1EC1u g\u00EC \u00E1p d\u1EE5ng \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wer \u00FCber einen abgesenkten Bordstein in eine Stra\u00DFe einf\u00E4hrt, ist\nwartepflichtig","Ai \u0111i qua l\u1EC1 \u0111\u01B0\u1EDDng th\u1EA5p th\u00EC ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Regel \u201Erechts vor links\u201C","Lu\u1EADt \u201Erechts vor links\u201C")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der abgesenkte Bordstein ist f\u00FCr die Wartepflicht ohne Bedeutung","L\u1EC1 \u0111\u01B0\u1EDDng th\u1EA5p kh\u00F4ng c\u00F3 \u00FD ngh\u0129a \u0111\u1ED1i v\u1EDBi tr\u00E1ch nhi\u1EC7m ph\u1EA3i ch\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.10-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(207);
	    	
	    	q.setName("1.2.10-101");

			q.setText(new TranslatedString("Wie verhalten Sie sich beim Anfahren vom Fahrbahnrand?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi \u0111i t\u1EEB l\u1EC1 \u0111\u01B0\u1EDDng v\u00E0o l\u00F2ng \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("R\u00FCckw\u00E4rtigen Verkehr beobachten","Ch\u00FA \u00FD xe ph\u00EDa sau")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Blinken","Nh\u00E1y \u0111\u00E8n xi-nhan")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Blick in den R\u00FCckspiegel gen\u00FCgt","Li\u1EBFc qua k\u00EDnh chi\u1EBFu h\u1EADu l\u00E0 \u0111\u1EE7")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.10-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(208);
	    	
	    	q.setName("1.2.10-102");

			q.setText(new TranslatedString("Sie wollen aus dem Grundst\u00FCck ausfahren. Wer muss warten?","B\u1EA1n mu\u1ED1n t\u1EEB ph\u1EA7n \u0111\u1EA5t b\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng \u0111i ra ngo\u00E0i. Ai ph\u1EA3i ch\u1EDD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.10-102.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen warten","B\u1EA1n ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Fu\u00DFg\u00E4nger m\u00FCssen warten","Ng\u01B0\u1EDDi \u0111i b\u1ED9 ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.11-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(209);
	    	
	    	q.setName("1.2.11-001");

			q.setText(new TranslatedString("In welchen F\u00E4llen d\u00FCrfen Sie in eine Kreuzung nicht einfahren, \nobwohl Sie Vorfahrt haben? \nWenn Sie","Trong t\u00ECnh hu\u1ED1ng n\u00E0o b\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p \u0111i v\u00E0o ng\u00E3 t\u01B0, m\u1EB7c d\u00F9 b\u1EA1n c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 auf der Kreuzung warten m\u00FCssten, weil der Verkehr stockt","Khi b\u1EA1n ph\u1EA3i ch\u1EDD \u1EDF ng\u00E3 t\u01B0, v\u00EC k\u1EB9t xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 ein Fahrzeug mit Blaulicht und Einsatzhorn behindern w\u00FCrden","B\u1EA1n c\u1EA3n tr\u1EDF xe v\u1EDBi \u0111\u00E8n xanh v\u00E0 Einsatzhorn !?!")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 als Linksabbieger lediglich wegen des Gegenverkehrs auf der\nKreuzung warten m\u00FCssten","Khi qu\u1EB9o tr\u00E1i b\u1EA1n ph\u1EA3i ch\u1EDD xe \u0111\u1ED1i di\u1EC7n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.11-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(210);
	    	
	    	q.setName("1.2.11-002");

			q.setText(new TranslatedString("In welchen F\u00E4llen d\u00FCrfen Sie in eine Kreuzung nicht einfahren, \nobwohl die Ampel \u201EGr\u00FCn\u201C zeigt?","Trong t\u00ECnh hu\u1ED1ng n\u00E0o b\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p \u0111i v\u00E0o b\u00F9ng binh, m\u1EB7c d\u00F9 \u0111\u00E8n giao th\u00F4ng b\u1EADt \u201EXanh\u201C?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie auf der Kreuzung warten m\u00FCssten, weil der Verkehr stockt","Khi b\u1EA1n ph\u1EA3i ch\u1EDD tr\u00EAn b\u00F9nh b\u00ECnh, v\u00EC k\u1EB9t xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn ein Polizeibeamter \u201EHalt\u201C gebietet","Khi nh\u00E2n vi\u00EAn c\u1EA3nh s\u00E1t b\u1EA3o \u201ED\u1EEBng\u201C")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn an der Kreuzung das Zeichen \u201EHalt! Vorfahrt gew\u00E4hren!\u201C steht","Khi \u1EDF b\u00F9ng binh c\u00F3 bi\u1EC3n \u201ED\u1EEBng l\u1EA1i! Nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn!\u201C steht")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.11-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(211);
	    	
	    	q.setName("1.2.11-003");

			q.setText(new TranslatedString("Bei stockendem Verkehr m\u00FCssen bestimmte Bereiche freigehalten \nwerden. Welche sind dies?","Khi k\u1EB9t xe, m\u1ED9t s\u1ED1 khu v\u1EF1c ph\u1EA3i \u0111\u1EC3 tr\u1ED1ng. \u0110\u00F3 l\u00E0 nh\u1EEFng ch\u1ED7 n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kreuzungen","Ng\u00E3 t\u01B0")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bahn\u00FCbergange","N\u01A1i c\u00F3 t\u00E0u ch\u1EA1y ngamg")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Grundst\u00FCckseinfahrten","N\u01A1i \u0111\u1EC3 cho xe t\u1EEB l\u1EC1 \u0111\u01B0\u1EDDng \u0111i v\u00E0o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.11-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(212);
	    	
	    	q.setName("1.2.11-004");

			q.setText(new TranslatedString("Bei stockendem Verkehr m\u00FCssen bestimmte Bereiche freigehalten \nwerden. Welche sind dies?","Khi k\u1EB9t xe, khu v\u1EF1c n\u00E0o ph\u1EA3i \u0111\u1EC3 tr\u1ED1ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Einm\u00FCndungen","Giao l\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger\u00FCberwege","V\u1EA1ch qua \u0111\u01B0\u1EDDng cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bushaltestellen mit \u201EZick-Zack-Linien\u201C","Tr\u1EA1m d\u1EEBng xe bus c\u00F3 \u201Ev\u1EA1ch z\u00EDch-z\u00E1ch\u201C")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.11-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(213);
	    	
	    	q.setName("1.2.11-005");

			q.setText(new TranslatedString("Wie verhalten Sie sich?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.11-005.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern und n\u00F6tigenfalls anhalten","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 v\u00E0 n\u1EBFu c\u00F3 th\u1EC3 ph\u1EA3i d\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren und auf den Gehweg ausweichen","\u0110i ti\u1EBFp v\u00E0 \u0111i l\u1ED1 l\u00EAn ph\u1EA7n l\u1EC1 \u0111\u01B0\u1EDDng cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beschleunigt weiterfahren, weil der Gegenverkehr warten muss","T\u0103ng t\u1ED1c \u0111i ti\u1EBFp, v\u00EC xe ng\u01B0\u1EE3c chi\u1EC1u ph\u1EA3i ch\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.11-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(214);
	    	
	    	q.setName("1.2.11-102");

			q.setText(new TranslatedString("Sie wollen geradeaus weiterfahren. Wie verhalten Sie sich?","B\u1EA1n mu\u1ED1n \u0111i th\u1EB3ng. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.11-102.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit verringern, Abstand halten und gegebenenfalls\nanhalten","Gi\u1EA3m t\u1ED1c \u0111\u1ED9, gi\u1EEF kho\u1EA3ng c\u00E1ch, v\u00E0 c\u00F3 th\u1EC3 ph\u1EA3i d\u1EEBng h\u1EB3n l\u1EA1i n\u1EBFu c\u1EA7n thi\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei einer ausreichenden Verkehrsl\u00FCcke nach rechts wechseln","\u0110i v\u1EC1 l\u00E0n b\u00EAn ph\u1EA3i n\u1EBFu c\u00F3 th\u1EC3 gi\u1EEF \u0111\u1EE7 kho\u1EA3ng c\u00E1ch v\u1EDBi c\u00E1c xe kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beschleunigen und sich zwischen den Fahrzeugen\nhindurchschl\u00E4ngeln","T\u0103ng t\u1ED1c v\u00E0 \u0111i len v\u00E0o gi\u1EEFa c\u00E1c xe kh\u00E1c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(215);
	    	
	    	q.setName("1.2.12-001");

			q.setText(new TranslatedString("Wo ist das Halten verboten?","\u1EDE \u0111\u00E2u c\u1EA5m kh\u00F4ng \u0111\u01B0\u1EE3c d\u1EEBng l\u1EA1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Bahn\u00FCberg\u00E4ngen","N\u01A1i c\u00F3 \u0111\u01B0\u1EDDng t\u00E0u b\u0103ng qua \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An engen und an un\u00FCbersichtlichen Stra\u00DFenstellen","N\u01A1i \u0111\u01B0\u1EDDng h\u1EB9p v\u00E0 c\u00F3 t\u1EA7m nh\u00ECn khu\u1EA5t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unmittelbar hinter Fu\u00DFg\u00E4nger\u00FCberwegen","Ngay ph\u00EDa sau v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(216);
	    	
	    	q.setName("1.2.12-002");

			q.setText(new TranslatedString("Wo ist das Parken verboten?","\u1EDE \u0111\u00E2u c\u1EA5m kh\u00F4ng \u0111\u01B0\u1EE3c \u0111\u1EADu xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Am Fahrbahnrand, wenn hierdurch die Benutzung gekennzeichneter\nParkfl\u00E4chen verhindert wird","\u1EDE l\u1EC1 \u0111\u01B0\u1EDDng, n\u01A1i c\u00F3 \u0111\u00E1nh d\u1EA5u l\u00E0 khu v\u1EF1c kh\u00F4ng d\u00F9ng \u0111\u1EC3 \u0111\u1EADu xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Vorfahrtstra\u00DFen au\u00DFerhalb geschlossener Ortschaften","Tr\u00EAn \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn ngo\u00E0i khu v\u1EF1c \u0111\u00F4 th\u1ECB")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf Vorfahrtstra\u00DFen innerhalb geschlossener Ortschaften","Tr\u00EAn \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn trong khu v\u1EF1c \u0111\u00F4 th\u1ECB")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(217);
	    	
	    	q.setName("1.2.12-101");

			q.setText(new TranslatedString("Was ist hier zu beachten?","\u1EDE \u0111\u00E2y ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.12-101.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Links von der Fahrbahnbegrenzung darf nicht gehalten werden","B\u00EAn tr\u00E1i v\u1EA1ch ph\u00E2n c\u00E1ch kh\u00F4ng \u0111\u01B0\u1EE3c d\u1EEBng l\u1EA1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langsame Fahrzeuge m\u00FCssen m\u00F6glichst auf dem Seitenstreifen\nfahren","Xe \u0111i ch\u1EADm ph\u1EA3i \u0111i v\u00E0o l\u1EC1 b\u00EAn ph\u1EA3i n\u1EBFu c\u00F3 th\u1EC3")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Fahrbahnbegrenzung darf in keinem Fall \u00FCberfahren werden","Trong m\u1ECDi t\u00ECnh hu\u1ED1ng kh\u00F4ng \u0111\u01B0\u1EE3c \u0111i l\u00EAn v\u1EA1ch ph\u00E2n c\u00E1ch")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(218);
	    	
	    	q.setName("1.2.12-103");

			q.setText(new TranslatedString("Wo ist das Halten verboten?","N\u01A1i n\u00E0o c\u1EA5m d\u1EEBng l\u1EA1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf der Fahrbahn, wenn rechts ein geeigneter Seitenstreifen\nvorhanden ist","Tr\u00EAn \u0111\u01B0\u1EDDng, c\u00F3 v\u1EA1ch li\u1EC1n \u1EDF r\u00ECa b\u00EAn ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf markierten Fahrstreifen mit Richtungspfeilen","Tr\u00EAn l\u00E0n \u0111\u01B0\u1EDDng c\u00F3 v\u1EBD m\u0169i t\u00EAn ch\u1EC9 h\u01B0\u1EDBng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Taxenst\u00E4nden","N\u01A1i taxi \u0111\u1EADu")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(219);
	    	
	    	q.setName("1.2.12-104");

			q.setText(new TranslatedString("Wo ist das Halten verboten?","N\u01A1i n\u00E0o c\u1EA5m d\u1EEBng l\u1EA1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Fu\u00DFg\u00E4nger\u00FCberwegen sowie bis zu 5 m davor","Tr\u01B0\u1EDBc v\u1EA1ch qua \u0111\u01B0\u1EDDng 5 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unmittelbar hinter Fu\u00DFg\u00E4nger\u00FCberwegen","Ngay sau v\u1EA1ch qua \u0111\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u00FCber Schachtdeckeln","Tr\u00EAn n\u1EAFp c\u1ED1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(220);
	    	
	    	q.setName("1.2.12-105");

			q.setText(new TranslatedString("Wo ist das Parken verboten?","N\u01A1i n\u00E0o c\u1EA5m \u0111\u1EADu xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Am Fahrbahnrand, wenn hierdurch die Benutzung gekennzeichneter\nParkfl\u00E4chen verhindert wird","Tr\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng, n\u1EBFu l\u00E0m c\u1EA3n tr\u1EDF ng\u01B0\u1EDDi kh\u00E1c \u0111\u1EADu xe \u1EDF nh\u1EEFng b\u00E3i \u0111\u1EADu \u0111\u01B0\u1EE3c \u0111\u00E1nh d\u1EA5u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor Bordsteinabsenkungen","Tr\u01B0\u1EDBc n\u01A1i c\u00F3 m\u00E9p l\u1EC1 \u0111\u01B0\u1EDDng \u0111\u01B0\u1EE3c h\u1EA1 th\u1EA5p xu\u1ED1ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unmittelbar hinter Fu\u00DFg\u00E4nger\u00FCberwegen","Ngay ph\u00EDa sau v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(221);
	    	
	    	q.setName("1.2.12-106");

			q.setText(new TranslatedString("Wo d\u00FCrfen Sie in Fahrtrichtung links parken?","N\u01A1i n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c \u0111\u1EADu xe \u1EDF b\u00EAn tr\u00E1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Einbahnstra\u00DFen","Tr\u00EAn \u0111\u01B0\u1EDDng m\u1ED9t chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wo Schienen auf der rechten Seite verlegt sind","N\u01A1i c\u00F3 \u0111\u01B0\u1EDDng ray n\u1EB1m b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wo rechts das Parken verboten ist","N\u01A1i c\u1EA5m \u0111\u1EADu b\u00EAn ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(222);
	    	
	    	q.setName("1.2.12-107");

			q.setText(new TranslatedString("Wer parkt?","Ai \u0111\u1EADu xe (hay c\u00F3 th\u1EC3 hi\u1EC3u l\u00E0: th\u1EBF n\u00E0o \u0111\u01B0\u1EE3c g\u1ECDi l\u00E0 \u0111\u1EADu xe) ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wer l\u00E4nger als drei Minuten h\u00E4lt","Ng\u01B0\u1EDDi d\u1EEBng l\u1EA1i l\u00E2u h\u01A1n 3 ph\u00FAt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wer sein Fahrzeug verl\u00E4sst","Ng\u01B0\u1EDDi r\u1EDDi kh\u1ECFi xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wer vor einer geschlossenen Bahnschranke l\u00E4nger als drei Minuten\nwartet","Ng\u01B0\u1EDDi d\u1EEBng l\u00E2u h\u01A1n 3 ph\u00FAt tr\u01B0\u1EDBc thanh ch\u1EAFn ch\u1ED7 c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(223);
	    	
	    	q.setName("1.2.12-108");

			q.setText(new TranslatedString("Welcher Mindestabstand muss vor einem Fu\u00DFg\u00E4nger\u00FCberweg beim \nHalten oder Parken eingehalten werden? \n_____ m","Kho\u1EA3ng c\u00E1ch t\u1ED1i thi\u1EC3u tr\u01B0\u1EDBc v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng khi d\u1EEBng l\u1EA1i hay khi \u0111\u1EADu xe l\u00E0 bao nhi\u00EAu?\n#Note:\n#Hint:\nC\u0169ng gi\u1ED1ng nh\u01B0 kho\u1EA3ng c\u00E1ch \u0111\u01B0\u1EE3c \u0111\u1EADu tr\u01B0\u1EDBc ng\u00E3 t\u01B0 (5m)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n5 m "), new TranslatedString("\n\n\n5 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(224);
	    	
	    	q.setName("1.2.12-109");

			q.setText(new TranslatedString("In welchem Bereich vor und hinter Kreuzungen und Einm\u00FCndungen \nist das Parken verboten? \n_____ m","Trong kho\u1EA3ng c\u00E1ch bao nhi\u00EAu m\u00E9t ph\u00EDa tr\u01B0\u1EDBc v\u00E0 sau giao l\u1ED9 ho\u1EB7c ng\u00E3 t\u01B0 th\u00EC b\u1ECB c\u1EA5m \u0111\u1EADu xe?\n______ m\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n5 m "), new TranslatedString("\n\n\n5 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(225);
	    	
	    	q.setName("1.2.12-110");

			q.setText(new TranslatedString("Wie weit muss man beim Parken au\u00DFerorts vom Andreaskreuz \nmindestens entfernt bleiben? \n_____ m","Ngo\u00E0i khu v\u1EF1c \u0111\u00F4 th\u1ECB, ph\u1EA3i \u0111\u1EADu xe c\u00E1ch bi\u1EC3n g\u1EA1ch ch\u00E9o (Andreaskreuz) t\u1ED1i thi\u1EC3u bao nhi\u00EAu m\u00E9t?\n#Note:\n<ul>\n<li><strong>Andreaskreuz</strong>: B\u1EA3ng k\u00FD hi\u1EC7u b\u1EB1ng 2 thanh g\u1EA1ch ch\u00E9o nhau theo ki\u1EC3u ch\u1EEF X. \u0110\u00E2y l\u00E0 k\u00FD hi\u1EC7u l\u1EA5y theo t\u00EAn th\u00E1nh Andrew, ng\u01B0\u1EDDi b\u1ECB tra t\u1EA5n tr\u00EAn 2 thanh g\u1ED7 \u0111\u00F3ng ch\u00E9o.\n<img src=\"http://upload.wikimedia.org/wikipedia/commons/6/65/Bahn%C3%BCbergang-de.jpg\"/></li>\n</ul>\n#Hint:\nc\u00E1ch xa 50m (sao xa th\u1EBF nh\u1EC9)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n50 m "), new TranslatedString("\n\n\n50 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(226);
	    	
	    	q.setName("1.2.12-111");

			q.setText(new TranslatedString("Sie wollen innerorts vor einem Andreaskreuz parken. Welche \nEntfernung m\u00FCssen Sie mindestens einhalten? \n_____ m","Trong khu v\u1EF1c \u0111\u00F4 th\u1ECB, ph\u1EA3i \u0111\u1EADu xe c\u00E1ch bi\u1EC3n g\u1EA1ch ch\u00E9o (Andreaskreuz) t\u1ED1i thi\u1EC3u bao nhi\u00EAu m\u00E9t?\n#Note:\n#Hint:\nc\u00E1ch xa 5 m (b\u1EB1ng 1/10 so v\u1EDBi \u1EDF ngo\u1EA1i \u00F4)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n5 m "), new TranslatedString("\n\n\n5 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(227);
	    	
	    	q.setName("1.2.12-112");

			q.setText(new TranslatedString("Wie weit vor und hinter einem Haltestellenschild d\u00FCrfen Sie nicht \nparken? \nJeweils _____ m","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu xe tr\u01B0\u1EDBc v\u00E0 sau bi\u1EC3n STOP bao xa?\nM\u1ED7i chi\u1EC1u ______ m\n#Note:\n#Hint: \nChi\u1EC1u d\u00E0i trung b\u00ECnh c\u1EE7a xe bus l\u00E0 15 m"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\nJeweils 15 m "), new TranslatedString("\n\n\nJeweils 15 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(228);
	    	
	    	q.setName("1.2.12-113");

			q.setText(new TranslatedString("An Haltestellen darf nur gehalten werden, wenn Busse nicht \nbehindert werden. Wie lange d\u00FCrfen Sie dort h\u00F6chstens halten? \n_____ Minuten","\u1EDE tr\u1EA1m xe bus ch\u1EC9 \u0111\u01B0\u1EE3c d\u1EEBng khi kh\u00F4ng c\u1EA3n tr\u1EDF xe bus. B\u1EA1n \u0111\u01B0\u1EE3c d\u1EEBng t\u1ED1i \u0111a \u1EDF c\u00E1ch tr\u1EA1m \u0111\u00F3 bao l\u00E2u?\n______ ph\u00FAt\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n3 Minuten "), new TranslatedString("\n\n\n3 Minuten ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(229);
	    	
	    	q.setName("1.2.12-114");

			q.setText(new TranslatedString("Wer h\u00E4lt falsch?","Xe n\u00E0o d\u1EEBng sai?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.12-114.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der rote Pkw","Xe Pkw m\u00E0u \u0111\u1ECF")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der gelbe Pkw","Xe Pkw m\u00E0u v\u00E0ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beide Pkw","C\u1EA3 hai xe Pkw")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(230);
	    	
	    	q.setName("1.2.12-115");

			q.setText(new TranslatedString("Wer parkt falsch?","Xe n\u00E0o \u0111\u1EADu sai?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.12-115.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der helle Pkw","Xe Pkw m\u00E0u s\u00E1ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der dunkle Pkw","Xe Pkw m\u00E0u t\u1ED1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beide Pkw","C\u1EA3 hai xe Pkw")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-116
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(231);
	    	
	    	q.setName("1.2.12-116");

			q.setText(new TranslatedString("Wer h\u00E4lt falsch?","Xe n\u00E0o d\u1EEBng sai?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.12-116.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der dunkle Pkw","Xe Pkw m\u00E0u t\u1ED1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der helle Pkw","Xe Pkw m\u00E0u s\u00E1ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beide Pkw","C\u1EA3 hai xe Pkw")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-117
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(232);
	    	
	    	q.setName("1.2.12-117");

			q.setText(new TranslatedString("In einer Stra\u00DFe sind links und rechts neben der Fahrbahn \nParkstreifen zum L\u00E4ngsparken vorhanden. Wo d\u00FCrfen Sie parken?","Tr\u00EAn m\u1ED9t con \u0111\u01B0\u1EDDng \u1EDF c\u1EA3 hai ph\u00EDa tr\u00E1i ph\u1EA3i c\u1EA1nh l\u00F2ng \u0111\u01B0\u1EDDng c\u00F3 l\u00E0n \u0111\u01B0\u1EDDng \u0111\u1EC3 \u0111\u1EADu xe l\u00E2u. B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu \u1EDF \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Stra\u00DFen f\u00FCr beide Fahrtrichtungen nur auf dem rechten Parkstreifen","Tr\u00EAn \u0111\u01B0\u1EDDng hai chi\u1EC1u, ch\u1EC9 \u0111\u01B0\u1EE3c \u0111\u1EADu \u1EDF b\u00EAn ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Einbahnstra\u00DFen auf dem rechten oder dem linken Parkstreifen","Tr\u00EAn \u0111\u01B0\u1EDDng m\u1ED9t chi\u1EC1u, \u0111\u01B0\u1EE3c \u0111\u1EADu \u1EDF b\u00EAn ph\u1EA3i ho\u1EB7c b\u00EAn tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In Stra\u00DFen f\u00FCr beide Fahrtrichtungen auch auf dem linken Parkstreifen","Tr\u00EAn \u0111\u01B0\u1EDDng hai chi\u1EC1u, \u0111\u01B0\u1EE3c \u0111\u1EADu c\u1EA3 b\u00EAn tr\u00E1i n\u1EEFa")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.12-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(233);
	    	
	    	q.setName("1.2.12-118");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen neben anderen Fahrzeugen in zweiter \nReihe halten?","Xe n\u00E0o \u0111\u01B0\u1EE3c ph\u00E9p d\u1EEBng g\u1EA7n xe kh\u00E1c th\u00E0nh hai h\u00E0ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Taxen, um Fahrg\u00E4ste ein- oder aussteigen zu lassen, wenn die\nVerkehrslage dies zul\u00E4sst","Taxi, d\u1EEBng \u0111\u1EC3 l\u1EA5y ho\u1EB7c tr\u1EA3 kh\u00E1ch, khi t\u00ECnh hu\u1ED1ng tr\u00EAn \u0111\u01B0\u1EDDng cho ph\u00E9p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Alle Fahrzeuge, wenn das Warnblinklicht eingeschaltet ist","T\u1EA5t c\u1EA3 c\u00E1c xe, khi b\u1EADt \u0111\u00E8n t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.16-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(234);
	    	
	    	q.setName("1.2.16-001");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen, wenn Sie Warnblinklicht sehen? \nMit einem","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC, khi nh\u00ECn th\u1EA5y \u0111\u00E8n c\u1EA3nh b\u00E1o nh\u00E1y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Schulbus, aus dem Kinder aussteigen","\u2013 \u0110\u1ED1i v\u1EDBi xe bus h\u1ECDc sinh: c\u00F3 tr\u1EBB con xu\u1ED1ng xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Pkw, der abgeschleppt wird","\u2013 \u0110\u1ED1i v\u1EDBi xe Pkw: xe n\u00E0y \u0111ang \u0111\u01B0\u1EE3c k\u00E9o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Lkw, der liegen geblieben ist","\u2013 \u0110\u1ED1i v\u1EDBi xe Lkw: xe n\u00E0y d\u1EEBng l\u1EA1i l\u00E2u")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.16-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(235);
	    	
	    	q.setName("1.2.16-101");

			q.setText(new TranslatedString("Zu welchem Zweck darf die Hupe au\u00DFerorts benutzt werden?","B\u00EAn ngo\u00E0i khu v\u1EF1c \u0111\u00F4 th\u1ECB, b\u1EA5m c\u00F2i d\u00F9ng cho m\u1EE5c \u0111\u00EDch g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Als Warnsignal","l\u00E0m t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Als \u00DCberholsignal","l\u00E0m t\u00EDn hi\u1EC7u v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Als Rufzeichen","l\u00E0m t\u00EDn hi\u1EC7u g\u1ECDi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.16-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(236);
	    	
	    	q.setName("1.2.16-102");

			q.setText(new TranslatedString("Zu welchem Zweck darf die Hupe innerorts benutzt werden?","B\u00EAn trong khu v\u1EF1c \u0111\u00F4 th\u1ECB, b\u1EA5m c\u00F2i d\u00F9ng cho m\u1EE5c \u0111\u00EDch g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Als Warnsignal","l\u00E0m t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Als \u00DCberholsignal","l\u00E0m t\u00EDn hi\u1EC7u v\u01B0\u1EE3t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Als Rufzeichen","l\u00E0m t\u00EDn hi\u1EC7u g\u1ECDi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.16-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(237);
	    	
	    	q.setName("1.2.16-103");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei einer Panne in einem Tunnel?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi b\u1ECB h\u1ECFng xe trong \u0111\u01B0\u1EDDng h\u1EA7m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warnblinklicht einschalten","B\u1EADt \u0111\u00E8n t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrzeug m\u00F6glichst in einer Pannenbucht abstellen","N\u1EBFu c\u00F3 th\u1EC3 d\u1EEBng xe \u1EDF ch\u1ED7 d\u00E0nh ri\u00EAng cho xe h\u1ECFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Motor vorsorglich laufen lassen","V\u1EABn b\u1EADt m\u00F4t\u01A1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.16-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(238);
	    	
	    	q.setName("1.2.16-104");

			q.setText(new TranslatedString("Beim Befahren eines Tunnels n\u00E4hern Sie sich einem Stauende. \nWie verhalten Sie sich?","Khi \u0111i t\u1EDBi \u0111\u01B0\u1EDDng h\u1EA7m, b\u1EA1n g\u1EB7p ph\u1EA3i v\u1EE5 k\u1EB9t xe.\nB\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warnblinklicht einschalten","B\u1EADt \u0111\u00E8n t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenden und den Tunnel verlassen","Quay l\u1EA1i v\u00E0 tr\u00E1nh \u0111\u01B0\u1EDDng h\u1EA7m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Am Stauende Motor abstellen und das Fahrzeug verlassen","Khi k\u1EB9t xe, t\u1EAFt \u0111\u1ED9ng c\u01A1 v\u00E0 r\u1EDDi kh\u1ECFi xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.17-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(239);
	    	
	    	q.setName("1.2.17-001");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie bei den Beleuchtungseinrichtungen Ihres \nFahrzeugs achten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC \u0111\u1EBFn h\u1EC7 th\u1ED1ng \u0111\u00E8n c\u1EE7a xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen vorschriftsm\u00E4\u00DFig angebracht sein","C\u00E1c \u0111\u00E8n ph\u1EA3i \u0111\u01B0\u1EE3c l\u1EAFp \u0111\u1EB7t \u0111\u00FAng c\u00E1ch theo h\u01B0\u1EDBng d\u1EABn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen sauber sein","C\u00E1c \u0111\u00E8n ph\u1EA3i s\u1EA1ch")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen funktionst\u00FCchtig sein","C\u00E1c \u0111\u00E8n ph\u1EA3i ho\u1EA1t \u0111\u1ED9ng t\u1ED1t")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.17-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(240);
	    	
	    	q.setName("1.2.17-101");

			q.setText(new TranslatedString("Wodurch kann auch mit Abblendlicht der Gegenverkehr geblendet \nwerden?","Do \u0111\u00E2u b\u1EA1n c\u00F3 th\u1EC3 b\u1ECB l\u00F3a m\u1EAFt do \u00E1nh \u0111\u00E8n c\u1EE7a xe ng\u01B0\u1EE3c chi\u1EC1u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch zu hoch eingestellte Scheinwerfer","Do \u0111\u00E8n pha \u0111\u1EC3 qu\u00E1 cao")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch falsch eingesetzte Gl\u00FChlampen","L\u1EAFp kh\u00F4ng \u0111\u00FAng b\u00F3ng \u0111\u00E8n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch falsche Beladung","L\u1EAFp \u0111\u1EB7t sai")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(241);
	    	
	    	q.setName("1.2.19-001");

			q.setText(new TranslatedString("An einem Bahn\u00FCbergang schwenkt ein Bahnbediensteter eine \nwei\u00DF-rot-wei\u00DFe Fahne. Was bedeutet dies?","T\u1EA1i n\u01A1i c\u00F3 \u0111\u01B0\u1EDDng ray qua \u0111\u01B0\u1EDDng, nh\u00E2n vi\u00EAn \u0111\u01B0\u1EDDng s\u1EAFt v\u1EABy l\u00E1 c\u1EDD s\u1ECDc tr\u1EAFng-\u0111\u1ECF-tr\u1EAFng. \u0110i\u1EC1u n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen vor dem Bahn\u00FCbergang warten","B\u1EA1n ph\u1EA3i ch\u1EDD \u1EDF tr\u01B0\u1EDBc khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen die Gleise vorsichtig \u00FCberqueren","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p c\u1EA9n th\u1EADn b\u0103ng qua \u0111\u01B0\u1EDDng ray")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Fahne hat nur Bedeutung f\u00FCr den Lokf\u00FChrer","L\u00E1 c\u1EDD ch\u1EC9 c\u00F3 \u00FD ngh\u0129a \u0111\u1ED1i v\u1EDBi ng\u01B0\u1EDDi l\u00E1i t\u00E0u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(242);
	    	
	    	q.setName("1.2.19-002");

			q.setText(new TranslatedString("Wann m\u00FCssen Sie vor einem Bahn\u00FCbergang warten?","Khi n\u00E0o b\u1EA1n ph\u1EA3i ch\u1EDD tr\u01B0\u1EDBc khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn rotes Blinklicht aufleuchtet","Khi c\u00F3 \u0111\u00E8n nh\u00E1y \u0111\u1ECF b\u1EADt s\u00E1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn sich die Schranken senken","Khi thanh ch\u1EAFn \u0111\u01B0\u1EE3c h\u1EA1 th\u1EA5p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn ein Bahnbediensteter eine wei\u00DF-rot-wei\u00DFe Fahne schwenkt","Khi c\u00F3 nh\u00E2n vi\u00EAn \u0111\u01B0\u1EDDng s\u1EAFt v\u1EABy l\u00E1 c\u1EDD s\u1ECDc tr\u1EAFng-\u0111\u1ECF-tr\u1EAFng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(243);
	    	
	    	q.setName("1.2.19-003");

			q.setText(new TranslatedString("Sie n\u00E4hern sich einem Bahn\u00FCbergang mit Blinklichtanlage und \nHalbschranke. Das rote Blinklicht leuchtet auf; die Halbschranke ist \nnoch ge\u00F6ffnet Wie verhalten Sie sich?","B\u1EA1n \u0111i g\u1EA7n khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng c\u00F3 h\u1EC7 th\u1ED1ng \u0111\u00E8n b\u00E1o v\u00E0 thanh ch\u1EAFn m\u1ED9t b\u00EAn. \u0110\u00E8n \u0111\u1ECF \u0111ang t\u1EAFt, thanh ch\u1EAFn m\u1ED9t b\u00EAn \u0111ang m\u1EDF. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?\nSie n\u00E4hern sich einem Bahn\u00FCbergang mit Blinklichtanlage und\nHalbschranke. Das rote Blinklicht leuchtet auf; die Halbschranke ist\nnoch ge\u00F6ffnet B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Andreaskreuz warten","D\u1EEBng tr\u01B0\u1EDBc bi\u1EC3n g\u1EA1ch ch\u00E9o h\u00ECnh ch\u1EEF X (Andreaskreuz)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, solange die Halbschranke noch ge\u00F6ffnet ist","\u0110i ti\u1EBFp, mi\u1EC5n l\u00E0 thanh ch\u1EAFn v\u1EABn m\u1EDF")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Den Bahn\u00FCbergang \u00FCberqueren, wenn kein Schienenfahrzeug in Sicht\nist","\u0110i b\u0103ng qua \u0111\u01B0\u1EDDng ray, khi kh\u00F4ng nh\u00ECn th\u1EA5y t\u00E0u \u0111i t\u1EDBi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(244);
	    	
	    	q.setName("1.2.19-004");

			q.setText(new TranslatedString("Ein Bahnbediensteter schwenkt an einem Bahn\u00FCbergang eine rote \nLeuchte. Was bedeutet dies?","\u1EDE khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng, nh\u00E2n vi\u00EAn \u0111\u01B0\u1EDDng s\u1EAFt v\u1EABy 1 c\u00E1i \u0111\u00E8n \u0111\u1ECF. \u0110i\u1EC1u n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie m\u00FCssen vor dem Bahn\u00FCbergang warten","B\u1EA1n ph\u1EA3i ch\u1EDD \u1EDF tr\u01B0\u1EDBc khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen die Gleise vorsichtig \u00FCberqueren","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p c\u1EA9n th\u1EADn b\u0103ng qua \u0111\u01B0\u1EDDng ray")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die rote Leuchte hat f\u00FCr Sie keine Bedeutung","\u0110\u00E8n \u0111\u1ECF kh\u00F4ng c\u00F3 \u00FD ngh\u0129a \u0111\u1ED1i v\u1EDBi b\u1EA1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(245);
	    	
	    	q.setName("1.2.19-005");

			q.setText(new TranslatedString("Sie n\u00E4hern sich einem Bahn\u00FCbergang, dessen Schranken ge\u00F6ffnet \nsind. Wie verhalten Sie sich?","B\u1EA1n \u0111i g\u1EA7n khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng, c\u00F3 thanh ch\u1EAFn \u0111ang m\u1EDF. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit m\u00E4\u00DFiger Geschwindigkeit heranfahren, Bahnstrecke beobachten","Ch\u00FA \u00FD \u0111\u01B0\u1EDDng t\u00E0u, r\u1EDDi nhanh ch\u00F3ng v\u1ECDt qua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Bahn\u00FCbergang warten, wenn auf ihm wegen Stau\nangehalten werden m\u00FCsste","D\u1EEBng tr\u01B0\u1EDBc khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua, khi b\u1EA1n ph\u1EA3i d\u1EEBng l\u1EA1i do k\u1EB9t xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit unverminderter Geschwindigkeit weiterfahren, weil in solchen\nF\u00E4llen der Stra\u00DFenverkehr immer Vorrang hat","\u0110i ti\u1EBFp kh\u00F4ng gi\u1EA3m t\u1ED1c, v\u00EC l\u00FAc n\u00E0o xe tr\u00EAn \u0111\u01B0\u1EDDng c\u0169ng c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(246);
	    	
	    	q.setName("1.2.19-006");

			q.setText(new TranslatedString("Bei Ann\u00E4herung an einen Bahn\u00FCbergang beginnt sich die Schranke \nzu senken. Wie verhalten Sie sich?","Khi \u0111\u1EBFn g\u1EA7n khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng th\u00EC thanh ch\u1EAFn ngang b\u1EAFt \u0111\u1EA7u h\u1EA1 xu\u1ED1ng. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Andreaskreuz warten","Ch\u1EDD tr\u01B0\u1EDBc bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In jedem Fall beschleunigt weiterfahren","Trong m\u1ECDi t\u00ECnh hu\u1ED1ng ph\u1EA3i t\u0103ng t\u1ED1c \u0111i ti\u1EBFp")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(247);
	    	
	    	q.setName("1.2.19-008");

			q.setText(new TranslatedString("An der Einfahrt in ein Industriegebiet steht das Andreaskreuz mit \ndem Zusatzzeichen \"Industriegebiet, Schienenfahrzeuge haben \nVorrang\u201C. Was haben Sie zu beachten?","\u1EDE ng\u00F5 v\u00E0o khu c\u00F4ng nghi\u1EC7p c\u00F3 m\u1ED9t bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas v\u1EDBi ch\u00FA th\u00EDch \"Khu c\u00F4ng nghi\u1EC7p, t\u00E0u c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn\".\nB\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Bahn\u00FCberg\u00E4nge nur mit m\u00E4\u00DFiger Geschwindigkeit heranfahren","Ch\u1EC9 \u0111i ngang qua \u0111\u01B0\u1EDDng ray v\u1EDBi t\u1ED1c \u0111\u1ED9 cao")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schienenfahrzeuge haben an allen Bahn\u00FCberg\u00E4ngen Vorrang","T\u00E0u c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn \u1EDF t\u1EA5t c\u1EA3 nh\u1EEFng khu v\u1EF1c b\u0103ng qua \u0111\u01B0\u1EDDng l\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kraftfahrzeuge haben an Bahn\u00FCberg\u00E4ngen ohne Andreaskreuz\nVorrang","Xe c\u00F3 \u0111\u1ED9ng c\u01A1 c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn \u1EDF nh\u1EEFng khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng nh\u01B0ng kh\u00F4ng c\u00F3 bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(248);
	    	
	    	q.setName("1.2.19-101");

			q.setText(new TranslatedString("Sie fahren auf einem Waldweg und n\u00E4hern sich einem \nBahn\u00FCbergang ohne Andreaskreuz. Wie verhalten Sie sich?","B\u1EA1n \u0111i trong \u0111\u01B0\u1EDDng r\u1EEBng v\u00E0 g\u1EA7n t\u1EDBi ch\u1ED7 c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng nh\u01B0ng kh\u00F4ng c\u00F3 bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit m\u00E4\u00DFiger Geschwindigkeit heranfahren und beobachten, ob sich\nein Schienenfahrzeug n\u00E4hert","\u0110i v\u1EDBi t\u1ED1c \u0111\u1ED9 v\u1EEBa ph\u1EA3i v\u00E0 ch\u00FA \u00FD xem c\u00F3 t\u00E0u \u0111\u1EBFn g\u1EA7n hay kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Horchen, ob sich durch Pfeifen oder L\u00E4uten ein Schienenfahrzeug\nank\u00FCndigt","L\u1EAFng nghe, xem c\u00F3 chu\u00F4ng reng hay c\u00F2i c\u1EE7a t\u00E0u \u0111ang \u0111i \u0111\u1EBFn hay kh\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ohne weiteres durchfahren, da Schienenfahrzeuge hier wartepflichtig\nsind","\u0110i ti\u1EBFp, v\u00EC t\u00E0u c\u00F3 tr\u00E1ch nhi\u1EC7m ph\u1EA3i ch\u1EDD \u1EDF \u0111\u00E2y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(249);
	    	
	    	q.setName("1.2.19-102");

			q.setText(new TranslatedString("Wie verhalten Sie sich an einem Bahn\u00FCbergang, dessen Schranken \ngeschlossen sind?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o \u1EDF khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua \u0111\u01B0\u1EDDng, khi thanh ch\u1EAFn ngang \u0111\u00E3 h\u1EA1 xu\u1ED1ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Andreaskreuz warten, Stra\u00DFeneinm\u00FCndungen freilassen","Ch\u1EDD \u1EDF tr\u01B0\u1EDBc bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas, \u0111\u1EC3 tr\u1ED1ng giao l\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Dunkelheit m\u00F6glichst auf Standlicht schalten","Khi t\u1ED1i, ph\u1EA3i b\u1EADt \u0111\u00E8n d\u1EEBng n\u1EBFu c\u1EA7n thi\u1EBFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrsraum ausnutzen, dicht vor der Schranke warten","T\u1EADn d\u1EE5ng kho\u1EA3ng tr\u1ED1ng tr\u00EAn \u0111\u01B0\u1EDDng, ch\u1EDD \u1EDF s\u00E1t thanh ch\u1EAFn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(250);
	    	
	    	q.setName("1.2.19-103");

			q.setText(new TranslatedString("Welche Bedeutung hat ein Andreaskreuz mit rotem Blinklicht in \nForm eines Pfeiles nach rechts?","Bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas c\u00F3 \u0111\u00E8n nh\u00E1y m\u00E0u \u0111\u1ECF theo h\u00ECnh m\u0169i t\u00EAn qua ph\u1EA3i c\u00F3 \u00FD ngh\u0129a th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rechtsabbieger m\u00FCssen warten","Ai mu\u1ED1n qu\u1EB9o ph\u1EA3i th\u00EC ph\u1EA3i ch\u1EDD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("F\u00FCr Geradeausfahrende ist das Blinklicht ohne Bedeutung","\u0110\u1ED1i v\u1EDBi xe \u0111i th\u1EB3ng, \u0111\u00E8n nh\u00E1y n\u00E0y kh\u00F4ng c\u00F3 \u00FD ngh\u0129a (hi\u1EC7u l\u1EF1c)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das rote Blinklicht hat nur Bedeutung f\u00FCr Schienenfahrzeuge","\u0110\u00E8n nh\u00E1y m\u00E0u \u0111\u1ECF ch\u1EC9 c\u00F3 \u00FD ngh\u0129a \u0111\u1ED1i v\u1EDBi t\u00E0u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(251);
	    	
	    	q.setName("1.2.19-104");

			q.setText(new TranslatedString("Wann d\u00FCrfen Sie einen unbeschrankten Bahn\u00FCbergang mit \nBlinklichtanlage \u00FCberqueren, nachdem ein Zug durchgefahren ist?","T\u1EA1i khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray c\u1EAFt qua \u0111\u01B0\u1EDDng c\u00F3 trang b\u1ECB h\u1EC7 th\u1ED1ng \u0111\u00E8n nh\u00E1y, khi n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c \u0111i ti\u1EBFp sau khi 1 con t\u00E0u v\u1EEBa \u0111i qua?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn das rote Blinklicht erloschen ist","Khi \u0111\u00E8n nh\u00E1y m\u00E0u \u0111\u1ECF t\u1EAFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sofort nach Durchfahrt des Zuges, auch wenn das rote Blinklicht noch\nleuchtet","L\u1EADp t\u1EE9c \u0111i qua ngay sau khi t\u00E0u \u0111i kh\u1ECFi, khi \u0111\u00E8n \u0111\u1ECF v\u1EABn s\u00E1ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sobald der Gegenverkehr anf\u00E4hrt, auch wenn das rote Blinklicht noch\nleuchtet","Ngay khi xe ng\u01B0\u1EE3c chi\u1EC1u b\u1EAFt \u0111\u1EA7u \u0111i ti\u1EBFp, d\u00F9 \u0111\u00E8n \u0111\u1ECF v\u1EABn s\u00E1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(252);
	    	
	    	q.setName("1.2.19-105");

			q.setText(new TranslatedString("Sie n\u00E4hern sich einem beschrankten Bahn\u00FCbergang. Wo m\u00FCssen \nSie warten, wenn Sie bei stockendem Verkehr auf dem \nBahn\u00FCbergang zum Stehen kommen w\u00FCrden?","B\u1EA1n \u0111i g\u1EA7n t\u1EDBi khu v\u1EF1c c\u00F3 \u0111\u01B0\u1EDDng ray c\u1EAFt qua v\u00E0 c\u00F3 thanh ch\u1EAFn b\u1EA3o v\u1EC7. B\u1EA1n ph\u1EA3i ch\u1EDD \u1EDF \u0111\u00E2u khi b\u1EA1n ph\u1EA3i d\u1EEBng l\u1EA1i do c\u00F3 k\u1EB9t xe \u1EDF ngay tr\u00EAn \u0111\u01B0\u1EDDng ray?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Andreaskreuz","Ph\u00EDa tr\u01B0\u1EDBc bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unmittelbar vor den Schienen","Ngay tr\u01B0\u1EDBc \u0111\u01B0\u1EDDng ray")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In H\u00F6he der Schranke","Xa b\u1EB1ng \u0111\u1ED9 d\u00E0i thanh ch\u1EAFn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(253);
	    	
	    	q.setName("1.2.19-106");

			q.setText(new TranslatedString("Wie verhalten Sie sich hier?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o \u1EDF \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.19-106.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit m\u00E4\u00DFiger Geschwindigkeit heranfahren und warten","\u0110i t\u1EDBi v\u1EDBi t\u1ED1c \u0111\u1ED9 v\u1EEBa ph\u1EA3i v\u00E0 ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, weil die Fahrbahn nur f\u00FCr den Gegenverkehr gesperrt\nist","\u0110i ti\u1EBFp, v\u00EC \u0111\u01B0\u1EDDng ch\u1EC9 b\u1ECB ch\u1EB7n \u0111\u1ED1i v\u1EDBi xe ng\u01B0\u1EE3c chi\u1EC1u")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(254);
	    	
	    	q.setName("1.2.19-107");

			q.setText(new TranslatedString("An einem Bahn\u00FCbergang \u2013 innerorts \u2013 ist die Schranke \ngeschlossen. Wo m\u00FCssen Sie warten?","\u1EDE n\u01A1i c\u00F3 \u0111\u01B0\u1EDDng ray c\u1EAFt ngang (trong khu \u0111\u00F4 th\u1ECB), thanh ch\u1EAFn b\u1EA3o v\u1EC7 \u0111\u00E3 h\u1EA1 xu\u1ED1ng. B\u1EA1n ph\u1EA3i ch\u1EDD \u1EDF \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Andreaskreuz","Ph\u00EDa tr\u01B0\u1EDBc bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor der letzten Bake","Ph\u00EDa tr\u01B0\u1EDBc c\u1ED9t \u0111\u01B0\u1EDDng cu\u1ED1i c\u00F9ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor der ersten Bake","Ph\u00EDa tr\u01B0\u1EDBc c\u1ED9t \u0111\u01B0\u1EDDng \u0111\u1EA7u ti\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(255);
	    	
	    	q.setName("1.2.19-108");

			q.setText(new TranslatedString("Worauf weisen diese Verkehrszeichen hin?","Bi\u1EC3n b\u00E1o n\u00E0y cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.19-108.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf einen unbeschrankten Bahn\u00FCbergang, an den man nur mit 10\nkm/h heranfahren darf","T\u1EA1i n\u01A1i c\u00F3 \u0111\u01B0\u1EDDng ray c\u1EAFt ngang m\u00E0 kh\u00F4ng c\u00F3 thanh ch\u1EAFn b\u1EA3o v\u1EC7, xe ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i qua v\u1EDBi t\u1ED1c \u0111\u1ED9 10 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen unbeschrankten Bahn\u00FCbergang, auf dem die\nSchienenfahrzeuge nur mit 10 km/h fahren","T\u1EA1i n\u01A1i c\u00F3 \u0111\u01B0\u1EDDng ray c\u1EAFt ngang m\u00E0 kh\u00F4ng c\u00F3 thanh ch\u1EAFn b\u1EA3o v\u1EC7, t\u00E0u ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 10 km/h")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(256);
	    	
	    	q.setName("1.2.19-109");

			q.setText(new TranslatedString("Was bedeutet dieses Verkehrszeichen?","Bi\u1EC3n n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.19-109.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Hinweis auf vorhandene elektrische Oberleitungen","B\u00E1o c\u00F3 d\u00E2y \u0111i\u1EC7n tr\u00EAn cao")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Schienenverkehr hat immer Vorrang","B\u00E1o t\u00E0u lu\u00F4n c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es ist immer zu warten, wenn sich ein Schienenfahrzeug n\u00E4hert","B\u00E1o ph\u1EA3i lu\u00F4n ch\u1EDD \u1EDF \u0111\u00E2y, khi c\u00F3 t\u00E0u \u0111\u1EBFn g\u1EA7n")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.19-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(257);
	    	
	    	q.setName("1.2.19-110");

			q.setText(new TranslatedString("Vor einem Bahn\u00FCbergang steht vor einer von rechts einm\u00FCndenden \nStra\u00DFe ein rot leuchtendes Lichtzeichen ohne Andreaskreuz. Wo \nm\u00FCssen Sie warten?","C\u00F3 \u0111\u00E8n \u0111\u1ECF (kh\u00F4ng c\u00F3 bi\u1EC3n g\u1EA1ch ch\u00E9o Andreas) ph\u00EDa tr\u01B0\u1EDBc khu v\u1EF1c \u0111\u01B0\u1EDDng ray c\u1EAFt ngang ph\u00EDa b\u00EAn ph\u1EA3i c\u1EE7a m\u1ED9t con \u0111\u01B0\u1EDDng. B\u1EA1n ph\u1EA3i ch\u1EDD \u1EDF \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.19-110.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An der Haltlinie","T\u1EA1i v\u1EA1ch stop")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn keine Haltlinie vorhanden ist, vor dem Lichtzeichen","Khi kh\u00F4ng c\u00F3 v\u1EA1ch stop, ch\u1EDD tr\u01B0\u1EDBc \u0111\u00E8n b\u00E1o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich kann nach Beobachten des Verkehrs bis zum Bahn\u00FCbergang\nvorfahren","Sau khi quan s\u00E1t xe, t\u00F4i c\u00F3 th\u1EC3 \u0111i qua ch\u1ED7 \u0111\u01B0\u1EDDng ray c\u1EAFt ngang")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.20-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(258);
	    	
	    	q.setName("1.2.20-001");

			q.setText(new TranslatedString("An einer Stra\u00DFenbahnhaltestelle steigen Fahrg\u00E4ste auf der \nFahrbahn ein und aus. Wie verhalten Sie sich, wenn Sie rechts \nvorbeifahren wollen?","\u1EDE tr\u1EA1m t\u00E0u \u0111i\u1EC7n, c\u00F3 kh\u00E1ch l\u00EAn xu\u1ED1ng t\u00E0u. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi b\u1EA1n mu\u1ED1n \u0111i qua \u1EDF ph\u00EDa b\u00EAn ph\u1EA3i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warten, wenn Fahrg\u00E4ste gef\u00E4hrdet oder behindert werden k\u00F6nnten","Ph\u1EA3i d\u1EEBng l\u1EA1i ch\u1EDD, n\u1EBFu c\u00F3 th\u1EC3 g\u00E2y nguy hi\u1EC3m hay c\u1EA3n tr\u1EDF kh\u00E1ch \u0111i t\u00E0u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorsichtig mit Schrittgeschwindigkeit vorbeifahren, wenn eine\nGef\u00E4hrdung von Fahrg\u00E4sten ausgeschlossen ist und sie auch nicht \nbehindert werden","C\u1EA9n th\u1EADn \u0111i qua v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9, khi kh\u00F4ng g\u00E2y nguy hi\u1EC3m hay c\u1EA3n tr\u1EDF kh\u00E1ch \u0111i t\u00E0u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Deutlich Warnzeichen geben und weiterfahren","Ra t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o r\u00F5 r\u00E0ng v\u00E0 \u0111i ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.20-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(259);
	    	
	    	q.setName("1.2.20-002");

			q.setText(new TranslatedString("Was m\u00FCssen Sie beachten, wenn Sie an einem Linienbus \nvorbeifahren wollen, der an einer Haltestelle angehalten hat?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC, khi b\u1EA1n mu\u1ED1n \u0111i qua xe bus tuy\u1EBFn (Linienbus), khi xe \u0111\u00F3 \u0111ang d\u1EEBng \u1EDF tr\u1EA1m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit ausreichendem Seitenabstand vorsichtig vorbeifahren, da vor dem\nBus pl\u00F6tzlich Fu\u00DFg\u00E4nger \u00FCber die Fahrbahn gehen k\u00F6nnten","C\u1EA9n th\u1EADn \u0111i qua v\u1EDBi kho\u1EA3ng c\u00E1ch b\u00EAn \u0111\u1EE7 xa, v\u00EC c\u00F3 th\u1EC3 c\u00F3 kh\u00E1ch \u0111i xe bus \u0111\u1ED9t ng\u1ED9t \u0111i xu\u1ED1ng l\u00F2ng \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("M\u00F6glichst dicht an dem Bus vorbeifahren, um nicht zu weit nach links\nzu kommen","V\u01B0\u1EE3t qua xe bus c\u00E0ng g\u1EA7n c\u00E0ng t\u1ED1t, \u0111\u1EC3 kh\u00F4ng \u0111i qu\u00E1 xa v\u1EC1 b\u00EAn tr\u00E1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unter gar keinen Umst\u00E4nden an dem Bus vorbeifahren","Kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t xe bus trong b\u1EA5t k\u1EF3 t\u00ECnh hu\u1ED1ng n\u00E0o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.20-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(260);
	    	
	    	q.setName("1.2.20-003");

			q.setText(new TranslatedString("Wie verhalten Sie sich, wenn ein Bus an einer Haltestelle h\u00E4lt und \nWarnblinklicht eingeschaltet ist?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o, khi xe bus d\u1EEBng \u1EDF tr\u1EA1m v\u00E0 b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nur mit Schrittgeschwindigkeit weiterfahren, n\u00F6tigenfalls anhalten","Ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i ti\u1EBFp v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9, khi c\u1EA7n thi\u1EBFt ph\u1EA3i d\u1EEBng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Vorbeifahren durch ausreichenden Abstand eine Gef\u00E4hrdung\nvon Fahrg\u00E4sten ausschlie\u00DFen","Khi v\u01B0\u1EE3t ph\u1EA3i gi\u1EEFa kho\u1EA3ng c\u00E1ch b\u00EAn \u0111\u1EE7 xa \u0111\u1EC3 kh\u00F4ng g\u00E2y nguy hi\u1EC3m cho kh\u00E1ch \u0111i xe bus")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warten, wenn Fahrg\u00E4ste behindert werden k\u00F6nnten","Ph\u1EA3i d\u1EEBng l\u1EA1i ch\u1EDD, n\u1EBFu c\u00F3 th\u1EC3 g\u00E2y nguy hi\u1EC3m cho kh\u00E1ch \u0111i xe bus")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.20-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(261);
	    	
	    	q.setName("1.2.20-004");

			q.setText(new TranslatedString("Welchen Fahrzeugen m\u00FCssen Sie das Abfahren von \ngekennzeichneten Haltestellen erm\u00F6glichen?","B\u1EA1n ph\u1EA3i nh\u01B0\u1EDDng c\u00E1c lo\u1EA1i xe n\u00E0o kh\u1EDFi h\u00E0nh t\u1EEB m\u1ED9t tr\u1EA1m xe c\u00F3 bi\u1EC3n b\u00E1o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Linienbussen","Xe bus tuy\u1EBFn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schulbussen","Xe bus h\u1ECDc sinh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Taxen","Xe taxi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.20-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(262);
	    	
	    	q.setName("1.2.20-005");

			q.setText(new TranslatedString("Im Gegenverkehr auf derselben Fahrbahn h\u00E4lt ein Linienbus mit \neingeschalteter Warnblinkanlage an einer Haltestelle. Wie verhalten \nSie sich?","C\u00F3 xe bus tuy\u1EBFn \u0111ang d\u1EEBng \u1EDF tr\u1EA1m b\u00EAn ph\u00EDa \u0111\u01B0\u1EDDng ng\u01B0\u1EE3c chi\u1EC1u v\u00E0 c\u00F3 b\u1EADt \u0111\u00E8n nh\u00E1y c\u1EA3nh b\u00E1o. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Schrittgeschwindigkeit abbremsen","Phanh l\u1EA1i \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur dann mit Schrittgeschwindigkeit weiterfahren, wenn Fahrg\u00E4ste die\nFahrbahn \u00FCberqueren wollen","Ch\u1EC9 \u0111\u01B0\u1EE3c ph\u00E9p \u0111i ti\u1EBFp v\u1EDBi t\u1ED1c \u0111\u1ED9 \u0111i b\u1ED9, khi c\u00F3 kh\u00E1ch \u0111i xe bus mu\u1ED1n b\u0103ng qua \u0111\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Geschwindigkeit beibehalten, da der Bus auf der anderen\nFahrbahnseite h\u00E4lt","Gi\u1EEF nguy\u00EAn t\u1ED1c \u0111\u1ED9, v\u00EC xe bus d\u1EEBng \u1EDF ph\u00EDa b\u00EAn kia \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.20-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(263);
	    	
	    	q.setName("1.2.20-006");

			q.setText(new TranslatedString("Eine Stra\u00DFenbahn f\u00E4hrt in Fahrbahnmitte und erreicht eine \nHaltestelle mit wartenden Fahrg\u00E4sten am Fahrbahnrand. Wie \nverhalten Sie sich kurz vor Stillstand der Stra\u00DFenbahn?","T\u00E0u \u0111i\u1EC7n \u0111i gi\u1EEFa \u0111\u01B0\u1EDDng v\u00E0 s\u1EAFp \u0111\u1EBFn tr\u1EA1m d\u1EEBng, n\u01A1i \u0111ang c\u00F3 kh\u00E1ch \u0111\u1EE9ng ch\u1EDD \u1EDF b\u00EAn \u0111\u01B0\u1EDDng. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o ngay tr\u01B0\u1EDBc khi t\u00E0u \u0111i\u1EC7n d\u1EEBng h\u1EB3n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich bleibe hinter der Stra\u00DFenbahn, um die Fahrg\u00E4ste nicht zu\ngef\u00E4hrden","T\u00F4i \u0111i ph\u00EDa sau t\u00E0u \u0111i\u1EC7n, \u0111\u1EC3 kh\u00F4ng g\u00E2y nguy hi\u1EC3m cho kh\u00E1ch \u0111i t\u00E0u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich \u00FCberhole die Stra\u00DFenbahn, weil diese noch nicht steht","T\u00F4i v\u01B0\u1EE3t qua t\u00E0u \u0111i\u1EC7n, v\u00EC t\u00E0u \u0111i\u1EC7n l\u00FAc \u0111\u00F3 ch\u01B0a d\u1EEBng l\u1EA1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich brauche die Fahrg\u00E4ste in dieser Situation nicht zu beachten, weil\nsie die Fahrbahn noch nicht betreten d\u00FCrfen","Trong t\u00ECnh hu\u1ED1ng n\u00E0y, t\u00F4i kh\u00F4ng c\u1EA7n ch\u00FA \u00FD kh\u00E1ch \u0111i t\u00E0u, v\u00EC h\u1ECD kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y xu\u1ED1ng l\u00F2ng \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.20-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(264);
	    	
	    	q.setName("1.2.20-101");

			q.setText(new TranslatedString("Sie n\u00E4hern sich einem Linienbus, der auf Ihrer Fahrbahn in \nGegenrichtung an einer Haltestelle h\u00E4lt und Warnblinklicht \neingeschaltet hat. Worauf stellen Sie sich ein?","B\u1EA1n \u0111i g\u1EA7n m\u1ED9t xe bus tuy\u1EBFn, xe \u0111ang \u0111ang d\u1EEBng \u1EDF tr\u1EA1m ph\u00EDa \u0111\u01B0\u1EDDng b\u00EAn kia v\u00E0 c\u00F3 b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o. B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn c\u00E1c t\u00ECnh hu\u1ED1ng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrg\u00E4ste wechseln die Seite der Fahrbahn, um den Bus noch zu\nerreichen","Kh\u00E1ch \u0111i qua \u0111\u01B0\u1EDDng \u0111\u1EC3 b\u1EAFt k\u1ECBp xe bus")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Aus dem Bus aussteigende Fahrg\u00E4ste \u00FCberqueren unvermittelt die\nFahrbahn","Kh\u00E1ch xu\u1ED1ng xe bus \u0111\u1ED9t ng\u1ED9t b\u0103ng qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Fahrg\u00E4ste \u00FCberqueren die Fahrbahn erst, wenn der Bus das\nBlinklicht ausgeschaltet hat","Kh\u00E1ch \u0111i xe bus b\u0103ng qua \u0111\u01B0\u1EDDng khi xe bus \u0111\u00E3 t\u1EAFt \u0111\u00E8n b\u00E1o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.22-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(265);
	    	
	    	q.setName("1.2.22-101");

			q.setText(new TranslatedString("Wie weit darf eine Ladung \u00FCber die R\u00FCckstrahler nach hinten \nh\u00F6chstens hinausragen, ohne dass eine Kennzeichnung \nerforderlich ist? \n_____ m","H\u00E0ng h\u00F3a \u0111\u01B0\u1EE3c nh\u00F4 ra t\u1ED1i \u0111a bao nhi\u00EAu ph\u00EDa tr\u00EAn t\u1EA5m ph\u1EA3n quang g\u1EAFn sau \u0111u\u00F4i xe, m\u00E0 kh\u00F4ng c\u1EA7n ph\u1EA3i g\u1EAFn bi\u1EC3n b\u00E1o?\n#Note:\n<ul>\n<li><strong>R\u00FCckstrahler</strong>: t\u1EA5m ph\u1EA3n chi\u1EBFu (reflector) <a href=\"http://www.motorrad-planet.com/images/scaled/Rueckstrahler_Selbstklebend_445x296.jpg\" target=\"_blank\">Xem h\u00ECnh minh h\u1ECDa</a></li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n1 m "), new TranslatedString("\n\n\n1 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.22-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(266);
	    	
	    	q.setName("1.2.22-102");

			q.setText(new TranslatedString("Womit ist bei Dunkelheit eine Ladung zu kennzeichnen, die mehr \nals 1 m \u00FCber die R\u00FCckstrahler des Fahrzeugs hinausragt?","L\u00E0m sao \u0111\u1EC3 h\u00E0ng h\u00F3a d\u1EC5 \u0111\u01B0\u1EE3c nh\u1EADn ra v\u00E0o bu\u1ED5i t\u1ED1i, khi h\u00E0ng h\u00F3a nh\u00F4 ra h\u01A1n 1m ph\u00EDa tr\u00EAn t\u1EA5m ph\u1EA3n quang g\u1EAFn sau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit roter Leuchte und rotem R\u00FCckstrahler","D\u00F9ng \u0111\u00E8n \u0111\u1ECF v\u00E0 t\u1EA5m ph\u1EA3n quang \u0111\u1ECF")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit orangefarbener Warntafel","B\u1EB1ng decal c\u1EA3nh b\u00E1o m\u00E0u da cam")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Einschalten der Nebelschlussleuchte","B\u1EB1ng c\u00E1ch b\u1EADt \u0111\u00E8n s\u01B0\u01A1ng m\u00F9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.22-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(267);
	    	
	    	q.setName("1.2.22-103");

			q.setText(new TranslatedString("Was haben Sie zu beachten, wenn Sie eine Ladung transportieren \nwollen?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC, khi ch\u1EDF theo h\u00E0ng h\u00F3a?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Ladung darf den Fahrer nicht behindern","H\u00E0ng kh\u00F4ng \u0111\u01B0\u1EE3c che t\u00E0i x\u1EBF")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ma\u00DF- und Gewichtsgrenzen d\u00FCrfen nicht \u00FCberschritten werden","Tr\u1ECDng t\u1EA3i v\u00E0 k\u00EDch th\u01B0\u1EDBc kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t m\u1EE9c cho ph\u00E9p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Oberhalb einer H\u00F6he von 2,50 m darf die Ladung bis zu 50 cm nach\nvorn \u00FCber den Fahrzeugumriss hinausragen","N\u1EBFu h\u00E0ng cao h\u01A1n 2,50 m th\u00EC ch\u1EC9 \u0111\u01B0\u1EE3c nh\u00F4 ra t\u1ED1i \u0111a 50 cm ra ph\u00EDa tr\u01B0\u1EDBc")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.22-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(268);
	    	
	    	q.setName("1.2.22-104");

			q.setText(new TranslatedString("Was kann schon durch eine 20 %ige \u00DCberladung eintreten?","\u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 x\u1EA3y ra do t\u1EA3i qu\u00E1 t\u1EA3i 20% ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00DCberbeanspruchung der Bremsen","S\u1EED d\u1EE5ng qu\u00E1 t\u1EA3i b\u1ED9 ph\u1EADn phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verschlechterung des Lenkverhaltens","L\u00E0m l\u00E1i kh\u00F3 h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sch\u00E4den an tragenden Fahrzeugteilen","L\u00E0m h\u1ECFng b\u1ED9 ph\u1EADn ch\u1ECBu t\u1EA3i")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.22-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(269);
	    	
	    	q.setName("1.2.22-105");

			q.setText(new TranslatedString("Darf eine Ladung nach vorn \u00FCber das Kraftfahrzeug hinausragen?","Darf eine Ladung nach vorn \u00FCber das Kraftfahrzeug hinausragen?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, wenn die Ladung oberhalb einer H\u00F6he von 2,50 m nicht mehr als\n50 cm hinausragt","Ja, wenn die Ladung oberhalb einer H\u00F6he von 2,50 m nicht mehr als\n50 cm hinausragt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, wenn die Ladung gekennzeichnet ist","Ja, wenn die Ladung gekennzeichnet ist")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, es reicht, wenn der Fahrer in seiner Sicht nach vorn nicht\nbehindert wird","Ja, es reicht, wenn der Fahrer in seiner Sicht nach vorn nicht\nbehindert wird")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.22-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(270);
	    	
	    	q.setName("1.2.22-106");

			q.setText(new TranslatedString("Welche Bedeutung haben orangefarbene Warntafeln an einem \nFahrzeug? \nEs handelt sich um einen","Welche Bedeutung haben orangefarbene Warntafeln an einem\nFahrzeug?\nEs handelt sich um einen"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Gefahrguttransport","\u2013 Gefahrguttransport")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 Viehtransport","\u2013 Viehtransport")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 Transport leicht verderblicher Lebensmittel","\u2013 Transport leicht verderblicher Lebensmittel")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.23-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(271);
	    	
	    	q.setName("1.2.23-001");

			q.setText(new TranslatedString("Wer ist f\u00FCr den verkehrssicheren Zustand eines zugelassenen \nFahrzeugs verantwortlich?","Ai l\u00E0 ng\u01B0\u1EDDi ch\u1ECBu tr\u00E1ch nhi\u1EC7m v\u1EC1 \u0111i\u1EC1u ki\u1EC7n an to\u00E0n c\u1EE7a xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Fahrer","T\u00E0i x\u1EBF")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Halter","Ch\u1EE7 xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Haftpflichtversicherung","H\u00E3ng b\u1EA3o hi\u1EC3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.23-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(272);
	    	
	    	q.setName("1.2.23-002");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, wenn Sie unterwegs feststellen, dass Ihr \nFahrzeug nicht mehr verkehrssicher ist?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi \u0111ang \u0111i tr\u00EAn \u0111\u01B0\u1EDDng th\u00EC ph\u00E1t hi\u1EC7n xe m\u00ECnh kh\u00F4ng \u0111\u1EA3m b\u1EA3o an to\u00E0n giao th\u00F4ng n\u1EEFa?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug auf k\u00FCrzestem Weg aus dem Verkehr ziehen","L\u00E1i xe ra kh\u1ECFi \u0111\u01B0\u1EDDng giao th\u00F4ng theo c\u00E1ch nhanh nh\u1EA5t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Erst nach Beseitigung des Schadens weiterfahren","S\u1EEDa ch\u1EEFa h\u01B0 h\u1ECFng r\u1ED3i m\u1EDBi \u0111i ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bis zur n\u00E4chsten Vertragswerkstatt weiterfahren","\u0110i ti\u1EBFp \u0111\u1EBFn tr\u1EA1m s\u1EEDa xe g\u1EA7n nh\u1EA5t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.23-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(273);
	    	
	    	q.setName("1.2.23-003");

			q.setText(new TranslatedString("Welche M\u00E4ngel an einem Fahrzeug k\u00F6nnen zu einer Gef\u00E4hrdung \ndes Stra\u00DFenverkehrs f\u00FChren?","Nh\u1EEFng h\u1ECFng h\u00F3c n\u00E0o c\u1EE7a xe c\u00F3 th\u1EC3 d\u1EABn \u0111\u1EBFn nguy hi\u1EC3m tr\u00EAn \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abgefahrene Reifen","L\u1ED1p qu\u00E1 m\u00F2n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Defekte Schlussleuchten","\u0110\u00E8n h\u1EADu h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unzureichende Bremswirkung","Phanh kh\u00F4ng \u0103n")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.23-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(274);
	    	
	    	q.setName("1.2.23-004");

			q.setText(new TranslatedString("Was kann das Telefonieren des Fahrzeugf\u00FChrers w\u00E4hrend der Fahrt \nbewirken?","N\u00F3i chuy\u1EC7n qua \u0111i\u1EC7n tho\u1EA1i khi l\u00E1i xe c\u00F3 th\u1EC3 \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ablenkung durch das Gespr\u00E4ch","M\u1EA5t t\u1EADp trung do n\u00F3i chuy\u1EC7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ablenkung durch die Bedienung","M\u1EA5t t\u1EADp trung do thao t\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ablenkung ist ausgeschlossen","Kh\u00F4ng c\u00F3 m\u1EA5t t\u1EADp trung")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.23-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(275);
	    	
	    	q.setName("1.2.23-005");

			q.setText(new TranslatedString("Unter welchen Bedingungen ist Telefonieren f\u00FCr den Fahrer \nw\u00E4hrend der Fahrt unzul\u00E4ssig?","Trong nh\u1EEFng \u0111i\u1EC1u ki\u1EC7n n\u00E0o n\u00F3i chuy\u1EC7n \u0111i\u1EC7n tho\u1EA1i khi l\u00E1i xe l\u00E0 kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn das Mobiltelefon oder der H\u00F6rer des Autotelefons\naufgenommen werden muss","Khi ph\u1EA3i nh\u1EA5c \u0111i\u1EC7n tho\u1EA1i \u0111i \u0111\u1ED9ng ho\u1EB7c tai nghe c\u1EE7a \u0111i\u1EC7n th\u1ECDai g\u1EAFn tr\u00EAn \u00F4-t\u00F4")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn das Mobiltelefon oder der H\u00F6rer des Autotelefons in der Hand\ngehalten werden muss","Khi ph\u1EA3i c\u1EA7m \u0111i\u1EC7n tho\u1EA1i \u0111i \u0111\u1ED9ng ho\u1EB7c tai nghe c\u1EE7a \u0111i\u1EC7n th\u1ECDai g\u1EAFn tr\u00EAn \u00F4-t\u00F4")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn die sichere F\u00FChrung des Fahrzeugs nicht mehr gew\u00E4hrleistet ist","Khi s\u1EF1 an to\u00E0n c\u1EE7a xe kh\u00F4ng \u0111\u01B0\u1EE3c \u0111\u1EA3m b\u1EA3o")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(276);
	    	
	    	q.setName("1.2.26-001");

			q.setText(new TranslatedString("Die Ampel zeigt \u201EGr\u00FCn\u201C. Sie wollen rechts abbiegen. Wie verhalten \nSie sich gegen\u00FCber Fu\u00DFg\u00E4ngern, welche die Stra\u00DFe \u00FCberqueren, in \ndie Sie einbiegen wollen?","Khi c\u00F3 \u0111\u00E8n \u201Exanh\u201C. B\u1EA1n mu\u1ED1n qu\u1EB9o ph\u1EA3i. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o \u0111\u1ED1i v\u1EDBi ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111ang mu\u1ED1n b\u0103ng qua \u0111\u01B0\u1EDDng \u1EDF ph\u00EDa \u0111\u01B0\u1EDDng b\u1EA1n mu\u1ED1n qu\u1EB9o v\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf die Fu\u00DFg\u00E4nger besondere R\u00FCcksicht nehmen, n\u00F6tigenfalls warten","\u0110\u1EB7c bi\u1EC7t ch\u00FA \u00FD ng\u01B0\u1EDDi \u0111i b\u1ED9, c\u00F3 th\u1EC3 ph\u1EA3i d\u1EEBng l\u1EA1i n\u1EBFu c\u1EA7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Z\u00FCgig abbiegen, da die Fu\u00DFg\u00E4nger auf den Fahrzeugverkehr\nR\u00FCcksicht nehmen m\u00FCssen","C\u1EE9 qu\u1EB9o ti\u1EBFp, v\u00EC ng\u01B0\u1EDDi \u0111i b\u1ED9 ph\u1EA3i ch\u00FA \u00FD xe tr\u00EAn \u0111\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur warten, wenn mehrere Fu\u00DFg\u00E4nger gleichzeitig die Stra\u00DFe\n\u00FCberqueren","Ch\u1EC9 ch\u1EDD, khi c\u00F3 nhi\u1EC1u ng\u01B0\u1EDDi c\u00F9ng qua \u0111\u01B0\u1EDDng m\u1ED9t l\u00FAc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(277);
	    	
	    	q.setName("1.2.26-002");

			q.setText(new TranslatedString("Wie verhalten Sie sich gegen\u00FCber Fu\u00DFg\u00E4ngern, welche die Stra\u00DFe \n\u00FCberqueren, in die Sie einbiegen wollen?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o \u0111\u1ED1i v\u1EDBi ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111ang mu\u1ED1n b\u0103ng qua \u0111\u01B0\u1EDDng \u1EDF ph\u00EDa \u0111\u01B0\u1EDDng b\u1EA1n mu\u1ED1n qu\u1EB9o v\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf die Fu\u00DFg\u00E4nger besondere R\u00FCcksicht nehmen, n\u00F6tigenfalls warten","\u0110\u1EB7c bi\u1EC7t ch\u00FA \u00FD ng\u01B0\u1EDDi \u0111i b\u1ED9, c\u00F3 th\u1EC3 ph\u1EA3i d\u1EEBng l\u1EA1i n\u1EBFu c\u1EA7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Z\u00FCgig weiterfahren, weil Fu\u00DFg\u00E4nger auf einbiegende Fahrzeuge\nR\u00FCcksicht nehmen m\u00FCssen","C\u1EE9 qu\u1EB9o ti\u1EBFp, v\u00EC ng\u01B0\u1EDDi \u0111i b\u1ED9 ph\u1EA3i ch\u00FA \u00FD xe tr\u00EAn \u0111\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur dann warten, wenn die Fu\u00DFg\u00E4nger einen gekennzeichneten\n\u00DCberweg benutzen","Ch\u1EC9 ch\u1EDD, khi ng\u01B0\u1EDDi \u0111i b\u1ED9 ra d\u1EA5u sang \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(278);
	    	
	    	q.setName("1.2.26-003");

			q.setText(new TranslatedString("In welchen F\u00E4llen m\u00FCssen Sie an einen Zebrastreifen besonders \nvorsichtig heranfahren?","Trong t\u00ECnh hu\u1ED1ng n\u00E0o b\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Fu\u00DFg\u00E4nger die Fahrbahn \u00FCberqueren wollen","Khi c\u00F3 ng\u01B0\u1EDDi \u0111i b\u1ED9 mu\u1ED1n b\u0103ng qua \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn die Sicht auf den Zebrastreifen behindert ist","Khi t\u1EA7m nh\u00ECn \u0111\u1EBFn v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng b\u1ECB che khu\u1EA5t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn ein anderes Fahrzeug bereits vor dem Zebrastreifen wartet","Khi c\u00F3 xe kh\u00E1c \u0111ang ch\u1EDD tr\u01B0\u1EDBc v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(279);
	    	
	    	q.setName("1.2.26-004");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.26-004.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beiden Fu\u00DFg\u00E4ngern das \u00DCberqueren erm\u00F6glichen","\u0110\u1EC3 cho 2 ng\u01B0\u1EDDi \u0111i b\u1ED9 qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, weil beide Fu\u00DFg\u00E4nger Sie vorlassen m\u00FCssen","\u0110i ti\u1EBFp, v\u00EC hai ng\u01B0\u1EDDi \u0111i b\u1ED9 ph\u1EA3i \u0111\u1EC3 b\u1EA1n \u0111i tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor dem entgegenkommenden Fu\u00DFg\u00E4nger durchfahren, weil dieser\nwartepflichtig ist","\u0110i qua tr\u01B0\u1EDBc ng\u01B0\u1EDDi \u0111i b\u1ED9 \u1EDF ph\u00EDa b\u00EAn kia \u0111\u01B0\u1EDDng, v\u00EC ng\u01B0\u1EDDi n\u00E0y c\u00F3 tr\u00E1ch nhi\u1EC7m ph\u1EA3i ch\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(280);
	    	
	    	q.setName("1.2.26-005");

			q.setText(new TranslatedString("Was gilt unmittelbar vor und auf Zebrastreifen? \nEs darf nicht","\u0110i\u1EC1u g\u00EC \u00E1p d\u1EE5ng \u1EDF ngay tr\u01B0\u1EDBc v\u00E0 tr\u00EAn v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 \u00FCberholt werden","Kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 gehalten werden","Kh\u00F4ng \u0111\u01B0\u1EE3c d\u1EEBng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 geparkt werden","Kh\u00F4ng \u0111\u01B0\u1EE3c \u0111\u1EADu xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(281);
	    	
	    	q.setName("1.2.26-006");

			q.setText(new TranslatedString("Ein Radfahrer verh\u00E4lt sich falsch, indem er ohne abzusteigen die \nFahrbahn auf einem Zebrastreifen \u00FCberqueren will. Was ist richtig?","Ng\u01B0\u1EDDi \u0111i xe \u0111\u1EA1p x\u1EED l\u00FD sai, khi kh\u00F4ng xu\u1ED1ng xe l\u00FAc b\u0103ng qua \u0111\u01B0\u1EDDng \u1EDF v\u1EA1ch ng\u1EF1a v\u1EB1n. \u0110i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nachgeben und den Radfahrer \u00FCberqueren lassen","\u0110i ch\u1EADm v\u00E0 \u0111\u1EC3 xe \u0111\u1EA1p \u0111i qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, weil der Radfahrer warten muss","\u0110i ti\u1EBFp, v\u00EC xe \u0111\u1EA1p ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(282);
	    	
	    	q.setName("1.2.26-101");

			q.setText(new TranslatedString("Wie verhalten Sie sich in dieser Situation?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o \u1EDF t\u00ECnh hu\u1ED1ng n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.26-101.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich lasse den Fu\u00DFg\u00E4nger die Fahrbahn \u00FCberqueren","T\u00F4i \u0111\u1EC3 ng\u01B0\u1EDDi \u0111i b\u1ED9 b\u0103ng qua \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich warte vor dem Zebrastreifen, bis der Lieferwagen abgebogen ist","T\u00F4i ch\u1EDD tr\u01B0\u1EDBc v\u1EA1ch ng\u1EF1a v\u1EB1n, \u0111\u1EBFn khi xe giao h\u00E0ng qu\u1EB9o xong")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich schlie\u00DFe sofort zu dem Lieferwagen auf","T\u00F4i l\u1EADp t\u1EE9c ch\u1EA1y theo xe giao h\u00E0ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(283);
	    	
	    	q.setName("1.2.26-102");

			q.setText(new TranslatedString("Ein Fu\u00DFg\u00E4nger will die Fahrbahn auf dem Zebrastreifen \u00FCberqueren. \nWie verhalten Sie sich?","M\u1ED9t ng\u01B0\u1EDDi \u0111i b\u1ED9 mu\u1ED1n b\u0103ng qua \u0111\u01B0\u1EDDng \u1EDF v\u1EA1ch ng\u1EF1a v\u1EB1n.\nB\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit m\u00E4\u00DFiger Geschwindigkeit heranfahren, n\u00F6tigenfalls warten","\u0110i t\u1EDBi v\u1EDBi t\u1ED1c \u0111\u1ED9 v\u1EEBa ph\u1EA3i, n\u1EBFu c\u1EA7n thi\u1EBFt th\u00EC ph\u1EA3i d\u1EEBng l\u1EA1i ch\u1EDD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Keinesfalls \u00FCberholen","Lu\u00F4n lu\u00F4n kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t xe kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An wartenden Fahrzeugen darf vorbeigefahren werden","\u0110\u01B0\u1EE3c ph\u00E9p \u0111i qua xe \u0111ang \u0111\u1EE9ng ch\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(284);
	    	
	    	q.setName("1.2.26-103");

			q.setText(new TranslatedString("An einem Zebrastreifen h\u00E4lt auf dem rechten Fahrstreifen ein Lkw \nan. Sie fahren auf dem linken Fahrstreifen. Wie verhalten Sie sich?","\u1EDE v\u1EA1ch ng\u1EF1a v\u1EB1n ph\u00EDa l\u00E0n \u0111\u01B0\u1EDDng ph\u1EA3i c\u00F3 xe Lkw \u0111ang d\u1EEBng. B\u1EA1n \u0111ang \u0111i tr\u00EAn l\u00E0n \u0111\u01B0\u1EDDng tr\u00E1i. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warten, weil Fu\u00DFg\u00E4nger die Fahrbahn \u00FCberqueren k\u00F6nnten","Ch\u1EDD, v\u00EC c\u00F3 th\u1EC3 c\u00F3 ng\u01B0\u1EDDi \u0111i b\u1ED9 qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Warnzeichen geben und den Lkw \u00FCberholen","Ra t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o v\u00E0 v\u01B0\u1EE3t xe Lkw")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Z\u00FCgig weiterfahren, wenn Sie vor sich keine Fu\u00DFg\u00E4nger sehen","\u0110i ti\u1EBFp kh\u00F4ng d\u1EEBng, khi b\u1EA1n kh\u00F4ng nh\u00ECn th\u1EA5y ng\u01B0\u1EDDi \u0111i b\u1ED9 n\u00E0o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(285);
	    	
	    	q.setName("1.2.26-104");

			q.setText(new TranslatedString("Sie sind in einem Verkehrsstau und m\u00FCssen warten; vor Ihnen \nbefindet sich ein Fu\u00DFg\u00E4nger\u00FCbergang. Wie verhalten Sie sich?","B\u1EA1n \u0111ang ph\u1EA3i ch\u1EDD trong \u0111\u00E1m k\u1EB9t xe; tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 v\u1EA1ch ng\u1EF1a v\u1EB1n. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00DCberweg frei lassen","\u0110\u1EC3 tr\u1ED1ng v\u1EA1ch n\u00E0y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Aufschlie\u00DFen und auf dem \u00DCberweg warten, wenn keine Fu\u00DFg\u00E4nger\nzu sehen sind","D\u1EEBng tr\u00EAn v\u1EA1ch n\u00E0y, khi kh\u00F4ng nh\u00ECn th\u1EA5y c\u00F3 ng\u01B0\u1EDDi \u0111i b\u1ED9")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Aufschlie\u00DFen und auf dem \u00DCberweg warten, um den Stau zu\nverk\u00FCrzen","\u0110i b\u00E1m theo v\u00E0 d\u1EEBng tr\u00EAn v\u1EA1ch n\u00E0y, \u0111\u1EC3 gi\u1EA3m t\u1EAFc \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(286);
	    	
	    	q.setName("1.2.26-105");

			q.setText(new TranslatedString("Ein Fu\u00DFg\u00E4nger\u00FCberweg ist verschneit; sichtbar ist nur das \nHinweiszeichen \u201EFu\u00DFg\u00E4nger\u00FCberweg\u201C. Ein Fu\u00DFg\u00E4nger will die \nFahrbahn \u00FCberqueren. Was ist richtig?","V\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng b\u1ECB tuy\u1EBFt r\u01A1i che, ch\u1EC9 nh\u00ECn th\u1EA5y m\u1ED7i bi\u1EC3n b\u00E1o \u201EV\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9\u201C. M\u1ED9t ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111ang mu\u1ED1n qua \u0111\u01B0\u1EDDng. \u0110i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rechtzeitig und vorsichtig bremsen","Phanh \u0111\u00FAng l\u00FAc v\u00E0 c\u1EA9n th\u1EADn (k\u1EBBo tr\u01B0\u1EE3t)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("N\u00F6tigenfalls anhalten, um dem Fu\u00DFg\u00E4nger das \u00FCberqueren zu\nerm\u00F6glichen","N\u1EBFu c\u1EA7n thi\u1EBFt ph\u1EA3i d\u1EEBng l\u1EA1i, \u0111\u1EC3 ng\u01B0\u1EDDi \u0111i b\u1ED9 c\u00F3 th\u1EC3 b\u0103ng qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weiterfahren, weil nur sichtbare Markierungen zu beachten sind","\u0110i ti\u1EBFp, v\u00EC ch\u1EC9 ch\u00FA \u00FD nh\u1EEFng d\u1EA5u hi\u1EC7u c\u00F3 th\u1EC3 nh\u00ECn th\u1EA5y \u0111\u01B0\u1EE3c (\u00DD c\u1EE7a c\u00E2u n\u00E0y l\u00E0 do kh\u00F4ng nh\u00ECn th\u1EA5y v\u1EA1ch song ngang quang \u0111\u01B0\u1EDDng n\u00EAn kh\u00F4ng th\u00E8m \u0111\u1EC3 \u00FD v\u00E0 c\u1EE9 \u0111i ti\u1EBFp)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.26-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(287);
	    	
	    	q.setName("1.2.26-106");

			q.setText(new TranslatedString("Warum ist rechtzeitiges Bremsen beim Ann\u00E4hern an Zebrastreifen \nbesonders wichtig?","T\u1EA1i sao phanh \u0111\u00FAng l\u00FAc khi \u0111\u1EBFn g\u1EA7n v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng l\u00E0 r\u1EA5t quan tr\u1ECDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Damit Fu\u00DFg\u00E4nger nicht erschreckt oder verunsichert werden","\u0110\u1EC3 ng\u01B0\u1EDDi \u0111i b\u1ED9 kh\u00F4ng s\u1EE3 v\u00E0 kh\u00F4ng th\u1EA5y kh\u00F4ng an to\u00E0n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Damit Auffahrunf\u00E4lle vermieden werden","\u0110\u1EC3 tr\u00E1nh tai n\u1EA1n ki\u1EC3u b\u1ECB h\u00FAc v\u00E0o \u0111u\u00F4i xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Damit die R\u00E4der rechtzeitig blockieren","\u0110\u1EC3 b\u00E1nh xe c\u00F2n k\u1ECBp kh\u00F3a \u0111\u00FAng l\u00FAc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(288);
	    	
	    	q.setName("1.2.34-001");

			q.setText(new TranslatedString("Sie sind an einem Verkehrsunfall beteiligt. Wozu sind Sie \nverpflichtet? \n(Mofa: \u201EPr\u00FCfbescheinigung\u201C statt \u201EF\u00FChrerschein\u201C und \n\u201EBetriebserlaubnis\u201C statt \u201EFahrzeugschein (ggf. \nBetriebserlaubnis)\u201C) \nSie m\u00FCssen","Sie sind an einem Verkehrsunfall beteiligt. Wozu sind Sie\nverpflichtet?\n(Mofa: \u201EPr\u00FCfbescheinigung\u201C statt \u201EF\u00FChrerschein\u201C und\n\u201EBetriebserlaubnis\u201C statt \u201EFahrzeugschein (ggf.\nBetriebserlaubnis)\u201C)\nSie m\u00FCssen"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 bei geringf\u00FCgigem Schaden unverz\u00FCglich zur Seite fahren","\u2013 bei geringf\u00FCgigem Schaden unverz\u00FCglich zur Seite fahren")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 den anderen Beteiligten angeben, dass Sie am Unfall beteiligt sind","\u2013 den anderen Beteiligten angeben, dass Sie am Unfall beteiligt sind")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 auf Verlangen den Berechtigten Ihren Namen und Ihre Anschrift\nangeben sowie F\u00FChrerschein und Fahrzeugschein (ggf. \nBetriebserlaubnis) vorweisen","\u2013 auf Verlangen den Berechtigten Ihren Namen und Ihre Anschrift\nangeben sowie F\u00FChrerschein und Fahrzeugschein (ggf.\nBetriebserlaubnis) vorweisen")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(289);
	    	
	    	q.setName("1.2.34-002");

			q.setText(new TranslatedString("Sie haben ein geparktes Fahrzeug besch\u00E4digt. Trotz angemessener \nWartezeit ist der Gesch\u00E4digte nicht erschienen. Was m\u00FCssen Sie \ntun?","B\u1EA1n \u0111\u1EE5ng ph\u1EA3i 1 xe \u0111ang \u0111\u1EADu. Trotz angemessener\nWartezeit ist der Gesch\u00E4digte nicht erschienen. Was m\u00FCssen Sie\ntun?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ihren Namen und Ihre Anschrift am besch\u00E4digten Fahrzeug\nhinterlassen und den Unfall unverz\u00FCglich der Polizei melden","Ihren Namen und Ihre Anschrift am besch\u00E4digten Fahrzeug\nhinterlassen und den Unfall unverz\u00FCglich der Polizei melden")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie d\u00FCrfen den Unfallort ohne weiteres verlassen","Sie d\u00FCrfen den Unfallort ohne weiteres verlassen")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es gen\u00FCgt, Ihren Namen und Ihre Anschrift einem unbeteiligten\nZeugen zu geben","Es gen\u00FCgt, Ihren Namen und Ihre Anschrift einem unbeteiligten\nZeugen zu geben")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(290);
	    	
	    	q.setName("1.2.34-003");

			q.setText(new TranslatedString("\u00DCber welche Telefonnummern k\u00F6nnen Sie nach einem Unfall mit \nVerletzten die Polizei und einen Not- oder Rettungsdienst \nerreichen?","S\u1ED1 \u0111i\u1EC7n tho\u1EA1i n\u00E0o b\u1EA1n d\u00F9ng \u0111\u1EC3 th\u00F4ng b\u00E1o v\u1EC1 tai n\u1EA1n c\u00F3 ng\u01B0\u1EDDi b\u1ECB th\u01B0\u01A1ng v\u1EDBi c\u1EA3nh s\u00E1t v\u00E0 c\u1EE9u th\u01B0\u01A1ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("110 oder 112","110 ho\u1EB7c 112")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("130","130")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(291);
	    	
	    	q.setName("1.2.34-101");

			q.setText(new TranslatedString("Wozu sind Sie verpflichtet, wenn Sie an einem Verkehrsunfall \nbeteiligt sind, bei dem Personen verletzt wurden? \nSie m\u00FCssen","Wozu sind Sie verpflichtet, wenn Sie an einem Verkehrsunfall\nbeteiligt sind, bei dem Personen verletzt wurden?\nSie m\u00FCssen"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 anhalten und sich \u00FCber die Unfallfolgen vergewissern","\u2013 anhalten und sich \u00FCber die Unfallfolgen vergewissern")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 die Unfallstelle absichern","\u2013 die Unfallstelle absichern")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 den Verletzten Hilfe leisten","\u2013 den Verletzten Hilfe leisten")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(292);
	    	
	    	q.setName("1.2.34-102");

			q.setText(new TranslatedString("Sie kommen als Erster an eine Unfallstelle mit Verletzten. In \nwelcher Reihenfolge gehen Sie vor?","Sie kommen als Erster an eine Unfallstelle mit Verletzten. In\nwelcher Reihenfolge gehen Sie vor?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unfallstelle absichern \u2013 Erste Hilfe leisten \u2013 Rettungsdienst\nalarmieren","Unfallstelle absichern \u2013 Erste Hilfe leisten \u2013 Rettungsdienst\nalarmieren")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Erste Hilfe leisten \u2013 Rettungsdienst alarmieren \u2013 Unfallstelle\nabsichern","Erste Hilfe leisten \u2013 Rettungsdienst alarmieren \u2013 Unfallstelle\nabsichern")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Rettungsdienst alarmieren \u2013 Unfallstelle absichern \u2013 Erste Hilfe\nleisten","Rettungsdienst alarmieren \u2013 Unfallstelle absichern \u2013 Erste Hilfe\nleisten")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(293);
	    	
	    	q.setName("1.2.34-103");

			q.setText(new TranslatedString("Sie kommen als Erster an eine Unfallstelle mit Verletzten. Was \nsollten Sie in der Regel zuerst tun?","Sie kommen als Erster an eine Unfallstelle mit Verletzten. Was\nsollten Sie in der Regel zuerst tun?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unfallstelle absichern","Unfallstelle absichern")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zur n\u00E4chsten Telefonzelle fahren und Rettungsdienst alarmieren","Zur n\u00E4chsten Telefonzelle fahren und Rettungsdienst alarmieren")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Pr\u00FCfen, wie schwer die Verletzungen sind","Pr\u00FCfen, wie schwer die Verletzungen sind")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(294);
	    	
	    	q.setName("1.2.34-105");

			q.setText(new TranslatedString("Sie erkennen vor sich eine Unfallstelle. Was tun Sie?","Sie erkennen vor sich eine Unfallstelle. Was tun Sie?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit sofort verringern","Geschwindigkeit sofort verringern")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warnblinklicht einschalten","Warnblinklicht einschalten")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Z\u00FCgig weiterfahren","Z\u00FCgig weiterfahren")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(295);
	    	
	    	q.setName("1.2.34-106");

			q.setText(new TranslatedString("Wie k\u00F6nnen Sie auf der Autobahn Hilfe anfordern?","Tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn b\u1EA1n l\u00E0m sao \u0111\u1EC3 y\u00EAu c\u1EA7u \u0111\u01B0\u1EE3c gi\u00FAp \u0111\u1EE1?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00FCber Autobahnrastst\u00E4tten","qua tr\u1EA1m d\u1ECBch v\u1EE5 \u0111\u01B0\u1EDDng cao t\u1ED1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00FCber Notrufs\u00E4ulen","qua tr\u1EA1m \u0111i\u1EC7n tho\u1EA1i kh\u1EA9n c\u1EA5p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00FCber die Telefonnummern 112 oder 110","qua s\u1ED1 \u0111i\u1EC7n tho\u1EA1i 112 ho\u1EB7c 110")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(296);
	    	
	    	q.setName("1.2.34-107");

			q.setText(new TranslatedString("Wie erkennen Sie den k\u00FCrzesten Weg zur n\u00E4chsten Notrufs\u00E4ule auf \nder Autobahn?","Wie erkennen Sie den k\u00FCrzesten Weg zur n\u00E4chsten Notrufs\u00E4ule auf\nder Autobahn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An der Pfeilrichtung auf den Leitpfosten","An der Pfeilrichtung auf den Leitpfosten")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An dem Verkehrszeichen \u201EAusfahrt\u201C","An dem Verkehrszeichen \u201EAusfahrt\u201C")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(297);
	    	
	    	q.setName("1.2.34-108");

			q.setText(new TranslatedString("Sie haben auf einer Landstra\u00DFe au\u00DFerhalb einer geschlossenen \nOrtschaft nach einer un\u00FCbersichtlichen Stelle einen Unfall. Wie \nsichern Sie diese Unfallstelle ab?","Sie haben auf einer Landstra\u00DFe au\u00DFerhalb einer geschlossenen\nOrtschaft nach einer un\u00FCbersichtlichen Stelle einen Unfall. Wie\nsichern Sie diese Unfallstelle ab?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warndreieck gut sichtbar in ca. 100 m Entfernung aufstellen","Warndreieck gut sichtbar in ca. 100 m Entfernung aufstellen")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Andere Fahrzeuge, falls erforderlich, z.B. durch Handzeichen warnen","Andere Fahrzeuge, falls erforderlich, z.B. durch Handzeichen warnen")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur Warnblinklicht einschalten","Nur Warnblinklicht einschalten")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.34-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(298);
	    	
	    	q.setName("1.2.34-109");

			q.setText(new TranslatedString("Sie bemerken im Tunnel einen Unfall. Was ist zu tun?","B\u1EA1n ph\u00E1t hi\u1EC7n th\u1EA5y c\u00F3 tai n\u1EA1n trong \u0111\u01B0\u1EDDng h\u1EA7m. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warnblinklicht einschalten","B\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Notdienste \u00FCber Notrufstation informieren","G\u1ECDi c\u1EA5p c\u1EE9u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrzeug nicht verlassen","Kh\u00F4ng \u0111\u01B0\u1EE3c r\u1EDDi xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(299);
	    	
	    	q.setName("1.2.36-001");

			q.setText(new TranslatedString("Ein Polizeibeamter regelt auf einer Kreuzung den Verkehr, obwohl \ndie Ampeln in Betrieb sind. Was gilt?","C\u1EA3nh s\u00E1t giao th\u00F4ng \u0111ang \u0111i\u1EC1u khi\u1EC3n \u1EDF ng\u00E3 t\u01B0, m\u1EB7c d\u00F9 \u0111\u00E8n giao th\u00F4ng v\u1EABn ho\u1EA1t \u0111\u1ED9ng. B\u1EA1n ph\u1EA3i tu\u00E2n th\u1EE7 theo ai?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Zeichen des Polizeibeamten","T\u00EDn hi\u1EC7u c\u1EE7a c\u1EA3nh s\u00E1t giao th\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Lichtzeichen der Ampeln","T\u00EDn hi\u1EC7u \u0111\u00E8n giao th\u00F4ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die vorfahrtregelnden Verkehrszeichen","Theo bi\u1EC3n b\u00E1o \u01B0u ti\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.36-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(300);
	    	
	    	q.setName("1.2.36-002");

			q.setText(new TranslatedString("Ein Polizeibeamter regelt den Verkehr auf einer Kreuzung, an der \nvorfahrtregelnde Verkehrszeichen aufgestellt sind. Was gilt?","C\u1EA3nh s\u00E1t giao th\u00F4ng \u0111ang \u0111i\u1EC1u khi\u1EC3n \u1EDF ng\u00E3 t\u01B0, d\u00F9 \u1EDF \u0111\u00F3 c\u00F3 bi\u1EC3n b\u00E1o \u01B0u ti\u00EAn. B\u1EA1n ph\u1EA3i tu\u00E2n th\u1EE7 theo ai?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Zeichen des Polizeibeamten","T\u00EDn hi\u1EC7u c\u1EE7a c\u1EA3nh s\u00E1t giao th\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die vorfahrtregelnden Verkehrszeichen","Theo bi\u1EC3n b\u00E1o \u01B0u ti\u00EAn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Regel \u201Erechts vor links\u201C","Theo lu\u1EADt \u201Eph\u1EA3i tr\u01B0\u1EDBc tr\u00E1i\u201C")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
