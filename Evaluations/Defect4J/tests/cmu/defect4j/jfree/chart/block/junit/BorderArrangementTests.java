package cmu.defect4j.jfree.chart.block.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class BorderArrangementTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.BorderArrangementTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.BorderArrangementTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.BorderArrangementTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSizingWithWidthConstraint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.BorderArrangementTests("testSizingWithWidthConstraint");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBugX() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.BorderArrangementTests("testBugX");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSizing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.block.junit.BorderArrangementTests("testSizing");
			testcase.run();
		}
	}

}