package cmu.defect4j.jfree.chart.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PieChart3DTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testReplaceDatasetOnPieChart() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.PieChart3DTests("testReplaceDatasetOnPieChart");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullValueInDataset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.PieChart3DTests("testNullValueInDataset");
			testcase.run();
		}
	}

}