package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ExpressionDecomposerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCanExposeExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testCanExposeExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanExposeExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testCanExposeExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanExposeExpression3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testCanExposeExpression3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanExposeExpression4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testCanExposeExpression4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanExposeExpression5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testCanExposeExpression5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanExposeExpression6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testCanExposeExpression6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanExposeExpression7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testCanExposeExpression7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCanExposeExpression8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testCanExposeExpression8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveExpression10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testMoveExpression10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeExpression11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeExpression11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposePlusEquals1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposePlusEquals1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposePlusEquals2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposePlusEquals2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposePlusEquals3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposePlusEquals3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposePlusEquals4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposePlusEquals4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposePlusEquals5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposePlusEquals5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeObjectLit1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpressionDecomposerTest() {
				public void runTest() throws Exception {
					testExposeObjectLit1();
				}
			};
			testcase.run();
		}
	}

}