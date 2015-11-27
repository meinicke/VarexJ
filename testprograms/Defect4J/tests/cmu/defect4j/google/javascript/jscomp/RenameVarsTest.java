package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RenameVarsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRenameGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameLocals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameLocals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameNested() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameNested();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameLocalsClashingWithGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameLocalsClashingWithGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameWithExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameWithExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDoNotRenameExportedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testDoNotRenameExportedName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithNameOverlap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameWithNameOverlap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithPrefix1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameWithPrefix1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithPrefix2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameWithPrefix2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameWithPrefix3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameWithPrefix3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenameRedeclaredGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRenameRedeclaredGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveFunctions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRecursiveFunctions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRecursiveFunctions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testRecursiveFunctions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBleedingRecursiveFunctions1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testBleedingRecursiveFunctions1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBleedingRecursiveFunctions2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testBleedingRecursiveFunctions2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBleedingRecursiveFunctions3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testBleedingRecursiveFunctions3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamingBasedOnOrderOfOccurrence() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testNamingBasedOnOrderOfOccurrence();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameWithPointlesslyAnonymousFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameWithPointlesslyAnonymousFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameLocalsClashingWithGlobals() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameLocalsClashingWithGlobals();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameNested() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameNested();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameWithExterns1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameWithExterns1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameWithExterns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameWithExterns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameWithNameOverlap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameWithNameOverlap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameWithAnonymousFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameWithAnonymousFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameSimpleExternsChanges() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameSimpleExternsChanges();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameSimpleLocalNameExterned() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameSimpleLocalNameExterned();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameSimpleGlobalNameExterned() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameSimpleGlobalNameExterned();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameWithPrefix1AndUnstableLocalNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameWithPrefix1AndUnstableLocalNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableRenameWithPrefix2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testStableRenameWithPrefix2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContrivedExampleWhereConsistentRenamingIsWorse() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testContrivedExampleWhereConsistentRenamingIsWorse();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportSimpleSymbolReservesName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testExportSimpleSymbolReservesName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportComplexSymbolReservesName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testExportComplexSymbolReservesName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportToNonStringDoesntExplode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testExportToNonStringDoesntExplode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDollarSignSuperExport1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testDollarSignSuperExport1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDollarSignSuperExport2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testDollarSignSuperExport2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPseudoNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenameVarsTest() {
				public void runTest() throws Exception {
					testPseudoNames();
				}
			};
			testcase.run();
		}
	}

}