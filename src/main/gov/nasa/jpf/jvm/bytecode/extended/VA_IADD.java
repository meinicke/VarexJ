package gov.nasa.jpf.jvm.bytecode.extended;

import gov.nasa.jpf.jvm.bytecode.IADD;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;

public class VA_IADD extends IADD {

	@Override
	public Conditional<Instruction> execute(ThreadInfo ti) {
	    StackFrame frame = ti.getModifiableTopFrame();
	    
	    int v1 = frame.pop().getValue();
	    int v2 = frame.pop().getValue();

	    frame.push(v1 + v2);

	    return new One<>(getNext(ti));
	}
}
