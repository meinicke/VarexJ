package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class SWAPTest extends ABytecodeTest {

	@Test
	public void testSWAP() throws Exception {
		final One<Integer> first = One.valueOf(3);
		final One<Integer> second = One.valueOf(3);

		StackFrame stackFrame = createStackFrame(2, 0, getInstruction());
		stackFrame.push(FeatureExprFactory.True(), first);
		stackFrame.push(FeatureExprFactory.True(), second);
		executedCode(stackFrame);

		assertEquals(first, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(second, stackFrame.pop(FeatureExprFactory.True()));
	}

	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().swap();
	}

	@Override
	protected String getExpectedMnemonic() {
		return "swap";
	}

}
