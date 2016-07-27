package com.ten01.jsmapper.js.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.ten01.jsmapper.js.common.JSKeyWords;

/**
 * @author chidveer chinthauntla
 * Marks a method as generator fucntion
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface GeneratorFunction {
	
	String mapTo() default JSKeyWords.GENERATOR;

}

