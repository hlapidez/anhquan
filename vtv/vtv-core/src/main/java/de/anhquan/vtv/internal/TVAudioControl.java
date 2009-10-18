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
package de.anhquan.vtv.internal;

import org.videolan.jvlc.Audio;
import org.videolan.jvlc.JVLC;

import de.anhquan.vtv.media.control.AudioControl;

public class TVAudioControl implements AudioControl {

	Audio audio;
	private static final int VOL_STEP = 10;
	private static final int DEFAULT_VOL = 50;
	 
	public TVAudioControl(JVLC jvlc, TVPlayer tvPlayer){
		 audio = new Audio(jvlc);
		 audio.setMute(false);
		 audio.setVolume(DEFAULT_VOL);
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

	@Override
	public void toggleMute() {
		audio.setMute(!audio.getMute());
	}

	@Override
	public void volumeDown() {
		int next = getVolume() - VOL_STEP;
		
		if (next <= 0){
			next = 0;
			
		}
		setVolume(next);
	}

	@Override
	public void volumeUp() {
		int next = getVolume() + VOL_STEP;
		
		if (next >= 100){
			next = 100;
			
		}
		setVolume(next);
	}

}
