package com.ten01.jsmapper.js.dom;

public interface Console {
	
	default void log(Object... log){
		System.out.println(log);
	}
	

}
