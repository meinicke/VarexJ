package cmu.peers;

import java.util.Stack;
import java.util.Vector;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

/**
 * Tests for class {@link Class}.
 * @author Jens Meinicke
 *
 */
public class ClassTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Test
	public void isAssignableFromTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			assertTrue(int.class.isAssignableFrom(int.class));
			assertTrue(float.class.isAssignableFrom(float.class));
			assertFalse(int.class.isAssignableFrom(float.class));
			assertFalse(float.class.isAssignableFrom(int.class));
			
			assertTrue(Vector.class.isAssignableFrom(Vector.class));
			assertTrue(Stack.class.isAssignableFrom(Stack.class));
			assertTrue(Vector.class.isAssignableFrom(Stack.class));
			assertFalse(Stack.class.isAssignableFrom(Vector.class));
			
			assertFalse(int.class.isAssignableFrom(Vector.class));
			assertFalse(Vector.class.isAssignableFrom(int.class));
		}
	}
	
}
