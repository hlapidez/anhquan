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
package de.anhquan.vtv.media.control;

import de.anhquan.vtv.media.Control;

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
	
	boolean isFullScreen();
}
