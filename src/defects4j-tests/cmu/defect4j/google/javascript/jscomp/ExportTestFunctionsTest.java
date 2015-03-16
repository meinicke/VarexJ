package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ExportTestFunctionsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFunctionsAreExported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExportTestFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionsAreExported();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBasicTestFunctionsAreExported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExportTestFunctionsTest() {
				public void runTest() throws Exception {
					testBasicTestFunctionsAreExported();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionExpressionsAreExported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExportTestFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionExpressionsAreExported();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionAssignmentsAreExported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExportTestFunctionsTest() {
				public void runTest() throws Exception {
					testFunctionAssignmentsAreExported();
				}
			};
			testcase.run();
		}
	}

}