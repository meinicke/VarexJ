package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateMidnight_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetYearOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetYearOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetCenturyOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetCenturyOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetYearOfCentury() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetYearOfCentury");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertySetMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertySetTextMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextLocaleMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertySetTextLocaleMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyAddMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddLongMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyAddLongMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyAddWrapFieldMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDifferenceMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetDifferenceMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundFloorMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyRoundFloorMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundCeilingMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyRoundCeilingMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundHalfFloorMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyRoundHalfFloorMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundHalfCeilingMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyRoundHalfCeilingMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundHalfEvenMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyRoundHalfEvenMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRemainderMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyRemainderMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMaximumValueDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyWithMaximumValueDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyWithMinimumValueDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyWithMinimumValueDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDayOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetDayOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetWeekOfWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetWeekOfWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyGetDayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalYearOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyToIntervalYearOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalYearOfCentury() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyToIntervalYearOfCentury");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyToIntervalYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyToIntervalMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyToIntervalDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeLenient() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyEqualsHashCodeLenient");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyEqualsHashCodeStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateMidnight_Properties("testPropertyEqualsHashCodeStrict");
			testcase.run();
		}
	}

}