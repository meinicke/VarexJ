package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class NOPTest extends ABytecodeTest {

	@Test
	public void testNOP() throws Exception {
		final One<Integer> first = One.valueOf(3);

		StackFrame stackFrame = createStackFrame(2, 0, getInstruction());
		stackFrame.push(FeatureExprFactory.True(), first);
		executedCode(stackFrame);

		assertEquals(first, stackFrame.pop(FeatureExprFactory.True()));
	}

	@Override
	protected int expectedOpCode() {
		return 0x00;
	}

	@Override
	protected Instruction getInstruction() {
		return new NOP();
	}

	@Override
	protected String getExpectedMnemonic() {
		return "nop";
	}

}
