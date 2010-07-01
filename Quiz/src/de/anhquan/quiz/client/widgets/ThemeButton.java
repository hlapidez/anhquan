package de.anhquan.quiz.client.widgets;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.client.ui.ToggleButton;

/*
 * A special version of the ToggleButton that cannot be clicked if down. If
 * one theme button is pressed, all of the others are depressed.
 */
public class ThemeButton extends ToggleButton {
	private static List<ThemeButton> allButtons = null;

	private String theme;

	public ThemeButton(String theme) {
		super();
		this.theme = theme;
		addStyleName("sc-ThemeButton-" + theme);

		// Add this button to the static list
		if (allButtons == null) {
			allButtons = new ArrayList<ThemeButton>();
			setDown(true);
		}
		allButtons.add(this);
		
		setWidth("12px");
		setHeight("12px");
	}

	public String getTheme() {
		return theme;
	}

	@Override
	protected void onClick() {
		if (!isDown()) {
			// Raise all of the other buttons
			for (ThemeButton button : allButtons) {
				if (button != this) {
					button.setDown(false);
				}
			}

			// Fire the click handlers
			super.onClick();
		}
	}
}