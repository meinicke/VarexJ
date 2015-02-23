package cmu.defect4j.jfree.data.xy.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultIntervalXYDatasetTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetSeriesCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetSeriesCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPublicCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testPublicCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetItemCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetItemCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeriesKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetSeriesKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testCloning2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testAddSeries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testIndexOf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetXValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetXValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetYValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetYValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStartXValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetStartXValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEndXValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetEndXValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStartYValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetStartYValue");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetEndYValue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.DefaultIntervalXYDatasetTests("testGetEndYValue");
			testcase.run();
		}
	}

}