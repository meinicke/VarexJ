package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SymbolTableTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGlobalVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGlobalVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThisReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGlobalThisReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThisReferences2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGlobalThisReferences2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThisReferences3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGlobalThisReferences3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalThisPropertyReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGlobalThisPropertyReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalVarReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGlobalVarReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalVarReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testLocalVarReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalThisReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testLocalThisReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalThisReferences2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testLocalThisReferences2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalThisReferences3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testLocalThisReferences3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespacedReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testNamespacedReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncompleteNamespacedReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testIncompleteNamespacedReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalRichObjectReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGlobalRichObjectReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalOfNamespacedReferencesOfProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testRemovalOfNamespacedReferencesOfProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogScopeReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGoogScopeReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogRequireReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGoogRequireReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGoogRequireReferences2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGoogRequireReferences2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGlobalVarInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testGlobalVarInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalVarInExterns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testLocalVarInExterns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSymbolsForType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testSymbolsForType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticMethodReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testStaticMethodReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testMethodReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperClassMethodReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testSuperClassMethodReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodReferencesMissingTypeInfo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testMethodReferencesMissingTypeInfo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFieldReferencesMissingTypeInfo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testFieldReferencesMissingTypeInfo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFieldReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testFieldReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUndeclaredFieldReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testUndeclaredFieldReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testPrototypeReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeReferences2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testPrototypeReferences2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeReferences3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testPrototypeReferences3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeReferences4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testPrototypeReferences4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeReferences5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testPrototypeReferences5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencesInJSDocType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testReferencesInJSDocType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencesInJSDocType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testReferencesInJSDocType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReferencesInJSDocName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testReferencesInJSDocName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLocalQualifiedNamesInLocalScopes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testLocalQualifiedNamesInLocalScopes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNaturalSymbolOrdering() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testNaturalSymbolOrdering();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDeclarationDisagreement() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testDeclarationDisagreement();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMultipleExtends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testMultipleExtends();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocAssociationWithBadNamespace() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testJSDocAssociationWithBadNamespace();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMissingConstructorTag() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testMissingConstructorTag();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeCheckingOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testTypeCheckingOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSuperClassReference() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testSuperClassReference();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInnerEnum() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testInnerEnum();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInAnonObject1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testMethodInAnonObject1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMethodInAnonObject2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testMethodInAnonObject2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJSDocOnlySymbol() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testJSDocOnlySymbol();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNamespaceDefinitionOrder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testNamespaceDefinitionOrder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testConstructorAlias() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testConstructorAlias();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSymbolForScopeOfNatives() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SymbolTableTest() {
				public void runTest() throws Exception {
					testSymbolForScopeOfNatives();
				}
			};
			testcase.run();
		}
	}

}