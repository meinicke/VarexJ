package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class RecordTypeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testRecursiveRecord() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.RecordTypeTest() {
				public void runTest() throws Exception {
					testRecursiveRecord();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testLongToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.RecordTypeTest() {
				public void runTest() throws Exception {
					testLongToString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSupAndInf() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.RecordTypeTest() {
				public void runTest() throws Exception {
					testSupAndInf();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypeWithUnknowns() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.RecordTypeTest() {
				public void runTest() throws Exception {
					testSubtypeWithUnknowns();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypeWithUnknowns2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.RecordTypeTest() {
				public void runTest() throws Exception {
					testSubtypeWithUnknowns2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypeWithFunctionProps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.RecordTypeTest() {
				public void runTest() throws Exception {
					testSubtypeWithFunctionProps();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubtypeWithManyProps() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.RecordTypeTest() {
				public void runTest() throws Exception {
					testSubtypeWithManyProps();
				}
			};
			testcase.run();
		}
	}

}