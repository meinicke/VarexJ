package cmu.defect4j.jfree.data.xy.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class MatrixSeriesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.MatrixSeriesTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.MatrixSeriesTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.MatrixSeriesTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetItemColumn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.MatrixSeriesTests("testGetItemColumn");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetItemRow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.MatrixSeriesTests("testGetItemRow");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetItem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.MatrixSeriesTests("testGetItem");
			testcase.run();
		}
	}

}