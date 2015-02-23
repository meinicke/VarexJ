package cmu.defect4j.jfree.data.time.ohlc.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class OHLCSeriesCollectionTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRemoveAllSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesCollectionTests("testRemoveAllSeries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesCollectionTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashcode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesCollectionTests("testHashcode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesCollectionTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesCollectionTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1170825() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesCollectionTests("test1170825");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesCollectionTests("testRemoveSeries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveSeries_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.ohlc.junit.OHLCSeriesCollectionTests("testRemoveSeries_int");
			testcase.run();
		}
	}

}