package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestWeeks extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testConstants");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testGetMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testGetPeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsGreaterThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testIsGreaterThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLessThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testIsLessThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardHours() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testToStandardHours");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardMinutes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testToStandardMinutes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardSeconds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testToStandardSeconds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDuration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testToStandardDuration");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testPlus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testMinus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipliedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testMultipliedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDividedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testDividedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testNegated");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testAddToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToStandardDays() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testToStandardDays");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_weeks_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testFactory_weeks_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_weeksBetween_RInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testFactory_weeksBetween_RInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_weeksBetween_RPartial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testFactory_weeksBetween_RPartial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_weeksIn_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testFactory_weeksIn_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_standardWeeksIn_RPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testFactory_standardWeeksIn_RPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_parseWeeks_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testFactory_parseWeeks_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_Weeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testPlus_Weeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_Weeks() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testMinus_Weeks");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestWeeks("testToString");
			testcase.run();
		}
	}

}