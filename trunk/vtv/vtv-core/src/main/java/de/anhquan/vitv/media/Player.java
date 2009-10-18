package de.anhquan.vitv.media;

import de.anhquan.vitv.media.control.AudioControl;
import de.anhquan.vitv.media.control.VideoControl;

public interface Player extends Controllable {
	
	void addPlayerListener(PlayerListener listener);
	void removePlayerListener(PlayerListener listener);
	
	void play();
	void pause();
	void stop();
	void fastforward();
	void rewind();
	
	void openMedia(String url);
	void reset();
	
	void setVideoOutput(long handle);
	PlayerState getState();
	
	AudioControl getAudioControl();
	VideoControl getVideoControl();
}
