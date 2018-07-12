package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.vm.Instruction;

public class LSTORE_3Test extends LSTORE_0Test {

	@Override
	protected int getIndex() {
		return 3;
	}

	@Override
	public int expectedOpCode() {
		return 0x42;
	}
	
	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().lstore_3();
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lstore_3";
	}
}
