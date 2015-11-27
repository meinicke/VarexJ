package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestPeriod_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testValueIndexMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testValueIndexMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsSupported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testIsSupported");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testGet");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutablePeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToMutablePeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testGetMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testGetPeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNegated");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithField3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithField4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeIndexMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testTypeIndexMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testIndexOf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_PeriodFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToString_PeriodFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_nullPeriodFormatter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToString_nullPeriodFormatter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDurationTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToDurationTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithPeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithPeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithPeriodType3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodType4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithPeriodType4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodType5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithPeriodType5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFields1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithFields1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFields2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithFields2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFields3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithFields3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPeriodStatics() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testPeriodStatics");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWith() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWith");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testPlus");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testMinus");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testPlusFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusFieldsZero() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testPlusFieldsZero");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinusFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testMinusFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipliedBy() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testMultipliedBy");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardWeeks_years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardWeeks_years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardWeeks_months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardWeeks_months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDays_years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardDays_years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDays_months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardDays_months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardHours_years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardHours_years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardHours_months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardHours_months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardMinutes_years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardMinutes_years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardMinutes_months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardMinutes_months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardSeconds_years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardSeconds_years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardSeconds_months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardSeconds_months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDuration_years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardDuration_years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDuration_months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardDuration_months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_yearMonth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_yearMonth1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_yearMonth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_yearMonth2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_weekDay1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_weekDay1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_weekDay2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_weekDay2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_yearMonthWeekDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_yearMonthWeekDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_yearMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_yearMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_negative() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_negative");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_fullNegative() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_fullNegative");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_yearMonth1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_yearMonth1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_yearMonth2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_yearMonth2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_yearMonth3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_yearMonth3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_weekDay1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_weekDay1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_weekDay2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_weekDay2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_weekDay3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_weekDay3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_yearMonthWeekDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_yearMonthWeekDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_yearMonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_yearMonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_months1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_months1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_months2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_months2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_months3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_months3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizedStandard_periodType_monthsWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testNormalizedStandard_periodType_monthsWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithField1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithField2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithField2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithFieldAdded1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithFieldAdded2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithFieldAdded3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithFieldAdded4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testWithFieldAdded4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToStandardDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDurationFrom() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToDurationFrom");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestPeriod_Basics("testToString");
			testcase.run();
		}
	}

}