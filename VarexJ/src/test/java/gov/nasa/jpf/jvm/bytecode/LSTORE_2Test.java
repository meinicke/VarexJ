package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.vm.Instruction;

public class LSTORE_2Test extends LSTORE_0Test {

	@Override
	protected int getIndex() {
		return 2;
	}

	@Override
	public int expectedOpCode() {
		return 0x41;
	}

	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().lstore_2();
	}
	
	@Override
	protected String getExpectedMnemonic() {
		return "lstore_2";
	}
}
