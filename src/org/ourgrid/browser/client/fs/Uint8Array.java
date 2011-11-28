/* 
 * Copyright 2009-2010 Sönke Sothmann, Steffen Schäfer and others
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ourgrid.browser.client.fs;

import com.google.gwt.core.client.JavaScriptObject;


public class Uint8Array extends JavaScriptObject {

	/**
	 * protected standard constructor as specified by {@link JavaScriptObject}.
	 */
	protected Uint8Array() {
		super();
	}

	public final native int get(int index) /*-{
		return this[index];
	}-*/;

	public final native int getLength() /*-{
		return this.length;
	}-*/;

	public final byte[] getByteArray() {
		byte[] byteAr = new byte[getLength()];
		for (int i = 0; i < byteAr.length; i++) {
			byteAr[i] = Integer.valueOf(get(i)).byteValue();
		}
		return byteAr;
	}
}
