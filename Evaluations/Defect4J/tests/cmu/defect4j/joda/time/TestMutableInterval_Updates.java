package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutableInterval_Updates extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSePeriodBeforeEnd_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSePeriodBeforeEnd_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriodBeforeEnd_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetPeriodBeforeEnd_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_long_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_long_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_long_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_long_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_RI_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_RI_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_RI_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_RI_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_RI_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_RI_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_RI_RI4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_RI_RI4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_RI_RI5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_RI_RI5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_RInterval1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_RInterval1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_RInterval2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_RInterval2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetInterval_RInterval3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetInterval_RInterval3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetStartMillis_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetStartMillis_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetStartMillis_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetStartMillis_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetStart_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetStart_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetStart_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetStart_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetStart_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetStart_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetEndMillis_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetEndMillis_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetEndMillis_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetEndMillis_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetEnd_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetEnd_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetEnd_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetEnd_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetEnd_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetEnd_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDurationAfterStart_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetDurationAfterStart_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSeDurationAfterStart_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSeDurationAfterStart_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDurationAfterStart_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetDurationAfterStart_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSeDurationAfterStart_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSeDurationAfterStart_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDurationAfterStart_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetDurationAfterStart_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDurationBeforeEnd_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetDurationBeforeEnd_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSeDurationBeforeEnd_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSeDurationBeforeEnd_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDurationBeforeEnd_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetDurationBeforeEnd_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSeDurationBeforeEnd_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSeDurationBeforeEnd_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDurationBeforeEnd_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetDurationBeforeEnd_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriodAfterStart_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetPeriodAfterStart_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSePeriodAfterStart_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSePeriodAfterStart_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriodAfterStart_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetPeriodAfterStart_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPeriodBeforeEnd_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Updates("testSetPeriodBeforeEnd_RI1");
			testcase.run();
		}
	}

}