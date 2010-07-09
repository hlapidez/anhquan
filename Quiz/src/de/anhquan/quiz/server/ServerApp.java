package de.anhquan.quiz.server;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.resource.Directory;
import org.restlet.routing.Router;

public class ServerApp extends Application{

	@Override
	public Restlet createInboundRoot() {
		Router router = new Router(getContext());

		router.attach("/quiz", QuizServerResource.class);

		router.attach("/", new Directory(getContext(), "war:///"));
		return router;
	}
}
