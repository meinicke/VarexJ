package cmu.defect4j.math3.analysis.polynomials;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PolynomialFunctionLagrangeFormTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testParameters() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest();
               object.testParameters();
        }
    }

    @Test(timeout=120000)
    public void testQuinticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest();
               object.testQuinticFunction();
        }
    }

    @Test(timeout=120000)
    public void testLinearFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest();
               object.testLinearFunction();
        }
    }

    @Test(timeout=120000)
    public void testQuadraticFunction() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialFunctionLagrangeFormTest();
               object.testQuadraticFunction();
        }
    }

}