package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutableDateTime_Sets extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetWeekOfWeekyear_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetWeekOfWeekyear_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetWeekOfWeekyear_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetWeekOfWeekyear_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfWeek_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfWeek_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfWeek_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfWeek_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetHourOfDay_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetHourOfDay_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetHourOfDay_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetHourOfDay_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMinuteOfHour_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMinuteOfHour_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMinuteOfHour_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMinuteOfHour_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMinuteOfDay_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMinuteOfDay_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMinuteOfDay_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMinuteOfDay_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetSecondOfMinute_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetSecondOfMinute_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetSecondOfMinute_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetSecondOfMinute_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetSecondOfDay_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetSecondOfDay_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetSecondOfDay_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetSecondOfDay_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMilliOfSecond_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMilliOfSecond_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMilliOfSecond_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMilliOfSecond_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMilliOfDay_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMilliOfDay_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMilliOfDay_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMilliOfDay_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMillis_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMillis_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetChronology_Chronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetChronology_Chronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetChronology_Chronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetChronology_Chronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetZone_DateTimeZone1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetZone_DateTimeZone1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetZone_DateTimeZone2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetZone_DateTimeZone2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetZoneRetainFields_DateTimeZone1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetZoneRetainFields_DateTimeZone1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetZoneRetainFields_DateTimeZone2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetZoneRetainFields_DateTimeZone2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetZoneRetainFields_DateTimeZone3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetZoneRetainFields_DateTimeZone3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetZoneRetainFields_DateTimeZone4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetZoneRetainFields_DateTimeZone4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMillis_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMillis_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMillis_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMillis_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSet_DateTimeFieldType_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSet_DateTimeFieldType_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSet_DateTimeFieldType_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSet_DateTimeFieldType_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSet_DateTimeFieldType_int3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSet_DateTimeFieldType_int3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDate_int_int_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDate_int_int_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDate_int_int_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDate_int_int_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDate_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDate_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDate_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDate_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDate_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDate_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDate_RI_same() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDate_RI_same");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDate_RI_different1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDate_RI_different1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDate_RI_different2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDate_RI_different2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTime_int_int_int_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetTime_int_int_int_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTime_int_int_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetTime_int_int_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTime_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetTime_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTime_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetTime_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTime_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetTime_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTime_Object3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetTime_Object3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDateTime_int_int_int_int_int_int_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDateTime_int_int_int_int_int_int_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDateTime_int_int_int_int_int_int_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDateTime_int_int_int_int_int_int_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetYear_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetYear_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMonthOfYear_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMonthOfYear_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMonthOfYear_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMonthOfYear_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMonthOfYear_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMonthOfYear_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMonthOfYear_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetMonthOfYear_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfMonth_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfMonth_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfMonth_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfMonth_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfMonth_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfMonth_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfMonth_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfMonth_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfYear_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfYear_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfYear_int_dstOverlapSummer_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfYear_int_dstOverlapSummer_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfYear_int_dstOverlapWinter_addZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfYear_int_dstOverlapWinter_addZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDayOfYear_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetDayOfYear_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetWeekyear_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableDateTime_Sets("testSetWeekyear_int1");
			testcase.run();
		}
	}

}