package de.anhquan.quiz.client.modules;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("staticrpc")
public interface StaticContentService extends RemoteService{

	String loadHTML(String filePath) throws IllegalArgumentException;
}
