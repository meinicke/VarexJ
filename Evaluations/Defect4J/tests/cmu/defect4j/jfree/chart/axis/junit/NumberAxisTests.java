package cmu.defect4j.jfree.chart.axis.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NumberAxisTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTranslateJava2DToValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testTranslateJava2DToValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAutoRange1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testAutoRange1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAutoRange3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testAutoRange3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testXYAutoRange1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testXYAutoRange1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testXYAutoRange2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testXYAutoRange2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetLowerBound() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testSetLowerBound");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAutoRange2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testAutoRange2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAutoRange4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testAutoRange4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.NumberAxisTests("testHashCode");
			testcase.run();
		}
	}

}