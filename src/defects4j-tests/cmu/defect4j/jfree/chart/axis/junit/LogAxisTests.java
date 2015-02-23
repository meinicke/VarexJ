package cmu.defect4j.jfree.chart.axis.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class LogAxisTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testTranslateJava2DToValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testTranslateJava2DToValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAutoRange1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testAutoRange1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAutoRange3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testAutoRange3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testXYAutoRange1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testXYAutoRange1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testXYAutoRange2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testXYAutoRange2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetLowerBound() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testSetLowerBound");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTickMarksVisibleDefault() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testTickMarksVisibleDefault");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogAxisTests("testHashCode");
			testcase.run();
		}
	}

}