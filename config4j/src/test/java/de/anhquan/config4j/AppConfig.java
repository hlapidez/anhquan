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

@ConfigContainer(Location="app.properties", Prefix="app.")
public interface AppConfig extends Config{
	
	@ConfigParam(PropertyName="bind.port", DefaultInteger=8089)
	public int getBindPort();
	
	@ConfigParam(PropertyName="database.host", DefaultString="localhost")
	public String getDatabaseHost();
	
	@ConfigParam(PropertyName="databse.port", DefaultInteger=5555)
	public int getDatabasePort();
	
}
