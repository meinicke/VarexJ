package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RenameLabelsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRenameInFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLabelsTest() {
				public void runTest() throws Exception {
					testRenameInFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLabelsTest() {
				public void runTest() throws Exception {
					testRenameGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameReused() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameLabelsTest() {
				public void runTest() throws Exception {
					testRenameReused();
				}
			};
			testcase.run();
		}
	}

}