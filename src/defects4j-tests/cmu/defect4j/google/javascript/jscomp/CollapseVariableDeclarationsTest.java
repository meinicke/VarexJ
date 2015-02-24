package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class CollapseVariableDeclarationsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testCollapsing() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testCollapsing();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue820() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testIssue820();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIfElseVarDeclarations() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testIfElseVarDeclarations();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAggressiveRedeclaration() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testAggressiveRedeclaration();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testAggressiveRedeclarationInFor() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testAggressiveRedeclarationInFor();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testIssue397() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.CollapseVariableDeclarationsTest() {
				public void runTest() throws Exception {
					testIssue397();
				}
			};
			testcase.run();
		}
	}

}