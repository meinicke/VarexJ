package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GatherRawExportsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testExportsFound1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound6() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound6();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound7() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound7();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound8() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound8();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound9() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound9();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound10() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound10();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound11() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound11();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound12() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound12();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound13() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound13();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound14() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound14();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound15() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound15();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportsFound16() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportsFound16();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportOnTopFound1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportOnTopFound1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExportOntopFound2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GatherRawExportsTest() {
				public void runTest() throws Exception {
					testExportOntopFound2();
				}
			};
			testcase.run();
		}
	}

}