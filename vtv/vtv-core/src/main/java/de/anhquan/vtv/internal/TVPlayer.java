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

import de.anhquan.vtv.VTVConfig;
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
		
		String[] vlcArgs = new String[] { "-vvv", "--plugin-path="+VTVConfig.INSTANCE.getVLCPluginPath()}; 
		
		log.info("VLC Options");
		for (String arg : vlcArgs) {
			log.info(arg);
		}		
		
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
		}
	}

	@Override
	public void pause() {
		if ((playerState == PlayerState.READY) || (playerState == PlayerState.PLAYING)) {
			mediaPlayer.pause();
			
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
	}

	public void endReached(MediaPlayer mediaPlayer) {
		log.info("endReached ... ");
		playerState = PlayerState.READY;
	}

	public void errorOccurred(MediaPlayer mediaPlayer) {
		log.info("errorOccurred ... ");

	}

	public void paused(MediaPlayer mediaPlayer) {
		log.info("paused ... ");
		playerState = PlayerState.PAUSED;

	}

	public void playing(MediaPlayer mediaPlayer) {
		playerState = PlayerState.PLAYING;
		log.info("playing ... ");
	}

	public void positionChanged(MediaPlayer mediaPlayer) {
		log.info("positionChanged ... ");
	}

	public void stopped(MediaPlayer mediaPlayer) {
		playerState = PlayerState.READY;
		log.info("stopped ... ");
	}

	public void timeChanged(MediaPlayer mediaPlayer, long newTime) {
		//log.info("timeChanged ... ");
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
