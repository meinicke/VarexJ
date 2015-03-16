package cmu.defect4j.google.javascript.jscomp.parsing;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class IRFactoryTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testStrictScript() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testStrictScript();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayLiteral2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testArrayLiteral2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayLiteral4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testArrayLiteral4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLiteral2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLiteral3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLiteral4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLiteral5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLiteral6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLiteral7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLiteral8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLabel() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testLabel();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLabel2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testLabel2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLabel3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testLabel3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegation1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testNegation1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegation2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testNegation2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegation3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testNegation3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommentPositions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testCommentPositions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommentPositions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testCommentPositions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLiteralLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testLiteralLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSwitchLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testSwitchLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionParamLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testFunctionParamLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarDeclLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testVarDeclLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testReturnLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testLinenoFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBinaryExprLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testBinaryExprLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrefixLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testPrefixLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIfLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testIfLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testTryLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHookLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testHookLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLabelLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testLabelLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCompareLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testCompareLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqualityLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testEqualityLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPlusEqLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testPlusEqLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommaLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testCommaLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRegexpLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testRegexpLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNestedOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testNestedOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBitwiseOps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testBitwiseOps();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLitLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLitLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryWithoutCatchLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testTryWithoutCatchLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTryWithoutFinallyLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testTryWithoutFinallyLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultilineEqLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testMultilineEqLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultilineBitTestLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testMultilineBitTestLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testCallLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewLocation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testNewLocation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNewLocationMultiLine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testNewLocationMultiLine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLinenoDeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testLinenoDeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignmentValidation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testAssignmentValidation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testDelete1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testDelete2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testDelete3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDelete4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testDelete4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testGetter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetter() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testSetter();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.parsing.IRFactoryTest() {
				public void runTest() throws Exception {
					testObjectLiteral();
				}
			};
			testcase.run();
		}
	}

}