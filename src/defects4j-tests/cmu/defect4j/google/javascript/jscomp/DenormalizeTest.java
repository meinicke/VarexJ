package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DenormalizeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testForIn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DenormalizeTest() {
				public void runTest() throws Exception {
					testForIn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DenormalizeTest() {
				public void runTest() throws Exception {
					testFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInOperatorNotInsideFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DenormalizeTest() {
				public void runTest() throws Exception {
					testInOperatorNotInsideFor();
				}
			};
			testcase.run();
		}
	}

}