package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ReplaceStringsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testStable1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testStable1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStable2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testStable2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testThrowError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowError2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testThrowError2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowError3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testThrowError3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowError4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testThrowError4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowNonStringError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testThrowNonStringError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowConstStringError() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testThrowConstStringError();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowNewError1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testThrowNewError1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testThrowNewError2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testThrowNewError2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStartTracer1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testStartTracer1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStartTracer2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testStartTracer2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStartTracer3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testStartTracer3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStartTracer4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testStartTracer4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerInitialization() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerInitialization();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerOnObject1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerOnObject1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerOnObject2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerOnObject2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerOnObject3a() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerOnObject3a();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerOnObject3b() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerOnObject3b();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerOnObject4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerOnObject4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerOnObject5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerOnObject5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerOnVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerOnVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLoggerOnThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testLoggerOnThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRepeatedErrorString1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testRepeatedErrorString1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRepeatedErrorString2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testRepeatedErrorString2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRepeatedErrorString3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testRepeatedErrorString3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRepeatedTracerString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testRepeatedTracerString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRepeatedLoggerString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testRepeatedLoggerString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRepeatedStringsWithDifferentMethods() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testRepeatedStringsWithDifferentMethods();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReserved() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReplaceStringsTest() {
				public void runTest() throws Exception {
					testReserved();
				}
			};
			testcase.run();
		}
	}

}