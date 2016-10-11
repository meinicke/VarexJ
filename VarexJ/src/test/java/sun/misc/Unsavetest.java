package sun.misc;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class Unsavetest extends TestJPF {
	
	@Test
	public void testNotNull() {
		if (verifyNoPropertyViolation()) {
			AtomicInteger ai = new AtomicInteger();
			ai.getAndAdd(1);
		}
	}
}
