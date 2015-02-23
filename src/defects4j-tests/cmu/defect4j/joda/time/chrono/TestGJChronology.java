package cmu.defect4j.joda.time.chrono;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestGJChronology extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFactory_Zone_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testFactory_Zone_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIllegalDates() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testIllegalDates");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPartialGetAsText() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testPartialGetAsText");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLeapYearRulesConstruction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testLeapYearRulesConstruction");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLeapYearRulesConstructionInvalid() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testLeapYearRulesConstructionInvalid");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_Zone_long_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testFactory_Zone_long_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_Zone_RI_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testFactory_Zone_RI_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParseEquivalence() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testParseEquivalence");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCutoverAddYears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testCutoverAddYears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCutoverAddMonths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testCutoverAddMonths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCutoverAddWeekyears() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testCutoverAddWeekyears");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCutoverAddWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testCutoverAddWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCutoverAddDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testCutoverAddDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testYearEndAddDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testYearEndAddDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtractDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testSubtractDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeOfDayAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testTimeOfDayAdd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaximumValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testMaximumValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactoryUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testFactoryUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testFactory");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_Zone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testFactory_Zone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testEquality");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithUTC() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testWithUTC");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWithZone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testWithZone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testToString");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDurationFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testDurationFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDateFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testDateFields");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTimeFields() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.chrono.TestGJChronology("testTimeFields");
			testcase.run();
		}
	}

}