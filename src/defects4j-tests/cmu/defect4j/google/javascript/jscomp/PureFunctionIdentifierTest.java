package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PureFunctionIdentifierTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidAnnotation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInvalidAnnotation5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue303() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testIssue303();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue303b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testIssue303b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns_new10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns_new10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExterns5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExterns5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceAnnotationInExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testNamespaceAnnotationInExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceAnnotationInExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testNamespaceAnnotationInExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceAnnotationInExterns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testNamespaceAnnotationInExterns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceAnnotationInExterns4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testNamespaceAnnotationInExterns4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceAnnotationInExterns5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testNamespaceAnnotationInExterns5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceAnnotationInExterns6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testNamespaceAnnotationInExterns6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotationInExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorAnnotationInExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotationInExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorAnnotationInExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotationInExterns3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorAnnotationInExterns3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotationInExterns4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorAnnotationInExterns4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotationInExterns5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorAnnotationInExterns5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotationInExterns6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorAnnotationInExterns6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotationInExterns7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorAnnotationInExterns7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAnnotationInExterns8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorAnnotationInExterns8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSharedFunctionName1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testSharedFunctionName1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSharedFunctionName2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testSharedFunctionName2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExternStubs1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExternStubs1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExternStubs1b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExternStubs1b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExternStubs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExternStubs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExternStubs2b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExternStubs2b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExternStubs3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExternStubs3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExternStubs4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExternStubs4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnnotationInExternStubs5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnnotationInExternStubs5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSideEffectsSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testNoSideEffectsSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testResultLocalitySimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testResultLocalitySimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testExternCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testApply() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testApply();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInference1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInference1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInference2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInference2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInference3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInference3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInference4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInference4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInference5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInference5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInference6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInference6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalizedSideEffects11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testLocalizedSideEffects11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryOperators1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testUnaryOperators1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryOperators2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testUnaryOperators2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryOperators3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testUnaryOperators3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryOperators4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testUnaryOperators4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryOperators5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testUnaryOperators5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeleteOperator1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testDeleteOperator1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeleteOperator2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testDeleteOperator2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrOperator1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testOrOperator1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrOperator2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testOrOperator2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrOperator3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testOrOperator3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrOperators4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testOrOperators4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAndOperator1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAndOperator1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAndOperator2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAndOperator2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAndOperator3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAndOperator3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAndOperators4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAndOperators4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookOperator1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testHookOperator1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookOperator2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testHookOperator2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookOperator3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testHookOperator3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookOperators4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testHookOperators4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrow1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testThrow1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrow2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testThrow2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentOverride() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAssignmentOverride();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritance1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInheritance1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInheritance2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testInheritance2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallBeforeDefinition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCallBeforeDefinition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorThatModifiesThis1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorThatModifiesThis1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorThatModifiesThis2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorThatModifiesThis2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorThatModifiesThis3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorThatModifiesThis3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorThatModifiesThis4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorThatModifiesThis4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorThatModifiesGlobal1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorThatModifiesGlobal1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorThatModifiesGlobal2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testConstructorThatModifiesGlobal2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallFunctionThatModifiesThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCallFunctionThatModifiesThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallFunctionFOrG() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCallFunctionFOrG();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallFunctionFOrGViaHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCallFunctionFOrGViaHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallFunctionForGorH() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCallFunctionForGorH();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallFunctionFOrGWithSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCallFunctionFOrGWithSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallFunctionFOrGViaHookWithSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCallFunctionFOrGViaHookWithSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallRegExpWithSideEffects() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testCallRegExpWithSideEffects();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousFunction1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnonymousFunction1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnonymousFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnonymousFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnonymousFunction4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PureFunctionIdentifierTest() {
				public void runTest() throws Exception {
					testAnonymousFunction4();
				}
			};
			testcase.run();
		}
	}

}