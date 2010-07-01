package de.anhquan.quiz.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.logical.shared.HasSelectionHandlers;
import com.google.gwt.event.logical.shared.ResizeEvent;
import com.google.gwt.event.logical.shared.ResizeHandler;
import com.google.gwt.event.logical.shared.SelectionHandler;
import com.google.gwt.event.shared.HandlerRegistration;
import com.google.gwt.i18n.client.LocaleInfo;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DecoratorPanel;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Grid;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.Tree;
import com.google.gwt.user.client.ui.TreeItem;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.HTMLTable.CellFormatter;

public class Application extends Composite implements ResizeHandler, HasSelectionHandlers<TreeItem> {

	public static final String DEFAULT_STYLE_NAME = "Application";

	private HorizontalPanel bottomPanel;

	private DecoratorPanel contentDecorator;

	private Grid contentLayout;

	private SimplePanel contentWrapper;

	private HorizontalPanel topLinks;

	private Tree sidebarMenu;

	private int windowWidth = -1;

	private FlexTable topPanel;

	public Application() {
		// Setup the main layout widget
		FlowPanel layout = new FlowPanel();
		initWidget(layout);

		// Setup the top panel with the title and links
		createTopPanel();
		layout.add(topPanel);

		// Add the main menu
		bottomPanel = new HorizontalPanel();
		bottomPanel.setWidth("100%");
		bottomPanel.setSpacing(0);
		bottomPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_TOP);
		layout.add(bottomPanel);
		createSidebarMenu();
		bottomPanel.add(sidebarMenu);

		// Setup the content layout
		contentLayout = new Grid(2, 1);
		contentLayout.setCellPadding(0);
		contentLayout.setCellSpacing(0);
		contentDecorator = new DecoratorPanel();
		contentDecorator.setWidget(contentLayout);
		contentDecorator.addStyleName(DEFAULT_STYLE_NAME + "-content-decorator");
		bottomPanel.add(contentDecorator);
		if (LocaleInfo.getCurrentLocale().isRTL()) {
			bottomPanel.setCellHorizontalAlignment(contentDecorator, HasHorizontalAlignment.ALIGN_LEFT);
			contentDecorator.getElement().setAttribute("align", "LEFT");
		} else {
			bottomPanel.setCellHorizontalAlignment(contentDecorator, HasHorizontalAlignment.ALIGN_RIGHT);
			contentDecorator.getElement().setAttribute("align", "RIGHT");
		}
		CellFormatter formatter = contentLayout.getCellFormatter();

		// Add the content title
		setContentTitle(new HTML("Content"));
		formatter.setStyleName(0, 0, DEFAULT_STYLE_NAME + "-content-title");

		// Add the content wrapper
		contentWrapper = new SimplePanel();
		contentLayout.setWidget(1, 0, contentWrapper);
		formatter.setStyleName(1, 0, DEFAULT_STYLE_NAME + "-content-wrapper");
		setContentArea(null);

		// Add a window resize handler
		Window.addResizeHandler(this);
	}

	public void addTopLink(Widget link) {
		if (topLinks.getWidgetCount() > 0) {
			topLinks.add(new HTML("&nbsp;|&nbsp;"));
		}
		topLinks.add(link);
	}

	public HandlerRegistration addSelectionHandler(SelectionHandler<TreeItem> handler) {
		return sidebarMenu.addSelectionHandler(handler);
	}

	public Widget getContent() {
		return contentWrapper.getWidget();
	}

	public Widget getContentTitle() {
		return contentLayout.getWidget(0, 0);
	}

	public Tree getSidebarMenu() {
		return sidebarMenu;
	}

	public Widget getTitleWidget() {
		return topPanel.getWidget(0, 0);
	}

	public void onResize(ResizeEvent event) {
		onWindowResized(event.getWidth(), event.getHeight());
	}

	public void onWindowResized(int width, int height) {
		if (width == windowWidth || width < 1) {
			return;
		}
		windowWidth = width;
		onWindowResizedImpl(width);
	}

	public void setContentArea(Widget content) {
		if (content == null) {
			contentWrapper.setWidget(new HTML("&nbsp;"));
		} else {
			contentWrapper.setWidget(content);
		}
	}

	public void setContentTitle(Widget title) {
		contentLayout.setWidget(0, 0, title);
	}

	public void setOptionsWidget(Widget options) {
		topPanel.setWidget(1, 1, options);
	}

	public void setTitleWidget(Widget title) {
		topPanel.setWidget(1, 0, title);
	}

	@Override
	protected void onLoad() {
		super.onLoad();
		onWindowResized(Window.getClientWidth(), Window.getClientHeight());
	}

	@Override
	protected void onUnload() {
		super.onUnload();
		windowWidth = -1;
	}

	protected void onWindowResizedImpl(int width) {
		int menuWidth = sidebarMenu.getOffsetWidth();
		int contentWidth = Math.max(width - menuWidth - 30, 1);
		int contentWidthInner = Math.max(contentWidth - 10, 1);
		bottomPanel.setCellWidth(sidebarMenu, menuWidth + "px");
		bottomPanel.setCellWidth(contentDecorator, contentWidth + "px");
		contentLayout.getCellFormatter().setWidth(0, 0, contentWidthInner + "px");
		contentLayout.getCellFormatter().setWidth(1, 0, contentWidthInner + "px");
	}

	private void createSidebarMenu() {
		Tree.Resources treeImages = GWT.create(Tree.Resources.class);
		sidebarMenu = new Tree(treeImages);
		sidebarMenu.setAnimationEnabled(true);
		sidebarMenu.addStyleName(DEFAULT_STYLE_NAME + "-menu");
	}

	private void createTopPanel() {
		boolean isRTL = LocaleInfo.getCurrentLocale().isRTL();
		topPanel = new FlexTable();
		topPanel.setCellPadding(0);
		topPanel.setCellSpacing(0);
		topPanel.setStyleName(DEFAULT_STYLE_NAME + "-top");
		FlexCellFormatter formatter = topPanel.getFlexCellFormatter();

		topLinks = new HorizontalPanel();
		topPanel.setWidget(0, 0, topLinks);
		formatter.setStyleName(0, 0, DEFAULT_STYLE_NAME + "-links");
		if (isRTL) {
			formatter.setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_LEFT);
		} else {
			formatter.setHorizontalAlignment(0, 0, HasHorizontalAlignment.ALIGN_RIGHT);
		}
		formatter.setColSpan(0, 0, 2);

		setTitleWidget(null);
		formatter.setStyleName(1, 0, DEFAULT_STYLE_NAME + "-title");

		setOptionsWidget(null);
		formatter.setStyleName(1, 1, DEFAULT_STYLE_NAME + "-options");
		if (isRTL) {
			formatter.setHorizontalAlignment(1, 1, HasHorizontalAlignment.ALIGN_LEFT);
		} else {
			formatter.setHorizontalAlignment(1, 1, HasHorizontalAlignment.ALIGN_RIGHT);
		}

		// Align the content to the top
		topPanel.getRowFormatter().setVerticalAlign(0, HasVerticalAlignment.ALIGN_TOP);
		topPanel.getRowFormatter().setVerticalAlign(1, HasVerticalAlignment.ALIGN_TOP);
	}
}
