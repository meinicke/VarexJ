package cmu.defect4j.jfree.data.statistics.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RegressionTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testOLSRegression1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.RegressionTests("testOLSRegression1a");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOLSRegression1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.RegressionTests("testOLSRegression1b");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPowerRegression1a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.RegressionTests("testPowerRegression1a");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPowerRegression1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.RegressionTests("testPowerRegression1b");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOLSRegression2a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.RegressionTests("testOLSRegression2a");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOLSRegression2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.RegressionTests("testOLSRegression2b");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPowerRegression2a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.RegressionTests("testPowerRegression2a");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPowerRegression2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.RegressionTests("testPowerRegression2b");
			testcase.run();
		}
	}

}