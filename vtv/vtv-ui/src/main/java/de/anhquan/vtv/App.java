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

import java.io.IOException;

import de.anhquan.vtv.internal.TVPlayer;
import de.anhquan.vtv.internal.TVPlayerDisplay;

public class App {

	public static void main(String[] args) throws IOException {
		TVPlayer player = new TVPlayer();
		TVPlayerDisplay tv = new TVPlayerDisplay(player);
		
		tv.displayAndWait();
	}

}
