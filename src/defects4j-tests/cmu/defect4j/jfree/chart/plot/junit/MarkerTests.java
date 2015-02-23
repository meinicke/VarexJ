package cmu.defect4j.jfree.chart.plot.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class MarkerTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetSetPaint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetPaint");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetOutlinePaint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetOutlinePaint");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetOutlineStroke() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetOutlineStroke");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetLabel() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetLabel");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetLabelFont() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetLabelFont");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetLabelPaint() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetLabelPaint");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetLabelAnchor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetLabelAnchor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetLabelOffset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetLabelOffset");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetLabelOffsetType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetLabelOffsetType");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetLabelTextAnchor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetLabelTextAnchor");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListenersWithCategoryPlot() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testListenersWithCategoryPlot");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testListenersWithXYPlot() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testListenersWithXYPlot");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetStroke() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetStroke");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSetAlpha() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.plot.junit.MarkerTests("testGetSetAlpha");
			testcase.run();
		}
	}

}