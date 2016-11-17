package cmu.java.util.concurrent.atomic;

import java.util.concurrent.atomic.AtomicLong;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;

public class AtomicLongTest extends TestJPF {

	@Test
	public void test() {
		if (verifyNoPropertyViolation()) {
			AtomicLong al = new AtomicLong(10);
			al.getAndAdd(2);
			System.out.println(al);
		}
	}
}
