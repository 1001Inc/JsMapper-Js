package com.ten01.jsmapper.js.keywords;

import com.ten01.jsmapper.js.common.JSKeyWords;

/**
 * @author chidveer chinthauntla
 * Use for marking a function as a keyword
 */
public interface Yield extends KeyWord{
	
	default String mapTo(){ return JSKeyWords.YIELD; }
	
}

