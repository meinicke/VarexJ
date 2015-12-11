package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestDays extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testConstants");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_days_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testFactory_days_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_daysBetween_RInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testFactory_daysBetween_RInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_daysBetween_RPartial_LocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testFactory_daysBetween_RPartial_LocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_daysBetween_RPartial_YearMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testFactory_daysBetween_RPartial_YearMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_daysBetween_RPartial_MonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testFactory_daysBetween_RPartial_MonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_daysIn_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testFactory_daysIn_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_standardDaysIn_RPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testFactory_standardDaysIn_RPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_parseDays_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testFactory_parseDays_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testGetMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testGetPeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsGreaterThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testIsGreaterThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLessThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testIsLessThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardWeeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testToStandardWeeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testToStandardHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testToStandardMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testToStandardSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testToStandardDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testPlus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_Days() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testPlus_Days");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testMinus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_Days() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testMinus_Days");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipliedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testMultipliedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDividedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testDividedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testNegated");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testAddToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestDays("testToString");
			testcase.run();
		}
	}

}