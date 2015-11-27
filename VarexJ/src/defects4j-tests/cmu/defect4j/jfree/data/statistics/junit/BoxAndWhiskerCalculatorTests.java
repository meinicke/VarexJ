package cmu.defect4j.jfree.data.statistics.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class BoxAndWhiskerCalculatorTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCalculateQ1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.BoxAndWhiskerCalculatorTests("testCalculateQ1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateBoxAndWhiskerStatistics() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.BoxAndWhiskerCalculatorTests("testCalculateBoxAndWhiskerStatistics");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateQ3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.BoxAndWhiskerCalculatorTests("testCalculateQ3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1593149() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.BoxAndWhiskerCalculatorTests("test1593149");
			testcase.run();
		}
	}

}