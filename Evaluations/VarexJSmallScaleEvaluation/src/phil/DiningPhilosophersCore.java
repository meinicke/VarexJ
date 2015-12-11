package phil;


import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;


/**
 * My version of the dining Philosophers.
 * This can be verified with jpf-bdd or only with jpf-core.
 * Both will find deadlocks very fast.
 * When searching for all errors (+search.multiple_errors=true)
 * jpf-bdd is faster.
 * The example is scalable in the number of philosophers.
 * 
 * @author rhein
 */
public class DiningPhilosophersCore extends TestJPF {

	static class Fork {
		/**
		 * If this fork is used by the philosopher on the left of the fork.
		 */
		boolean usedLeft;
		/**
		 * If this fork is used by the philosopher on the right of the fork.
		 */
		boolean usedRight;
		
		public Fork() {
			usedLeft = Verify.getBoolean();
			if (!usedLeft) usedRight = Verify.getBoolean();
		}
	}
	
	static class Philosopher implements Runnable {
		// Fork lying on the left/right of this philosopher
		Fork leftFork, rightFork;
	
		@Override
		public void run() {
			// think while left fork is unavailable
			// then pick it up
			synchronized (leftFork) {
				// This is one point where jpf-bdd will introduce ChoiceGenerators
				while (leftFork.usedLeft && !leftFork.usedRight) {
					try {
						leftFork.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				leftFork.usedLeft=false;
				leftFork.usedRight=true;
			}
			// think while right fork is unavailable
			// then pick it up
			synchronized (rightFork) {
				// This is one point where jpf-bdd will introduce ChoiceGenerators
				while (rightFork.usedRight && !rightFork.usedLeft) {
					try {
						rightFork.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				rightFork.usedRight=false;
				rightFork.usedLeft=true;
			}
			// eat
			
			// release
			synchronized (leftFork) {
				leftFork.usedRight = false;
				leftFork.notify();
			}
			synchronized (rightFork) {
				rightFork.usedLeft = false;
				rightFork.notify();
			}
			// sleep
		}
	}
	
	public static void testStatic(int size) {
		Philosopher[] ps = new Philosopher[size];
		for (int i = 0; i < size; i++) {
			ps[i] = new Philosopher();
			if (i > 0) {
				Fork f = new Fork();
				ps[i].leftFork = f;
				ps[i-1].rightFork = f;
			} 
			if (i==size-1) {
				Fork f = new Fork();
				ps[0].leftFork = f;
				ps[i].rightFork = f;
			}
		}
		System.out.println("System Setup:");
		for (int i = 0; i < size; i++) {
			System.out.println("Philosopher"+i+": " + ps[i] 
			                  + " lF: " + ps[i].leftFork 
			                  + " rF: " + ps[i].rightFork);
		}
		for (int i = 0; i < size; i++) {
			(new Thread(ps[i])).start();
		}
	}
	
	public static void main(String[] args) {
			if (args.length > 0)
				testStatic(Integer.parseInt(args[0]));
			else 
				testStatic(4);
	}
}