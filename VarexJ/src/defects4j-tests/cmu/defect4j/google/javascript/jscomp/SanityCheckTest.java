package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SanityCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUnnormalizeNodeTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SanityCheckTest() {
				public void runTest() throws Exception {
					testUnnormalizeNodeTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnnormalized() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SanityCheckTest() {
				public void runTest() throws Exception {
					testUnnormalized();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantAnnotationMismatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SanityCheckTest() {
				public void runTest() throws Exception {
					testConstantAnnotationMismatch();
				}
			};
			testcase.run();
		}
	}

}