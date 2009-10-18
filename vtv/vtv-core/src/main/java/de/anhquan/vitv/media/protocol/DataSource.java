package de.anhquan.vitv.media.protocol;

public abstract class DataSource {

	abstract void connect();
	abstract void disconnect();
	abstract String getLocator();
	abstract SourceStream[] getStreams();
	abstract void start();
	abstract void stop();
}
