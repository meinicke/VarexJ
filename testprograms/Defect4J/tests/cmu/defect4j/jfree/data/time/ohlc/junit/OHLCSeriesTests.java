package cmu.defect4j.jfree.data.time.ohlc.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class OHLCSeriesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAdditionOfDuplicatePeriod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testAdditionOfDuplicatePeriod");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMaximumItemCount2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testSetMaximumItemCount2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemove() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testRemove");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetMaximumItemCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testSetMaximumItemCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testClear");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesTests("testIndexOf");
			testcase.run();
		}
	}

}