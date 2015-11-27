package cmu.defect4j.google.javascript.rhino.jstype;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;
import junit.framework.TestCase;
public class NamedTypeTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/compiler.jar"};

    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
	@Test(timeout=120000)
	public void testNamedTypeProperties() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.NamedTypeTest() {
				public void runTest() throws Exception {
					testNamedTypeProperties();
				}
			};
			testcase.run();
		}
	}

	@Test(timeout=120000)
	public void testActiveXObjectResolve() throws Exception {
		if (verifyNoPropertyViolation(config)) {
			TestCase testcase = new com.google.javascript.rhino.jstype.NamedTypeTest() {
				public void runTest() throws Exception {
					testActiveXObjectResolve();
				}
			};
			testcase.run();
		}
	}

}