package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RemoveUnusedNamesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testAnalyzeUnusedPrototypeProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedNamesTest() {
				public void runTest() throws Exception {
					testAnalyzeUnusedPrototypeProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnalyzeUnusedPrototypeProperties2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedNamesTest() {
				public void runTest() throws Exception {
					testAnalyzeUnusedPrototypeProperties2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedNamesTest() {
				public void runTest() throws Exception {
					testAliasing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnalyzeUnusedPrototypeProperties3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedNamesTest() {
				public void runTest() throws Exception {
					testAnalyzeUnusedPrototypeProperties3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedNamesTest() {
				public void runTest() throws Exception {
					testStatement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportedMethodsByNamingConvention() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedNamesTest() {
				public void runTest() throws Exception {
					testExportedMethodsByNamingConvention();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportedMethodsByNamingConventionAlwaysExported() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RemoveUnusedNamesTest() {
				public void runTest() throws Exception {
					testExportedMethodsByNamingConventionAlwaysExported();
				}
			};
			testcase.run();
		}
	}

}