package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutableDateTime_Properties extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetYearOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetYearOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetCenturyOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetCenturyOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetYearOfCentury() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetYearOfCentury");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetTextMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddWrapFieldMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDayOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetDayOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetWeekOfWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetWeekOfWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetDayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetDayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalYearOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalYearOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalYearOfCentury() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalYearOfCentury");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalMonthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalMonthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddWrapFieldYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetTextYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddWrapFieldDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextDayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetTextDayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddDayOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddDayOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldDayOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddWrapFieldDayOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetDayOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetDayOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextDayOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetTextDayOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWeekOfWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddWeekOfWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldWeekOfWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddWrapFieldWeekOfWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetWeekOfWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetWeekOfWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextWeekOfWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetTextWeekOfWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddDayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddDayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddLongDayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddLongDayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddWrapFieldDayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyAddWrapFieldDayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetDayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetDayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertySetTextDayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertySetTextDayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundFloorHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyRoundFloorHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundCeilingHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyRoundCeilingHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundHalfFloorHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyRoundHalfFloorHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundHalfCeilingHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyRoundHalfCeilingHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRoundHalfEvenHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyRoundHalfEvenHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyRemainderHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyRemainderHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMinuteOfHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetMinuteOfHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMinuteOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetMinuteOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetSecondOfMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetSecondOfMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetSecondOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetSecondOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMillisOfSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetMillisOfSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyGetMillisOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyGetMillisOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalHourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalHourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalMinuteOfHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalMinuteOfHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalSecondOfMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalSecondOfMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyToIntervalMillisOfSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Properties("testPropertyToIntervalMillisOfSecond");
			testcase.run();
		}
	}

}