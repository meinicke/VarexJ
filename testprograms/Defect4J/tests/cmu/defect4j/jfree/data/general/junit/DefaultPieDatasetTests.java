package cmu.defect4j.jfree.data.general.junit;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultPieDatasetTests extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,${jpf-core}/lib/jfreechart-1.2.0-ea1.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCloning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DefaultPieDatasetTests("testCloning");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSerialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DefaultPieDatasetTests("testSerialization");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DefaultPieDatasetTests("testGetKey");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIndex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DefaultPieDatasetTests("testGetIndex");
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testClear() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new org.jfree.data.general.junit.DefaultPieDatasetTests("testClear");
			testcase.run();
		}
	}

}