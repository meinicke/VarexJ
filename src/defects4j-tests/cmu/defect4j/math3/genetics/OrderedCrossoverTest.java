package cmu.defect4j.math3.genetics;

import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Test;

public class OrderedCrossoverTest extends TestJPF {

    private final String[] config = {"+nhandler.delegateUnhandledNative", "+classpath+=${jpf-core}/lib/junit-4.11.jar,lib/commons-math-3.1-SNAPSHOT.jar"};
    public static void main(String[] testMethods){
        runTestsOfThisClass(testMethods);
    }
    @Test(timeout=120000)
    public void testCrossover() throws Exception {
        if (verifyNoPropertyViolation(config)) {
               org.apache.commons.math3.genetics.OrderedCrossoverTest object = new org.apache.commons.math3.genetics.OrderedCrossoverTest();
               object.testCrossover();
        }
    }

    @Test(timeout=120000)
    public void testCrossoverDimensionMismatchException() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.DimensionMismatchException", config)) {
               org.apache.commons.math3.genetics.OrderedCrossoverTest object = new org.apache.commons.math3.genetics.OrderedCrossoverTest();
               object.testCrossoverDimensionMismatchException();
        }
    }

    @Test(timeout=120000)
    public void testCrossoverInvalidFixedLengthChromosomeFirst() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.OrderedCrossoverTest object = new org.apache.commons.math3.genetics.OrderedCrossoverTest();
               object.testCrossoverInvalidFixedLengthChromosomeFirst();
        }
    }

    @Test(timeout=120000)
    public void testCrossoverInvalidFixedLengthChromosomeSecond() throws Exception {
        if (verifyUnhandledException("org.apache.commons.math3.exception.MathIllegalArgumentException", config)) {
               org.apache.commons.math3.genetics.OrderedCrossoverTest object = new org.apache.commons.math3.genetics.OrderedCrossoverTest();
               object.testCrossoverInvalidFixedLengthChromosomeSecond();
        }
    }

}