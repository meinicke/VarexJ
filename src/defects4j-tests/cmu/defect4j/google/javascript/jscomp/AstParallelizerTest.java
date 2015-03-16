package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class AstParallelizerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSplitNamedFuntion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstParallelizerTest() {
				public void runTest() throws Exception {
					testSplitNamedFuntion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSplitNamedFuntionWithArgs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstParallelizerTest() {
				public void runTest() throws Exception {
					testSplitNamedFuntionWithArgs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testNoSplit() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstParallelizerTest() {
				public void runTest() throws Exception {
					testNoSplit();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testSplitFileLevel() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.AstParallelizerTest() {
				public void runTest() throws Exception {
					testSplitFileLevel();
				}
			};
			testcase.run();
		}
	}

}