package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestInterval_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testToPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodBeforeEnd3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithPeriodBeforeEnd3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testGetMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsEqual_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsBefore_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBeforeNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsBeforeNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsBefore_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsAfter_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfterNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsAfterNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsAfter_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDuration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testGetDuration1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDuration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testGetDuration2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCodeLenient() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testEqualsHashCodeLenient");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsHashCodeStrict() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testEqualsHashCodeStrict");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_useCase_ContainsOverlapAbutGap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("test_useCase_ContainsOverlapAbutGap");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_useCase_ContainsOverlapAbutGap_zeroDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("test_useCase_ContainsOverlapAbutGap_zeroDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test_useCase_ContainsOverlapAbutGap_bothZeroDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("test_useCase_ContainsOverlapAbutGap_bothZeroDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContains_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_long_zeroDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContains_long_zeroDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContainsNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContainsNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContains_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_RI_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContains_RI_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_RI_zeroDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContains_RI_zeroDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContains_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_RInterval_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContains_RInterval_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_RInterval_zeroDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testContains_RInterval_zeroDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlaps_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testOverlaps_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlaps_RInterval_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testOverlaps_RInterval_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlaps_RInterval_zeroDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testOverlaps_RInterval_zeroDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlap_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testOverlap_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlap_RInterval_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testOverlap_RInterval_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlap_RInterval_zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testOverlap_RInterval_zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlap_RInterval_zoneUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testOverlap_RInterval_zoneUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGap_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testGap_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGap_RInterval_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testGap_RInterval_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGap_RInterval_zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testGap_RInterval_zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGap_RInterval_zoneUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testGap_RInterval_zoneUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbuts_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testAbuts_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbuts_RInterval_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testAbuts_RInterval_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_RI_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsBefore_RI_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsBefore_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_RInterval_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsBefore_RInterval_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_RI_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsAfter_RI_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsAfter_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_RInterval_null() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testIsAfter_RInterval_null");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInterval1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testToInterval1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableInterval1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testToMutableInterval1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testToPeriod_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testToPeriod_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString_reparse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testToString_reparse");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronology1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithChronology1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronology2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithChronology2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithChronology3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithChronology3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithStartMillis_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithStartMillis_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithStartMillis_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithStartMillis_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithStartMillis_long3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithStartMillis_long3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithStartInstant_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithStartInstant_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithStartInstant_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithStartInstant_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithStartInstant_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithStartInstant_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithEndMillis_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithEndMillis_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithEndMillis_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithEndMillis_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithEndMillis_long3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithEndMillis_long3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithEndInstant_RI1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithEndInstant_RI1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithEndInstant_RI2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithEndInstant_RI2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithEndInstant_RI3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithEndInstant_RI3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAfterStart1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithDurationAfterStart1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAfterStart2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithDurationAfterStart2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAfterStart3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithDurationAfterStart3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAfterStart4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithDurationAfterStart4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationBeforeEnd1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithDurationBeforeEnd1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationBeforeEnd2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithDurationBeforeEnd2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationBeforeEnd3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithDurationBeforeEnd3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationBeforeEnd4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithDurationBeforeEnd4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodAfterStart1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithPeriodAfterStart1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodAfterStart2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithPeriodAfterStart2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodAfterStart3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithPeriodAfterStart3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodBeforeEnd1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithPeriodBeforeEnd1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithPeriodBeforeEnd2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testWithPeriodBeforeEnd2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestInterval_Basics("testToString");
			testcase.run();
		}
	}

}