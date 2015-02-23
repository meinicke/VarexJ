package cmu.defect4j.jfree.chart.renderer.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RendererUtilitiesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFindLiveItemsLowerBound_Unordered() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.junit.RendererUtilitiesTests("testFindLiveItemsLowerBound_Unordered");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindLiveItemsLowerBound_Ascending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.junit.RendererUtilitiesTests("testFindLiveItemsLowerBound_Ascending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindLiveItemsLowerBound_Descending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.junit.RendererUtilitiesTests("testFindLiveItemsLowerBound_Descending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindLiveItemsUpperBound_Unordered() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.junit.RendererUtilitiesTests("testFindLiveItemsUpperBound_Unordered");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindLiveItemsUpperBound_Ascending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.junit.RendererUtilitiesTests("testFindLiveItemsUpperBound_Ascending");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindLiveItemsUpperBound_Descending() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.junit.RendererUtilitiesTests("testFindLiveItemsUpperBound_Descending");
			testcase.run();
		}
	}

}