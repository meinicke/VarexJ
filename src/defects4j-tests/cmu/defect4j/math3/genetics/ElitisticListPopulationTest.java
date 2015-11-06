package cmu.defect4j.math3.genetics;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ElitisticListPopulationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testNextGeneration() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.ElitisticListPopulationTest object = new org.apache.commons.math3.genetics.ElitisticListPopulationTest();
               object.testNextGeneration();
        }
    }

    @Test(timeout=1000000)
    public void testSetElitismRate() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.ElitisticListPopulationTest object = new org.apache.commons.math3.genetics.ElitisticListPopulationTest();
               object.testSetElitismRate();
        }
    }

    @Test(timeout=1000000)
    public void testSetElitismRateTooLow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.genetics.ElitisticListPopulationTest object = new org.apache.commons.math3.genetics.ElitisticListPopulationTest();
               object.testSetElitismRateTooLow();
        }
    }

    @Test(timeout=1000000)
    public void testSetElitismRateTooHigh() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.genetics.ElitisticListPopulationTest object = new org.apache.commons.math3.genetics.ElitisticListPopulationTest();
               object.testSetElitismRateTooHigh();
        }
    }

    @Test(timeout=1000000)
    public void testConstructorTooLow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.genetics.ElitisticListPopulationTest object = new org.apache.commons.math3.genetics.ElitisticListPopulationTest();
               object.testConstructorTooLow();
        }
    }

    @Test(timeout=1000000)
    public void testConstructorTooHigh() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.genetics.ElitisticListPopulationTest object = new org.apache.commons.math3.genetics.ElitisticListPopulationTest();
               object.testConstructorTooHigh();
        }
    }

    @Test(timeout=1000000)
    public void testChromosomeListConstructorTooLow() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.genetics.ElitisticListPopulationTest object = new org.apache.commons.math3.genetics.ElitisticListPopulationTest();
               object.testChromosomeListConstructorTooLow();
        }
    }

    @Test(timeout=1000000)
    public void testChromosomeListConstructorTooHigh() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.OutOfRangeException", config)) {
               org.apache.commons.math3.genetics.ElitisticListPopulationTest object = new org.apache.commons.math3.genetics.ElitisticListPopulationTest();
               object.testChromosomeListConstructorTooHigh();
        }
    }

}