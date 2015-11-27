package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FunctionArgumentInjectorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFindModifiedParameters1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFindModifiedParameters11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testFindModifiedParameters11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments20() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments20();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments21() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments21();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments22() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments22();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments23() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments23();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments24() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments24();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments25() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments25();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments26() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments26();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments27() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments27();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments28() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments28();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments29() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments29();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments30() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments30();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments31() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments31();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArguments32() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArguments32();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMaybeAddTempsForCallArgumentsInLoops() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.FunctionArgumentInjectorTest() {
				public void runTest() throws Exception {
					testMaybeAddTempsForCallArgumentsInLoops();
				}
			};
			testcase.run();
		}
	}

}