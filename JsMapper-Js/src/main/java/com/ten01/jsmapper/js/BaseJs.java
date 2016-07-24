package com.ten01.jsmapper.js;

import com.ten01.jsmapper.js.dom.Document;
import com.ten01.jsmapper.js.dom.Window;

/**
 * @author chidveer chinthauntla
 */
public interface BaseJs {
	
	Window window = getWindow();	
	Document document = getDocument();
	
	static Window getWindow() {
		return null;
	}

	static Document getDocument(){
		return null;
	}

}
