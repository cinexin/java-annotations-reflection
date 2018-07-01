package org.learning.cinexin.annotations.core;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface TesterInfo {
	public enum Priority {
		   LOW, MEDIUM, HIGH
		}

	Priority priority() default Priority.MEDIUM;
		
	String[] tags() default "";
		
	String createdBy() default "Mkyong";
		
	String lastModified() default "03/01/2014";
}
