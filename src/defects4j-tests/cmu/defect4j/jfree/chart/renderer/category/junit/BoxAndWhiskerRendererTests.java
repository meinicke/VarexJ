package cmu.defect4j.jfree.chart.renderer.category.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class BoxAndWhiskerRendererTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetLegendItem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testGetLegendItem");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1572478Vertical() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testBug1572478Vertical");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetLegendItemSeriesIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testGetLegendItemSeriesIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullMean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullMean");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBug1572478Horizontal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testBug1572478Horizontal");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullMedian() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullMedian");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullQ1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullQ1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullQ3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullQ3");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullMinRegular() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullMinRegular");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullMaxRegular() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullMaxRegular");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullMinOutlier() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullMinOutlier");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullMaxOutlier() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullMaxOutlier");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHashcode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testHashcode");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPublicCloneable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testPublicCloneable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDrawWithNullInfo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.category.junit.BoxAndWhiskerRendererTests("testDrawWithNullInfo");
			testcase.run();
		}
	}

}