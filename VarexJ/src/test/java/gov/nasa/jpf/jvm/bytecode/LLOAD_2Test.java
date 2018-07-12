package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.vm.Instruction;

public class LLOAD_2Test extends LLOAD_0Test {

	@Override
	protected int getIndex() {
		return 2;
	}

	@Override
	public int expectedOpCode() {
		return 0x20;
	}
	
	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().lload_2();
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lload_2";
	}
}
