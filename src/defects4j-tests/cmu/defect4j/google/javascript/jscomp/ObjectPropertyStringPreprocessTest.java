package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ObjectPropertyStringPreprocessTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFooBar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPreprocessTest() {
				public void runTest() throws Exception {
					testFooBar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifedNameExpectedError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPreprocessTest() {
				public void runTest() throws Exception {
					testQualifedNameExpectedError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringLiteralExpectedError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPreprocessTest() {
				public void runTest() throws Exception {
					testStringLiteralExpectedError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPreprocessTest() {
				public void runTest() throws Exception {
					testDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFooPrototypeBar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPreprocessTest() {
				public void runTest() throws Exception {
					testFooPrototypeBar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidNumArgumentsError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ObjectPropertyStringPreprocessTest() {
				public void runTest() throws Exception {
					testInvalidNumArgumentsError();
				}
			};
			testcase.run();
		}
	}

}