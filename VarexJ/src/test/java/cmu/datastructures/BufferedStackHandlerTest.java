package cmu.datastructures;

import org.junit.Test;

import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;

public class BufferedStackHandlerTest extends TestJPF {

	private static String[] JPF_CONFIGURATION = new String[]{/*"+interaction=frame",*/ "+search.class=.search.RandomSearch", "+choice=MapChoice"};
	
	@Conditional
	static boolean a = true;

	@Conditional
	static boolean b = true;

	@Test
	public void IALOADTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int[] iArray = createVariationalArray();
			int i = iArray[0];
		}
	}

	private int[] createVariationalArray() {
		final int[] array = new int[1];
		if (a) {
			array[0] = 1;
		}
		if (b) {
			array[0] = array[0] + 2;
		}
		return array;
	}
	
	@Test
	public void IDIVTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 10;
			if (a) {
				i = 20;
			}
			i = 90 / i; 
		}
	}

	@Test
	public void IREMTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			int i = 10;
			if (a) {
				i = 20;
			}
			i = 90 % i; 
		}
	}
	
	@Test
	public void trimToSizeTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			trimToSize();
		}
	}
	
	private int insertPointer = a ? 1 : 2;
	void trimToSize() {
		int[] trimmedTree = new int[insertPointer];
	}
	
	@Test
	public void incSizeTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			incSize();
		}
	}
	
	void incSize() {
		int[] trimmedTree = new int[insertPointer];
		trimmedTree[0] += 1;
	}
}
