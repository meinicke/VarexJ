package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.vm.Instruction;

public class LLOADTest extends LLOAD_0Test {

	@Override
	protected int getIndex() {
		return 4;
	}

	@Override
	public int expectedOpCode() {
		return 0x16;
	}
	
	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().lload(4);
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lload";
	}
}
