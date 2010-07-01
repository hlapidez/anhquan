package de.anhquan.quiz.client;

import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.dom.client.LinkElement;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.DeferredCommand;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;

public class StyleSheetLoader {
	private static class StyleTesterTimer extends Timer {
		private Command callback;
		private Label refWidget;

		public StyleTesterTimer(String refStyleName, Command callback) {
			this.callback = callback;

			// Create the reference Widget
			refWidget = new Label();
			refWidget.setStyleName(refStyleName);
			refWidget.getElement().getStyle().setProperty("position", "absolute");
			refWidget.getElement().getStyle().setProperty("visibility", "hidden");
			refWidget.getElement().getStyle().setProperty("display", "inline");
			refWidget.getElement().getStyle().setPropertyPx("padding", 0);
			refWidget.getElement().getStyle().setPropertyPx("margin", 0);
			refWidget.getElement().getStyle().setPropertyPx("border", 0);
			refWidget.getElement().getStyle().setPropertyPx("top", 0);
			refWidget.getElement().getStyle().setPropertyPx("left", 0);
			RootPanel.get().add(refWidget);
		}

		@Override
		public void run() {
			// Redisplay the reference widget so it redraws itself
			refWidget.setVisible(false);
			refWidget.setVisible(true);

			// Check the dimensions of the reference widget
			if (refWidget.getOffsetWidth() > 0) {
				RootPanel.get().remove(refWidget);

				// Fire the callback in a DeferredCommand to ensure the browser
				// has enough time to parse the styles. Otherwise, we'll get weird styling issues.
				DeferredCommand.addCommand(callback);
			} else {
				schedule(10);
			}
		}
	}

	public static native HeadElement getHeadElement()
	/*-{
	  return $doc.getElementsByTagName("head")[0];
	}-*/;

	public static void loadStyleSheet(String href) {
		LinkElement linkElem = Document.get().createLinkElement();
		linkElem.setRel("stylesheet");
		linkElem.setType("text/css");
		linkElem.setHref(href);
		getHeadElement().appendChild(linkElem);
	}

	public static void loadStyleSheet(String href, String refStyleName, Command callback) {
		loadStyleSheet(href);
		waitForStyleSheet(refStyleName, callback);
	}

	public static void waitForStyleSheet(String refStyleName, Command callback) {
		new StyleTesterTimer(refStyleName, callback).run();
	}
}
