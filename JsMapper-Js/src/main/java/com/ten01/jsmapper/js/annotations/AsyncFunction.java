package com.ten01.jsmapper.js.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.ten01.jsmapper.js.common.JSKeyWords;

/**
 * @author chidveer chinthauntla
 * Use for marking a function as a generator function
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface AsyncFunction {
	String mapTo() default JSKeyWords.ASYNC;
	
}
