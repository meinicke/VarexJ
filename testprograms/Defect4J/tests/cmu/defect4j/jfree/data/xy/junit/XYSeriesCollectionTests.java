package cmu.defect4j.jfree.data.xy.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class XYSeriesCollectionTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testConstructor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPublicCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testPublicCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testGetRangeBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testGetSeries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeriesByKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testGetSeriesByKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDomainBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testGetDomainBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1170825() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("test1170825");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testIndexOf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.xy.junit.XYSeriesCollectionTests("testRemoveSeries");
			testcase.run();
		}
	}

}