package gov.nasa.jpf.jvm.bytecode;

public class LSTORETest extends LSTORE_0Test {

	@Override
	protected int getIndex() {
		return 4;
	}

	@Override
	public int expectedOpCode() {
		return 0x37;
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lstore";
	}
}
