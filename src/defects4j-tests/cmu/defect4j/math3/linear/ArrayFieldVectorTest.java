package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ArrayFieldVectorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testMisc() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayFieldVectorTest object = new org.apache.commons.math3.linear.ArrayFieldVectorTest();
               object.testMisc();
        }
    }

    @Test(timeout=120000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayFieldVectorTest object = new org.apache.commons.math3.linear.ArrayFieldVectorTest();
               object.testConstructors();
        }
    }

    @Test(timeout=120000)
    public void testSerial() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayFieldVectorTest object = new org.apache.commons.math3.linear.ArrayFieldVectorTest();
               object.testSerial();
        }
    }

    @Test(timeout=120000)
    public void testDataInOut() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayFieldVectorTest object = new org.apache.commons.math3.linear.ArrayFieldVectorTest();
               object.testDataInOut();
        }
    }

    @Test(timeout=120000)
    public void testMapFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayFieldVectorTest object = new org.apache.commons.math3.linear.ArrayFieldVectorTest();
               object.testMapFunctions();
        }
    }

    @Test(timeout=120000)
    public void testBasicFunctions() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayFieldVectorTest object = new org.apache.commons.math3.linear.ArrayFieldVectorTest();
               object.testBasicFunctions();
        }
    }

    @Test(timeout=120000)
    public void testZeroVectors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayFieldVectorTest object = new org.apache.commons.math3.linear.ArrayFieldVectorTest();
               object.testZeroVectors();
        }
    }

    @Test(timeout=120000)
    public void testOuterProduct() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.ArrayFieldVectorTest object = new org.apache.commons.math3.linear.ArrayFieldVectorTest();
               object.testOuterProduct();
        }
    }

}