package de.anhquan.quiz.client;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.Element;
import com.google.gwt.dom.client.HeadElement;
import com.google.gwt.dom.client.Node;
import com.google.gwt.dom.client.NodeList;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.http.client.UrlBuilder;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.Command;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.Window.Location;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;

import de.anhquan.quiz.client.modules.QuizPage;
import de.anhquan.quiz.client.resources.Images;
import de.anhquan.quiz.client.resources.i18n.AppConstants;
import de.anhquan.quiz.client.widgets.CountryFlagButton;
import de.anhquan.quiz.client.widgets.ThemeButton;


public class MainEntryPoint implements EntryPoint {

	static String CUR_THEME = AppConstants.STYLE_THEMES[0];

	private Application app = new Application();

	/**
	 * A mapping of history tokens to their associated menu items.
	 */
	private Map<String, TreeItem> historyTokenMap = new HashMap<String, TreeItem>();

	/**
	 * A mapping of menu items to the widget display when the item is selected.
	 */
	private Map<TreeItem, AbstractPage> pageMap = new HashMap<TreeItem, AbstractPage>();

	public void onModuleLoad() {
		// Swap out the style sheets for the RTL versions if needed.
		updateStyleSheets();

		// Create the application
		createApplicationTitle();
		createTopLinks();
		setupOptionsPanel();
		
		//init all pages and map them to the sidebar menu
		setupSidebarMenu();

		// Setup a history handler to reselect the associate menu item
		final ValueChangeHandler<String> historyHandler = new ValueChangeHandler<String>() {
			public void onValueChange(ValueChangeEvent<String> event) {
				TreeItem item = historyTokenMap.get(event.getValue());
				if (item == null) {
					item = app.getSidebarMenu().getItem(0).getChild(0);
				}

				// Select the associated TreeItem
				app.getSidebarMenu().setSelectedItem(item, false);
				app.getSidebarMenu().ensureSelectedItemVisible();

				// Show the associated ContentWidget
				displayContentWidget(pageMap.get(item));
			}
		};
		History.addValueChangeHandler(historyHandler);

		// Add a handler that sets the content widget when a menu item is  selected
		app.addSelectionHandler(new SelectionHandler<TreeItem>() {
			public void onSelection(SelectionEvent<TreeItem> event) {
				TreeItem item = event.getSelectedItem();
				AbstractPage content = pageMap.get(item);
				if (content != null && !content.equals(app.getContent())) {
					History.newItem(getContentWidgetToken(content));
				}
			}
		});

		if (History.getToken().length() > 0) {
			History.fireCurrentHistoryState();
		} else {
			// Use the first token available
			TreeItem firstItem = app.getSidebarMenu().getItem(0).getChild(0);
			app.getSidebarMenu().setSelectedItem(firstItem, false);
			app.getSidebarMenu().ensureSelectedItemVisible();
			displayContentWidget(pageMap.get(firstItem));
		}
	}


	private void displayContentWidget(AbstractPage content) {
		if (content != null) {
			app.setContentArea(content);
			app.setContentTitle(content.getTabBar());
		}
	}

	private String getContentWidgetToken(AbstractPage content) {
		String className = content.getClass().getName();
		className = className.substring(className.lastIndexOf('.') + 1);
		return className;
	}

	private String getCurrentReferenceStyleName(String prefix) {
		String gwtRef = prefix + "-Reference-" + CUR_THEME;
		if (LocaleInfo.getCurrentLocale().isRTL()) {
			gwtRef += "-rtl";
		}
		return gwtRef;
	}

	private void createTopLinks() {
		app.addTopLink(new Anchor("Help"));
		app.addTopLink(new Anchor("Privacy"));
		app.addTopLink(new Anchor("Settings"));
		app.addTopLink(new Anchor("Sign out"));
	}

	private void setupSidebarMenu() {
		Tree sidebarMenu = app.getSidebarMenu();
		
		TreeItem menuDemo = createMenuRootItem(sidebarMenu, AppConstants.INST.menuDemo());
		addMenuItem(menuDemo, new QuizPage());
		
	}
	
	private TreeItem createMenuRootItem(Tree root, String title){
		return createMenuRootItem(root, title, null);
	}
	
	private TreeItem createMenuRootItem(Tree root, String title, ImageResource icon){
		if (icon!=null){
			return root.addItem(AbstractImagePrototype.create(icon).getHTML() + " " + title);
		}
		else
			return root.addItem(title);
	}

	private void addMenuItem(TreeItem parent, AbstractPage page) {
		TreeItem option = parent.addItem(page.getMenuTitle());

		// Map the item to its history token and content widget
		pageMap.put(option, page);
		historyTokenMap.put(getContentWidgetToken(page), option);
	}

