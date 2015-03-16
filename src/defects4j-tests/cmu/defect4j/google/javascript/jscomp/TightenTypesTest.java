package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TightenTypesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternSubTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testExternSubTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testGetProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubclass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testSubclass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testAnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testHook() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testHook();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElem3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testGetElem3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTopLevelVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testTopLevelVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedVariables() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testNamespacedVariables();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReturnSlot() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testReturnSlot();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testParameterSlots() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testParameterSlots();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAliasedFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testAliasedFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCatchStatement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testCatchStatement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorParameterSlots() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testConstructorParameterSlots();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallSlot() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testCallSlot();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteralTraversal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testObjectLiteralTraversal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAssign() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testAssign();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testComma() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testComma();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testOr();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testFunctionLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNameLookup() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testNameLookup();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetPrototypeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testGetPrototypeProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetElem() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testGetElem();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopeDiscovery() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testScopeDiscovery();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSheqDiscovery() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testSheqDiscovery();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testArrayAssignments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testArrayAssignments();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAllPropertyReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testAllPropertyReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testCallFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallFunctionWithArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testCallFunctionWithArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallPrototypeFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testCallPrototypeFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCallPrototypeFunctionWithArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testCallPrototypeFunctionWithArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetTimeout() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testSetTimeout();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testExternType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternSubTypesForObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testExternSubTypesForObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitPropCall() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testImplicitPropCall();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitPropCallWithArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testImplicitPropCallWithArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUntypedImplicitCallFromProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testUntypedImplicitCallFromProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitCallFromProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testImplicitCallFromProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitCallFromPropertyOfUnion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testImplicitCallFromPropertyOfUnion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplicitCallFromPropertyOfAllType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testImplicitCallFromPropertyOfAllType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRestrictToCast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testRestrictToCast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRestrictToInterfaceCast() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testRestrictToInterfaceCast();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRestrictToCastWithNonInstantiatedTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testRestrictToCastWithNonInstantiatedTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.TightenTypesTest() {
				public void runTest() throws Exception {
					testFunctionToString();
				}
			};
			testcase.run();
		}
	}

}