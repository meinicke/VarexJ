package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckSideEffectsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUselessCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSideEffectsTest() {
				public void runTest() throws Exception {
					testUselessCode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUselessCodeInFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSideEffectsTest() {
				public void runTest() throws Exception {
					testUselessCodeInFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAnnotations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSideEffectsTest() {
				public void runTest() throws Exception {
					testTypeAnnotations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocComments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSideEffectsTest() {
				public void runTest() throws Exception {
					testJSDocComments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue80() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSideEffectsTest() {
				public void runTest() throws Exception {
					testIssue80();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsue504() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckSideEffectsTest() {
				public void runTest() throws Exception {
					testIsue504();
				}
			};
			testcase.run();
		}
	}

}