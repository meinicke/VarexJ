package gov.nasa.jpf.jvm.bytecode.extended;

import gov.nasa.jpf.jvm.bytecode.PUTFIELD;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.ThreadInfo;

public class VA_PUTFIELD extends PUTFIELD {

	
	
	public VA_PUTFIELD(String fieldName, String clsName, String fieldDescriptor) {
		super(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Conditional<Instruction> execute(ThreadInfo ti) {
		// TODO Auto-generated method stub
		return super.execute(ti);
	}
}
