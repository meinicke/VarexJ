package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class SyntacticScopeCreatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testFunctionScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SyntacticScopeCreatorTest() {
				public void runTest() throws Exception {
					testFunctionScope();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testScopeRootNode() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SyntacticScopeCreatorTest() {
				public void runTest() throws Exception {
					testScopeRootNode();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRedeclaration1() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SyntacticScopeCreatorTest() {
				public void runTest() throws Exception {
					testRedeclaration1();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRedeclaration2() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SyntacticScopeCreatorTest() {
				public void runTest() throws Exception {
					testRedeclaration2();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testRedeclaration3() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SyntacticScopeCreatorTest() {
				public void runTest() throws Exception {
					testRedeclaration3();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testFunctionScopeArguments() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.SyntacticScopeCreatorTest() {
				public void runTest() throws Exception {
					testFunctionScopeArguments();
				}
			};
			testcase.run();
		}
	}

}