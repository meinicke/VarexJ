package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeFormat extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFormat_clockhourOfHalfday() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_clockhourOfHalfday");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_clockhourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_clockhourOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_minute() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_minute");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_second() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_second");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_fractionOfSecond() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_fractionOfSecond");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_fractionOfSecondLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_fractionOfSecondLong");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_zoneText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_zoneText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_zoneLongText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_zoneLongText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_zoneAmount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_zoneAmount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_zoneAmountColon() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_zoneAmountColon");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_zoneAmountID() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_zoneAmountID");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_other() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_other");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_invalid() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_invalid");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_samples() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_samples");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_shortBasicParse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_shortBasicParse");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_pivotYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testParse_pivotYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_pivotYear_ignored4DigitYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testParse_pivotYear_ignored4DigitYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthJanShort_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthJanShort_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthJanShortLowerCase_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthJanShortLowerCase_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthJanShortUpperCase_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthJanShortUpperCase_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParse_textMonthJanLong_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testParse_textMonthJanLong_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthJanLongLowerCase_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthJanLongLowerCase_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthJanLongUpperCase_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthJanLongUpperCase_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthJanShort_France() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthJanShort_France");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthJanLong_France() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthJanLong_France");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthApr_France() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthApr_France");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthAtEnd_France() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthAtEnd_France");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthApr_Korean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthApr_Korean");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textHalfdayAM_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textHalfdayAM_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textHalfdayAM_France() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textHalfdayAM_France");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textEraAD_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textEraAD_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textEraAD_France() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textEraAD_France");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textEraBC_France() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textEraBC_France");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textYear_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textYear_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textYear_France() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textYear_France");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textAdjoiningHelloWorld_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textAdjoiningHelloWorld_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textAdjoiningMonthDOW_UK() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textAdjoiningMonthDOW_UK");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_zoneId_noColon() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_zoneId_noColon");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_zoneId_noColon_parseZ() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_zoneId_noColon_parseZ");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_zoneId_colon() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_zoneId_colon");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_zoneId_colon_parseZ() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_zoneId_colon_parseZ");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormatParse_textMonthAtEnd_France_withSpecifiedDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormatParse_textMonthAtEnd_France_withSpecifiedDefault");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubclassableConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testSubclassableConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_era() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_era");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_centuryOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_centuryOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_yearOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_yearOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_yearOfEra_twoDigit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_yearOfEra_twoDigit");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_yearOfEraParse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_yearOfEraParse");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_year() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_year");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_year_twoDigit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_year_twoDigit");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_year_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_year_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_weekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekyearOfEra_twoDigit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_weekyearOfEra_twoDigit");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_weekOfWeekyear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_weekOfWeekyear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dayOfWeek() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_dayOfWeek");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dayOfWeekShortText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_dayOfWeekShortText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dayOfWeekText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_dayOfWeekText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dayOfYearText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_dayOfYearText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_monthOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_monthOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_monthOfYearShortText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_monthOfYearShortText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_monthOfYearText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_monthOfYearText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_dayOfMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_dayOfMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_halfdayOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_halfdayOfDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_hourOfHalfday() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_hourOfHalfday");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat_hourOfDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormat("testFormat_hourOfDay");
			testcase.run();
		}
	}

}