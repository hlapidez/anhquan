/**
 * Copyright 2009 http://anhquan.de
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package de.anhquan.config4j;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConfigTest {

	@Test
	public void testConfig(){
		
		WindowConfig config = ConfigFactory.getConfig(WindowConfig.class);
		System.out.println("window.width = "+config.getWindowWidth());
		System.out.println("window.height = "+config.getWindowHeight());
		System.out.println("window.title = "+config.getWindowTitle());
		
		config.setWindowTitle("alter");
		System.out.println("window.title = "+config.getWindowTitle());
		
		WindowConfig config2 = ConfigFactory.getConfig(WindowConfig.class);
		
		System.out.println("window.title = "+config2.getWindowTitle());
		assertEquals(250, config.getWindowWidth());
		assertEquals(12345, config.getWindowHeight());
		assertEquals("alter", config.getWindowTitle());
		
		AppConfig appCfg = ConfigFactory.getConfig(AppConfig.class);
		System.out.println("bind port = "+appCfg.getBindPort());
	}
}
