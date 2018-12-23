package cmu.datastructures;

import org.junit.Test;

import cmu.conditional.One;
import gov.nasa.jpf.annotation.Conditional;
import gov.nasa.jpf.util.test.TestJPF;
import gov.nasa.jpf.vm.va.IStackHandler;
import gov.nasa.jpf.vm.va.StackHandlerFactory;

/**
 * Checks which type of StackHandler is used.<br>
 * activate: +interaction=frame
 * @author Jens Meinicke
 *
 */
@SuppressWarnings("unused")
public class BufferedStackHandlerTest extends TestJPF {

	private static String[] JPF_CONFIGURATION = new String[] {
//			"+interaction=frame", 
//			"+invocation",
			"+search.class=.search.RandomSearch", "+choice=MapChoice" };

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

	private int i = 0;

	@Test
	public void putFieldTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			i = 1;
			if (a) {
				i = 1;
				i = 2;
			}
		}
	}

	@Test
	public void putFieldTest2() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			if (b) {
				i = 3;
				i -= getChoice();
			}
		}
	}

	private int getChoice() {
		if (a) {
			return 1;
		}
		return 0;
	}

	@Test
	public void exceptionTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			try {
				throwConditionalException();
				int i = 1;
			} catch (Exception e) {
				int i = 1;
			}
		}
	}

	private void throwConditionalException() {
		if (a) {
			int j = 1;
			int i = 1/0;
		} else {
			int i = 1/1;
		}
	}
	private Child[] children = new Child[10];
	
	@Test
	public void referenceTest() throws Exception {
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			initChildren();
			
			
			Child initChild = initChild();
			int[] thisMin = initChild.minBorder;
			int j = 0;
			int i = initChild.i;
			int k = 1;
			
			initChild.minBorder = thisMin;
		}
	}
	
	private void initChildren() {
		for (int i = 0; i < children.length; i++) {
			children[i] = initChild();
		}
	}

	private Child initChild() {
		return b ? new Child() : new Child();
	}

	class Child {
		int [] minBorder = new int[10];
		int i = 0;
		public Child() {
//			for (int i = 0; i < minBorder.length; i++) {
//				minBorder[i] = a ? i : 1;
//			}
		}
	}
	
}
