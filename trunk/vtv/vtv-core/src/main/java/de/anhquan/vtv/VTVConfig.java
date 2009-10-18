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
package de.anhquan.vtv;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VTVConfig {

	final public static VTVConfig INSTANCE = new VTVConfig();

	private static final Logger log = LoggerFactory.getLogger(VTVConfig.class);

	private Configuration config;

	private VTVConfig() {
		loadConfig("vtv.properties");
	}

	public void loadConfig(String filePath) {
		try {
			config = new PropertiesConfiguration(filePath);
		} catch (ConfigurationException e) {
			config = null;
			log.error("ConfigurationException : "+e.getMessage());
		}
	}

	public String getVLCLibraryPath() {
		return config.getString("vlc_library");
	}

	public String getVLCPluginPath() {
		return config.getString("vlc_plugins_dir");
	}
	
	public boolean isAutoMonitorClipboard(){
		return config.getBoolean("auto_monitor_clipboard");
	}

	public String getLuaScriptPath() {
		return config.getString("vlc_lua_dir");
	}
}
