package gov.nasa.jpf.jvm.bytecode;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class PUTSTATICTest extends TestJPF {

	
	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Conditional
	static boolean a = true;

	@Test
	public void intArraysFillTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (a) {
				assert ClassWithStaticField.field == null;
				ClassWithStaticField.field = new Object();
				assert ClassWithStaticField.field != null;
			} else {
				assert ClassWithStaticField.field == null : "field initialized for wrong condition";
			}
		}
	}
}

