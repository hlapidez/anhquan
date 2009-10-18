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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.videolan.jvlc.JVLC;
import org.videolan.jvlc.MediaDescriptor;
import org.videolan.jvlc.MediaPlayer;
import org.videolan.jvlc.event.MediaPlayerListener;

import de.anhquan.vtv.media.Player;
import de.anhquan.vtv.media.PlayerListener;
import de.anhquan.vtv.media.PlayerState;
import de.anhquan.vtv.media.control.AudioControl;
import de.anhquan.vtv.media.control.VideoControl;

public class TVPlayer implements MediaPlayerListener, Player {

	PlayerState playerState;
	MediaDescriptor mediaDescriptor;

	private Logger log = LoggerFactory.getLogger(TVPlayer.class);

	JVLC jvlc;
	MediaPlayer mediaPlayer;
	TVVideoControl videoControl = null;
	TVAudioControl audioControl = null;

	public TVPlayer() {
		String[] vlcArgs = new String[] { "-vvv", "--plugin-path=vlc_exec\\plugins" };
		jvlc = new JVLC(vlcArgs);
		videoControl = new TVVideoControl(jvlc, this);
		audioControl = new TVAudioControl(jvlc, this);
		playerState = PlayerState.INIT;
	}

	MediaPlayer getMediaPlayer() {
		return mediaPlayer;
	}

	public void play() {
		if ((playerState == PlayerState.READY) || (playerState == PlayerState.PAUSED)) {
			mediaPlayer.play();
			playerState = PlayerState.PLAYING;
			videoControl.setDisplayMode(VideoControl.NORMAL_MODE);
			audioControl.setMute(false);			
		}
	}

	@Override
	public void pause() {
		if ((playerState == PlayerState.READY) || (playerState == PlayerState.PLAYING)) {
			mediaPlayer.pause();
			playerState = PlayerState.PAUSED;
		}
	}

	public void rewind() {
		// TODO Auto-generated method stub
	}

	public void fastforward() {
		// TODO Auto-generated method stub
	}

	public void stop() {
		if ((playerState == PlayerState.PAUSED) || (playerState == PlayerState.PLAYING)) {
			mediaPlayer.stop();
			playerState = PlayerState.READY;
		}
	}

	public void openMedia(String url) {
		mediaDescriptor = new MediaDescriptor(jvlc, url);
		mediaPlayer = mediaDescriptor.getMediaPlayer();
		mediaPlayer.addListener(this);

		playerState = PlayerState.READY;
	}

	public void reset() {
		stop();
		playerState = PlayerState.READY;
	}

	public void endReached(MediaPlayer mediaPlayer) {
		// TODO Auto-generated method stub

	}

	public void errorOccurred(MediaPlayer mediaPlayer) {
		// TODO Auto-generated method stub

	}

	public void paused(MediaPlayer mediaPlayer) {
		// TODO Auto-generated method stub

	}

	public void playing(MediaPlayer mediaPlayer) {
		// TODO Auto-generated method stub

	}

	public void positionChanged(MediaPlayer mediaPlayer) {
		// TODO Auto-generated method stub

	}

	public void stopped(MediaPlayer mediaPlayer) {
		// TODO Auto-generated method stub

	}

	public void timeChanged(MediaPlayer mediaPlayer, long newTime) {
		// TODO Auto-generated method stub

	}

	public void addPlayerListener(PlayerListener listener) {
		// TODO Auto-generated method stub

	}

	public void removePlayerListener(PlayerListener listener) {
		// TODO Auto-generated method stub

	}

	public void setVideoOutput(long handle) {
		jvlc.setVideoOutput(handle);
	}

	public PlayerState getState() {
		return playerState;
	}

	public AudioControl getAudioControl() {
		return audioControl;
	}

	public VideoControl getVideoControl() {
		return videoControl;
	}
}
