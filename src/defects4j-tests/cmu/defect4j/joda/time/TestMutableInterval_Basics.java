package cmu.defect4j.joda.time;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TestMutableInterval_Basics extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-3.8.2.jar,lib/joda-convert-1.2.jar,jodatime/target/classes/,jodatime/target/test-classes,jodatime/"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualsHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testEqualsHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testToPeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTest() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testTest");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetMillis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testGetMillis");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testIsBefore_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBeforeNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testIsBeforeNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testIsBefore_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testIsAfter_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfterNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testIsAfterNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testIsAfter_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDuration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testGetDuration1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDuration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testGetDuration2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_long() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testContains_long");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContainsNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testContainsNow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_RI() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testContains_RI");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testContains_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlaps_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testOverlaps_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsBefore_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testIsBefore_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsAfter_RInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testIsAfter_RInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToInterval1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testToInterval1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToMutableInterval1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testToMutableInterval1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_PeriodType1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testToPeriod_PeriodType1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToPeriod_PeriodType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testToPeriod_PeriodType2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCopy() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testCopy");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClone() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testClone");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.joda.time.TestMutableInterval_Basics("testToString");
			testcase.run();
		}
	}

}