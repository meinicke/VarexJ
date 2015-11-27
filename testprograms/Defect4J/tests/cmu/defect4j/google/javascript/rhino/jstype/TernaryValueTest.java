package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class TernaryValueTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testToString() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.TernaryValueTest() {
				public void runTest() throws Exception {
					testToString();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNot() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.TernaryValueTest() {
				public void runTest() throws Exception {
					testNot();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testXor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.TernaryValueTest() {
				public void runTest() throws Exception {
					testXor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToBoolean() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.TernaryValueTest() {
				public void runTest() throws Exception {
					testToBoolean();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOrdinal() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.TernaryValueTest() {
				public void runTest() throws Exception {
					testOrdinal();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAnd() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.TernaryValueTest() {
				public void runTest() throws Exception {
					testAnd();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testOr() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.TernaryValueTest() {
				public void runTest() throws Exception {
					testOr();
				}
			};
			testcase.run();
		}
	}

}