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

import de.anhquan.config4j.annotation.ConfigContainer;
import de.anhquan.config4j.annotation.ConfigParam;

@ConfigContainer(Location="window.properties", Prefix="sample.")
public interface WindowConfig extends Config {

	@ConfigParam(PropertyName = "window.title")
	public String getWindowTitle();
	public void setWindowTitle(String title);
	
	@ConfigParam(PropertyName = "window.width")
	public int getWindowWidth();
	
	@ConfigParam(PropertyName = "window.height", DefaultInteger=12345)
	public int getWindowHeight();
	
}
