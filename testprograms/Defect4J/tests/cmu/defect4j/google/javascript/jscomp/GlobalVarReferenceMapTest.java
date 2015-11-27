package cmu.defect4j.google.javascript.jscomp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class GlobalVarReferenceMapTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testUpdateGlobalVarReferences_ResetReferences() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GlobalVarReferenceMapTest() {
				public void runTest() throws Exception {
					testUpdateGlobalVarReferences_ResetReferences();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdateGlobalVarReferences_UpdateScriptNoRef() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GlobalVarReferenceMapTest() {
				public void runTest() throws Exception {
					testUpdateGlobalVarReferences_UpdateScriptNoRef();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdateGlobalVarReferences_UpdateScriptNewRefs() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GlobalVarReferenceMapTest() {
				public void runTest() throws Exception {
					testUpdateGlobalVarReferences_UpdateScriptNewRefs();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdateGlobalVarReferences_UpdateScriptNewVar() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GlobalVarReferenceMapTest() {
				public void runTest() throws Exception {
					testUpdateGlobalVarReferences_UpdateScriptNewVar();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testUpdateReferencesWithGlobalScope() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.jscomp.GlobalVarReferenceMapTest() {
				public void runTest() throws Exception {
					testUpdateReferencesWithGlobalScope();
				}
			};
			testcase.run();
		}
	}

}