package cmu.defect4j.jfree.chart.util.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SerialUtilitiesTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIsSerializable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testIsSerializable");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testColorSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testColorSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testColorUIResourceSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testColorUIResourceSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGradientPaintSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testGradientPaintSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTexturePaintSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testTexturePaintSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLine2DFloatSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testLine2DFloatSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLine2DDoubleSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testLine2DDoubleSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRectangle2DFloatSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testRectangle2DFloatSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRectangle2DDoubleSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testRectangle2DDoubleSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArc2DFloatSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testArc2DFloatSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArc2DDoubleSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testArc2DDoubleSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGeneralPathSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testGeneralPathSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAttributedStringSerialization1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testAttributedStringSerialization1");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAttributedStringSerialization2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testAttributedStringSerialization2");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAttributedStringSerialization3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.util.junit.SerialUtilitiesTests("testAttributedStringSerialization3");
			testcase.run();
		}
	}

}