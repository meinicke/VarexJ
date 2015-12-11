package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TimeSeriesCollectionTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindDomainBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("testFindDomainBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1170825() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("test1170825");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIndexOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("testIndexOf");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("testRemoveSeries");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveSeries_int() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("testRemoveSeries_int");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSurroundingItems() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimeSeriesCollectionTests("testGetSurroundingItems");
			testcase.run();
		}
	}

}