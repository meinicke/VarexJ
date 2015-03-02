package cmu.defect4j.math3.analysis.interpolation;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class LinearInterpolatorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testInterpolateLinearDegenerateTwoSegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest();
               object.testInterpolateLinearDegenerateTwoSegment();
        }
    }

    @Test(timeout=120000)
    public void testInterpolateLinearDegenerateThreeSegment() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest();
               object.testInterpolateLinearDegenerateThreeSegment();
        }
    }

    @Test(timeout=120000)
    public void testInterpolateLinear() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest();
               object.testInterpolateLinear();
        }
    }

    @Test(timeout=120000)
    public void testIllegalArguments() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest object = new org.apache.commons.math3.analysis.interpolation.LinearInterpolatorTest();
               object.testIllegalArguments();
        }
    }

}