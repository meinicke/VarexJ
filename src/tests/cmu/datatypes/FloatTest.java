package cmu.datatypes;

import gov.nasa.jpf.annotation.MyAnnotation;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class FloatTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";
	
	@MyAnnotation
	static boolean a = true;
	@MyAnnotation
	static boolean b = true;
	@MyAnnotation
	static boolean c = true;
	@MyAnnotation
	static boolean d = true;
	
	@MyAnnotation
	static boolean x = true;
	@MyAnnotation
	static boolean y = true;
	@MyAnnotation
	static boolean z = true;

	
	@Test
	public void testFloat() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			float i = 1.3f;
			float j = 3.6f;
			if (z) {
				i = 2;
			}
			if (y) {
				j = 4;
			}
			
			float k = 0.0f;
			k = i + j;
			k = i * j;
			k = i / j;
			k = i % j;
		}
	}


}
