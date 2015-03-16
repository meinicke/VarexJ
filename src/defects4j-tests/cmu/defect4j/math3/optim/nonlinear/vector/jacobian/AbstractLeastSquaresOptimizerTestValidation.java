package cmu.defect4j.math3.optim.nonlinear.vector.jacobian;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class AbstractLeastSquaresOptimizerTestValidation extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testParametersErrorMonteCarloObservations() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerTestValidation object = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerTestValidation();
               object.testParametersErrorMonteCarloObservations();
        }
    }

    @Test(timeout=120000)
    public void testParametersErrorMonteCarloParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerTestValidation object = new org.apache.commons.math3.optim.nonlinear.vector.jacobian.AbstractLeastSquaresOptimizerTestValidation();
               object.testParametersErrorMonteCarloParameters();
        }
    }

}