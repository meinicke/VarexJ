package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JSModuleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testDependencies() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleTest() {
				public void runTest() throws Exception {
					testDependencies();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortInputs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleTest() {
				public void runTest() throws Exception {
					testSortInputs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSortJsModules() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.JSModuleTest() {
				public void runTest() throws Exception {
					testSortJsModules();
				}
			};
			testcase.run();
		}
	}

}