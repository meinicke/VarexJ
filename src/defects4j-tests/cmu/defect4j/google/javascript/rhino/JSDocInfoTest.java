package cmu.defect4j.google.javascript.rhino;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class JSDocInfoTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testVisibilityOrdinal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testVisibilityOrdinal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTypeAndVisibility() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetTypeAndVisibility();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetReturnType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetReturnType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetReturnTypeAndBaseType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetReturnTypeAndBaseType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetEnumParameterType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetEnumParameterType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleSetType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testMultipleSetType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleSetType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testMultipleSetType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleSetType3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testMultipleSetType3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTypedefType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetTypedefType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetConstant() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetConstant();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetConstructor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetConstructor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDefine() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetDefine();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetHidden() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetHidden();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetShouldPreserveTry() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetShouldPreserveTry();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetNoTypeCheck() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetNoTypeCheck();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetOverride() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetOverride();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetExport() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetExport();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetNoAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetNoAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetDeprecated() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetDeprecated();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleSetFlags1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testMultipleSetFlags1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetFileOverviewWithDocumentationOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetFileOverviewWithDocumentationOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetFileOverviewWithDocumentationOn() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetFileOverviewWithDocumentationOn();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetSuppressions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetSuppressions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetModifies() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.JSDocInfoTest() {
				public void runTest() throws Exception {
					testSetModifies();
				}
			};
			testcase.run();
		}
	}

}