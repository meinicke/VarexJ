package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JSTypeRegistryTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGetBuiltInType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testGetBuiltInType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDeclaredType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testGetDeclaredType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetDeclaredTypeInNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testGetDeclaredTypeInNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOnManyTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testPropertyOnManyTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeAsNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testTypeAsNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGenerationIncrementing1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testGenerationIncrementing1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGenerationIncrementing2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testGenerationIncrementing2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeResolutionModes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testTypeResolutionModes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForceResolve() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testForceResolve();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAllTypeResolvesImmediately() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.JSTypeRegistryTest() {
				public void runTest() throws Exception {
					testAllTypeResolvesImmediately();
				}
			};
			testcase.run();
		}
	}

}