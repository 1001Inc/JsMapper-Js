package com.ten01.jsmapper.js;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import com.ten01.jsmapper.js.keywords.KeyWord;

/**
 * @author chidveer chinthauntla
 * Marks a method as java script keyword.
 */
@Target(ElementType.METHOD)
@interface JsKeyWord {
	
	Class<? extends KeyWord> value(); 

}
