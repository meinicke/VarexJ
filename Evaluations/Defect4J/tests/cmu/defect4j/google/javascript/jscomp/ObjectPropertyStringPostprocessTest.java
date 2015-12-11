package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ObjectPropertyStringPostprocessTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFooDotBar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPostprocessTest() {
				public void runTest() throws Exception {
					testFooDotBar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFooGetElemBar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPostprocessTest() {
				public void runTest() throws Exception {
					testFooGetElemBar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFooBar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPostprocessTest() {
				public void runTest() throws Exception {
					testFooBar();
				}
			};
			testcase.run();
		}
	}

}