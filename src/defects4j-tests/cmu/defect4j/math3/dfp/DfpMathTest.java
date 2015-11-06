package cmu.defect4j.math3.dfp;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class DfpMathTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testSin() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpMathTest object = new org.apache.commons.math3.dfp.DfpMathTest();
               object.setUp();
               object.testSin();
        }
    }

    @Test(timeout=1000000)
    public void testPow() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.dfp.DfpMathTest object = new org.apache.commons.math3.dfp.DfpMathTest();
               object.setUp();
               object.testPow();
        }
    }

}