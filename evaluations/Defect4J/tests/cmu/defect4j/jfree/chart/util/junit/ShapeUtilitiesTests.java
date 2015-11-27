package cmu.defect4j.jfree.chart.util.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ShapeUtilitiesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEqualLine2Ds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.ShapeUtilitiesTests("testEqualLine2Ds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualShapes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.ShapeUtilitiesTests("testEqualShapes");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIntersects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.ShapeUtilitiesTests("testIntersects");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualGeneralPaths() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.ShapeUtilitiesTests("testEqualGeneralPaths");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClipLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.ShapeUtilitiesTests("testClipLine");
			testcase.run();
		}
	}

}