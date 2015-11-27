package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ReorderConstantExpressionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testSymmetricOperations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReorderConstantExpressionTest() {
				public void runTest() throws Exception {
					testSymmetricOperations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRelationalOperations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ReorderConstantExpressionTest() {
				public void runTest() throws Exception {
					testRelationalOperations();
				}
			};
			testcase.run();
		}
	}

}