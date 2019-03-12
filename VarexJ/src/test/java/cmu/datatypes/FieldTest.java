package cmu.datatypes;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

public class FieldTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Conditional
	static boolean a = false;

	@Test
	public void testFloat() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			A object = null;
			if (a) {
				object = new A();
			}
			Verify.resetCounter(0);
			try {
				setField(object);
				Verify.incrementCounter(0);
			} catch (NullPointerException e) {
				e.printStackTrace();
				Verify.incrementCounter(0);
			}
			Verify.incrementCounter(0);
			assertEquals(3, Verify.getCounter(0));
		}
	}

	private void setField(A object) {
		object.field = 1;
	}

	class A {
		int field;
	}
}
