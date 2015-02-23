package cmu.defect4j.joda.time.chrono;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestLenientChronology extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_isoChrononolgy_Chicago() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_isoChrononolgy_Chicago");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_setYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_setYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_setMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_setMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_setDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_setDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_setHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_setHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNearDstTransition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("testNearDstTransition");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_MockTurkIsCorrect() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_MockTurkIsCorrect");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_lenientChrononolgy_Chicago() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_lenientChrononolgy_Chicago");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_lenientChrononolgy_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_lenientChrononolgy_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_strictChrononolgy_Chicago() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestLenientChronology("test_strictChrononolgy_Chicago");
			testcase.run();
		}
	}

}