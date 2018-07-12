package gov.nasa.jpf.jvm.bytecode;

public class LSTORE_1Test extends LSTORE_0Test {

	@Override
	protected int getIndex() {
		return 1;
	}

	@Override
	public int expectedOpCode() {
		return 0x40;
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lstore_1";
	}
}
