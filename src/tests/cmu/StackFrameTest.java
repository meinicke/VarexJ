package cmu;

import static org.junit.Assert.*;
import gov.nasa.jpf.vm.StackFrame;

import org.junit.Test;

public class StackFrameTest {

	
	private StackFrame getSF() {
		StackFrame sf = new StackFrame(2, 2) {
			
			@Override
			public void setReferenceArgumentLocal(int idx, int ref, Object attr) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setLongArgumentLocal(int idx, long value, Object attr) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void setArgumentLocal(int idx, int value, Object attr) {
				// TODO Auto-generated method stub
				
			}
		};
		return sf;
	}
	
	@Test
	public void testName() throws Exception {
		StackFrame sf = getSF();
		
		
	}
}
