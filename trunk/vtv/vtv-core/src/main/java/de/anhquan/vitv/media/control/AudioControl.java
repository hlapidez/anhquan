package de.anhquan.vitv.media.control;

import de.anhquan.vitv.media.Control;

public interface AudioControl extends Control {

	boolean getMute();
	void setMute(boolean mute);
	
	void setVolume(int volumne);
	int getVolume();
}
