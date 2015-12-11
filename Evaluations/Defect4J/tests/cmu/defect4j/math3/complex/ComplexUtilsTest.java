package cmu.defect4j.math3.complex;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ComplexUtilsTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testPolar2Complex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexUtilsTest object = new org.apache.commons.math3.complex.ComplexUtilsTest();
               object.testPolar2Complex();
        }
    }

    @Test(timeout=1000000)
    public void testPolar2ComplexIllegalModulus() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.complex.ComplexUtilsTest object = new org.apache.commons.math3.complex.ComplexUtilsTest();
               object.testPolar2ComplexIllegalModulus();
        }
    }

    @Test(timeout=1000000)
    public void testPolar2ComplexNaN() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexUtilsTest object = new org.apache.commons.math3.complex.ComplexUtilsTest();
               object.testPolar2ComplexNaN();
        }
    }

    @Test(timeout=1000000)
    public void testPolar2ComplexInf() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexUtilsTest object = new org.apache.commons.math3.complex.ComplexUtilsTest();
               object.testPolar2ComplexInf();
        }
    }

    @Test(timeout=1000000)
    public void testConvertToComplex() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.complex.ComplexUtilsTest object = new org.apache.commons.math3.complex.ComplexUtilsTest();
               object.testConvertToComplex();
        }
    }

}