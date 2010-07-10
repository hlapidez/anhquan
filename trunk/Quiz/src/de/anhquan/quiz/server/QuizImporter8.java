package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter8 {

	static {
		
				
		//Question 2.5.01-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(801);
	    	
	    	q.setName("2.5.01-008");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, um die Luftverschmutzung m\u00F6glichst gering \nzu halten?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC \u0111\u1EC3 l\u00E0m gi\u1EA3m m\u1EE9c \u00F4 nhi\u1EC5m kh\u00F4ng kh\u00ED \u1EDF m\u1EE9c t\u1ED1i thi\u1EC3u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mangel bei st\u00E4rkerem Auspuffqualm unverz\u00FCglich beheben","S\u1EEDa ngay nh\u1EEFng l\u1ED7i g\u00E2y kh\u00F3i \u0111\u1EB7c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei l\u00E4ngerem Warten Motor immer abstellen","Khi ch\u1EDD l\u00E2u lu\u00F4n t\u1EAFt \u0111\u1ED9ng c\u01A1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("M\u00F6glichst immer mit hoher Drehzahl fahren","Lu\u00F4n l\u00E1i xe v\u1EDBi s\u1ED1 cao n\u1EBFu c\u00F3 th\u1EC3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(802);
	    	
	    	q.setName("2.5.01-009");

			q.setText(new TranslatedString("Wie k\u00F6nnen Sie nach einem Kaltstart die Umwelt und den Motor \nschonen?","B\u1EA1n c\u00F3 th\u1EC3 b\u1EA3o v\u1EC7 m\u00F4i tr\u01B0\u1EDDng v\u00E0 \u0111\u1ED9ng c\u01A1 th\u1EBF n\u00E0o khi \"kh\u1EDFi \u0111\u1ED9ng l\u1EA1nh\" (kh\u1EDFi \u0111\u1ED9ng xe khi xe c\u00F2n ch\u01B0a n\u00F3ng)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ohne Warmlaufenlassen des Motors mit niedriger Drehzahl losfahren","Kh\u00F4ng \u0111i v\u1EDBi s\u1ED1 th\u1EA5p khi ch\u01B0a l\u00E0m n\u00F3ng \u0111\u1ED9ng c\u01A1")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kein Gas geben, Motor im Stand warmlaufen lassen","Kh\u00F4ng nh\u1EA5n ga, \u0111\u1EC3 xe ch\u1EA1y n\u00F3ng t\u1EA1i ch\u1ED7")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mehrmals im Stand Gas geben, um rasch die g\u00FCnstige\nBetriebstemperatur zu erreichen","Nh\u1EA5n ga nhi\u1EC1u l\u1EA7n khi xe \u0111ang \u0111\u1EE9ng, \u0111\u1EC3 nhanh ch\u00F3ng \u0111\u1EA1t \u0111\u1EBFn nhi\u1EC7u \u0111\u1ED9 ho\u1EA1t \u0111\u1ED9ng b\u00ECnh th\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(803);
	    	
	    	q.setName("2.5.01-010");

			q.setText(new TranslatedString("Welche Kraftfahrzeuge d\u00FCrfen in die abgebildete Umweltzone?","Lo\u1EA1i xe n\u00E0o \u0111\u01B0\u1EE3c ph\u00E9p \u0111i v\u00E0o v\u00F9ng b\u1EA3o v\u1EC7 m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.5.01-010.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ein Pkw mit einer roten Feinstaub-Plakette","Xe Pkw v\u1EDBi nh\u00E3n m\u00E0u \u0111\u1ECF \"Feinstaub\"")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ein Motorrad","Xe m\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ein Pkw, der die Anforderungen an eine gr\u00FCne Plakette erf\u00FCllt, auch\nwenn keine Feinstaub-Plakette angebracht ist","Xe Pkw, lo\u1EA1i \u0111\u00E1p \u1EE9ng y\u00EAu c\u1EA7u nh\u00E3n xanh, v\u00E0 c\u1EA3 khi kh\u00F4ng mang nh\u00E3n \"Feinstaub\"")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-016
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(804);
	    	
	    	q.setName("2.5.01-016");

			q.setText(new TranslatedString("Wann d\u00FCrfen Sie in eine Umweltzone einfahren?","Khi n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p \u0111i v\u00E0o v\u00F9ng b\u1EA3o v\u1EC7 m\u00F4i tr\u01B0\u1EDDng (Umweltzone)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Ihr Pkw mit einer entsprechenden Feinstaub-Plakette\ngekennzeichnet ist","Khi xe c\u00F3 d\u00E1n nh\u00E3n Feinstaub")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Ihr Pkw Sonderrechte in Anspruch nehmen kann","Khi xe \u0111\u01B0\u1EE3c trao quy\u1EC1n \u0111\u1EB7c bi\u1EC7t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Ihr Pkw schadstoffarm ist","Khi xe b\u1EA1n \u00EDt g\u00E2y \u00F4 nhi\u1EC5m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-017
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(805);
	    	
	    	q.setName("2.5.01-017");

			q.setText(new TranslatedString("Wo ist die Feinstaub-Plakette zur Kennzeichnung schadstoffarmer \nFahrzeuge anzubringen?","Nh\u00E3n Feinstaub n\u00EAn d\u00E1n \u1EDF \u0111\u00E2u trong xe \u0111\u1EC3 d\u1EC5 nh\u00ECn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Deutlich sichtbar auf der Innenseite der Windschutzscheibe","D\u00E1n r\u00F5 r\u00E0ng \u1EDF m\u1EB7t trong c\u1EE7a k\u00EDnh ch\u1EAFn gi\u00F3 ph\u00EDa tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Deutlich sichtbar auf der Au\u00DFenseite der Windschutzscheibe","D\u00E1n r\u00F5 r\u00E0ng \u1EDF m\u1EB7t ngo\u00E0i c\u1EE7a k\u00EDnh ch\u1EAFn gi\u00F3 ph\u00EDa tr\u01B0\u1EDBc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Deutlich sichtbar auf der Innenseite der Heckscheibe","D\u00E1n r\u00F5 r\u00E0ng \u1EDF m\u1EB7t trong c\u1EE7a k\u00EDnh ch\u1EAFn ph\u00EDa sau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(806);
	    	
	    	q.setName("2.5.01-101");

			q.setText(new TranslatedString("Was sind vermeidbare L\u00E4rmbel\u00E4stigungen?","Nh\u1EEFng \u00F4 nhi\u1EC5m ti\u1EBFng \u1ED3n n\u00E0o c\u00F3 th\u1EC3 tr\u00E1nh \u0111\u01B0\u1EE3c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vollgasgeben beim Anfahren","Nh\u1EA5n ga h\u1EBFt c\u1EE1 khi kh\u1EDFi \u0111\u1ED9ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Lautes Zuschlagen von T\u00FCren","\u0110\u00F3ng c\u1EEDa m\u1EA1nh g\u00E2y \u1ED3n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Benutzung der Hupe zur Begr\u00FC\u00DFung","D\u00F9ng c\u00F2i \u0111\u1EC3 c\u1ED5 \u0111\u1ED9ng, ch\u00E0o m\u1EEBng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(807);
	    	
	    	q.setName("2.5.01-102");

			q.setText(new TranslatedString("Was m\u00FCssen Sie \u00FCber Katalysatoren wissen?","B\u1EA1n ph\u1EA3i bi\u1EBFt g\u00EC v\u1EC1 Katalysator?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Anschleppen des Fahrzeugs kann es zur Zerst\u00F6rung oder\nBesch\u00E4digung des Katalysators kommen","Khi k\u00E9o xe, c\u00F3 th\u1EC3 ph\u00E1 h\u1EE7y hay l\u00E0m h\u1ECFng Katalysator")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Anspringen des Motors nach vielen vergeblichen\nStartversuchen kann der Katalysator besch\u00E4digt werden","Khi kh\u1EDFi \u0111\u1ED9ng \u0111\u1ED9ng c\u01A1, sau nhi\u1EC1u l\u1EA7n kh\u1EDFi \u0111\u1ED9ng kh\u00F4ng th\u00E0nh c\u00F4ng c\u00F3 th\u1EC3 d\u1EABn \u0111\u1EBFn l\u00E0m h\u1ECFng Katalysator")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unverbrannter Kraftstoff im Katalysator kann beim Anspringen des\nMotors keine Sch\u00E4den verursachen","Nhi\u00EAn li\u1EC7u ch\u01B0a ch\u00E1y trong b\u1ED9 \u0111\u1EC1 c\u00F3 th\u1EC3 kh\u00F4ng g\u00E2y ra h\u01B0 h\u1EA1i khi kh\u1EDFi \u0111\u1ED9ng \u0111\u1ED9ng c\u01A1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(808);
	    	
	    	q.setName("2.5.01-103");

			q.setText(new TranslatedString("Reifenverschlei\u00DF belastet die Umwelt. Wodurch kann die \nLebensdauer von Reifen verl\u00E4ngert werden?","M\u00F2n l\u1ED1p g\u00E2y h\u1EA1i cho m\u00F4i tr\u01B0\u1EDDng. L\u00E0m sao \u0111\u1EC3 k\u00E9o d\u00E0i tu\u1ED5i th\u1ECD c\u1EE7a l\u1ED1p xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Vermeiden hoher Geschwindigkeiten","Tr\u00E1nh \u0111i t\u1ED1c \u0111\u1ED9 cao")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Einhalten des Reifendrucks, der in der Betriebsanleitung\nangegeben ist","Gi\u1EEF \u0111\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p theo nh\u01B0 t\u00E0i li\u1EC7u h\u01B0\u1EDBng d\u1EABn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Fahren mit Winterreifen (M+S) im Sommer","V\u00E0o m\u00F9a h\u00E8, l\u00E1i xe v\u1EDBi l\u1ED1p m\u00F9a \u0111\u00F4ng (M+S)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(809);
	    	
	    	q.setName("2.5.01-104");

			q.setText(new TranslatedString("Wodurch k\u00F6nnen Sie Kraftstoff sparen, wenn Sie ein Kraftfahrzeug \nmit automatischem Getriebe fahren?","L\u00E0m sao \u0111\u1EC3 ti\u1EBFt ki\u1EC7m nhi\u00EAn li\u1EC7u, khi b\u1EA1n l\u00E1i xe b\u1EB1ng s\u1ED1 t\u1EF1 \u0111\u1ED9ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach M\u00F6glichkeit auf den \u201EKick down\u201C verzichten","N\u1EBFu c\u00F3 th\u1EC3, tr\u00E1nh d\u00F9ng \u201EKick down\u201C")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Fahren im Stadtverkehr den Wahlhebel immer auf die kleinste\nFahrstufe stellen","Khi l\u00E1i xe trong th\u00E0nh ph\u1ED1, ch\u1EC9nh b\u1ED9 chuy\u1EC3n s\u1ED1 t\u1EF1 \u0111\u1ED9ng \u1EDF m\u1EE9c nh\u1ECF nh\u1EA5t")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("M\u00F6glichst oft in der Stufe \u201EP\u201C fahren","N\u1EBFu c\u00F3 th\u1EC3, th\u01B0\u1EDDng xuy\u00EAn l\u00E1i xe \u1EDF m\u1EE9c \u201EP\u201C")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(810);
	    	
	    	q.setName("2.5.01-105");

			q.setText(new TranslatedString("Wodurch k\u00F6nnen Sie die Umweltbelastung verringern?","B\u1EA1n c\u00F3 th\u1EC3 l\u00E0m g\u00EC \u0111\u1EC3 gi\u1EA3m \u00F4 nhi\u1EC5m m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Bilden von Fahrgemeinschaften","Th\u00E0nh l\u1EADp h\u1ED9i d\u00F9ng xe chung")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Meiden von Verkehrsspitzen","Tr\u00E1nh gi\u1EDD cao \u0111i\u1EC3m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Meiden von Stra\u00DFen mit h\u00E4ufigem Stau","Tr\u00E1nh \u0111\u01B0\u1EDDng hay c\u00F3 k\u1EB9t xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(811);
	    	
	    	q.setName("2.5.01-106");

			q.setText(new TranslatedString("Wodurch erh\u00F6ht sich der Kraftstoffverbrauch Ihres Pkw?","\u0110i\u1EC1u g\u00EC l\u00E0m t\u0103ng m\u1EE9c s\u1EED d\u1EE5ng nhi\u00EAn li\u1EC7u c\u1EE7a xe b\u1EA1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Dachgep\u00E4cktr\u00E4ger oder Skihalter","G\u1EAFn gi\u00E1 \u0111\u1EC3 \u0111\u1ED3 tr\u00EAn n\u00F3c ho\u1EB7c gi\u00E1 \u0111\u1EC3 v\u00E1n tr\u01B0\u1EE3t tuy\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Mitf\u00FChren unn\u00F6tiger Gegenst\u00E4nde","Ch\u1EDF theo \u0111\u1ED3 v\u1EADt kh\u00F4ng c\u1EA7n thi\u1EBFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch zu hohen Reifendruck","L\u1ED1p xe qu\u00E1 c\u0103ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(812);
	    	
	    	q.setName("2.5.01-107");

			q.setText(new TranslatedString("Wie k\u00F6nnen Sie Kraftstoff sparen?","B\u1EA1n c\u00F3 th\u1EC3 l\u00E0m g\u00EC \u0111\u1EC3 ti\u1EBFt ki\u1EC7m nhi\u00EAn li\u1EC7u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mindestens Reifendruck nach Betriebsanleitung einhalten","Gi\u1EA3m \u0111\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p cho ph\u00F9 h\u1EE3p v\u1EDBi h\u01B0\u1EDBng d\u1EABn s\u1EED d\u1EE5ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dachgep\u00E4cktr\u00E4ger oder Skihalter abnehmen","G\u1EE1 b\u1ECF gi\u00E1 \u0111\u1EC3 \u0111\u1ED3 tr\u00EAn n\u00F3c ho\u1EB7c gi\u00E1 \u0111\u1EC3 v\u00E1n tr\u01B0\u1EE3t tuy\u1EBFt")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nicht im h\u00F6chsten Gang fahren","Kh\u00F4ng \u0111i v\u1EDBi s\u1ED1 cao nh\u1EA5t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(813);
	    	
	    	q.setName("2.5.01-108");

			q.setText(new TranslatedString("Was ist aus Gr\u00FCnden des Umweltschutzes zu unterlassen?","C\u00E1i g\u00EC n\u00EAn tr\u00E1nh v\u00EC l\u00FD do b\u1EA3o v\u1EC7 m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Den Motor im Stand warmlaufen lassen","\u0110\u1EC3 xe n\u1ED5 m\u00E1y khi d\u1EEBng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unn\u00F6tiges Umherfahren","\u0110i l\u00F2ng v\u00F2ng kh\u00F4ng c\u1EA7n thi\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Laute Musik bei ge\u00F6ffneten Fenstern","B\u1EADt nh\u1EA1c to khi m\u1EDF c\u1EEDa s\u1ED5")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(814);
	    	
	    	q.setName("2.5.01-109");

			q.setText(new TranslatedString("Welches Verhalten ist umweltbewusst?","Nh\u1EEFng c\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 th\u00E2n thi\u1EC7n v\u1EDBi m\u00F4i tr\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Sammelparkpl\u00E4tzen auf \u00F6ffentliche Verkehrsmittel umsteigen (\u201EP +\nR\u201C)","Chuy\u1EC3n sang ph\u01B0\u01A1ng ti\u1EC7n c\u00F4ng c\u1ED9ng \u1EDF nh\u1EEFng ch\u1ED7 \u0111\u1EADu xe t\u1EADp trung (\u201EP + R\u201C)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrgemeinschaften bilden","Th\u00E0nh l\u1EADp h\u1ED9i d\u00F9ng xe chung")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Stau den Motor abstellen","T\u1EAFt \u0111\u1ED9ng c\u01A1 khi k\u1EB9t xe")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(815);
	    	
	    	q.setName("2.5.01-110");

			q.setText(new TranslatedString("Wo sollten Sie Ihr Gep\u00E4ck nach M\u00F6glichkeit unterbringen, um \nKraftstoff zu sparen?","N\u1EBFu c\u00F3 th\u1EC3 th\u00EC b\u1EA1n \u0111\u1EC3 h\u00E0nh l\u00FD \u1EDF \u0111\u00E2u \u0111\u1EC3 ti\u1EBFt ki\u1EC7m nhi\u00EAn li\u1EC7u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Im Kofferraum","Trong c\u1ED1p xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einem Dachgep\u00E4cktr\u00E4ger","Tr\u00EAn gi\u00E1 \u0111\u1EC3 \u0111\u1ED3 \u0111\u1EA1c tr\u00EAn n\u00F3c xe")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(816);
	    	
	    	q.setName("2.5.01-111");

			q.setText(new TranslatedString("Wie kann L\u00E4rm vermindert werden?","L\u00E0m sao \u0111\u1EC3 gi\u1EA3m ti\u1EBFng \u1ED3n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Fahren im 4. oder 5. Gang in Ortschaften","Tronng khu \u0111\u00F4 th\u1ECB \u0111i s\u1ED1 4 ho\u1EB7c 5")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Fahren mit hoher Motordrehzahl","\u0110i v\u1EDBi v\u1EADn t\u1ED1c quay m\u00F4-t\u01A1 l\u1EDBn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Fahren mit hoher Geschwindigkeit","\u0110i v\u1EDBi t\u1ED1c \u0111\u1ED9 cao")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(817);
	    	
	    	q.setName("2.5.01-112");

			q.setText(new TranslatedString("Wozu f\u00FChrt \u201EPower-Sound\u201C im Auto?","H\u1EC7 th\u1ED1ng \u00E2m thanh khuy\u1EBFch \u0111\u1EA1i \u201EPower-Sound\u201C trong xe c\u00F3 th\u1EC3 g\u00E2y ra \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Signale des \u00FCbrigen Verkehrs \u2013 insbesondere Martinshorn \u2013 werden\nnicht geh\u00F6rt","Kh\u00F4ng nghe \u0111\u01B0\u1EE3c t\u00EDn hi\u1EC7u c\u00E1c xe kh\u00E1c - \u0111\u1EB7c bi\u1EC7t l\u00E0 c\u00F2i Martin")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auch bei geschlossenen Scheiben werden andere durch L\u00E4rm\nbel\u00E4stigt","Ngay c\u1EA3 khi \u0111\u00F3ng c\u1EEDa c\u0169ng l\u00E0m \u1ED3n \u0111\u1EBFn xe kh\u00E1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu Fahrfehlern durch Ablenkung","G\u00E2y l\u1ED7i l\u00E1i xe v\u00EC m\u1EA5t t\u1EADp trung")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(818);
	    	
	    	q.setName("2.5.01-113");

			q.setText(new TranslatedString("Um wie viel Prozent erh\u00F6ht sich bei Tempo 160 km/h im \nAllgemeinen der Kraftstoffverbrauch (l/100 km) eines \nMittelklasse-Pkw gegen\u00FCber der Fahrt mit Richtgeschwindigkeit \n130 km/h?","Trong tr\u01B0\u1EDDng h\u1EE3p t\u1ED5ng qu\u00E1, v\u1EDBi m\u1EE9c ti\u00EAu th\u1EE5 b\u00ECnh th\u01B0\u1EDDng c\u1EE7a m\u1ED9t xe Pkw lo\u1EA1i trung b\u00ECnh (t\u00EDnh tr\u00EAn 100km) th\u00EC khi t\u0103ng t\u1EEB v\u1EADn t\u1ED1c ti\u00EAu chu\u1EA9n 130km/h l\u00EAn l\u00EAn 160 km/h th\u00EC m\u1EE9c ti\u00EAu th\u1EE5 n\u0103ng l\u01B0\u1EE3ng t\u0103ng l\u00EAn bao nhi\u00EAu ph\u1EA7n tr\u0103m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Um bis zu 35 %","L\u00EAn \u0111\u1EBFn 35 %")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Um bis zu 5 %","L\u00EAn \u0111\u1EBFn 5 %")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Um bis zu 10 %","L\u00EAn \u0111\u1EBFn 10 %")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(819);
	    	
	    	q.setName("2.5.01-114");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, wenn der Dieselmotor Ihres Kraftfahrzeugs \ntrotz richtiger Fahrweise qualmt?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC, khi \u0111\u1ED9ng c\u01A1 d\u1EA7u nh\u1EA3 kh\u00F3i nhi\u1EC1u d\u00F9 b\u1EA1n l\u00E1i xe \u0111\u00FAng c\u00E1ch?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Einspritzanlage \u00FCberpr\u00FCfen lassen","Ki\u1EC3m tra b\u1ED9 tr\u1ED9n nhi\u00EAn li\u1EC7u trong\nKraftstoff mu\u00DF in der richtigen Menge eingespritzt werden, was die Werkstatt mit Me\u00DFger\u00E4t und Werkzeug einstellt.")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Luftfilter bei starker Verschmutzung erneuern","Thay b\u1ED9 l\u1ECDc kh\u00ED \u0111\u00E3 b\u1EA9n\nDieselmotoren arbeiten nur, wenn die Dieselleitung vollst\u00E4ndig luftdicht sind. Sobald eine gro\u00DFe Luftblase in der Leitung ist, geht der Motor aus.")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kraftstoffanlage entl\u00FCften","Th\u00F4ng kh\u00ED h\u1EC7 th\u1ED1ng nhi\u00EAn li\u1EC7u\n(Kraftstoff und Luft m\u00FCssen im richtigen Mengenverh\u00E4ltnis im Motor verbrennen, dann qualmt nichts. Ist der Filter zu, kommt also weniger Luft an .... die Folge kennst du nun schon.)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(820);
	    	
	    	q.setName("2.5.01-115");

			q.setText(new TranslatedString("Was kann bei einem Kraftfahrzeug zum Qualmen des Dieselmotors \nf\u00FChren?","C\u00E1i g\u00EC g\u00E2y ra kh\u00F3i \u1EDF \u0111\u1ED9ng c\u01A1 d\u1EA7u c\u1EE7a xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mangel an der Einspritzanlage","Thi\u1EBFu/h\u1ECFng b\u1ED9 tr\u1ED9n nhi\u00EAn li\u1EC7u trong")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahren mit hoher Drehzahl bei Volllast","\u0110i s\u1ED1 cao m\u00E0 t\u1EA3i n\u1EB7ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verstopfter Kraftstofffilter","B\u1ED9 l\u1ECDc nhi\u00EAn li\u1EC7u b\u1ECB k\u1EB9t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.5.01-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(821);
	    	
	    	q.setName("2.5.01-118");

			q.setText(new TranslatedString("D\u00FCrfen Sie mit Ihrem Pkw mit Ottomotor ohne Feinstaub-Plakette in \neine so gekennzeichnete Umweltzone einfahren?","B\u1EA1n c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p l\u00E1i xe d\u00F9ng \u0111\u1ED9ng c\u01A1 Otto, kh\u00F4ng c\u00F3 nh\u00E3n Feinstaub v\u00E0o v\u00F9ng b\u1EA3o v\u1EC7 m\u00F4i tr\u01B0\u1EDDng kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("2.5.01-118.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein, weil mein Pkw nicht mit einer Feinstaub-Plakette\ngekennzeichnet ist","Kh\u00F4ng, v\u00EC xe Pkw c\u1EE7a t\u00F4i kh\u00F4ng c\u00F3 d\u00E1n nh\u00E3n Feinstaub")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, weil ich einen Pkw mit geregeltem Katalysator fahre","C\u00F3, v\u00EC t\u00F4i l\u00E1i xe Pkw c\u00F3 trang b\u1ECB Katalysator \u0111i\u1EC1u khi\u1EC3n b\u1EB1ng m\u00E1y t\u00EDnh")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, weil nur Dieselfahrzeuge von diesem Verbot betroffen sind","C\u00F3, v\u00EC ch\u1EC9 c\u00F3 xe \u0111\u1ED9ng c\u01A1 d\u1EA7u m\u1EDBi b\u1ECB c\u1EA5m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.01-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(822);
	    	
	    	q.setName("2.6.01-002");

			q.setText(new TranslatedString("Woran k\u00F6nnen Sie erkennen, wann Sie Ihr Fahrzeug zur n\u00E4chsten \nHauptuntersuchung vorf\u00FChren m\u00FCssen?","D\u1EF1a v\u00E0o \u0111\u00E2u b\u1EA1n bi\u1EBFt \u0111\u01B0\u1EE3c, khi n\u00E0o th\u00EC xe b\u1EA1n l\u1EA1i ph\u1EA3i ki\u1EBFm tra t\u1ED5ng qu\u00E1t l\u1EA7n n\u1EEFa?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An der Pr\u00FCfplakette","\u1EDE nh\u00E3n ki\u1EC3m tra")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An der Eintragung im Fahrzeugschein","Tr\u00EAn gi\u1EA5y \u0111\u0103ng k\u00FD xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Am Kilometerstand","D\u1EF1a tr\u00EAn s\u1ED1 km \u0111i \u0111\u01B0\u1EE3c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.01-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(823);
	    	
	    	q.setName("2.6.01-101");

			q.setText(new TranslatedString("Sie haben einen neuen Pkw gekauft. Wann ist die erste \nHauptuntersuchung f\u00E4llig?","B\u1EA1n v\u1EEBa mua xe m\u1EDBi. Khi n\u00E0o th\u00EC l\u1EA7n ki\u1EC3m tra xe \u0111\u1EA7u ti\u00EAn h\u1EBFt h\u1EA1n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach drei Jahren","Sau 3 n\u0103m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach zwei Jahren","Sau 2 n\u0103m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach einem Jahr","Sau 1 n\u0103m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.01-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(824);
	    	
	    	q.setName("2.6.01-102");

			q.setText(new TranslatedString("In welchen Zeitabst\u00E4nden muss Ihr Pkw (kein Neufahrzeug, \nOttomotor, G-Kat) zur Abgasuntersuchung? \nAlle _____ Jahre","Sau bao l\u00E2u th\u00EC xe Pkw (lo\u1EA1i xe c\u0169, \u0111\u1ED9ng c\u01A1 x\u0103ng, G-Kat) ph\u1EA3i ki\u1EC3m tra kh\u00ED th\u1EA3i?\nT\u1EA5t c\u1EA3 l\u00E0 ______ n\u0103m\n#Note:\n<ul>\n<li><strong>Zeitabstand</strong>: kho\u1EA3ng th\u1EDDi gian(time interval)</li>\n<li><strong>Abgasuntersuchung</strong>: ki\u1EC3m tra kh\u00ED th\u1EA3i (emissions test)</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\nAlle 2 Jahre "), new TranslatedString("\n\n\nAlle 2 Jahre ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.01-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(825);
	    	
	    	q.setName("2.6.01-104");

			q.setText(new TranslatedString("In welchen Zeitabst\u00E4nden muss Ihr Pkw (kein Neufahrzeug) mit \nDieselmotor zur Abgasuntersuchung? \nAlle _____ Jahre","Sau bao l\u00E2u th\u00EC xe Pkw (lo\u1EA1i xe c\u0169) v\u1EDBi \u0111\u1ED9ng c\u01A1 d\u1EA7u ph\u1EA3i ki\u1EC3m tra kh\u00ED th\u1EA3i?\nT\u1EA5t c\u1EA3 l\u00E0 _____ n\u0103m\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\nAlle 2 Jahre "), new TranslatedString("\n\n\nAlle 2 Jahre ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.01-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(826);
	    	
	    	q.setName("2.6.01-105");

			q.setText(new TranslatedString("Sie haben einen gebrauchten Pkw gekauft. Die Hauptuntersuchung \nist neu. Wann ist die n\u00E4chste Hauptuntersuchung f\u00E4llig?","B\u1EA1n v\u1EEBa mua m\u1ED9t xe Pkw c\u0169. Gi\u1EA5y ki\u1EC3m tra t\u1ED5ng qu\u00E1t c\u00F2n m\u1EDBi. Khi n\u00E0o th\u00EC s\u1EBD ph\u1EA3i ki\u1EC3m tra t\u1ED5ng qu\u00E1t l\u1EA7n k\u1EBF ti\u1EBFp?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach zwei Jahren","Sau 2 n\u0103m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach einem Jahr","Sau 1 n\u0103m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach drei Jahren","Sau 3 n\u0103m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.01-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(827);
	    	
	    	q.setName("2.6.01-106");

			q.setText(new TranslatedString("Sie haben Ihren zugelassenen Wohnanh\u00E4nger w\u00E4hrend des \nWinterhalbjahres auf einem Campingplatz abgestellt. Was gilt \nhinsichtlich der Hauptuntersuchung?","B\u1EA1n \u0111\u00E3 \u0111\u1EADu xe caravan \u0111\u00E3 \u0111\u0103ng k\u00FD trong n\u1EEDa n\u0103m cu\u1ED1i \u1EDF m\u1ED9t khu c\u1EAFm tr\u1EA1i. \n\u0110i\u1EC1u g\u00EC l\u00EAn quan \u0111\u1EBFn vi\u1EC7c ki\u1EC3m tra t\u1ED5ng qu\u00E1t?\nThe specified date on the certification label must be followed"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der auf der Pr\u00FCfplakette angegebene Termin ist einzuhalten","Ng\u00E0y h\u1EB9n ghi tr\u00EAn nh\u00E3n ki\u1EC3m tra ph\u1EA3i \u0111\u01B0\u1EE3c tu\u00E2n th\u1EE7")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der auf der Pr\u00FCfplakette angegebene Termin verschiebt sich um die\nStandzeit","Ng\u00E0y h\u1EB9n ghi tr\u00EAn nh\u00E3n ki\u1EC3m tra \u0111\u01B0\u1EE3c d\u1EDDi l\u1EA1i b\u1EB1ng th\u1EDDi gian c\u1EA5t xe")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.01-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(828);
	    	
	    	q.setName("2.6.01-107");

			q.setText(new TranslatedString("Was zeigt die sechseckige Plakette auf dem vorderen \nNummernschild an? \nDen Termin f\u00FCr","Tem l\u1EE5c gi\u00E1c d\u00E1n \u1EDF bi\u1EC3n s\u1ED1 xe ph\u00EDa tr\u01B0\u1EDBc cho bi\u1EBFt \u0111i\u1EC1u g\u00EC?\n- Ng\u00E0y h\u1EB9n \u0111\u1EBFn"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 die n\u00E4chste Abgasuntersuchung","\u2013 l\u1EA7n ki\u1EC3m tra kh\u00ED th\u1EA3i k\u1EBF ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 die n\u00E4chste Hauptuntersuchung","\u2013 l\u1EA7n ki\u1EC3m tra t\u1ED5ng qu\u00E1t k\u1EBF ti\u1EBFp")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 die F\u00E4lligkeit der Kraftfahrzeugsteuer","\u2013 ng\u00E0y gia h\u1EA1n m\u1EDBi thu\u1EBF \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.02-020
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(829);
	    	
	    	q.setName("2.6.02-020");

			q.setText(new TranslatedString("Wegen einer technischen Ver\u00E4nderung Ihres Fahrzeugs mussten \nSie eine Begutachtung durchf\u00FChren lassen. Wozu sind Sie \nverpflichtet? \nBescheinigung \u00FCber die Begutachtung","Do thay \u0111\u1ED5i y\u1EBFu t\u1ED1 k\u1EF9 thu\u1EADt c\u1EE7a xe, b\u1EA1n c\u1EA7n qua m\u1ED9t \u0111\u1EE3t ki\u1EC3m tra k\u1EF9 thu\u1EADt chuy\u00EAn nghi\u1EC7p. \nB\u1EA1n ph\u1EA3i tu\u00E2n th\u1EE7 \u0111i\u1EC1u g\u00EC?\n- Gi\u1EA5y ch\u1EE9ng nh\u1EADn ki\u1EC3m tra"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 mitf\u00FChren oder Fahrzeugpapiere berichtigen lassen","\u2013 mitf\u00FChren oder Fahrzeugpapiere berichtigen lassen!?!")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 sofort dem Fahrzeughersteller \u00FCbersenden","\u2013 \u0111\u01B0\u1EE3c l\u1EADp t\u1EE9c g\u1EEDi \u0111\u1EBFn nh\u00E0 s\u1EA3n xu\u1EA5t xe")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 an der daf\u00FCr vorgesehenen Stelle in den Fahrzeugbrief einkleben","\u2013 an der daf\u00FCr vorgesehenen Stelle in den Fahrzeugbrief einkleben!?!")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.02-021
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(830);
	    	
	    	q.setName("2.6.02-021");

			q.setText(new TranslatedString("Durch Ver\u00E4nderungen an Ihrem Fahrzeug ist die Betriebserlaubnis \nerloschen. Welche Folgen hat das?","Do xe \u0111\u01B0\u1EE3c s\u1EEDa \u0111\u1ED5i n\u00EAn gi\u1EA5y ph\u00E9p l\u01B0u h\u00E0nh m\u1EA5t t\u00E1c d\u1EE5ng. \u0110i\u1EC1u n\u00E0o x\u1EA3y ra ti\u1EBFp theo"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bu\u00DFgeld","Ph\u1EA1t h\u00E0nh ch\u00EDnh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eintragung in der \u201EVerkehrss\u00FCnderkartei\u201C (Punkte)","C\u1EADt nh\u1EADp d\u1EEF li\u1EC7u trong \u0111\u1EC1 m\u1EE5c \u201EVerkehrss\u00FCnderkartei\u201C (\u0110i\u1EC3m)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Erl\u00F6schen des Versicherungsschutzes","M\u1EA5t b\u1EA3o hi\u1EC3m")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.02-022
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(831);
	    	
	    	q.setName("2.6.02-022");

			q.setText(new TranslatedString("Welche Papiere m\u00FCssen Sie als Fahrer mitf\u00FChren?","Gi\u1EA5y t\u1EDD n\u00E0o ph\u1EA3i mang theo khi l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("F\u00FChrerschein","B\u1EB1ng l\u00E1i xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrzeugschein","Gi\u1EA5y \u0111\u0103ng k\u00FD xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrzeugbrief","H\u1ED3 s\u01A1 \u0111\u0103ng k\u00FD xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.02-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(832);
	    	
	    	q.setName("2.6.02-101");

			q.setText(new TranslatedString("Wegen \u201ETieferlegung\u201C Ihres Pkw ist eine Begutachtung \nerforderlich. Wann muss diese erfolgen?","Do b\u1EDFi \u201ETieferlegung\u201C, xe Pkw c\u1EA7n ph\u1EA3i ki\u1EC3m tra l\u1EA1i. Khi n\u00E0o ph\u1EA3i ti\u1EBFn h\u00E0nh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unverz\u00FCglich nach dem Umbau","Ngay l\u1EADp t\u1EE9c sau khi s\u1EEDa xong")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zusammen mit der n\u00E4chsten Hauptuntersuchung, sp\u00E4testens 1 Jahr\nnach Umbau","Ti\u1EBFn h\u00E0nh ki\u1EC3m tra c\u00F9ng v\u1EDBi \u0111\u1EE3t ki\u1EC3m tra t\u1ED5ng qu\u00E1 k\u1EBFt ti\u1EBFp, tr\u1EC5 nh\u1EA5t l\u00E0 1 n\u0103m sau khi s\u1EEDa xong")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach Aufforderung durch die Zulassungsstelle","Theo y\u00EAu c\u1EA7u c\u1EE7a v\u0103n ph\u00F2ng qu\u1EA3n l\u00FD gi\u1EA5y ph\u00E9p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.02-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(833);
	    	
	    	q.setName("2.6.02-102");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen Sie mit einer Fahrerlaubnis der Klasse B \nunter Beachtung der zul\u00E4ssigen Anh\u00E4ngelast fahren? \nKombinationen aus","Lo\u1EA1i xe n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng khi c\u00F3 b\u1EB1ng l\u00E1i lo\u1EA1i B\nKhi c\u00F3 b\u1EB1ng l\u00E1i lo\u1EA1i B b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p s\u1EED d\u1EE5ng lo\u1EA1i xe n\u00E0o .... !?!"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 einem Pkw mit einer zul\u00E4ssigen Gesamtmasse von 3.500 kg und\neinem Anh\u00E4nger von 750 kg zul\u00E4ssiger Gesamtmasse","\u2013 Xe Pkw v\u1EDBi t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p 3.500 kg v\u00E0 m\u1ED9t r\u01A1-mooc c\u00F3 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng 750 kg")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 einem Lkw mit einer zul\u00E4ssigen Gesamtmasse von 3.500 kg und\neinem Anh\u00E4nger von 750 kg zul\u00E4ssiger Gesamtmasse","\u2013 Xe Lkw v\u1EDBi t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p 3.500 kg v\u00E0 m\u1ED9t r\u01A1-mooc c\u00F3 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng 750 kg")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 einem Pkw und einem Anh\u00E4nger, dessen zul\u00E4ssige Gesamtmasse\ndie Leermasse des Pkw \u00FCbersteigt, solange die Summe der zul\u00E4ssigen \nGesamtmassen nicht h\u00F6her als 3.500 kg ist","\u2013 Xe Pkw v\u00E0 m\u1ED9t r\u01A1-mooc, c\u00F3 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng v\u01B0\u1EE3t qu\u00E1 tr\u1ECDng l\u01B0\u1EE3ng khi kh\u00F4ng t\u1EA3i c\u1EE7a xe Pkw, mi\u1EC5n l\u00E0 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng c\u1EA3 hai kh\u00F4ng v\u01B0\u1EE3t qu\u00E1 3.500 kg")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.02-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(834);
	    	
	    	q.setName("2.6.02-103");

			q.setText(new TranslatedString("Sie besitzen die Fahrerlaubnis der Klasse B. Ihr Pkw hat folgende \nDaten: \n\u2013 Leermasse 900 kg \n\u2013 zul\u00E4ssige Gesamtmasse 1.400 kg \n\u2013 zul\u00E4ssige Anh\u00E4ngelast 1.000 kg \nWelchen Anh\u00E4nger d\u00FCrfen Sie mitf\u00FChren? \nEinen Anh\u00E4nger mit einer zul\u00E4ssigen Gesamtmasse von","B\u1EA1n c\u00F3 b\u1EB1ng l\u00E1i xe lo\u1EA1i B. Xe Pkw c\u00F3 th\u00F4ng s\u1ED1 nh\u01B0 sau:\n<ul>\n<li>Tr\u1ECDng l\u01B0\u1EE3ng khi kh\u00F4ng t\u1EA3i l\u00E0 900 kg</li>\n<li>T\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p l\u00E0 1.400 kg</li>\n<li>S\u1EE9c t\u1EA3i r\u01A1-mooc cho ph\u00E9p l\u00E0 1.000 kg</li>\n</ul>\nR\u01A1-mooc n\u00E0o \u0111\u01B0\u1EE3c ph\u00E9p k\u00E9o theo?\n- R\u01A1-mooc c\u00F3 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p l\u00E0"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("850 kg","850 kg")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("950 kg","950 kg")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("1.000 kg","1.000 kg")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.02-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(835);
	    	
	    	q.setName("2.6.02-104");

			q.setText(new TranslatedString("Sie besitzen die Fahrerlaubnis der Klasse B. Ihr Pkw hat folgende \nDaten: \n\u2013 Leermasse 1.900 kg \n\u2013 zul\u00E4ssige Gesamtmasse 2.400 kg \n\u2013 zul\u00E4ssige Anh\u00E4ngelast 1.500 kg \nWelchen Anh\u00E4nger d\u00FCrfen Sie mitf\u00FChren? \nEinen Anh\u00E4nger mit einer zul\u00E4ssigen Gesamtmasse von","B\u1EA1n c\u00F3 b\u1EB1ng l\u00E1i xe lo\u1EA1i B. Xe Pkw c\u00F3 th\u00F4ng s\u1ED1 nh\u01B0 sau:\n<ul>\n<li>Tr\u1ECDng l\u01B0\u1EE3ng khi kh\u00F4ng t\u1EA3i l\u00E0 1.900 kg</li>\n<li>T\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p l\u00E0 2.400 kg</li>\n<li>S\u1EE9c t\u1EA3i r\u01A1-mooc cho ph\u00E9p l\u00E0 1.500 kg</li>\n</ul>\nR\u01A1-mooc n\u00E0o \u0111\u01B0\u1EE3c ph\u00E9p k\u00E9o theo?\n- R\u01A1-mooc c\u00F3 t\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng cho ph\u00E9p l\u00E0"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("1.000 kg","1.000 kg")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("1.200 kg","1.200 kg")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("1.500 kg","1.500 kg")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(836);
	    	
	    	q.setName("2.6.03-101");

			q.setText(new TranslatedString("Wie viele Anh\u00E4nger d\u00FCrfen hinter einem Lkw der Klasse B \nmitgef\u00FChrt werden? \n_____ Anh\u00E4nger","Bao nhi\u00EAu r\u01A1-mooc \u0111\u01B0\u1EE3c ph\u00E9p k\u00E9o theo sau xe t\u1EA3i Lkw lo\u1EA1i B\n\n____ r\u01A1-mooc\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n1 Anh\u00C3\u0192\u00C2\u00A4nger "), new TranslatedString("\n\n\n1 Anh\u00C3\u0192\u00C2\u00A4nger ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(837);
	    	
	    	q.setName("2.6.03-102");

			q.setText(new TranslatedString("Auf einer Stra\u00DFe mit Schlagl\u00F6chern kommt Ihr Anh\u00E4nger ins \n\u201ESpringen\u201C. Wie m\u00FCssen Sie sich verhalten?","Tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 \u1ED5 g\u00E0 l\u00E0m r\u01A1-mooc sau xe b\u1EA1n b\u1ECB \u201En\u1EA3y\u201C. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern, um Schleudern zu verhindern","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 \u0111\u1EC3 tr\u00E1nh b\u1ECB tr\u01B0\u1EE3t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beschleunigen, um den Zug gestreckt zu halten","T\u0103ng t\u1ED1c, \u0111\u1EC3 gi\u1EEF cho xe \u0111\u01B0\u1EE3c c\u0103ng!?!")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit gleich bleibender Geschwindigkeit den Schlagl\u00F6chern ausweichen","Gi\u1EEF nguy\u00EAn t\u1ED1c \u0111\u1ED9 v\u00E0 tr\u00E1nh \u1ED5 g\u00E0")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(838);
	    	
	    	q.setName("2.6.03-104");

			q.setText(new TranslatedString("Sie wollen an Ihren Pkw einen Anh\u00E4nger ankuppeln. Wo finden Sie \nAngaben \u00FCber die zul\u00E4ssigen St\u00FCtzlasten Ihres Pkw?","B\u1EA1n mu\u1ED1n g\u1EAFn r\u01A1-mooc v\u00E0o xe. B\u1EA1n c\u00F3 th\u1EC3 t\u00ECm th\u1EA5y chi ti\u1EBFt v\u1EC1 t\u1EA3i tr\u1ECDng m\u00E0 xe Pkw \u0111\u01B0\u1EE3c ph\u00E9p k\u00E9o \u1EDF \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In der Betriebsanleitung des Pkw","Trong h\u01B0\u1EDBng d\u1EABn s\u1EED d\u1EE5ng xe Pkw")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Im Fahrzeugbrief","Trong h\u1ED3 s\u01A1 \u0111\u0103ng k\u00FD xe")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(839);
	    	
	    	q.setName("2.6.03-105");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie achten, wenn Sie hinter Ihrem Pkw einen \nAnh\u00E4nger mit Auflaufbremse mitf\u00FChren wollen?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC, khi xe Pkw c\u1EE7a b\u1EA1n mu\u1ED1n k\u00E9o theo m\u1ED9t r\u01A1-mooc c\u00F3 trang b\u1ECB phanh Auflaufbremse?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass die tats\u00E4chliche Gesamtmasse des Anh\u00E4ngers nicht gr\u00F6\u00DFer ist\nals die f\u00FCr den Pkw zugelassene Anh\u00E4ngelast","T\u1ED5ng tr\u1ECDng l\u01B0\u1EE3ng th\u1EF1c t\u1EBF c\u1EE7a r\u01A1-mooc kh\u00F4ng l\u1EDBn h\u01A1n tr\u1ECDng l\u01B0\u1EE3ng m\u00E0 xe Pkw \u0111\u01B0\u1EE3c ph\u00E9p k\u00E9o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass das Abrei\u00DFseil mit dem Zugfahrzeug verbunden ist","D\u00E2y c\u00E1p k\u00E9o ph\u1EA3i \u0111\u01B0\u1EE3c n\u1ED1i v\u1EDBi xe k\u00E9o ph\u00EDa tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dass die zul\u00E4ssige H\u00F6chstgeschwindigkeit dieses Zuges auch auf\nAutobahnen 60 km/h betr\u00E4gt","V\u1EADn t\u1ED1c cao nh\u1EA5t cho ph\u00E9p c\u1EE7a xe l\u00E0 60 km/h tr\u00EAn \u0111\u01B0\u1EDDng cao t\u1ED1c Autobahn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(840);
	    	
	    	q.setName("2.6.03-106");

			q.setText(new TranslatedString("Was bezeichnet man als Anh\u00E4ngelast?","S\u1EE9c k\u1EBBo t\u1EA3i \u0111\u01B0\u1EE3c x\u00E1c \u0111\u1ECBnh l\u00E0 g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die tats\u00E4chlich gezogene Last","T\u1EA3i tr\u1ECDng th\u1EF1c s\u1EF1 \u0111\u01B0\u1EE3c k\u00E9o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die zul\u00E4ssige Gesamtmasse des Anh\u00E4ngers","T\u1EA3i tr\u1ECDng cao nh\u1EA5t c\u1EE7a r\u01A1-mooc")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Nutzlast des Anh\u00E4ngers","H\u00E0ng h\u00F3a b\u00EAn trong r\u01A1-mooc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(841);
	    	
	    	q.setName("2.6.03-107");

			q.setText(new TranslatedString("Was ist beim R\u00FCckwartsfahren mit einem Zug richtig, wenn die \nSicht nach hinten behindert ist?","Khi l\u00F9i xe c\u00F3 k\u00E9o r\u01A1-mooc, t\u1EA7m nh\u00ECn ph\u00EDa sau b\u1ECB h\u1EA1n ch\u1EBF, \u0111i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 \u0111\u00FAng!?!"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Sichtverbindung zur einweisenden Person darf nicht abrei\u00DFen","T\u1EA7m nh\u00ECn t\u1EDBi ng\u01B0\u1EDDi h\u01B0\u1EDBng d\u1EABn ph\u1EA3i kh\u00F4ng \u0111\u01B0\u1EE3c che ch\u1EAFn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur beim Einfahren in eine Vorfahrtstra\u00DFe ist Einweisung erforderlich","Ch\u1EC9 khi \u0111i v\u00E0o \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn m\u1EDBi c\u1EA7n s\u1EF1 h\u01B0\u1EDBng d\u1EABn")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einem Betriebsgel\u00E4nde kann auf Einweisung verzichtet werden","\u1EDE khu v\u1EF1c nh\u00E0 x\u01B0\u1EDFng c\u00F3 th\u1EC3 kh\u00F4ng c\u1EA7n ng\u01B0\u1EDDi h\u01B0\u1EDBng d\u1EABn")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(842);
	    	
	    	q.setName("2.6.03-108");

			q.setText(new TranslatedString("Ein einachsiger Anh\u00E4nger hat ein tats\u00E4chliches Gewicht von 600 \nkg. Wie gro\u00DF muss die St\u00FCtzlast mindestens sein?","R\u01A1-mooc m\u1ED9t tr\u1EE5c (2 b\u00E1nh) c\u00F3 tr\u1ECDng l\u01B0\u1EE3ng th\u1EF1c t\u1EBF l\u00E0 600 kg. T\u1EA3i tr\u1ECDng \u0111\u01B0\u1EE3c k\u00E9o t\u1ED1i thi\u1EC3u ph\u1EA3i l\u00E0 bao nhi\u00EAu?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("24 kg (= 4 %)","24 kg (= 4 %)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("60 kg (= 10 %)","60 kg (= 10 %)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("90 kg (= 15 %)","90 kg (= 15 %)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(843);
	    	
	    	q.setName("2.6.03-109");

			q.setText(new TranslatedString("Sie f\u00FChren hinter Ihrem Kraftfahrzeug einen Anh\u00E4nger mit. Was ist \nf\u00FCr die Sicht nach hinten richtig?","B\u1EA1n l\u00E1i xe c\u00F3 k\u00E9o theo r\u01A1-mooc. \u0110i\u1EC1u g\u00EC l\u00E0 \u0111\u00FAng \u0111\u1ED1i v\u1EDBi t\u1EA7m nh\u00ECn ph\u00EDa sau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anh\u00E4nger und Ladung d\u00FCrfen die Sicht auf den r\u00FCckw\u00E4rtigen Verkehr\nnicht unzul\u00E4ssig beeintr\u00E4chtigen","R\u01A1-mooc v\u00E0 h\u00E0ng tr\u1EDF theo kh\u00F4ng \u0111\u01B0\u1EE3c che t\u1EA7m nh\u00ECn cho ph\u00E9p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn durch Anh\u00E4nger oder Ladung die normalen R\u00FCckspiegel keine\nausreichende Sicht mehr erm\u00F6glichen, m\u00FCssen zus\u00E4tzliche R\u00FCckspiegel","\u0110\u1ED1i v\u1EDBi r\u01A1-mooc v\u00E0 h\u00E0ng tr\u1EDF theo, m\u00E0 g\u01B0\u01A1ng h\u1EADu kh\u00F4ng cung c\u1EA5p \u0111\u1EE7 t\u1EA7m nh\u00ECn, th\u00EC b\u1EAFt bu\u1ED9c ph\u1EA3i g\u1EAFn th\u00EAm g\u01B0\u01A1ng ph\u1EE5 tr\u1EE3")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Landwirtschaftliche Zugmaschinen sind immer von der Anbringung\nzus\u00E4tzlicher Spiegel befreit","Xe c\u00F4ng n\u00F4ng lu\u00F4n lu\u00F4n \u0111\u01B0\u1EE3c mi\u1EC5n g\u1EAFn g\u01B0\u01A1ng ph\u1EE5 tr\u1EE3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.6.03-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(844);
	    	
	    	q.setName("2.6.03-110");

			q.setText(new TranslatedString("Wo finden Sie Angaben \u00FCber die zul\u00E4ssigen Anh\u00E4ngelasten?","\u1EDE \u0111\u00E2u b\u1EA1n t\u00ECm th\u1EA5y chi ti\u1EBFt k\u1EF9 thu\u1EADt v\u1EC1 t\u1EA3i tr\u1ECDng c\u1EE7a r\u01A1-mooc?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Im Fahrzeugschein","Tr\u00EAn gi\u1EA5y ph\u00E9p \u0111\u0103ng k\u00FD xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In der Betriebsanleitung des Pkw","Tr\u00EAn h\u01B0\u1EDBng d\u1EABn s\u1EED d\u1EE5ng c\u1EE7a xe Pkw")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Im Versicherungsschein","Tr\u00EAn gi\u1EA5y b\u1EA3o hi\u1EC3m xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-043
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(845);
	    	
	    	q.setName("2.7.01-043");

			q.setText(new TranslatedString("Welche besondere Eigenschaft von Scheibenbremsen m\u00FCssen Sie \nbei nasser Fahrbahn ber\u00FCcksichtigen?","Thu\u1ED9c t\u00EDnh \u0111\u1EB7c bi\u1EC7t n\u00E0o c\u1EE7a phanh \u0111\u0129a b\u1EA1n c\u1EA7n ch\u00FA \u00FD khi l\u00E1i xe tr\u00EAn \u0111\u01B0\u1EDDng \u01B0\u1EDBt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Wirkung von Scheibenbremsen setzt in der Regel sp\u00E4ter ein als\nauf trockener Fahrbahn","Hi\u1EC7u qu\u1EA3 c\u1EE7a phanh \u0111\u0129a theo nguy\u00EAn t\u1EAFc s\u1EBD ch\u1EADm h\u01A1n so v\u1EDBi tr\u00EAn \u0111\u01B0\u1EDDng kh\u00F4")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Wirkung von Scheibenbremsen setzt in der Regel fr\u00FCher ein als\nauf trockener Fahrbahn","Hi\u1EC7u qu\u1EA3 c\u1EE7a phanh \u0111\u0129a theo nguy\u00EAn t\u1EAFc s\u1EBD nhanh h\u01A1n tr\u00EAn \u0111\u01B0\u1EDDng kh\u00F4")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-044
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(846);
	    	
	    	q.setName("2.7.01-044");

			q.setText(new TranslatedString("Was erh\u00F6ht die Gefahr, bei schneller Fahrt aus der Kurve zu \n\u201Efliegen\u201C?","\u0110i\u1EC1u g\u00EC g\u00E2y nguy hi\u1EC3m \u201Ebay xe\u201C, khi l\u00E1i xe nhanh trong v\u00F2ng cua?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremsen","Phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beschleunigen","T\u0103ng t\u1ED1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auskuppeln","Nh\u1EA3 c\u00F4n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-045
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(847);
	    	
	    	q.setName("2.7.01-045");

			q.setText(new TranslatedString("Was ist beim Kontrollieren des Reifenluftdrucks zu \nber\u00FCcksichtigen?","Ph\u1EA3i ch\u00FA \u00FD g\u00EC khi ki\u1EC3m tra \u0111\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beladung/Besetzung des Fahrzeugs","T\u1EA3i tr\u1ECDng c\u1EE7a xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Temperatur der Reifen","Nhi\u1EC7t \u0111\u1ED9 c\u1EE7a l\u1ED1p xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Werkstoff der Felgen (Stahl/Leichtmetall)","V\u1EADt li\u1EC7u l\u00E0m v\u00E0nh b\u00E1nh xe (carbon hay kim lo\u1EA1i nh\u1EB9)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-046
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(848);
	    	
	    	q.setName("2.7.01-046");

			q.setText(new TranslatedString("Sie befahren eine Kurve ein Mal mit 30 km/h und ein anderes Mal \nmit 60 km/h. Wie \u00E4ndert sich dabei die Fliehkraft? \nDie Fliehkraft ist bei 60 km/h","B\u1EA1n l\u00E1i xe v\u00E0o cua m\u1ED9t l\u1EA7n v\u1EDBi t\u1ED1c \u0111\u1ED9 30 km/h v\u00E0 l\u1EA7n kh\u00E1c v\u1EDBi t\u1ED1c \u0111\u1ED9 60 km/h. \nL\u1EF1c k\u00E9o ly t\u00E2m thay \u0111\u1ED5i nh\u01B0 th\u1EBF n\u00E0o?\nL\u1EF1c k\u00E9o ly t\u00E2m khi \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 60 km/h s\u1EBD ..."));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 viermal so gro\u00DF","\u2013 l\u1EDBn h\u01A1n 4 l\u1EA7n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 doppelt so gro\u00DF","\u2013 l\u1EDBn h\u01A1n g\u1EA5p \u0111\u00F4i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 gleich gro\u00DF","\u2013 s\u1EBD kh\u00F4ng \u0111\u1ED5i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-047
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(849);
	    	
	    	q.setName("2.7.01-047");

			q.setText(new TranslatedString("Wodurch wird die auf ein Fahrzeug wirkende Fliehkraft bei \nKurvenfahrt vergr\u00F6\u00DFert?","Y\u1EBFu t\u1ED1 n\u00E0o l\u00E0m t\u0103ng l\u1EF1c ly t\u00E2m khi l\u00E1i xe trong cua?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch h\u00F6here Geschwindigkeit","Do t\u0103ng t\u1ED1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch kleineren Kurvenradius","Do b\u00E1n k\u00EDnh v\u00F2ng cua nh\u1ECF")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch h\u00F6heren Reifenluftdruck","Do \u0111\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p t\u0103ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(850);
	    	
	    	q.setName("2.7.01-102");

			q.setText(new TranslatedString("Was \u00E4ndert sich durch das Mitf\u00FChren eines Wohnanh\u00E4ngers?","\u0110i\u1EC1u khi thay \u0111\u1ED5i khi l\u00E1i xe c\u00F3 k\u00E9o theo nh\u00E0 di \u0111\u1ED9ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der \u00DCberholweg wird wesentlich l\u00E4nger","\u0110\u01B0\u1EDDng v\u01B0\u1EE3t v\u1EC1 c\u01A1 b\u1EA3n s\u1EBD d\u00E0i h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Hastige Lenkbewegungen erh\u00F6hen die Schleudergefahr","Xoay tay l\u00E1i nhanh l\u00E0m t\u0103ng nguy c\u01A1 tr\u01B0\u1EE3t xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Bremsweg wird wesentlich k\u00FCrzer","Kho\u1EA3ng c\u00E1ch phanh v\u1EC1 c\u01A1 b\u1EA3n s\u1EBD ng\u1EAFn \u0111i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(851);
	    	
	    	q.setName("2.7.01-103");

			q.setText(new TranslatedString("Was \u00E4ndert sich durch das Mitf\u00FChren eines zweiachsigen \nAnh\u00E4ngers hinter einem Pkw?","\u0110i\u1EC1u g\u00EC thay \u0111\u1ED5i khi l\u00E1i xe v\u1EDBi r\u01A1-mooc 2 tr\u1EE5c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Abbiegen und in Kurven wird mehr Platz ben\u00F6tigt","Khi qu\u1EB9o hay v\u00E0o cua c\u1EA7n nhi\u1EC1u kho\u1EA3ng tr\u1ED1ng h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Beschleunigungsverm\u00F6gen nimmt ab","Kh\u1EA3 n\u0103ng t\u0103ng t\u1ED1c gi\u1EA3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Fahrstabilit\u00E4t nimmt zu","\u0110\u1ED9 \u1ED5n \u0111\u1ECBnh khi l\u00E1i xe gi\u1EA3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(852);
	    	
	    	q.setName("2.7.01-104");

			q.setText(new TranslatedString("Sie fahren mit Ihrem Pkw und Anh\u00E4nger auf einer Stra\u00DFe mit \nGegenverkehr und wollen nach links abbiegen. Was ist beim \nWiederanfahren besonders wichtig?","B\u1EA1n l\u00E1i xe c\u00F3 k\u00E9o r\u01A1-mooc tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 xe ng\u01B0\u1EE3c chi\u1EC1u v\u00E0 b\u1EA1n mu\u1ED1n qu\u1EB9o tr\u00E1i. Khi \u0111i ti\u1EBFp b\u1EA1n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An die eigene Zugl\u00E4nge denken","\u0110\u1EC3 \u00FD t\u1EDBi chi\u1EC1u d\u00E0i c\u1EE7a xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das geringere Beschleunigungsverm\u00F6gen ber\u00FCcksichtigen","Ch\u00FA \u00FD kh\u1EA3 n\u0103ng t\u0103ng t\u1ED1c c\u1EE7a xe b\u1ECB gi\u1EA3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Den Gegenverkehr mit der Lichthupe warnen","C\u1EA3nh b\u00E1o xe ng\u01B0\u1EE3c chi\u1EC1u b\u1EB1ng \u0111\u00E8n nh\u00E1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(853);
	    	
	    	q.setName("2.7.01-105");

			q.setText(new TranslatedString("Sie fahren einen Pkw mit einem ungebremsten Anh\u00E4nger. Es \nkommt ein l\u00E4ngeres, starkes Gef\u00E4lle. Was ist richtig?","B\u1EA1n l\u00E1i xe c\u00F3 k\u00E9o theo r\u01A1-mooc lo\u1EA1i k\u00F4 c\u00F3 trang b\u1ECB phanh. Khi t\u1EDBi \u0111o\u1EA1n xu\u1ED1ng d\u1ED1c d\u00E0i v\u00E0 cao, \u0111i\u1EC1u n\u00E0o l\u00E0 \u0111\u00FAng ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn n\u00F6tig Geschwindigkeit verringern, rechtzeitig niedrigen Gang\neinlegen, bremsbereit sein","Gi\u1EA3m t\u1ED1c khi c\u1EA7n, v\u1EC1 s\u1ED1 th\u1EA5p \u0111\u00FAng l\u00FAc v\u00E0 s\u1EB5n s\u00E0ng phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schieben des Anh\u00E4ngers ber\u00FCcksichtigen","Ch\u00FA \u00FD chuy\u1EC3n \u0111\u1ED9ng ngang c\u1EE7a r\u01A1-mooc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bremse des Pkw durch h\u00E4ufiges Auskuppeln entlasten","Phanh b\u1EB1ng c\u00E1ch th\u01B0\u1EDDng xuy\u00EAn nh\u1EA3 c\u00F4n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(854);
	    	
	    	q.setName("2.7.01-106");

			q.setText(new TranslatedString("Sie fahren bei N\u00E4sse mit einem Pkw und Anh\u00E4nger auf einer \nschmalen Landstra\u00DFe und n\u00E4hern sich einer \u00FCbersichtlichen, aber \nengen Linkskurve. Was ist richtig?","B\u1EA1n l\u00E1i xe c\u00F3 k\u00E9o theo r\u01A1-mooc tr\u00EAn \u0111\u01B0\u1EDDng \u01B0\u1EDBt v\u00E0 h\u1EB9p, \u0111\u1EBFn g\u1EA7n kh\u00FAc cua h\u1EB9p nh\u01B0ng c\u00F3 t\u1EA7m nh\u00ECn tho\u00E1ng. \u0110i\u1EC1u g\u00EC \u0111\u00FAng d\u01B0\u1EDBi \u0111\u00E2y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vor der Kurve verringern","Gi\u1EA3m t\u1ED1c tr\u01B0\u1EDBc khi v\u00E0o cua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In der Mitte des Fahrstreifens bleiben und fr\u00FChestens im Scheitelpunkt\nder Kurve leicht beschleunigen","Gi\u1EEF xe \u1EDF gi\u1EEFa l\u00E0n \u0111\u01B0\u1EDDng, v\u00E0 ngay khi v\u00E0o g\u00F3c cua th\u00EC t\u0103ng t\u1ED1c nh\u1EB9")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Erst im Scheitelpunkt der Kurve bremsen","Phanh khi v\u00E0o g\u00F3c cua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(855);
	    	
	    	q.setName("2.7.01-107");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei einem Pkw mit Wohnanh\u00E4nger vor \nFahrtbeginn pr\u00FCfen?","Tr\u01B0\u1EDBc khi ch\u1EA1y xe Pkw c\u00F3 k\u00E9o theo r\u01A1-mooc nh\u00E0 di \u0111\u1ED9ng, b\u1EA1n ph\u1EA3i ki\u1EC3m tra g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ob die Beleuchtungseinrichtung des Anh\u00E4ngers funktioniert","H\u1EC7 th\u1ED1ng chi\u1EBFu s\u00E1ng c\u1EE7a r\u01A1-mooc c\u00F3 h\u1ECDat \u0111\u1ED9ng kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ob die Sicht nach hinten durch die R\u00FCckspiegel ausreicht","T\u1EA7m nh\u00ECn ph\u00EDa sau qua g\u01B0\u01A1ng chi\u1EBFu h\u1EADu c\u00F3 \u0111\u1EE7 kh\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ob die Mitfahrer im Wohnanh\u00E4nger die Sicherheitsgurte angelegt\nhaben","Ng\u01B0\u1EDDi \u0111i c\u00F9ng trong nh\u00E0 di \u0111\u1ED9ng c\u00F3 th\u1EAFt d\u00E2y an to\u00E0n kh\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(856);
	    	
	    	q.setName("2.7.01-108");

			q.setText(new TranslatedString("Sie fahren einen Pkw mit voll beladenem Anh\u00E4nger ohne eigene \nBremse. Was ist richtig?","B\u1EA1n l\u00E1i xe Pkw c\u00F3 k\u00E9o theo r\u01A1-mooc t\u1EA3i n\u1EB7ng v\u00E0 kh\u00F4ng c\u00F3 phanh ri\u00EAng. \u0110i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 quan tr\u1ECDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Bremsweg wird l\u00E4nger","Kho\u1EA3ng c\u00E1ch phanh s\u1EBD d\u00E0i h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Reaktionsweg wird l\u00E4nger","Kho\u1EA3ng c\u00E1ch ph\u1EA3n \u1EE9ng s\u1EBD d\u00E0i h\u01A1n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Anhalteweg wird k\u00FCrzer","Kho\u1EA3ng c\u00E1ch d\u1EEBng s\u1EBD ng\u1EAFn l\u1EA1i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(857);
	    	
	    	q.setName("2.7.01-109");

			q.setText(new TranslatedString("Sie wollen an Ihren Pkw einen einachsigen Wohnwagen anh\u00E4ngen. \nWas m\u00FCssen Sie pr\u00FCfen?","B\u1EA1n mu\u1ED1n m\u00F3c r\u01A1-mooc m\u1ED9t tr\u1EE5c v\u00E0o xe Pkw. B\u1EA1n ph\u1EA3i ki\u1EC3m tra g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ob die zul\u00E4ssige Anh\u00E4ngelast oder die zul\u00E4ssige St\u00FCtzlast des Pkw\n\u00FCberschritten wird","T\u1EA3i tr\u1ECDng cho ph\u00E9p c\u1EE7a r\u01A1-mooc ho\u1EB7c t\u1EA3i cho ph\u00E9p c\u1EE7a thanh k\u00E9o c\u00F3 v\u01B0\u1EE3t qu\u00E1 gi\u1EDBi h\u1EA1n cho ph\u00E9p kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ob wegen der Breite des Wohnwagens zus\u00E4tzliche R\u00FCckspiegel\nangebracht werden m\u00FCssen","T\u00F9y \u0111\u1ED9 r\u1ED9ng c\u1EE7a r\u01A1-mooc, c\u00F3 ph\u1EA3i g\u1EAFn th\u00EAm g\u01B0\u01A1ng chi\u1EBFu h\u1EADu kh\u00F4ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ob der Wohnwagen f\u00FCr die Bef\u00F6rderung von Personen zugelassen ist","R\u01A1-mooc nh\u00E0 di \u0111\u1ED9ng c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p ch\u1EDF ng\u01B0\u1EDDi kh\u00F4ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(858);
	    	
	    	q.setName("2.7.01-110");

			q.setText(new TranslatedString("Sie wollen mit einem Automatik-Pkw (hydraulischer Wandler) \nlosfahren. Was m\u00FCssen Sie wissen?","$esc.java($quiz.translatedQuestion)"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Einlegen einer Fahrstufe muss der Pkw in der Regel mit der\nBetriebsbremse festgehalten werden","Beim Einlegen einer Fahrstufe muss der Pkw in der Regel mit der\nBetriebsbremse festgehalten werden")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Wahlhebel darf nur bei stehendem Motor bet\u00E4tigt werden","Der Wahlhebel darf nur bei stehendem Motor bet\u00E4tigt werden")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Drehzahl muss wesentlich erh\u00F6ht werden, damit der Motor nicht\nabgew\u00FCrgt wird",". B\u1EA1n ph\u1EA3i bi\u1EBFt \u0111i\u1EC1u g\u00EC?\nT\u1ED1c \u0111\u1ED9 \u0111\u1ED9ng c\u01A1 ph\u1EA3i cao \u0111\u1EC3 \u0111\u1ED9ng c\u01A1 kh\u00F4ng b\u1ECB ch\u1EBFt m\u00E1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(859);
	    	
	    	q.setName("2.7.01-111");

			q.setText(new TranslatedString("Worauf ist beim Luftdruck der Reifen zu achten?","Ph\u1EA3i ch\u00FA \u00FD g\u00EC v\u1EC1 \u0111\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Luftdruck regelm\u00E4\u00DFig kontrollieren, einschlie\u00DFlich Reserverad","Th\u01B0\u1EDDng xuy\u00EAn ki\u1EC3m tra \u0111\u1ED9 c\u0103ng l\u1ED1p, bao g\u1ED3m c\u1EA3 b\u00E1nh d\u1EF1 ph\u00F2ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Luftdruck bei starker Beladung nach Betriebsanleitung erh\u00F6hen","T\u0103ng \u0111\u1ED9 c\u0103ng l\u1ED1p khi c\u00F3 t\u1EA3i n\u1EB7ng theo h\u01B0\u1EDBng d\u1EABn s\u1EED d\u1EE5ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Luftdruck vor l\u00E4ngeren Fahrten verringern","Gi\u1EA3m \u0111\u1ED9 c\u0103ng l\u1ED1p tr\u01B0\u1EDBc khi \u0111i \u0111\u01B0\u1EDDng xa")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(860);
	    	
	    	q.setName("2.7.01-112");

			q.setText(new TranslatedString("Sie mussten nach einer Reifenpanne das Notrad montieren. Was ist \nbei der Weiterfahrt verboten?","Sau khi b\u1ECB n\u1ED5 l\u1ED1p, b\u1EA1n ph\u1EA3i thay b\u1EB1ng b\u00E1nh s\u01A1-cua. Khi \u0111i ti\u1EBFp b\u1EB1ng b\u00E1nh n\u00E0y th\u00EC b\u1ECB c\u1EA5m \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schneller als 80 km/h zu fahren","\u0110i nhanh h\u01A1n 80 km/h")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit dem Notrad l\u00E4nger als unbedingt erforderlich zu fahren","\u0110i xa h\u01A1n c\u1EA7n thi\u1EBFt b\u1EB1ng b\u00E1nh s\u01A1-cua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Personen mitzunehmen","Ch\u1EDF theo ng\u01B0\u1EDDi kh\u00E1c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(861);
	    	
	    	q.setName("2.7.01-113");

			q.setText(new TranslatedString("Beim Fahren merken Sie, dass Ihr Pkw stets nach links zieht. \nWelche Ursachen sind m\u00F6glich?","Khi l\u00E1i, b\u1EA1n \u0111\u1EC3 \u00FD th\u1EA5y xe Pkw lu\u00F4n b\u1ECB k\u00E9o v\u1EC1 b\u00EAn tr\u00E1i. Nguy\u00EAn nh\u00E2n c\u00F3 th\u1EC3 do \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu wenig Luft im linken Vorderreifen","B\u00E1nh tr\u01B0\u1EDBc b\u00EAn tr\u00E1i b\u1ECB non h\u01A1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Falsche Radeinstellung an der Vorderachse (Spur, Sturz)","C\u00E2n b\u00E1nh ch\u01B0a \u0111\u00FAng \u1EDF tr\u1EE5c tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Linker Hinterreifen stark abgefahren","B\u00E1nh sau b\u00EAn tr\u00E1i b\u1ECB m\u00F2n nhi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(862);
	    	
	    	q.setName("2.7.01-114");

			q.setText(new TranslatedString("Wozu neigt ein Pkw mit Vorderradantrieb, wenn man in der Kurve \nzu viel Gas gibt?","T\u1EA1i sao xe Pkw lo\u1EA1i \u0111\u1ED9ng c\u01A1 g\u1EAFn ph\u00EDa tr\u01B0\u1EDBc l\u1EA1i b\u1ECB l\u1EA1ng khi t\u0103ng nhi\u1EC1u ga trong \u0111\u01B0\u1EDDng cua?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Er neigt dazu, vorne auszubrechen","Ng\u01B0\u1EDDi l\u00E1i c\u00F3 khuynh h\u01B0\u1EDBng v\u0103ng ra ph\u00EDa tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Er neigt zum \u00DCbersteuern","B\u00E1nh sau b\u1ECB k\u00E9o ra ng\u00F2ai cua")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Er neigt dazu, hinten auszubrechen","Ng\u01B0\u1EDDi l\u00E1i c\u00F3 khuynh h\u01B0\u1EDBng v\u0103ng ra ph\u00EDa sau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(863);
	    	
	    	q.setName("2.7.01-115");

			q.setText(new TranslatedString("Wozu neigt ein Pkw mit Hinterradantrieb, wenn man in der Kurve zu \nviel Gas gibt?","Wozu neigt ein Pkw mit Hinterradantrieb, wenn man in der Kurve zu\nviel Gas gibt?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Er neigt dazu, hinten auszubrechen","Er neigt dazu, hinten auszubrechen")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Er neigt dazu, vorne auszubrechen","Er neigt dazu, vorne auszubrechen")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Er neigt zum Untersteuern","B\u00E1nh tr\u01B0\u1EDBc b\u1ECB k\u00E9o ra ph\u00EDa ngo\u00E0i cua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-116
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(864);
	    	
	    	q.setName("2.7.01-116");

			q.setText(new TranslatedString("Sie fahren in einer Kurve ziemlich schnell und m\u00FCssen pl\u00F6tzlich \nkr\u00E4ftig bremsen. Was ist richtig?","B\u1EA1i \u0111ang ch\u1EA1y trong \u0111\u01B0\u1EDDng cua kh\u00E1 nhanh v\u00E0 \u0111\u1ED9t nhi\u00EAn ph\u1EA3i phanh g\u1EA5p. \u0110i\u1EC1u g\u00EC sau \u0111\u00E2y quan tr\u1ECDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug kann ausbrechen","Xe c\u00F3 th\u1EC3 b\u1ECB k\u00E9o l\u1EC7ch v\u1EC1 m\u1ED9t b\u00EAn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Antiblockiersystem (ABS) h\u00E4lt das Fahrzeug in jedem Fall sicher\nin der Spur","H\u1EC7 th\u1ED1ng ch\u1ED1ng kh\u00F3a (ABS) s\u1EBD gi\u1EEF xe an to\u00E0n trong m\u1ECDi t\u00ECnh hu\u1ED1ng tr\u00EAn l\u00E0n \u0111\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Fahrzeug neigt sich stark zum Kurveninneren","Xe b\u1ECB k\u00E9o m\u1EA1nh v\u00E0o r\u00ECa trong \u0111\u01B0\u1EDDng cua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-117
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(865);
	    	
	    	q.setName("2.7.01-117");

			q.setText(new TranslatedString("Ihr Pkw ohne Antiblockiersystem (ABS) bricht beim Bremsen aus. \nWie reagieren Sie richtig?","Ihr Pkw ohne Antiblockiersystem (ABS) bricht beim Bremsen aus.\nXe c\u1EE7a b\u1EA1n (kh\u00F4ng trang b\u1ECB h\u1EC7 th\u1ED1ng ABS) b\u1ECB kh\u00F3a khi phanh.\nB\u1EA1n ph\u1EA3i ph\u1EA3n \u1EE9ng th\u1EBF n\u00E0o cho \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremse kurzzeitig l\u00F6sen, gegenlenken","T\u1EA1m th\u1EDDi b\u1ECF phanh, b\u1EBB ng\u01B0\u1EE3c l\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Etwas st\u00E4rker bremsen, Lenkrad still halten","Phanh m\u1EA1nh v\u00E0 gi\u1EEF nguy\u00EAn tay l\u00E1i")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(866);
	    	
	    	q.setName("2.7.01-118");

			q.setText(new TranslatedString("Welche Vorteile bietet eine Antriebs-Schlupf-Regelung (ASR)?","H\u1EC7 th\u1ED1ng ch\u1ED1ng tr\u01B0\u1EE3t gi\u00FAp \u0111\u01B0\u1EE3c g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Anfahren wird das Durchdrehen der R\u00E4der verhindert","Ch\u1ED1ng tr\u01B0\u1EE3t b\u00E1nh xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beim Anfahren auf glatter Fahrbahn wird die Gefahr des seitlichen\nWegrutschens geringer","Gi\u1EA3m tr\u01B0\u1EE3t m\u1ED9t b\u00EAn tr\u00EAn \u0111\u01B0\u1EDDng tr\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Bremsen wird das Blockieren der R\u00E4der verhindert","Tr\u00E1nh kh\u00F3a b\u00E1nh khi phanh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-119
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(867);
	    	
	    	q.setName("2.7.01-119");

			q.setText(new TranslatedString("Woran kann es liegen, wenn der Dieselmotor Ihres Fahrzeugs trotz \nvollem Tank stehen bleibt?","Nguy\u00EAn nh\u00E2n n\u00E0o l\u00E0m \u0111\u1ED9ng c\u01A1 Diesel k\u00F4 n\u1ED5 \u0111\u01B0\u1EE3c d\u00F9 \u0111\u00E3 \u0111\u1ED5 \u0111\u1EA7y nhi\u00EAn li\u1EC7u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Luft in der Kraftstoffanlage","Kh\u00ED trong h\u1EC7 th\u1ED1ng nhi\u00EAn li\u1EC7u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Verstopfter Kraftstofffilter","B\u1ED9 l\u1ECDc nhi\u00EAn li\u1EC7u b\u1ECB k\u1EB9t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Defekte Gl\u00FChkerzen","Bugi h\u1ECFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-120
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(868);
	    	
	    	q.setName("2.7.01-120");

			q.setText(new TranslatedString("Sie wollen einen Anh\u00E4nger mit Kugelkupplung ankuppeln. Was ist \nrichtig?","B\u1EA1n mu\u1ED1n m\u00F3c m\u1ED9t r\u01A1-mooc v\u1EDBi v\u1EA5u h\u00ECnh tr\u1EE5c. \u0110i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 quan tr\u1ECDng"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Kupplungsklaue muss den Kugelkopf sicher umschlie\u00DFen. Die\nSicherung muss einrasten","M\u00F3c g\u00E0i ph\u1EA3i bao quay \u0111\u1EA7u tr\u00F2n c\u1EE7a v\u1EA5u m\u1ED9t c\u00E1ch ch\u1EAFc ch\u1EAFn. Kh\u00F3a an to\u00E0n ph\u1EA3i \u0111\u01B0\u1EE3c ch\u1ED1t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die elektrische Verbindung muss hergestellt werden","K\u1EBFt n\u1ED1i \u0111i\u1EC7n ph\u1EA3i \u0111\u01B0\u1EE3c thi\u1EBFt l\u1EADp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("St\u00FCtzrad so einstellen, dass es w\u00E4hrend der Fahrt mitlaufen kann","G\u1EAFn b\u00E1nh tr\u1EE3 l\u1EF1c, lo\u1EA1i c\u00F3 th\u1EC3 quay \u0111\u01B0\u1EE3c khi xe \u0111ang ch\u1EA1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-121
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(869);
	    	
	    	q.setName("2.7.01-121");

			q.setText(new TranslatedString("Was m\u00FCssen Sie nach dem Ankuppeln eines einachsigen \nAnh\u00E4ngers mit Auflaufbremse tun?","Was m\u00FCssen Sie nach dem Ankuppeln eines einachsigen\nAnh\u00E4ngers mit Auflaufbremse tun?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Funktion der Bremse pr\u00FCfen","Funktion der Bremse pr\u00FCfen")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vorhandenes St\u00FCtzrad in die oberste Stellung bringen","Vorhandenes St\u00FCtzrad in die oberste Stellung bringen")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abrei\u00DFseil an der Anh\u00E4ngekupplung des Motorwagens einh\u00E4ngen","Abrei\u00DFseil an der Anh\u00E4ngekupplung des Motorwagens einh\u00E4ngen")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-122
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(870);
	    	
	    	q.setName("2.7.01-122");

			q.setText(new TranslatedString("Was m\u00FCssen Sie beim Beladen eines einachsigen Anh\u00E4ngers \nbeachten? \nDie zul\u00E4ssige","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi k\u00E9o theo r\u01A1-mooc m\u1ED9t tr\u1EE5c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Achslast","\u2013 t\u1EA3i tr\u1ECDng cho ph\u00E9p c\u1EE7a tr\u1EE5c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 St\u00FCtzlast","\u2013 t\u1EA3i tr\u1ECDng cho ph\u00E9p c\u1EE7a b\u00E1nh ph\u1EE5")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Gesamtmasse","\u2013 t\u1ED5ng t\u1EA3i tr\u1ECDng cho ph\u00E9p")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-123
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(871);
	    	
	    	q.setName("2.7.01-123");

			q.setText(new TranslatedString("Sie wollen Ihren einachsigen Anh\u00E4nger (Auflaufbremse, 1.000 kg \nzul\u00E4ssige Gesamtmasse) im Gef\u00E4lle abstellen. Was m\u00FCssen Sie \ntun?","B\u1EA1n mu\u1ED1n \u0111\u1EADu xe c\u00F3 k\u00E9o theo r\u01A1-mooc m\u1ED9t tr\u1EE5c (Auflaufbremse, t\u1EA3i tr\u1ECDng cho ph\u00E9p 1.000 kg) tr\u00EAn m\u1ED9t \u0111o\u1EA1n d\u1ED1c. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Feststellbremse anziehen","K\u00E9o phanh tay")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unterlegkeile vor die R\u00E4der legen","\u0110\u1EB7t mi\u1EBFng ch\u00E8n tr\u01B0\u1EDBc b\u00E1nh xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("R\u00FCckfahrsperre verriegeln","Kh\u00F3a s\u1ED1 l\u00F9i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-124
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(872);
	    	
	    	q.setName("2.7.01-124");

			q.setText(new TranslatedString("Welche gef\u00E4hrlichen M\u00E4ngel k\u00F6nnen an einem auflaufgebremsten \nAnh\u00E4nger nach l\u00E4ngerer Standzeit vorhanden sein?","Nh\u1EEFng h\u1ECFng h\u00F3c n\u00E0o c\u00F3 th\u1EC3 g\u00E2y ra cho r\u01A1-mooc c\u00F3 trang b\u1ECB phanh Auflaufgebremse khi xe n\u00E0y \u0111\u1EADu m\u1ED9t th\u1EDDi gian d\u00E0i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Bremse kann wegen Rost wirkungslos sein","Phanh c\u00F3 th\u1EC3 m\u1EA5t t\u00E1c d\u1EE5ng do g\u1EC9 s\u00E9t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kabelverbindungen k\u00F6nnen besch\u00E4digt sein","D\u00E2y c\u00E1p n\u1ED1i c\u00F3 th\u1EC3 b\u1ECB \u0111\u1EE9t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Reifendruck kann sich durch Sonneneinstrahlung stark erh\u00F6ht\nhaben","\u0110\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p xe c\u00F3 th\u1EC3 t\u0103ng l\u00EAn nhi\u1EC1u do b\u1EE9c x\u1EA1 m\u1EB7t tr\u1EDDi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-125
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(873);
	    	
	    	q.setName("2.7.01-125");

			q.setText(new TranslatedString("Was m\u00FCssen Sie beim Beladen eines Anh\u00E4ngers beachten? \nDie Ladung","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC khi k\u00E9o theo r\u01A1-mooc?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 muss sicher verstaut werden","H\u00E0ng h\u00F3a ph\u1EA3i \u0111\u01B0\u1EE3c bu\u1ED9c c\u1EA9n th\u1EADn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 darf nach hinten ohne zus\u00E4tzliche Kennzeichnung h\u00F6chstens 1 m\n\u00FCber die R\u00FCckstrahler hinausragen","H\u00E0ng h\u00F3a \u0111\u01B0\u1EE3c ph\u00E9p nh\u00F4 ra \u1EDF ph\u00EDa sau t\u1ED1i \u0111a 1 m ph\u00EDa tr\u00EAn mi\u1EBFng ch\u1EAFn ph\u1EA3n quang m\u00E0 kh\u00F4ng c\u1EA7n s\u1EED d\u1EE5ng th\u00EAm bi\u1EC3n c\u1EA3nh b\u00E1o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 darf nach vorn h\u00F6chstens 1 m \u00FCber das Zugfahrzeug hinausragen","H\u00E0ng h\u00F3a \u0111\u01B0\u1EE3c ph\u00E9p nh\u00F4 ra ph\u00EDa tr\u01B0\u1EDBc xe t\u1ED1i \u0111a 1 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-126
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(874);
	    	
	    	q.setName("2.7.01-126");

			q.setText(new TranslatedString("Warum soll beim Befahren eines l\u00E4ngeren Gef\u00E4lles nicht die \nKupplung getreten und der Motor gleichzeitig ausgeschaltet \nwerden?","T\u1EA1i sao khi xu\u1ED1ng 1 con d\u1ED1c d\u00E0i kh\u00F4ng n\u00EAn nh\u1EA5n c\u00F4n v\u00E0 t\u1EAFt \u0111\u1ED9ng c\u01A1 c\u00F9ng l\u00FAc?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Fahrzeugen mit Lenkhilfe wird die Lenkung sofort ungewohnt\nschwerg\u00E4ngig","V\u1EDBi xe c\u00F3 h\u1EC7 th\u1ED1ng tr\u1EE3 l\u1EF1c tay l\u00E1i, tay l\u00E1i s\u1EBD l\u1EADp t\u1EE9c b\u1ECB n\u1EB7ng m\u1ED9t c\u00E1ch b\u1EA5t th\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Fahrzeugen mit Bremskraftverst\u00E4rker kann trotz erh\u00F6hter\nPedalkraft die volle Bremswirkung nicht erreicht werden","V\u1EDBi xe c\u00F3 h\u1EC7 th\u1ED1ng tr\u1EE3 l\u1EF1c phanh, do d\u00F9 \u0111\u00E3 \u0111\u1EA1p phanh m\u1EA1nh h\u01A1n nh\u01B0ng c\u0169ng kh\u00F4ng g\u00E2y ra t\u00E1c d\u1EE5ng phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Batterie wird \u00FCberladen","\u1EAEc qui s\u1EBD b\u1ECB qu\u00E1 t\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.01-127
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(875);
	    	
	    	q.setName("2.7.01-127");

			q.setText(new TranslatedString("Warum soll ein l\u00E4ngeres, starkes Gef\u00E4lle nicht mit getretener \nKupplung durchfahren werden?","T\u1EA1i sao khi xu\u1ED1ng d\u1ED1c \u0111\u1EE9ng v\u00E0 d\u00E0i kh\u00F4ng \u0111\u01B0\u1EE3c nh\u1EA5n c\u00F4n l\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil die Motorbremswirkung nicht zum Tragen kommen kann","Because the engine braking effect can not come into play")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil dadurch unn\u00F6tiger Verschlei\u00DF an den Bremsen eintritt","Because it occurs unnecessary wear on the brakes")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil dann der Bremskraftverst\u00E4rker nicht mehr wirken kann","V\u00EC sau \u0111\u00F3 b\u1ED9 h\u1ED7 tr\u1EE3 phanh kh\u00F4ng c\u00F3 t\u00E1c d\u1EE5ng n\u1EEFa")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-014
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(876);
	    	
	    	q.setName("2.7.02-014");

			q.setText(new TranslatedString("Welche Profiltiefe m\u00FCssen Ihre Reifen mindestens aufweisen? \n_____ mm","\u0110\u1ED9 s\u00E2u c\u1EE7a r\u00E3nh l\u1ED1p t\u1ED1i thi\u1EC3u ph\u1EA3i bao nhi\u00EAu?\n#Note:\n<ul>\n<li><strong>aufweisen</strong>: to present</li>\n<li><strong>Ch\u00FA \u00FD</strong>: \u0110\u1ED9 s\u00E2u c\u1EE7a r\u00E3nh l\u1ED1p ph\u1EA3i t\u1ED1i thi\u1EBFu 1,6 mm</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n1,6 mm "), new TranslatedString("\n\n\n1,6 mm ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-015
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(877);
	    	
	    	q.setName("2.7.02-015");

			q.setText(new TranslatedString("Was k\u00F6nnen Sie am Reifen kontrollieren?","B\u1EA1n ph\u1EA3i ki\u1EC3m tra g\u00EC \u1EDF l\u1ED1p xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die gleichm\u00E4\u00DFige Abnutzung des Profils","\u0110\u1ED9 m\u00F2n nh\u1EB5n c\u1EE7a r\u00E3nh l\u1ED1p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Profiltiefe","\u0110\u1ED9 s\u00E2u c\u1EE7a r\u00E3nh l\u1ED1p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Alter des Reifens","Th\u1EDDi gian s\u1EED d\u1EE5ng l\u1ED1p")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-016
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(878);
	    	
	    	q.setName("2.7.02-016");

			q.setText(new TranslatedString("Wann m\u00FCssen Bremsbel\u00E4ge erneuert werden?","Khi n\u00E0o ph\u1EA3i thay m\u00E1 phanh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn sie ver\u00F6lt sind","Khi m\u00E1 phanh b\u1ECB nh\u1EDBt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn sie an der Verschlei\u00DFgrenze sind","Khi \u0111\u00E3 m\u00F2n \u0111\u1EBFn gi\u1EDBi h\u1EA1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn sie nass geworden sind","Khi m\u00E1 phanh tr\u1EDF n\u00EAn \u01B0\u1EDBt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-017
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(879);
	    	
	    	q.setName("2.7.02-017");

			q.setText(new TranslatedString("Gleich nach dem Losfahren machen Sie eine Bremsprobe. Warum?","Ngay sau khi kh\u1EDFi h\u00E0nh b\u1EA1n n\u00EAn th\u1EED phanh. T\u1EA1i sao ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Um die Wirkung der Betriebsbremse zu pr\u00FCfen","\u0110\u1EC3 ki\u1EC3m tra hi\u1EC7u qu\u1EA3 phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Um die Bremsanlage schnell zu entl\u00FCften","\u0110\u1EC3 nhanh ch\u00F3ng th\u00F4ng kh\u00ED cho h\u1EC7 th\u1ED1ng phanh")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-019
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(880);
	    	
	    	q.setName("2.7.02-019");

			q.setText(new TranslatedString("Warum muss die Bremsfl\u00FCssigkeit nach Anweisung des \nFahrzeugherstellers ausgetauscht werden?","T\u1EA1i sao ph\u1EA3i thay d\u1EA7u phanh theo h\u01B0\u1EDBng d\u1EABn c\u1EE7a nh\u00E0 s\u1EA3n xu\u1EA5t xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Damit die Bremsanlage auch bei hoher Belastung funktionst\u00FCchtig\nbleibt","\u0110\u1EC3 h\u1EC7 th\u1ED1ng phanh c\u00F3 th\u1EC3 ho\u1EA1t \u0111\u1ED9ng \u0111\u01B0\u1EE3c v\u1EDBi c\u1EA3 t\u1EA3i tr\u1ECDng cao h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Damit der Wasseranteil in der Bremsfl\u00FCssigkeit nicht unzul\u00E4ssig hoch\nwird","\u0110\u1EC3 l\u01B0\u1EE3ng n\u01B0\u1EDBc trong d\u1EA7u phanh kh\u00F4ng cao qu\u00E1 gi\u1EDBi h\u1EA1n cho ph\u00E9p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Damit die Bremsanlage nicht undicht wird","\u0110\u1EC3 h\u1EC7 th\u1ED1ng phanh kh\u00F4ng b\u1ECB h\u1EDF")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-020
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(881);
	    	
	    	q.setName("2.7.02-020");

			q.setText(new TranslatedString("In welchen F\u00E4llen ist eine Bremsprobe unerl\u00E4sslich?","Trong tr\u01B0\u1EDDng h\u1EE3p n\u00E0o c\u1EA7n thi\u1EBFt ph\u1EA3i ki\u1EC3m tra phanh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei \u00DCbernahme eines anderen Fahrzeugs","Khi d\u00F9ng xe kh\u00E1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nach l\u00E4ngerer Standzeit eines Fahrzeugs","\u0110\u1ED1i v\u1EDBi xe l\u00E2u r\u1ED3i kh\u00F4ng s\u1EED d\u1EE5ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nach jedem Motor\u00F6lwechsel","Sau m\u1ED7i l\u1EA7n thay d\u1EA7u \u0111\u1ED9ng c\u01A1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-021
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(882);
	    	
	    	q.setName("2.7.02-021");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie in regelm\u00E4\u00DFigen Abst\u00E4nden die Reifen Ihres \nFahrzeugs \u00FCberpr\u00FCfen?","Ph\u1EA3i \u0111\u1ECBnh k\u1EF3 ki\u1EC3m tra g\u00EC \u1EDF l\u1ED1p xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf richtigen Luftdruck","\u0110\u1ED9 c\u0103ng c\u1EE7a l\u1ED1p c\u00F3 \u0111\u00FAng kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf ausreichende Profiltiefe","\u0110\u1ED9 s\u00E2u c\u1EE7a r\u00E3nh l\u1ED1p c\u00F3 \u0111\u1EE7 kh\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf \u00E4u\u00DFere Besch\u00E4digungen","C\u00E1c h\u01B0 h\u1EA1i kh\u00E1c")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-022
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(883);
	    	
	    	q.setName("2.7.02-022");

			q.setText(new TranslatedString("Welche Folgen kann zu hoher oder zu niedriger Luftdruck in den \nReifen haben?","\u0110i\u1EC1u g\u00EC sau \u0111\u00E2y l\u00E0 do l\u1ED1p qu\u00E1 non ho\u1EB7c qu\u00E1 c\u0103ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrverhalten kann sich verschlechtern","\u0110i\u1EC1u khi\u1EC3n xe c\u00F3 th\u1EC3 s\u1EBD kh\u00F3 h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Reifenverschlei\u00DF kann sich erh\u00F6hen","L\u1ED1p m\u00F2n nhi\u1EC1u h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Reaktionsweg kann sich verl\u00E4ngern","\u0110o\u1EA1n \u0111\u01B0\u1EDDng ph\u1EA3n \u1EE9ng d\u00E0i h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-023
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(884);
	    	
	    	q.setName("2.7.02-023");

			q.setText(new TranslatedString("Sie sind mit einem Reifen heftig gegen ein hartes Hindernis \ngefahren. Was m\u00FCssen Sie tun?","M\u1ED9t c\u00E1i l\u1ED1p c\u1EE7a xe b\u1EA1n va m\u1EA1nh v\u00E0o m\u1ED9t ch\u01B0\u1EDBng ng\u1EA1i v\u1EADt c\u1EE9ng. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Reifen und Felge umgehend \u00FCberpr\u00FCfen lassen","L\u1EADp t\u1EE9c ki\u1EC3m tra l\u1ED1p v\u00E0 v\u00E0nh b\u00E1nh xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Radschrauben nachziehen","Si\u1EBFt ch\u1EB7t l\u1EA1i \u1ED1c tr\u00EAn b\u00E1nh xe")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-024
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(885);
	    	
	    	q.setName("2.7.02-024");

			q.setText(new TranslatedString("Was geschieht, wenn Sie mit wesentlich zu niedrigem \nReifenluftdruck fahren?","\u0110i\u1EC1u g\u00EC x\u1EA3y ra khi b\u1EA1n l\u00E1i xe v\u1EDBi l\u1ED1p b\u1ECB non h\u01A1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Reifen erhitzen sich \u00FCberm\u00E4\u00DFig","L\u1ED1p s\u1EBD b\u1ECB n\u00F3ng l\u00EAn nhi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Fahrstabilit\u00E4t nimmt ab","Kh\u1EA3 n\u0103ng l\u00E1i b\u1ECB gi\u1EA3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Reifenverschlei\u00DF nimmt ab","\u0110\u1ED9 m\u00F2n c\u1EE7a l\u1ED1p gi\u1EA3m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-025
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(886);
	    	
	    	q.setName("2.7.02-025");

			q.setText(new TranslatedString("Was kann die Ursache f\u00FCr den Ausfall eines Schlusslichtes sein?","Nguy\u00EAn nh\u00E2n n\u00E0o l\u00E0m \u0111\u00E8n h\u1EADu kh\u00F4ng s\u00E1ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gl\u00FChlampe defekt","B\u00F3ng \u0111\u00E8n h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sicherung durchgebrannt","C\u1EA7u ch\u00EC ch\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Anlasser defekt","B\u1ED9 \u0111\u1EC1 \u0111i\u1EC7n b\u1ECB h\u1ECFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-026
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(887);
	    	
	    	q.setName("2.7.02-026");

			q.setText(new TranslatedString("Die Kontrollleuchte des Blinkers blinkt erheblich schneller als \n\u00FCblich. Welche Ursache kann vorliegen?","\u0110\u00E8n \u0111i\u1EC1u khi\u1EC3n c\u1EE7a h\u1EC7 th\u1ED1ng \u0111\u00E8n xi-nhanh nh\u00E1y nhanh h\u01A1n r\u00F5 r\u1EC7t so v\u1EDBi b\u00ECnh th\u01B0\u1EDDng.\nNguy\u00EAn nh\u00E2n n\u00E0o d\u1EABn \u0111\u1EBFn \u0111i\u1EC1u n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Eine Gl\u00FChlampe ist defekt","M\u1ED9t b\u00F3ng \u0111\u00E8n b\u1ECB ch\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Blinkerschalter ist defekt","C\u00F4ng t\u1EAFc h\u1ECFng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-027
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(888);
	    	
	    	q.setName("2.7.02-027");

			q.setText(new TranslatedString("Warum muss eine durchgerostete Auspuffanlage unverz\u00FCglich \nrepariert werden?","T\u1EA1i sao m\u1ED9t \u1ED1ng b\u00F4 b\u1ECB g\u1EC9 th\u00EC c\u1EA7n ph\u1EA3i s\u1EEDa ngay?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wegen der L\u00E4rmbel\u00E4stigung","Do \u00F4 nhi\u1EC5m ti\u1EBFng \u1ED3n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil Teile der Auspuffanlage auf die Fahrbahn fallen k\u00F6nnen","Do nh\u1EEFng m\u1EA3nh v\u1EE1 c\u1EE7a \u1ED1ng b\u00F4 c\u00F3 th\u1EC3 r\u01A1i xu\u1ED1ng \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Weil der Motor sonst zu hei\u00DF wird","Do m\u00F4-t\u01A1 s\u1EBD b\u1ECB n\u00F3ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-028
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(889);
	    	
	    	q.setName("2.7.02-028");

			q.setText(new TranslatedString("Das Auspuffger\u00E4usch ist pl\u00F6tzlich lauter als normal. Was tun Sie?","Ti\u1EBFng \u1ED3n t\u1EEB \u1ED1ng b\u00F4 th\u01B0\u1EDDng xuy\u00EAn to h\u01A1n b\u00ECnh th\u01B0\u1EDDng. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auspuffanlage \u00FCberpr\u00FCfen","Ki\u1EC3m tra h\u1EC7 th\u1ED1ng \u1ED1ng b\u00F4")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nichts, weil niemand gef\u00E4hrdet wird","Kh\u00F4ng l\u00E0m g\u00EC, v\u00EC ch\u1EB3ng g\u00E2y nguy hi\u1EC3m cho ai c\u1EA3")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Motor-Luftfilter erneuern","Thay b\u1ED9 l\u1ECDc kh\u00ED c\u1EE7a \u0111\u1ED9ng c\u01A1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-029
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(890);
	    	
	    	q.setName("2.7.02-029");

			q.setText(new TranslatedString("Woran kann es liegen, wenn die Hupe nicht funktioniert?","Woran kann es liegen, wenn die Hupe nicht funktioniert?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sicherung durchgebrannt","C\u1EA7u ch\u00EC ch\u00E1y")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bet\u00E4tigungseinrichtung der Hupe defekt","B\u1ED9 k\u00EDch \u0111\u1ED9ng c\u00F2i b\u1ECB h\u1ECFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Anlasser defekt","B\u1ED9 \u0111\u1EC1 b\u1ECB h\u1ECFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(891);
	    	
	    	q.setName("2.7.02-101");

			q.setText(new TranslatedString("Welche Ursachen k\u00F6nnen f\u00FCr zu gro\u00DFes Spiel des Lenkrades \nvorliegen?","Welche Ursachen k\u00F6nnen f\u00FCr zu gro\u00DFes Spiel des Lenkrades\nvorliegen?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Lenkgetriebe defekt","H\u1ECFng h\u1ED9p s\u1ED1")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Kugelgelenk der Spurstange ausgeschlagen","M\u00F2n bi tr\u00EAn \u0111\u1EA7u khu\u1EF7nh c\u1EE7a tr\u1EE5c d\u1EABn")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Reifenluftdruck zu hoch","L\u1ED1p qu\u00E1 c\u0103ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(892);
	    	
	    	q.setName("2.7.02-103");

			q.setText(new TranslatedString("Das Lenkrad l\u00E4sst sich schwerer als normal drehen. Was kann die \nUrsache daf\u00FCr sein?","Tay l\u00E1i n\u1EB7ng h\u01A1n so v\u1EDBi b\u00ECnh th\u01B0\u1EDDng. Nguy\u00EAn nh\u00E2n c\u00F3 th\u1EC3 do \u0111\u00E2u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Lenkgetriebe defekt","H\u1EC7 th\u1ED1ng b\u1EBB l\u00E1i b\u1ECB h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Lenkhilfe ausgefallen","B\u1ED9 tr\u1EE3 l\u1EF1c tay l\u00E1i b\u1ECB h\u1ECFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Reifenluftdruck zu hoch","L\u1ED1p qu\u00E1 c\u0103ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(893);
	    	
	    	q.setName("2.7.02-107");

			q.setText(new TranslatedString("Die Bremse an Ihrem Pkw wirkt stark einseitig. Welche Folgen \nk\u00F6nnen beim Bremsen eintreten?","Phanh xe b\u1ECB l\u1EC7ch nhi\u1EC1u v\u1EC1 m\u1ED9t b\u00EAn. Nh\u1EEFng \u0111i\u1EC1u g\u00EC c\u00F3 th\u1EC3 x\u1EA3y ra khi phanh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Seitliches Ausbrechen des Fahrzeugs","Xe b\u1ECB k\u00E9o l\u1EC7ch v\u1EC1 m\u1ED9t b\u00EAn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("L\u00E4ngerer Bremsweg","Kho\u1EA3ng c\u00E1ch phanh d\u00E0i h\u01A1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ausfall des Antiblockiersystems (ABS)","H\u1EC7 th\u1ED1ng ch\u1ED1ng k\u1EB9t/kh\u00F3a k\u00F4 ho\u1EA1t \u0111\u1ED9ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(894);
	    	
	    	q.setName("2.7.02-108");

			q.setText(new TranslatedString("Beim Bremsen sp\u00FCren Sie, dass Ihr Fahrzeug nach rechts zieht. \nWelche Ursachen sind m\u00F6glich?","Khi phanh, b\u1EA1n c\u1EA3m th\u1EA5y xe b\u1ECB k\u00E9o v\u1EC1 ph\u00EDa ph\u1EA3i. Nguy\u00EAn nh\u00E2n c\u00F3 th\u1EC3 do \u0111\u00E2u ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Bremse wirkt links geringer als rechts","Phanh b\u00EAn tr\u00E1i y\u1EBFu h\u01A1n b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Bremse wirkt rechts geringer als links","Phanh b\u00EAn ph\u1EA3i y\u1EBFu h\u01A1n b\u00EAn tr\u00E1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Lenkgetriebe hat zu viel Spiel","Das Lenkgetriebe hat zu viel Spiel")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(895);
	    	
	    	q.setName("2.7.02-109");

			q.setText(new TranslatedString("Das Bremspedal l\u00E4sst sich bis zum Fahrzeugboden durchtreten. \nErst bei mehrmaliger Bet\u00E4tigung wird der Pedalweg k\u00FCrzer. Was \nm\u00FCssen Sie tun?","B\u00E0n \u0111\u1EA1p phanh c\u00F3 th\u1EC3 ch\u1EA1m s\u00E0n xe. \nErst bei mehrmaliger Bet\u00E4tigung wird der Pedalweg k\u00FCrzer. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrzeug sofort abstellen","D\u1EEBng xe l\u1EA1i ngay")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremse reparieren lassen","S\u1EEDa phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bremsfl\u00FCssigkeit nachf\u00FCllen gen\u00FCgt","\u0110\u1ED5 \u0111\u1EA7y d\u1EA7u phanh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(896);
	    	
	    	q.setName("2.7.02-110");

			q.setText(new TranslatedString("Das Abblendlicht eines Scheinwerfers leuchtet schw\u00E4cher als das \nandere. Woran kann das liegen?","B\u00F3ng \u0111\u00E8n pha b\u00EAn n\u00E0y y\u1EBFu h\u01A1n b\u00EAn kia. C\u00F3 th\u1EC3 l\u00E0 do c\u00E1i g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Blinder Reflektor im Scheinwerfer","T\u1EA5m ph\u1EA3n chi\u1EBFu b\u00EAn trong \u0111\u00E8n pha b\u1ECB m\u1EDD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Falsche Gl\u00FChlampe eingesetzt","B\u00F3ng \u0111\u00E8n l\u1EAFp sai")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Lichtmaschine defekt","Dynamo ph\u00E1t \u0111i\u1EC7n b\u1ECB h\u1ECFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(897);
	    	
	    	q.setName("2.7.02-111");

			q.setText(new TranslatedString("Die Bremsleuchten sind ohne Funktion. Welche Ursachen k\u00F6nnen \nhierf\u00FCr vorliegen?","\u0110\u00E8n phanh kh\u00F4ng c\u00F3 t\u00E1c d\u1EE5ng. \u0110i\u1EC1u n\u00E0y c\u00F3 th\u1EC3 do nh\u1EEFng nguy\u00EAn nh\u00E2n n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremslichtschalter defekt","C\u00F4ng t\u1EAFc \u0111\u00E8n phanh h\u1ECFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gl\u00FChlampen defekt","B\u00F3ng \u0111\u00E8n h\u1ECFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bremspedalweg zu klein","C\u1EA7n \u0111\u1EA1p phanh qu\u00E1 nh\u1ECF")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(898);
	    	
	    	q.setName("2.7.02-112");

			q.setText(new TranslatedString("Die Bremsleuchten sind ohne Funktion. Was tun Sie?","\u0110\u00E8n phanh kh\u00F4ng c\u00F3 t\u00E1c d\u1EE5ng. B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Unverz\u00FCglich reparieren","S\u1EEDa ch\u1EEFa ngay l\u1EADp t\u1EE9c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Bremsfl\u00FCssigkeit erneuern","Thay d\u1EA7u phanh")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(899);
	    	
	    	q.setName("2.7.02-113");

			q.setText(new TranslatedString("Woran k\u00F6nnen Sie w\u00E4hrend der Fahrt eine defekte Blinkleuchte \nerkennen?","L\u00E0m sao \u0111\u1EC3 ph\u00E1t hi\u1EC7n ra m\u1ED9t \u0111\u00E8n xi-nhan b\u1ECB h\u1ECFng khi \u0111ang l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(2);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Kontrollleuchte f\u00FCr den Blinker blinkt schneller als \u00FCblich","\u0110\u00E8n t\u00EDn hi\u1EC7u c\u1EE7a \u0111\u00E8n xi-nhan nh\u00E1y nhanh h\u01A1n b\u00ECnh th\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Eine defekte Blinkleuchte ist w\u00E4hrend der Fahrt nicht erkennbar","Trong khi ch\u1EA1y kh\u00F4ng nh\u1EADn bi\u1EBFt \u0111\u01B0\u1EE3c b\u00F3ng \u0111\u00E8n h\u1ECFng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 2.7.02-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(900);
	    	
	    	q.setName("2.7.02-114");

			q.setText(new TranslatedString("Sie fahren bei Dunkelheit mit Abblendlicht. Entgegenkommende \nblenden auf und ab. Was kann das bedeuten?","B\u1EA1n l\u00E1i xe ban \u0111\u00EAm v\u1EDBi \u0111\u00E8n chi\u1EBFu g\u1EA7n. Xe \u0111\u1ED1i di\u1EC7n ch\u1EDBp t\u1EAFt \u0111\u00E8n li\u00EAn t\u1EE5c. \u0110i\u1EC1u \u0111\u00F3 c\u00F3 ngh\u0129a g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Zusatzstoff");
			
			q.setCategory("B");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Scheinwerfer Ihres Fahrzeuges k\u00F6nnen falsch eingestellt sein und\nblenden","\u0110\u00E8n pha c\u1EE7a xe b\u1EA1n c\u00F3 th\u1EC3 g\u1EAFn sai v\u00E0 chi\u1EBFu l\u00F3a m\u1EAFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Leuchtweitenregelung an Ihrem Fahrzeug ist nicht dem\nBeladungszustand angepasst","\u0110i\u1EC1u ch\u1EC9nh \u0111\u00E8n tr\u00EAn xe b\u1EA1n kh\u00F4ng ph\u00F9 h\u1EE3p v\u1EDBi t\u00ECnh tr\u1EA1ng t\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die anderen fordern Sie auf, Fernlicht einzuschalten","Xe kh\u00E1c y\u00EAu c\u1EA7u b\u1EA1n b\u1EADn \u0111\u00E8n chi\u1EBFu xa")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
