package com.ten01.jsmapper.js;

import com.ten01.jsmapper.js.dom.Console;
import com.ten01.jsmapper.js.dom.Document;
import com.ten01.jsmapper.js.dom.Window;

/**
 * @author chidveer chinthauntla
 */
public interface BaseJs {
	
	Window window = getWindow();	
	Document document = getDocument();
	Console console = getConsole();
	
	static Window getWindow() {
		return null;
	}

	static Console getConsole(){
		return null;
	}

	static Document getDocument(){
		return null;
	}

}
