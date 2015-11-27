package cmu.defect4j.joda.time.format;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDateTimeFormatter extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPrint_locale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrint_locale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrint_zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrint_chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrint_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_bufferMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrint_bufferMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_writerMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrint_writerMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_appendableMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrint_appendableMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrint_chrono_and_zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrint_chrono_and_zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithGetLocale() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testWithGetLocale");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithGetZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testWithGetZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithGetChronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testWithGetChronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithGetPivotYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testWithGetPivotYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithGetOffsetParsedMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testWithGetOffsetParsedMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrinterParserMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testPrinterParserMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_yearOfEra() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_yearOfEra");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_yearOfCentury() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_yearOfCentury");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_monthDay_feb29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_monthDay_feb29");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_monthDay_withDefaultYear_feb29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_monthDay_withDefaultYear_feb29");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_weekyear_month_week_2010() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_weekyear_month_week_2010");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_weekyear_month_week_2011() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_weekyear_month_week_2011");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_weekyear_month_week_2012() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_weekyear_month_week_2012");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_year_month_week_2010() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_year_month_week_2010");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_year_month_week_2011() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_year_month_week_2011");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_year_month_week_2012() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_year_month_week_2012");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_year_month_week_2013() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_year_month_week_2013");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_year_month_week_2014() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_year_month_week_2014");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_year_month_week_2015() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_year_month_week_2015");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDate_year_month_week_2016() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDate_year_month_week_2016");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalTime_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalTime_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDateTime_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDateTime_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDateTime_monthDay_feb29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDateTime_monthDay_feb29");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseLocalDateTime_monthDay_withDefaultYear_feb29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseLocalDateTime_monthDay_withDefaultYear_feb29");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDateTime_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseDateTime_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDateTime_zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseDateTime_zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDateTime_zone2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseDateTime_zone2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDateTime_zone3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseDateTime_zone3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDateTime_simple_precedence() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseDateTime_simple_precedence");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDateTime_offsetParsed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseDateTime_offsetParsed");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseDateTime_chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseDateTime_chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMutableDateTime_simple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseMutableDateTime_simple");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMutableDateTime_zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseMutableDateTime_zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMutableDateTime_zone2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseMutableDateTime_zone2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMutableDateTime_zone3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseMutableDateTime_zone3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMutableDateTime_simple_precedence() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseMutableDateTime_simple_precedence");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMutableDateTime_offsetParsed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseMutableDateTime_offsetParsed");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMutableDateTime_chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseMutableDateTime_chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_zone2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_zone2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_zone3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_zone3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_simple_precedence() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_simple_precedence");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_offsetParsed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_offsetParsed");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_chrono() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_chrono");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthOnly() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthOnly");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthOnly_baseStartYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthOnly_baseStartYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthOnly_parseStartYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthOnly_parseStartYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthOnly_baseEndYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthOnly_baseEndYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthOnly_parseEndYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthOnly_parseEndYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29_startOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29_startOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29_OfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29_OfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29_newYork() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29_newYork");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29_newYork_startOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29_newYork_startOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29_newYork_endOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29_newYork_endOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29_tokyo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29_tokyo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29_tokyo_startOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29_tokyo_startOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_feb29_tokyo_endOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_feb29_tokyo_endOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_withDefaultYear_feb29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_withDefaultYear_feb29");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_withDefaultYear_feb29_newYork() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_withDefaultYear_feb29_newYork");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseInto_monthDay_withDefaultYear_feb29_newYork_endOfYear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseMillis_fractionOfSecondLong() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testParseMillis_fractionOfSecondLong");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testZoneNameNearTransition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testZoneNameNearTransition");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testZoneShortNameNearTransition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.format.TestDateTimeFormatter("testZoneShortNameNearTransition");
			testcase.run();
		}
	}

}