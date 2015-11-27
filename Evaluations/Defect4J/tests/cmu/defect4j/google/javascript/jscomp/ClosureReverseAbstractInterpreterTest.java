package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ClosureReverseAbstractInterpreterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGoogIsDef1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDef1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsDef2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDef2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsDef3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDef3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsDef4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDef4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsNull1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsNull1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsNull2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsNull2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsNull3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsNull3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsNull4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsNull4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsDefAndNotNull1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDefAndNotNull1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsDefAndNotNull2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDefAndNotNull2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsDefAndNotNull3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDefAndNotNull3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsDefAndNotNull4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDefAndNotNull4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsDefAndNotNull5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsDefAndNotNull5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsString1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsString1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsString2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsString2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsBoolean1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsBoolean1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsBoolean2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsBoolean2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsBoolean3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsBoolean3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsBoolean4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsBoolean4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsNumber() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsNumber();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsFunction2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsFunction2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsFunction3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsFunction3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsFunctionOnNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsFunctionOnNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsArray1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsArray1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsArray2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsArray2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsArray3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsArray3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsArray4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsArray4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsArrayOnNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsArrayOnNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsObjectOnNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsObjectOnNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsObject1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsObject1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsObject2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsObject2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsObject3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsObject3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogIsObject4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ClosureReverseAbstractInterpreterTest() {
				public void runTest() throws Exception {
					testGoogIsObject4();
				}
			};
			testcase.run();
		}
	}

}