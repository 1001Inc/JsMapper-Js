package com.ten01.jsmapper.js.annotations;

/**
 * @author chidveer chinthauntla
 */
public interface AnnotationMethodUtils {
	String ANNOTATION_MAP_TO = "mapTo";
	
	static boolean isAnnotatedWith(String annotationName, Class<?> annotation) {
		return annotationName.equalsIgnoreCase(annotation.getSimpleName());
	}
	
	static String getAnnotationDefaultValue(Class<?> annotationClass) {
		try {
			return (String)(annotationClass.getMethod(ANNOTATION_MAP_TO).getDefaultValue());
		}catch (Exception e) {
			// TODO Auto-generated catch block
			throw new RuntimeException(e);
		}
	}
	
}
