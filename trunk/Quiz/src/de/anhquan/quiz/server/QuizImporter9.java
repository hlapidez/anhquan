package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter9 {

	static {
		
				
		//Question 2.7.02-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(901);
	    	
	    	q.setName("2.7.02-115");

			q.setText(new TranslatedString("Das Spiegelglas des linken Au\u00DFenspiegels ist gesprungen. Was tun \nSie?","M\u1EB7t k\u00EDnh c\u1EE7a g\u01B0\u01A1ng b\u00EAn tr\u00E1i b\u1ECB n\u1EE9t. B\u1EA1n s\u1EBD l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Spiegelglas erneuern","Thay g\u01B0\u01A1ng m\u1EDBi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Spiegelglas nicht erneuern, da Beobachtung nach hinten noch\nteilweise m\u00F6glich ist","Kh\u00F4ng thay g\u01B0\u01A1ng m\u1EDBi, v\u00EC v\u1EABn c\u00F2n nh\u00ECn th\u1EA5y ph\u00EDa sau \u0111\u00F4i ch\u00FAt")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-116
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(902);
	    	
	    	q.setName("2.7.02-116");

			q.setText(new TranslatedString("Das korrekte Einstellen des linken Au\u00DFenspiegels ist nicht m\u00F6glich. \nWas tun Sie?","B\u1EA1n kh\u00F4ng th\u1EC3 ch\u1EC9nh \u0111\u00FAng g\u01B0\u01A1ng b\u00EAn tr\u00E1i. B\u1EA1n ph\u1EA3i l\u00E0m sao?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verstelleinrichtung instand setzen lassen","S\u1EEDa b\u1ED9 ph\u1EADn \u0111i\u1EC1u ch\u1EC9nh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nichts, da die Beobachtung \u00FCber den Innenspiegel ausreicht","Kh\u00F4ng l\u00E0m g\u00EC, v\u00EC c\u00F3 th\u1EC3 quan s\u00E1t qua g\u01B0\u01A1ng chi\u1EBFu h\u1EADu")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-117
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(903);
	    	
	    	q.setName("2.7.02-117");

			q.setText(new TranslatedString("Die Scheibenwaschanlage funktioniert nicht. Woran kann das \nliegen?","B\u1ED9 lau k\u00EDnh kh\u00F4ng ho\u1EA1t \u0111\u1ED9ng. T\u1EA1i sao ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kein Wasser im Vorratsbeh\u00E4lter","Kh\u00F4ng c\u00F3 n\u01B0\u1EDBc trong b\u00ECnh ch\u1EE9a")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sicherung defekt","C\u1EA7u ch\u00EC h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("D\u00FCsen verstopft","V\u00F2i n\u01B0\u1EDBc b\u1ECB k\u1EB9t")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(904);
	    	
	    	q.setName("2.7.02-118");

			q.setText(new TranslatedString("Aus den D\u00FCsen der Scheibenwaschanlage kommt zu wenig Wasser. \nWas kann die Ursache daf\u00FCr sein?","R\u1EA5t \u00EDt n\u01B0\u1EDBc phun ra t\u1EEB v\u00F2i phun c\u1EE7a b\u1ED9 lau k\u00EDnh. Nguy\u00EAn nh\u00E2n c\u00F3 th\u1EC3 do \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("D\u00FCsen sind teilweise verstopft","V\u00F2i b\u1ECB k\u1EB9t m\u1ED9t ph\u1EA7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wasserf\u00F6rderpumpe defekt","B\u01A1m n\u01B0\u1EDBc b\u1ECB h\u1ECFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zu viel Wasser im Vorratsbeh\u00E4lter","Qu\u00E1 nhi\u1EC1u n\u01B0\u1EDBc trong b\u00ECnh ch\u1EE9a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-119
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(905);
	    	
	    	q.setName("2.7.02-119");

			q.setText(new TranslatedString("Woran kann es liegen, wenn die Scheibenwischer nicht mehr \nsauber wischen?","T\u1EA1i sao b\u1ED9 lau k\u00EDnh kh\u00F4ng th\u1EC3 lau s\u1EA1ch n\u1EEFa?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Scheibenwischerbl\u00E4tter sind abgenutzt","\u0110\u1EC7m cao su tr\u00EAn thanh g\u1EA1t lau k\u00EDnh b\u1ECB m\u00F2n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u00D6lfilm auf der Scheibe","C\u00F3 v\u1EC7t d\u1EA7u tr\u00EAn thanh g\u1EA1t n\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Scheibenheizung ist defekt","B\u1ED9 ph\u1EADn l\u00F2 s\u01B0\u1EDFi ch\u1ED1ng \u0111\u00F4ng b\u1ECB h\u1ECFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-120
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(906);
	    	
	    	q.setName("2.7.02-120");

			q.setText(new TranslatedString("Die Scheibenwischer an Ihrem Pkw funktionieren nicht. Was kann \ndie Ursache daf\u00FCr sein?","Thanh lau k\u00EDnh tr\u00EAn xe kh\u00F4ng ho\u1EA1t \u0111\u1ED9ng. Nguy\u00EAn nh\u00E2n c\u00F3 th\u1EC3 l\u00E0 g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sicherung durchgebrannt","C\u1EA7u ch\u00EC b\u1ECB ch\u00E1y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Scheibenwischermotor defekt","M\u00F4 t\u00F4 c\u1EE7a thanh g\u1EA1t n\u01B0\u1EDBc h\u1ECFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zu viel Wasser in der Scheibenwaschanlage","Qu\u00E1 nhi\u1EC1u n\u01B0\u1EDBc trong h\u1EC7 th\u1ED1ng lau k\u00EDnh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-121
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(907);
	    	
	    	q.setName("2.7.02-121");

			q.setText(new TranslatedString("Das Schloss eines Sicherheitsgurtes schlie\u00DFt nicht. Was tun Sie?","Ch\u1ED1t d\u00E2y an to\u00E0n kh\u00F4ng kh\u00F3a \u0111\u01B0\u1EE3c. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schloss instand setzen lassen","S\u1EEDa ch\u1ED1t d\u00E2y an to\u00E0n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nichts, weil der Sitz mit Airbag ausger\u00FCstet ist","Kh\u00F4ng l\u00E0m g\u00EC, v\u00EC ch\u1ED7 ng\u1ED3i c\u00F3 trang b\u1ECB t\u00FAi kh\u00ED")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit geringer Geschwindigkeit fahren","L\u00E1i xe ch\u1EADm h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-122
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(908);
	    	
	    	q.setName("2.7.02-122");

			q.setText(new TranslatedString("Der Sicherheitsgurt rollt sich nicht mehr automatisch auf. Woran \nkann das liegen?","D\u00E2y \u0111ai an to\u00E0n kh\u00F4ng t\u1EF1 \u0111\u1ED9ng k\u00E9o ra \u0111\u01B0\u1EE3c n\u1EEFa. T\u1EA1i sao?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sicherheitsgurt ist verdreht","D\u00E2y \u0111ai an to\u00E0n b\u1ECB h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Automatische Aufrollvorrichtung ist defekt","B\u1ED9 cu\u1ED1n d\u00E2y t\u1EF1 \u0111\u1ED9ng b\u1ECB h\u1ECFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sitzverstellung ist defekt","B\u1ED9 \u0111i\u1EC1u ch\u1EC9nh gh\u1EBF b\u1ECB h\u1ECFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-123
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(909);
	    	
	    	q.setName("2.7.02-123");

			q.setText(new TranslatedString("In Ihrem Pkw flattert das Lenkrad w\u00E4hrend der Fahrt. Woran kann \ndas liegen?","Trong khi l\u00E1i, tay l\u00E1i b\u1ECB rung. T\u1EA1i sao?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("R\u00E4der haben Unwucht","B\u00E1nh xe kh\u00F4ng c\u00E2n b\u1EB1ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sto\u00DFd\u00E4mpfer sind defekt","B\u1ED9 gi\u1EA3m s\u00F3c b\u1ECB h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Federung ist schadhaft","L\u00F2 xo nh\u00FAn b\u1ECB h\u1ECFng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-124
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(910);
	    	
	    	q.setName("2.7.02-124");

			q.setText(new TranslatedString("Woran kann es liegen, wenn sich an der Vorderachse ein Reifen \neinseitig st\u00E4rker abnutzt?","T\u1EA1i sao m\u1ED9t l\u1ED1p xe \u1EDF tr\u1EE5c tr\u01B0\u1EDBc b\u1ECB m\u00F2n m\u1ED9t b\u00EAn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Spureinstellung nicht in Ordnung","B\u00E1nh xe l\u1EAFp kh\u00F4ng c\u00E2n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Achslenker verbogen","Tr\u1EE5c d\u1EABn b\u1ECB cong")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-125
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(911);
	    	
	    	q.setName("2.7.02-125");

			q.setText(new TranslatedString("Was kann die Ursache f\u00FCr eine \u00FCberm\u00E4\u00DFige Abnutzung der Reifen \nsein?","Nguy\u00EAn nh\u00E2n n\u00E0o d\u1EABn \u0111\u1EBFn l\u1ED1p b\u1ECB m\u00F2n nhi\u1EC1u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sch\u00E4den an der Federung","L\u00F2 xo h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Falscher Reifenluftdruck","\u0110\u1ED9 c\u0103ng l\u1ED1p kh\u00F4ng \u0111\u00FAng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Anbau eines Frontspoilers","Do g\u1EAFn th\u00EAm thanh l\u00E1i gi\u00F3 ph\u00EDa tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-126
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(912);
	    	
	    	q.setName("2.7.02-126");

			q.setText(new TranslatedString("W\u00E4hrend der Fahrt zieht Ihr Fahrzeug nach rechts. Woran kann das \nliegen?","Trong khi \u0111ang l\u00E1i, xe b\u1EA1n b\u1ECB k\u00E9o v\u1EC1 b\u00EAn ph\u1EA3i. T\u1EA1i sao?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Achslenker verbogen","Tr\u1EE5c d\u1EABn b\u1ECB cong")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Radeinstellung nicht in Ordnung","B\u00E1nh xe \u0111\u01B0\u1EE3c l\u1EAFp kh\u00F4ng \u0111\u00FAng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Lenkungsd\u00E4mpfer lose","B\u1ED9 gi\u1EA3m s\u00F3c tay l\u00E1i b\u1ECB l\u1ECFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.06-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(913);
	    	
	    	q.setName("2.7.06-101");

			q.setText(new TranslatedString("Was bewirkt ein Antiblockiersystem (ABS)?","H\u1EC7 th\u1ED1ng ch\u1ED1ng kh\u00F3a c\u00F3 t\u00E1c d\u1EE5ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auch bei glatter Fahrbahn wird das Fahrzeug bestm\u00F6glich gebremst","Ngay c\u1EA3 tr\u00EAn \u0111\u01B0\u1EDDng \u01B0\u1EDBt, phanh xe \u1EDF m\u1EE9c t\u1ED1t nh\u1EA5t c\u00F3 th\u1EC3")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Bremsen bleibt die Lenkf\u00E4higkeit weitgehend erhalten","Duy tr\u00EC kh\u1EA3 n\u0103ng b\u1EBB l\u00E1i khi phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Aquaplaning wird verhindert","Tr\u00E1nh tr\u01B0\u1EE3t n\u01B0\u1EDBc tr\u00EAn \u0111\u01B0\u1EDDng \u01B0\u1EDBt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.06-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(914);
	    	
	    	q.setName("2.7.06-102");

			q.setText(new TranslatedString("Was m\u00FCssen Sie als Fahrer eines Zuges mit auflaufgebremstem \nAnh\u00E4nger vor Fahrtantritt \u00FCberpr\u00FCfen?","Tr\u01B0\u1EDBc khi xu\u1EA5t ph\u00E1t xe c\u00F3 r\u01A1-mooc v\u1EDBi phanh d\u1ED3n, b\u1EA1n ph\u1EA3i ki\u1EC3m tra \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ob die Auflaufbremse wirkt","Phanh d\u1ED3n c\u00F3 t\u00E1c d\u1EE5ng kh\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ob die Druckluftschl\u00E4uche angekuppelt sind","D\u00E2y d\u1EABn kh\u00ED n\u00E9n \u0111\u00E3 n\u1ED1i v\u00E0o kh\u1EDBp ch\u01B0a")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.06-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(915);
	    	
	    	q.setName("2.7.06-103");

			q.setText(new TranslatedString("Welche Vorteile bietet ein Antiblockiersystem (ABS)?","L\u1EE3i \u00EDch c\u1EE7a h\u1EC7 th\u1ED1ng ch\u1ED1ng kh\u00F3a l\u00E0 g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Bremsen wird das Blockieren der R\u00E4der verhindert","Khi phanh, tr\u00E1nh kh\u1EA3 n\u0103ng b\u1ECB kh\u00F3a b\u00E1nh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Selbst bei starkem Bremsen bleibt die Lenkf\u00E4higkeit erhalten","T\u1EF1 duy tr\u00EC kh\u1EA3 n\u0103ng b\u1EBB l\u00E1i khi phanh g\u1EA5p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kurven k\u00F6nnen wesentlich schneller durchfahren werden","Khi v\u00E0o cua v\u1EC1 c\u01A1 b\u1EA3n c\u00F3 th\u1EC3 \u0111i nhanh h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.06-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(916);
	    	
	    	q.setName("2.7.06-104");

			q.setText(new TranslatedString("Welche Vorteile bietet ein Antiblockiersystem (ABS)?","L\u1EE3i \u00EDch c\u1EE7a h\u1EC7 th\u1ED1ng ch\u1ED1ng kh\u00F3a l\u00E0 g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Starkes Bremsen und gleichzeitiges Ausweichen ist m\u00F6glich","C\u00F3 th\u1EC3 v\u1EEBa phanh g\u1EA5p v\u1EEBa l\u1EA1ng tr\u00E1nh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Durchdrehen der R\u00E4der beim Anfahren wird verhindert","Tr\u00E1nh tr\u01B0\u1EE3t b\u00E1nh khi kh\u1EDFi \u0111\u1ED9ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Bremsen in Kurven wird die Kippgefahr vermindert","Tr\u00E1nh l\u1EA1ng xe khi phanh trong v\u00F2ng cua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.06-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(917);
	    	
	    	q.setName("2.7.06-105");

			q.setText(new TranslatedString("Wann tritt bei einem Anh\u00E4nger mit Auflaufbremse die \nBremswirkung ein?","R\u01A1-mooc c\u00F3 phanh Auflaufbremse \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn kh\u1EA3 n\u0103ng phanh khi n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Auflaufen des Anh\u00E4ngers auf das Zugfahrzeug","Beim Auflaufen des Anh\u00E4ngers auf das Zugfahrzeug")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zeitgleich mit der Bet\u00E4tigung des Bremspedals im Zugfahrzeug","\u0110\u1ED3ng th\u1EDDi v\u1EDBi khi nh\u1EA5n b\u00E0n \u0111\u1EA1p phanh tr\u00EAn xe k\u00E9o")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor Eintreten der Bremswirkung beim Zugfahrzeug, damit der Zug\ngestreckt bleibt","Tr\u01B0\u1EDBc khi phanh c\u00F3 t\u00E1c d\u1EE5ng \u1EDF xe k\u00E9o, \u0111\u1EC3 xe k\u00E9o c\u00F2n ph\u1EA3i c\u0103ng l\u00EAn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.06-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(918);
	    	
	    	q.setName("2.7.06-106");

			q.setText(new TranslatedString("Was m\u00FCssen Sie als Fahrer eines Zuges mit auflaufgebremstem \nAnh\u00E4nger beachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi l\u00E1i xe c\u00F3 r\u01A1-mooc \u0111\u01B0\u1EE3c trang b\u1ECB phanh qu\u00E1n t\u00EDnh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("R\u00FCckwartsfahren mit dem Zug ist nicht bei allen Anh\u00E4ngern ohne\nweiteres m\u00F6glich","R\u00FCckwartsfahren mit dem Zug ist nicht bei allen Anh\u00E4ngern ohne\nweiteres m\u00F6glich")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei manchen Anh\u00E4ngern muss vor dem R\u00FCckw\u00E4rtsfahren die\n\u201ER\u00FCckfahrsperre\u201C eingelegt werden","Bei manchen Anh\u00E4ngern muss vor dem R\u00FCckw\u00E4rtsfahren die\n\u201ER\u00FCckfahrsperre\u201C eingelegt werden")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bei manchen Anh\u00E4ngern muss vor dem Vorw\u00E4rtsfahren die\n\u201ER\u00FCckfahrsperre\u201C eingelegt werden","Bei manchen Anh\u00E4ngern muss vor dem Vorw\u00E4rtsfahren die\n\u201ER\u00FCckfahrsperre\u201C eingelegt werden")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.10-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(919);
	    	
	    	q.setName("2.7.10-101");

			q.setText(new TranslatedString("Ein Pkw ist mit Winterreifen (M+S) ausger\u00FCstet. Am Armaturenbrett \nist ein Aufkleber \u201EMit M+S 160\u201C angebracht. Was bedeutet das?","Xe Pkw \u0111\u01B0\u1EE3c trang b\u1ECB l\u1ED1p m\u00F9a \u0111\u00F4ng (M+S). Tr\u00EAn b\u1EA3ng \u0111i\u1EC1u khi\u1EC3n c\u00F3 decal h\u01B0\u1EDBng d\u1EABn \u201EMit M+S 160\u201C. \u0110i\u1EC1u n\u00E0y c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Man darf h\u00F6chstens 160 km/h fahren","\u0110\u01B0\u1EE3c ph\u00E9p ch\u1EA1y t\u1ED1i \u0111a 160 km/h")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Aufkleber gilt nicht bei trockener Fahrbahn","Decal h\u01B0\u1EDBng d\u1EABn kh\u00F4ng \u00E1p d\u1EE5ng cho \u0111\u01B0\u1EDDng kh\u00F4")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Aufkleber gilt nicht bei regennasser Fahrbahn","Decal h\u01B0\u1EDBng d\u1EABn kh\u00F4ng \u00E1p d\u1EE5ng cho \u0111\u01B0\u1EDDng \u01B0\u1EDBt m\u01B0a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.10-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(920);
	    	
	    	q.setName("2.7.10-102");

			q.setText(new TranslatedString("Was ist nach der Umr\u00FCstung auf Winterreifen (M+S) zu beachten?","Ch\u00FA \u00FD g\u00EC sau khi thay l\u1ED1p m\u00F9a \u0111\u00F4ng (M+S)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Luftdruck soll etwas h\u00F6her als bei Sommerreifen sein (ca. 0,2 bar)","\u0110\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p cao h\u01A1n l\u1ED1p m\u00F9a h\u00E8 1 ch\u00FAt (kho\u1EA3ng 2 v\u1EA1ch)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf trockener Fahrbahn k\u00F6nnen die Fahreigenschaften anders sein","Tr\u00EAn \u0111\u01B0\u1EDDng kh\u00F4, kh\u1EA3 n\u0103ng c\u1EE7a xe c\u00F3 th\u1EC3 thay \u0111\u1ED5i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Luftdruck soll niedriger als bei Sommerreifen sein","\u0110\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p th\u1EA5p h\u01A1n so v\u1EDBi l\u1ED1p m\u00F9a h\u00E8")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.8.01-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(921);
	    	
	    	q.setName("2.8.01-001");

			q.setText(new TranslatedString("Wie lange dauert normalerweise die Probezeit?","Th\u1EDDi gian ch\u1EA1y th\u1EED sau khi c\u00F3 b\u1EB1ng l\u00E1i th\u01B0\u1EDDng k\u00E9o d\u00E0i bao l\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("2 Jahre","2 n\u0103m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("1 Jahr","1 n\u0103m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("3 Jahre","3 n\u0103m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.8.01-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(922);
	    	
	    	q.setName("2.8.01-002");

			q.setText(new TranslatedString("Ein Fahranf\u00E4nger parkt innerhalb der Probezeit falsch und muss \ndaf\u00FCr Verwarnungsgeld zahlen. Womit muss er au\u00DFerdem rechnen?","M\u1ED9t ng\u01B0\u1EDDi m\u1EDBi bi\u1EBFt l\u00E1i \u0111ang trong th\u1EDDi gian th\u1EED th\u00E1ch \u0111\u1EADu xe sai v\u00E0 ph\u1EA3i tr\u1EA3 ti\u1EC1n ph\u1EA1t c\u1EA3nh c\u00E1o. Ngo\u00E0i ra anh ta ph\u1EA3i t\u00EDnh \u0111\u1EBFn nh\u1EEFng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach Zahlung des Verwarnungsgeldes mit keinen weiteren\nMa\u00DFnahmen","Sau khi tr\u1EA3 ti\u1EC1n ph\u1EA1t c\u1EA3nh c\u00E1o, kh\u00F4ng ph\u1EA3i l\u00E0m g\u00EC kh\u00E1c n\u1EEFa")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit der Anordnung zur Teilnahme an einem Aufbauseminar","Ph\u1EA3i s\u1EAFp x\u1EBFp tham gia kh\u00F3a h\u1ECDc b\u1ED5 sung")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit der erneuten Ablegung der Fahrerlaubnispr\u00FCfung","T\u1EEB ch\u1ED1i c\u1EA5p m\u1EDBi gi\u1EA5y ph\u00E9p thi b\u1EB1ng l\u00E1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.8.01-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(923);
	    	
	    	q.setName("2.8.01-003");

			q.setText(new TranslatedString("Ein Fahranf\u00E4nger h\u00E4lt w\u00E4hrend der Probezeit nicht an einem \nSTOP-Schild und gef\u00E4hrdet einen anderen Verkehrsteilnehmer. Er \nerh\u00E4lt daf\u00FCr einen Bu\u00DFgeldbescheid sowie einen Eintrag im \nVerkehrszentralregister. Womit muss er au\u00DFerdem rechnen?","M\u1ED9t ng\u01B0\u1EDDi m\u1EDBi bi\u1EBFt l\u00E1i \u0111ang trong th\u1EDDi gian th\u1EED th\u00E1ch kh\u00F4ng d\u1EEBng \u1EDF bi\u1EC3n STOP v\u00E0 g\u00E2y nguy hi\u1EC3m cho ph\u01B0\u01A1ng ti\u1EC7n giao th\u00F4ng kh\u00E1c. Anh ta s\u1EBD ph\u1EA3i \u0111\u00F3ng ti\u1EC1n ph\u1EA1t v\u00E0 b\u1ECB ghi t\u00EAn v\u00E0o s\u1ED5 \u0111en \u1EDF trung t\u00E2m \u0111\u0103ng k\u00FD giao th\u00F4ng. Ngo\u00E0i ra anh ta c\u00F2n ph\u1EA3i l\u00E0m g\u00EC n\u1EEFa?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit der Anordnung zur Teilnahme an einem Aufbauseminar","S\u1EAFp x\u1EBFp th\u1EDDi gian tham gia kh\u00F3a h\u1ECDc b\u1ED5 sung")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach Zahlung des Bu\u00DFgeldes muss er mit keinen weiteren\nMa\u00DFnahmen rechnen","Sau khi tr\u1EA3 ti\u1EC1n ph\u1EA1t, anh ta kh\u00F4ng ph\u1EA3i l\u00E0m g\u00EC kh\u00E1c")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.8.01-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(924);
	    	
	    	q.setName("2.8.01-004");

			q.setText(new TranslatedString("Aufgrund mehrerer Verst\u00F6\u00DFe innerhalb der Probezeit hat die \nBeh\u00F6rde die Teilnahme an einem Aufbauseminar angeordnet. Der \nFahranf\u00E4nger kommt dieser Anordnung nicht nach. Womit muss er \njetzt rechnen?","Do b\u1ECB vi ph\u1EA1m trong th\u1EDDi gian th\u1EED th\u00E1ch, m\u1ED9t ng\u01B0\u1EDDi m\u1EDBi t\u1EADp l\u00E1i ph\u1EA3i tham gia kh\u00F3a h\u1ECDc b\u1ED5 sung. Tuy nhi\u00EAn anh ta l\u1EA1i kh\u00F4ng tham gia. Anh ta s\u1EBD ph\u1EA3i b\u1ECB ph\u1EA1t th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit dem Entzug der Fahrerlaubnis","R\u00FAt gi\u1EA5y ph\u00E9p l\u00E1i xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit einem Bu\u00DFgeldbescheid wegen der Nichtteilnahme","Ph\u1EA1t th\u00EAm ti\u1EC1n do kh\u00F4ng tham gia kh\u00F3a h\u1ECDc")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.8.01-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(925);
	    	
	    	q.setName("2.8.01-005");

			q.setText(new TranslatedString("Was f\u00FChrt in der Probezeit zur Anordnung, an einem \nAufbauseminar teilzunehmen?","Trong th\u1EDDi gian th\u1EED th\u00E1ch, nh\u01B0 th\u1EBF n\u00E0o th\u00EC b\u1ECB ph\u1EA1t tham d\u1EF1 kh\u00F3a h\u1ECDc b\u1ED5 sung?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verkehrsstraftaten, die in das Verkehrszentralregister eingetragen\nwurden","B\u1ECB ghi t\u1ED9i \u1EDF trung t\u00E2m qu\u1EA3n l\u00FD giao th\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verkehrsordnungswidrigkeiten mit Bu\u00DFgeld und Fahrverbot","G\u00E2y r\u1ED1i tr\u1EADt t\u1EF1 giao th\u00F4ng b\u1ECB ph\u1EA1t ti\u1EC1n v\u00E0 c\u1EA5m l\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verkehrsordnungswidrigkeiten mit Verwarnungsgeld","G\u00E2y r\u1ED1i tr\u1EADt t\u1EF1 giao th\u00F4ng v\u00E0 b\u1ECB ph\u1EA1t c\u1EA3nh c\u00E1o")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.8.01-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(926);
	    	
	    	q.setName("2.8.01-006");

			q.setText(new TranslatedString("Was soll mit der Teilnahme an einem Aufbauseminar innerhalb der \nProbezeit erreicht werden?","Ng\u01B0\u1EDDi tham gia kh\u00F3a h\u1ECDc b\u1ED5 sung \u1EDF trong th\u1EDDi gian l\u00E1i th\u1EED s\u1EBD g\u1EB7t h\u00E1i \u0111\u01B0\u1EE3c g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine r\u00FCcksichtsvollere und risikobewusstere Einstellung zum\nStra\u00DFenverkehr","Trau d\u1ED3i s\u1EF1 c\u1EA9n th\u1EADn v\u00E0 nh\u1EADn th\u1EE9c c\u00E1c nguy c\u01A1 tr\u00EAn \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine Verbesserung der Gefahrenerkennung","Nh\u1EADn th\u1EE9c t\u1ED1t h\u01A1n v\u1EC1 nguy hi\u1EC3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ein Abbau der Punkte im Verkehrszentralregister","\u0110\u1EC3 l\u1EA5y \u0111i\u1EC3m \u1EDF trung t\u00E2m qu\u1EA3n l\u00FD giao th\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.8.01-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(927);
	    	
	    	q.setName("2.8.01-007");

			q.setText(new TranslatedString("Ein Fahrerlaubnisbewerber wird w\u00E4hrend seiner Ausbildung \u201Ebeim \nSchwarzfahren mit einem Kraftfahrzeug erwischt\u201C. Kann dies ein \nGrund sein, ihm die Fahrerlaubnis zu versagen?","Ng\u01B0\u1EDDi \u0111\u0103ng k\u00FD thi l\u00E1i xe trong th\u1EDDi gian h\u1ECDc b\u1ECB b\u1EAFt l\u00E1i xe l\u1EADu. \nC\u00F3 th\u1EC3 v\u00EC l\u00FD do n\u00E0y m\u00E0 anh ta b\u1ECB t\u1EEB ch\u1ED1i c\u1EA5p gi\u1EA5y ph\u00E9p l\u00E1i xe kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, weil dadurch Zweifel an seiner charakterlichen Eignung entstehen","C\u00F3, v\u00EC ng\u01B0\u1EDDi ta nghi ng\u1EDD t\u01B0 c\u00E1ch c\u1EE7a anh ta")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nein, weil nur die k\u00F6rperliche und geistige Eignung ausschlaggebend\nist","Kh\u00F4ng, v\u00EC n\u0103ng l\u1EF1c th\u1EA7n kinh v\u00E0 n\u0103ng l\u1EF1c th\u1EC3 ch\u1EA5t m\u1EDBi l\u00E0 \u0111i\u1EC1u t\u1ED1i c\u1EA7n thi\u1EBFt")));
		    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
