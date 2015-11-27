package cmu.defect4j.jfree.chart.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JFreeChartTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSubtitles() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testGetSubtitles");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLegendEvents() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testLegendEvents");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTitleChangeEvent() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testTitleChangeEvent");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testEquals2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtitleCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testSubtitleCount");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetSubtitle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testGetSubtitle");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testSerialization1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testSerialization3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testSerialization4");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddSubtitle() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.junit.JFreeChartTests("testAddSubtitle");
			testcase.run();
		}
	}

}