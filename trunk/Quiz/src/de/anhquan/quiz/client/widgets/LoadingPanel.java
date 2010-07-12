package de.anhquan.quiz.client.widgets;

import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Label;

import de.anhquan.quiz.client.resources.Images;
import de.anhquan.quiz.client.resources.i18n.AppMessages;

public class LoadingPanel extends HorizontalPanel {

	Label loadingMsg;

	Image loadingIcon;

	public LoadingPanel() {
		loadingMsg = new Label("");
		loadingIcon = new Image(Images.INST.loadingIcon());
		add(loadingIcon);
		add(loadingMsg);
		clear();
	}

	public void setBusy(String text){
		loadingIcon.setVisible(true);
		loadingMsg.setText(text);
	}
	
	public void setBusy(){
		setBusy(AppMessages.INST.loading());
	}
	
	public void clear(){
		loadingIcon.setVisible(false);
		loadingMsg.setText("");
	}

}
