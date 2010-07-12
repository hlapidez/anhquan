package de.anhquan.quiz.client.modules;

import java.util.List;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Panel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

import de.anhquan.quiz.client.AbstractPage;
import de.anhquan.quiz.client.resources.i18n.AppMessages;
import de.anhquan.quiz.client.widgets.LoadingPanel;
import de.anhquan.quiz.client.widgets.NotificationPanel;
import de.anhquan.quiz.client.widgets.NotificationPanel.MessageType;
import de.anhquan.quiz.client.widgets.ToolTip;
import de.anhquan.quiz.client.widgets.TranslatedCheckBox;
import de.anhquan.quiz.client.widgets.TranslatedLabel;
import de.anhquan.quiz.client.widgets.TranslatedTextBox;
import de.anhquan.quiz.shared.BooleanSolution;
import de.anhquan.quiz.shared.Choice;
import de.anhquan.quiz.shared.QuizItem;
import de.anhquan.quiz.shared.Solution;
import de.anhquan.quiz.shared.TextSolution;

public class HelpPage extends AbstractPage {

	public HelpPage() {
		setName("Help");
	}

	@Override
	public Widget onInitialize() {
		
		return null;
	}
}
