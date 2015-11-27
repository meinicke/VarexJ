package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NormalizeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testWhile() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testWhile();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSplitVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testSplitVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDuplicateVarInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testDuplicateVarInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnhandled() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testUnhandled();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForIn1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testForIn1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testForIn2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testForIn2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveFunctions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testMoveFunctions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMoveFunctions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testMoveFunctions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizeFunctionDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testNormalizeFunctionDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMakeLocalNamesUnique() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testMakeLocalNamesUnique();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDuplicateVarDeclarations1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testRemoveDuplicateVarDeclarations1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDuplicateVarDeclarations2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testRemoveDuplicateVarDeclarations2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveDuplicateVarDeclarations3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testRemoveDuplicateVarDeclarations3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamingConstants() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testRenamingConstants();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSkipRenamingExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testSkipRenamingExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue166a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testIssue166a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue166b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testIssue166b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue166c() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testIssue166c();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue166d() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testIssue166d();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue166e() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testIssue166e();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue166f() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testIssue166f();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testIssue();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNormalizeSyntheticCode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testNormalizeSyntheticCode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testIsConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyIsConstant1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testPropertyIsConstant1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyIsConstant2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testPropertyIsConstant2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetterPropertyIsConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testGetterPropertyIsConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetterPropertyIsConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testSetterPropertyIsConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testExposeSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExposeComplex() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testExposeComplex();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamingConstantProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.NormalizeTest() {
				public void runTest() throws Exception {
					testRenamingConstantProperties();
				}
			};
			testcase.run();
		}
	}

}