package de.anhquan.quiz.client.widgets;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.PushButton;

import de.anhquan.quiz.client.resources.Images;


public class CountryFlagButton extends PushButton {
	private static List<CountryFlagButton> allButtons = null;

	private String localeName;

	public CountryFlagButton(String nativeName, String localeName) {
		super(new Image((ImageResource) Images.INST.getResource(localeName)));
		this.localeName = localeName;

		if (allButtons == null) {
			allButtons = new ArrayList<CountryFlagButton>();
		}
		allButtons.add(this);
	}

	@Override
	protected void onClick() {
		for (CountryFlagButton button : allButtons) {
			if (button != this) {
				button.setEnabled(true);
			}
		}

		this.setEnabled(false);
		super.onClick();
	}

	public String getLocaleName() {
		return localeName;
	}
}