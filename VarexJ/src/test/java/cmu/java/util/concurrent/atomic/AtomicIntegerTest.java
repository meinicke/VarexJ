package cmu.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicInteger;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class AtomicIntegerTest extends TestJPF {

	@Test
	public void test() {
		if (verifyNoPropertyViolation()) {
			AtomicInteger ai = new AtomicInteger(10);
			ai.getAndAdd(2);
			System.out.println(ai);
		}
	}
}
