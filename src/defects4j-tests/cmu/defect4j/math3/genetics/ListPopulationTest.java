package cmu.defect4j.math3.genetics;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class ListPopulationTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=1000000)
    public void testChromosomes() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testChromosomes();
        }
    }

    @Test(timeout=1000000)
    public void testGetFittestChromosome() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testGetFittestChromosome();
        }
    }

    @Test(timeout=1000000)
    public void testSetPopulationLimit() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testSetPopulationLimit();
        }
    }

    @Test(timeout=1000000)
    public void testConstructorPopulationLimitNotPositive() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testConstructorPopulationLimitNotPositive();
        }
    }

    @Test(timeout=1000000)
    public void testChromosomeListConstructorPopulationLimitNotPositive() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NotPositiveException", config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testChromosomeListConstructorPopulationLimitNotPositive();
        }
    }

    @Test(timeout=1000000)
    public void testConstructorListOfChromosomesBiggerThanPopulationSize() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testConstructorListOfChromosomesBiggerThanPopulationSize();
        }
    }

    @Test(timeout=1000000)
    public void testAddTooManyChromosomes() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testAddTooManyChromosomes();
        }
    }

    @Test(timeout=1000000)
    public void testAddTooManyChromosomesSingleCall() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooLargeException", config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testAddTooManyChromosomesSingleCall();
        }
    }

    @Test(timeout=1000000)
    public void testIterator() throws Exception {
        if (verifyUnhandledException("java.lang.UnsupportedOperationException", config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testIterator();
        }
    }

    @Test(timeout=1000000)
    public void testSetPopulationLimitTooSmall() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.NumberIsTooSmallException", config)) {
               org.apache.commons.math3.genetics.ListPopulationTest object = new org.apache.commons.math3.genetics.ListPopulationTest();
               object.testSetPopulationLimitTooSmall();
        }
    }

}