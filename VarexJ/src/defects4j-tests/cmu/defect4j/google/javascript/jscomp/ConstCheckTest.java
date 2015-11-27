package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ConstCheckTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testConstantDefinition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantDefinition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantDefinition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantDefinition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantInitializedInAnonymousNamespace1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantInitializedInAnonymousNamespace1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantInitializedInAnonymousNamespace2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantInitializedInAnonymousNamespace2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectModified() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testObjectModified();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectPropertyInitializedLate() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testObjectPropertyInitializedLate();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectRedefined1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testObjectRedefined1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantRedefined1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantRedefined1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantRedefined2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantRedefined2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantRedefinedInLocalScope1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantRedefinedInLocalScope1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantRedefinedInLocalScope2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantRedefinedInLocalScope2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantRedefinedInLocalScopeOutOfOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantRedefinedInLocalScopeOutOfOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantPostIncremented1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantPostIncremented1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantPostIncremented2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantPostIncremented2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantPreIncremented1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantPreIncremented1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantPreIncremented2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantPreIncremented2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantPostDecremented1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantPostDecremented1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantPostDecremented2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantPostDecremented2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantPreDecremented1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantPreDecremented1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstantPreDecremented2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstantPreDecremented2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbbreviatedArithmeticAssignment1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testAbbreviatedArithmeticAssignment1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbbreviatedArithmeticAssignment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testAbbreviatedArithmeticAssignment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbbreviatedBitAssignment1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testAbbreviatedBitAssignment1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbbreviatedBitAssignment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testAbbreviatedBitAssignment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbbreviatedShiftAssignment1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testAbbreviatedShiftAssignment1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAbbreviatedShiftAssignment2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testAbbreviatedShiftAssignment2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstAnnotation() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstAnnotation();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstSuppression() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ConstCheckTest() {
				public void runTest() throws Exception {
					testConstSuppression();
				}
			};
			testcase.run();
		}
	}

}