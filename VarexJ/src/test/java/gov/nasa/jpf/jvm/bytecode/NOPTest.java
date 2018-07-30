package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.CachedFeatureExprFactory;
import cmu.conditional.One;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class NOPTest extends ABytecodeTest {

	@Test
	public void testNOP() throws Exception {
		final One<Integer> first = One.valueOf(3);

		StackFrame stackFrame = createStackFrame(2, 0, getInstruction());
		stackFrame.push(CachedFeatureExprFactory.True(), first);
		executedCode(stackFrame);

		assertEquals(first, stackFrame.pop(CachedFeatureExprFactory.True()));
	}

	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().nop();
	}


	@Override
	protected String getExpectedMnemonic() {
		return "nop";
	}

}
