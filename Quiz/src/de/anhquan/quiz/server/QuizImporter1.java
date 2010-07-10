package de.anhquan.quiz.server;

import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.TextSolution;
import de.anhquan.quiz.shared.TranslatedString;

public class QuizImporter1 {

	static {
		
				
		//Question 1.1.07-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(101);
	    	
	    	q.setName("1.1.07-102");

			q.setText(new TranslatedString("Auf einer Stra\u00DFe mit starkem Verkehr haben Sie sich zum \nLinksabbiegen eingeordnet. An der Kreuzung merken Sie, dass Sie \nan sich nach rechts wollten. Wie verhalten Sie sich?","Tr\u00EAn \u0111o\u1EA1n \u0111\u01B0\u1EDDng \u0111\u00F4ng xe c\u1ED9, b\u1EA1n \u0111i tr\u00EAn l\u00E0n \u0111\u01B0\u1EDDng \u0111\u1EC3 qu\u1EB9o tr\u00E1i. Nh\u01B0ng \u0111\u1EBFn ng\u00E3 t\u01B0, b\u1EA1n l\u1EA1i nh\u1EADn ra l\u00E0 m\u00ECnh mu\u1ED1n qu\u1EB9o ph\u1EA3i. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o_"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie biegen nach links ab und nehmen einen Umweg in Kauf","B\u1EA1n c\u1EE9 qu\u1EB9o tr\u00E1i v\u00E0 ch\u1EA5p nh\u1EADn \u0111i \u0111\u01B0\u1EDDng v\u00F2ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie halten an und versuchen, sich durch R\u00FCckw\u00E4rtsfahren richtig\neinzuordnen","B\u1EA1n d\u1EEBng l\u1EA1i v\u00E0 c\u1ED1 g\u1EAFng \u0111i l\u00F9i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie warnen die anderen Verkehrsteilnehmer und biegen dann nach\nrechts ab","B\u1EA1n ra t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o c\u00E1c xe kh\u00E1c v\u00E0 qu\u1EB9o ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(102);
	    	
	    	q.setName("1.1.07-103");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie hinter dieser Stra\u00DFenkuppe rechnen?","B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn nh\u1EEFng g\u00EC c\u00F3 th\u1EC3 x\u1EA3y ra ph\u00EDa sau con d\u1ED1c n\u00E0y?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-103.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dort kann ein Fahrzeug liegen geblieben sein","\u1EDE \u0111\u00F3 c\u00F3 th\u1EC3 c\u00F3 xe \u0111ang \u0111\u1EADu")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Es kann ein Fahrzeug entgegenkommen, das Ihren Fahrstreifen\nmitbenutzt","C\u00F3 th\u1EC3 c\u00F3 xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u, m\u00E0 xe n\u00E0y l\u1EA1i \u0111ang l\u1EA5n qua l\u00E0n \u0111\u01B0\u1EDDng c\u1EE7a b\u1EA1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Ihrem Fahrstreifen kann sich ein langsam fahrendes Fahrzeug\nbefinden","C\u00F9ng tr\u00EAn l\u00E0n \u0111\u01B0\u1EDDng c\u1EE7a b\u1EA1n, c\u00F3 xe kh\u00E1c \u0111ang ch\u1EA1y ch\u1EADm")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(103);
	    	
	    	q.setName("1.1.07-104");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-104.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Mofa-Fahrer k\u00F6nnte nach links ausscheren, um den Radfahrer zu\n\u00FCberholen","Xe m\u00E1y c\u00F3 th\u1EC3 l\u00E1ch qua tr\u00E1i \u0111\u1EC3 v\u01B0\u1EE3t xe \u0111\u1EA1p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der Fahrer des Transporters k\u00F6nnte beim Ausladen weiter auf die\nFahrbahn treten","T\u00E0i x\u1EBF xe t\u1EA3i c\u00F3 th\u1EC3 xu\u1ED1ng \u0111\u01B0\u1EDDng \u0111\u1EC3 d\u1EE1 h\u00E0ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Fu\u00DFg\u00E4ngern, die vor dem Transporter die Fahrbahn \u00FCberqueren","Ng\u01B0\u1EDDi \u0111i b\u1ED9 \u0111ang \u0111\u1EE9ng tr\u01B0\u1EDBc xe t\u1EA3i c\u00F3 th\u1EC3 b\u0103ng qua \u0111\u01B0\u1EDDng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(104);
	    	
	    	q.setName("1.1.07-105");

			q.setText(new TranslatedString("Wie verhalten Sie sich?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-105.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremsen und nach rechts ausweichen","Phanh v\u00E0 tr\u00E1nh v\u1EC1 b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unver\u00E4ndert weiterfahren, damit der Lkw gezwungen wird, wieder\nrechts einzuscheren","C\u1EE9 \u0111i ti\u1EBFp, \u0111\u1EC3 b\u1EAFt xe Lkw ph\u1EA3i \u0111i h\u01B0\u1EDBng v\u00E0o b\u00EAn ph\u1EA3i tr\u00E1nh")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(105);
	    	
	    	q.setName("1.1.07-106");

			q.setText(new TranslatedString("Womit m\u00FCssen Sie rechnen?","B\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-106.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einer gef\u00E4hrlichen Linkskurve","Kh\u00FAc cua qua tr\u00E1i s\u1EBD nguy hi\u1EC3m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einem hinter der Kuppe liegen gebliebenen Fahrzeug","Ph\u00EDa sau con d\u1ED1c c\u00F3 th\u1EC3 c\u00F3 xe \u0111ang d\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit Querverkehr vor der Kurve","C\u00F3 xe c\u1EAFt qua \u0111\u01B0\u1EDDng tr\u01B0\u1EDBc kh\u00FAc cua")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(106);
	    	
	    	q.setName("1.1.07-107");

			q.setText(new TranslatedString("Worauf m\u00FCssen Sie sich einstellen?","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB \u0111\u1EBFn c\u00E1c t\u00ECnh hu\u1ED1ng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-107.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf eine unebene und verschmutzte Fahrbahn","\u0110\u01B0\u1EDDng kh\u00F4ng b\u1EB1ng ph\u1EB3ng v\u00E0 b\u1EA9n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf Arbeiter und Bauger\u00E4te auf der Fahrbahn","Nh\u00E2n c\u00F4ng v\u00E0 m\u00E1y x\u00E2y d\u1EF1ng \u1EDF tr\u00EAn \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf einen durch Polizei geregelten Verkehrsablauf","D\u00F2ng xe \u0111i c\u00F3 tr\u1EADt t\u1EF1 v\u00EC c\u00F3 c\u1EA3nh s\u00E1t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(107);
	    	
	    	q.setName("1.1.07-108");

			q.setText(new TranslatedString("Vor dem Motorrad will ein Pkw auf die Fahrbahn zur\u00FCcksetzen. \nWomit m\u00FCssen Sie rechnen?","Ph\u00EDa tr\u01B0\u1EDBc xe m\u00E1y c\u00F3 m\u1ED9t xe Pkw \u0111ang mu\u1ED1n l\u00F9i ra \u0111\u01B0\u1EDDng.\nB\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng c\u00F3 th\u1EC3 x\u1EA3y ra?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-108.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass die Bremsleuchten des Pkw erl\u00F6schen und dieser weiter\nzur\u00FCcksetzt","\u0110\u00E8n phanh c\u1EE7a xe Pkw b\u1ECB h\u1ECFng nh\u01B0ng xe \u0111\u00F3 v\u1EABn ti\u1EBFp t\u1EE5c l\u00F9i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass der Motorradfahrer pl\u00F6tzlich bremst","Xe m\u00E1y \u0111\u1ED9t nhi\u00EAn phanh l\u1EA1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass Ihr Bremsweg l\u00E4nger als normal werden kann","Kho\u1EA3ng c\u00E1ch phanh c\u1EE7a xe b\u1EA1n s\u1EBD d\u00E0i h\u01A1n b\u00ECnh th\u01B0\u1EDDng\n(<em>Ch\u00FA \u00FD \u0111\u01B0\u1EDDng c\u00F3 tuy\u1EBFt</em>)")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(108);
	    	
	    	q.setName("1.1.07-109");

			q.setText(new TranslatedString("Worauf stellen Sie sich ein? \nDass der","B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB nh\u1EEFng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-109.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Bremsweg l\u00E4nger wird","kho\u1EA3ng c\u00E1ch phanh d\u00E0i h\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Bus sofort anf\u00E4hrt","xe bus \u0111\u1ED9t nhi\u00EAn ch\u1EA1y ti\u1EBFp")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 Busfahrer Sie vorbeifahren l\u00E4sst","T\u00E0i x\u1EBF xe bus \u0111\u1EC3 cho b\u1EA1n v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(109);
	    	
	    	q.setName("1.1.07-110");

			q.setText(new TranslatedString("Warum sind Motorradfahrer besonders gef\u00E4hrdet?","T\u1EA1i sao ng\u01B0\u1EDDi l\u00E1i xe m\u00E1y \u0111\u1EB7c bi\u1EC7t b\u1ECB nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.1.07-110.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil sie leicht \u00FCbersehen werden","D\u1EC5 kh\u00F4ng \u0111\u01B0\u1EE3c ch\u00FA \u00FD")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil ihre Geschwindigkeit untersch\u00E4tzt werden kann","Do t\u1ED1c \u0111\u1ED9 c\u1EE7a xe n\u00E0y hay b\u1ECB \u0111\u00E1nh gi\u00E1 th\u1EA5p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Weil sie bei Unf\u00E4llen ein h\u00F6heres Verletzungsrisiko haben","Khi c\u00F3 tai n\u1EA1n, ng\u01B0\u1EDDi l\u00E1i xe m\u00E1y c\u1ECFa nguy c\u01A1 ch\u1EA5n th\u01B0\u01A1ng cao h\u01A1n")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(110);
	    	
	    	q.setName("1.1.07-111");

			q.setText(new TranslatedString("Sie warten an einer Ampel und wollen nach rechts abbiegen. \nWorauf m\u00FCssen Sie achten? \nSie m\u00FCssen","B\u1EA1n \u0111ang ch\u1EDD \u1EDF tr\u01B0\u1EDBc \u0111\u00E8n giao th\u00F4ng v\u00E0 mu\u1ED1n qu\u1EB9o ph\u1EA3i.\nB\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 sich vergewissern, dass kein Verkehrsteilnehmer rechts neben\nIhnen ist, der geradeaus weiter will","B\u1EA1n ph\u1EA3i \u0111\u1EA3m b\u1EA3o kh\u00F4ng c\u00F3 xe \u0111ang mu\u1ED1n \u0111i th\u1EB3ng t\u1EEB ph\u00EDa sau b\u00EAn ph\u1EA3i xe b\u1EA1n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 nur im Spiegel beobachten, ob ein Radfahrer hinter Ihnen ist","B\u1EA1n ch\u1EC9 nh\u00ECn v\u00E0o g\u01B0\u01A1ng xem c\u00F3 xe \u0111\u1EA1p ph\u00EDa sau hay kh\u00F4ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 sich ganz auf den Abbiegevorgang konzentrieren, weil Radfahrer\nohnehin warten m\u00FCssen","Ho\u00E0n to\u00E0n ki\u1EC3m so\u00E1t \u0111\u01B0\u1EDDng qu\u1EB9o, v\u00EC xe \u0111\u1EA1p d\u00F9 sao c\u0169ng ph\u1EA3i ch\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-112
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(111);
	    	
	    	q.setName("1.1.07-112");

			q.setText(new TranslatedString("Sie wollen nach rechts abbiegen. Wie verhalten Sie sich?","B\u1EA1n mu\u1ED1n qu\u1EB9o ph\u1EA3i. B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o??"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Den Radfahrer geradeaus durchfahren lassen","\u0110\u1EC3 cho xe \u0111\u1EA1p \u0111i th\u1EB3ng ch\u1EA1y qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor dem Radfahrer abbiegen, weil der motorisierte Verkehr Vorrang\nhat","C\u1EE9 qu\u1EB9o tr\u01B0\u1EDBc xe \u0111\u1EA1p, v\u00EC xe c\u00F3 \u0111\u1ED9ng c\u01A1 \u0111\u01B0\u1EE3c \u01B0u ti\u00EAn h\u01A1n")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-113
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(112);
	    	
	    	q.setName("1.1.07-113");

			q.setText(new TranslatedString("Sie fahren auf einer neu angelegten Stra\u00DFe durch bewaldetes \nGebiet. Womit m\u00FCssen Sie rechnen?","B\u1EA1n l\u00E1i xe tr\u00EAn \u0111o\u1EA1n \u0111\u01B0\u1EDDng m\u1EDBi x\u00E2y b\u0103ng qua khu v\u1EF1c r\u1EEBng.\nB\u1EA1n ph\u1EA3i d\u1EF1 ki\u1EBFn \u0111\u1EBFn nh\u1EEFng t\u00ECnh hu\u1ED1ng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wild \u00FCberquert unerwartet die Fahrbahn","C\u00F3 th\u00FA r\u1EEBng \u0111\u1ED9t ng\u1ED9t b\u0103ng qua \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit einem Hindernis durch einen Wildunfall","C\u00F3 ch\u01B0\u1EDBng ng\u1EA1i v\u1EADt do tai n\u1EA1n v\u1EDBi th\u00FA r\u1EEBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Auf neu angelegten Stra\u00DFen sind Wildunf\u00E4lle nicht zu erwarten","Tr\u00EAn \u0111\u01B0\u1EDDng m\u1EDBi x\u00E2y th\u01B0\u1EDDng kh\u00F4ng c\u00F3 tai n\u1EA1n do th\u00FA r\u1EEBng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-114
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(113);
	    	
	    	q.setName("1.1.07-114");

			q.setText(new TranslatedString("Vor Ihrem Fahrzeug fl\u00FCchten mehrere Rehe \u00FCber die Stra\u00DFe. Womit \nm\u00FCssen Sie rechnen?","Tr\u01B0\u1EDBc xe b\u1EA1n c\u00F3 h\u01B0\u01A1u nai ch\u1EA1y qua \u0111\u01B0\u1EDDng. B\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn nh\u1EEFng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dem Rudel k\u00F6nnen weitere Einzeltiere folgen","C\u00F3 nh\u1EEFng con kh\u00E1c trong \u0111\u00E0n s\u1EBD xu\u1EA5t hi\u1EC7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Rudel kann zur\u00FCckkommen und die Stra\u00DFe erneut \u00FCberqueren","\u0110\u00E0n th\u00FA c\u00F3 th\u1EC3 quay l\u1EA1i v\u00E0 b\u0103ng qua \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit weiteren Tieren ist nicht zu rechnen","Kh\u00F4ng ch\u00FA \u00FD nh\u1EEFng con k\u1EBF ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-115
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(114);
	    	
	    	q.setName("1.1.07-115");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten, wenn ein Zusammensto\u00DF mit Wild \nnicht mehr zu vermeiden ist?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o, khi bi\u1EBFt ch\u1EAFc ch\u1EAFn kh\u00F4ng tr\u00E1nh kh\u1ECFi va ch\u1EA1m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bremsen, Lenkrad bzw. Lenker gut festhalten und versuchen, die\nFahrtrichtung beizubehalten","Phanh, gi\u1EEF v\u1EEFng tay l\u00E1i v\u00E0 c\u1ED1 g\u1EAFng gi\u1EEF ti\u1EBFp h\u01B0\u1EDBng ch\u1EA1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In jedem Fall ein Ausweichman\u00F6ver durchf\u00FChren","Trong m\u1ECDi t\u00ECnh hu\u1ED1ng, l\u1EA1ng xe tr\u00E1nh con v\u1EADt v\u00E0 \u0111i ti\u1EBFp")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-116
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(115);
	    	
	    	q.setName("1.1.07-116");

			q.setText(new TranslatedString("Sie fahren z\u00FCgig auf einer Landstra\u00DFe und sehen in einiger \nEntfernung ein Reh in der N\u00E4he der Fahrbahn \u00E4sen. Wie m\u00FCssen \nSie sich verhalten?","B\u1EA1n \u0111ang \u0111i nhanh tr\u00EAn \u0111\u01B0\u1EDDng Landstra\u00DFe v\u00E0 nh\u00ECn th\u1EA5y t\u1EEB xa m\u1ED9t con nai \u0111ang \u0103n c\u1ECF \u1EDF g\u1EA7n \u0111\u01B0\u1EDDng. B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit vermindern und bremsbereit sein","Gi\u1EA3m t\u1ED1c \u0111\u1ED9 v\u00E0 s\u1EB5n s\u00E0ng phanh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Geschwindigkeit erh\u00F6hen, um schnell an dem Reh vorbeizukommen","T\u0103ng t\u1ED1c \u0111\u1EC3 nhanh ch\u00F3ng \u0111i qua con nai")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sofort Vollbremsung durchf\u00FChren","L\u1EADp t\u1EE9c nhanh g\u1EA5p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-117
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(116);
	    	
	    	q.setName("1.1.07-117");

			q.setText(new TranslatedString("Zu welcher Tageszeit ist mit verst\u00E4rktem Wildwechsel zu rechnen?","Th\u1EDDi gian n\u00E0o trong ng\u00E0y hay c\u00F3 th\u00FA r\u1EEBng qua \u0111\u01B0\u1EDDng nh\u1EA5t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("W\u00E4hrend der Abendd\u00E4mmerung","L\u00FAc s\u1EA9m t\u1ED1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Im Morgengrauen","L\u00FAc r\u1EA1ng s\u00E1ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In der Mittagszeit","L\u00FAc gi\u1EEFa tr\u01B0a")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-118
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(117);
	    	
	    	q.setName("1.1.07-118");

			q.setText(new TranslatedString("Mit welchen Gefahren m\u00FCssen Sie vor allem in l\u00E4ndlichen Gebieten \nrechnen?","Nh\u1EEFng nguy hi\u1EC3m n\u00E0o b\u1EA1n ph\u1EA3i t\u00EDnh \u0111\u1EBFn trong khu v\u1EF1c \u0111\u1ED3ng qu\u00EA?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit Fahrbahnverschmutzungen","\u0110\u01B0\u1EDDng b\u1EA9n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit langsamen landwirtschaftlichen Fahrzeugen","Xe c\u00F4ng n\u00F4ng \u0111i ch\u1EADm")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit \u00FCberbreiten landwirtschaftlichen Fahrzeugen","Xe c\u00F4ng n\u00F4ng qu\u00E1 kh\u1ED5 b\u1EC1 ngang")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-119
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(118);
	    	
	    	q.setName("1.1.07-119");

			q.setText(new TranslatedString("In der D\u00E4mmerung kommt Ihnen eine landwirtschaftliche \nZugmaschine mit eingeschalteter Beleuchtung entgegen. Womit \nm\u00FCssen Sie rechnen?","L\u00FAc ch\u1EA1ng v\u1EA1ng t\u1ED1i, t\u1EEB ph\u00EDa ng\u01B0\u1EE3c chi\u1EC1u c\u00F3 m\u1ED9t xe c\u00F4ng n\u00F4ng c\u00F3 b\u1EADt \u0111\u00E8n \u0111ang \u0111i l\u1EA1i. B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Zugmaschine kann ein breiteres, schlecht erkennbares\nArbeitsger\u00E4t mitf\u00FChren","Xe c\u00F4ng n\u00F4ng c\u00F3 th\u1EC3 mang theo m\u00E1y m\u00F3c r\u1ED9ng b\u1EC1 ngang v\u00E0 kh\u00F3 nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Breite der Zugmaschine ist trotz der eingeschalteten Beleuchtung\nnicht immer erkennbar","B\u1EC1 r\u1ED9ng c\u1EE7a xe c\u00F4ng n\u00F4ng kh\u00F4ng ph\u1EA3i lu\u00F4n lu\u00F4n c\u00F3 th\u1EC3 x\u00E1c \u0111\u1ECBnh d\u1EF1a v\u00E0o \u0111\u00E8n tr\u00EAn xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Zugmaschine kann 2 breitere Anh\u00E4nger mitf\u00FChren","Xe c\u00F4ng n\u00F4ng c\u00F3 th\u1EC3 mang theo 2 r\u01A1-mooc r\u1ED9ng b\u1EC1 ngang")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-120
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(119);
	    	
	    	q.setName("1.1.07-120");

			q.setText(new TranslatedString("Was m\u00FCssen Sie beachten, bevor Sie in einen Tunnel einfahren?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC, tr\u01B0\u1EDBc khi \u0111i v\u00E0o \u0111\u01B0\u1EDDng h\u1EA7m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auch am Tage in gut beleuchteten Tunneln mit Abblendlicht fahren","D\u00F9 ban ng\u00E0y trong \u0111\u01B0\u1EDDng h\u1EA7m c\u00F3 \u0111\u00E8n s\u00E1ng, b\u1EA1n v\u1EABn ph\u1EA3i b\u1EADt \u0111\u00E8n pha")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sonnenbrille abnehmen","B\u1ECF k\u00EDnh r\u00E2m ra")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nebelscheinwerfer einschalten","B\u1EADt \u0111\u00E8n s\u01B0\u01A1ng m\u00F9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-121
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(120);
	    	
	    	q.setName("1.1.07-121");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich bei einem Stau im Tunnel verhalten?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi b\u1ECB k\u1EB9t xe trong \u0111\u01B0\u1EDDng h\u1EA7m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Warnblinklicht einschalten","B\u1EADt \u0111\u00E8n t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bei Stillstand mit ca. 5 m Sicherheitsabstand zum Vordermann\nanhalten","Khi d\u1EEBng, gi\u1EEFa kho\u1EA3ng c\u00E1ch an to\u00E0n kho\u1EA3ng 5m v\u1EDBi xe ph\u00EDa tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Fahrzeug sichern und umgehend verlassen","Gi\u1EEF xe an to\u00E0n v\u00E0 l\u1EADp t\u1EE9c r\u1EDDi xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-122
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(121);
	    	
	    	q.setName("1.1.07-122");

			q.setText(new TranslatedString("Wodurch kann die Aufmerksamkeit bei einer Tunneldurchfahrt \nbeeintr\u00E4chtigt werden?","\u0110i\u1EC1u g\u00EC \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn s\u1EF1 t\u1EADp trung khi \u0111i trong \u0111\u01B0\u1EDDng h\u1EA7m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beleuchtungsreflexionen durch den Gegenverkehr","\u00C1nh \u0111\u00E8n ph\u1EA3n chi\u1EBFu c\u1EE7a xe \u0111\u1ED1i di\u1EC7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Tunnell\u00E4nge","\u0110\u1ED9 d\u00E0i c\u1EE7a \u0111\u01B0\u1EDDng h\u1EA7m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Gute Fahrbahnmarkierung","Nh\u1EEFng k\u00FD hi\u1EC7u t\u1ED1t tr\u00EAn \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-123
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(122);
	    	
	    	q.setName("1.1.07-123");

			q.setText(new TranslatedString("Was ist bei einer Tunneldurchfahrt besonders zu beachten?","Khi \u0111i trong \u0111\u01B0\u1EDDng h\u1EA7m ph\u1EA3i \u0111\u1EB7c bi\u1EC7t ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ablenkung durch sehr starke Ger\u00E4usche","Ph\u00E2n t\u00E1n t\u01B0 t\u01B0\u1EDFng do ti\u1EBFng \u1ED3n l\u1EDBn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Hinweise auf Sicherheitseinrichtungen wie Notausg\u00E4nge und\nNotruftelefone","H\u01B0\u1EDBng d\u1EABn an to\u00E0n nh\u01B0 l\u1ED1i tho\u00E1t hi\u1EC3m v\u00E0 \u0111i\u1EC7n tho\u1EA1i c\u1EA5p c\u1EE9u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ablenkung durch Lichteffekte","Ph\u00E2n t\u00E1n t\u01B0 t\u01B0\u1EDFng do hi\u1EC7u \u1EE9ng \u00E1nh \u00E1ng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-124
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(123);
	    	
	    	q.setName("1.1.07-124");

			q.setText(new TranslatedString("Wie verhalten Sie sich bei einer Tunneldurchfahrt?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o khi \u0111i qua \u0111\u01B0\u1EDDng h\u1EA7m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In einem Tunnel mit Gegenverkehr am rechten Fahrbahnrand\norientieren","Trong \u0111\u01B0\u1EDDng h\u1EA7m, ph\u1EA3i \u0111\u1ECBnh h\u01B0\u1EDBng v\u1EC1 l\u1EC1 b\u00EAn ph\u1EA3i khi g\u1EB7p xe ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sicherheitseinrichtungen wie Notausg\u00E4nge und Notruftelefone\neinpr\u00E4gen","Ghi nh\u1EDB c\u00E1c h\u01B0\u1EDBng d\u1EABn an to\u00E0n nh\u01B0 l\u1ED1i tho\u00E1t hi\u1EC3m v\u00E0 \u0111i\u1EC7n tho\u1EA1i c\u1EA5p c\u1EE9u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Mit verringertem Sicherheitsabstand an die Schlussleuchten des\nvorausfahrenden Fahrzeugs h\u00E4ngen","Gi\u1EA3m kho\u1EA3ng c\u00E1ch an to\u00E0n \u0111\u1ED1i v\u1EDBi \u0111\u00E8n h\u1EADu c\u1EE7a xe ph\u00EDa tr\u01B0\u1EDBc")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-125
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(124);
	    	
	    	q.setName("1.1.07-125");

			q.setText(new TranslatedString("Welche grundlegenden Verhaltensregeln m\u00FCssen Sie im Tunnel \nbeachten?","Nh\u1EEFng nguy\u00EAn t\u1EAFc x\u1EED l\u00FD n\u00E0o b\u1EA1n ph\u1EA3i ch\u00FA \u00FD b\u00EAn trong \u0111\u01B0\u1EDDng h\u1EA7m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auch am Tage im gut beleuchteten Tunnel mit Abblendlicht fahren","Ngay c\u1EA3 v\u00E0o ban ng\u00E0y, trong \u0111\u01B0\u1EDDng h\u1EA7m c\u00F3 chi\u1EBFu s\u00E1ng t\u1ED1t, b\u1EA1n v\u1EABn ph\u1EA3i b\u1EADt \u0111\u00E8n pha")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nicht wenden","Kh\u00F4ng \u0111\u01B0\u1EE3c quay ng\u01B0\u1EE3c xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anweisungen und Informationen des Tunnelpersonals Folge leisten","Tu\u00E2n theo h\u01B0\u1EDBng d\u1EABn v\u00E0 th\u00F4ng tin c\u1EE7a nh\u00E2n vi\u00EAn \u0111\u01B0\u1EDDng h\u1EA7m")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-126
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(125);
	    	
	    	q.setName("1.1.07-126");

			q.setText(new TranslatedString("Wie sollten Sie sich bei einem Brand im Tunnel verhalten?","B\u1EA1n n\u00EAn l\u00E0m g\u00EC khi c\u00F3 ch\u00E1y trong \u0111\u01B0\u1EDDng h\u1EA7m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich suche den n\u00E4chsten Fluchtweg","T\u00F4i t\u00ECm c\u1EEDa tho\u00E1t hi\u1EC3m g\u1EA7n nh\u1EA5t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich alarmiere die Tunnel\u00FCberwachungszentrale","T\u00F4i c\u1EA3nh b\u00E1o trung t\u00E2m theo d\u00F5i \u0111\u01B0\u1EDDng h\u1EA7m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich versuche, andere Fahrzeugf\u00FChrer zu warnen","T\u00F4i c\u1ED1 g\u1EAFng \u1EA3nh b\u00E1o nh\u1EEFng ng\u01B0\u1EDDi l\u00E1i xe kh\u00E1c")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.07-127
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(126);
	    	
	    	q.setName("1.1.07-127");

			q.setText(new TranslatedString("Was ist zu tun bei dichter Rauchentwicklung im Tunnel?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC khi trong \u0111\u01B0\u1EDDng h\u1EA7m c\u00F3 kh\u00F3i d\u00E0y \u0111\u1EB7c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Motor abstellen","T\u1EAFt \u0111\u1ED9ng c\u01A1")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fluchtweg suchen","T\u00ECm c\u1EEDa tho\u00E1t hi\u1EC3m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Andere Verkehrsteilnehmer warnen","B\u00E1o cho t\u00E0i x\u1EBF xe kh\u00E1c")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(127);
	    	
	    	q.setName("1.1.09-001");

			q.setText(new TranslatedString("Ein Kraftfahrer hat zu viel Alkohol getrunken und darf deshalb nicht \nmehr fahren. Wie kann er seine Fahrt\u00FCchtigkeit kurzfristig nicht \nwiederherstellen? \nIndem er","M\u1ED9t ng\u01B0\u1EDDi u\u1ED1ng nhi\u1EC1u r\u01B0\u1EE3u v\u00E0 kh\u00F4ng th\u1EC3 l\u00E1i xe \u0111\u01B0\u1EE3c. Nh\u1EEFng vi\u1EC7c g\u00EC anh ta l\u00E0m m\u00E0 kh\u00F4ng gi\u00FAp ph\u1EE5c h\u1ED3i kh\u1EA3ng n\u0103ng l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 eine halbe Stunde schl\u00E4ft","\u2013 ng\u1EE7 trong n\u1EEDa ti\u1EBFng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 zwei Tassen starken Kaffee trinkt","\u2013 u\u1ED1ng 2 t\u00E1ch c\u00E0 ph\u00EA \u0111\u1EB7c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 eine halbe Stunde spazieren geht","\u2013 \u0111i d\u1EA1o n\u1EEDa ti\u1EBFng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(128);
	    	
	    	q.setName("1.1.09-002");

			q.setText(new TranslatedString("Kann die Fahrt\u00FCchtigkeit schon durch verh\u00E4ltnism\u00E4\u00DFig geringe \nMengen Alkohol beeintr\u00E4chtigt werden?","M\u1ED9t l\u01B0\u1EE3ng c\u1ED3n t\u01B0\u01A1ng \u0111\u1ED1i \u00EDt c\u00F3 th\u1EC3 \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn kh\u1EA3 n\u0103ng l\u00E1i xe kh\u00F4ng?\nKann die Fahrt\u00FCchtigkeit schon durch verh\u00E4ltnism\u00E4\u00DFig geringe\nMengen Alkohol beeintr\u00E4chtigt werden?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ja, auch geringe Mengen Alkohol k\u00F6nnen die Fahrt\u00FCchtigkeit\nbeeintr\u00E4chtigen","C\u00F3, m\u1ED9t l\u01B0\u1EE3ng c\u1ED3n nh\u1ECF c\u00F3 th\u1EC3 \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn kh\u1EA3 n\u0103ng l\u00E1i xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nein, wenn der Alkohol zusammen mit Kaffee getrunken wird","Kh\u00F4ng, n\u1EBFu u\u1ED1ng r\u01B0\u1EE3u c\u00F9ng v\u1EDBi c\u00E0 ph\u00EA")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nein, geringe Mengen Alkohol haben nie Einfluss auf die\nFahrt\u00FCchtigkeit","Kh\u00F4ng, m\u1ED9t l\u01B0\u1EE3ng c\u1ED3n nh\u1ECF kh\u00F4ng \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn kh\u1EA3 n\u0103ng l\u00E1i xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(129);
	    	
	    	q.setName("1.1.09-003");

			q.setText(new TranslatedString("Welche Mittel k\u00F6nnen die Fahrt\u00FCchtigkeit \u00E4hnlich beeintr\u00E4chtigen \nwie Alkohol?","Welche Mittel k\u00F6nnen die Fahrt\u00FCchtigkeit \u00E4hnlich beeintr\u00E4chtigen\nwie Alkohol?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Bestimmte Medikamente und berauschende Mittel","M\u1ED9t s\u1ED1 lo\u1EA1i thu\u1ED1c nh\u1EA5t \u0111\u1ECBnh ho\u1EB7c ch\u1EA5t g\u00E2y say")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Eine Tasse Kaffee","M\u1ED9t t\u00E1ch c\u00E0 ph\u00EA")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Eine Tasse Tee","M\u1ED9t t\u00E1ch tr\u00E0")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(130);
	    	
	    	q.setName("1.1.09-004");

			q.setText(new TranslatedString("Wodurch kann die Fahrt\u00FCchtigkeit herabgesetzt werden?","Nh\u1EEFng g\u00EC c\u00F3 th\u1EC3 g\u00E2y gi\u1EA3m s\u00FAt kh\u1EA3 n\u0103ng l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch \u00DCberm\u00FCdung","Do qu\u00E1 m\u1EC7t m\u1ECFi")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Alkohol und andere berauschende Mittel","Do r\u01B0\u1EE3u v\u00E0 m\u1ED9t s\u1ED1 ch\u1EA5t g\u00E2y say kh\u00E1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch bestimmte Medikamente","Do m\u1ED9t s\u1ED1 lo\u1EA1i thu\u1ED1c nh\u1EA5t \u0111\u1ECBnh")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(131);
	    	
	    	q.setName("1.1.09-006");

			q.setText(new TranslatedString("Wie lange dauert es im Allgemeinen, bis 1,0 Promille Alkohol im \nBlut abgebaut ist?","Trong tr\u01B0\u1EDDng h\u1EE3p b\u00ECnh th\u01B0\u1EDDng, bao l\u00E2u th\u00EC gi\u1EA3m \u0111\u01B0\u1EE3c 1/1000 n\u1ED3ng \u0111\u1ED9 c\u1ED3n trong m\u00E1u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("10 Stunden","10 ti\u1EBFng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("5 Stunden","5 ti\u1EBFng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("1 Stunde","1 ti\u1EBFng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(132);
	    	
	    	q.setName("1.1.09-007");

			q.setText(new TranslatedString("Was kann die berauschende Wirkung von Alkohol verst\u00E4rken?","\u0110i\u1EC1u g\u00EC l\u00E0m t\u0103ng c\u01B0\u1EDDng t\u00E1c nh\u00E2n g\u00E2y say trong r\u01B0\u1EE3u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Schlaf-, Schmerz- oder Beruhigungsmittel","Thu\u1ED1c ng\u1EE7, thu\u1ED1c gi\u1EA3m \u0111au, ho\u1EB7c thu\u1ED1c an th\u1EA7n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Trinken auf \u201En\u00FCchternen\u201C Magen","U\u1ED1ng v\u1EDBi c\u00E1i b\u1EE5ng \u0111\u00F3i \u201En\u00FCchternen\u201C Magen")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u201ESturztrunk\u201C","U\u1ED1ng nhi\u1EC1u trong th\u1EDDi gian ng\u1EAFn")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(133);
	    	
	    	q.setName("1.1.09-008");

			q.setText(new TranslatedString("Wozu k\u00F6nnen bereits geringe Mengen Alkohol f\u00FChren?","Ch\u1EC9 m\u1ED9t l\u01B0\u1EE3ng c\u1ED3n nh\u1ECF th\u00F4i c\u00F3 th\u1EC3 g\u00E2y ra \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu verz\u00F6gerter Reaktion","Ph\u1EA3n \u1EE9ng ch\u1EADm")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu riskanter Fahrweise","C\u00E1i l\u00E1i xe li\u1EC1u l\u0129nh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu einem Nachlassen der H\u00F6r- und Sehleistung","Suy gi\u1EA3m kh\u1EA3 n\u0103ng nghe v\u00E0 nh\u00ECn")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(134);
	    	
	    	q.setName("1.1.09-009");

			q.setText(new TranslatedString("Was k\u00F6nnen Drogen bewirken?","Ma t\u00FAy \u1EA3nh h\u01B0\u1EDFng \u0111\u1EBFn \u0111i\u1EC1u g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rauschzust\u00E4nde","Say")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Abh\u00E4ngigkeit, Sucht","Ph\u1EE5 thu\u1ED9c (nghi\u1EC7n), lu\u00F4n s\u0103n l\u00F9ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Anhaltende Verbesserung der k\u00F6rperlichen und geistigen\nLeistungsf\u00E4higkeit","G\u00E2y h\u01B0ng ph\u1EA5n k\u00E9o d\u00E0i v\u1EC1 th\u1EC3 x\u00E1c v\u00E0 th\u1EA7n kinh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(135);
	    	
	    	q.setName("1.1.09-010");

			q.setText(new TranslatedString("Bei welchen Drogen kann schon einmaliger Konsum zu \nvor\u00FCbergehender Fahrunt\u00FCchtigkeit f\u00FChren?","Lo\u1EA1i ma t\u00FAy n\u00E0o m\u00E0 ch\u1EC9 d\u00F9ng m\u1ED9t l\u1EA7n c\u00F3 th\u1EC3 t\u1EA1m th\u1EDDi g\u00E2y m\u1EA5t kh\u1EA3 n\u0103ng l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Haschisch, Marihuana","Haschisch, Marihuana")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Heroin, Kokain, Amphetamine","Heroin, Kokain, Amphetamine")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("LSD","LSD")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-011
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(136);
	    	
	    	q.setName("1.1.09-011");

			q.setText(new TranslatedString("Wie lange k\u00F6nnen Haschisch und seine Abbauprodukte im Urin \nnachgewiesen werden?","Bao l\u00E2u th\u00EC Haschisch (m\u1ED9t d\u1EA1ng ma t\u00FAy) v\u00E0 c\u00E1c s\u1EA3n ph\u1EA9m ph\u1EE5 c\u1EE7a n\u00F3 v\u1EABn \u0111\u01B0\u1EE3c ph\u00E1t hi\u1EC7n trong n\u01B0\u1EDBc ti\u1EC3u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auch noch nach Wochen","Sau c\u1EA3 tu\u1EA7n l\u1EC5")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("H\u00F6chstens 24 Stunden","Cao nh\u1EA5t l\u00E0 24 ti\u1EBFng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-012
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(137);
	    	
	    	q.setName("1.1.09-012");

			q.setText(new TranslatedString("Wer ist als Kraftfahrer ungeeignet? \nPersonen, die","Ai \u0111\u01B0\u1EE3c xem l\u00E0 ng\u01B0\u1EDDi l\u00E1i xe kh\u00F4ng \u0111\u1EE7 ti\u00EAu chu\u1EA9n?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 regelm\u00E4\u00DFig Drogen (wie z.B. Haschisch, Heroin, Kokain) nehmen,\nauch wenn sie zum Zeitpunkt der Fahrt nicht fahrunt\u00FCchtig sind","Ng\u01B0\u1EDDi th\u01B0\u1EDDng xuy\u00EAn d\u00F9ng ma t\u00FAy (v\u00ED d\u1EE5 nh\u01B0: c\u1EA7n sa, heroin, kokain), v\u00E0 ngay c\u1EA3 khi anh ta v\u1EABn c\u00F3 kh\u1EA3 n\u0103ng l\u00E1i xe v\u00E0o th\u1EDDi \u0111i\u1EC3m l\u00E1i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 t\u00E4glich nur eine Haschisch-Zigarette rauchen","Ng\u01B0\u1EDDi m\u1ED7i ng\u00E0y h\u00FAt m\u1ED9t \u0111i\u1EBFu c\u1EA7n sa")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-013
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(138);
	    	
	    	q.setName("1.1.09-013");

			q.setText(new TranslatedString("Jemand hat soeben eine Haschisch-Zigarette geraucht. Darf er \nanschlie\u00DFend ein Kraftfahrzeug f\u00FChren?","M\u1ED9t ng\u01B0\u1EDDi v\u1EEBa m\u1EDBi h\u00FAt m\u1ED9t \u0111i\u1EBFu c\u1EA7n sa c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p l\u00E1i xe kh\u00F4ng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein, weil er dann fahrunt\u00FCchtig sein kann","Kh\u00F4ng, v\u00EC anh ta c\u00F3 th\u1EC3 m\u1EA5t kh\u1EA3 n\u0103ng l\u00E1i sau \u0111\u00F3")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, weil das Rauchen einer Haschisch-Zigarette unbedenklich ist","C\u00F3, v\u00EC h\u00FAt m\u1ED9t \u0111i\u1EBFu c\u1EA7n sa th\u00EC kh\u00F4ng g\u00E2y h\u1EA1i g\u00EC")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-014
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(139);
	    	
	    	q.setName("1.1.09-014");

			q.setText(new TranslatedString("Wann ist ein Drogenabh\u00E4ngiger zum F\u00FChren von Kraftfahrzeugen \nwieder geeignet?","Khi n\u00E0o m\u1ED9t ng\u01B0\u1EDDi d\u00F9ng ma t\u00FAy c\u00F3 kh\u1EA3 n\u0103ng l\u00E1i xe l\u1EA1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Erst wenn er mindestens 1 Jahr lang nachweisbar drogenfrei ist und\nzu erwarten ist, dass er nicht r\u00FCckf\u00E4llig wird","\u0110\u1EA7u ti\u00EAn l\u00E0 m\u1ED9t n\u0103m kh\u00F4ng h\u00FAt, v\u00E0 ch\u1EDD \u0111\u1EBFn khi anh ta kh\u00F4ng t\u00E1i ph\u1EA1m h\u00FAt l\u1EA1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn er seit 1 Monat kein Rauschgift genommen hat","Khi ng\u01B0\u1EDDi \u0111\u00F3 1 th\u00E1ng kh\u00F4ng h\u00FAt")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn er seit 6 Monaten kein Rauschgift genommen hat","Khi ng\u01B0\u1EDDi \u0111\u00F3 6 th\u00E1ng kh\u00F4ng h\u00FAt")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-015
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(140);
	    	
	    	q.setName("1.1.09-015");

			q.setText(new TranslatedString("Wie wird der berauschende Wirkstoff von Haschisch im K\u00F6rper \nabgebaut?","Ch\u1EA5t g\u00E2y say trong c\u1EA7n sa \u0111\u01B0\u1EE3c \u0111\u00E0o th\u1EA3i kh\u1ECFi c\u01A1 th\u1EC3 nh\u01B0 th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ungleichm\u00E4\u00DFig, zeitlich nicht absch\u00E4tzbar","Kh\u00F4ng t\u1EEB t\u1EEB, gi\u1EA3m kh\u00F4ng \u0111\u00E1ng k\u1EC3 theo th\u1EDDi gian")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Gleichm\u00E4\u00DFig, 0,1 Promille je Stunde","T\u1EEB t\u1EEB, m\u1ED7i gi\u1EDD gi\u1EA3m 0,1 ph\u1EA7n ng\u00E0n")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Gleichm\u00E4\u00DFig, 0,1 Gramm je Stunde","T\u1EEB t\u1EEB, m\u1ED7i gi\u1EDD gi\u1EA3m 0,1 Gramm")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-016
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(141);
	    	
	    	q.setName("1.1.09-016");

			q.setText(new TranslatedString("Warum ist bereits der einmalige Konsum von Drogen (wie z.B. \nHaschisch, Heroin, Kokain) gef\u00E4hrlich? \nEr kann","T\u1EA1i sao ch\u1EC9 d\u00F9ng ma t\u00FAy (nh\u01B0 c\u1EA7n sa, heroin, kokain) m\u1ED9t l\u1EA7n th\u00F4i c\u0169ng nguy hi\u1EC3m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 zur Fahrunt\u00FCchtigkeit f\u00FChren","D\u1EABn \u0111\u1EBFn kh\u1EA3 n\u0103ng kh\u00F4ng l\u00E1i \u0111\u01B0\u1EE3c xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 einen mehrere Stunden dauernden Rausch hervorrufen","N\u00F3 g\u00E2y t\u00E1c d\u1EE5ng trong nhi\u1EC1u gi\u1EDD")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-017
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(142);
	    	
	    	q.setName("1.1.09-017");

			q.setText(new TranslatedString("Welche Folgen kann es haben, wenn man unter Einwirkung von \nDrogen (wie z.B. Haschisch, Heroin, Kokain) ein Kraftfahrzeug \nf\u00FChrt?","\u0110i\u1EC1u g\u00EC c\u00F3 th\u1EC3 x\u1EA3 ra khi m\u1ED9t ng\u01B0\u1EDDi l\u00E1i xe d\u01B0\u1EDBi \u1EA3nh h\u01B0\u1EDFng c\u1EE7a ma t\u00FAy (nh\u01B0u c\u1EA7n sa, heroin, kokain)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Entzug der Fahrerlaubnis oder Fahrverbot","R\u00FAt gi\u1EA5y ph\u00E9p l\u00E1i xe ho\u1EB7c b\u1ECB c\u1EA5m l\u00E1i xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geld- und/oder Freiheitsstrafe","Ph\u1EA1t ti\u1EC1n ho\u1EB7c b\u1ECB giam")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Anordnung einer medizinisch-psychologischen Untersuchung","H\u1EB9n ki\u1EC3m tra t\u00E2m l\u00FD")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-018
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(143);
	    	
	    	q.setName("1.1.09-018");

			q.setText(new TranslatedString("Was kann Haschischkonsum bewirken?","S\u1EED d\u1EE5ng c\u1EA7n sa c\u00F3 th\u1EC3 g\u00E2y ra c\u00E1i g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rausch mit gef\u00E4hrlichen Sinnest\u00E4uschung und Herabsetzung des\nReaktionsverm\u00F6gens","Say v\u1EDBi kh\u1EA3 n\u0103ng nh\u1EADn th\u1EE9c sai r\u1EA5t nguy hi\u1EC3m v\u00E0 suy gi\u1EA3m kh\u1EA3 n\u0103ng ph\u1EA3n \u1EE9ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rausch mit Verwirrtheitszust\u00E4nden und Depressionen","Say v\u1EDBi c\u1EA3m gi\u00E1c m\u01A1 h\u1ED3 v\u00E0 tr\u1EA7m c\u1EA3m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Verbesserte Zeiteinsch\u00E4tzung","Kh\u1EA3 n\u0103ng \u01B0\u1EDBc l\u01B0\u1EE3ng th\u1EDDi gian t\u1ED1t h\u01A1n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-019
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(144);
	    	
	    	q.setName("1.1.09-019");

			q.setText(new TranslatedString("Welche Auswirkungen kann Haschischkonsum haben?","S\u1EED d\u1EE5ng ma t\u00FAy c\u00F3 th\u1EC3 b\u1ECB \u1EA3nh h\u01B0\u1EDFng g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Gefahrenbewusstsein kann abnehmen","M\u1EA5t kh\u1EA3 n\u0103ng nh\u1EADn th\u1EE9c nguy hi\u1EC3m")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fehler bei der Verarbeitung von Informationen k\u00F6nnen zunehmen","C\u00F3 th\u1EC3 g\u00E2y sai l\u1EA7m khi x\u1EED l\u00FD th\u00F4ng tin")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fehleinsch\u00E4tzungen von Geschwindigkeit und Entfernung k\u00F6nnen\neintreten","\u01AF\u1EDBc l\u01B0\u1EE3ng sai v\u1EC1 t\u1ED1c \u0111\u1ED9 v\u00E0 kho\u1EA3ng c\u00E1ch")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-020
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(145);
	    	
	    	q.setName("1.1.09-020");

			q.setText(new TranslatedString("Welche Auswirkungen kann Haschischkonsum haben?","Nh\u1EEFng \u1EA3nh h\u01B0\u1EDFng g\u00EC do s\u1EED d\u1EE5ng ma t\u00FAy \u0111em l\u1EA1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("St\u00F6rungen von Aufmerksamkeit und Konzentration","\u1EA2nh h\u01B0\u1EDFng \u0111\u1EBFn kh\u1EA3 n\u0103ng ch\u00FA \u00FD v\u00E0 t\u1EADp trung")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die Blendempfindlichkeit nimmt ab","\u0110\u1ED9 nh\u1EA1y c\u1EE7a m\u1EAFt gi\u1EA3m t\u0103ng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-021
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(146);
	    	
	    	q.setName("1.1.09-021");

			q.setText(new TranslatedString("F\u00FCr wen besteht ein Alkoholverbot beim F\u00FChren von \nKraftfahrzeugen?","Nh\u1EEFng ai b\u1ECB c\u1EA5m b\u1ECB c\u1EA5m u\u1ED1ng r\u01B0\u1EE3u khi l\u00E1i xe?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("F\u00FCr alle Kraftfahrer unter 21 Jahren","T\u1EA5t c\u1EA3 nh\u1EEFng ng\u01B0\u1EDDi l\u00E1i xe d\u01B0\u1EDBi 21 tu\u1ED5i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("F\u00FCr alle Kraftfahrer in der Probezeit","T\u1EA5t c\u1EA3 nh\u1EEFng ng\u01B0\u1EDDi l\u00E1i xe \u0111ang trong th\u1EDDi gian th\u1EED th\u00E1ch sau khi l\u1EA5y b\u1EB1ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("F\u00FCr alle Kraftfahrer","T\u1EA5t c\u1EA3 nh\u1EEFng ng\u01B0\u1EDDi l\u00E1i xe")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.1.09-022
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(147);
	    	
	    	q.setName("1.1.09-022");

			q.setText(new TranslatedString("D\u00FCrfen Kraftfahrer beim F\u00FChren von Kraftfahrzeugen w\u00E4hrend der \nProbezeit unter der Wirkung alkoholischer Getr\u00E4nke stehen?","Ng\u01B0\u1EDDi l\u00E1i xe c\u01A1 gi\u1EDBi c\u00F3 \u0111\u01B0\u1EE3c ph\u00E9p u\u1ED1ng r\u01B0\u1EE3u trong th\u1EDDi gian th\u1EED th\u00E1ch kh\u00F4ng?\nD\u00FCrfen Kraftfahrer beim F\u00FChren von Kraftfahrzeugen w\u00E4hrend der\nProbezeit unter der Wirkung alkoholischer Getr\u00E4nke stehen?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nein, in keinem Fall","Kh\u00F4ng, trong b\u1EA5t k\u1EF3 tr\u01B0\u1EDDng h\u1EE3p n\u00E0o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, bis 0,5 Promille ohne alkoholbedingte Fahrauff\u00E4lligkeit","C\u00F3, n\u1ED3ng \u0111\u1ED9 c\u1ED3n t\u1ED1i \u0111a 0,5 ph\u1EA7n ng\u00E0n m\u00E0 kh\u00F4ng g\u00E2y l\u00E1i xe b\u1EA5t th\u01B0\u1EDDng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ja, bis 0,3 Promille ohne alkoholbedingte Fahrauff\u00E4lligkeit","C\u00F3, n\u1ED3ng \u0111\u1ED9 c\u1ED3n t\u1ED1i \u0111a 0,5 ph\u1EA7n ng\u00E0n m\u00E0 kh\u00F4ng g\u00E2y l\u00E1i xe b\u1EA5t th\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.01-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(148);
	    	
	    	q.setName("1.2.01-001");

			q.setText(new TranslatedString("Die Teilnahme am Stra\u00DFenverkehr erfordert st\u00E4ndige Vorsicht und \ngegenseitige R\u00FCcksicht. Was bedeutet das f\u00FCr Sie? \nSie m\u00FCssen","Nh\u1EEFng ng\u01B0\u1EDDi tham gia giao th\u00F4ng c\u1EA7n li\u00EAn t\u1EE5c ch\u00FA \u00FD tr\u01B0\u1EDBc sau l\u1EABn nhau. \n\u0110i\u1EC1u n\u00E0y c\u00F3 ngh\u0129a g\u00EC \u0111\u1ED1i v\u1EDBi b\u1EA1n?\n- B\u1EA1n ph\u1EA3i"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 mit Fehlverhalten anderer rechnen","\u2013 t\u00EDnh \u0111\u1EBFn nh\u1EEFng c\u00E1ch x\u1EED l\u00FD sai c\u1EE7a ng\u01B0\u1EDDi kh\u00E1c")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 vorausschauend fahren","\u2013 l\u00E1i xe ph\u1EA3i nh\u00ECn xa (hay ph\u1EA3i ph\u00E1n \u0111o\u00E1n tr\u01B0\u1EDBc t\u00ECnh hu\u1ED1ng)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 in jedem Fall auf Ihrem Vorfahrtrecht bestehen","\u2013 trong m\u1ECDi t\u00ECnh hu\u1ED1ng lu\u00F4n gi\u1EEF quy\u1EC1n \u01B0u ti\u00EAn c\u1EE7a m\u00ECnh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.01-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(149);
	    	
	    	q.setName("1.2.01-002");

			q.setText(new TranslatedString("Gegen\u00FCber welchen Verkehrsteilnehmern m\u00FCssen Sie sich \nbesonders vorsichtig verhalten?","\u0110\u1ED1i v\u1EDBi ng\u01B0\u1EDDi tham gia giao th\u00F4ng n\u00E0o b\u1EA1n c\u1EA7n ph\u1EA3i \u0111\u1EB7c bi\u1EC7t c\u1EA9n th\u1EADn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gegen\u00FCber Behinderten, Hilfsbed\u00FCrftigen und \u00E4lteren Fu\u00DFg\u00E4ngern","\u0110\u1ED1i v\u1EDBi ng\u01B0\u1EDDi t\u00E0n t\u1EADt, ng\u01B0\u1EDDi \"c\u1EA7n s\u1EF1 tr\u1EE3 gi\u00FAp\" v\u00E0 ng\u01B0\u1EDDi gi\u00E0 \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gegen\u00FCber Kindern","\u0110\u1ED1i v\u1EDBi tr\u1EBB em")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Gegen\u00FCber Radfahrern, die durch unsichere Fahrweise auffallen","\u0110\u1ED1i v\u1EDBi ng\u01B0\u1EDDi \u0111i xe \u0111\u1EA1p, nh\u1EEFng ng\u01B0\u1EDDi \u0111\u01B0\u1EE3c cho l\u00E0 c\u00F3 c\u00E1ch l\u00E1i xe kh\u00F4ng an to\u00E0n")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.02-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(150);
	    	
	    	q.setName("1.2.02-001");

			q.setText(new TranslatedString("Welche Kraftfahrzeuge m\u00FCssen auf Landstra\u00DFen m\u00F6glichst den \nbefestigten Seitenstreifen benutzen?","Nh\u1EEFng xe n\u00E0o khi \u0111i tr\u00EAn \u0111\u01B0\u1EDDng l\u00E0ng th\u00EC n\u00EAn s\u1EED d\u1EE5ng ph\u1EA7n \u0111\u01B0\u1EDDng s\u00E1t l\u1EC1 n\u1EBFu c\u00F3 th\u1EC3?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Langsam fahrende landwirtschaftliche Zug- und Arbeitsmaschinen","Nh\u1EEFng xe c\u00F4ng n\u00F4ng \u0111i ch\u1EADm")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mofas und Krankenfahrst\u00FChle","Xe mofa (lo\u1EA1i xe gi\u1ED1ng nh\u01B0 xe babetta) v\u00E0 xe l\u0103n cho ng\u01B0\u1EDDi b\u1EC7nh")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Kleinkraftr\u00E4der","Xe m\u00E1y ph\u00E2n kh\u1ED1i nh\u1ECF")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.02-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(151);
	    	
	    	q.setName("1.2.02-101");

			q.setText(new TranslatedString("Wozu darf der rechte Seitenstreifen benutzt werden?","S\u1EED d\u1EE5ng l\u1EC1 b\u00EAn ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.02-101.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zum Halten und Parken","\u0110\u1EC3 d\u1EEBng v\u00E0 \u0111\u1EADu xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zum Befahren mit langsamen Fahrzeugen","\u0110\u1EC3 nh\u1EEFng xe ch\u1EADm s\u1EED d\u1EE5ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zum \u00DCberholen","\u0110\u1EC3 v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.02-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(152);
	    	
	    	q.setName("1.2.02-102");

			q.setText(new TranslatedString("Sie haben sich irrt\u00FCmlich links eingeordnet, wollen aber nach \nrechts abbiegen. Was tun Sie?","Do nh\u1EA7m n\u00EAn b\u1EA1n \u0111i v\u1EC1 b\u00EAn tr\u00E1i, nh\u01B0ng th\u1EF1c ra b\u1EA1n l\u1EA1i mu\u1ED1n qu\u1EB9o ph\u1EA3i. V\u1EADy ph\u1EA3i l\u00E0m sao?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.02-102.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geradeaus fahren oder links abbiegen","\u0110i th\u1EB3ng ho\u1EB7c qu\u1EB9o tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vorsichtig nach rechts abbiegen","C\u1EA9n th\u1EADn qu\u1EB9o ph\u1EA3i")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.03-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(153);
	    	
	    	q.setName("1.2.03-001");

			q.setText(new TranslatedString("Was verl\u00E4ngert den Bremsweg?","C\u00E1i g\u00EC k\u00E9o d\u00E0i kho\u1EA3ng c\u00E1ch phanh?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mitf\u00FChren eines ungebremsten Anh\u00E4ngers","Khi k\u00E9o theo m\u1ED9t r\u01A1-mooc kh\u00F4ng c\u00F3 trang b\u1ECB phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("N\u00E4sse oder glatte Fahrbahnen","Do \u0111\u01B0\u1EDDng \u01B0\u1EDBt ho\u1EB7c tr\u01A1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahren auf Gef\u00E4llstrecken","\u0110i tr\u00EAn \u0111o\u1EA1n \u0111\u01B0\u1EDDng xu\u1ED1ng d\u1ED1c")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.03-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(154);
	    	
	    	q.setName("1.2.03-002");

			q.setText(new TranslatedString("Wovon ist der Bremsweg abh\u00E4ngig? \nVom Zustand der","Kho\u1EA3ng c\u00E1ch phanh ph\u1EE5 thu\u1ED9c nh\u1EEFng y\u1EBFu t\u1ED1 n\u00E0o?\nV\u00E0o tr\u1EA1ng th\u00E1i c\u1EE7a"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Bereifung","\u2013 l\u1ED1p xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Bremsanlage","\u2013 h\u1EC7 th\u1ED1ng phanh")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 Fahrbahnoberfl\u00E4che","\u2013 m\u1EB7t \u0111\u01B0\u1EDDng")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.03-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(155);
	    	
	    	q.setName("1.2.03-101");

			q.setText(new TranslatedString("Welche zul\u00E4ssige H\u00F6chstgeschwindigkeit gilt allgemein innerhalb \ngeschlossener Ortschaften? \n_____ km/h","T\u1ED1c \u0111\u1ED9 t\u1ED1i \u0111a cho ph\u00E9p n\u00F3i chung \u1EDF khu v\u1EF1c \u0111\u00F4 th\u1ECB l\u00E0 bao nhi\u00EAu?\n________ km/h\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\n50 km/h "), new TranslatedString("\n\n\n50 km/h ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.03-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(156);
	    	
	    	q.setName("1.2.03-102");

			q.setText(new TranslatedString("Sie verdoppeln Ihre Geschwindigkeit. Wie ver\u00E4ndert sich der \nBremsweg? \nEr wird _____ mal so lang","B\u1EA1n t\u0103ng g\u1EA5p \u0111\u00F4i v\u1EADn t\u1ED1c xe. Kho\u1EA3ng c\u00E1ch phanh thay \u0111\u1ED5i th\u1EBF n\u00E0o\nKho\u1EA3ng c\u00E1ch phanh s\u1EBD d\u00E0i th\u00EAm ______ l\u1EA7n\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new TextSolution("\n\n\nEr wird 4 mal so lang "), new TranslatedString("\n\n\nEr wird 4 mal so lang ","$esc.java($translatedCommonSolution)")));
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.03-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(157);
	    	
	    	q.setName("1.2.03-103");

			q.setText(new TranslatedString("Was m\u00FCssen Sie bei der Wahl Ihrer Geschwindigkeit \nber\u00FCcksichtigen?","Khi l\u1EF1a ch\u1ECDn t\u1ED1c \u0111\u1ED9 b\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sicht- und Wetterverh\u00E4ltnisse","T\u1EA7m nh\u00ECn v\u00E0 t\u00ECnh tr\u1EA1ng th\u1EDDi ti\u1EBFt")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrbahnzustand und Verkehrsverh\u00E4ltnisse","T\u00ECnh tr\u1EA1ng m\u1EB7t \u0111\u01B0\u1EDDng v\u00E0 m\u1EADt \u0111\u1ED9 xe l\u01B0u th\u00F4ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Pers\u00F6nliche F\u00E4higkeiten","Kh\u1EA3 n\u0103ng l\u00E1i xe c\u1EE7a ch\u00EDnh m\u00ECnh")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.03-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(158);
	    	
	    	q.setName("1.2.03-104");

			q.setText(new TranslatedString("Nach welcher Faustformel kann man aus der Geschwindigkeit den \nWeg in Metern ermitteln, den ein Fahrzeug in einer Sekunde \nzur\u00FCcklegt?","Theo c\u00F4ng th\u1EE9c n\u00E0o \u0111\u1EC3 d\u1EF1a v\u00E0o v\u1EADn t\u1ED1c xe (km/h) x\u00E1c \u0111\u1ECBnh \u0111\u01B0\u1EE3c trong m\u1ED9t gi\u00E2y xe \u0111i \u0111\u01B0\u1EE3c bao nhi\u00EAu m\u00E9t ?\n#Note:\n<ul>\n<li><strong>ermitteln</strong>: x\u00E1c \u0111\u1ECBnh (determine)</li>\n<li><strong>zur\u00FCcklegen</strong>: \u0111i \u0111\u01B0\u1EE3c (to cover a distance)</li>\n</ul>"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.03-104.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("$esc.java($quiz.answerA)","$esc.java($quiz.translatedAnswerA)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("$esc.java($quiz.answerB)","$esc.java($quiz.translatedAnswerB)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("$esc.java($quiz.answerC)","$esc.java($quiz.translatedAnswerC)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.03-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(159);
	    	
	    	q.setName("1.2.03-105");

			q.setText(new TranslatedString("Nach welcher Faustformel kann man aus der Geschwindigkeit den \nBremsweg in Metern bei einer normalen Bremsung berechnen?","Theo c\u00F4ng th\u1EE9c n\u00E0o \u0111\u1EC3 d\u1EF1a v\u00E0o v\u1EADn t\u1ED1c xe t\u00EDnh ra kho\u1EA3ng c\u00E1ch phanh (theo m\u00E9t) trong \u0111i\u1EC1u ki\u1EC7n phanh th\u00F4ng th\u01B0\u1EDDng?\n#Note:"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.03-105.jpg");
			
			q.setPoint(2);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("$esc.java($quiz.answerA)","$esc.java($quiz.translatedAnswerA)")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("$esc.java($quiz.answerB)","$esc.java($quiz.translatedAnswerB)")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("$esc.java($quiz.answerC)","$esc.java($quiz.translatedAnswerC)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.03-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(160);
	    	
	    	q.setName("1.2.03-106");

			q.setText(new TranslatedString("Sie fahren mit 30 km/h. Dabei betr\u00E4gt der Bremsweg bei einer \nnormalen Bremsung 9 Meter nach der Faustformel. Wie lang ist der \nBremsweg unter gleichen Bedingungen bei 60 km/h?","B\u1EA1n \u0111ang \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 30 km/h. Khi \u0111\u00F3 n\u1EBFu \u0111\u1EA1p phanh th\u00EC kho\u1EA3ng c\u00E1ch phanh l\u00E0 9m.\nH\u1ECFi kho\u1EA3ng c\u00E1ch phanh s\u1EBD l\u00E0 bao nhi\u00EAu trong c\u00F9ng m\u1ED9t \u0111i\u1EC1u ki\u1EC7n n\u1EBFu b\u1EA1n \u0111i v\u1EDBi t\u1ED1c \u0111\u1ED9 60 km/h?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("36 m","36 m")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("27 m","27 m")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("18 m","18 m")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.04-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(161);
	    	
	    	q.setName("1.2.04-101");

			q.setText(new TranslatedString("Wovon h\u00E4ngt der einzuhaltende Abstand zum vorausfahrenden \nFahrzeug ab?","Kho\u1EA3ng c\u00E1ch v\u1EDBi xe \u0111i tr\u01B0\u1EDBc theo qui \u0111\u1ECBnh ph\u1EE5 thu\u1ED9c y\u1EBFu t\u1ED1 n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Von den Sichtverh\u00E4ltnissen","ph\u1EE5 thu\u1ED9c t\u1EA7m nh\u00ECn")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Von der Geschwindigkeit","ph\u1EE5 thu\u1ED9c v\u1EADn t\u1ED1c xe")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Von der Fahrbahnbeschaffenheit","ph\u1EE5 thu\u1ED9c v\u00E0o t\u00ECnh tr\u1EA1ng \u0111\u01B0\u1EDDng \u0111i")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(162);
	    	
	    	q.setName("1.2.05-001");

			q.setText(new TranslatedString("Hinter einem langsameren Fahrzeug haben sich mehrere schnellere \nFahrzeuge angesammelt, die nicht \u00FCberholen k\u00F6nnen. Was hat der \nFahrer des langsameren Fahrzeugs zu tun? \nEr muss","Ph\u00EDa sau m\u1ED9t xe ch\u1EA1y ch\u1EADm c\u00F3 nhi\u1EC1u xe \u0111i nhanh b\u1ECB d\u1ED3n c\u1EE5c m\u00E0 kh\u00F4ng th\u1EC3 v\u01B0\u1EE3t l\u00EAn \u0111\u01B0\u1EE3c. Ng\u01B0\u1EDDi l\u00E1i xe ch\u1EADm ph\u1EA3i l\u00E0m g\u00EC?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 an geeigneter Stelle den schnelleren Fahrzeugen das \u00DCberholen\nerm\u00F6glichen","Anh ta ph\u1EA3i \u0111\u1EC3 nh\u1EEFng xe \u0111i nhanh v\u1EF1\u01A1t l\u00EAn \u1EDF m\u1ED9t v\u1ECB tr\u00ED ph\u00F9 h\u1EE3p")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 seine Geschwindigkeit beibehalten","Anh ta ph\u1EA3i gi\u1EEF t\u1ED1c \u0111\u1ED9")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 an der n\u00E4chsten Kreuzung abbiegen","Anh ta ph\u1EA3i qu\u1EB9o \u1EDF giao l\u1ED9 k\u1EBF ti\u1EBFp")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(163);
	    	
	    	q.setName("1.2.05-002");

			q.setText(new TranslatedString("Wie k\u00F6nnen Sie als Fahrer eines langsameren Fahrzeugs \nschnelleren Fahrzeugen das \u00DCberholen erm\u00F6glichen? \n(Mofa: Dritte Antwort entf\u00E4llt)","B\u1EA1n l\u00E0 t\u00E0i x\u1EBF xe ch\u1EA1y ch\u1EADm. B\u1EA1n l\u00E0m c\u00E1ch n\u00E0o \u0111\u1EC3 nh\u1EEFng xe ch\u1EA1y nhanh v\u01B0\u1EE3t l\u00EAn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Ausweichen auf den Seitenstreifen","Tr\u00E1nh v\u00E0o l\u1EC1 \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Durch Ausweichen auf einen Parkstreifen oder in eine Haltebucht","Tr\u00E1nh v\u00E0o ch\u1ED7 \u0111\u1EADu xe b\u00EAn l\u1EC1 ho\u1EB7c \u0111i\u1EC3m d\u1EEBng xe")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Durch Warnen des Gegenverkehrs mit der Lichthupe","C\u1EA3nh b\u00E1o xe ng\u01B0\u1EE3c chi\u1EC1u b\u1EB1ng \u0111\u00E8n nh\u00E1y")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(164);
	    	
	    	q.setName("1.2.05-101");

			q.setText(new TranslatedString("Wo ist das \u00DCberholen verboten?","N\u01A1i n\u00E0o b\u1ECB c\u1EA5m v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wo die Verkehrslage unklar ist","Khi t\u00ECnh tr\u1EA1ng giao th\u00F4ng kh\u00F4ng r\u00F5 r\u00E0ng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wo der Gegenverkehr behindert werden k\u00F6nnte","N\u01A1i xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u c\u00F3 th\u1EC3 b\u1ECB che khu\u1EA5t")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("In allen Einbahnstra\u00DFen","Tr\u00EAn t\u1EA5t c\u1EA3 nh\u1EEFng \u0111\u01B0\u1EDDng m\u1ED9t chi\u1EC1u")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(165);
	    	
	    	q.setName("1.2.05-102");

			q.setText(new TranslatedString("In welchen F\u00E4llen ist das \u00DCberholen immer verboten?","Trong tr\u01B0\u1EDDng h\u1EE3p n\u00E0o th\u00EC kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An Fu\u00DFg\u00E4nger\u00FCberwegen","Tr\u00EAn v\u1EA1ch b\u0103ng qua \u0111\u01B0\u1EDDng d\u00E0nh cho ng\u01B0\u1EDDi \u0111i b\u1ED9")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("An un\u00FCbersichtlichen Stra\u00DFenstellen","\u0110\u01B0\u1EDDng \u0111i kh\u00F4ng nh\u00ECn xa \u0111\u01B0\u1EE3c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Busse auf einer Busspur fahren","Khi c\u00F3 xe bus \u0111ang \u0111i tr\u00EAn l\u00E0n xe bus")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(166);
	    	
	    	q.setName("1.2.05-103");

			q.setText(new TranslatedString("Was ist Voraussetzung f\u00FCr das Ausscheren zum \u00DCberholen?","\u0110i\u1EC1u ki\u1EC7n g\u00EC \u0111\u1EC3 \u0111\u1ED5i h\u01B0\u1EDBng xe khi v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass eine Gef\u00E4hrdung des nachfolgenden Verkehrs ausgeschlossen\nist","Khi kh\u00F4ng g\u00E2y nguy hi\u1EC3m cho xe \u0111i sau")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Dass der Gegenverkehr nicht gef\u00E4hrdet wird","Khi kh\u00F4ng g\u00E2y nguy hi\u1EC3m cho xe ng\u01B0\u1EE3c chi\u1EC1u")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dass der Vorausfahrende rechts blinkt","Khi xe \u0111i tr\u01B0\u1EDBc nh\u00E1y \u0111\u00E8n qu\u1EB9o ph\u1EA3i")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(167);
	    	
	    	q.setName("1.2.05-104");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie einen \u00DCberholvorgang beenden?","B\u1EA1n l\u00E0m th\u1EBF n\u00E0o sau khi v\u01B0\u1EE3t ?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ohne den \u00DCberholten zu behindern, so bald wie m\u00F6glich wieder nach\nrechts einordnen","Kh\u00F4ng c\u1EA3n t\u1EA7m nh\u00ECn c\u1EE7a xe b\u1ECB v\u01B0\u1EE3t, nhanh ch\u00F3ng \u0111i l\u1EA1i v\u00E0o l\u00E0n ph\u1EA3i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Wiedereinordnen rechtzeitig und deutlich anzeigen","Ra d\u1EA5u hi\u1EC7u chuy\u1EC3n h\u01B0\u1EDBng l\u1EA1i \u0111\u00FAng l\u00FAc v\u00E0 r\u00F5 r\u00E0ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Dicht vor dem \u00DCberholten wieder auf die rechte Fahrbahnseite\nwechseln","Ngay tr\u01B0\u1EDBc xe b\u1ECB v\u01B0\u1EE3t, chuy\u1EC3n h\u01B0\u1EDBng ng\u01B0\u1EE3c v\u1EC1 b\u00EAn ph\u1EA3i \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(168);
	    	
	    	q.setName("1.2.05-105");

			q.setText(new TranslatedString("Was ist \u00FCber die Geschwindigkeit beim \u00DCberholvorgang \nvorgeschrieben?","T\u1ED1c \u0111\u1ED9 khi v\u01B0\u1EE3t \u0111\u01B0\u1EE3c qui \u0111\u1ECBnh th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Geschwindigkeit des \u00DCberholenden muss wesentlich h\u00F6her sein","T\u1ED1c \u0111\u1ED9 xe v\u01B0\u1EE3t v\u1EC1 c\u01A1 b\u1EA3n ph\u1EA3i cao h\u01A1n (xe b\u1ECB v\u01B0\u1EE3t)")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die zul\u00E4ssige H\u00F6chstgeschwindigkeit darf nicht \u00FCberschritten werden","T\u1ED1c \u0111\u1ED9 v\u01B0\u1EE3t kh\u00F4ng \u0111\u01B0\u1EE3c v\u01B0\u1EE3t qu\u00E1 t\u1ED1c \u0111\u1ED9 cho ph\u00E9p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wer \u00FCberholt wird, darf seine Geschwindigkeit nicht erh\u00F6hen","Xe b\u1ECB v\u01B0\u1EE3t, kh\u00F4ng \u0111\u01B0\u1EE3c t\u0103ng t\u1ED1c")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(169);
	    	
	    	q.setName("1.2.05-106");

			q.setText(new TranslatedString("Wie m\u00FCssen Sie sich verhalten, wenn Sie \u00FCberholt werden?","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o, khi b\u1EA1n b\u1ECB v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("M\u00F6glichst weit rechts fahren","\u0110i v\u1EC1 ph\u00EDa ph\u1EA3i n\u1EBFu c\u00F3 th\u1EC3")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Geschwindigkeit nicht erh\u00F6hen","Kh\u00F4ng \u0111\u01B0\u1EE3c t\u0103ng t\u1ED1c")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Geschwindigkeit erh\u00F6hen","T\u0103ng t\u1ED1c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(170);
	    	
	    	q.setName("1.2.05-107");

			q.setText(new TranslatedString("Auf welcher Seite ist eine Stra\u00DFenbahn zu \u00FCberholen, die in der \nMitte der Fahrbahn f\u00E4hrt (keine Einbahnstra\u00DFe)?","Ph\u1EA3i v\u01B0\u1EE3t t\u00E0u \u0111i\u1EC7n \u1EDF ph\u00EDa n\u00E0o, khi t\u00E0u n\u00E0y \u0111i \u1EDF gi\u1EEFa \u0111\u01B0\u1EDDng (kh\u00F4ng ph\u1EA3i \u0111\u01B0\u1EDDng m\u1ED9t chi\u1EC1u)?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Rechts","B\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Links","B\u00EAn tr\u00E1i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Links nur dann, wenn rechts andere Fahrzeuge die Fahrbahn\nversperren","Ch\u1EC9 v\u01B0\u1EE3t \u1EDF b\u00EAn tr\u00E1i, khi b\u00EAn ph\u1EA3i \u0111ang c\u00F3 xe kh\u00E1c chi\u1EBFm \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(171);
	    	
	    	q.setName("1.2.05-108");

			q.setText(new TranslatedString("In welchen F\u00E4llen d\u00FCrfen Sie eine Stra\u00DFenbahn links \u00FCberholen?","Trong t\u00ECnh hu\u1ED1ng n\u00E0o b\u1EA1n \u0111\u01B0\u1EE3c ph\u00E9p v\u01B0\u1EE3t xe \u0111i\u1EC7n \u1EDF b\u00EAn tr\u00E1i?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("In Einbahnstra\u00DFen","Tr\u00EAn \u0111\u01B0\u1EDDng m\u1ED9t chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn die Schienen zu weit rechts liegen","Khi \u0111\u01B0\u1EDDng ray n\u1EB1m xa \u1EDF b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn die Fahrbahn (keine Einbahnstra\u00DFe) rechts neben der\nStra\u00DFenbahn durch andere Fahrzeuge versperrt ist","Khi \u0111\u01B0\u1EDDng \u0111i (kh\u00F4ng ph\u1EA3i \u0111\u01B0\u1EDDng m\u1ED9t chi\u1EC1u) ph\u00EDa b\u00EAn ph\u1EA3i c\u1EA1nh t\u00E0u \u0111i\u1EC7n b\u1ECB xe kh\u00E1c chi\u1EBFm \u0111\u01B0\u1EDDng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-109
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(172);
	    	
	    	q.setName("1.2.05-109");

			q.setText(new TranslatedString("Welche Fahrzeuge d\u00FCrfen nur mit besonders gro\u00DFem Seitenabstand \n\u00FCberholt werden?","Nh\u1EEFng xe n\u00E0o ch\u1EC9 \u0111\u01B0\u1EE3c v\u01B0\u1EE3t khi c\u00F3 kho\u1EA3ng c\u00E1ch an to\u00E0n b\u00EAn l\u1EDBn?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrr\u00E4der","Xe \u0111\u1EA1p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Motorr\u00E4der","Xe m\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Stra\u00DFenbahnen","T\u00E0u \u0111i\u1EC7n")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-110
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(173);
	    	
	    	q.setName("1.2.05-110");

			q.setText(new TranslatedString("In welchen F\u00E4llen m\u00FCssen Sie blinken?","Trong t\u00ECnh hu\u1ED1ng n\u00E0o b\u1EA1n ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Ausscheren zum \u00DCberholen oder zum Vorbeifahren","Tr\u01B0\u1EDBc khi chuy\u1EC3n h\u01B0\u1EDBng v\u01B0\u1EE3t ho\u1EB7c \u0111i qua")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Wiedereinordnen nach dem \u00DCberholen","Tr\u01B0\u1EDBc khi \u0111i xe ng\u01B0\u1EE3c v\u00E0o l\u00E0n \u0111\u01B0\u1EDDng khi v\u01B0\u1EE3t xong")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Verlassen einer abknickenden Vorfahrtstra\u00DFe in gerader\nRichtung","Khi r\u1EDDi \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn theo h\u01B0\u1EDBng \u0111i th\u1EB3ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.05-111
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(174);
	    	
	    	q.setName("1.2.05-111");

			q.setText(new TranslatedString("Was m\u00FCssen Sie beim \u00DCberholen hinsichtlich des Abstandes \nbeachten?","B\u1EA1n ph\u1EA3i ch\u00FA \u00FD g\u00EC \u0111\u1EBFn kho\u1EA3ng c\u00E1ch an to\u00E0n khi v\u01B0\u1EE3t?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ausreichenden Seitenabstand vor allem zu Fu\u00DFg\u00E4ngern und\nRadfahrern einhalten","Gi\u1EEF \u0111\u1EE7 kho\u1EA3ng c\u00E1ch an to\u00E0n b\u00EAn \u0111\u1ED1i v\u1EDBi ng\u01B0\u1EDDi \u0111i b\u1ED9 v\u00E0 xe \u0111\u1EA1p")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Den \u00DCberholten beim Wiedereinordnen nicht behindern","Kh\u00F4ng che t\u1EA7m nh\u00ECn c\u1EE7a xe b\u1ECB v\u01B0\u1EE3t khi qu\u1EB9o ng\u01B0\u1EE3c l\u1EA1i v\u00E0o l\u00E0n \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zu mehrspurigen Fahrzeugen gr\u00F6\u00DFeren Seitenabstand einhalten als\nzu einspurigen","Gi\u1EEF kho\u1EA3ng c\u00E1ch an to\u00E0n v\u1EDBi xe nhi\u1EC1u l\u00E0n (v\u00ED d\u1EE5: xe Pkw 4 b\u00E1nh) l\u1EDBn h\u01A1n so v\u1EDBi xe m\u1ED9t l\u00E0n (v\u00ED d\u1EE5: xe m\u00E1y 2 b\u00E1nh)")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.06-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(175);
	    	
	    	q.setName("1.2.06-001");

			q.setText(new TranslatedString("Welches Fahrzeug muss warten, wenn eine Baustelle die halbe \nFahrbahn blockiert?","Xe n\u00E0o ph\u1EA3i ch\u1EDD, khi c\u00F3 c\u00F4ng tr\u01B0\u1EDDng x\u00E2y d\u1EF1ng chi\u1EBFm h\u1EBFt m\u1ED9t n\u1EEDa \u0111\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Fahrzeug, auf dessen Seite die Baustelle ist","Xe \u1EDF b\u00EAn ph\u00EDa c\u00F4ng tr\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Das Fahrzeug auf der freien Fahrbahnh\u00E4lfte","Xe \u1EDF b\u00EAn ph\u00EDa \u0111\u01B0\u1EDDng tr\u1ED1ng")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Immer das kleinere Fahrzeug","Lu\u00F4n l\u00E0 xe nh\u1ECF ph\u1EA3i ch\u1EDD")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.06-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(176);
	    	
	    	q.setName("1.2.06-002");

			q.setText(new TranslatedString("Wer muss warten?","Ai ph\u1EA3i ch\u1EDD?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.06-002.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss warten","T\u00F4i ph\u1EA3i ch\u1EDD")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Entgegenkommende muss warten","Xe ng\u01B0\u1EE3c chi\u1EC1u ph\u1EA3i ch\u1EDD")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.07-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(177);
	    	
	    	q.setName("1.2.07-001");

			q.setText(new TranslatedString("Was m\u00FCssen Sie tun, wenn Sie den Fahrstreifen wechseln wollen?","B\u1EA1n ph\u1EA3i l\u00E0m g\u00EC, n\u1EBFu b\u1EA1n mu\u1ED1n chuy\u1EC3n sang l\u00E0n kh\u00E1c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrstreifenwechsel rechtzeitig ank\u00FCndigen","Ra t\u00EDn hi\u1EC7u chuy\u1EC3n l\u00E0n \u0111\u00FAng l\u00FAc")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Auf den nachfolgenden Verkehr achten","Ch\u00FA \u00FD xe ph\u00EDa sau")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Vor dem Fahrstreifenwechsel immer stark abbremsen","Tr\u01B0\u1EDBc khi chuy\u1EC3n l\u00E0n, lu\u00F4n ph\u1EA3i phanh m\u1EA1nh")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.07-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(178);
	    	
	    	q.setName("1.2.07-101");

			q.setText(new TranslatedString("F\u00FCr welche F\u00E4lle ist das Rei\u00DFverschlussverfahren vorgesehen?","H\u1EC7 th\u1ED1ng nh\u1EADp l\u00E0n \u0111\u01B0\u1EE3c thi\u1EBFt k\u1EBF d\u00F9ng trong tr\u01B0\u1EDDng h\u1EE3p n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Fahrstreifen enden","Khi h\u1EBFt l\u00E0n \u0111\u01B0\u1EDDng")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Fahrstreifen wegen eines Hindernisses nicht durchgehend\nbefahrbar sind","Khi l\u00E0n \u0111\u01B0\u1EDDng g\u1EB7p tr\u01B0\u1EDBc ng\u1EA1i v\u1EADt m\u00E0 kh\u00F4ng th\u1EC3 \u0111i th\u00F4ng qua")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Beschleunigungsstreifen einm\u00FCnden","Khi giao v\u1EDBi l\u00E0n \u0111\u01B0\u1EDDng t\u0103ng t\u1ED1c")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.07-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(179);
	    	
	    	q.setName("1.2.07-102");

			q.setText(new TranslatedString("Auf einer Fahrbahn mit mehreren Fahrstreifen f\u00FCr eine Richtung \nendet ein Fahrstreifen. Wie haben sich die Fahrer auf dem \ndurchgehenden Fahrstreifen zu verhalten?","Tr\u00EAn \u0111\u01B0\u1EDDng c\u00F3 nhi\u1EC1u l\u00E0n c\u00F9ng h\u01B0\u1EDBng v\u00E0 k\u1EBFt th\u00FAc b\u1EB1ng 1 l\u00E0n \u0111\u01B0\u1EDDng (h\u1ED9i t\u1EE5 l\u1EA1i). T\u00E0i x\u1EBF ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o tr\u00EAn l\u00E0n xe \u0111ang ch\u1EA1y li\u00EAn t\u1EE5c?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Den am Weiterfahren gehinderten Fahrzeugen den \u00DCbergang nach\ndem Rei\u00DFverschlussverfahren erm\u00F6glichen","Den am Weiterfahren gehinderten Fahrzeugen den \u00DCbergang nach\ndem Rei\u00DFverschlussverfahren erm\u00F6glichen")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("An den wartenden Fahrzeugen vorbeifahren, notfalls Warnzeichen\ngeben","\u0110i qua xe \u0111ang ch\u1EDD, khi c\u1EA7n thi\u1EBFt ph\u1EA3i \u0111\u01B0a t\u00EDn hi\u1EC7u c\u1EA3nh b\u00E1o")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.07-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(180);
	    	
	    	q.setName("1.2.07-103");

			q.setText(new TranslatedString("Auf nebeneinander liegenden Fahrstreifen f\u00FCr eine Fahrtrichtung \nendet ein Fahrstreifen. Sie befinden sich auf dem nicht \ndurchgehend befahrbaren Fahrstreifen. Welches Verhalten ist \nrichtig?","C\u1EA1nh m\u1ED9t l\u00E0n \u0111\u01B0\u1EDDng c\u00F3 m\u1ED9t l\u00E0n \u0111\u01B0\u1EDDng tr\u00EAn c\u00F9ng m\u1ED9t h\u01B0\u1EDBng \u0111i s\u1EAFp k\u1EBFt th\u00FAc. B\u1EA1n l\u1EA1i \u0111ang \u1EDF tr\u00EAn l\u00E0n \u0111\u01B0\u1EDDng s\u1EAFp k\u1EBFt th\u00FAc n\u00E0y. C\u00E1ch x\u1EED l\u00FD n\u00E0o sau \u0111\u00E2y l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Erst unmittelbar vor Beginn der Verengung im\nRei\u00DFverschlussverfahren einordnen","\u0110i th\u1EB3ng v\u00E0o \u0111i\u1EC3m b\u1EAFt \u0111\u1EA7u c\u1EE7a khu v\u1EF1c nh\u1EADp l\u00E0n")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Unmittelbar nach dem ersten Hinweis auf die Fahrbahnverengung in\nden durchgehend zu befahrenden Fahrstreifen einordnen","place immediately after the first indication of the constriction in the roadway to traffic lanes throughout")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Einordnen in den durchgehenden Fahrstreifen stets zuerst\nfahren","Beim Einordnen in den durchgehenden Fahrstreifen stets zuerst fahren")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.07-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(181);
	    	
	    	q.setName("1.2.07-104");

			q.setText(new TranslatedString("Wie verhalten Sie sich in einem Tunnel mit Gegenverkehr?","B\u1EA1n s\u1EBD x\u1EED l\u00FD th\u1EBF n\u00E0o \u0111\u1ED1i v\u1EDBi xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u trong \u0111\u01B0\u1EDDng h\u1EA7m?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrstreifenbegrenzung nicht \u00FCberfahren","Kh\u00F4ng \u0111\u01B0\u1EE3c \u0111i qua v\u1EA1ch ph\u00E2n l\u00E0n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nicht wenden","Kh\u00F4ng \u0111\u01B0\u1EE3c l\u1EA1ng, chuy\u1EC3n h\u01B0\u1EDBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Zum \u00DCberholen Fahrstreifenbegrenzung \u00FCberfahren","\u0110i l\u00EAn v\u1EA1ch ph\u00E2n l\u00E0n \u0111\u1EC3 v\u01B0\u1EE3t")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-001
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(182);
	    	
	    	q.setName("1.2.09-001");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-001.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den gelben Lkw durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3  xe Lkw m\u00E0u v\u00E0ng \u0111i qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem gelben Lkw abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc xe Lkw m\u00E0u v\u00E0ng")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-002
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(183);
	    	
	    	q.setName("1.2.09-002");

			q.setText(new TranslatedString("Welches Verhalten ist richtig?","C\u00E1ch x\u1EED l\u00FD n\u00E0o l\u00E0 \u0111\u00FAng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-002.jpg");
			
			q.setPoint(5);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss an der Haltlinie zun\u00E4chst anhalten","T\u00F4i \u0111\u1EA7u ti\u00EAn ph\u1EA3i d\u1EEBng \u1EDF v\u1EA1ch stop")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich muss den Radfahrer durchfahren lassen","T\u00F4i ph\u1EA3i \u0111\u1EC3 xe \u0111\u1EA1p \u0111i qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich darf vor dem Radfahrer abbiegen","T\u00F4i \u0111\u01B0\u1EE3c ph\u00E9p qu\u1EB9o tr\u01B0\u1EDBc xe \u0111\u1EA1p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-003
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(184);
	    	
	    	q.setName("1.2.09-003");

			q.setText(new TranslatedString("Sie wollen links abbiegen. In welcher Reihenfolge bereiten Sie das \nAbbiegen vor? \n(Mofa: \u201Eblinken\u201C durch \u201EFahrtrichtung anzeigen\u201C ersetzen)","B\u1EA1n mu\u1ED1n qu\u1EB9o tr\u00E1i. B\u1EA1n ph\u1EA3i chu\u1EA9n b\u1ECB qu\u1EB9o theo th\u1EE9 t\u1EF1 n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Nachfolgenden Verkehr beobachten, blinken, einordnen","Ch\u00FA \u00FD xe ph\u00EDa sau, nh\u00E1y \u0111\u00E8n xi-nhan, chuy\u1EC3n h\u01B0\u1EDBng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Blinken, einordnen, nachfolgenden Verkehr beobachten","Nh\u00E1y \u0111\u00E8n xi-nhan, chuy\u1EC3n h\u01B0\u1EDBng, ch\u00FA \u00FD xe ph\u00EDa sau")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Einordnen, blinken, nachfolgenden Verkehr beobachten","Chuy\u1EC3n h\u01B0\u1EDBng, nh\u00E1y \u0111\u00E8n xi-nhan, ch\u00FA \u00FD xe ph\u00EDa sau")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-004
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(185);
	    	
	    	q.setName("1.2.09-004");

			q.setText(new TranslatedString("Welche Fahrlinie m\u00FCssen Sie einhalten?","B\u1EA1n ph\u1EA3i \u0111i theo v\u1EA1ch \u0111\u01B0\u1EDDng n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-004.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die rechte","V\u1EA1ch b\u00EAn ph\u1EA3i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die linke","V\u1EA1ch b\u00EAn tr\u00E1i")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-005
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(186);
	    	
	    	q.setName("1.2.09-005");

			q.setText(new TranslatedString("In welchen F\u00E4llen m\u00FCssen Sie blinken? \n(Mofa: \u201Eblinken\u201C durch \u201EFahrtrichtung anzeigen\u201C ersetzen)","Trong t\u00ECnh hu\u1ED1ng n\u00E0o b\u1EA1n ph\u1EA3i nh\u00E1y \u0111\u00E8n xi-nhan?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Abbiegen in eine Einm\u00FCndung oder in ein Grundst\u00FCck","Tr\u01B0\u1EDBc khi qu\u1EB9o \u1EDF giao l\u1ED9 ho\u1EB7c \u1EDF Grundst\u00FCck")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie dem Verlauf einer abknickenden Vorfahrtstra\u00DFe folgen\nwollen","Khi b\u1EA1n mu\u1ED1n theo \u0111\u01B0\u1EDDng ch\u1EA1y c\u1EE7a \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn cong")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn Sie eine abknickende Vorfahrtstra\u00DFe in gerader Richtung\nverlassen","Khi b\u1EA1n r\u1EDDi \u0111\u01B0\u1EDDng \u01B0u ti\u00EAn theo h\u01B0\u1EDBng \u0111i th\u1EB3ng")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-006
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(187);
	    	
	    	q.setName("1.2.09-006");

			q.setText(new TranslatedString("Sie wollen nach links abbiegen. Wann haben Sie auf den \nnachfolgenden Verkehr zu achten?","B\u1EA1n mu\u1ED1n qu\u1EB9o tr\u00E1i. Khi n\u00E0o b\u1EA1n ph\u1EA3i ch\u00FA \u00FD xe ph\u00EDa sau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Vor dem Einordnen und noch einmal unmittelbar vor dem Abbiegen","Tr\u01B0\u1EDBc khi chuy\u1EC3n h\u01B0\u1EDBng, v\u00E0 m\u1ED9t l\u1EA7n n\u1EEFa ngay tr\u01B0\u1EDBc khi qu\u1EB9o")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Lediglich einmal vor dem Abbiegen","Ch\u1EC9 quan s\u00E1t m\u1ED9t l\u1EA7n tr\u01B0\u1EDBc khi qu\u1EB9o")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-007
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(188);
	    	
	    	q.setName("1.2.09-007");

			q.setText(new TranslatedString("Sie wollen nach links abbiegen. Wen m\u00FCssen Sie durchlassen?","B\u1EA1n mu\u1ED1n qu\u1EB9o tr\u00E1i. B\u1EA1n ph\u1EA3i \u0111\u1EC3 ai \u0111i tr\u01B0\u1EDBc?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Entgegenkommende Radfahrer","Xe \u0111\u1EA1p \u0111i ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Entgegenkommende Kraftfahrzeuge","Xe c\u00F3 \u0111\u1ED9ng c\u01A1 \u0111i ng\u01B0\u1EE3c chi\u1EC1u")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fu\u00DFg\u00E4nger, die die Stra\u00DFe \u00FCberqueren wollen, in die ich einbiege","Ng\u01B0\u1EDDi \u0111i b\u1ED9, \u0111ang mu\u1ED1n b\u0103ng qua \u0111\u01B0\u1EDDng m\u00E0 t\u00F4i mu\u1ED1n qu\u1EB9o v\u00E0o")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-008
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(189);
	    	
	    	q.setName("1.2.09-008");

			q.setText(new TranslatedString("Wie haben Sie sich zu verhalten? \n(Mofa: Klingeln statt Hupen)","B\u1EA1n ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-008.jpg");
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Beide Radfahrer durchfahren lassen","\u0110\u1EC3 c\u1EA3 hai xe \u0111\u1EA1p \u0111i qua tr\u01B0\u1EDBc")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Nur den in gleicher Richtung fahrenden Radfahrer durchfahren lassen","Ch\u1EC9 nh\u01B0\u1EDDng xe \u0111\u1EA1p c\u00F9ng chi\u1EC1u \u0111i ti\u1EBFp")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Hupen und vor den beiden Radfahrern abbiegen","B\u00F3p c\u00F2i v\u00E0 qu\u1EB9o tr\u01B0\u1EDBc 2 xe \u0111\u1EA1p")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-009
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(190);
	    	
	    	q.setName("1.2.09-009");

			q.setText(new TranslatedString("Zwei Fahrzeuge kommen sich entgegen und wollen beide links \nabbiegen. Wie m\u00FCssen sie sich im Regelfall verhalten?","Hai xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u nhau v\u00E0 \u0111\u1EC1u mu\u1ED1n qu\u1EB9o tr\u00E1i. H\u1ECD ph\u1EA3i x\u1EED l\u00FD th\u1EBF n\u00E0o trong tr\u01B0\u1EDDng h\u1EE3p th\u00F4ng th\u01B0\u1EDDng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Sie biegen voreinander ab","Xe n\u00E0y qu\u1EB9o ph\u00E1i tr\u01B0\u1EDBc xe kiaSie biegen voreinander ab")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Sie fahren einen weiten Bogen und biegen hintereinander ab","Sie fahren einen weiten Bogen und biegen hintereinander ab")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-010
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(191);
	    	
	    	q.setName("1.2.09-010");

			q.setText(new TranslatedString("Zwei Fahrzeuge kommen sich entgegen und wollen beide links \nabbiegen. In welchen F\u00E4llen m\u00FCssen Sie darauf verzichten, \nvoreinander links abzubiegen?","Hai xe \u0111i ng\u01B0\u1EE3c chi\u1EC1u nhau v\u00E0 \u0111\u1EC1u mu\u1ED1n qu\u1EB9o tr\u00E1i.\nTrong t\u00ECnh hu\u1ED1ng n\u00E0o hai xe kh\u00F4ng \u0111\u01B0\u1EE3c qu\u1EB9o tr\u00E1i tr\u01B0\u1EDBc m\u1EB7t nhau?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Sie erkennen, dass der entgegenkommende Linksabbieger\nhinter Ihnen abbiegen will","Khi b\u1EA1n bi\u1EBFt r\u1EB1ng, xe mu\u1ED1n qu\u1EB9o tr\u00E1i \u0111i ng\u01B0\u1EE3c chi\u1EC1u mu\u1ED1n qu\u1EB9o ph\u00EDa sau xe b\u1EA1n")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Wenn Markierungen auf der Fahrbahn es verbieten","N\u1EBFu c\u00F3 v\u1EA1ch c\u1EA5m qu\u1EB9o tr\u00EAn \u0111\u01B0\u1EDDng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Wenn der entgegenkommende Linksabbieger kurz vor der\nKreuzungsmitte anh\u00E4lt","Khi xe \u0111\u1ED1i di\u1EC7n d\u1EEBng ngay kho\u1EA3ng gi\u1EEFa giao l\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-011
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(192);
	    	
	    	q.setName("1.2.09-011");

			q.setText(new TranslatedString("Sie wollen links abbiegen. Welche Schwierigkeiten k\u00F6nnen dabei \nauftreten?","B\u1EA1n mu\u1ED1n qu\u1EB9o tr\u00E1i. Nh\u1EEFng kh\u00F3 kh\u0103n n\u00E0o c\u00F3 th\u1EC3 c\u00F3?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die Sicht auf entgegenkommende, geradeaus weiterfahrende\nFahrzeuge kann durch entgegenkommende Linksabbieger behindert","T\u1EA7m nh\u00ECn v\u1EC1 xe ng\u01B0\u1EE3c chi\u1EC1u \u0111i th\u1EB3ng b\u1ECB c\u00E1c xe ng\u01B0\u1EE3c chi\u1EC1u qu\u1EB9o tr\u00E1i che khu\u1EA5t")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Mit entgegenkommenden Linksabbiegern kann es zu gef\u00E4hrlichen\nMissverst\u00E4ndnissen kommen","C\u00F3 th\u1EC3 c\u00F3 hi\u1EC3u nh\u1EA7m nguy hi\u1EC3m v\u1EDBi xe ng\u01B0\u1EE3c chi\u1EC1u qu\u1EB9o tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Beim Abbiegen voreinander ist ein Blockieren der Kreuzung durch die\nbeiden Linksabbieger wahrscheinlich","Do vi\u1EC7c qu\u1EB9o tr\u01B0\u1EDBc xe kh\u00E1c, hai xe qu\u1EB9o tr\u00E1i c\u00F3 kh\u1EA3 n\u0103ng l\u00E0m k\u1EB9t giao l\u1ED9")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-101
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(193);
	    	
	    	q.setName("1.2.09-101");

			q.setText(new TranslatedString("Was kann bei mehrspurigem Abbiegen zu besonders gef\u00E4hrlichen \nSituationen f\u00FChren?","Was kann bei mehrspurigem Abbiegen zu besonders gef\u00E4hrlichen\nSituationen f\u00FChren?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setPoint(4);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Zu schnelles Fahren","Zu schnelles Fahren")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Fahrstreifenwechsel w\u00E4hrend des Abbiegens","Fahrstreifenwechsel w\u00E4hrend des Abbiegens")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Genaues Einhalten des Fahrstreifens","Genaues Einhalten des Fahrstreifens")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-102
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(194);
	    	
	    	q.setName("1.2.09-102");

			q.setText(new TranslatedString("Welche Fahrlinie m\u00FCssen Sie in dieser Einbahnstra\u00DFe einhalten?","B\u1EA1n ph\u1EA3i \u0111i theo v\u1EA1ch \u0111\u01B0\u1EDDng tr\u00EAn \u0111\u01B0\u1EDDng m\u1ED9t chi\u1EC1u?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-102.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Die linke","V\u1EA1ch b\u00EAn tr\u00E1i")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Die rechte","V\u1EA1ch b\u00EAn ph\u1EA3i")));
		    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-103
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(195);
	    	
	    	q.setName("1.2.09-103");

			q.setText(new TranslatedString("Alle drei Fahrzeuge wollen links abbiegen. Wer hat sich richtig \neingeordnet?","C\u1EA3 3 xe \u0111\u1EC1u mu\u1ED1n qu\u1EB9o tr\u00E1i. Xe n\u00E0o \u0111i \u0111\u00FAng ch\u1ED7?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-103.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der gelbe Pkw","Xe Pkw m\u00E0u v\u00E0ng")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der Lkw","Der Lkw")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der gr\u00FCne Pkw","Xe Pkw m\u00E0u xanh l\u00E1")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-104
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(196);
	    	
	    	q.setName("1.2.09-104");

			q.setText(new TranslatedString("Nach dem Linksabbiegen wollen Sie sofort rechts abbiegen. Wie \nordnen Sie sich ein? \nWie der","Sau khi qu\u1EB9o tr\u00E1i b\u1EA1n mu\u1ED1n qu\u1EB9o ph\u1EA3i ngay. B\u1EA1n ph\u1EA3i \u0111i nh\u01B0 th\u1EBF n\u00E0o?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-104.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("\u2013 rote Pkw","\u2013 \u0110i nh\u01B0 xe Pkw m\u00E0u \u0111\u1ECF")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 gr\u00FCne Pkw","\u2013 \u0110i nh\u01B0 xe Pkw m\u00E0u xanh l\u00E1")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("\u2013 blaue Pkw","\u2013 \u0110i nh\u01B0 xe Pkw m\u00E0u da tr\u1EDDi")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-105
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(197);
	    	
	    	q.setName("1.2.09-105");

			q.setText(new TranslatedString("Wer muss hier die Fahrtrichtungs\u00E4nderung anzeigen?","Ai ph\u1EA3i ra t\u00EDn hi\u1EC7u chuy\u1EC3n h\u01B0\u1EDBng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-105.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich selbst","Ch\u00EDnh t\u00F4i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der rote Pkw","Xe Pkw m\u00E0u \u0111\u1ECF")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Motorrad","Xe m\u00E1y")));
			
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-106
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(198);
	    	
	    	q.setName("1.2.09-106");

			q.setText(new TranslatedString("Wer muss die Fahrtrichtungs\u00E4nderung anzeigen?","Ai ph\u1EA3i ra t\u00EDn hi\u1EC7u chuy\u1EC3n h\u01B0\u1EDBng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-106.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich selbst","Ch\u00EDnh t\u00F4i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der blaue Lkw","Xe Lkw m\u00E0u xanh da tr\u1EDDi")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Der rote Pkw","Xe Pkw m\u00E0u \u0111\u1ECF")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-107
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(199);
	    	
	    	q.setName("1.2.09-107");

			q.setText(new TranslatedString("Wer muss die Fahrtrichtungs\u00E4nderung anzeigen?","Ai ph\u1EA3i ra t\u00EDn hi\u1EC7u chuy\u1EC3n h\u01B0\u1EDBng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-107.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Das Motorrad","Xe m\u00E1y")));
				q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Ich selbst","Ch\u00EDnh t\u00F4i")));
					q.addChoice(new Choice(new BooleanSolution(false), new TranslatedString("Keiner","Kh\u00F4ng ai c\u1EA3")));
				
	    	QuizDB.addQuiz(q);
    	}
    	
    	//Question 1.2.09-108
		{
	    	QuizItem q = new QuizItem();	    	
	    	
	    	q.setId(200);
	    	
	    	q.setName("1.2.09-108");

			q.setText(new TranslatedString("Wer muss die Fahrtrichtungs\u00E4nderung anzeigen?","Ai ph\u1EA3i ra t\u00EDn hi\u1EC7u chuy\u1EC3n h\u01B0\u1EDBng?"));
			
			q.setAnswerHeader(new TranslatedString("",""));
			
			q.setImage("1.2.09-108.jpg");
			
			q.setPoint(3);
			
			q.setSubCategory("Grundstoff");
			
			q.setCategory("G");
			
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Ich selbst","Ch\u00EDnh t\u00F4i")));
			q.addChoice(new Choice(new BooleanSolution(true), new TranslatedString("Der entgegenkommende Pkw","Xe Pkw \u0111i ng\u01B0\u1EE3c chi\u1EC1u")));
	    	QuizDB.addQuiz(q);
    	}
    	
    			
	}
}
