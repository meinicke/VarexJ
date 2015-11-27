package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DefaultCodingConventionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testVarAndOptionalParams() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testVarAndOptionalParams();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testExportedName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrivateName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testPrivateName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInlineName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInlineName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEnumKey() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testEnumKey();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetection10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetection10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritanceDetectionPostCollapseProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testInheritanceDetectionPostCollapseProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionBind() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DefaultCodingConventionTest() {
				public void runTest() throws Exception {
					testFunctionBind();
				}
			};
			testcase.run();
		}
	}

}