/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.anhquan.quiz.client.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundleWithLookup;
import com.google.gwt.resources.client.ImageResource;

/**
 * The images used throughout the Showcase.
 */
public interface Images extends ClientBundleWithLookup {

	public static final Images INST = (Images) GWT.create(Images.class);

	ImageResource grid();
		
	@Source("logo64.png")
	ImageResource logo();

	@Source("logo16.png")
	ImageResource logoThumb();

	ImageResource locale();
	
	ImageResource de_DE();
	
	ImageResource en_US();

}