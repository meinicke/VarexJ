package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class UnionTypeBuilderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testEmptyUnion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeBuilderTest() {
				public void runTest() throws Exception {
					testEmptyUnion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnionTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeBuilderTest() {
				public void runTest() throws Exception {
					testUnionTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnknownTypes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeBuilderTest() {
				public void runTest() throws Exception {
					testUnknownTypes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalOfDupes() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeBuilderTest() {
				public void runTest() throws Exception {
					testRemovalOfDupes();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalOfDupes2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeBuilderTest() {
				public void runTest() throws Exception {
					testRemovalOfDupes2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRemovalOfDupes3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeBuilderTest() {
				public void runTest() throws Exception {
					testRemovalOfDupes3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAllType() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.UnionTypeBuilderTest() {
				public void runTest() throws Exception {
					testAllType();
				}
			};
			testcase.run();
		}
	}

}