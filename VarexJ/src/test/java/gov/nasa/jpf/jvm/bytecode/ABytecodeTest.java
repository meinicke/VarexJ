package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.jvm.JVMStackFrame;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.MethodInfo;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.VM;

public abstract class ABytecodeTest {

	protected abstract int expectedOpCode();

	protected abstract Instruction getInstruction();

	@Test
	public void testOpCode() {
		assertEquals(expectedOpCode(), getInstruction().getByteCode());
	}

	@Test
	public void testMnemonic() {
		assertEquals(getExpectedMnemonic(), getInstruction().getMnemonic());
	}

	protected abstract String getExpectedMnemonic();

	protected static ThreadInfo ti;

	@BeforeClass
	public static void setUp() {
		String[] args = { "+vm.class=.vm.MultiProcessVM", "+target.1=Nothing" };
		Config config = new Config(args);
		JPF jpf = new JPF(config);
		VM vm = jpf.getVM();
		vm.initialize(FeatureExprFactory.True());
		ThreadInfo[] threads = vm.getLiveThreads();
		ti = threads[0];
		while (ti.getPC().getValue() != null) {
			ti.executeInstruction();
		}
	}

	protected StackFrame executedCode(StackFrame stackFrame) {
		ti.setTopFrame(stackFrame);
		ti.setPC(stackFrame.getPC());
		while (ti.getPC().getValue() != null) {
			ti.executeInstruction();
		}
		return stackFrame;
	}

	protected JVMStackFrame createStackFrame(int nOperands, int nLocals, Instruction... code) {
		String signature = "()V";
		MethodInfo mi = new MethodInfo("test", signature, 0, nLocals, nOperands);
		for (int i = 0; i < code.length; i++) {
			code[i].insnIndex = i;
		}
		mi.setCode(code);
		JVMStackFrame stackFrame = new JVMStackFrame(mi);
		return stackFrame;
	}
}
