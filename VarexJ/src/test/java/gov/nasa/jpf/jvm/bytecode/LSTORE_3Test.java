package gov.nasa.jpf.jvm.bytecode;

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
	protected String getExpectedMnemonic() {
		return "lstore_3";
	}
}
