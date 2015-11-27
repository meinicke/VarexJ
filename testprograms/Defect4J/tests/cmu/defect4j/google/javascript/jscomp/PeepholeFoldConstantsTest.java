package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class PeepholeFoldConstantsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUndefinedComparison1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testUndefinedComparison1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndefinedComparison2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testUndefinedComparison2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndefinedComparison3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testUndefinedComparison3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndefinedComparison4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testUndefinedComparison4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNullComparison1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testNullComparison1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryOps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testUnaryOps();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnaryOpsStringCompare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testUnaryOpsStringCompare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLogicalOp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldLogicalOp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBitwiseOp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldBitwiseOp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBitwiseOp2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldBitwiseOp2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldingMixTypesLate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldingMixTypesLate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldingMixTypesEarly() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldingMixTypesEarly();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldingAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldingAdd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBitwiseOpStringCompare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldBitwiseOpStringCompare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBitShifts() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldBitShifts();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBitShiftsStringCompare() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldBitShiftsStringCompare();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStringAdd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testStringAdd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue821() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testIssue821();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldArithmetic() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldArithmetic();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldArithmetic2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldArithmetic2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldArithmetic3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldArithmetic3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldArithmeticInfinity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldArithmeticInfinity();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldArithmeticStringComp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldArithmeticStringComp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldComparison() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldComparison();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldComparison2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldComparison2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldComparison3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldComparison3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldGetElem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldGetElem();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldComplex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldComplex();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLeft() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldLeft();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldArrayLength() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldArrayLength();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldStringLength() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldStringLength();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldTypeof() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldTypeof();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldInstanceOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldInstanceOf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDivision() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testDivision();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignOpsLate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testAssignOpsLate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignOpsEarly() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testAssignOpsEarly();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldAdd1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldAdd1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLiteralNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldLiteralNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLiteralsTypeMismatches() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldLiteralsTypeMismatches();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLeftChildConcat() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldLeftChildConcat();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLeftChildOp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldLeftChildOp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldSimpleArithmeticOp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldSimpleArithmeticOp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldLiteralsAsNumbers() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldLiteralsAsNumbers();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNotFoldBackToTrueFalse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testNotFoldBackToTrueFalse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldBangConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldBangConstants();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldMixed() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldMixed();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldVoid() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldVoid();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldObjectLiteralRef1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldObjectLiteralRef1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFoldObjectLiteralRef2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testFoldObjectLiteralRef2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIEString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testIEString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue522() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testIssue522();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvertibleOperators() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testInvertibleOperators();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCommutativeOperators() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testCommutativeOperators();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConvertToNumberNegativeInf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testConvertToNumberNegativeInf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testArrayLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue601() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testIssue601();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.PeepholeFoldConstantsTest() {
				public void runTest() throws Exception {
					testObjectLiteral();
				}
			};
			testcase.run();
		}
	}

}