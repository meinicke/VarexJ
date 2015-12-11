package cmu.defect4j.math3.util;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ResizableDoubleArrayTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testEqualsAndHashCode() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testEqualsAndHashCode();
        }
    }

    @Test(timeout=1000000)
    public void testAdd1000() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testAdd1000();
        }
    }

    @Test(timeout=1000000)
    public void testAddElementRolling() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testAddElementRolling();
        }
    }

    @Test(timeout=1000000)
    public void testSetElementArbitraryExpansion1() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testSetElementArbitraryExpansion1();
        }
    }

    @Test(timeout=1000000)
    public void testSetElementArbitraryExpansion2() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testSetElementArbitraryExpansion2();
        }
    }

    @Test(timeout=1000000)
    public void testAddElements() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testAddElements();
        }
    }

    @Test(timeout=1000000)
    public void testSetNumberOfElements() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testSetNumberOfElements();
        }
    }

    @Test(timeout=1000000)
    public void testWithInitialCapacity() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testWithInitialCapacity();
        }
    }

    @Test(timeout=1000000)
    public void testWithInitialCapacityAndExpansionFactor() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testWithInitialCapacityAndExpansionFactor();
        }
    }

    @Test(timeout=1000000)
    public void testDiscard() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testDiscard();
        }
    }

    @Test(timeout=1000000)
    public void testSubstitute() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testSubstitute();
        }
    }

    @Test(timeout=1000000)
    public void testMutators() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testMutators();
        }
    }

    @Test(timeout=1000000)
    public void testGetArrayRef() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testGetArrayRef();
        }
    }

    @Test(timeout=1000000)
    public void testCompute() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testCompute();
        }
    }

    @Test(timeout=1000000)
    public void testConstructors() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testConstructors();
        }
    }

    @Test(timeout=1000000)
    public void testGetValues() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testGetValues();
        }
    }

    @Test(timeout=1000000)
    public void testMinMax() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.util.ResizableDoubleArrayTest object = new org.apache.commons.math3.util.ResizableDoubleArrayTest();
               object.setUp();
               object.testMinMax();
        }
    }

}