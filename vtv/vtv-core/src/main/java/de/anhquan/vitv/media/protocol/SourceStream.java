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
package de.anhquan.vitv.media.protocol;

import de.anhquan.vitv.media.Controllable;

public interface SourceStream extends Controllable{

	enum SeekType{
		NOT_SEEKABLE, 	RANDOM_ACCESSIBLE , SEEKABLE_TO_START ;
	}
	
	ContentDescription getContentDescriptor();
	
	void seek(long where);
	long getCurrentPosition();
	SeekType getSeekType();
}
