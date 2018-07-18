package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class POP2Test extends ABytecodeTest {

	@Test
	public void testPop2() throws Exception {
		final One<Integer> value1 = One.valueOf(1);
		final One<Integer> value2 = One.valueOf(2);
		final One<Integer> value3 = One.valueOf(3);

		StackFrame stackFrame = createStackFrame(3, 0, getInstruction());
		stackFrame.push(FeatureExprFactory.True(), value3);
		stackFrame.push(FeatureExprFactory.True(), value2);
		stackFrame.push(FeatureExprFactory.True(), value1);
		executedCode(stackFrame);

		assertEquals(value3, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(-1, stackFrame.getTopPos());

	}

	@Test
	public void testPop2_2() throws Exception {
		final One<Integer> value1 = One.valueOf(1);
		final One<Double> pi = new One<>(Math.PI);

		StackFrame stackFrame = createStackFrame(3, 0, getInstruction());
		stackFrame.push(FeatureExprFactory.True(), value1);
		stackFrame.pushDouble(FeatureExprFactory.True(), pi);
		executedCode(stackFrame);

		assertEquals(value1, stackFrame.pop(FeatureExprFactory.True()));
		assertEquals(-1, stackFrame.getTopPos());

	}

	@Override
	protected Instruction getInstruction() {
		return InstructionFactory.getFactory().pop2();
	}
	
	@Override
	protected String getExpectedMnemonic() {
		return "pop2";
	}

}
