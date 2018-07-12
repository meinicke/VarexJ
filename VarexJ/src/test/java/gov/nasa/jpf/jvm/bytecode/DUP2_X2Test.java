package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class DUP2_X2Test extends ABytecodeTest {

	@Test
	public void testDUP2_X2() throws Exception {
		final One<Integer> value1 = One.valueOf(1);
		final One<Integer> value2 = One.valueOf(2);
		final One<Integer> value3 = One.valueOf(3);
		final One<Integer> value4 = One.valueOf(4);

		StackFrame stackFrame = createStackFrame(6, 0, getInstruction());
		stackFrame.push(FeatureExprFactory.True(), value4);
		stackFrame.push(FeatureExprFactory.True(), value3);
		stackFrame.push(FeatureExprFactory.True(), value2);
		stackFrame.push(FeatureExprFactory.True(), value1);
		executedCode(stackFrame);

		assertEquals(value1, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(value2, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(value3, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(value4, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(value1, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(value2, stackFrame.pop(FeatureExprFactory.True()));
	}

	@Override
	protected int expectedOpCode() {
		return 0x5e;
	}

	@Override
	protected Instruction getInstruction() {
		return new DUP2_X2();
	}

	@Override
	protected String getExpectedMnemonic() {
		return "dup2_x2";
	}
}
