package cmu.defect4j.jfree.chart.axis.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class LogarithmicAxisTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testJava2DToValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogarithmicAxisTests("testJava2DToValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogarithmicAxisTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdjustedLog10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogarithmicAxisTests("testAdjustedLog10");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchedLog10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogarithmicAxisTests("testSwitchedLog10");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testValueToJava2D() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.axis.junit.LogarithmicAxisTests("testValueToJava2D");
			testcase.run();
		}
	}

}