package de.anhquan.quiz.client.modules;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.anhquan.quiz.client.AbstractPage;
import de.anhquan.quiz.client.resources.Images;


public class HelloWorldPage extends AbstractPage{

	public HelloWorldPage() {
		super(Images.INST.grid());
	}

	@Override
	protected void asyncOnInitialize(final AsyncCallback<Widget> callback) {
		GWT.runAsync(new RunAsyncCallback() {

			public void onFailure(Throwable caught) {
				callback.onFailure(caught);
			}

			public void onSuccess() {
				callback.onSuccess(onInitialize());
			}
		});
	}

	@Override
	public String getDescription() {
		return "This is a helloworld widget";
	}

	@Override
	public String getName() {
		return "HelloWorld";
	}

	@Override
	public Widget onInitialize() {
		Panel panel = new VerticalPanel();
		Button btOk = new Button("Click me!");	
		panel.add(btOk);
		return panel;
	}

}
