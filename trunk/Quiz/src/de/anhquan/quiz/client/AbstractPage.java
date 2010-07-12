package de.anhquan.quiz.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
import com.google.gwt.event.logical.shared.SelectionEvent;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.logical.shared.ValueChangeEvent;
import com.google.gwt.event.logical.shared.ValueChangeHandler;
import com.google.gwt.resources.client.ImageResource;
import com.google.gwt.user.client.History;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.AbstractImagePrototype;
import com.google.gwt.user.client.ui.DeckPanel;
import com.google.gwt.user.client.ui.LazyPanel;
import com.google.gwt.user.client.ui.TabBar;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public abstract class AbstractPage extends LazyPanel implements SelectionHandler<Integer> {

	private static final String DEFAULT_STYLE_NAME = "sc-ContentWidget";

	protected TabBar tabBar = null;

	private DeckPanel deckPanel = null;
	
	private boolean moduleInitialized;

	private boolean moduleInitializing;

	private VerticalPanel contentPanel;
	
	private ImageResource menuIcon;
	
	private String description = "NO DESCRIPTION";
	
	private String name = "NO NAME";
	
	public AbstractPage() {
		this(null);
	}
	
	public AbstractPage(ImageResource menuIcon){
		setMenuIcon(menuIcon);
		tabBar = new TabBar();
	}

	private void addTab(Widget w, String tabText) {
		tabBar.addTab(tabText);
		deckPanel.add(w);
	}

	@Override
	public void ensureWidget() {
		super.ensureWidget();
		ensureWidgetInitialized(contentPanel);
	}

	public void setMenuIcon(ImageResource menuIcon){
		this.menuIcon = menuIcon;
	}
	
	public ImageResource getMenuIcon(){
		return this.menuIcon;
	}
	
	public void setDescription(String desc){
		this.description = desc;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getDescription(){
		return description;
	}

	public String getName(){
		return name;
	}

	public TabBar getTabBar() {
		return tabBar;
	}

	public abstract Widget onInitialize();

	public void onInitializeComplete() {
	}

	public void onSelection(SelectionEvent<Integer> event) {
		int tabIndex = event.getSelectedItem().intValue();
		deckPanel.showWidget(tabIndex);
	}

	protected void asyncOnInitialize(final AsyncCallback<Widget> callback){
		GWT.runAsync(new RunAsyncCallback() {

			public void onFailure(Throwable caught) {
				callback.onFailure(caught);
			}

			public void onSuccess() {
				callback.onSuccess(onInitialize());
			}
		});
	}

	@Override
	protected final Widget createWidget() {
		deckPanel = new DeckPanel();

		setStyleName(DEFAULT_STYLE_NAME);

		tabBar.addSelectionHandler(this);

		contentPanel = new VerticalPanel();
		addTab(contentPanel, getName());

		return deckPanel;
	}

	@Override
	protected void onLoad() {
		ensureWidget();

		if (getTabBar().getTabCount() > 0) {
			tabBar.selectTab(0);
		}
	}

	private void ensureWidgetInitialized(final VerticalPanel vPanel) {
		if (moduleInitializing || moduleInitialized) {
			return;
		}

		moduleInitializing = true;

		asyncOnInitialize(new AsyncCallback<Widget>() {
			public void onFailure(Throwable reason) {
				moduleInitializing = false;
				Window.alert("Failed to initilize this module (" + reason + ")");
			}

			public void onSuccess(Widget result) {
				moduleInitializing = false;
				moduleInitialized = true;

				Widget widget = result;
				if (widget != null) {
					vPanel.add(widget);
				}
				onInitializeComplete();
			}
		});
	}

	public String getMenuIconHTML() {
		if (menuIcon!=null)
			return AbstractImagePrototype.create(menuIcon).getHTML();
		else
			return "";
	}

	public String getMenuTitle() {
		return this.getMenuIconHTML() + " " + this.getName();
	}

	public String getHistoryToken() {
		String className = this.getClass().getName();
		className = className.substring(className.lastIndexOf('.') + 1);
		return className;
	}

	String[] params;
	public void setParameters(String[] params) {
		this.params = params;
	}
	
	public String[] getParameters(){
		return this.params;
	}

	public void preRender() {
		// TODO Auto-generated method stub
		
	}

	public void postRender() {
		// TODO Auto-generated method stub
		
	}
	
}
