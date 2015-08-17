package cmu.jpf;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import org.junit.Ignore;
import org.junit.Test;

/**
 * @author: chupanw
 */
public class ChoiceGeneratorBaseTest extends TestJPF{
    @Conditional
    static boolean A = true;

    /**
     * When accessing static fields from several threads,
     * a SharedFieldAccessCG will be created and the instruction causing
     * this CG could be a Choice, but current impl. do not consider this.
     *
     * Note: Sometimes this works. Remember to enable mustYield() in ThreadInfo
     */
    @Test
    @Ignore // Working
    public void testSetContext() {
        if (verifyNoPropertyViolation("+search.class=.search.RandomSearch")) {
            // Create a thread to access the same filed
            Thread t = new Thread(new Runnable() {
                @Override
                public void run() {
                    // iterate to keep the thread alive
                    for (int i=0; i < 1000; i++){
                        // at least do sth.
                        int c = foo.a;
                    }
                }
            });
            t.start();
            // yield this threads to let JPF create the new thread
            Thread.yield();
            int val = 0;
            if (A) {
                // thenBranch
                val += foo.a;
            }
            // elseBranch
            val += foo.a;
            System.out.println(val);
        }
    }
}

/**
 * Helper class for testSetContext()
 */
class foo{
    public static int a = 1;
}

