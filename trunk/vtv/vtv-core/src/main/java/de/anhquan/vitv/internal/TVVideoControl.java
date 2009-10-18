package de.anhquan.vitv.internal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.videolan.jvlc.JVLC;
import org.videolan.jvlc.Video;

import de.anhquan.vitv.media.control.VideoControl;

public class TVVideoControl implements VideoControl {

	private Logger log = LoggerFactory.getLogger(TVVideoControl.class);

	Video video;
	TVPlayer player;
	int displayMode;

	public TVVideoControl(JVLC jvlc, TVPlayer player) {
		video = new Video(jvlc);
		this.player = player;
		displayMode = NORMAL_MODE;
	}

	public int getDisplayHeight() {
		return video.getHeight(player.getMediaPlayer());
	}

	public int getDisplayMode() {
		return displayMode;
	}

	public int getDisplayWidth() {
		return video.getWidth(player.getMediaPlayer());
	}

	public int getDisplayX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getDisplayY() {
		// TODO Auto-generated method stub

		return 0;
	}

	public void setDisplayPosition(int x, int y) {
	}

	public void setDisplaySize(int width, int height) {

		log.debug("width = " + width + " - height = " + height);
		video.resize(player.getMediaPlayer(), width, height);
	}

	public void setDisplayMode(int mode) {
		displayMode = mode;
		switch (displayMode) {
		case FULLSCREEN_MODE:
			video.setFullscreen(player.getMediaPlayer(), true);

			break;
		case NORMAL_MODE:
			video.setFullscreen(player.getMediaPlayer(), false);
			video.setSize(300, 300);
			break;
		}
	}

	public void setViewPort(int vtop, int vleft, int vbottom, int vright, int ctop, int cleft, int cbottom, int cright) {
		video.setViewPort(vtop, vleft, vbottom, vright, ctop, cleft, cbottom, cright);
	}

}
