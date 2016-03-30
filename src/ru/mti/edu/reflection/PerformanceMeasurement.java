package ru.mti.edu.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface PerformanceMeasurement {
	String name() default "PerformanceTuning";
	boolean measureItself();
	Class<?> calculatePerformance() default PerformanceHandler.class;
}
