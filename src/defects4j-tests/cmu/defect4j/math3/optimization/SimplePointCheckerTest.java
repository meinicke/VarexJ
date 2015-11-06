package cmu.defect4j.math3.optimization;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class SimplePointCheckerTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testIterationCheck() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.SimplePointCheckerTest object = new org.apache.commons.math3.optimization.SimplePointCheckerTest();
               object.testIterationCheck();
        }
    }

    @Test(timeout=1000000)
    public void testIterationCheckPrecondition() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotStrictlyPositiveException", config)) {
               org.apache.commons.math3.optimization.SimplePointCheckerTest object = new org.apache.commons.math3.optimization.SimplePointCheckerTest();
               object.testIterationCheckPrecondition();
        }
    }

    @Test(timeout=1000000)
    public void testIterationCheckDisabled() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optimization.SimplePointCheckerTest object = new org.apache.commons.math3.optimization.SimplePointCheckerTest();
               object.testIterationCheckDisabled();
        }
    }

}