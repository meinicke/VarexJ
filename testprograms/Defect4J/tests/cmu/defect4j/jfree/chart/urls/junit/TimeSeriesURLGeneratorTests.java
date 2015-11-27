package cmu.defect4j.jfree.chart.urls.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TimeSeriesURLGeneratorTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.urls.junit.TimeSeriesURLGeneratorTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPublicCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.urls.junit.TimeSeriesURLGeneratorTests("testPublicCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.urls.junit.TimeSeriesURLGeneratorTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGenerateURL() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.urls.junit.TimeSeriesURLGeneratorTests("testGenerateURL");
			testcase.run();
		}
	}

}