package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * same as org.junit.Test - we don't want to pull the whole of JUnit
 * into our JPF classpath just because we run TestJPF derived classes
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Ignore {
  String value() default "";
}
