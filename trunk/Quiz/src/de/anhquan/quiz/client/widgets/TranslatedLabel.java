package de.anhquan.quiz.client.widgets;

import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.SimplePanel;

import de.anhquan.quiz.shared.TranslatedString;

public class TranslatedLabel extends SimplePanel {

	ToolTip tip;
	HTML text;
	
	public TranslatedLabel(){
		super();
		tip = new ToolTip();
		text = new HTML();
		add (text);
		
		text.addMouseOverHandler(new MouseOverHandler() {

			@Override
			public void onMouseOver(MouseOverEvent event) {
				tip.showRelativeTo(TranslatedLabel.this);
			}
		});
		
		text.addMouseOutHandler(new MouseOutHandler() {
			
			@Override
			public void onMouseOut(MouseOutEvent event) {
				tip.hide(true);
			}
		});
		
		setStyleName("Translated-Label");
	}
	
	public void setContent(TranslatedString str) {
		text.setHTML(str.getOrigin());
		tip.setHTML(str.getTranslation());
	}
}
