package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.vm.Instruction;

public class LLOAD_1Test extends LLOAD_0Test {

	@Override
	protected int getIndex() {
		return 1;
	}

	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().lload_1();
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lload_1";
	}
}
