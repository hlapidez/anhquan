package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter6 {

	static {
		
				
		//Question 2.1.10-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(601);
	    	
	    	q.setName("2.1.10-002");

			q.setText(new TranslatedString("Was wirkt auf langen Fahrten der Erm\u00FCdung entgegen?","L\u00E0m soa \u0111\u1EC3 ch\u1ED1ng m\u1EC7t m\u1ECFi khi \u0111i xa?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rechtzeitige und ausreichende Pausen","T\u1EA1m ngh\u1EC9 \u0111\u00FAng l\u00FAc v\u00E0 \u0111\u1EE7")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gymnastische \u00DCbungen w\u00E4hrend der Pausen","T\u1EADp th\u1EC3 d\u1EE5c trong khi ngh\u1EC9 gi\u1EA3i lao")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kaffeetrinken statt Pausen","U\u1ED1ng c\u00E0 ph\u00EA thay v\u00EC ngh\u1EC9 gi\u1EA3i lao")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.10-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(602);
	    	
	    	q.setName("2.1.10-101");

			q.setText(new TranslatedString("Was kann die Aufmerksamkeit im Stra\u00DFenverkehr beeintr\u00E4chtigen?","\u0110i\u1EC1u g\u00EC tr\u00EAn \u0111\u01B0\u1EDDng g\u00E2y m\u1EA5t t\u1EADp trung?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Starke Emotionen (z.B. Freude, \u00C4rger, Ungeduld)","C\u1EA3m x\u00FAc m\u1EA1nh (ch\u1EB3ng h\u1EA1n b\u1EA1n b\u00E8, gi\u1EADn d\u1EEF, thi\u1EBFu ki\u00EAn nh\u1EABn)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Lebhafte Unterhaltung","N\u00F3i chuy\u1EC7n r\u00F4m r\u1EA3")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Spannende Sendungen im Autoradio","Ch\u01B0\u01A1ng tr\u00ECnh h\u1EA5p d\u1EABn tr\u00EAn radio")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.10-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(603);
	    	
	    	q.setName("2.1.10-102");

			q.setText(new TranslatedString("Was lenkt Sie w\u00E4hrend der Fahrt stark ab?","\u0110i\u1EC1u g\u00EC g\u00E2y ph\u00E2n t\u00E1n t\u01B0 t\u01B0\u1EDFng khi l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Telefonieren","\u0110i\u1EC7n tho\u1EA1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anz\u00FCnden einer Zigarette","Ch\u00E2m m\u1ED3i thu\u1ED1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Quengelnde Kinder auf den R\u00FCcksitzen","Tr\u1EBB con qu\u1EA5y \u1EDF gh\u1EBF sau")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(604);
	    	
	    	q.setName("2.1.11-001");

			q.setText(new TranslatedString("Bei n\u00E4chtlichen Disko-Fahrten junger Fahrer kommt es h\u00E4ufig zu \nschweren Unf\u00E4llen. Welche Ursachen k\u00F6nnen dabei eine besondere \nRolle spielen?","Thanh ni\u00EAn l\u00E1i xe ban \u0111\u00EAm \u0111i v\u0169 tr\u01B0\u1EDDng hay g\u1EB7p tai n\u1EA1n nghi\u00EAm tr\u1ECDng. Nguy\u00EAn nh\u00E2n n\u00E0o \u0111\u00F3ng vai tr\u00F2 quan tr\u1ECDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ausgelassenheit, \u00DCbermut und Leichtsinn","Kh\u00EDch \u0111\u1ED9ng, qu\u00E1 m\u1EC7t m\u1ECFi v\u00E0 thi\u1EBFu suy ngh\u0129")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu schnelles und riskantes Fahren, um zu imponieren","\u0110i qu\u00E1 nhanh v\u00E0 nguy hi\u1EC3m \u0111\u1EC3 th\u1EC3 hi\u1EC7n s\u1EF1 s\u0129 di\u1EC7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Z\u00F6gerliches Fahren aus R\u00FCcksicht auf die Gruppe","L\u00E1i xe ng\u1EADp ng\u1EEBng m\u00E0 kh\u00F4ng quan t\u00E2m \u0111\u1EBFn nh\u00F3m b\u1EA1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(605);
	    	
	    	q.setName("2.1.11-002");

			q.setText(new TranslatedString("Wie verhalten Sie sich, wenn auf der Autobahn ein nachfolgender \nVerkehrsteilnehmer dicht auff\u00E4hrt und Sie st\u00E4ndig mit der \nLichthupe auffordert, die \u00DCberholspur zu r\u00E4umen?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o, khi tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c v\u00E0o ban \u0111\u00EAm c\u00F3 xe \u0111i qu\u00E1 g\u1EA7n xe b\u1EA1n v\u00E0 li\u00EAn t\u1EE5c nh\u00E1y \u0111\u00E8n \u0111\u1EC3 y\u00EAu c\u1EA7u tr\u00E1nh \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich wechsle auf die rechte Fahrspur, sobald dies m\u00F6glich ist","Ngay khi c\u00F3 th\u1EC3 t\u00F4i chuy\u1EC3n sang l\u00E0n ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich fordere den Nachfolgenden durch leichtes Bremsen auf, mehr\nAbstand zu halten","T\u00F4i y\u00EAu c\u1EA7u xe \u0111i sau gi\u1EEF kho\u1EA3ng c\u00E1ch an to\u00E0n l\u1EDBn h\u01A1n b\u1EB1ng c\u00E1ch \u0111\u1EA1p nh\u1EB9 phanh")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich wechsle sofort in den Sicherheitsabstand der rechts fahrenden\nFahrzeuge","T\u00F4i l\u1EADp t\u1EE9c chuy\u1EC3n l\u00E0n trong kho\u1EA3ng c\u00E1ch an to\u00E0n v\u1EDBi xe b\u00EAn ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(606);
	    	
	    	q.setName("2.1.11-003");

			q.setText(new TranslatedString("Ein Langsamfahrer hindert Sie am schnelleren Vorw\u00E4rtskommen. \nWas ist richtig?","M\u1ED9t ng\u01B0\u1EDDi \u0111i ch\u1EADm l\u00E0m c\u1EA3n \u0111\u01B0\u1EDDng b\u1EA1n kh\u00F4ng \u0111i nhanh \u0111\u01B0\u1EE3c. \u0110i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich fahre hinter ihm her, bis eine Gelegenheit zum \u00DCberholen kommt","T\u00F4i \u0111i sau anh ta cho \u0111\u1EBFn khi c\u00F3 c\u01A1 h\u1ED9i v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich fordere ihn mit der Lichthupe auf, schneller zu fahren","T\u00F4i y\u00EAu c\u1EA7u anh ta \u0111i nhanh h\u01A1n b\u1EB1ng c\u00E1ch nh\u00E1y \u0111\u00E8n pha")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich fahre ganz dicht auf, um den \u00DCberholweg zu verk\u00FCrzen","T\u00F4i \u0111i th\u1EADt g\u1EA7n \u0111\u1EC3 r\u00FAt ng\u1EAFn kho\u1EA3ng c\u00E1ch v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(607);
	    	
	    	q.setName("2.1.11-004");

			q.setText(new TranslatedString("Unmittelbar bevor Sie losfahren wollen, haben Sie sich sehr \nge\u00E4rgert und sind wutgeladen. Was ist richtig?","Ngay tr\u01B0\u1EDBc khi l\u00E1i xe, b\u1EA1n r\u1EA5t gi\u1EADn d\u1EEF. \u0110i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wutgeladen sollte man nicht fahren","Khi gi\u1EADn d\u1EEF ch\u00FAng ta kh\u00F4ng n\u00EAn l\u00E1i xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich fahre los und reagiere meine Wut beim Fahren ab","T\u00F4i l\u00E1i xe v\u00E0 l\u00E0m ngu\u00F4i c\u01A1n gi\u1EADn khi l\u00E1i")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(608);
	    	
	    	q.setName("2.1.11-005");

			q.setText(new TranslatedString("Junge Fahrer haben ein mehrfach h\u00F6heres Unfallrisiko als \u00E4ltere \nFahrer. Welche Ursachen k\u00F6nnen daf\u00FCr von Bedeutung sein? \nViele junge Fahrer","Ng\u01B0\u1EDDi tr\u1EBB c\u00F3 nguy c\u01A1 tai n\u1EA1n cao h\u01A1n ng\u01B0\u1EDDi gi\u00E0. Nguy\u00EAn nh\u00E2n do \u0111\u00E2u?\n\n<strong>Nhi\u1EC1u ng\u01B0\u1EDDi tr\u1EBB ... </strong>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 wollen sich selbst und die Leistungsf\u00E4higkeit ihres Fahrzeugs\nerproben; dabei geraten nicht wenige in Situationen, die sie nicht","mu\u1ED1n th\u1EED kh\u1EA3 n\u0103ng c\u1EE7a m\u00ECnh v\u00E0 c\u1EE7a xe, dabei geraten nicht wenige in Situationen, die sie nicht")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 fahren zu risikoreich und zu sorglos. Sie haben oft noch zu wenig\nErfahrung, um die Risiken absch\u00E4tzen zu k\u00F6nnen","l\u00E1i xe qu\u00E1 m\u1EA1o hi\u1EC3m v\u00E0 kh\u00F4ng suy ngh\u0129. H\u1ECD th\u01B0\u1EDDng c\u00F3 \u00EDt kinh nghi\u1EC7m \u0111\u1EC3 c\u00F3 th\u1EC3 l\u01B0\u1EDDng tr\u01B0\u1EDBc r\u1EE7i ro")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 vertrauen zu stark auf die Sicherheit ihrer Fahrzeuge","qu\u00E1 tin t\u01B0\u1EDFng v\u00E0o \u0111\u1ED9 an to\u00E0n c\u1EE7a xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(609);
	    	
	    	q.setName("2.1.11-006");

			q.setText(new TranslatedString("Was ist von Fahrern zu halten, die unter Zeitdruck zu schnell fahren \nund Geschwindigkeitsvorschriften nicht einhalten?","B\u1EA1n ngh\u0129 g\u00EC v\u1EC1 nh\u1EEFng ng\u01B0\u1EDDi l\u00E1i xe qu\u00E1 nhanh d\u01B0\u1EDBi \u00E1p l\u1EF1c th\u1EDDi gian v\u00E0 kh\u00F4ng tu\u00E2n th\u1EE7 qui \u0111\u1ECBnh v\u1EC1 t\u1ED1c \u0111\u1ED9?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zeitdruck ist keine Rechtfertigung f\u00FCr die Missachtung von\nVerkehrsvorschriften","\u00C1p l\u1EF1c th\u1EDDi gian kh\u00F4ng ph\u1EA3i l\u00E0 s\u1EF1 bi\u1EC7n h\u1ED9 cho vi\u1EC7c vi ph\u1EA1m qui \u0111\u1ECBnh v\u1EC1 t\u1ED1c \u0111\u1ED9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie sollten nachsichtig beurteilt werden, weil sie in Eile sind","B\u1EA1n s\u1EBD \u0111\u01B0\u1EE3c khoan h\u1ED3ng (th\u00F4ng c\u1EA3m) v\u00EC b\u1EA1n \u0111ang b\u1EADn")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(610);
	    	
	    	q.setName("2.1.11-007");

			q.setText(new TranslatedString("Woran erkennt man den guten Fahrer?","L\u00E0m sao \u0111\u1EC3 nh\u1EADn ra m\u1ED9t ng\u01B0\u1EDDi l\u00E0 t\u00E0i x\u1EBF gi\u1ECFi?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Er verh\u00E4lt sich partnerschaftlich, f\u00E4hrt ruhig und gelassen und\nverzichtet darauf, sich als \u00FCberlegen zu zeigen","Anh ta l\u00E1i xe r\u1EA5t h\u1EE3p t\u00E1c, b\u00ECnh t\u0129nh v\u00E0 kh\u00F4ng th\u1EC3 hi\u1EC7n m\u00ECnh l\u00E0 ng\u01B0\u1EDDi h\u00F9ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Er nutzt jede Gelegenheit zum \u00DCberholen, andere abzuh\u00E4ngen und\nseine \u00DCberlegenheit zu zeigen, auch wenn seine Fahrweise mit Risiken \nverbunden ist","Anh ta s\u1EED d\u1EE5ng m\u1ECDi c\u01A1 h\u1ED9i \u0111\u1EC3 v\u01B0\u1EE3t, \u0111\u1EC3 ng\u01B0\u1EDDi kh\u00E1c ch\u1EA1y sau v\u00E0 th\u1EC3 hi\u1EC7n kh\u1EA3 n\u0103ng c\u1EE7a m\u00ECnh, cho d\u00F9 c\u00E1ch l\u00E1i xe \u0111\u00F3 l\u00E0 nguy hi\u1EC3m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Er f\u00E4hrt rasant, um sein K\u00F6nnen zu beweisen","Anh ta l\u00E1i nhanh \u0111\u1EC3 th\u1EC3 hi\u1EC7n kh\u1EA3 n\u0103ng c\u1EE7a m\u00ECnh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(611);
	    	
	    	q.setName("2.1.11-101");

			q.setText(new TranslatedString("W\u00E4hrend Sie in einem Verkehrsstau festsitzen, sehen Sie im \nR\u00FCckspiegel, wie sich ein Motorradfahrer verbotenerweise \ndurchschl\u00E4ngelt. Wie verhalten Sie sich?","Khi b\u1EA1n \u0111ang b\u1ECB k\u1EB9t xe, nh\u00ECn qua g\u01B0\u01A1ng h\u1EADu b\u1EA1n th\u1EA5y m\u1ED9t ng\u01B0\u1EDDi \u0111i xe m\u00F4-t\u00F4 l\u1EA1ng l\u00E1ch b\u1EA5t h\u1EE3p ph\u00E1p. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich lasse ihn vorbei","T\u00F4i \u0111\u1EC3 anh ta \u0111i qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich hupe und notiere sein Kennzeichen","T\u00F4i b\u00F3p c\u00F2i v\u00E0 ghi nh\u1EDB bi\u1EC3n s\u1ED1 xe c\u1EE7a anh ta")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich sorge daf\u00FCr, dass er nicht an mir vorbeikommt","T\u00F4i \u0111\u1EA3m b\u1EA3o anh ta kh\u00F4ng v\u01B0\u1EE3t \u0111\u01B0\u1EE3c m\u00ECnh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(612);
	    	
	    	q.setName("2.1.11-102");

			q.setText(new TranslatedString("Auf der Landstra\u00DFe werden Sie von einem hinter Ihnen fahrenden \nPkw bedr\u00E4ngt. Offenbar \u00E4rgert sich der Fahrer dar\u00FCber, dass Sie \netwas langsamer fahren, als es erlaubt ist. Wie reagieren Sie?","Tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe b\u1EA1n b\u1ECB \u00E1p l\u1EF1c b\u1EDFi xe Pkw \u0111i sau. Ng\u01B0\u1EDDi \u0111\u00F3 th\u1EC3 hi\u1EC7n t\u1EE9c gi\u1EADn v\u00EC  b\u1EA1n \u0111i ch\u1EADm h\u01A1n cho ph\u00E9p. B\u1EA1n ph\u1EA3n \u1EE9ng th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich lasse ihn sobald wie m\u00F6glich \u00FCberholen und verzichte darauf, mich\nf\u00FCr sein Dr\u00E4ngeln zu revanchieren","T\u00F4i \u0111\u1EC3 anh ta v\u01B0\u1EE3t c\u00E0ng s\u1EDBm c\u00E0ng t\u1ED1t v\u00E0 tr\u00E1nh tr\u1EA3 \u0111\u0169a s\u1EF1 h\u1ED1i th\u00FAc c\u1EE7a anh ta")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich zahle ihm sein Dr\u00E4ngeln heim, indem ich noch langsamer fahre","T\u00F4i tr\u1EA3 \u0111\u0169a s\u1EF1 h\u1ED1i th\u00FAc c\u1EE7a anh ta b\u1EB1ng c\u00E1ch \u0111i ch\u1EADm h\u01A1n n\u1EEFa")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Um den Dr\u00E4ngler loszuwerden, fahre ich ihm mit Vollgas davon","\u0110\u1EC3 c\u1EAFt \u0111u\u00F4i, t\u00F4i nh\u1EA5n h\u1EBFt gas")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(613);
	    	
	    	q.setName("2.1.11-103");

			q.setText(new TranslatedString("Vor Ihnen auf der Landstra\u00DFe f\u00E4hrt ein Pkw etwas langsamer, als es \nerlaubt ist. Sie \u00E4rgern sich \u00FCber die Behinderung durch den \nlangsameren Pkw. Was machen Sie?","Tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe ch\u1EA1y tr\u01B0\u1EDBc xe b\u1EA1n l\u00E0 m\u1ED9t xe Pkw ch\u1EA1y ch\u1EADm h\u01A1n m\u1EE9c cho ph\u00E9p. B\u1EA1n t\u1EE9c gi\u1EADn v\u00EC s\u1EF1 c\u1EA3n \u0111\u01B0\u1EDDng c\u1EE7a xe Pkw. B\u1EA1n s\u1EBD l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich beherrsche mich, bin geduldig und passe meine Geschwindigkeit\ndem Vorausfahrenden an","T\u00F4i t\u1EF1 d\u1EB1n c\u1EA3m x\u00FAc, ki\u00EAn nh\u1EABn v\u00E0 \u0111i\u1EC1u ch\u1EC9nh t\u1ED1c \u0111\u1ED9 ph\u00F9 h\u1EE3p v\u1EDBi xe \u0111i tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich zeige meinen \u00C4rger durch dichtes Auffahren","T\u00F4i th\u1EC3 hi\u1EC7n s\u1EF1 gi\u1EADn d\u1EEF b\u1EB1ng c\u00E1ch \u0111i th\u1EADt s\u00E1t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich versuche, den Fahrer des Pkw zu schnellerem Fahren zu\nbewegen, indem ich die Lichthupe und die Hupe bet\u00E4tige","T\u00F4i c\u1ED1 th\u1EED t\u00E1c \u0111\u1ED9ng \u0111\u1EBFn ng\u01B0\u1EDDi l\u00E1i xe ch\u1EADm b\u1EB1ng c\u00E1ch nh\u00E1y \u0111\u00E8n v\u00E0 b\u00F3p c\u00F2i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(614);
	    	
	    	q.setName("2.1.11-104");

			q.setText(new TranslatedString("Nachdem Sie l\u00E4ngere Zeit auf der Landstra\u00DFe einem ziemlich \nlangsam fahrenden Pkw hinterher fahren mussten, wor\u00FCber Sie \nsich ge\u00E4rgert haben, k\u00F6nnen Sie endlich \u00FCberholen. Wie verhalten \nSie sich?","Tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe, sau m\u1ED9t th\u1EDDi gian d\u00E0i \u0111i sau 1 xe ch\u1EA1y ch\u1EADm, b\u1EA1n c\u0169ng b\u1EF1c m\u00ECnh, v\u00E0 b\u00E2y gi\u1EDD b\u1EA1n c\u00F3 c\u01A1 h\u1ED9i v\u01B0\u1EE3t. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich kontrolliere meinen \u00C4rger und \u00FCberhole. Dabei halte ich\nausreichenden Abstand, auch beim Einscheren","T\u00F4i ki\u1EC3m so\u00E1t c\u01A1n gi\u1EADn v\u00E0 v\u01B0\u1EE3t. T\u00F4i c\u0169ng gi\u1EEF \u0111\u1EE7 kho\u1EA3ng c\u00E1ch an to\u00E0n khi v\u01B0\u1EE3t v\u00E0 khi qu\u1EB9o l\u1EA1i v\u00E0o l\u00E0n \u0111\u01B0\u1EDDng c\u1EE7a m\u00ECnh sau khi v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich weise den Bummelanten zurecht, indem ich ihn nach dem\n\u00DCberholen schneide","T\u00F4i th\u1EC3 hi\u1EC7n s\u1EF1 gi\u1EADn d\u1EEF b\u1EB1ng c\u00E1ch ch\u1EA1y c\u1EAFt m\u1EB7t khi v\u01B0\u1EE3t")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(615);
	    	
	    	q.setName("2.1.11-105");

			q.setText(new TranslatedString("Auf der Landstra\u00DFe werden Sie von einem schnelleren Pkw \n\u00FCberholt und anschlie\u00DFend geschnitten. Wie reagieren Sie?","Tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe b\u1EA1n b\u1ECB m\u1ED9t xe Pkw ch\u1EA1y nhanh v\u01B0\u1EE3t qua v\u00E0 sau \u0111\u00F3 c\u1EAFt m\u1EB7t. B\u1EA1n ph\u1EA3n \u1EE9ng th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich unterdr\u00FCcke meinen \u00C4rger, bleibe cool und fahre weiter, als ob ich\nden Vorfall nicht bemerkt h\u00E4tte","T\u00F4i n\u00E9n gi\u1EADn, gi\u1EEF b\u00ECnh t\u0129nh v\u00E0 \u0111i ti\u1EBFp coi nh\u01B0 kh\u00F4ng \u0111\u1EC3 \u00FD t\u00EDnh hu\u1ED1ng \u0111\u00F3")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich mache den Fahrer mit Hupe und Lichthupe auf sein falsches\nVerhalten aufmerksam. Damit reagiere ich zugleich meinen \u00C4rger ab","T\u00F4i l\u00E0m cho anh ta ch\u00FA \u00FD \u0111\u1EBFn c\u00E1ch l\u00E1i xe sai c\u1EE7a m\u00ECnh b\u1EB1ng c\u00E1ch b\u1EA5m c\u00F2i v\u00E0 nh\u00E1y \u0111\u00E8n. Nh\u01B0 th\u1EBF c\u00F9ng l\u00FAc t\u00F4i h\u1EA1 \u0111\u01B0\u1EE3c c\u01A1n gi\u1EADn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich f\u00FChle mich herausgefordert und setze nun selbst zum \u00DCberholen\nan","T\u00F4i c\u1EA3m th\u1EA5y b\u1ECB th\u00E1ch th\u1EE9c v\u00E0 quy\u1EBFt \u0111\u1ECBnh v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(616);
	    	
	    	q.setName("2.1.11-106");

			q.setText(new TranslatedString("Beim \u00DCberholen einer Fahrzeugkolonne auf der Autobahn werden \nSie von einem sehr schnell herankommenden Pkw bedr\u00E4ngt. Der \nFahrer signalisiert Ihnen mit Lichthupe und Blinker, dass Sie ihm \nseinen \u00DCberholweg frei machen sollen. Was tun Sie?","Khi \u0111ang v\u01B0\u1EE3t m\u1ED9t h\u00E0ng xe tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c, b\u1EA1n b\u1ECB th\u00FAc b\u1EDFi m\u1ED9t xe \u0111ang ch\u1EA1y r\u1EA5t nhanh t\u1EDBi. Xe \u0111\u00F3 nh\u00E1y \u0111\u00E8n v\u00E0 b\u1EADt \u0111\u00E8n t\u00EDn hi\u1EC7u, \u0111\u1EC3 b\u1EA1n tr\u00E1nh \u0111\u01B0\u1EDDng cho anh ta v\u01B0\u1EE3t. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn ich selbst eine ausreichende \u00DCberholgeschwindigkeit habe,\nfahre ich z\u00FCgig weiter und schere nach dem Abschluss des \u00DCberholens","N\u1EBFu c\u00F3 th\u1EC3 \u0111i nhanh h\u01A1n \u0111\u1EC3 v\u01B0\u1EE3t, t\u00F4i s\u1EBD \u0111i ti\u1EBFp v\u00E0 tr\u00E1nh \u0111\u01B0\u1EDDng sau khi v\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zeigt sich in der Kolonne ein gr\u00F6\u00DFerer Zwischenraum, der gefahrloses\nEinscheren nach rechts erm\u00F6glicht, so lasse ich den Dr\u00E4ngler \u00FCberholen","Nh\u00ECn xem c\u00F3 kho\u1EA3ng tr\u1ED1ng \u0111\u1EE7 l\u1EDBn trong h\u00E0ng xe kh\u00F4ng, n\u1EBFu \u0111\u1EE7 kh\u1EA3 n\u0103ng tr\u00E1nh qua ph\u1EA3i m\u00E0 kh\u00F4ng g\u00E2y nguy hi\u1EC3m, t\u00F4i s\u1EBD \u0111\u1EC3 ng\u01B0\u1EDDi \u0111i sau v\u01B0\u1EE3t l\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich erteile dem Dr\u00E4ngler eine Lektion, indem ich absichtlich langsamer\nfahre","T\u00F4i cho th\u1EB1ng h\u1ED1i th\u00FAc ph\u00EDa sau m\u1ED9t b\u00E0i h\u1ECDc b\u1EB1ng c\u00E1ch c\u1ED1 t\u00ECnh \u0111i ch\u1EADm h\u01A1n n\u1EEFa")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(617);
	    	
	    	q.setName("2.1.11-107");

			q.setText(new TranslatedString("Sie wollen auf der Autobahn eine Kolonne z\u00FCgig \u00FCberholen. Daran \nwerden Sie durch ein etwas langsamer fahrendes Fahrzeug \ngehindert, was Sie \u00E4rgert und frustriert. Wie verhalten Sie sich?","B\u1EA1n mu\u1ED1n v\u01B0\u1EE3t m\u1ED9t \u0111o\u00E0n xe d\u00E0i \u0111ang ch\u1EA1y tr\u00EAn Autobahn. Trong \u0111\u00F3 c\u00F3 m\u1ED9t xe ch\u1EA1y ch\u1EADm l\u00E0m b\u1EA1n r\u1EA5t b\u1EF1c m\u00ECnh v\u00E0 m\u1EC7t m\u1ECFi. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich beherrsche mich und warte ab, bis ich \u00FCberholen kann","T\u00F4i t\u1EF1 ki\u1EC1m ch\u1EBF v\u00E0 ch\u1EDD \u0111\u1EBFn khi t\u00F4i c\u00F3 th\u1EC3 v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich fahre dicht auf und signalisiere dem Bummelanten, mir den\n\u00DCberholfahrstreifen schleunigst frei zu machen","T\u00F4i ch\u1EA1y l\u1EA1i g\u1EA7n v\u00E0 ra t\u00EDn hi\u1EC7u gi\u1EE5c ng\u01B0\u1EDDi \u0111\u00F3 ph\u1EA3i \u0111i nh\u01B0\u1EDDng \u0111\u01B0\u1EDDng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(618);
	    	
	    	q.setName("2.1.11-108");

			q.setText(new TranslatedString("Bei einer n\u00E4chtlichen Fahrt mit dem Pkw auf dem Weg in die \nn\u00E4chste Disko will die Gruppe junger Mitfahrerinnen und Mitfahrer \nvermeiden, dass die Stimmung w\u00E4hrend der Fahrt durchh\u00E4ngt. So \nwird ausgelassen gesungen, gelacht und das Autoradio laut \naufgedreht","Ban \u0111\u00EAm m\u1ED9t nh\u00F3m nam n\u1EEFa thanh ni\u00EAn tr\u00EAn \u0111\u01B0\u1EDDng v\u0169 tr\u01B0\u1EDDng b\u1EB1ng xe Pkw, kh\u00F4ng mu\u1ED1n kh\u00F4ng kh\u00ED b\u1ECB l\u1EAFng xu\u1ED1ng. V\u00EC v\u1EADy h\u1ECD h\u00E1t, c\u01B0\u1EDDi v\u00E0 v\u1EB7n radio to.\nT\u00E0i x\u1EBF xe Pkw trong t\u00ECnh hu\u1ED1ng h\u00E0nh ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der f\u00FCr die Sicherheit verantwortliche Fahrer muss sich in diesem Fall\nvon der Gruppe abgrenzen und die Mitfahrer dazu veranlassen, ihn nicht","Ng\u01B0\u1EDDi l\u00E1i xe ph\u1EA3i ch\u1ECBu tr\u00E1ch nhi\u1EC7m v\u1EC1 an to\u00E0n c\u1EE7a xe, trong tr\u01B0\u1EDDng h\u1EE3p n\u00E0y ph\u1EA3i t\u1EA1o kho\u1EA3ng c\u00E1ch v\u1EDBi nh\u00F3m v\u00E0 \u0111\u1EC3 nh\u1EEFng ng\u01B0\u1EDDi c\u00F9ng \u0111i quy\u1EBFt \u0111\u1ECBnh kh\u00F4ng l\u00E0m ph\u00E2n t\u00E1n anh ta")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mitmachen, um nicht als Spielverderber zu gelten","L\u00E0m c\u00F9ng \u0111\u1EC3 kh\u00F4ng l\u00E0m h\u1ECFng cu\u1ED9c vui")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Stimmung der Gruppe durch riskante Fahrman\u00F6ver weiter\naufheizen","T\u0103ng c\u1EA3m h\u1EE9ng cho nh\u00F3m b\u1EB1ng c\u00E1ch l\u1EA1ng xe nguy hi\u1EC3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(619);
	    	
	    	q.setName("2.1.11-109");

			q.setText(new TranslatedString("An einer Ampel, die \u201ERot\u201C zeigt, h\u00E4lt neben Ihnen ein Pkw mit \neinem jungen Mann am Steuer, der mit dem Gas spielt und beim \nUmschalten der Ampel offenbar als Erster lospreschen und Sie \nabh\u00E4ngen will. Wie reagieren Sie?","\u1EDE ch\u1ED1t \u0111\u00E8n giao th\u00F4ng, \u0111\u00E8n \u0111ang \u0111\u1ECF, c\u1EA1nh xe b\u1EA1n l\u00E0 m\u1ED9t xe Pkw v\u1EDBi m\u1ED9t thanh ni\u00EAn tr\u1EBB sau tay l\u00E1i. Anh n\u00E0y \u0111ang ngh\u1ECBch gas v\u00E0 khi \u0111\u00E8n giao th\u00F4ng chuy\u1EC3n \u0111\u00E8n mu\u1ED1n l\u00E0 ng\u01B0\u1EDDi \u0111\u1EA7u ti\u00EAn \u0111i tr\u01B0\u1EDBc v\u00E0 v\u01B0\u1EE3t b\u1EA1n. B\u1EA1n ph\u1EA3n \u1EE9ng th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich lasse mich nicht herausfordern, bleibe cool und lasse den anderen\nfahren","T\u00F4i kh\u00F4ng th\u00E1ch th\u1EE9c m\u00ECnh, gi\u1EEF b\u00ECnh t\u0129nh v\u00E0 \u0111\u1EC3 anh ta \u0111i tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich nehme die Herausforderung an und versuche das Gleiche","T\u00F4i th\u1EA5y b\u1ECB th\u00E1ch th\u1EE9c v\u00E0 c\u1ED1 g\u1EAFng l\u00E0m t\u01B0\u01A1ng t\u1EF1")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(620);
	    	
	    	q.setName("2.1.11-110");

			q.setText(new TranslatedString("Welche Ursachen f\u00FChren h\u00E4ufig zu Verkehrsunf\u00E4llen nach \nDisko-Besuchen?","Nguy\u00EAn nh\u00E2n n\u00E0o hay d\u1EABn \u0111\u1EBFn tai n\u1EA1n sau khi \u0111i ch\u01A1i Disko?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geringe Erfahrung junger Fahrer besonders mit Fahrten in der\nDunkelheit","Thanh ni\u00EAn tr\u1EBB \u00EDt kinh nghi\u1EC7m \u0111\u1EB7c bi\u1EC7t l\u00E1i v\u00E0o ban \u0111\u00EAm")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Imponierverhalten junger Fahrer bei Gruppenfahrten","C\u00E1c thanh ni\u00EAn th\u1EC3 hi\u1EC7n m\u00ECnh trong nh\u00F3m l\u00E1i xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mangelnde Vertrautheit der Fahrer mit dem Verhalten voll besetzter\nFahrzeuge","L\u00E1i xe kh\u00F4ng quen xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(621);
	    	
	    	q.setName("2.1.11-111");

			q.setText(new TranslatedString("Warum wirkt sich umweltschonendes Fahren im Allgemeinen auch \nauf die Verkehrssicherheit g\u00FCnstig aus?","T\u1EA1i sao l\u00E1i xe th\u00E2n thi\u1EC7n v\u1EDBi m\u00F4i tr\u01B0\u1EDDng n\u00F3i chung ph\u00F9 h\u1EE3p v\u1EDBi an to\u00E0n tr\u00EAn \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil dabei vorausschauend gefahren wird, so dass etwaige Gefahren\nfr\u00FCh erkannt und deshalb besonders gut vermieden werden k\u00F6nnen","V\u00EC l\u00E1i xe nh\u00ECn xa ph\u00EDa tr\u01B0\u1EDBc, \u0111\u1EC3 c\u00F3 th\u1EC3 nh\u1EADn bi\u1EBFt s\u1EDBm nguy hi\u1EC3m v\u00E0 c\u00F3 th\u1EC3 tr\u00E1nh nh\u1EEFng bi\u1EBFn c\u1ED1 \u0111\u1EB7c bi\u1EC7t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil beim umweltschonenden Fahren hohe Geschwindigkeiten\nvermieden werden, so dass gef\u00E4hrliche Situationen seltener auftreten","V\u00EC \u0111\u1EC3 th\u00E2n thi\u1EC7n v\u1EDBi m\u00F4i tr\u01B0\u1EDDng, ng\u01B0\u1EDDi ta tr\u00E1nh l\u00E1i xe qu\u00E1 nhanh, do \u0111\u00F3 c\u00E1c t\u00ECnh hu\u1ED1ng nguy hi\u1EC3m c\u0169ng hi\u1EBFm x\u1EA3y ra")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil beim Fahren mit alternativen Kraftstoffen nur langsam gefahren\nwerden kann","V\u00EC l\u00E1i xe ch\u1EADm h\u01A1n khi thay \u0111\u1ED5i nhi\u00EAn li\u1EC7u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(622);
	    	
	    	q.setName("2.1.11-112");

			q.setText(new TranslatedString("Ein Pkw \u00FCberholt leichtsinnig \u201EIhre Kolonne\u201C. Wegen Gegenverkehr \nwill er vor Ihrem Vordermann einscheren. Dieser \u00E4rgert sich und \n\u201Emacht dicht\u201C. Was machen Sie?","Xe Pkw v\u01B0\u1EE3t m\u1ED9t c\u00E1ch b\u1EA5t c\u1EA9n \u201Eh\u00E0ng xe c\u1EE7a b\u1EA1n\u201C. Do xe ng\u01B0\u1EE3c chi\u1EC1u, anh ta mu\u1ED1n l\u00E1ch v\u00E0o ph\u00EDa tr\u01B0\u1EDBc xe \u0111ang \u0111i \u0111\u1EB1ng tr\u01B0\u1EDBc b\u1EA1n. Xe \u0111i tr\u01B0\u1EDBc b\u1EA1n t\u1EE9c gi\u1EADn v\u00E0 \u201Eph\u1EA3n \u1EE9ng\u201C. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich gebe nach und lasse den Vordr\u00E4ngler einscheren","T\u00F4i ch\u1EA5p nh\u1EADn v\u00E0 \u0111\u1EC3 k\u1EBB nh\u1EA3y h\u00E0ng l\u1EA1ng v\u00E0o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auch ich \u201Emache dicht\u201C, um dem Vordr\u00E4ngler einen Denkzettel zu\nverpassen","T\u00F4i c\u0169ng \u201Emache dicht\u201C, \u0111\u1EC3 d\u1EA1y cho k\u1EBB nh\u1EA3y h\u00E0ng m\u1ED9t b\u00E0i h\u1ECDc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nichts, denn ich bin davon nicht betroffen","Kh\u00F4ng l\u00E0m g\u00EC, v\u00EC t\u00F4i kh\u00F4ng b\u1ECB \u1EA3nh h\u01B0\u1EDFng g\u00EC")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.1.11-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(623);
	    	
	    	q.setName("2.1.11-113");

			q.setText(new TranslatedString("Vor Ihnen f\u00E4hrt ein Lastzug, der rechts blinkt. Hinter Ihnen dr\u00E4ngelt \nein ungeduldiger Pkw-Fahrer. Was k\u00F6nnen Sie tun?","Tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 m\u1ED9t xe t\u1EA3i \u0111ang nh\u00E1y xi-nhan ph\u1EA3i. Ph\u1EA3i sau b\u1EA1n c\u00F3 m\u1ED9t xe Pkw thi\u1EBFu ki\u00EAn nh\u1EABn \u0111ang h\u1ED1i th\u00FAc. B\u1EA1n c\u00F3 th\u1EC3 l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich \u00FCberhole erst, wenn ich selbst ganz sicher bin, dass die\nVerkehrslage das gefahrlose \u00DCberholen zul\u00E4sst","T\u00F4i v\u01B0\u1EE3t tr\u01B0\u1EDBc, khi t\u00F4i \u0111\u00E3 ch\u1EAFc ch\u1EAFn kh\u00F4ng c\u00F3 nguy hi\u1EC3m cho xe mu\u1ED1n v\u01B0\u1EE3t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich vergr\u00F6\u00DFere den Abstand zum Lastzug, um dem Dr\u00E4ngler das\n\u00DCberholen zu erleichtern","T\u00F4i t\u0103ng kho\u1EA3ng c\u00E1ch v\u1EDBi xe t\u1EA3i, \u0111\u1EC3 t\u1EA1o \u0111i\u1EC1u ki\u1EC7n d\u1EC5 d\u00E0ng h\u01A1n cho xe Pkw \u0111ang h\u1ED1i th\u00FAc ph\u00EDa sau")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich \u00FCberhole, weil ich vermute, dass mir der Lastwagenfahrer ein\nZeichen zum \u00DCberholen geben will","T\u00F4i v\u01B0\u1EE3t, v\u00EC t\u00F4i ngh\u0129 l\u00E0 t\u00E0i x\u1EBF xe t\u1EA3i mu\u1ED1n \u0111\u01B0a d\u1EA5u hi\u1EC7u cho ph\u00E9p v\u01B0\u1EE3t cho t\u00F4i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.02-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(624);
	    	
	    	q.setName("2.2.02-006");

			q.setText(new TranslatedString("Sie fahren au\u00DFerorts auf einer Stra\u00DFe mit drei markierten \nFahrstreifen in jeder Fahrtrichtung. Auf dem rechten Fahrstreifen \nfahren in gr\u00F6\u00DFeren Abst\u00E4nden einzelne, langsamere Fahrzeuge. \nWelchen Fahrstreifen d\u00FCrfen Sie durchg\u00E4ngig befahren?","B\u1EA1n \u0111i ngo\u00E0i th\u00E0nh ph\u1ED1 tr\u00EAn \u0111\u01B0\u1EDDng 3 l\u00E0n c\u00F3 k\u00FD hi\u1EC7u tr\u00EAn m\u1ED7i h\u01B0\u1EDBng \u0111i (t\u1ED5ng c\u1ED9ng 6 l\u00E0n). Tr\u00EAn l\u00E0n b\u00EAn ph\u1EA3i \u1EDF kho\u1EA3ng c\u00E1ch xa c\u00F3 v\u00E0i xe \u0111ang ch\u1EA1y ch\u1EADm.\nV\u1EADy b\u1EA1n \u0111\u01B0\u1EE3c ch\u1EA1y qua tr\u00EAn l\u00E0n n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Den mittleren","L\u00E0n gi\u1EEFa")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Den linken","L\u00E0n tr\u00E1i")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(625);
	    	
	    	q.setName("2.2.03-003");

			q.setText(new TranslatedString("F\u00FCr welche Kraftfahrzeuge gilt die Autobahn-Richtgeschwindigkeit?","V\u1EADn t\u1ED1c \u0111\u1EC1 ngh\u1ECB tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn \u0111\u01B0\u1EE3c \u00E1p d\u1EE5ng cho xe c\u01A1 gi\u1EDBi n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("F\u00FCr Pkw und Motorr\u00E4der","Cho xe Pkw v\u00E0 xe m\u00F4t\u00F4 hai b\u00E1nh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("F\u00FCr Lkw mit einer zul\u00E4ssigen Gesamtmasse von 2,5 t","Cho xe t\u1EA3i Lkw v\u1EDBi t\u1EA3i tr\u1ECDng cho ph\u00E9p l\u00E0 2,5 t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("F\u00FCr Lkw mit einer zul\u00E4ssigen Gesamtmasse von 6,0 t","Cho xe t\u1EA3i Lkw v\u1EDBi t\u1EA3i tr\u1ECDng cho ph\u00E9p l\u00E0 6,0 t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(626);
	    	
	    	q.setName("2.2.03-004");

			q.setText(new TranslatedString("Auf welchen Stra\u00DFen gilt die Richtgeschwindigkeit von 130 km/h?","Tr\u00EAn \u0111\u01B0\u1EDDng n\u00E0o \u00E1p d\u1EE5ng v\u1EADn t\u1ED1c \u0111\u1EC1 ngh\u1ECB l\u00E0 130 km/h?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Autobahnen","\u0110\u01B0\u1EDDng cao t\u1ED1c Autobahn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Stra\u00DFen au\u00DFerhalb geschlossener Ortschaften mit baulich\ngetrennten Fahrbahnen f\u00FCr jede Richtung","\u0110\u01B0\u1EDDng ngo\u1EA1i \u00F4 c\u00F3 con l\u01B0\u01A1n ph\u00E2n c\u00E1ch hai h\u01B0\u1EDBng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Stra\u00DFen au\u00DFerhalb geschlossener Ortschaften mit mindestens\nzwei markierten Fahrstreifen f\u00FCr jede Richtung","\u0110u\u1EDDng ngo\u1EA1i \u00F4 c\u00F3 \u00EDt nh\u1EA5t 2 v\u1EA1ch ph\u00E2n c\u00E1ch tr\u00EAn m\u1ED7i h\u01B0\u1EDBng ch\u1EA1y")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(627);
	    	
	    	q.setName("2.2.03-005");

			q.setText(new TranslatedString("Sie fahren bei Nebel auf der Autobahn und haben 50 m Sicht. Wie \nschnell d\u00FCrfen Sie h\u00F6chstens fahren?","B\u1EA1n l\u00E1i xe trong s\u01B0\u01A1ng m\u00F9 tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn v\u00E0 c\u00F3 t\u1EA7m nh\u00ECn xa 50m. T\u1ED1c \u0111\u1ED9 t\u1ED1i \u0111a \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EA1y l\u00E0 bao nhi\u00EAu?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("50 km/h","50 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("70 km/h","70 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("90 km/h","90 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(628);
	    	
	    	q.setName("2.2.03-006");

			q.setText(new TranslatedString("Sie fahren 100 km/h, haben 1 Sekunde Reaktionszeit und f\u00FChren \neine normale Bremsung durch. Wie lang ist der Anhalteweg nach \nder Faustformel? \n_____ m","B\u1EA1n \u0111ang ch\u1EA1y t\u1ED1c \u0111\u1ED9 100 km/h, c\u00F3 1 gi\u00E2y ph\u1EA3n \u1EE9ng v\u00E0 c\u00F3 th\u1EC3 phanh b\u00ECnh th\u01B0\u1EDDng.\nTheo c\u00F4ng th\u1EE9c th\u00EC kho\u1EA3ng c\u00E1ch d\u1EEBng l\u00E0 bao nhi\u00EAu m\u00E9t?\n#Note:\n<ul>\n<li><strong>Ch\u00FA \u00FD</strong>: C\u1EA7n ph\u00E2n bi\u1EC7t c\u00E1c thu\u1EADt ng\u1EEF v\u1EC1 kho\u1EA3ng c\u00E1ch</li>\n<li><strong>C\u00F4ng th\u1EE9c</strong>: Anhalteweg  = Reaktionsweg + Bremsweg</li>\n<li><strong>Bremsweg</strong>: kho\u1EA3ng c\u00E1ch phanh (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc \u0111\u1EA1p phanh \u0111\u1EBFn khi xe d\u1EEBng).<br/> C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)\u00B2</li>\n<li><strong>Reaktionsweg</strong>: kho\u1EA3ng c\u00E1ch ph\u1EA3n \u1EE9ng v\u1EDBi gi\u1EA3 x\u1EED t\u1ED1c \u0111\u1ED9 ph\u1EA3n \u1EE9ng l\u00E0 1 gi\u00E2y (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc nh\u1EADn th\u1EE9c nguy hi\u1EC3m \u0111\u1EBFn khi n\u00E3o b\u1ED9 ra l\u1EC7nh \u0111i\u1EC1u khi\u1EC3n \u0111\u1EA1p phanh). <br/>C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)x3</li>\n<li><strong>Anhalteweg</strong>: kho\u1EA3ng c\u00E1ch d\u1EEBng (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc nh\u1EADn th\u1EE9c nguy hi\u1EC3m \u0111\u1EBFn khi xe d\u1EEBng h\u1EB3n). <br/>C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)x3 + (V:10)\u00B2</li>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: \u1EDE \u0111\u00E2y V = 100 km/h. Suy ra Anhalteweg = (100:10)x3 + (100:10)\u00B2 = 130 m\u00E9t</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n130 m "), new TranslatedString("\n\n\n130 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(629);
	    	
	    	q.setName("2.2.03-007");

			q.setText(new TranslatedString("Sie fahren 100 km/h und f\u00FChren eine normale Bremsung durch. Wie \nlang ist der Bremsweg nach der Faustformel? \n_____ m","B\u1EA1n l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 100 km/h v\u00E0 c\u00F3 phanh b\u00ECnh th\u01B0\u1EDDng\nKho\u1EA3ng c\u00E1ch phanh (Bremsweg) l\u00E0 bao nhi\u00EAu?\n#Note:\n<ul>\n<li><strong>Bremsweg</strong>: kho\u1EA3ng c\u00E1ch phanh (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc \u0111\u1EA1p phanh \u0111\u1EBFn khi xe d\u1EEBng). N\u1EBFu kh\u00F4ng c\u00F3 ch\u00FA th\u00EDch g\u00EC th\u00EAm th\u00EC kho\u1EA3ng c\u00E1ch phanh \u0111\u01B0\u1EE3c hi\u1EC3u l\u00E0 kho\u1EA3ng c\u00E1ch phanh khi phanh b\u00ECnh th\u01B0\u1EDDng (c\u1EA7n ph\u00E2n bi\u1EC7t v\u1EDBi kho\u1EA3ng c\u00E1ch phanh khi phanh g\u1EA5p).\n<br/> C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)\u00B2</li><li><strong></strong>: </li>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: \u1EDE \u0111\u00E2y V = 100 km/h. \nSuy ra Bremsweg = (100:10)\u00B2 = 100 m\u00E9t</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n100 m "), new TranslatedString("\n\n\n100 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(630);
	    	
	    	q.setName("2.2.03-008");

			q.setText(new TranslatedString("Sie fahren 100 km/h und haben 1 Sekunde Reaktionszeit. Wie lang \nist der Reaktionsweg nach der Faustformel? \n_____ m","B\u1EA1n l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 100 km/h v\u00E0 c\u00F3 th\u1EDDi gian ph\u1EA3n \u1EE9ng l\u00E0 1 gi\u00E2y.\nKho\u1EA3ng c\u00E1ch ph\u1EA3n \u1EE9ng (Reaktionsweg) l\u00E0 bao nhi\u00EAu?\n#Note:\n<ul>\n<li><strong>Reaktionsweg</strong>: kho\u1EA3ng c\u00E1ch ph\u1EA3n \u1EE9ng v\u1EDBi gi\u1EA3 x\u1EED t\u1ED1c \u0111\u1ED9 ph\u1EA3n \u1EE9ng l\u00E0 1 gi\u00E2y (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc nh\u1EADn th\u1EE9c nguy hi\u1EC3m \u0111\u1EBFn khi n\u00E3o b\u1ED9 ra l\u1EC7nh \u0111i\u1EC1u khi\u1EC3n \u0111\u1EA1p phanh). <br/>C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)x3</li>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: \u1EDE \u0111\u00E2y V = 100 km/h. \nSuy ra Reaktionsweg = (100:10)x3 = 30 m\u00E9t</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n30 m "), new TranslatedString("\n\n\n30 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(631);
	    	
	    	q.setName("2.2.03-009");

			q.setText(new TranslatedString("Sie fahren 50 km/h, haben 1 Sekunde Reaktionszeit und f\u00FChren eine \nnormale Bremsung durch. Wie lang ist der Anhalteweg nach der \nFaustformel? \n_____ m","B\u1EA1n l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 50 km/h, c\u00F3 1 gi\u00E2y ph\u1EA3n \u1EE9ng v\u1EDBi phanh b\u00ECnh th\u01B0\u1EDDng.\nKho\u1EA3ng c\u00E1ch d\u1EEBng (Anhalteweg) l\u00E0 bao nhi\u00EAu?\n#Note:\n<ul>\n<li><strong>Ch\u00FA \u00FD</strong>: C\u1EA7n ph\u00E2n bi\u1EC7t c\u00E1c thu\u1EADt ng\u1EEF v\u1EC1 kho\u1EA3ng c\u00E1ch</li>\n<li><strong>C\u00F4ng th\u1EE9c</strong>: Anhalteweg  = Reaktionsweg + Bremsweg</li>\n<li><strong>Bremsweg</strong>: kho\u1EA3ng c\u00E1ch phanh (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc \u0111\u1EA1p phanh \u0111\u1EBFn khi xe d\u1EEBng).<br/> C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)\u00B2</li>\n<li><strong>Reaktionsweg</strong>: kho\u1EA3ng c\u00E1ch ph\u1EA3n \u1EE9ng v\u1EDBi gi\u1EA3 x\u1EED t\u1ED1c \u0111\u1ED9 ph\u1EA3n \u1EE9ng l\u00E0 1 gi\u00E2y (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc nh\u1EADn th\u1EE9c nguy hi\u1EC3m \u0111\u1EBFn khi n\u00E3o b\u1ED9 ra l\u1EC7nh \u0111i\u1EC1u khi\u1EC3n \u0111\u1EA1p phanh). <br/>C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)x3</li>\n<li><strong>Anhalteweg</strong>: kho\u1EA3ng c\u00E1ch d\u1EEBng (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc nh\u1EADn th\u1EE9c nguy hi\u1EC3m \u0111\u1EBFn khi xe d\u1EEBng h\u1EB3n). <br/>C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)x3 + (V:10)\u00B2</li>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: \u1EDE \u0111\u00E2y V = 50 km/h. Suy ra Anhalteweg = (50:10)x3 + (50:10)\u00B2 = 15+25 = 40 m\u00E9t</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n40 m "), new TranslatedString("\n\n\n40 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(632);
	    	
	    	q.setName("2.2.03-010");

			q.setText(new TranslatedString("Sie fahren 50 km/h und f\u00FChren eine normale Bremsung durch. Wie \nlang ist der Bremsweg nach der Faustformel? \n_____ m","B\u1EA1n l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 50 km/h v\u00E0 c\u00F3 phanh b\u00ECnh th\u01B0\u1EDDng\nKho\u1EA3ng c\u00E1ch phanh (Bremsweg) l\u00E0 bao nhi\u00EAu?\n#Note:\n<ul>\n<li><strong>Bremsweg</strong>: kho\u1EA3ng c\u00E1ch phanh (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc \u0111\u1EA1p phanh \u0111\u1EBFn khi xe d\u1EEBng). N\u1EBFu kh\u00F4ng c\u00F3 ch\u00FA th\u00EDch g\u00EC th\u00EAm th\u00EC kho\u1EA3ng c\u00E1ch phanh \u0111\u01B0\u1EE3c hi\u1EC3u l\u00E0 kho\u1EA3ng c\u00E1ch phanh khi phanh b\u00ECnh th\u01B0\u1EDDng (c\u1EA7n ph\u00E2n bi\u1EC7t v\u1EDBi kho\u1EA3ng c\u00E1ch phanh khi phanh g\u1EA5p).\n<br/> C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)\u00B2</li><li><strong></strong>: </li>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: \u1EDE \u0111\u00E2y V = 50 km/h. \nSuy ra Bremsweg = (50:10)\u00B2 = 25 m\u00E9t</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n25 m "), new TranslatedString("\n\n\n25 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-011
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(633);
	    	
	    	q.setName("2.2.03-011");

			q.setText(new TranslatedString("Sie fahren 50 km/h und haben 1 Sekunde Reaktionszeit. Wie lang \nist der Reaktionsweg nach der Faustformel? \n_____ m","B\u1EA1n l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 50 km/h v\u00E0 c\u00F3 th\u1EDDi gian ph\u1EA3n \u1EE9ng l\u00E0 1 gi\u00E2y.\nKho\u1EA3ng c\u00E1ch ph\u1EA3n \u1EE9ng (Reaktionsweg) l\u00E0 bao nhi\u00EAu?\n#Note:\n<ul>\n<li><strong>Reaktionsweg</strong>: kho\u1EA3ng c\u00E1ch ph\u1EA3n \u1EE9ng v\u1EDBi gi\u1EA3 x\u1EED t\u1ED1c \u0111\u1ED9 ph\u1EA3n \u1EE9ng l\u00E0 1 gi\u00E2y (kho\u1EA3ng c\u00E1ch t\u1EEB l\u00FAc nh\u1EADn th\u1EE9c nguy hi\u1EC3m \u0111\u1EBFn khi n\u00E3o b\u1ED9 ra l\u1EC7nh \u0111i\u1EC1u khi\u1EC3n \u0111\u1EA1p phanh). <br/>C\u00F4ng th\u1EE9c t\u00EDnh: (V:10)x3</li>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: \u1EDE \u0111\u00E2y V = 50 km/h. \nSuy ra Reaktionsweg = (50:10)x3 = 15 m\u00E9t</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n15 m "), new TranslatedString("\n\n\n15 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-012
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(634);
	    	
	    	q.setName("2.2.03-012");

			q.setText(new TranslatedString("Sie fahren auf einer sehr schmalen Stra\u00DFe und haben 50 m \nSichtweite. Wie lang darf Ihr Anhalteweg h\u00F6chstens sein? \n_____ m","B\u1EA1n \u0111i tr\u00EAn \u0111\u01B0\u1EDDng h\u1EB9p v\u00E0 c\u00F3 t\u1EA7m nh\u00ECn xa 50 m. Kho\u1EA3ng c\u00E1ch d\u1EEBng cao nh\u1EA5t \u0111\u01B0\u1EE3c ph\u00E9p l\u00E0 bao nhi\u00EAu?\n#Note:\n<ul>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: N\u1EBFu \u0111\u01B0\u1EDDng r\u1EA5t h\u1EB9p v\u00E0 c\u00F3 t\u1EA7m nh\u00ECn xa ng\u1EAFn th\u00EC c\u00F3 nguy c\u01A1 \u0111\u1EE5ng ph\u1EA3i xe ng\u01B0\u1EE3c chi\u1EC1u n\u1EBFu \u0111i qu\u00E1 nhanh. V\u1EADy kho\u1EA3ng c\u00E1ch d\u1EEBng cho ph\u00E9p b\u1EB1ng t\u1EA7m nh\u00ECn xa chia \u0111\u00F4i cho m\u1ED7i chi\u1EC1u l\u00E0 25m</li>\n</ul>\n#Hint:\nPh\u1EA3i t\u00EDnh c\u1EA3 hai chi\u1EC1u"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n25 m "), new TranslatedString("\n\n\n25 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-013
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(635);
	    	
	    	q.setName("2.2.03-013");

			q.setText(new TranslatedString("Sie fahren bei guter Sicht auf einer gut ausgebauten Stra\u00DFe. \nInnerhalb welcher Strecke m\u00FCssen Sie sp\u00E4testens anhalten \nk\u00F6nnen? \nInnerhalb der","B\u1EA1n \u0111i xe tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 t\u1EA7m nh\u00ECn xa t\u1ED1t v\u00E0 ch\u1EA5t l\u01B0\u1EE3ng \u0111\u01B0\u1EDDng t\u1ED1t.\nTrong \u0111o\u1EA1n n\u00E0o b\u1EA1n c\u00F3 th\u1EC3 d\u1EEBng tr\u1EC5 nh\u1EA5t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Sichtweite","Trong t\u1EA7m nh\u00ECn xa")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 doppelten Strecke der Sichtweite","Trong kho\u1EA3ng g\u1EA5p \u0111\u00F4i t\u1EA7m nh\u00ECn xa")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-014
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(636);
	    	
	    	q.setName("2.2.03-014");

			q.setText(new TranslatedString("Sie fahren bei Nacht mit Abblendlicht auf einer gut ausgebauten \nLandstra\u00DFe. Innerhalb welcher Strecke m\u00FCssen Sie sp\u00E4testens \nanhalten k\u00F6nnen? \nInnerhalb der Reichweite des","Sie fahren bei Nacht mit Abblendlicht auf einer gut ausgebauten\nLandstra\u00DFe. Innerhalb welcher Strecke m\u00FCssen Sie sp\u00E4testens\nanhalten k\u00F6nnen?\nInnerhalb der Reichweite des"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Abblendlichts","\u2013 Abblendlichts")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 Fernlichts","\u2013 Fernlichts")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-015
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(637);
	    	
	    	q.setName("2.2.03-015");

			q.setText(new TranslatedString("Wie lautet die Faustformel, um den Bremsweg einer \nGefahrbremsung auf ebener, trockener und asphaltierter Fahrbahn \nauszurechnen?","C\u00F4ng th\u1EE9c t\u00EDnh kho\u1EA3ng c\u00E1ch phanh khi phanh g\u1EA5p tr\u00EAn \u0111\u01B0\u1EDDng nh\u1EF1a b\u1EB1ng ph\u1EB3ng v\u00E0 kh\u00F4?\n#Note:\n<ul>\n<li><strong>ebener</strong>: b\u1EB1ng ph\u1EB3ng</li>\n<li><strong>trockener</strong>: kh\u00F4</li>\n<li><strong>asphaltierter</strong>: nh\u1EF1a \u0111\u01B0\u1EDDng</li>\n<li><strong>Ch\u00FA \u00FD</strong>: Kho\u1EA3ng c\u00E1ch phanh khi phanh g\u1EA5p b\u1EB1ng 1/2 kho\u1EA3ng c\u00E1ch phanh b\u00ECnh th\u01B0\u1EDDng. Xem th\u00EAm <a href=\"http://www.fuehrerschein-lernsystem.de/lernen/faustformeln.html\" target=\"_blank\">fuehrerschein-lernsystem.de</a></li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.2.03-015.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("$esc.java($quiz.answerA)","$esc.java($quiz.translatedAnswerA)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("$esc.java($quiz.answerB)","$esc.java($quiz.translatedAnswerB)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("$esc.java($quiz.answerC)","$esc.java($quiz.translatedAnswerC)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-016
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(638);
	    	
	    	q.setName("2.2.03-016");

			q.setText(new TranslatedString("Sie fahren 40 km/h. Bei einer Gefahrbremsung betr\u00E4gt der \nBremsweg ca. 8 Meter. Wie lang ist der Bremsweg unter sonst \ngleichen Bedingungen bei 50 km/h?","B\u1EA1n l\u00E1i xe v\u1EDBi v\u1EADn t\u1ED1c 40 km/h. Khi phanh g\u1EA5p l\u00FAc g\u1EB7p nguy hi\u1EC3m, kho\u1EA3ng c\u00E1ch phanh l\u00E0 kho\u1EA3ng 8 m\u00E9t. \n\u1EDE c\u00F9ng \u0111i\u1EC1u ki\u1EC7n nh\u01B0 v\u1EADy, kho\u1EA3ng c\u00E1ch phanh l\u00E0 bao nhi\u00EAu n\u1EBFu v\u1EADn t\u1ED1c l\u00E0 50 km/h?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("12,5 m","12,5 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("11,0 m","11,0 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("9,5 m","9,5 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(639);
	    	
	    	q.setName("2.2.03-101");

			q.setText(new TranslatedString("Wie schnell darf ein Kraftfahrzeug mit Schneeketten h\u00F6chstens \nfahren? \n_____ km/h","T\u1ED1c \u0111\u1ED9 t\u1ED1i \u0111a c\u1EE7a xe c\u01A1 gi\u1EDBi c\u00F3 g\u1EAFn x\u00EDch \u0111i tuy\u1EBFt?\n#Note:\n<ul>\n<li><strong>Xe g\u1EAFn x\u00EDch \u0111i tuy\u1EBFt ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i nhanh nh\u1EA5t l\u00E0 50 km/h</strong></li>\n</ul>\n#Hint:\nM\u1EB9o \u0111\u1EC3 nh\u1EDB: t\u1ED1c \u0111\u1ED9 xe g\u1EAFn x\u00EDch \u0111i tuy\u1EBFt th\u00EC gi\u1ED1ng nh\u01B0 t\u1ED1c \u0111\u1ED9 b\u00ECnh th\u01B0\u1EDDng trong th\u00E0nh ph\u1ED1"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n50 km/h "), new TranslatedString("\n\n\n50 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(640);
	    	
	    	q.setName("2.2.03-102");

			q.setText(new TranslatedString("Wie schnell d\u00FCrfen Sie mit einem Lkw mit einer zul\u00E4ssigen \nGesamtmasse von 3,0 t mit Anh\u00E4nger au\u00DFerorts auf Landstra\u00DFen \nh\u00F6chstens fahren? \n_____ km/h","Xe Lkw c\u00F3 t\u1EA3i tr\u1ECDng 3,0 t c\u00F3 k\u00E9o theo r\u01A1-mooc \u0111\u01B0\u1EE3c ch\u1EA1y t\u1ED1i \u0111a bao nhi\u00EAu Km/h tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe ngo\u00E0i khu v\u1EF1c \u0111\u00F4 th\u1ECB?\n#Note:\n<ul>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: 80 km/h</li>\n</ul>\n#Hint:\nC\u1EE9 k\u00E9o r\u01A1-mooc th\u00EC t\u1ED1c \u0111\u1ED9 l\u00E0 80 km/h, kh\u00F4ng c\u00F3 th\u00EC l\u00E0 100 km/h"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n80 km/h "), new TranslatedString("\n\n\n80 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(641);
	    	
	    	q.setName("2.2.03-103");

			q.setText(new TranslatedString("Wie schnell d\u00FCrfen Sie mit einem Pkw und einem Anh\u00E4nger \nau\u00DFerorts auf Landstra\u00DFen h\u00F6chstens fahren? \n_____ km/h","Xe Pkw c\u00F3 t\u1EA3i tr\u1ECDng 3,0 t c\u00F3 k\u00E9o theo r\u01A1-mooc \u0111\u01B0\u1EE3c ch\u1EA1y t\u1ED1i \u0111a bao nhi\u00EAu Km/h tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe ngo\u00E0i khu v\u1EF1c \u0111\u00F4 th\u1ECB?\n#Note:\n<ul>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: 80 km/h</li>\n<li><strong>Ch\u00FA \u00FD</strong>: D\u00F9 l\u00E0 xe t\u1EA3i Lkw hay xe Pkw n\u1EBFu k\u00E9o r\u01A1-mooc th\u00EC ch\u1EC9 \u0111\u01B0\u1EE3c \u0111i t\u1ED1i \u0111a 80 km/h b\u00EAn ngo\u00E0i khu \u0111\u00F4 th\u1ECB tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n80 km/h "), new TranslatedString("\n\n\n80 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(642);
	    	
	    	q.setName("2.2.03-104");

			q.setText(new TranslatedString("Wie schnell d\u00FCrfen Sie mit einem Pkw au\u00DFerhalb geschlossener \nOrtschaften auf Stra\u00DFen mit einem Fahrstreifen f\u00FCr jede Richtung \nh\u00F6chstens fahren? \n_____ km/h","Xe Pkw ngo\u00E0i khu d\u00E2n c\u01B0 ch\u1EA1y tr\u00EAn \u0111\u01B0\u1EDDng ch\u1EC9 c\u00F3 1 l\u00E0n cho m\u1ED7i h\u01B0\u1EDBng ch\u1EA1y th\u00EC \u0111\u01B0\u1EE3c ch\u1EA1y t\u1ED1i \u0111a bao nhi\u00EAu km/h?\n#Note:\n<ul>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: 100 km/h</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n100 km/h "), new TranslatedString("\n\n\n100 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(643);
	    	
	    	q.setName("2.2.03-105");

			q.setText(new TranslatedString("Wie schnell d\u00FCrfen Sie mit einem Lkw mit einer zul\u00E4ssigen \nGesamtmasse von 3,0 t au\u00DFerhalb geschlossener Ortschaften auf \nStra\u00DFen mit einem Fahrstreifen f\u00FCr jede Richtung h\u00F6chstens \nfahren? \n_____ km/h","Xe t\u1EA3i c\u00F3 t\u1EA3i tr\u1ECDng 3,0 t \u1EDF ngo\u00E0i khu \u0111\u00F4 th\u1ECB tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 1 l\u00E0n cho m\u1ED7i h\u01B0\u1EDBng ch\u1EA1y th\u00EC \u0111\u01B0\u1EE3c \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 t\u1ED1i \u0111a bao nhi\u00EAu km/h?\n#Note:\n<ul>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: 100 km/h (c\u0169ng gi\u1ED1ng nh\u01B0 xe Pkw)</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n100 km/h "), new TranslatedString("\n\n\n100 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(644);
	    	
	    	q.setName("2.2.03-106");

			q.setText(new TranslatedString("Wie schnell darf ein Lkw mit einer zul\u00E4ssigen Gesamtmasse von 3,0 \nt und einem Anh\u00E4nger auf Autobahnen h\u00F6chstens fahren? \n_____ km/h","Xe t\u1EA3i Lkw t\u1EA3i tr\u1ECDng 3,0 t c\u00F3 k\u00E9o r\u01A1-mooc \u0111i ngo\u00E0i \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn \u0111\u01B0\u1EE3c ch\u1EA1y t\u1ED1i \u0111a bao nhi\u00EAu km/h?\n#Note:\n<ul>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: 80 km/h (c\u0169ng gi\u1ED1ng nh\u01B0 tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe, t\u00F3m l\u1EA1i c\u1EE9 k\u00E9o r\u01A1-mooc l\u00E0 80 km/h)</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n80 km/h "), new TranslatedString("\n\n\n80 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.03-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(645);
	    	
	    	q.setName("2.2.03-107");

			q.setText(new TranslatedString("Was muss man beim Fahren mit Winterreifen (M+S) besonders \nbeachten?","B\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD g\u00EC khi l\u00E1i xe v\u1EDBi l\u1ED1p m\u00F9a \u0111\u00F4ng (M+S)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die f\u00FCr diese Reifen zul\u00E4ssige H\u00F6chstgeschwindigkeit darf nicht\n\u00FCberschritten werden","Kh\u00F4ng \u0111\u01B0\u1EE3c l\u00E1i nhanh qu\u00E1 t\u1ED1c \u0111\u1ED9 cho ph\u00E9p c\u1EE7a l\u1ED1p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Man darf h\u00F6chstens 80 km/h fahren","\u0110\u01B0\u1EE3c ph\u00E9p l\u00E1i nhanh nh\u1EA5t l\u00E0 80 km/h")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Es gilt die f\u00FCr Pkw mit Schneeketten zul\u00E4ssige H\u00F6chstgeschwindigkeit","C\u00F3 qui \u0111\u1ECBnh v\u1EC1 t\u1ED1c \u0111\u1ED9 cho ph\u00E9p \u0111\u1ED1i v\u1EDBi xe Pkw c\u00F3 g\u1EAFn x\u00EDch \u0111i tuy\u1EBFt m\u00E0 th\u00F4i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.04-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(646);
	    	
	    	q.setName("2.2.04-001");

			q.setText(new TranslatedString("Sie fahren mit 80 km/h hinter einem Auto her. Welchen \nSicherheitsabstand m\u00FCssen Sie mindestens einhalten?","B\u1EA1n ch\u1EA1y t\u1ED1c \u0111\u1ED9 80 km/h sau m\u1ED9t xe \u00F4-t\u00F4 kh\u00E1c. Kho\u1EA3ng c\u00E1ch an to\u00E0n t\u1ED1i thi\u1EC3u ph\u1EA3i gi\u1EEF l\u00E0 bao nhi\u00EAu?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Einen \u201EZwei-Sekunden-Abstand\u201C","\u201EKho\u1EA3ng c\u00E1ch 2 gi\u00E2y\u201C")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Einen \u201EEin-Sekunden-Abstand\u201C","\u201EKho\u1EA3ng c\u00E1ch 1 gi\u00E2y\u201C")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Einen Abstand von 15 Metern","Kho\u1EA3ng c\u00E1ch 15 m\u00E9t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.04-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(647);
	    	
	    	q.setName("2.2.04-002");

			q.setText(new TranslatedString("Sie fahren im Stadtverkehr auf trockener Fahrbahn in einer \nKolonne, die sich mit einer Geschwindigkeit von 50 km/h bewegt. \nWelchen Sicherheitsabstand zum vorausfahrenden Fahrzeug \nm\u00FCssen Sie mindestens einhalten?","B\u1EA1n l\u00E1i xe trong th\u00E0nh ph\u1ED1 tr\u00EAn \u0111\u01B0\u1EDDng kh\u00F4 theo m\u1ED9t h\u00E0ng xe \u0111ang di chuy\u1EC3n v\u1EDBi t\u1ED1c \u0111\u1ED9 50 km/h. Kho\u1EA3ng c\u00E1ch an to\u00E0n v\u1EDBi xe ph\u00EDa tr\u01B0\u1EDBc t\u1ED1i thi\u1EC3u ph\u1EA3i l\u00E0 bao nhi\u00EAu?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("15 m entsprechend etwa 3 Pkw-L\u00E4ngen","15 m t\u01B0\u01A1ng \u0111\u01B0\u01A1ng chi\u1EC1u d\u00E0i c\u1EE7a 3 xe Pkw")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("10 m entsprechend etwa 2 Pkw-L\u00E4ngen","10 m t\u01B0\u01A1ng \u0111\u01B0\u01A1ng chi\u1EC1u d\u00E0i c\u1EE7a 2 xe Pkw")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("5 m entsprechend etwa 1 Pkw-L\u00E4nge","5 m t\u01B0\u01A1ng \u0111\u01B0\u01A1ng chi\u1EC1u d\u00E0i c\u1EE7a 1 xe Pkw")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.04-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(648);
	    	
	    	q.setName("2.2.04-003");

			q.setText(new TranslatedString("Welcher Abstand zum vorausfahrenden Fahrzeug soll au\u00DFerhalb \ngeschlossener Ortschaften in der Regel mindestens eingehalten \nwerden?","Kho\u1EA3ng c\u00E1ch an to\u00E0n \u1EDF b\u00EAn ngo\u00E0i khu \u0111\u00F4 th\u1ECB v\u1EC1 nguy\u00EAn t\u1EAFc t\u1ED1i thi\u1EC3u ph\u1EA3i l\u00E0 bao nhi\u00EAu?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("1/2 der Tachoanzeige in Metern","1/2 t\u1ED1c \u0111\u1ED9 tr\u00EAn \u0111\u1ED3ng h\u1ED3 t\u00EDnh theo m\u00E9t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("1/5 der Tachoanzeige in Metern","1/5 t\u1ED1c \u0111\u1ED9 tr\u00EAn \u0111\u1ED3ng h\u1ED3 t\u00EDnh theo m\u00E9t")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.04-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(649);
	    	
	    	q.setName("2.2.04-101");

			q.setText(new TranslatedString("Sie fahren mit Ihrem Pkw und Wohnanh\u00E4nger (Zugl\u00E4nge mehr als 7 \nm) au\u00DFerorts auf einer Stra\u00DFe mit nur einem Fahrstreifen f\u00FCr jede \nRichtung. Worauf m\u00FCssen Sie achten?","B\u1EA1n l\u00E1i xe Pkw c\u00F3 nh\u00E0 di \u0111\u1ED9ng (chi\u1EC1u d\u00E0i xe h\u01A1n 7m) b\u00EAn ngo\u00E0i khu \u0111\u00F4 th\u1ECB tr\u00EAn \u0111\u01B0\u1EDDng 1 l\u00E0n cho m\u1ED7i h\u01B0\u1EDBng. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Abstand zum Vorausfahrenden muss in der Regel so gro\u00DF sein,\ndass ein \u00DCberholender einscheren kann","Kho\u1EA3ng c\u00E1ch v\u1EDBi xe \u0111i tr\u01B0\u1EDBc ph\u1EA3i l\u1EDBn \u0111\u1EC3 xe v\u01B0\u1EE3t c\u00F3 th\u1EC3 quay ng\u01B0\u1EE3c v\u00E0o l\u00E0n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Abstand zum Vorausfahrenden darf nicht gr\u00F6\u00DFer als Ihre\nZugl\u00E4nge sein, um den Verkehrsraum auszunutzen","Kho\u1EA3ng c\u00E1ch v\u1EDBi xe \u0111i tr\u01B0\u1EDBc kh\u00F4ng l\u1EDBn h\u01A1n chi\u1EC1u d\u00E0i \u0111\u1EC3 t\u1EADn d\u1EE5ng kh\u00F4ng gian giao th\u00F4ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Geschwindigkeit von 60 km/h d\u00FCrfen Sie nicht \u00FCberschreiten","Kh\u00F4ng \u0111\u01B0\u1EE3c \u0111i nhanh qu\u00E1 60 km/h")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.04-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(650);
	    	
	    	q.setName("2.2.04-102");

			q.setText(new TranslatedString("Wann muss ein Pkw mit Anh\u00E4nger au\u00DFerorts auf Stra\u00DFen mit nur \neinem Fahrstreifen f\u00FCr jede Richtung vom Vorausfahrenden einen \nso gro\u00DFen Abstand halten, dass ein \u00DCberholer einscheren kann? \nBei einer Zugl\u00E4nge \u00FCber _____ m","Khi n\u00E0o th\u00EC xe Pkw c\u00F3 r\u01A1-mooc \u1EDF khu v\u1EF1c ngo\u1EA1i \u00F4 tr\u00EAn \u0111\u01B0\u1EDDng 1 l\u00E0n cho m\u1ED7i b\u00EAn ph\u1EA3i gi\u1EEF kho\u1EA3ng c\u00E1ch an to\u00E0n l\u1EDBn \u0111\u1EC3 xe v\u01B0\u1EE3t c\u00F3 th\u1EC3 quay v\u00E0o l\u00E0n?\n#Note:\n<ul>\n<li><strong>L\u1EDDi gi\u1EA3i</strong>: \u0110\u1ED1i v\u1EDBi xe d\u00E0i h\u01A1n 7m</li>\n</ul>\n#Hint:\n7m"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\nBei einer Zugl\u00C3\u0192\u00C2\u00A4nge \u00C3\u0192\u00C2\u00BCber 7 m "), new TranslatedString("\n\n\nBei einer Zugl\u00C3\u0192\u00C2\u00A4nge \u00C3\u0192\u00C2\u00BCber 7 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.05-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(651);
	    	
	    	q.setName("2.2.05-001");

			q.setText(new TranslatedString("Sie fahren auf einer Landstra\u00DFe und wollen einen Pkw \u00FCberholen. \nWo muss das \u00DCberholen sp\u00E4testens beendet sein?","B\u1EA1n \u0111i tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe v\u00E0 mu\u1ED1n v\u01B0\u1EE3t m\u1ED9t xe Pkw.\nCh\u1ED7 n\u00E0o ph\u1EA3i k\u1EBFt th\u00FAc qu\u00E1 tr\u00ECnh v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Beginn einer durchgezogenen Linie\n(Fahrstreifenbegrenzung)","Tr\u01B0\u1EDBc \u0111i\u1EC3m b\u1EAFt \u0111\u1EA7u v\u1EA1ch ph\u00E2n c\u00E1ch li\u1EC1n n\u00E9t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor einem \u00DCberholverbotszeichen","Tr\u01B0\u1EDBc bi\u1EC3n c\u1EA5m v\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor dem Beginn einer Leitlinie","Tr\u01B0\u1EDBc \u0111i\u1EC3m b\u1EAFt \u0111\u1EA7u v\u1EA1ch Leitlinie <img src=\"http://www.fahrschule-reichel.com/uploads/RTEmagicC_9a3c20880b.jpg.jpg\"/>")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.05-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(652);
	    	
	    	q.setName("2.2.05-002");

			q.setText(new TranslatedString("Sie fahren mit 100 km/h auf einer Landstra\u00DFe. Vor Ihnen f\u00E4hrt ein \nLkw mit 70 km/h. Wie weit m\u00FCssen Sie bei Beginn eines \n\u00DCberholvorgangs von einer Stra\u00DFenkuppe mindestens noch \nentfernt sein?","B\u1EA1n ch\u1EA1y t\u1ED1c \u0111\u1ED9 100 km/h tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe. Tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 1 xe t\u1EA3i Lkw Lkw ch\u1EA1y t\u1ED1c \u0111\u1ED9 70 km/h. \nWie weit m\u00FCssen Sie bei Beginn eines \u00DCberholvorgangs von einer Stra\u00DFenkuppe mindestens noch entfernt sein?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("800 m","800 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("200 m","200 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("400 m","400 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.05-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(653);
	    	
	    	q.setName("2.2.05-101");

			q.setText(new TranslatedString("Hinter einem Lkw hat sich eine Pkw-Kolonne gebildet. Welcher Pkw \nsollte zuerst \u00FCberholen?","Ph\u00EDa sau m\u1ED9t xe t\u1EA3i Lkw l\u00E0 m\u1ED9t h\u00E0ng xe Pkw. Xe Pkw n\u00E0o \u0111\u01B0\u1EE3c v\u01B0\u1EE3t tr\u01B0\u1EDBc?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der erste Pkw hinter dem Lkw","Xe Pkw \u0111\u1EA7u ti\u00EAn ph\u00EDa sau xe t\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der letzte Pkw der Fahrzeugkolonne","Xe Pkw cu\u1ED1i c\u00F9ng c\u1EE7a h\u00E0ng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.07-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(654);
	    	
	    	q.setName("2.2.07-002");

			q.setText(new TranslatedString("F\u00FCr welche Kraftfahrzeuge gilt innerorts die freie Fahrstreifenwahl? \nF\u00FCr alle Kraftfahrzeuge bis _____ t zul\u00E4ssiger Gesamtmasse","Xe c\u00F3 \u0111\u1ED9ng c\u01A1 n\u00E0o trong th\u00E0nh ph\u1ED1 \u0111\u01B0\u1EE3c t\u1EF1 do ch\u1ECDn ki\u1EC3u l\u1ED1p?\nT\u1EA5t c\u1EA3 c\u00E1c xe c\u00F3 t\u1EA3i tr\u1ECDng cho ph\u00E9p t\u1ED1i \u0111a ____ t\u1EA5n\n#Note:\n<ul>\n<li><strong>Ch\u00FA \u00FD</strong>: Xe nh\u1ECF h\u01A1n 3,5 t\u1EA5n \u0111\u01B0\u1EE3c th\u1ECFai m\u00E1i ch\u1ECDn ki\u1EC3u l\u1ED1p</li>\n</ul>\n#Hint:\nL\u00E0 s\u1ED1 con d\u00EA \u0111\u00F3! Con d\u00EA th\u00EC ch\u1ECDn l\u1ED1p n\u00E0o c\u0169ng \u0111\u01B0\u1EE3c."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\nF\u00C3\u0192\u00C2\u00BCr alle Kraftfahrzeuge bis 3,5 t zul\u00C3\u0192\u00C2\u00A4ssiger Gesamtmasse "), new TranslatedString("\n\n\nF\u00C3\u0192\u00C2\u00BCr alle Kraftfahrzeuge bis 3,5 t zul\u00C3\u0192\u00C2\u00A4ssiger Gesamtmasse ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.09-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(655);
	    	
	    	q.setName("2.2.09-001");

			q.setText(new TranslatedString("Wo ist das Wenden verboten?","\u1EDE \u0111\u00E2u c\u1EA5m kh\u00F4ng \u0111\u01B0\u1EE3c v\u00F2ng xe l\u1EA1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Autobahnen","Tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Kraftfahrstra\u00DFen","Tr\u00EAn \u0111\u01B0\u1EDDng d\u00E0nh cho xe c\u01A1 gi\u1EDBi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf Feld- oder Waldwegen","Tr\u00EAn \u0111\u01B0\u1EDDng ru\u1ED9ng v\u00E0 \u0111\u01B0\u1EDDng r\u1EEBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(656);
	    	
	    	q.setName("2.2.12-001");

			q.setText(new TranslatedString("Wo ist das Halten verboten?","N\u01A1i n\u00E0o b\u1ECB c\u1EA5m d\u1EEBng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Autobahnen und Kraftfahrstra\u00DFen au\u00DFerhalb der Parkpl\u00E4tze","Tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn v\u00E0 \u0111\u01B0\u1EDDng d\u00E0nh cho xe c\u01A1 gi\u1EDBi b\u00EAn ngo\u00E0i c\u00E1c b\u00E3i \u0111\u1EADu xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Im Bereich von scharfen Kurven","Trong khu v\u1EF1c c\u00F3 kh\u00FAc cua g\u1EAFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An Bus-Haltestellen","\u1EDE tr\u1EA1m xe bus")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(657);
	    	
	    	q.setName("2.2.12-002");

			q.setText(new TranslatedString("In welchen F\u00E4llen d\u00FCrfen Sie auf dem rechten Fahrstreifen nicht \nparken?","Trong tr\u01B0\u1EDDng h\u1EE3p n\u00E0o b\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c \u0111\u1EADu xe b\u00EAn l\u1EC1 ph\u1EA3i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn rechts ein geeigneter Seitenstreifen vorhanden ist","Wenn rechts ein geeigneter Seitenstreifen vorhanden ist")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn zwischen Ihrem Fahrzeug und der Fahrstreifenbegrenzung\nnicht mindestens 3 m frei bleiben","Khi kho\u1EA3ng c\u00E1ch gi\u1EEFa xe v\u00E0 r\u00ECa \u0111\u01B0\u1EDDng kh\u00F4ng \u0111\u1EE7 3m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn dort Schienen verlegt sind","Khi \u1EDF \u0111\u00F3 c\u00F3 \u0111\u01B0\u1EDDng ray \u0111i qua")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(658);
	    	
	    	q.setName("2.2.12-003");

			q.setText(new TranslatedString("Wo ist das Parken verboten?","Wo ist das Parken verboten?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf schmalen Fahrbahnen gegen\u00FCber Ein- und Ausfahrten von\nGrundst\u00FCcken","Auf schmalen Fahrbahnen gegen\u00FCber Ein- und Ausfahrten von\nGrundst\u00FCcken")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Taxenst\u00E4nden","An Taxenst\u00E4nden")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unmittelbar hinter Fu\u00DFg\u00E4nger\u00FCberwegen","Unmittelbar hinter Fu\u00DFg\u00E4nger\u00FCberwegen")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(659);
	    	
	    	q.setName("2.2.12-004");

			q.setText(new TranslatedString("Sie wollen am rechten Fahrbahnrand parken. Wie gro\u00DF muss der \nAbstand zwischen Ihrem Fahrzeug und der Fahrstreifenbegrenzung \nmindestens sein? \n_____ m","Sie wollen am rechten Fahrbahnrand parken. Wie gro\u00DF muss der\nAbstand zwischen Ihrem Fahrzeug und der Fahrstreifenbegrenzung\nmindestens sein?\n_____ m\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n3 m "), new TranslatedString("\n\n\n3 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(660);
	    	
	    	q.setName("2.2.12-101");

			q.setText(new TranslatedString("Beide Pkw wollen hier parken. Wer hat Vorrang?","C\u1EA3 hai xe \u0111ang mu\u1ED1n \u0111\u1EADu. Ai c\u00F3 quy\u1EC1n \u01B0u ti\u00EAn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.2.12-101.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der rote Pkw","Xe Pkw m\u00E0u \u0111\u1ECF")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der wei\u00DFe Pkw","Xe Pkw m\u00E0u tr\u1EAFng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(661);
	    	
	    	q.setName("2.2.12-102");

			q.setText(new TranslatedString("Bis zu welcher zul\u00E4ssigen Gesamtmasse d\u00FCrfen Fahrzeuge auf \nbesonders gekennzeichneten Gehwegen geparkt werden? \n_____ t","T\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p t\u1ED1i \u0111a l\u00E0 bao nhi\u00EAu khi xe mu\u1ED1n \u0111\u1EADu tr\u00EAn ph\u1EA7n \u0111\u01B0\u1EDDng \u0111i b\u1ED9 v\u1EDBi bi\u1EC3n k\u00FD hi\u1EC7u \u0111\u1EB7c bi\u1EC7t?\n#Note:\n#Hint:\nCon s\u1ED1 n\u00E0y ch\u00EDnh l\u00E0 ng\u00E0y sinh c\u1EE7a m\u00ECnh m\u00E0 c\u00F3 d\u1EA5u ph\u1EA9y \u1EDF gi\u1EEFa"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n2,8 t "), new TranslatedString("\n\n\n2,8 t ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(662);
	    	
	    	q.setName("2.2.12-103");

			q.setText(new TranslatedString("Vor welchen Zeichen d\u00FCrfen Sie nicht mit weniger als 10 m Abstand \nhalten, wenn diese durch Ihr Fahrzeug verdeckt w\u00FCrden?","Tr\u01B0\u1EDBc bi\u1EC3n b\u00E1o n\u00E0o b\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p gi\u1EEF kho\u1EA3ng c\u00E1ch g\u1EA7n h\u01A1n 10m v\u00EC nh\u01B0 th\u1EBF s\u1EBD b\u1ECB xe b\u1EA1n che khu\u1EA5t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Andreaskreuz","D\u1EA5u ch\u00E9o Andreaskreuz")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Halt! Vorfahrt gew\u00E4hren!","D\u1EEBng l\u1EA1i! Nh\u01B0\u1EDDng quy\u1EC1n \u01B0u ti\u00EAn!")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Haltverbot","C\u1EA5m d\u1EEBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(663);
	    	
	    	q.setName("2.2.12-104");

			q.setText(new TranslatedString("Welchen Mindestabstand von einer Ampel muss ein Fahrzeug beim \nHalten einhalten, wenn diese durch das Fahrzeug verdeckt w\u00FCrde? \n_____ m","Kho\u1EA3ng c\u00E1ch t\u1ED1i thi\u1EC3u \u0111\u1EBFn c\u1ED9t \u0111\u00E8n m\u00E0 m\u1ED9t xe ph\u1EA3i gi\u1EEF khi c\u1ED9t \u0111\u00E8n b\u1ECB xe \u0111\u00F3 che khu\u1EA5t?\n#Note:\n#Hint:\nD\u00E0i t\u1EDBi 10m"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n10 m "), new TranslatedString("\n\n\n10 m ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(664);
	    	
	    	q.setName("2.2.12-105");

			q.setText(new TranslatedString("Wo d\u00FCrfen Sie innerorts einen Anh\u00E4nger mit einer zul\u00E4ssigen \nGesamtmasse von mehr als 2 t an Sonn- und Feiertagen sowie \nzwischen 22.00 und 6.00 Uhr regelm\u00E4\u00DFig parken?","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111\u1EADu r\u01A1-mooc c\u00F3 t\u1EA3i tr\u1ECDng h\u01A1n 2 t\u1EA5n \u1EDF \u0111\u00E2u trong th\u00E0nh ph\u1ED1 v\u00E0o ch\u1EE7 nh\u1EADt v\u00E0 ng\u00E0y l\u00EA, t\u1EEB 22h \u0111\u1EBFn 6h?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Gewerbegebieten","Khu c\u00F4ng nghi\u1EC7p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In reinen Wohngebieten auf entsprechend gekennzeichneten\nParkpl\u00E4tzen","\u1EDE t\u1EA5t c\u1EA3 c\u00E1c khu d\u00E2n c\u01B0 tr\u00EAn nh\u1EEFng b\u00E3i \u0111\u1EADu xe c\u00F3 k\u00FD hi\u1EC7u ph\u00F9 h\u1EE3p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In Sondergebieten, die der Erholung dienen, auf ausreichend breiten\nStra\u00DFen","\u1EDE khu v\u1EF1c \u0111\u1EB7c bi\u1EC7t, d\u00F9ng \u0111\u1EC3 s\u1EEDa ch\u1EEFa, tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 b\u1EC1 ngang \u0111\u1EE7 l\u1EDBn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.12-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(665);
	    	
	    	q.setName("2.2.12-106");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie achten, wenn Sie einen Anh\u00E4nger ohne \nZugfahrzeug parken? \nDer Anh\u00E4nger darf auf","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC, khi b\u1EA1n \u0111\u1EADu r\u01A1-mooc kh\u00F4ng c\u00F3 xe k\u00E9o?\nR\u01A1-mooc \u0111\u01B0\u1EE3c ph\u00E9p"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 \u00F6ffentlichen Stra\u00DFen nicht l\u00E4nger als 2 Wochen geparkt werden","\u2013 \u0111\u1EADu tr\u00EAn \u0111\u01B0\u1EDDng c\u00F4ng c\u1ED9ng kh\u00F4ng qu\u00E1 2 tu\u1EA7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 entsprechend gekennzeichneten Parkpl\u00E4tzen l\u00E4nger als 2 Wochen\ngeparkt werden","\u2013 \u0111\u1EADu \u1EDF b\u00E3i \u0111\u1EADu xe c\u00F3 k\u00FD hi\u1EC7u ph\u00F9 h\u1EE3p d\u00E0i h\u01A1n 2 tu\u1EA7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 ausreichend befestigten Seitenstreifen zeitlich unbegrenzt geparkt\nwerden","\u2013 \u0111\u1EADu \u1EDF l\u1EC1 \u0111\u01B0\u1EDDng \u0111\u1EE7 r\u1ED9ng kh\u00F4ng c\u00F3 gi\u1EDBi h\u1EA1n th\u1EDDi gian")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.13-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(666);
	    	
	    	q.setName("2.2.13-001");

			q.setText(new TranslatedString("Wo m\u00FCssen Sie zum Parken eine Parkscheibe benutzen?","Khi n\u00E0o \u0111\u01B0\u1EE3c d\u00F9ng \u0111\u1ED3ng h\u1ED3 xoay khi \u0111\u1EADu xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An einer defekten Parkuhr","N\u01A1i m\u00E0 m\u00E1y b\u00E1n v\u00E9 \u0111\u1EADu xe b\u1ECB h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wo es durch Verkehrszeichen angeordnet ist","N\u01A1i m\u00E0 bi\u1EC3n b\u00E1o cho ph\u00E9p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Im eingeschr\u00E4nkten Haltverbot","N\u01A1i c\u1EA5m d\u1EEBng m\u1ED9t ph\u1EA7n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.13-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(667);
	    	
	    	q.setName("2.2.13-002");

			q.setText(new TranslatedString("Eine Parkuhr ist noch nicht abgelaufen. Wie verhalten Sie sich? \nSie d\u00FCrfen die Restparkzeit","Th\u1EDDi gian \u0111\u1EADu xe v\u1EABn ch\u01B0a h\u1EBFt h\u1EA1n. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 ausnutzen, ohne die Parkuhr erneut zu bet\u00E4tigen","B\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng th\u1EDDi gian \u0111\u1EADu xe c\u00F2n l\u1EA1i m\u00E0 kh\u00F4ng c\u1EA7n mua v\u00E9 kh\u00E1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 nicht ausnutzen","B\u1EA1n kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng th\u1EDDi gian \u0111\u1EADu xe c\u00F2n l\u1EA1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 nur ausnutzen, wenn Sie eine Parkscheibe verwenden","B\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng th\u1EDDi gian \u0111\u1EADu xe c\u00F2n l\u1EA1i khi b\u1EA1n c\u00F3 s\u1EED d\u1EE5ng b\u1EA3ng \u0111\u1ED3ng h\u1ED3 t\u1EF1 xoay")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.13-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(668);
	    	
	    	q.setName("2.2.13-003");

			q.setText(new TranslatedString("Sie kommen um 10.40 Uhr in einem Bereich an, in dem mit \nParkscheibe 2 Stunden lang geparkt werden darf. Welche Uhrzeit \nm\u00FCssen Sie auf der Parkscheibe einstellen?","B\u1EA1n \u0111\u1EBFn m\u1ED9t khu v\u1EF1c n\u00E0o \u0111\u00F3 l\u00FAc 10.40, \u1EDF \u0111\u00F3 cho ph\u00E9p \u0111\u1EADu 2 ti\u1EBFng. B\u1EA1n ch\u1EC9nh th\u1EDDi gian n\u00E0o tr\u00EAn b\u1EA3ng \u0111\u1ED3ng h\u1ED3 xoay (Parkscheibe)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("11.00 Uhr","11.00 Uhr")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("12.40 Uhr","12.40 Uhr")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("13.00 Uhr","13.00 Uhr")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.13-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(669);
	    	
	    	q.setName("2.2.13-004");

			q.setText(new TranslatedString("Sie wollen auf einem Platz mit Parkscheinautomat parken. Was \nhaben Sie zu beachten?","B\u1EA1n mu\u1ED1n \u0111\u1EADu xe \u1EDF khu v\u1EF1c c\u00F3 b\u00E1n v\u00E9 t\u1EF1 \u0111\u1ED9ng. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("G\u00FCltigen Parkschein am Fahrzeug so anbringen, dass er von au\u00DFen\ngut lesbar ist","V\u00E9 \u0111\u1EADu xe c\u00F2n h\u1EA1n ph\u1EA3i \u0111\u1EC3 trong xe v\u00E0 \u0111\u1EC3 cho ng\u01B0\u1EDDi b\u00EAn ngo\u00E0i c\u00F3 th\u1EC3 \u0111\u1ECDc \u0111\u01B0\u1EE3c r\u00F5 r\u00E0ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die auf dem Parkschein angegebene Parkzeit nicht \u00FCberschreiten","Ng\u01B0\u1EDDi c\u00F3 v\u00E9 \u0111\u1EADu xe c\u0169ng kh\u00F4ng \u0111\u01B0\u1EE3c \u0111\u1EADu qu\u00E1 th\u1EDDi gian qui \u0111\u1ECBnh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ein Parkschein ist immer \u00FCberfl\u00FCssig, wenn Sie eine Parkscheibe\nbenutzen","V\u00E9 \u0111\u1EADu xe l\u00E0 kh\u00F4ng c\u1EA7n thi\u1EBFt khi b\u1EA1n \u0111\u00E3 c\u00F3 Parkscheibe (b\u1EA3ng \u0111\u1ED3ng h\u1ED3 xoay \u0111\u1EC3 \u0111\u1EADu xe)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.13-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(670);
	    	
	    	q.setName("2.2.13-101");

			q.setText(new TranslatedString("Wozu darf an nicht laufenden Parkuhren gehalten werden?","Wozu darf an nicht laufenden Parkuhren gehalten werden?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zum Ein- oder Aussteigen","Zum Ein- oder Aussteigen")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zum Be- oder Entladen","Zum Be- oder Entladen")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zu einem kurzen Einkauf","Zu einem kurzen Einkauf")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.14-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(671);
	    	
	    	q.setName("2.2.14-101");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie Ihren Pkw gegen Diebstahl sichern?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC \u0111\u1EC3 ch\u1ED1ng tr\u1ED9m xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Z\u00FCndschl\u00FCssel abziehen, Lenkradschloss einrasten lassen und\nFenster schlie\u00DFen","R\u00FAt kh\u00F3a \u0111\u00E1nh l\u1EEDa, kh\u00F3a tay l\u00E1i v\u00E0 \u0111\u00F3ng c\u1EEDa")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("T\u00FCren und Kofferraum abschlie\u00DFen","\u0110\u00F3ng c\u1EEDa v\u00E0 c\u1ED1p xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Differentialsperre einschalten (aktivieren)","B\u1EADt kh\u00F3a vi sai (k\u00EDch ho\u1EA1t)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.14-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(672);
	    	
	    	q.setName("2.2.14-102");

			q.setText(new TranslatedString("Was m\u00FCssen Sie beim Verlassen Ihres Pkw tun?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC sau khi b\u1EA1n r\u1EDDi kh\u1ECFi xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem \u00D6ffnen der T\u00FCr den nachfolgenden Verkehr beachten","Tr\u01B0\u1EDBc khi m\u1EDF c\u1EEDa xe ph\u1EA3i \u0111\u1EC3 \u00FD xe ph\u00EDa sau")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug gegen Wegrollen sichern","\u0110\u1EA3m b\u1EA3o xe kh\u00F4ng b\u1ECB l\u0103n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug gegen unbefugte Benutzung sichern","\u0110\u1EA3m b\u1EA3o xe kh\u00F4ng b\u1ECB s\u1EED d\u1EE5ng m\u00E0 kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.14-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(673);
	    	
	    	q.setName("2.2.14-103");

			q.setText(new TranslatedString("Worauf weisen Sie Mitfahrer vor dem Aussteigen hin? \nDarauf, dass","B\u1EA1n l\u00E0m g\u00EC tr\u01B0\u1EDBc khi ng\u01B0\u1EDDi \u0111i c\u00F9ng xu\u1ED1ng xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 beim Aussteigen nach links der flie\u00DFende Verkehr zu beachten ist","\u2013 Ch\u00FA \u00FD xe \u1EDF b\u00EAn tr\u00E1i khi xu\u1ED1ng xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 man beim Aussteigen nach rechts auf Fu\u00DFg\u00E4nger achten muss","\u2013 Ch\u00FA \u00FD ng\u01B0\u1EDDi \u0111i b\u1ED9 \u1EDF b\u00EAn ph\u1EA3i khi xu\u1ED1ng xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 beim Aussteigen an Radwegen Radfahrer wartepflichtig sind","\u2013 Khi xu\u1ED1ng xe th\u00EC ng\u01B0\u1EDDi \u0111i xe \u0111\u1EA1p s\u1EBD ch\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.14-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(674);
	    	
	    	q.setName("2.2.14-104");

			q.setText(new TranslatedString("Ihr Pkw steht am Fahrbahnrand. Was ist beim Einsteigen richtig?","B\u1EA1n \u0111ang \u0111\u1EADu b\u00EAn l\u1EC1 \u0111\u01B0\u1EDDng. \u0110i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 \u0111\u00FAng khi c\u00F3 ng\u01B0\u1EDDi l\u00EAn xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mitfahrer m\u00F6glichst vom Gehweg aus einsteigen lassen","\u0110\u1EC3 ng\u01B0\u1EDDi \u0111i c\u00F9ng l\u00EAn xe t\u1EEB ph\u1EA7n \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("T\u00FCren auf der Fahrbahnseite erst \u00F6ffnen, wenn es der Verkehr erlaubt","M\u1EDF c\u1EEDa ph\u00EDa b\u00EAn l\u00F2ng \u0111\u01B0\u1EDDng n\u1EBFu \u0111i\u1EC1u ki\u1EC7n giao th\u00F4ng cho ph\u00E9p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das \u00D6ffnen der T\u00FCren auf der rechten Seite ist immer gefahrlos\nm\u00F6glich","M\u1EDF c\u1EEDa ph\u00EDa b\u00EAn ph\u1EA3i lu\u00F4n lu\u00F4n an to\u00E0n\nm\u00F6glich")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.14-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(675);
	    	
	    	q.setName("2.2.14-105");

			q.setText(new TranslatedString("Was ist beim Ein- oder Aussteigen von Kindern richtig?","Khi tr\u1EBB l\u00EAn xu\u1ED1ng xe, \u0111i\u1EC1u g\u00EC l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kinder m\u00F6glichst auf der Gehwegseite ein- oder aussteigen lassen","\u0110\u1EC3 cho tr\u1EBB c\u00F3 th\u1EC3 l\u00EAn ho\u1EB7c xu\u1ED1ng xe t\u1EEB l\u1ED1i \u0111i d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kinder auf der Fahrbahnseite nur unter Beaufsichtigung ein- oder aussteigen\nlassen","\u0110\u1EC3 cho tr\u1EBB l\u00EAn hay xu\u1ED1ng xe t\u1EEB ph\u00EDa l\u00F2ng \u0111\u01B0\u1EDDng ch\u1EC9 khi c\u00F3 s\u1EF1 gi\u00E1m s\u00E1t c\u1EE7a ng\u01B0\u1EDDi l\u1EDBn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kinder d\u00FCrfen auf \u00F6ffentlichen Stra\u00DFen nicht ein- oder aussteigen","Tr\u1EBB kh\u00F4ng \u0111\u01B0\u1EE3c ph\u00E9p l\u00EAn hay xu\u1ED1ng xe tr\u00EAn \u0111\u01B0\u1EDDng c\u00F4ng c\u1ED9ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(676);
	    	
	    	q.setName("2.2.15-101");

			q.setText(new TranslatedString("Sie haben auf der Autobahn eine Reifenpanne. Wie m\u00FCssen Sie \nsich verhalten?","Tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c b\u1EA1n b\u1ECB n\u1ED5 l\u1ED1p. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warnblinklicht einschalten und m\u00F6glichst weit rechts anhalten\n(Seitenstreifen, Haltebucht)","B\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o v\u00E0 \u0111\u1EADu xe v\u1EC1 ph\u00EDa ph\u1EA3i c\u00E0ng t\u1ED1t (L\u1EC1 \u0111\u01B0\u1EDDng, tr\u1EA1m xe bus)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warndreieck in etwa 100 m Entfernung aufstellen","\u0110\u1EB7t bi\u1EC3n tam gi\u00E1c c\u1EA3nh b\u00E1o c\u00E1ch xa kho\u1EA3ng 100 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Andere Fahrer durch deutliche Handzeichen zum Anhalten auffordern","C\u00E1c xe kh\u00E1c ph\u1EA3i nh\u00ECn r\u00F5 d\u1EA5u hi\u1EC7u tay khi \u0111\u1EEBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(677);
	    	
	    	q.setName("2.2.15-102");

			q.setText(new TranslatedString("Ihr Fahrzeug ist auf einer Landstra\u00DFe liegen geblieben. Was ist \nbeim Abschleppen zu beachten?","Xe b\u1EA1n h\u1ECFng ph\u1EA3i d\u1EEBng tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe. Ph\u1EA3i ch\u00FA \u00FD g\u00EC khi b\u1ECB k\u00E9o xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("W\u00E4hrend des Abschleppens an beiden Fahrzeugen Warnblinklicht\neinschalten","Trong khi k\u00E9o ph\u1EA3i b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o tr\u00EAn c\u1EA3 hai xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abschleppseil immer straff halten","D\u00E2y k\u00E9o lu\u00F4n ph\u1EA3i gi\u1EEF ch\u1EB7t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zur n\u00E4chstgelegenen Werkstatt fahren, auch wenn dabei die\nAutobahn benutzt werden muss","L\u00E1i \u0111\u1EBFn tr\u1EA1m s\u1EEDa g\u1EA7n nh\u1EA5t, ngay c\u1EA3 ph\u1EA3i s\u1EED d\u1EE5ng \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(678);
	    	
	    	q.setName("2.2.15-103");

			q.setText(new TranslatedString("Sie wollen mit Ihrem Pkw einen anderen abschleppen. Was m\u00FCssen \nSie wissen?","B\u1EA1n mu\u1ED1n k\u00E9o xe kh\u00E1c. B\u1EA1n c\u1EA7n ph\u1EA3i c\u00F3 b\u1EB1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie ben\u00F6tigen mindestens die Fahrerlaubnis der Klasse B","B\u1EA1n c\u1EA7n \u00EDt nh\u1EA5t b\u1EB1ng l\u00E1i lo\u1EA1i B")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie ben\u00F6tigen mindestens die Fahrerlaubnis der Klasse BE","B\u1EA1n c\u1EA7n \u00EDt nh\u1EA5t b\u1EB1ng l\u00E1i lo\u1EA1i BE")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(679);
	    	
	    	q.setName("2.2.15-104");

			q.setText(new TranslatedString("Ein Pkw mit Bremskraftverst\u00E4rker ist mit Motorschaden liegen \ngeblieben. Was ist beim Abschleppen richtig?","Xe Pkw c\u00F3 b\u1ED9 tr\u1EE3 l\u1EF1c phanh ph\u1EA3i d\u1EEBng l\u1EA1i do h\u1ECFng \u0111\u1ED9ng c\u01A1. Khi k\u00E9o xe \u0111i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 quan tr\u1ECDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auch mit erh\u00F6htem Pedaldruck kann beim abgeschleppten Pkw nur\neine geringe Bremswirkung erreicht werden","D\u00F9 c\u00F3 nh\u1EA5n m\u1EA1nh tr\u00EAn pedal th\u00EC hi\u1EC7u qu\u1EA3 phanh c\u0169ng r\u1EA5t \u00EDt tr\u00EAn xe \u0111\u01B0\u1EE3c k\u00E9o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("M\u00F6glichst eine Abschleppstange benutzen","C\u00F3 th\u1EC3 d\u00F9ng thanh k\u00E9o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Wirkung der Fu\u00DFbremse wird durch den stillstehenden Motor nicht\nbeeintr\u00E4chtigt","T\u00E1c d\u1EE5ng c\u1EE7a phanh ch\u00E2n kh\u00F4ng c\u00F3 t\u00E1c d\u1EE5ng khi \u0111\u1ED9ng c\u01A1 \u0111\u1EE9ng y\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(680);
	    	
	    	q.setName("2.2.15-105");

			q.setText(new TranslatedString("Ein Pkw mit Servolenkung ist mit Motorschaden liegen geblieben \nund soll abgeschleppt werden. Was ist richtig? \nDie Lenkung am liegen gebliebenen Pkw","Xe Pkw c\u00F3 trang b\u1ECB tr\u1EE3 l\u1EF1c tay l\u00E1i do xe h\u1ECFng ph\u1EA3i d\u1EEBng l\u1EA1i v\u00E0 \u0111\u01B0\u1EE3c k\u00E9o. \u0110i\u1EC1u g\u00EC l\u00E0 quan tr\u1ECDng?\nTay l\u00E1i tr\u00EAn xe h\u1ECFng"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 geht wesentlich schwerer","\u2013 s\u1EBD n\u1EB7ng h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 ist blockiert","\u2013 s\u1EBD b\u1ECB kh\u00F3a")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 ist nicht beeintr\u00E4chtigt","\u2013 s\u1EBD kh\u00F4ng c\u00F3 t\u00E1c d\u1EE5ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(681);
	    	
	    	q.setName("2.2.15-106");

			q.setText(new TranslatedString("In welcher Entfernung ist das Warndreieck aufzustellen, wenn ein \nFahrzeug auf einer Stra\u00DFe mit schnellem Verkehr liegen geblieben \nist?","Bi\u1EC3n tam gi\u00E1c c\u1EA3nh b\u00E1o \u0111\u01B0\u1EE3c \u0111\u1EC3 bao xa khi d\u1EEBng xe tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 xe \u0111i nhanh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In etwa 100 m Entfernung","Xa kho\u1EA3ng 100 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In etwa 50 m Entfernung","Xa kho\u1EA3ng 50 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In etwa 10 m Entfernung","Xa kho\u1EA3ng 10 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(682);
	    	
	    	q.setName("2.2.15-107");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie nachts ein Fahrzeug sichern, das an einer Stelle \nliegen geblieben ist, an der es eine Gefahr f\u00FCr den \u00FCbrigen Verkehr \nbildet?","L\u00E0m sao \u0111\u1EC3 b\u1EA3o v\u1EC7 an to\u00E0n cho xe khi d\u1EEBng \u1EDF m\u1ED9t n\u01A1i c\u00F3 th\u1EC3 g\u00E2y nguy hi\u1EC3m cho c\u00E1c xe kh\u00E1c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sofort Warnblinklicht einschalten","L\u1EADp t\u1EE9c b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warndreieck in ausreichender Entfernung aufstellen","\u0110\u1EC3 bi\u1EC3n b\u00E1o tam gi\u00E1c \u0111\u1EE7 xa")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("R\u00FCckfahrscheinwerfer einschalten","B\u1EADt \u0111\u00E8n h\u1EADu")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(683);
	    	
	    	q.setName("2.2.15-108");

			q.setText(new TranslatedString("Wann m\u00FCssen Sie das Warnblinklicht einschalten?","Khi n\u00E0o b\u1EA1n ph\u1EA3i b\u1EADt \u0111\u00E8n c\u1EA3nh b\u00E1o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Ihr Fahrzeug an einer Stelle liegen bleibt, an der es nicht\nrechtzeitig als stehendes Hindernis erkannt werden kann","Khi xe b\u1EA1n d\u1EEBng \u1EDF n\u01A1i m\u00E0 c\u00F3 th\u1EC3 l\u00E0m cho ch\u01B0\u1EDBng ng\u1EA1i v\u1EADt \u0111\u01B0\u1EE3c nh\u1EADn ra mu\u1ED9n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Sie in zweiter Reihe parken","Khi b\u1EA1n \u0111\u1EADu \u1EDF h\u00E0ng th\u1EE9 hai")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei jedem Be- oder Entladen","M\u1ED7i khi d\u1EEBng \u0111\u1EC3 l\u1EA5y h\u00E0ng hay d\u1EE1 h\u00E0ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.15-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(684);
	    	
	    	q.setName("2.2.15-109");

			q.setText(new TranslatedString("Was ist beim Abschleppen zu beachten?","Ch\u00FA \u00FD g\u00EC khi k\u00E9o xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Abstand zwischen den Fahrzeugen darf nicht gr\u00F6\u00DFer als 5 m sein","Kho\u1EA3ng c\u00E1ch gi\u1EEFa c\u00E1c xe kh\u00F4ng \u0111\u01B0\u1EE3c l\u1EDBn h\u01A1n 5 m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abschleppseil/Abschleppstange muss deutlich gekennzeichnet sein","D\u00E2y k\u00E9o/thanh k\u00E9o ph\u1EA3i \u0111\u01B0\u1EE3c nh\u00ECn th\u1EA5y r\u00F5 r\u00E0ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Motorr\u00E4der d\u00FCrfen nur mit fester Verbindung abgeschleppt werden","Xe m\u00F4 t\u00F4 ch\u1EC9 \u0111\u01B0\u1EE3c k\u00E9o khi \u0111\u01B0\u1EE3c bu\u1ED9c ch\u1EAFc ch\u1EAFn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.16-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(685);
	    	
	    	q.setName("2.2.16-001");

			q.setText(new TranslatedString("Wo d\u00FCrfen Sie die Lichthupe zum Anzeigen der \u00DCberholabsicht \nbenutzen?","\u1EDE \u0111\u00E2u b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p d\u00F9ng \u0111\u00E8n flash \u0111\u1EC3 b\u00E1o v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Au\u00DFerorts am Tage","Ngo\u1EA1i \u00F4 v\u00E0o ban ng\u00E0y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Au\u00DFerorts bei Dunkelheit","Ngo\u1EA1i \u00F4 khi tr\u1EDDi t\u1ED1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Innerorts bei Dunkelheit","N\u1ED9i th\u00E0nh khi tr\u1EDDi t\u1ED1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(686);
	    	
	    	q.setName("2.2.17-005");

			q.setText(new TranslatedString("Die Sicht ist erheblich behindert. Wann d\u00FCrfen Sie \nNebelscheinwerfer einschalten?","T\u1EA7m nh\u00ECn b\u1ECB che m\u1ED9t c\u00E1ch \u0111\u00E1ng k\u1EC3. Khi n\u00E0o b\u1EA1n n\u00EAn b\u1EADt \u0111\u00E8n s\u01B0\u01A1ng m\u00F9?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Regen","Khi m\u01B0a")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Schneefall","Khi tuy\u1EBFt r\u01A1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Nebel","Khi c\u00F3 s\u01B0\u01A1ng m\u00F9")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(687);
	    	
	    	q.setName("2.2.17-006");

			q.setText(new TranslatedString("Sie fahren bei Dunkelheit mit Fernlicht. Wann m\u00FCssen Sie \nabblenden?","B\u1EA1n l\u00E1i xe v\u00E0o tr\u1EDDi t\u1ED1i v\u1EDBi \u0111\u00E8n chi\u1EBFu xa. Khi n\u00E0o b\u1EA1n ph\u1EA3i c\u00FAp \u0111\u00E8n xu\u1ED1ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie auf eine Stra\u00DFe mit durchgehender, ausreichender\nBeleuchtung kommen","Khi b\u1EA1n \u0111i v\u00E0o \u0111\u01B0\u1EDDng th\u00F4ng su\u1ED1t v\u00E0 c\u00F3 \u0111\u1EE7 s\u00E1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie vor einem Bahn\u00FCbergang warten m\u00FCssen","Khi b\u1EA1n ph\u1EA3i ch\u1EDD tr\u01B0\u1EDBc ch\u1ED7 c\u00F3 \u0111\u01B0\u1EDDng ray b\u0103ng qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Fu\u00DFg\u00E4nger in gleicher Richtung vorausgehen","Khi c\u00F3 ng\u01B0\u1EDDi \u0111i b\u1ED9 \u1EDF ph\u00EDa tr\u01B0\u1EDBc tr\u00EAn c\u00F9ng m\u1ED9t h\u01B0\u1EDBng \u0111i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(688);
	    	
	    	q.setName("2.2.17-007");

			q.setText(new TranslatedString("Sie fahren bei Dunkelheit mit Fernlicht. Wann m\u00FCssen Sie \nabblenden?","B\u1EA1n l\u00E1i xe v\u00E0o tr\u1EDDi t\u1ED1i v\u1EDBi \u0111\u00E8n chi\u1EBFu xa. Khi n\u00E0o b\u1EA1n ph\u1EA3i c\u00FAp \u0111\u00E8n xu\u1ED1ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Gegenverkehr","Khi c\u00F3 xe ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn ein Fahrzeug in geringem Abstand vorausf\u00E4hrt","Khi c\u00F3 xe \u0111i tr\u01B0\u1EDBc v\u1EDBi kho\u1EA3ng c\u00E1ch an to\u00E0n ng\u1EAFn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Fu\u00DFg\u00E4nger in gleicher Richtung vorausgehen","Khi ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111i tr\u01B0\u1EDBc tr\u00EAn c\u00F9ng h\u01B0\u1EDBng \u0111i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(689);
	    	
	    	q.setName("2.2.17-008");

			q.setText(new TranslatedString("Sie fahren nachts auf unbeleuchteter Stra\u00DFe. Ein Fahrzeug f\u00E4hrt in \ngeringem Abstand voraus. Welches Licht m\u00FCssen Sie dabei \neingeschaltet haben?","B\u1EA1n l\u00E1i xe ban \u0111\u00EAm tr\u00EAn \u0111\u01B0\u1EDDng kh\u00F4ng c\u00F3 \u0111\u00E8n. C\u00F3 xe ch\u1EA1y tr\u01B0\u1EDBc v\u1EDBi kho\u1EA3ng c\u00E1ch ng\u1EAFn. \u0110\u00E8n n\u00E0o b\u1EA1n ph\u1EA3i b\u1EADt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abblendlicht","\u0110\u00E8n chi\u1EBFu g\u1EA7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fernlicht","\u0110\u00E8n chi\u1EBFu xa")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Standlicht allein","Ch\u1EC9 b\u1EADt \u0111\u00E8n \u0111\u1EE9ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(690);
	    	
	    	q.setName("2.2.17-101");

			q.setText(new TranslatedString("Wann d\u00FCrfen Sie auch am Tage Nebelscheinwerfer einschalten? \nBei erheblicher Sichtbehinderung durch","Khi n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p b\u1EADt \u0111\u00E8n s\u01B0\u01A1ng m\u00F9 v\u00E0o ban ng\u00E0y? \nKhi t\u1EA7m nh\u00ECn b\u1ECB che \u0111\u00E1ng k\u1EC3 do ..."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Nebel oder Schneefall","\u2013 S\u01B0\u01A1ng v\u00E0 tuy\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Regen","\u2013 M\u01B0a")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 Eis auf der Windschutzscheibe","\u2013 \u0110\u00E1 tr\u00EAn k\u00EDnh ch\u1EAFn gi\u00F3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(691);
	    	
	    	q.setName("2.2.17-102");

			q.setText(new TranslatedString("Wann d\u00FCrfen Sie Nebelschlussleuchten einschalten?","Khi n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p b\u1EADt \u0111\u00E8n s\u01B0\u01A1ng m\u00F9 ph\u00EDa sau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn durch Nebel die Sichtweite weniger als 50 m betr\u00E4gt","Khi \u0111i qua s\u01B0\u01A1ng m\u00F9 v\u00E0 c\u00F3 t\u1EA7m nh\u00ECn ng\u1EAFn h\u01A1n 50 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn durch Nebel die Sichtweite 100 m betr\u00E4gt","Khi \u0111i qua s\u01B0\u01A1ng m\u00F9 v\u00E0 c\u00F3 t\u1EA7m nh\u00ECn 100 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn durch starken Regen die Sicht behindert wird","Khi c\u00F3 m\u01B0a to l\u00E0m gi\u1EA3m t\u1EA7m nh\u00ECn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(692);
	    	
	    	q.setName("2.2.17-103");

			q.setText(new TranslatedString("Wo gen\u00FCgen beim Parken eines Pkw auf unbeleuchteten Stra\u00DFen \nParkleuchten?","\u1EDE \u0111\u00E2u th\u00EC xe Pkw \u0111\u01B0\u1EE3c \u0111\u1EADu tr\u00EAn \u0111\u01B0\u1EDDng kh\u00F4ng \u0111\u01B0\u1EE3c chi\u1EBFu s\u00E1ng v\u1EDBi \u0111\u00E8n \u0111\u1EADu xe \u0111\u01B0\u1EE3c b\u1EADt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Innerhalb geschlossener Ortschaften","Trong n\u1ED9i th\u00E0nh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Au\u00DFerhalb geschlossener Ortschaften","Ngo\u1EA1i \u00F4")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf Seitenstreifen von Autobahnen","\u1EDE l\u1EC1 \u0111\u01B0\u1EDDng cao t\u1ED1c autobahn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(693);
	    	
	    	q.setName("2.2.17-104");

			q.setText(new TranslatedString("Wie k\u00F6nnen Sie w\u00E4hrend der Fahrt erkennen, ob Fernlicht \neingeschaltet ist?","Khi \u0111ang l\u00E1i xe l\u00E0m sao \u0111\u1EC3 bi\u1EBFt \u0111\u01B0\u1EE3c \u0111\u00E8n pha chi\u1EBFu xa c\u00F3 b\u1EADt kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An einer blauen Kontrollleuchte","Xem \u0111\u00E8n \u0111i\u1EC1u khi\u1EC3n m\u00E0u xanh da tr\u1EDDi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An einer roten Kontrollleuchte","Xem \u0111\u00E8n \u0111i\u1EC1u khi\u1EC3n m\u00E0u \u0111\u1ECF")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An einer gr\u00FCnen Kontrollleuchte","Xem \u0111\u00E8n \u0111i\u1EC1u khi\u1EC3n m\u00E0u xanh l\u00E1 c\u00E2y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(694);
	    	
	    	q.setName("2.2.17-105");

			q.setText(new TranslatedString("Welche Gefahren k\u00F6nnen durch falsche Bet\u00E4tigung einer manuellen \nLeuchtweitenregelung entstehen?","Nguy hi\u1EC3m n\u00E0o g\u00E2y ra do \u0111i\u1EC1u ch\u1EC9nh sai \u0111\u00E8n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Blendung des Gegenverkehrs","L\u00F3a m\u1EAFt xe ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu geringe Sichtweite","T\u1EA7m nh\u00ECn b\u1ECB ng\u1EAFn l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ausfall der Scheinwerfer","H\u1ECFng \u0111\u00E8n pha")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(695);
	    	
	    	q.setName("2.2.17-106");

			q.setText(new TranslatedString("Wann m\u00FCssen Sie mindestens mit Abblendlicht fahren?","Khi n\u00E0o b\u1EA1n \u00EDt nh\u1EA5t ph\u1EA3i b\u1EADt \u0111\u00E8n chi\u1EBFu g\u1EA7n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("W\u00E4hrend der D\u00E4mmerung","L\u00FAc tr\u1EDDi ch\u1EA1ng v\u1EA1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Am Tage, wenn es die Sichtverh\u00E4ltnisse erfordern","V\u00E0o b\u1EA1n ng\u00E0y, khi c\u1EA7n c\u00F3 \u0111i\u1EC1u ki\u1EC7n quan s\u00E1t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Durchfahren schlecht beleuchteter Unterf\u00FChrungen","Khi \u0111i xuy\u00EAn qua g\u1EA7m c\u1EA7u v\u01B0\u1EE3t kh\u00F4ng \u0111\u01B0\u1EE3c chi\u1EBFu s\u00E1ng t\u1ED1t")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(696);
	    	
	    	q.setName("2.2.17-107");

			q.setText(new TranslatedString("D\u00FCrfen Sie bei Dunkelheit nur mit Begrenzungslicht (Standlicht) \nfahren?","Khi t\u1ED1i c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p l\u00E1i xe m\u00E0 ch\u1EC9 b\u1EADt \u0111\u00E8n d\u1EEBng kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein","Kh\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, wenn Sie au\u00DFerorts in einer Kolonne fahren","C\u00F3, khi b\u1EA1n l\u00E1i xe trong m\u1ED9t h\u00E0ng xe \u1EDF khu v\u1EF1c ngo\u1EA1i \u00F4")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, wenn innerorts die Fahrbahn ausreichend beleuchtet ist","C\u00F3, khi \u0111\u01B0\u1EDDng trong th\u00E0nh ph\u1ED1 \u0111\u1EE7 s\u00E1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(697);
	    	
	    	q.setName("2.2.17-108");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, wenn Sie am Tage in eine schlecht \nbeleuchtete Unterf\u00FChrung einfahren?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi v\u00E0o ban ng\u00E0y l\u00E1i xe qua g\u1EA7m c\u1EA7u v\u01B0\u1EE3t \u0111\u01B0\u1EE3c chi\u1EBFu s\u00E1ng k\u00E9m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abblendlicht einschalten","B\u1EADt \u0111\u00E8n chi\u1EBFu g\u1EA7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mehrmals die Lichthupe bet\u00E4tigen","S\u1EED d\u1EE5ng nhi\u1EC1u l\u1EA7n \u0111\u00E8n chi\u1EBFu xa")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur Standlicht einschalten","Ch\u1EC9 b\u1EADt \u0111\u00E8n d\u1EEBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(698);
	    	
	    	q.setName("2.2.17-109");

			q.setText(new TranslatedString("Wann m\u00FCssen Sie auch am Tage mit Abblendlicht fahren? \nBei erheblicher Sichtbehinderung durch","Khi n\u00E0o b\u1EA1n ph\u1EA3i b\u1EADt \u0111\u00E8n chi\u1EBFu g\u1EA7n v\u00E0o ban ng\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Nebel oder Schneefall","Khi c\u00F3 s\u01B0\u01A1ng m\u00F9 hay tuy\u1EBFt l\u00E0m c\u1EA3n t\u1EA7m nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Regen","Khi c\u00F3 m\u01B0a c\u1EA3n t\u1EA7m nh\u00ECn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 beschlagene Windschutzscheibe","K\u00EDnh ch\u1EAFn gi\u00F3 b\u1ECB m\u1EDD s\u01B0\u01A1ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(699);
	    	
	    	q.setName("2.2.17-110");

			q.setText(new TranslatedString("Warum m\u00FCssen Sie auch am Tage mindestens mit Abblendlicht \nfahren, wenn die Sicht durch Nebel, Regen oder Schneefall \nerheblich behindert ist?","T\u1EA1i sao v\u00E0o ban ng\u00E0y t\u1ED1i thi\u1EC3u b\u1EA1n ph\u1EA3i b\u1EADt \u0111\u00E8n g\u1EA7n, khi t\u1EA7m nh\u00ECn b\u1ECB k\u00E9m \u0111i do s\u01B0\u01A1ng m\u00F9, m\u01B0a hay tuy\u1EBFt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Um von anderen Verkehrsteilnehmern besser gesehen werden zu\nk\u00F6nnen","\u0110\u1EC3 c\u00E1c ph\u01B0\u01A1ng ti\u1EC7n tham gia giao th\u00F4ng khsac c\u00F3 th\u1EC3 \u0111\u01B0\u1EE3c nh\u00ECn th\u1EA5y r\u00F5 h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Um mit erh\u00F6hter Geschwindigkeit fahren zu k\u00F6nnen","\u0110\u1EC3 c\u00F3 th\u1EC3 l\u00E1i xe v\u1EDBi t\u1ED1c \u0111\u1ED9 cao h\u01A1n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Um Verkehrszeichen aus gr\u00F6\u00DFerer Entfernung besser sehen zu\nk\u00F6nnen","\u0110\u1EC3 c\u00F3 th\u1EC3 nh\u00ECn th\u1EA5y c\u00E1c bi\u1EC3n b\u00E1o giao th\u00F4ng t\u1EEB kho\u1EA3ng c\u00E1ch xa h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.2.17-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(700);
	    	
	    	q.setName("2.2.17-111");

			q.setText(new TranslatedString("In welchen F\u00E4llen m\u00FCssen Sie bei D\u00E4mmerung oder Dunkelheit nur \ndie Begrenzungsleuchten (Standlicht) einschalten?","Trong t\u00ECnh hu\u1ED1ng n\u00E0o b\u1EA1n ch\u1EC9 \u0111\u01B0\u1EE3c b\u1EADt \u0111\u00E8n d\u1EEBng khi tr\u1EDDi ch\u1EA1ng v\u1EA1ng ho\u1EB7c tr\u1EDDi t\u1ED1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn das Fahrzeug au\u00DFerhalb geschlossener Ortschaften auf dem\nSeitenstreifen geparkt wird","Khi \u0111\u1EADu xe \u1EDF l\u1EC1 \u0111\u01B0\u1EDDng ngo\u00E0i khu v\u1EF1c \u0111\u00F4 th\u1ECB")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Fahren auf Stra\u00DFen mit durchgehender, ausreichender\nBeleuchtung","Khi l\u00E1i xe tr\u00EAn \u0111\u01B0\u1EDDng \u0111\u01B0\u1EE3c chi\u1EBFu s\u00E1ng \u0111\u1EE7")));
		    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
