package de.anhquan.quiz.client.modules;

import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Widget;

import de.anhquan.quiz.client.AbstractPage;
import de.anhquan.quiz.client.resources.i18n.AppMessages;

public class WhyWrongPage extends AbstractPage {

	public WhyWrongPage() {
		setName(AppMessages.INST.pageWhyWrong());
	}

	@Override
	public Widget onInitialize() {
		
		HTML content = new HTML();
		
		content.setHTML("Update soon!");
		
		return content;
	}
}
