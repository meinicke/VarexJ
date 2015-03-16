package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class UnionTypeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testGreatestSubtypeUnionTypes1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testGreatestSubtypeUnionTypes1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGreatestSubtypeUnionTypes2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testGreatestSubtypeUnionTypes2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGreatestSubtypeUnionTypes3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testGreatestSubtypeUnionTypes3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGreatestSubtypeUnionTypes4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testGreatestSubtypeUnionTypes4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGreatestSubtypeUnionTypes5() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testGreatestSubtypeUnionTypes5();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypingUnionTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testSubtypingUnionTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSpecialUnionCanAssignTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testSpecialUnionCanAssignTo();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCreateUnionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testCreateUnionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionWithUnknown() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testUnionWithUnknown();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRestrictedUnion1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testGetRestrictedUnion1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGetRestrictedUnion2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testGetRestrictedUnion2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testProxyUnionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testProxyUnionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseUnion1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testCollapseUnion1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseUnion2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testCollapseUnion2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseUnion3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testCollapseUnion3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseUnion4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testCollapseUnion4();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testCollapseProxyUnion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testCollapseProxyUnion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testShallowEquality() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testShallowEquality();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testUnionType();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIsEquivalentTo() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeTest() {
				public void runTest() throws Exception {
					testIsEquivalentTo();
				}
			};
			testcase.run();
		}
	}

}