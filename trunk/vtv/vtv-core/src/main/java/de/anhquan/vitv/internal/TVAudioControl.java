package de.anhquan.vitv.internal;

import org.videolan.jvlc.Audio;
import org.videolan.jvlc.JVLC;

import de.anhquan.vitv.media.control.AudioControl;

public class TVAudioControl implements AudioControl {

	Audio audio;
	 
	public TVAudioControl(JVLC jvlc, TVPlayer tvPlayer){
		 audio = new Audio(jvlc);
	}

	public int getVolume() {
		return audio.getVolume();
	}

	public boolean getMute() {
		return audio.getMute();
	}

	public void setVolume(int volume) {
		audio.setVolume(volume);
	}

	public void setMute(boolean mute) {
		audio.setMute(mute);
	}

}
