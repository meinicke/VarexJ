package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RenamePropertiesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPrototypePropertiesAsObjLitKeys1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypePropertiesAsObjLitKeys1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertiesAsObjLitKeys2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypePropertiesAsObjLitKeys2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQuotedPrototypeProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testQuotedPrototypeProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlappingOriginalAndGeneratedNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testOverlappingOriginalAndGeneratedNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddedToObject() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyAddedToObject();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddedToFunction() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyAddedToFunction();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOfObjectOfUnknownType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOfObjectOfUnknownType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetQuotedPropertyOfThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testSetQuotedPropertyOfThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternedPropertyName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testExternedPropertyName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExternedPropertyNameDefinedByObjectLiteral() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testExternedPropertyNameDefinedByObjectLiteral();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticAndInstanceMethodWithSameName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testStaticAndInstanceMethodWithSameName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypeProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypeProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertiesAsObjLitKeys3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypePropertiesAsObjLitKeys3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedQuotedAndUnquotedObjLitKeys1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testMixedQuotedAndUnquotedObjLitKeys1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedQuotedAndUnquotedObjLitKeys2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testMixedQuotedAndUnquotedObjLitKeys2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePropertiesWithLeadingUnderscores() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testRenamePropertiesWithLeadingUnderscores();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPropertyOfThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testSetPropertyOfThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReadPropertyOfThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testReadPropertyOfThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testObjectLiteralInLocalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testObjectLiteralInLocalScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIncorrectAttemptToAccessQuotedProperty() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testIncorrectAttemptToAccessQuotedProperty();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAvoidingConflictsBetweenQuotedAndUnquotedPropertyNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testAvoidingConflictsBetweenQuotedAndUnquotedPropertyNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSamePropertyNameQuotedAndUnquoted() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testSamePropertyNameQuotedAndUnquoted();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePropertiesFunctionCall1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testRenamePropertiesFunctionCall1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePropertiesFunctionCall2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testRenamePropertiesFunctionCall2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRenameFunctionStubs1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testRemoveRenameFunctionStubs1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemoveRenameFunctionStubs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testRemoveRenameFunctionStubs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGeneratePseudoNames() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testGeneratePseudoNames();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testModules() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testModules();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAffinity() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyAffinity();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAffinityOff() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyAffinityOff();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertiesStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypePropertiesStable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertiesAsObjLitKeysStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPrototypePropertiesAsObjLitKeysStable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMixedQuotedAndUnquotedObjLitKeysStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testMixedQuotedAndUnquotedObjLitKeysStable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOverlappingOriginalAndGeneratedNamesStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testOverlappingOriginalAndGeneratedNamesStable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStableWithTrickyExternsChanges() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testStableWithTrickyExternsChanges();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePropertiesWithLeadingUnderscoresStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testRenamePropertiesWithLeadingUnderscoresStable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyAddedToObjectStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyAddedToObjectStable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAvoidingConflictsBetQuotedAndUnquotedPropertyNamesStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testAvoidingConflictsBetQuotedAndUnquotedPropertyNamesStable();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamePropertiesFunctionCallStable() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.RenamePropertiesTest() {
				public void runTest() throws Exception {
					testRenamePropertiesFunctionCallStable();
				}
			};
			testcase.run();
		}
	}

}