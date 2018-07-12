package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class LSTORE_0Test extends ABytecodeTest {

	@Test
	public void testLSTORE() throws Exception {
		final One<Long> value = new One<>(1l);
		StackFrame stackFrame = createStackFrame(8, getIndex() + 2, getInstruction());
		stackFrame.pushLong(FeatureExprFactory.True(), value);
		executedCode(stackFrame);

		stackFrame.pushLongLocal(FeatureExprFactory.True(), getIndex());
		assertEquals(value, stackFrame.popLong(FeatureExprFactory.True()));
	}

	protected int getIndex() {
		return 0;
	}

	@Override
	public int expectedOpCode() {
		return 0x3f;
	}

	@Override
	protected Instruction getInstruction() {
		return new LSTORE(getIndex());
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lstore_0";
	}

}
