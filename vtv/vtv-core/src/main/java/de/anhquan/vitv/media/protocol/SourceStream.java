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
