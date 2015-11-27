package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeConstants extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeConstants("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHalfdaysOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeConstants("testHalfdaysOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDaysOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeConstants("testDaysOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMonthsOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeConstants("testMonthsOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEras() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeConstants("testEras");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeConstants("testMaths");
			testcase.run();
		}
	}

}