package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.CachedFeatureExprFactory;
import cmu.conditional.One;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class LSTORE_0Test extends ABytecodeTest {

	@Test
	public void testLSTORE() throws Exception {
		final One<Long> value = new One<>(1l);
		StackFrame stackFrame = createStackFrame(8, getIndex() + 2, getInstruction());
		stackFrame.pushLong(CachedFeatureExprFactory.True(), value);
		executedCode(stackFrame);

		stackFrame.pushLongLocal(CachedFeatureExprFactory.True(), getIndex());
		assertEquals(value, stackFrame.popLong(CachedFeatureExprFactory.True()));
	}

	protected int getIndex() {
		return 0;
	}

	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().lstore_0();
	}

	@Override
	protected String getExpectedMnemonic() {
		return "lstore_0";
	}

}
