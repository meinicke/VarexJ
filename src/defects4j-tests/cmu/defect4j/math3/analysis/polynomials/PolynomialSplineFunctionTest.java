package cmu.defect4j.math3.analysis.polynomials;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class PolynomialSplineFunctionTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testIsValidPoint() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest();
               object.testIsValidPoint();
        }
    }

    @Test(timeout=120000)
    public void testConstructor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest();
               object.testConstructor();
        }
    }

    @Test(timeout=120000)
    public void testValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest object = new org.apache.commons.math3.analysis.polynomials.PolynomialSplineFunctionTest();
               object.testValues();
        }
    }

}