package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMonths extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testConstants");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testGetMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testGetPeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsGreaterThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testIsGreaterThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLessThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testIsLessThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testPlus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testMinus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipliedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testMultipliedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDividedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testDividedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testNegated");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testAddToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_monthsBetween_RInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testFactory_monthsBetween_RInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_monthsBetween_RPartial_LocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testFactory_monthsBetween_RPartial_LocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_monthsBetween_RPartial_YearMonth() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testFactory_monthsBetween_RPartial_YearMonth");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_monthsBetween_RPartial_MonthDay() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testFactory_monthsBetween_RPartial_MonthDay");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_monthsIn_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testFactory_monthsIn_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_parseMonths_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testFactory_parseMonths_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_Months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testMinus_Months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_months_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testFactory_months_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_Months() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testPlus_Months");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMonths("testToString");
			testcase.run();
		}
	}

}