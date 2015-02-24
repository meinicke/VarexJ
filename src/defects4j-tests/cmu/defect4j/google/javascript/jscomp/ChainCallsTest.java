package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ChainCallsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUnchainedCalls() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ChainCallsTest() {
				public void runTest() throws Exception {
					testUnchainedCalls();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSecondCallReturnNotThis() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ChainCallsTest() {
				public void runTest() throws Exception {
					testSecondCallReturnNotThis();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testDifferentInstance() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ChainCallsTest() {
				public void runTest() throws Exception {
					testDifferentInstance();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSubclass() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ChainCallsTest() {
				public void runTest() throws Exception {
					testSubclass();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleDefinitionFinder() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ChainCallsTest() {
				public void runTest() throws Exception {
					testSimpleDefinitionFinder();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSimpleDefinitionFinder2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ChainCallsTest() {
				public void runTest() throws Exception {
					testSimpleDefinitionFinder2();
				}
			};
			testcase.run();
		}
	}

}