package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestTextFields extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMonthNames_monthStart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestTextFields("testMonthNames_monthStart");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMonthNames_monthMiddle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestTextFields("testMonthNames_monthMiddle");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMonthNames_monthEnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestTextFields("testMonthNames_monthEnd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWeekdayNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestTextFields("testWeekdayNames");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHalfdayNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestTextFields("testHalfdayNames");
			testcase.run();
		}
	}

}