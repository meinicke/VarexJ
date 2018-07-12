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
	    final int first = 3;
		Instruction instr = getInstruction();
		instr.getByteCode();
		Instruction[] code = new Instruction[] {
		    new ICONST(first),
		    instr
	    };
	    StackFrame stackFrame = executedCode(0, 1, code);
	    assertEquals(One.valueOf(first), stackFrame.pop(FeatureExprFactory.True()));
	}

	@Override
	int expectedOpCode() {
		return 0x00;
	}

	@Override
	Instruction getInstruction() {
		return new NOP();
	}
	
}
