package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SourceMapTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testPrefixReplacement1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SourceMapTest() {
				public void runTest() throws Exception {
					testPrefixReplacement1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrefixReplacement2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SourceMapTest() {
				public void runTest() throws Exception {
					testPrefixReplacement2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrefixReplacement3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SourceMapTest() {
				public void runTest() throws Exception {
					testPrefixReplacement3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testPrefixReplacement4() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SourceMapTest() {
				public void runTest() throws Exception {
					testPrefixReplacement4();
				}
			};
			testcase.run();
		}
	}

}