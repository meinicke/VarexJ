package cmu;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class FibonacciTest extends TestJPF {

	@Conditional
	static boolean a = true;
	@Conditional
	static boolean b = true;
	@Conditional
	static boolean c = true;
	@Conditional
	static boolean d = true;
	@Conditional
	static boolean e = true;
	@Conditional
	static boolean f = true;
	@Conditional
	static boolean g = true;
	@Conditional
	static boolean h = true;
	@Conditional
	static boolean j = true;
	@Conditional
	static boolean k = true;
	
	@Test
	public void fiboTest() throws Exception {
		if (verifyNoPropertyViolation("+search.class= .search.RandomSearch")) {
			int x = 1;
			if (a) x = 2;
			if (b) x = 3;
			if (c) x = 4;
			if (d) x = 5;
			if (e) x = 6;

			int m = max(x, 10);
			fibo(m);
		}
	}
			
	int fibo(int a) {
	    if (a == 1 || a == 2) {
	      return 1;
	    } else {
	      return fibo(a-1) + fibo(a-2);    
	    }
	}

	int max(int a, int b) { 
	   if (a > b) {
	     return a;
	   } else {
	     return b;
	   }
	}
}
