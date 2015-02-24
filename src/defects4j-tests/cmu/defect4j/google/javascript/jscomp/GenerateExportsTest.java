package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GenerateExportsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testExportSymbol() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testExportSymbol();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testExportEnum();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSymbolAndConstantProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testExportSymbolAndConstantProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportVars() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testExportVars();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoExport() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testNoExport();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedVarAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testNestedVarAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testNestedAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSymbolAndProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testExportSymbolAndProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNonGlobalScopeExport() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testNonGlobalScopeExport();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testExportClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSubclass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GenerateExportsTest() {
				public void runTest() throws Exception {
					testExportSubclass();
				}
			};
			testcase.run();
		}
	}

}