	/**
	 * Create the options that appear next to the title.
	 */
	private void setupOptionsPanel() {
		VerticalPanel vPanel = new VerticalPanel();
		vPanel.setHorizontalAlignment(HasHorizontalAlignment.ALIGN_RIGHT);
		if (LocaleInfo.getCurrentLocale().isRTL()) {
			vPanel.getElement().setAttribute("align", "left");
		} else {
			vPanel.getElement().setAttribute("align", "right");
		}
		app.setOptionsWidget(vPanel);

		// Add the option to change the locale
		final HorizontalPanel localeBox = new HorizontalPanel();
		
		String currentLocale = LocaleInfo.getCurrentLocale().getLocaleName();
		if (currentLocale.equals("default")) {
			currentLocale = "en";
		}
		String[] localeNames = LocaleInfo.getAvailableLocaleNames();
		for (String localeName : localeNames) {
			if (!localeName.equals("default")) {
				String nativeName = LocaleInfo.getLocaleNativeDisplayName(localeName);
				CountryFlagButton bt = new CountryFlagButton(nativeName, localeName);
				bt.addClickHandler(new ClickHandler() {
					
					@Override
					public void onClick(ClickEvent event) {
						String localeName = ((CountryFlagButton)event.getSource()).getLocaleName();
						UrlBuilder builder = Location.createUrlBuilder().setParameter("locale", localeName);
						Window.Location.replace(builder.buildString());
					}
				});
				
				localeBox.add(bt);
				if (localeName.equals(currentLocale)) {
					bt.setEnabled(false);
				}
				else
					bt.setEnabled(true);
			}
		}
		HorizontalPanel localeWrapper = new HorizontalPanel();
		localeWrapper.add(localeBox);
		vPanel.add(localeWrapper);

		// Add the option to change the style
		final HorizontalPanel styleWrapper = new HorizontalPanel();
		vPanel.add(styleWrapper);
		for (int i = 0; i < AppConstants.STYLE_THEMES.length; i++) {
			final ThemeButton button = new ThemeButton(AppConstants.STYLE_THEMES[i]);
			styleWrapper.add(button);
			button.addClickHandler(new ClickHandler() {
				public void onClick(ClickEvent event) {
					// Update the current theme
					CUR_THEME = button.getTheme();

					// Reload the current tab, loading the new theme if necessary
					TabBar bar = ((TabBar) app.getContentTitle());
					bar.selectTab(bar.getSelectedTab());

					// Load the new style sheets
					updateStyleSheets();
				}
			});
		}
	}

	private void createApplicationTitle() {
		String appTitle = "<h1>" + AppConstants.INST.mainTitle() + "</h1><h2>" + AppConstants.INST.mainSubTitle() + "</h2>";

		HorizontalPanel titlePanel = new HorizontalPanel();
		titlePanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		titlePanel.add(new Image(Images.INST.logo()));
		titlePanel.add(new HTML(appTitle));
		app.setTitleWidget(titlePanel);
	}

	/**
	 * Update the style sheets to reflect the current theme and direction.
	 */
	private void updateStyleSheets() {
		// Generate the names of the style sheets to include
		String gwtStyleSheet = "gwt/" + CUR_THEME + "/" + CUR_THEME + ".css";
		String appCss = CUR_THEME + "/app.css";
		String incubatorCss = CUR_THEME + "/incubator.css";
		String gwtUpload = CUR_THEME + "/gwtupload.css";
		
		String advancedGWT = "advanced/themes/"+CUR_THEME + "/theme.css";
		
		if (LocaleInfo.getCurrentLocale().isRTL()) {
			gwtStyleSheet = gwtStyleSheet.replace(".css", "_rtl.css");
			appCss = appCss.replace(".css", "_rtl.css");
		}

		// Find existing style sheets that need to be removed
		boolean styleSheetsFound = false;
		final HeadElement headElem = StyleSheetLoader.getHeadElement();
		final List<Element> toRemove = new ArrayList<Element>();
		NodeList<Node> children = headElem.getChildNodes();
		for (int i = 0; i < children.getLength(); i++) {
			Node node = children.getItem(i);
			if (node.getNodeType() == Node.ELEMENT_NODE) {
				Element elem = Element.as(node);
				if (elem.getTagName().equalsIgnoreCase("link") && elem.getPropertyString("rel").equalsIgnoreCase("stylesheet")) {
					styleSheetsFound = true;
					String href = elem.getPropertyString("href");
					// If the correct style sheets are already loaded, then we
					// should have
					// nothing to remove.
					if (!href.contains(gwtStyleSheet) && !href.contains(appCss)) {
						toRemove.add(elem);
					}
				}
			}
		}

		// Return if we already have the correct style sheets
		if (styleSheetsFound && toRemove.size() == 0) {
			return;
		}

		// Detach the app while we manipulate the styles to avoid rendering
		// issues
		RootPanel.get().remove(app);

		// Remove the old style sheets
		for (Element elem : toRemove) {
			headElem.removeChild(elem);
		}

		// Load the GWT theme style sheet
		String modulePath = GWT.getModuleBaseURL();
		Command callback = new Command() {
			/**
			 * The number of style sheets that have been loaded and executed
			 * this command.
			 */
			private int numStyleSheetsLoaded = 0;

			public void execute() {
				// Wait until all style sheets have loaded before re-attaching
				// the app
				numStyleSheetsLoaded++;
				if (numStyleSheetsLoaded < 2) {
					return;
				}

				// Different themes use different background colors for the body
				// element, but IE only changes the background of the visible
				// content
				// on the page instead of changing the background color of the
				// entire
				// page. By changing the display style on the body element, we
				// force
				// IE to redraw the background correctly.
				RootPanel.getBodyElement().getStyle().setProperty("display", "none");
				RootPanel.getBodyElement().getStyle().setProperty("display", "");
				RootPanel.get().add(app);
			}
		};
		StyleSheetLoader.loadStyleSheet(modulePath + gwtStyleSheet, getCurrentReferenceStyleName("gwt"), callback);

		// Load the showcase specific style sheet after the GWT theme style
		// sheet so
		// that custom styles supercede the theme styles.
		StyleSheetLoader.loadStyleSheet(modulePath + appCss, getCurrentReferenceStyleName("Application"), callback);
		
		StyleSheetLoader.loadStyleSheet(modulePath + incubatorCss, getCurrentReferenceStyleName("Incubator"), callback);
		
		StyleSheetLoader.loadStyleSheet(modulePath + gwtUpload, getCurrentReferenceStyleName("gwtUpload"), callback);
		
		StyleSheetLoader.loadStyleSheet(modulePath + advancedGWT, getCurrentReferenceStyleName("advanced"), callback);
		
		
	}
}
