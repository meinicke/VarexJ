package cmu.defect4j.jfree.chart.plot.dial.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DialPlotTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBackgroundListener() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testBackgroundListener");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCapListener() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testCapListener");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFrameListener() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testFrameListener");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScaleListener() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testScaleListener");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLayerListener() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPlotTests("testLayerListener");
			testcase.run();
		}
	}

}