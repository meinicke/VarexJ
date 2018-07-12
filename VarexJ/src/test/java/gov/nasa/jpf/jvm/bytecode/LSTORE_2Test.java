package gov.nasa.jpf.jvm.bytecode;

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
	protected String getExpectedMnemonic() {
		return "lstore_2";
	}
}
