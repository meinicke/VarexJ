package defects4j.lang3;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class ArrayUtilsAddTest extends TestJPF {

	private final String[] config = { "+nhandler.delegateUnhandledNative",
			"+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/commons-lang3-3.2-SNAPSHOT.jar,${jpf-core}/lib/easymock.jar,${jpf-core}/lib/commons-io.jar",
			"+search.class=.search.RandomSearch" };

	public static void main(String[] testMethods) {
		runTestsOfThisClass(testMethods);
	}

	@Test(timeout = 120000)
	public void testJira567() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testJira567();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayBoolean();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayByte() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayByte();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayChar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayChar();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayDouble() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayDouble();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayFloat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayFloat();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayInt();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayLong();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayShort() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayShort();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayObject();
			}
		}
	}

	@Test(timeout = 120000)
	public void testLANG571() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testLANG571();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectArrayToObjectArray() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectArrayToObjectArray();
			}
		}
	}

	@Test(timeout = 120000)
	public void testAddObjectAtIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			if (V) {
				org.apache.commons.lang3.ArrayUtilsAddTest object = new org.apache.commons.lang3.ArrayUtilsAddTest();
				object.testAddObjectAtIndex();
			}
		}
	}

}