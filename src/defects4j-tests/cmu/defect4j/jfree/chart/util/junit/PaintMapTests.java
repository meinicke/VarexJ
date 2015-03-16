package cmu.defect4j.jfree.chart.util.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PaintMapTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.PaintMapTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.PaintMapTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPaint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.PaintMapTests("testGetPaint");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPut() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.PaintMapTests("testPut");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testKeysOfDifferentClasses() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.PaintMapTests("testKeysOfDifferentClasses");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.PaintMapTests("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.PaintMapTests("testSerialization1");
			testcase.run();
		}
	}

}