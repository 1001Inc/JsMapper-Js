package com.ten01.jsmapper.js.dom;

/**
 * @author chidveer chinthauntla
 */
public interface Window {
	
	History history = getHistory();
	Document document = getDocument();
	Location location = getLocation();
	
	static History getHistory() {
		return null;
	}

	static Document getDocument() {
		return null;
	}

	static Location getLocation() {
		return null;
	}

}
