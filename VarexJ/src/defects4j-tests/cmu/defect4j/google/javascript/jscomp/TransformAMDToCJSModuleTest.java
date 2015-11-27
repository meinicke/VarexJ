package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TransformAMDToCJSModuleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDefine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TransformAMDToCJSModuleTest() {
				public void runTest() throws Exception {
					testDefine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDefineOnlyFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TransformAMDToCJSModuleTest() {
				public void runTest() throws Exception {
					testDefineOnlyFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlugins() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TransformAMDToCJSModuleTest() {
				public void runTest() throws Exception {
					testPlugins();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnsupportedForms() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TransformAMDToCJSModuleTest() {
				public void runTest() throws Exception {
					testUnsupportedForms();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalDefine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TransformAMDToCJSModuleTest() {
				public void runTest() throws Exception {
					testLocalDefine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarRenaming() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TransformAMDToCJSModuleTest() {
				public void runTest() throws Exception {
					testVarRenaming();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TransformAMDToCJSModuleTest() {
				public void runTest() throws Exception {
					testObjectLit();
				}
			};
			testcase.run();
		}
	}

}