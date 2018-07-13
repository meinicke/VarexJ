package gov.nasa.jpf.jvm.bytecode;

import gov.nasa.jpf.vm.Instruction;

public class LSTORETest extends LSTORE_0Test {

	@Override
	protected int getIndex() {
		return 4;
	}

	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().lstore(4);
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lstore";
	}
}
