package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class DUP2Test extends ABytecodeTest {

	@Test
	public void testDup2() throws Exception {
		final One<Integer> value1 = One.valueOf(1);
		final One<Integer> value2 = One.valueOf(2);

		StackFrame stackFrame = createStackFrame(4, 0, getInstruction());
		stackFrame.push(FeatureExprFactory.True(), value2);
		stackFrame.push(FeatureExprFactory.True(), value1);
		executedCode(stackFrame);

		assertEquals(value1, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(value2, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(value1, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(value2, stackFrame.pop(FeatureExprFactory.True()));
	}

	@Override
	protected int expectedOpCode() {
		return 0x5c;
	}

	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().dup2();
	}

	@Override
	public String getExpectedMnemonic() {
		return "dup2";
	}

}
