package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestYears extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testConstants");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testGetMethods");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPeriodType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testGetPeriodType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsGreaterThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testIsGreaterThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsLessThan() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testIsLessThan");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testPlus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testMinus_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipliedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testMultipliedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDividedBy_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testDividedBy_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testNegated");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddToLocalDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testAddToLocalDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetFieldType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testGetFieldType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_yearsBetween_RInstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testFactory_yearsBetween_RInstant");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_years_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testFactory_years_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_yearsBetween_RPartial() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testFactory_yearsBetween_RPartial");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_yearsIn_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testFactory_yearsIn_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFactory_parseYears_String() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testFactory_parseYears_String");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlus_Years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testPlus_Years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMinus_Years() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testMinus_Years");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestYears("testToString");
			testcase.run();
		}
	}

}