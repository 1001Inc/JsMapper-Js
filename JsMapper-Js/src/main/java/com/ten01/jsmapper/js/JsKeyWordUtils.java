package com.ten01.jsmapper.js;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.commons.lang3.StringUtils;

import com.ten01.jsmapper.js.common.JSKeyWords;
import com.ten01.jsmapper.js.common.JSKeyWordsEnum;

public abstract class JsKeyWordUtils {
	
	private static Set<String> keywordsInBaseJs = new HashSet<>(Arrays.asList(new String[]{JSKeyWords.YIELD}));
	
	public static boolean isAJsKeyWord(String keyword){
		if(StringUtils.isBlank(keyword) || !keywordsInBaseJs.contains(keyword))
			return false;
		for (Method method : BaseJs.class.getMethods()) {
		     if (method.getName().equals(keyword) && method.isAnnotationPresent(JsKeyWord.class)) {
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
