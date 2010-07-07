package de.anhquan.quiz.server;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.data.ChallengeScheme;
import org.restlet.ext.crypto.DigestAuthenticator;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;
import org.restlet.security.ChallengeAuthenticator;
import org.restlet.security.MapVerifier;

public class ServerApp extends Application{

	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());

		router.attach("/quizrc", QuizResourceImpl.class);

		router.attach("/", new Directory(getContext(), "war:///"));
		return router;
	}
}
