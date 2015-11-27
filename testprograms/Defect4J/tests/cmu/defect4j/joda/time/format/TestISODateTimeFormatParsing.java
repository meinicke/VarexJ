package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestISODateTimeFormatParsing extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_dateParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_dateParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_localDateParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_localDateParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_dateElementParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_dateElementParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_timeParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_timeParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_localTimeParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_localTimeParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_timeElementParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_timeElementParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_dateTimeParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_dateTimeParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_dateOptionalTimeParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_dateOptionalTimeParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_localDateOptionalTimeParser() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_localDateOptionalTimeParser");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_date() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_date");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_time() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_time");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_timeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_timeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_tTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_tTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_tTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_tTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_dateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_dateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_dateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_dateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_ordinalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_ordinalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_ordinalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_ordinalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_ordinalDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_ordinalDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_weekDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_weekDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_weekDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_weekDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_weekDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_weekDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicTTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicTTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicTTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicTTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicOrdinalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicOrdinalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicOrdinalDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicOrdinalDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicOrdinalDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicOrdinalDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicWeekDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicWeekDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicWeekDateTime() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicWeekDateTime");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_basicWeekDateTimeNoMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_basicWeekDateTimeNoMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_hourMinute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_hourMinute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_hourMinuteSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_hourMinuteSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_hourMinuteSecondMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_hourMinuteSecondMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_hourMinuteSecondFraction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestISODateTimeFormatParsing("test_hourMinuteSecondFraction");
			testcase.run();
		}
	}

}