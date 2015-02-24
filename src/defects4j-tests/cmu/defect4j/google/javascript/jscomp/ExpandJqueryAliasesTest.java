package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class ExpandJqueryAliasesTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testJqueryFnAliasExpansion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpandJqueryAliasesTest() {
				public void runTest() throws Exception {
					testJqueryFnAliasExpansion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJqueryExtendExpansion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpandJqueryAliasesTest() {
				public void runTest() throws Exception {
					testJqueryExtendExpansion();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testJqueryExpandedEachExpansion() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.ExpandJqueryAliasesTest() {
				public void runTest() throws Exception {
					testJqueryExpandedEachExpansion();
				}
			};
			testcase.run();
		}
	}

}