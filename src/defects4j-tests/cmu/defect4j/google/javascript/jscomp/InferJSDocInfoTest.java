package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class InferJSDocInfoTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testStructuralFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InferJSDocInfoTest() {
				public void runTest() throws Exception {
					testStructuralFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNativeCtor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InferJSDocInfoTest() {
				public void runTest() throws Exception {
					testNativeCtor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InferJSDocInfoTest() {
				public void runTest() throws Exception {
					testInstanceObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedCtor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InferJSDocInfoTest() {
				public void runTest() throws Exception {
					testNamespacedCtor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbstractMethod() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InferJSDocInfoTest() {
				public void runTest() throws Exception {
					testAbstractMethod();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.InferJSDocInfoTest() {
				public void runTest() throws Exception {
					testInterface();
				}
			};
			testcase.run();
		}
	}

}