/**
 * Copyright 2008 - 2019 The Loon Game Engine Authors
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
 * 
 * @project loon
 * @author cping
 * @email：javachenpeng@yahoo.com
 * @version 0.5
 */
package loon.utils.html;

import loon.canvas.LColor;

public class HtmlFont {

	protected String face;

	protected int size;

	protected LColor color;

	protected String text;

	protected HtmlFont(HtmlElement ele) {
		face = ele.getAttribute("face", "Dialog");
		size = ele.getIntAttribute("size", 20);
		String colorStr = ele.getAttribute("color", null);
		if (colorStr == null) {
			color = LColor.white;
		} else {
			color = LColor.decode(colorStr);
		}
		text = ele.getData();
	}

	public String getFace() {
		return face;
	}

	public int getSize() {
		return size;
	}
	public LColor getColor() {
		return color;
	}
	
	public String getText() {
		return text;
	}

}
