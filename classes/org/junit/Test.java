/**
 * this annotation type is shamelessly lifted from JUnit.
 *
 * The only reason it is here is that we don't want to pull the whole of JUnit into
 * our 'classpath' when executing TestJPF classes under JPF, just because some of
 * the test SUT methods have a @Test annotation.
 *
 * Lifting/masking classes in general is not a good practice, but it seems to
 * be the lesser of two evils in this case, given that we really don't need
 * anything but just the simple annotation type.
 *
 * NOTE - this might be different if we execute junit under JPF, which is the
 * reason why we include the @Test features here. However - this assumes that @Test
 * is such a basic JUnit type that it won't change
 */

package org.junit;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface Test {

  static class None extends Throwable {
    private static final long serialVersionUID= 1L;
    private None() {}
  }

  Class<? extends Throwable> expected() default None.class;

  long timeout() default 0L;
}
