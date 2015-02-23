package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestISODateTimeFormat extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSubclassableConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testSubclassableConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_year() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_year");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_weekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_date() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_date");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_date_partial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_date_partial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_time() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_time");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_time_partial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_time_partial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_timeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_timeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_timeNoMillis_partial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_timeNoMillis_partial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_tTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_tTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_tTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_tTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_dateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_dateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_ordinalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_ordinalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_ordinalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_ordinalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_ordinalDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_ordinalDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_weekDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_weekDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_weekDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicTTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicTTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicTTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicTTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicOrdinalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicOrdinalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicOrdinalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicOrdinalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicOrdinalDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicOrdinalDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicWeekDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicWeekDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicWeekDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicWeekDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_basicWeekDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_basicWeekDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_yearMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_yearMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_yearMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_yearMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekyearWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_weekyearWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekyearWeekDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_weekyearWeekDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_hour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_hour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_hourMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_hourMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_hourMinuteSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_hourMinuteSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_hourMinuteSecondMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_hourMinuteSecondMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_hourMinuteSecondFraction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_hourMinuteSecondFraction");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dateHour() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_dateHour");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dateHourMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_dateHourMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dateHourMinuteSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_dateHourMinuteSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dateHourMinuteSecondMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_dateHourMinuteSecondMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dateHourMinuteSecondFraction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormat("testFormat_dateHourMinuteSecondFraction");
			testcase.run();
		}
	}

}