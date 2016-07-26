package com.ten01.jsmapper.js.common;

public enum JavaToJsKeywords {
	
	YIELD(JSKeyWords.YIELD);
	
	private String value;
	
	JavaToJsKeywords(String value){
		this.value = value;				
	}
	
	public String getValue() {
		return value;
	}
}
