package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SemanticReverseAbstractInterpreterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testInstanceOf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testInstanceOf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNameCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testNameCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNegatedNameCondition() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testNegatedNameCondition();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssignCondition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testAssignCondition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSheqCondition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testSheqCondition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSheqCondition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testSheqCondition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSheqCondition3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testSheqCondition3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSheqCondition4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testSheqCondition4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSheqCondition5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testSheqCondition5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSheqCondition6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testSheqCondition6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShneCondition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testShneCondition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShneCondition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testShneCondition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShneCondition3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testShneCondition3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShneCondition4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testShneCondition4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShneCondition5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testShneCondition5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShneCondition6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testShneCondition6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqCondition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testEqCondition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqCondition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testEqCondition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqCondition3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testEqCondition3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testEqCondition4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testEqCondition4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInequalitiesCondition1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testInequalitiesCondition1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInequalitiesCondition2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testInequalitiesCondition2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInequalitiesCondition3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testInequalitiesCondition3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testAnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeof1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testTypeof1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeof2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testTypeof2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeof3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testTypeof3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeof4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testTypeof4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testInstanceOf2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testInstanceOf3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInstanceOf4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SemanticReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testInstanceOf4();
				}
			};
			testcase.run();
		}
	}

}