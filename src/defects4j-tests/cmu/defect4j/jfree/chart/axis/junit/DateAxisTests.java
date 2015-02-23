package cmu.defect4j.jfree.chart.axis.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DateAxisTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void test1472942() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("test1472942");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetRange() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testSetRange");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMaximumDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testSetMaximumDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMinimumDate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testSetMinimumDate");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJava2DToValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testJava2DToValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateYearA() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateYearA");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateYearB() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateYearB");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateMonthA() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateMonthA");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateMonthB() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateMonthB");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateDayA() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateDayA");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateDayB() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateDayB");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateHourA() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateHourA");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateHourB() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateHourB");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateSecondA() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateSecondA");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateSecondB() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateSecondB");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateMillisecondA() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateMillisecondA");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPreviousStandardDateMillisecondB() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testPreviousStandardDateMillisecondB");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug2201869() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testBug2201869");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.DateAxisTests("testHashCode");
			testcase.run();
		}
	}

}