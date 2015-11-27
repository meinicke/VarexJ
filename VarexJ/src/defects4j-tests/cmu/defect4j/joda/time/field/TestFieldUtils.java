package cmu.defect4j.joda.time.field;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestFieldUtils extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSafeAddInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestFieldUtils("testSafeAddInt");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSafeAddLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestFieldUtils("testSafeAddLong");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSafeSubtractLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestFieldUtils("testSafeSubtractLong");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSafeMultiplyLongLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestFieldUtils("testSafeMultiplyLongLong");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSafeMultiplyLongInt() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestFieldUtils("testSafeMultiplyLongInt");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSafeDivideLongLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.field.TestFieldUtils("testSafeDivideLongLong");
			testcase.run();
		}
	}

}