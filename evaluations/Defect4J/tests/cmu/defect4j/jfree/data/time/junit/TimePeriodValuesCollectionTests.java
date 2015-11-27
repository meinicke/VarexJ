package cmu.defect4j.jfree.data.time.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TimePeriodValuesCollectionTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesCollectionTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesCollectionTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void test1161340() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesCollectionTests("test1161340");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDomainBoundsWithoutInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesCollectionTests("testGetDomainBoundsWithoutInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDomainBoundsWithInterval() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesCollectionTests("testGetDomainBoundsWithInterval");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSeries() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.time.junit.TimePeriodValuesCollectionTests("testGetSeries");
			testcase.run();
		}
	}

}