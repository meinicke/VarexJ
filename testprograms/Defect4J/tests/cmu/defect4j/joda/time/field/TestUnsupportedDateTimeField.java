package cmu.defect4j.joda.time.field;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TestUnsupportedDateTimeField extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jodatime.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.joda.time.field.TestUnsupportedDateTimeField object = new org.joda.time.field.TestUnsupportedDateTimeField();
			object.testToString();
		}
	}

	@Test(timeout=120000)
	public void testNullValuesToGetInstanceThrowsException() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.joda.time.field.TestUnsupportedDateTimeField object = new org.joda.time.field.TestUnsupportedDateTimeField();
			object.testNullValuesToGetInstanceThrowsException();
		}
	}

	@Test(timeout=120000)
	public void testDifferentDurationReturnDifferentObjects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.joda.time.field.TestUnsupportedDateTimeField object = new org.joda.time.field.TestUnsupportedDateTimeField();
			object.testDifferentDurationReturnDifferentObjects();
		}
	}

	@Test(timeout=120000)
	public void testPublicGetNameMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.joda.time.field.TestUnsupportedDateTimeField object = new org.joda.time.field.TestUnsupportedDateTimeField();
			object.testPublicGetNameMethod();
		}
	}

	@Test(timeout=120000)
	public void testAlwaysFalseReturnTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.joda.time.field.TestUnsupportedDateTimeField object = new org.joda.time.field.TestUnsupportedDateTimeField();
			object.testAlwaysFalseReturnTypes();
		}
	}

	@Test(timeout=120000)
	public void testMethodsThatShouldAlwaysReturnNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.joda.time.field.TestUnsupportedDateTimeField object = new org.joda.time.field.TestUnsupportedDateTimeField();
			object.testMethodsThatShouldAlwaysReturnNull();
		}
	}

	@Test(timeout=120000)
	public void testUnsupportedMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.joda.time.field.TestUnsupportedDateTimeField object = new org.joda.time.field.TestUnsupportedDateTimeField();
			object.testUnsupportedMethods();
		}
	}

	@Test(timeout=120000)
	public void testDelegatedMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			org.joda.time.field.TestUnsupportedDateTimeField object = new org.joda.time.field.TestUnsupportedDateTimeField();
			object.testDelegatedMethods();
		}
	}

}