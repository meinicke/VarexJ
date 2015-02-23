package cmu.defect4j.jfree.chart.renderer.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class AreaRendererEndTypeTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEquals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.junit.AreaRendererEndTypeTests("testEquals");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.chart.renderer.junit.AreaRendererEndTypeTests("testSerialization");
			testcase.run();
		}
	}

}