package cmu;

import org.junit.Ignore;
import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.Verify;

@SuppressWarnings("unused")
public class SchedulerTest extends TestJPF {

	static String[] JPF_CONFIGURATION = new String[]{/*"+interaction=interaction",*/ "+search.class=.search.RandomSearch", "+choice=MapChoice"};
	
	@Conditional
	static boolean a = true;

	@Test
	public void conditionalContinueTest() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			
			Verify.setCounter(0, 0);
			final int rounds = 2;
			for (int start = 0; start < rounds; start++) {
				Verify.incrementCounter(0);
				if (a) {
					continue;
				}
				int i = 0;
			}
			assertEquals(rounds, Verify.getCounter(0));
		}
	}
	
	/**
	 * TODO This test case only works for the Eclipse compiler.
	 */
	@Test@Ignore
	public void conditionalContinueTest2() {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Verify.setCounter(0, 0);
			int i = 0;
			final int rounds = 2;
			while (i++ < rounds) {
				Verify.incrementCounter(0);
				if (a) {
					continue;
				}
				int j = 0;
			}
			assertEquals(rounds, Verify.getCounter(0));
		}
	}

	
}
