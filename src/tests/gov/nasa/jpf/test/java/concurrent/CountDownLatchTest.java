package gov.nasa.jpf.test.java.concurrent;

import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.junit.Test;
import org.junit.Ignore;

public class CountDownLatchTest extends TestJPF {

  private static final int N = 2;                    // Too many states to test if set higher than 2.  jpf-concurrent's gov.nasa.jpf.test.java.concurrent.CountDownLatchTest can handle more threads.
  private static final int COUNTER_SUCCESS   = 0;
  private static final int COUNTER_EXCHANGED = 1;


  //@Ignore("detects deadlock with exposure CG??")
  @Test
  public void testCountDown() throws InterruptedException {
    if (verifyNoPropertyViolation("+vm.time.model=ConstantZero", "+vm.por.break_on_exposure=true")) {

      final CountDownLatch    latch     = new CountDownLatch(N);
      final Exchanger<Object> exchanger = new Exchanger<Object>();
      final ExecutorService   service   = Executors.newFixedThreadPool(N);

      Runnable task = new Runnable() {
        public void run() {
          try {
            Object source = new Object();
            Object result = exchanger.exchange(source);
            //Object result = exchanger.exchange(source, 1L, TimeUnit.SECONDS); // If N==2 and without jpf-concurrent, the timeout causes 149,808 states to be explored.
            assert source != result : "source != result";
            assert result != null : "result != null";
            latch.countDown();
            Verify.incrementCounter(COUNTER_EXCHANGED);
          } catch (InterruptedException e) {
            throw new Error(e);
          }
        }
      };

      for (int i = 0; i < N; i++) {
        service.execute(task);
      }

      latch.await();
      service.shutdown();

      Verify.incrementCounter(COUNTER_SUCCESS);

    } else { // outside JPF
      assert Verify.getCounter(COUNTER_SUCCESS) > 0 : "never succeeded";
      assert Verify.getCounter(COUNTER_EXCHANGED) > 0 : "never exchanged";
    }
  }
}
