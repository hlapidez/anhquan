package de.anhquan.quiz.client.widgets;

import com.google.gwt.user.client.ui.AbsolutePanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.PopupPanel;
import com.google.gwt.widgetideas.client.GlassPanel;

public class ToolTip extends PopupPanel {

	HTML content;

	public ToolTip() {
		setGlassEnabled(false);
		setAutoHideEnabled(true);
		setModal(false);

		GlassPanel glassPanel = new GlassPanel(false);

		content = new HTML();
		
		setWidget(glassPanel);

		AbsolutePanel absolutePanel = new AbsolutePanel();
		absolutePanel.setStyleName("ToolTip-Inner");
		absolutePanel.add(content);
		absolutePanel.add(glassPanel, 0, 0);

		setWidget(absolutePanel);
		this.setStyleName("ToolTip");
	}

	public void setHTML(String html) {
		content.setHTML(html);
	}

}