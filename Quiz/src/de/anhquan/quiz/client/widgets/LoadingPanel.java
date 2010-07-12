package de.anhquan.quiz.client.widgets;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

import de.anhquan.quiz.client.resources.Images;

public class LoadingPanel extends HorizontalPanel {

	Label loadingMsg;

	Image loadingIcon;

	public LoadingPanel() {
		loadingMsg = new Label("");
		loadingIcon = new Image(Images.INST.loadingIcon());
		add(loadingIcon);
		add(loadingMsg);
	}

	public void setLoading(boolean busy, String text) {
		loadingIcon.setVisible(busy);
		loadingMsg.setText(text);
	}

}
