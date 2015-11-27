package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class MarkNoSideEffectCallsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFunctionAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testFunctionAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testNamespaceAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testConstructorAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testMultipleDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignNoFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testAssignNoFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototype() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testPrototype();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceAnnotationInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testNamespaceAnnotationInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverrideDefinitionInSource() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testOverrideDefinitionInSource();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testApply1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testApply1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testApply2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testApply2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidAnnotation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testInvalidAnnotation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidAnnotation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testInvalidAnnotation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidAnnotation3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testInvalidAnnotation3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidAnnotation4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testInvalidAnnotation4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidAnnotation5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testInvalidAnnotation5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.MarkNoSideEffectCallsTest() {
				public void runTest() throws Exception {
					testCall2();
				}
			};
			testcase.run();
		}
	}

}