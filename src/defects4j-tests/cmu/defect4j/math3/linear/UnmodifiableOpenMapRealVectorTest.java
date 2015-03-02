package cmu.defect4j.math3.linear;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class UnmodifiableOpenMapRealVectorTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest();
               object.testIterator();
        }
    }

    @Test(timeout=120000)
    public void testGetEntry() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest();
               object.testGetEntry();
        }
    }

    @Test(timeout=120000)
    public void testSetEntry() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest();
               object.testSetEntry();
        }
    }

    @Test(timeout=120000)
    public void testAddToEntry() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest();
               object.testAddToEntry();
        }
    }

    @Test(timeout=120000)
    public void testGetSubVector() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest();
               object.testGetSubVector();
        }
    }

    @Test(timeout=120000)
    public void testAllButExcluded() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest();
               object.testAllButExcluded();
        }
    }

    @Test(timeout=120000)
    public void testSetSubVector() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathUnsupportedOperationException", config)) {
               org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest();
               object.testSetSubVector();
        }
    }

    @Test(timeout=120000)
    public void testSparseIterator() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest object = new org.apache.commons.math3.linear.UnmodifiableOpenMapRealVectorTest();
               object.testSparseIterator();
        }
    }

}