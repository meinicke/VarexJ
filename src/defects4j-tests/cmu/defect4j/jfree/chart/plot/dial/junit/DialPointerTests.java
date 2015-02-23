package cmu.defect4j.jfree.chart.plot.dial.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DialPointerTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPointerTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPointerTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPointerTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPointerTests("testHashCode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPointerTests("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsPin() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPointerTests("testEqualsPin");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualsPointer() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.dial.junit.DialPointerTests("testEqualsPointer");
			testcase.run();
		}
	}

}