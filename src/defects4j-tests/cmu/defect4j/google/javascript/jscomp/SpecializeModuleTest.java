package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SpecializeModuleTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSpecializeInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testSpecializeInline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpecializeCascadedInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testSpecializeCascadedInline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpecializeInlineWithMultipleDependents() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testSpecializeInlineWithMultipleDependents();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpecializeInlineWithNamespaces() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testSpecializeInlineWithNamespaces();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpecializeInlineWithRegularFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testSpecializeInlineWithRegularFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontSpecializeLocalNonAnonymousFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testDontSpecializeLocalNonAnonymousFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAddDummyVarsForRemovedFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testAddDummyVarsForRemovedFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpecializeRemoveUnusedProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testSpecializeRemoveUnusedProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontSpecializeAliasedFunctions_inline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testDontSpecializeAliasedFunctions_inline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDontSpecializeAliasedFunctions_remove_unused_properties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testDontSpecializeAliasedFunctions_remove_unused_properties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpecializeDevirtualizePrototypeMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testSpecializeDevirtualizePrototypeMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpecializeDevirtualizePrototypeMethodsWithInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SpecializeModuleTest() {
				public void runTest() throws Exception {
					testSpecializeDevirtualizePrototypeMethodsWithInline();
				}
			};
			testcase.run();
		}
	}

}