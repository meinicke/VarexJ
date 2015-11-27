package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CheckProvidesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIrrelevant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testIrrelevant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHarmlessProcedural() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testHarmlessProcedural();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHarmless() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testHarmless();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoProvideInnerClass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testNoProvideInnerClass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingGoogProvide() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testMissingGoogProvide();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingGoogProvideWithNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testMissingGoogProvideWithNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogProvideInWrongFileShouldCreateWarning() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testGoogProvideInWrongFileShouldCreateWarning();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogProvideMissingConstructorIsOkForNow() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testGoogProvideMissingConstructorIsOkForNow();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnorePrivateConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testIgnorePrivateConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIgnorePrivatelyAnnotatedConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CheckProvidesTest() {
				public void runTest() throws Exception {
					testIgnorePrivatelyAnnotatedConstructor();
				}
			};
			testcase.run();
		}
	}

}