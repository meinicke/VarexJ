package cmu.testprograms;

import gov.nasa.jpf.annotation.MyAnnotation;
import gov.nasa.jpf.util.test.TestJPF;

import org.junit.Test;

public class FibonacciTest extends TestJPF {

	@MyAnnotation
	static boolean a = true;
	@MyAnnotation
	static boolean b = true;
	@MyAnnotation
	static boolean c = true;
	@MyAnnotation
	static boolean d = true;
	@MyAnnotation
	static boolean e = true;
	@MyAnnotation
	static boolean f = true;
	@MyAnnotation
	static boolean g = true;
	@MyAnnotation
	static boolean h = true;
	@MyAnnotation
	static boolean j = true;
	@MyAnnotation
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
