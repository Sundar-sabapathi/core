/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wicketstuff.jquery.ui.resource;

import org.apache.wicket.resource.JQueryPluginResourceReference;

/**
 * Provides the resource reference for the jQuery UI javascript library.
 *
 * @author Sebastien Briquet - sebfz1
 *
 */
public class JQueryUIResourceReference extends JQueryPluginResourceReference
{
	private static final long serialVersionUID = 1L;

	private static final JQueryUIResourceReference INSTANCE = new JQueryUIResourceReference();

	/**
	 * Gets the instance of the resource reference
	 *
	 * @return the single instance of the resource reference
	 */
	public static JQueryUIResourceReference get()
	{
		return INSTANCE;
	}

	/**
	 * Private constructor
	 */
	private JQueryUIResourceReference()
	{
		super(JQueryUIResourceReference.class, "jquery-ui.js"); // v1.11.1
	}
}
