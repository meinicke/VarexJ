package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeZoneCutover extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test_MockTurkIsCorrect() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_MockTurkIsCorrect");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateTimeCreation_london() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testDateTimeCreation_london");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateTimeCreation_newYork() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testDateTimeCreation_newYork");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateTimeCreation_losAngeles() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testDateTimeCreation_losAngeles");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForum4013394_retainOffsetWhenRetainFields_sameOffsetsDifferentZones() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testForum4013394_retainOffsetWhenRetainFields_sameOffsetsDifferentZones");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_MockGazaIsCorrect() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_MockGazaIsCorrect");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getOffsetFromLocal_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_getOffsetFromLocal_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_setHourZero_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_setHourZero_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_withHourZero_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_withHourZero_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_withDay_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_withDay_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_minusHour_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_minusHour_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusHour_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusHour_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_minusDay_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_minusDay_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusDay_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusDay_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusDayMidGap_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusDayMidGap_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_addWrapFieldDay_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_addWrapFieldDay_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_withZoneRetainFields_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_withZoneRetainFields_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_MutableDateTime_withZoneRetainFields_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_MutableDateTime_withZoneRetainFields_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_LocalDate_new_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_LocalDate_new_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_LocalDate_toDateMidnight_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_LocalDate_toDateMidnight_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_new_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_new_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_newValid_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_newValid_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_parse_Gaza() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_parse_Gaza");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getOffsetFromLocal_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_getOffsetFromLocal_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloorNotDST_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloorNotDST_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_setHourZero_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_setHourZero_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_withHourZero_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_withHourZero_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_withDay_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_withDay_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_minusHour_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_minusHour_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusHour_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusHour_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_minusDay_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_minusDay_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusDay_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusDay_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusDayMidGap_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusDayMidGap_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_addWrapFieldDay_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_addWrapFieldDay_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_withZoneRetainFields_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_withZoneRetainFields_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_MutableDateTime_setZoneRetainFields_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_MutableDateTime_setZoneRetainFields_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_LocalDate_new_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_LocalDate_new_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_LocalDate_toDateMidnight_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_LocalDate_toDateMidnight_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_new_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_new_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_newValid_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_newValid_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_parse_Turk() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_parse_Turk");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_NewYorkIsCorrect_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_NewYorkIsCorrect_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getOffsetFromLocal_NewYork_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_getOffsetFromLocal_NewYork_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_setHourAcross_NewYork_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_setHourAcross_NewYork_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_setHourForward_NewYork_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_setHourForward_NewYork_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_setHourBack_NewYork_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_setHourBack_NewYork_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_day_NewYork_Spring_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_day_NewYork_Spring_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_day_NewYork_Spring_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_day_NewYork_Spring_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_hour_NewYork_Spring_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_hour_NewYork_Spring_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_hour_NewYork_Spring_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_hour_NewYork_Spring_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_minute_NewYork_Spring_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_minute_NewYork_Spring_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_minute_NewYork_Spring_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_minute_NewYork_Spring_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_day_NewYork_Spring_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_day_NewYork_Spring_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_day_NewYork_Spring_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_day_NewYork_Spring_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_hour_NewYork_Spring_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_hour_NewYork_Spring_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_hour_NewYork_Spring_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_minute_NewYork_Spring_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_minute_NewYork_Spring_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_minute_NewYork_Spring_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_minute_NewYork_Spring_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_NewYorkIsCorrect_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_NewYorkIsCorrect_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getOffsetFromLocal_NewYork_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_getOffsetFromLocal_NewYork_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_constructor_NewYork_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_constructor_NewYork_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusHour_NewYork_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusHour_NewYork_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_minusHour_NewYork_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_minusHour_NewYork_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_day_NewYork_Autumn_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_day_NewYork_Autumn_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_day_NewYork_Autumn_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_day_NewYork_Autumn_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_hourOfDay_NewYork_Autumn_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_minuteOfHour_NewYork_Autumn_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundFloor_secondOfMinute_NewYork_Autumn_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_day_NewYork_Autumn_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_day_NewYork_Autumn_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_day_NewYork_Autumn_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_day_NewYork_Autumn_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_hourOfDay_NewYork_Autumn_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_minuteOfHour_NewYork_Autumn_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_preCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_preCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_postCutover() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_roundCeiling_secondOfMinute_NewYork_Autumn_postCutover");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_MoscowIsCorrect_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_MoscowIsCorrect_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getOffsetFromLocal_Moscow_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_getOffsetFromLocal_Moscow_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_setHourAcross_Moscow_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_setHourAcross_Moscow_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_setHourForward_Moscow_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_setHourForward_Moscow_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_setHourBack_Moscow_Spring() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_setHourBack_Moscow_Spring");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_MoscowIsCorrect_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_MoscowIsCorrect_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getOffsetFromLocal_Moscow_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_getOffsetFromLocal_Moscow_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getOffsetFromLocal_Moscow_Autumn_overlap_mins() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_getOffsetFromLocal_Moscow_Autumn_overlap_mins");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_constructor_Moscow_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_constructor_Moscow_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusHour_Moscow_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusHour_Moscow_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_minusHour_Moscow_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_minusHour_Moscow_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_GuatemataIsCorrect_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_GuatemataIsCorrect_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_getOffsetFromLocal_Guatemata_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_getOffsetFromLocal_Guatemata_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_plusHour_Guatemata_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_plusHour_Guatemata_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_minusHour_Guatemata_Autumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_minusHour_Guatemata_Autumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_DateTime_JustAfterLastEverOverlap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("test_DateTime_JustAfterLastEverOverlap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMinuteOfHourInDstChange_mockZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testWithMinuteOfHourInDstChange_mockZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithHourOfDayInDstChange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testWithHourOfDayInDstChange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMinuteOfHourInDstChange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testWithMinuteOfHourInDstChange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithSecondOfMinuteInDstChange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testWithSecondOfMinuteInDstChange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillisOfSecondInDstChange_Paris_summer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testWithMillisOfSecondInDstChange_Paris_summer");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillisOfSecondInDstChange_Paris_winter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testWithMillisOfSecondInDstChange_Paris_winter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillisOfSecondInDstChange_NewYork_summer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testWithMillisOfSecondInDstChange_NewYork_summer");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillisOfSecondInDstChange_NewYork_winter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testWithMillisOfSecondInDstChange_NewYork_winter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMinutesInDstChange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testPlusMinutesInDstChange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusSecondsInDstChange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testPlusSecondsInDstChange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusMillisInDstChange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testPlusMillisInDstChange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2182444_usCentral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testBug2182444_usCentral");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2182444_ausNSW() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testBug2182444_ausNSW");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug3192457_adjustOffset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testBug3192457_adjustOffset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug3476684_adjustOffset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testBug3476684_adjustOffset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug3476684_adjustOffset_springGap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testBug3476684_adjustOffset_springGap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateTimeCreation_athens() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testDateTimeCreation_athens");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateTimeCreation_paris() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDateTimeZoneCutover("testDateTimeCreation_paris");
			testcase.run();
		}
	}

}