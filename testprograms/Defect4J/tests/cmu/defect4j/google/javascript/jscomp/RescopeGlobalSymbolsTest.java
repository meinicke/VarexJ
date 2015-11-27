package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RescopeGlobalSymbolsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testVarDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RescopeGlobalSymbolsTest() {
				public void runTest() throws Exception {
					testVarDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionStatements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RescopeGlobalSymbolsTest() {
				public void runTest() throws Exception {
					testFunctionStatements();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeeperScopes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RescopeGlobalSymbolsTest() {
				public void runTest() throws Exception {
					testDeeperScopes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShadow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RescopeGlobalSymbolsTest() {
				public void runTest() throws Exception {
					testShadow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryCatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RescopeGlobalSymbolsTest() {
				public void runTest() throws Exception {
					testTryCatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RescopeGlobalSymbolsTest() {
				public void runTest() throws Exception {
					testExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RescopeGlobalSymbolsTest() {
				public void runTest() throws Exception {
					testForLoops();
				}
			};
			testcase.run();
		}
	}

}