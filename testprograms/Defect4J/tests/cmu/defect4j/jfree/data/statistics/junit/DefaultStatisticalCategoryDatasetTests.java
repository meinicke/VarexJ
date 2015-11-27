package cmu.defect4j.jfree.data.statistics.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultStatisticalCategoryDatasetTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testAdd");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testGetRangeBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemove() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testRemove");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeLowerBound() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testGetRangeLowerBound");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeUpperBound() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testGetRangeUpperBound");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRangeBounds2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testGetRangeBounds2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.DefaultStatisticalCategoryDatasetTests("testSerialization1");
			testcase.run();
		}
	}

}