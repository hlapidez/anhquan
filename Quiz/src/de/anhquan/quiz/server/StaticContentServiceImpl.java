package de.anhquan.quiz.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import de.anhquan.quiz.client.modules.StaticContentService;

public class StaticContentServiceImpl extends RemoteServiceServlet implements StaticContentService {

	private static final long serialVersionUID = 1L;

	@Override
	public String loadHTML(String filePath) throws IllegalArgumentException{
		return filePath;
	}

}
