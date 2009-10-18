package de.anhquan.vitv.media.control;

import de.anhquan.vitv.media.Control;

public interface VideoControl extends Control {

	static final int FULLSCREEN_MODE = 1;
	static final int NORMAL_MODE = 2;

	int getDisplayHeight();

	int getDisplayWidth();

	int getDisplayX();

	int getDisplayY();

	void setDisplaySize(int width, int height);

	void setDisplayPosition(int x, int y);

	void setDisplayMode(int mode);

	int getDisplayMode();

	public void setViewPort(int vtop, int vleft, int vbottom, int vright, int ctop, int cleft, int cbottom, int cright);
}
