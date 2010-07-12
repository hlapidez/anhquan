package de.anhquan.quiz.client.modules;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StaticContentServiceAsync {
	public void loadHTML(String filePath, AsyncCallback<String> callback) throws IllegalArgumentException;
}
