package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestIllegalFieldValueException extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testVerifyValueBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestIllegalFieldValueException("testVerifyValueBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSkipDateTimeField() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestIllegalFieldValueException("testSkipDateTimeField");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestIllegalFieldValueException("testSetText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testZoneTransition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestIllegalFieldValueException("testZoneTransition");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJulianYearZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestIllegalFieldValueException("testJulianYearZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGJCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestIllegalFieldValueException("testGJCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReadablePartialValidate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestIllegalFieldValueException("testReadablePartialValidate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOtherConstructors() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestIllegalFieldValueException("testOtherConstructors");
			testcase.run();
		}
	}

}