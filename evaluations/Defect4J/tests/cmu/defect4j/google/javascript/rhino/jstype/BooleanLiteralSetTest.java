package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class BooleanLiteralSetTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testIntersection() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.BooleanLiteralSetTest() {
				public void runTest() throws Exception {
					testIntersection();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testContains() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.BooleanLiteralSetTest() {
				public void runTest() throws Exception {
					testContains();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testGet() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.BooleanLiteralSetTest() {
				public void runTest() throws Exception {
					testGet();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUnion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.BooleanLiteralSetTest() {
				public void runTest() throws Exception {
					testUnion();
				}
			};
			testcase.run();
		}
	}

}