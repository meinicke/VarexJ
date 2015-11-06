package cmu.defect4j.math3.exception;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class TooManyEvaluationsExceptionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testMessage() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.exception.TooManyEvaluationsExceptionTest object = new org.apache.commons.math3.exception.TooManyEvaluationsExceptionTest();
               object.testMessage();
        }
    }

}