package cmu.defect4j.jfree.chart.plot.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PiePlotTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLegendItems() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testGetLegendItems");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_URLGenerator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testCloning_URLGenerator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_LegendItemShape() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testCloning_LegendItemShape");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_LegendLabelGenerator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testCloning_LegendLabelGenerator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_LegendLabelToolTipGenerator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testCloning_LegendLabelToolTipGenerator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning_LegendLabelURLGenerator() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testCloning_LegendLabelURLGenerator");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetBaseSectionPaint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testGetBaseSectionPaint");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullLegendLabels() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.PiePlotTests("testDrawWithNullLegendLabels");
			testcase.run();
		}
	}

}