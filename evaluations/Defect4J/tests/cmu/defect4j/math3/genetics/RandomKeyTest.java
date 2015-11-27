package cmu.defect4j.math3.genetics;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class RandomKeyTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testConstructor1() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testConstructor1();
        }
    }

    @Test(timeout=1000000)
    public void testConstructor2() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testConstructor2();
        }
    }

    @Test(timeout=1000000)
    public void testDecode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testDecode();
        }
    }

    @Test(timeout=1000000)
    public void testInvalidRepresentation() throws Exception {
        if (verifyUnhandledException("java.lang.IllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testInvalidRepresentation();
        }
    }

    @Test(timeout=1000000)
    public void testRandomPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testRandomPermutation();
        }
    }

    @Test(timeout=1000000)
    public void testIdentityPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testIdentityPermutation();
        }
    }

    @Test(timeout=1000000)
    public void testComparatorPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testComparatorPermutation();
        }
    }

    @Test(timeout=1000000)
    public void testInducedPermutation() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testInducedPermutation();
        }
    }

    @Test(timeout=1000000)
    public void testEqualRepr() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testEqualRepr();
        }
    }

    @Test(timeout=1000000)
    public void testIsSame() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.RandomKeyTest object = new org.apache.commons.math3.genetics.RandomKeyTest();
               object.testIsSame();
        }
    }

}