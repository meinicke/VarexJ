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
	    final int first = 3;
		final int second = 4;
		Instruction instr = getInstruction();
		instr.getByteCode();
		Instruction[] code = new Instruction[] {
		    new ICONST(first),
		    new ICONST(second),
		    instr
	    };
	    StackFrame stackFrame = executedCode(0, 2, code);
	    assertEquals(One.valueOf(first), stackFrame.pop(FeatureExprFactory.True()));
	    assertEquals(One.valueOf(second), stackFrame.pop(FeatureExprFactory.True()));
	}

	@Override
	int expectedOpCode() {
		return 0x5f;
	}

	@Override
	Instruction getInstruction() {
		return new SWAP();
	}
	
}
