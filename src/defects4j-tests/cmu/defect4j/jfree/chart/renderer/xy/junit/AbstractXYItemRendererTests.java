package cmu.defect4j.jfree.chart.renderer.xy.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class AbstractXYItemRendererTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFindRangeBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.xy.junit.AbstractXYItemRendererTests("testFindRangeBounds");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_LegendItemToolTipGenerator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.xy.junit.AbstractXYItemRendererTests("testCloning_LegendItemToolTipGenerator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_LegendItemURLGenerator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.xy.junit.AbstractXYItemRendererTests("testCloning_LegendItemURLGenerator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_LegendItemLabelGenerator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.xy.junit.AbstractXYItemRendererTests("testCloning_LegendItemLabelGenerator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.xy.junit.AbstractXYItemRendererTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindDomainBounds() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.xy.junit.AbstractXYItemRendererTests("testFindDomainBounds");
			testcase.run();
		}
	}

}