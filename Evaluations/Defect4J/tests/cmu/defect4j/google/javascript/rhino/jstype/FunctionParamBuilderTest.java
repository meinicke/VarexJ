package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class FunctionParamBuilderTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testBuild() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.FunctionParamBuilderTest() {
				public void runTest() throws Exception {
					testBuild();
				}
			};
			testcase.run();
		}
	}

}