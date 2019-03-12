package cmu.peers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Stack;
import java.util.Vector;

import org.junit.Test;

import gov.nasa.jpf.util.test.TestJPF;


public class ObjectOutputStreamTest extends TestJPF {

	static String JPF_CONFIGURATION = "+search.class= .search.RandomSearch";

	@Test
	public void writeStackTest() throws Exception {
		new File("save").deleteOnExit();
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Stack<Integer> stack = new Stack<>();
			ObjectOutput o = new ObjectOutputStream(new FileOutputStream(new File("save")));
			o.writeObject(stack);
			o.close();
		}
	}
	
	@Test
	public void writeVectorTest() throws Exception {
		new File("save").deleteOnExit();
		if (verifyNoPropertyViolation(JPF_CONFIGURATION)) {
			Vector<Integer> stack = new Vector<>();
			ObjectOutput o = new ObjectOutputStream(new FileOutputStream(new File("save")));
			o.writeObject(stack);
			o.close();
		}
	}
	
	public static void main(String[] args) {
		System.out.println(int.class.isAssignableFrom(float.class));
	}
}
