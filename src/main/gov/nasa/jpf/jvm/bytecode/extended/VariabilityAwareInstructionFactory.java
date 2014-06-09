package gov.nasa.jpf.jvm.bytecode.extended;

import gov.nasa.jpf.jvm.bytecode.InstructionFactory;
import gov.nasa.jpf.jvm.bytecode.PUTFIELD;
import gov.nasa.jpf.vm.Instruction;

public class VariabilityAwareInstructionFactory extends InstructionFactory {

	@Override
	public Instruction putfield(String fieldName, String clsName, String fieldDescriptor) {
		return new VA_PUTFIELD(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Instruction putstatic(String fieldName, String clsName, String fieldDescriptor) {
		return new VA_PUTSTATIC(fieldName, clsName, fieldDescriptor);
	}

	@Override
	public Instruction iadd() {
		return new VA_IADD();
	}

}
