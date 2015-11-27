package cmu.defect4j.jfree.data.statistics.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class HistogramDatasetTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeriesKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("testGetSeriesKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBins() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("testBins");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("testAddSeries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSeries2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("testAddSeries2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBinBoundaries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("testBinBoundaries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1553088() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.HistogramDatasetTests("test1553088");
			testcase.run();
		}
	}

}