package gov.nasa.jpf.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * annotation that can be used to change JPF config properties
 * from within the SuT
 * using such annotations should NOT make the SuT JPF dependent
 */
@Retention(RetentionPolicy.CLASS)
public @interface JPFConfig {
  String[] value(); // each element is a "key[+]=val" pair
}
