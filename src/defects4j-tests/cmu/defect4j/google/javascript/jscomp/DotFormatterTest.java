package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class DotFormatterTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testKeyAssignementSequential() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DotFormatterTest() {
				public void runTest() throws Exception {
					testKeyAssignementSequential();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testKeyAssignementOncePerNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DotFormatterTest() {
				public void runTest() throws Exception {
					testKeyAssignementOncePerNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDotSimple() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DotFormatterTest() {
				public void runTest() throws Exception {
					testToDotSimple();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testToDot3Elements() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.DotFormatterTest() {
				public void runTest() throws Exception {
					testToDot3Elements();
				}
			};
			testcase.run();
		}
	}

}