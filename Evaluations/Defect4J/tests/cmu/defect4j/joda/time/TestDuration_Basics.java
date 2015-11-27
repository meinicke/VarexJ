package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDuration_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testCompareTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToStandardHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToStandardMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToStandardSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEqual() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testIsEqual");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testIsBefore");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testIsAfter");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testGetMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStandardSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testGetStandardSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDuration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToDuration1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDuration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToDuration2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToStandardDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDays_overflow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToStandardDays_overflow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardHours_overflow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToStandardHours_overflow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardMinutes_overflow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToStandardMinutes_overflow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardSeconds_overflow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToStandardSeconds_overflow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_fixedZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriod_fixedZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_PeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriod_PeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriod_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_PeriodType_Chronology() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriod_PeriodType_Chronology");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriodFrom() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriodFrom");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriodFrom_PeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriodFrom_PeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriodTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriodTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriodTo_PeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToPeriodTo_PeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToIntervalFrom() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToIntervalFrom");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToIntervalTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToIntervalTo");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillis1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithMillis1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithMillis2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithMillis2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_long_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_long_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_long_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_long_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_long_int3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_long_int3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_long_int4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_long_int4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_long_int5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_long_int5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testPlus_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testPlus_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testMinus_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testMinus_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipliedBy_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testMultipliedBy_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipliedBy_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testMultipliedBy_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDividedBy_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testDividedBy_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDividedBy_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testDividedBy_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated_long1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testNegated_long1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated_long2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testNegated_long2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated_long3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testNegated_long3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_RD_int1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_RD_int2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_RD_int3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_RD_int4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_RD_int5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithDurationAdded_RD_int6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testWithDurationAdded_RD_int6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RD1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testPlus_RD1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RD2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testPlus_RD2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_RD3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testPlus_RD3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RD1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testMinus_RD1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RD2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testMinus_RD2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_RD3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testMinus_RD3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMutableDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testMutableDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDuration_Basics("testToString");
			testcase.run();
		}
	}

}