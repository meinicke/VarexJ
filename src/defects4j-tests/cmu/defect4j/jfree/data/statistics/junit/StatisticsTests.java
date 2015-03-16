package cmu.defect4j.jfree.data.statistics.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class StatisticsTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCalculateMean_Array() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMean_Array");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateMedian() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMedian");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateMean_Collection() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMean_Collection");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateMedian1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMedian1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateMedian2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMedian2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateMedian3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMedian3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateMedian4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMedian4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateMedian5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMedian5");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCalculateMedian6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCalculateMedian6");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrelation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCorrelation1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCorrelation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testCorrelation2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetStdDev() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.statistics.junit.StatisticsTests("testGetStdDev");
			testcase.run();
		}
	}

}