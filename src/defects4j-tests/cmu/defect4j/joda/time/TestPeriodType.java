package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPeriodType extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testIsSupported");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testIndexOf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStandard() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testStandard");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYearMonthDayTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testYearMonthDayTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYearMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testYearMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYearWeekDayTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testYearWeekDayTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYearWeekDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testYearWeekDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYearDayTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testYearDayTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYearDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testYearDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDayTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testDayTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testForFields1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testForFields2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testForFields3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testForFields4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testForFields5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testForFields6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForFields7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testForFields7");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskHoursMinutesSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskHoursMinutesSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskTwice1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskTwice1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaskTwice2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testMaskTwice2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriodType("testHashCode");
			testcase.run();
		}
	}

}