package com.ten01.jsmapper.js.common;

import java.lang.reflect.Method;

import org.apache.commons.lang3.StringUtils;

import com.ten01.jsmapper.js.BaseJs;

public abstract class JsKeyWordUtils {
	
	public static boolean isAJsKeyWord(String keyword){
		if(StringUtils.isBlank(keyword))
			return false;
		for (Method method : BaseJs.class.getMethods()) {
		     if (method.getName().equals(keyword)) {
		         return true;
		     }
		}
		return false;
	}

	private static JSKeyWordsEnum getJsEnum(String keyword) {
		try{
			return JSKeyWordsEnum.valueOf(keyword.toUpperCase());
		}catch (Exception e){
			return null;
		}
	}

	public static String getJsKeyWord(String keyword) {
		if(isAJsKeyWord(keyword))
			return getJsEnum(keyword).getValue();
		else
			return "Invalid Keyword";
	}

}
