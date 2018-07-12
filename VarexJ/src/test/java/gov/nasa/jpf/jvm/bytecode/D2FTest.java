package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.StackFrame;

public class D2FTest extends ABytecodeTest {
	
	@Test
	public void testD2F() throws Exception {
	    double value = 3.3;
		final One<Double> doubleValue = new One<>(value);
		final One<Float> floatValue = new One<>((float)value);

		StackFrame stackFrame = createStackFrame(2, getInstruction());
	    stackFrame.pushDouble(FeatureExprFactory.True(), doubleValue);
   		executedCode(stackFrame);
   		
   		assertEquals(floatValue, stackFrame.popFloat(FeatureExprFactory.True()));
	}

	@Override
	int expectedOpCode() {
		return 0x90;
	}

	@Override
	Instruction getInstruction() {
		return new D2F();
	}
	
}
