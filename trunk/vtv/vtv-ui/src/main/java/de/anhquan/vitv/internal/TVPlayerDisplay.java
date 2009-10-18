/**
 * Copyright (C) 2009 Anh Quan Nguyen <nguyen.anhquan@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.anhquan.vitv.internal;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.events.ControlAdapter;
import org.eclipse.swt.events.ControlEvent;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.anhquan.vitv.media.Player;
import de.anhquan.vitv.media.PlayerEvent;
import de.anhquan.vitv.media.PlayerListener;
import de.anhquan.vitv.media.PlayerState;
import de.anhquan.vitv.media.control.VideoControl;

public class TVPlayerDisplay extends ControlAdapter implements MouseListener, PlayerListener, KeyListener {

	private Logger log = LoggerFactory.getLogger(TVPlayerDisplay.class);

	TVPlayer player;

	Shell shell;
	Clipboard clipboard;
	Display display;
	Composite videoPlane;

	String currentURL;

	// http://www.youtube.com/get_video?video_id=z3Iq6lazrMA&t=vjVQa1PpcFMvZUe7ue1QfcS_mQSiZNcJEC2SQt4EktE%3D&fmt=18
	public TVPlayerDisplay(TVPlayer player) {
		this.player = player;
		display = new Display();
		shell = new Shell(display, SWT.CLOSE | SWT.MIN | SWT.MAX | SWT.RESIZE | SWT.TITLE | SWT.ON_TOP);
		
		shell.setImage(new Image(display, "resources/icon.png"));
		shell.setSize(320, 240);
		shell.setText("ViTV - ver1.0");
		shell.setLocation(10, 10);
		shell.setLayout(new FillLayout());
		videoPlane = new Composite(shell, SWT.NORMAL);
		videoPlane.setBackground(display.getSystemColor(SWT.COLOR_BLACK));
		player.setVideoOutput(videoPlane.handle);

		clipboard = new Clipboard(display);
		
		videoPlane.addKeyListener(this);

		videoPlane.addMouseListener(this);

		shell.addControlListener(this);
		
	}

	public void displayAndWait() {

		playFromClipboard();

		shell.open();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch())
				display.sleep();
		}
		display.dispose();
	}

	public void controlResized(ControlEvent evt) {
		
		//Rectangle rect = shell.getClientArea();
		//videoPlane.setBounds(rect);
		//videoPlane.setSize(rect.width,rect.height);
		
		//VideoControl video = player.getVideoControl();
		//video.setViewPort(rect.y, rect.x, rect.height, rect.width, rect.y, rect.x, rect.height, rect.width);
	}

	public void mouseDoubleClick(MouseEvent evt) {
	}

	public void mouseDown(MouseEvent e) {
		
	}

	public void mouseUp(MouseEvent evt) {
		playOrPause();
	}

	public void playerUpdate(Player player, PlayerEvent event) {

	}

	public void keyPressed(KeyEvent evt) {

	}

	public void keyReleased(KeyEvent evt) {
		log.debug("keyReleased");
		log.debug("CODE. " + evt.keyCode);
		log.debug("char. " + evt.character);
		boolean ctrlPressed = (evt.stateMask & SWT.CTRL) != 0;

		// if (!altPressed)
		// return;

		switch (evt.keyCode) {
		case SWT.F5:
			playFromClipboard();
			break;

		case SWT.ESC:
			log.debug("Close window ");
			shell.close();
			break;

		}
	}

	void playFromClipboard() {
		log.debug("Check clipboard ");
		TextTransfer transfer = TextTransfer.getInstance();
		String data = (String) clipboard.getContents(transfer);

		if ((data!= null) && (data.matches("http://\\S+"))) {
			playFromURL(data);
		} else
			log.warn("Invalid URL in the clipboard : " + data);
	}

	public void playFromURL(String url) {
		if ((currentURL == null) || (currentURL.compareToIgnoreCase(url) != 0)) {
			currentURL = url;
			player.openMedia(url);
			player.play();
			player.getVideoControl().setDisplayMode(VideoControl.FULLSCREEN_MODE);
		} else
			log.warn("The new URL is the same the current playing URL. DO NOTHING");
	}

	void playOrPause() {
		log.debug("try to play or pause...");
		if (player.getState() == PlayerState.PLAYING)
			player.pause();
		else if (player.getState() == PlayerState.PAUSED)
			player.play();
	}

	public void showError(String msg) {
		MessageDialog.openError(shell, "Error!!!", msg);
	}
}
