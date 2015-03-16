package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class AmbiguatePropertiesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testOneVar1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testOneVar1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneVar2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testOneVar2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneVar3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testOneVar3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOneVar4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testOneVar4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoVar1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoVar1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoVar2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoVar2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoIndependentVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoIndependentVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTwoTypesTwoVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTwoTypesTwoVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testUnions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testExtends();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLotsOfVars() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testLotsOfVars();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLotsOfClasses() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testLotsOfClasses();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrototypePropertiesAsObjLitKeys1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOfObjectOfUnknownType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPropertyOnParamOfUnknownType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testPropertyOnParamOfUnknownType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetPropertyOfGlobalThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testSetPropertyOfGlobalThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testReadPropertyOfGlobalThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testReadPropertyOfGlobalThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSetQuotedPropertyOfThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
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
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testStaticAndInstanceMethodWithSameName();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticAndInstanceProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testStaticAndInstanceProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticAndSubInstanceProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testStaticAndSubInstanceProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testStaticWithFunctions() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testStaticWithFunctions();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testTypeMismatch() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testTypeMismatch();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRenamingMap() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testRenamingMap();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInline() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testInline();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplementsAndExtends() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testImplementsAndExtends();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testImplementsAndExtends2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testImplementsAndExtends2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testExtendsInterface() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testExtendsInterface();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionSubType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionSubType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionSubType2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testFunctionSubType2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPredeclaredType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AmbiguatePropertiesTest() {
				public void runTest() throws Exception {
					testPredeclaredType();
				}
			};
			testcase.run();
		}
	}

}