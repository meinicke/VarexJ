package cmu.defect4j.google.javascript.rhino;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NodeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testMergeExtractNormal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testMergeExtractNormal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergeExtractErroneous() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testMergeExtractErroneous();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testMergeOverflowGraciously() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testMergeOverflowGraciously();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsImplSame() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsImplSame();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsImplDifferentType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsImplDifferentType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsImplDifferentChildCount() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsImplDifferentChildCount();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsImplDifferentChild() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsImplDifferentChild();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsSame() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsSame();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsStringDifferent() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsStringDifferent();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsBooleanSame() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsBooleanSame();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsBooleanDifferent() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsBooleanDifferent();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsSlashVDifferent() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsSlashVDifferent();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeEqualsImplDifferentIncProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeEqualsImplDifferentIncProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeTypeAwareEqualsSame() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeTypeAwareEqualsSame();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeTypeAwareEqualsSameNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeTypeAwareEqualsSameNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeTypeAwareEqualsDifferent() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeTypeAwareEqualsDifferent();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCheckTreeTypeAwareEqualsDifferentNull() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCheckTreeTypeAwareEqualsDifferentNull();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarArgs1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testVarArgs1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarArgs2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testVarArgs2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testVarArgs3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testVarArgs3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFileLevelJSDocAppender() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testFileLevelJSDocAppender();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloneAnnontations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCloneAnnontations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSharedProps1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testSharedProps1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSharedProps2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testSharedProps2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSharedProps3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testSharedProps3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testBooleanProp() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testBooleanProp();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCloneAnnontations2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCloneAnnontations2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetIndexOfChild() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testGetIndexOfChild();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCopyInformationFrom() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testCopyInformationFrom();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseSourceInfoIfMissingFrom() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testUseSourceInfoIfMissingFrom();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUseSourceInfoFrom() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testUseSourceInfoFrom();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testInvalidSourceOffset() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testInvalidSourceOffset();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testQualifiedName() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.NodeTest() {
				public void runTest() throws Exception {
					testQualifiedName();
				}
			};
			testcase.run();
		}
	}

}