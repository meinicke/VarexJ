package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.vm.Instruction;

public class LLOAD_3Test extends LLOAD_0Test {

	@Override
	protected int getIndex() {
		return 3;
	}

	@Override
	public int expectedOpCode() {
		return 0x21;
	}
	
	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().lload_3();
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lload_3";
	}
}
