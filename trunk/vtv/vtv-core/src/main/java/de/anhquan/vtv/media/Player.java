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
package de.anhquan.vtv.media;

import de.anhquan.vtv.media.control.AudioControl;
import de.anhquan.vtv.media.control.VideoControl;

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
