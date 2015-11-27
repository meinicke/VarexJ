package cmu.defect4j.jfree.chart.util.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RelativeDateFormatTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.RelativeDateFormatTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.RelativeDateFormatTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFormat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.RelativeDateFormatTests("testFormat");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test2033092() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.RelativeDateFormatTests("test2033092");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegative() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.RelativeDateFormatTests("testNegative");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.RelativeDateFormatTests("testHashCode");
			testcase.run();
		}
	}

}