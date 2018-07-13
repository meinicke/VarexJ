package gov.nasa.jpf.jvm.bytecode;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

import gov.nasa.jpf.Config;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.vm.Instruction;

/**
 * Test class for opcodes and mnemonics https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings
 * 
 * @author Jens Meinicke
 *
 */
@RunWith(Parameterized.class)
public class OpCodeTest {

	@Parameters(name = "{0} , {1}")
	public static List<Object[]> data() {
		new JPF(new Config(new String[] { "+vm.class=.vm.MultiProcessVM", "+target.1=Nothing" }));
		return Arrays.asList(new Object[][] {
			{ "aaload", 0x32, InstructionFactory.getFactory().aaload() },
			{ "aastore", 0x53, InstructionFactory.getFactory().aastore() },
			{ "aconst_null", 0x1, InstructionFactory.getFactory().aconst_null() },
			{ "aload", 0x19, InstructionFactory.getFactory().aload(4) },
			{ "aload_0", 0x2a, InstructionFactory.getFactory().aload_0() },
			{ "aload_1", 0x2b, InstructionFactory.getFactory().aload_1() },
			{ "aload_2", 0x2c, InstructionFactory.getFactory().aload_2() },
			{ "aload_3", 0x2d, InstructionFactory.getFactory().aload_3() },
			{ "anewarray", 0xbd, InstructionFactory.getFactory().anewarray("Integer") },
			{ "areturn", 0xb0, InstructionFactory.getFactory().areturn() },
			{ "arraylength", 0xbe, InstructionFactory.getFactory().arraylength() },
			{ "astore", 0x3a, InstructionFactory.getFactory().astore(4) },
			{ "astore_0", 0x4b, InstructionFactory.getFactory().astore_0() },
			{ "astore_1", 0x4c, InstructionFactory.getFactory().astore_1() },
			{ "astore_2", 0x4d, InstructionFactory.getFactory().astore_2() },
			{ "astore_3", 0x4e, InstructionFactory.getFactory().astore_3() },
			{ "athrow", 0xbf, InstructionFactory.getFactory().athrow() },
			{ "baload", 0x33, InstructionFactory.getFactory().baload() },
			{ "bastore", 0x54, InstructionFactory.getFactory().bastore() },
			{ "bipush", 0x10, InstructionFactory.getFactory().bipush(10) },
	//		"breakpoint", 0xca, InstructionFactory.getFactory().breakpoint()},
			{ "caload", 0x34, InstructionFactory.getFactory().caload() },
			{ "castore", 0x55, InstructionFactory.getFactory().castore() },
			{ "checkcast", 0xc0, InstructionFactory.getFactory().checkcast("Integer") },
			{ "d2f", 0x90, InstructionFactory.getFactory().d2f() },
			{ "d2i", 0x8e, InstructionFactory.getFactory().d2i() },
			{ "d2l", 0x8f, InstructionFactory.getFactory().d2l() },
			{ "dadd", 0x63, InstructionFactory.getFactory().dadd() },
			{ "daload", 0x31, InstructionFactory.getFactory().daload() },
			{ "dastore", 0x52, InstructionFactory.getFactory().dastore() },
			{ "dcmpg", 0x98, InstructionFactory.getFactory().dcmpg() },
			{ "dcmpl", 0x97, InstructionFactory.getFactory().dcmpl() },
			{ "dconst_0", 0x0e, InstructionFactory.getFactory().dconst_0() },
			{ "dconst_1", 0x0f, InstructionFactory.getFactory().dconst_1() },
			{ "ddiv", 0x6f, InstructionFactory.getFactory().ddiv() },
			{ "dload", 0x18, InstructionFactory.getFactory().dload(4) },
			{ "dload_0", 0x26, InstructionFactory.getFactory().dload_0() },
			{ "dload_1", 0x27, InstructionFactory.getFactory().dload_1() },
			{ "dload_2", 0x28, InstructionFactory.getFactory().dload_2() },
			{ "dload_3", 0x29, InstructionFactory.getFactory().dload_3() },
			{ "dmul", 0x6b, InstructionFactory.getFactory().dmul() },
			{ "dneg", 0x77, InstructionFactory.getFactory().dneg() },
			{ "drem", 0x73, InstructionFactory.getFactory().drem() },
			{ "dreturn", 0xaf, InstructionFactory.getFactory().dreturn() },
			{ "dstore", 0x39, InstructionFactory.getFactory().dstore(4) },
			{ "dstore_0", 0x47, InstructionFactory.getFactory().dstore_0() },
			{ "dstore_1", 0x48, InstructionFactory.getFactory().dstore_1() },
			{ "dstore_2", 0x49, InstructionFactory.getFactory().dstore_2() },
			{ "dstore_3", 0x4a, InstructionFactory.getFactory().dstore_3() },
			{ "dsub", 0x67, InstructionFactory.getFactory().dsub() },
			{ "dup", 0x59, InstructionFactory.getFactory().dup() },
			{ "dup2", 0x5c, InstructionFactory.getFactory().dup2() },
			{ "dup2_x1", 0x5d, InstructionFactory.getFactory().dup2_x1() },
			{ "dup2_x2", 0x5e, InstructionFactory.getFactory().dup2_x2() },
			{ "dup_x1", 0x5a, InstructionFactory.getFactory().dup_x1() },
			{ "dup_x2", 0x5b, InstructionFactory.getFactory().dup_x2() },
			{ "f2d", 0x8d, InstructionFactory.getFactory().f2d() },
			{ "f2i", 0x8b, InstructionFactory.getFactory().f2i() },
			{ "f2l", 0x8c, InstructionFactory.getFactory().f2l() },
			{ "fadd", 0x62, InstructionFactory.getFactory().fadd() },
			{ "faload", 0x30, InstructionFactory.getFactory().faload() },
			{ "fastore", 0x51, InstructionFactory.getFactory().fastore() },
			{ "fcmpg", 0x96, InstructionFactory.getFactory().fcmpg() },
			{ "fcmpl", 0x95, InstructionFactory.getFactory().fcmpl() },
			{ "fconst_0", 0x0b, InstructionFactory.getFactory().fconst_0() },
			{ "fconst_1", 0x0c, InstructionFactory.getFactory().fconst_1() },
			{ "fconst_2", 0x0d, InstructionFactory.getFactory().fconst_2() },
			{ "fdiv", 0x6e, InstructionFactory.getFactory().fdiv() },
			{ "fload", 0x17, InstructionFactory.getFactory().fload(4) },
			{ "fload_0", 0x22, InstructionFactory.getFactory().fload_0() },
			{ "fload_1", 0x23, InstructionFactory.getFactory().fload_1() },
			{ "fload_2", 0x24, InstructionFactory.getFactory().fload_2() },
			{ "fload_3", 0x25, InstructionFactory.getFactory().fload_3() },
			{ "fmul", 0x6a, InstructionFactory.getFactory().fmul() },
			{ "fneg", 0x76, InstructionFactory.getFactory().fneg() },
			{ "frem", 0x72, InstructionFactory.getFactory().frem() },
			{ "freturn", 0xae, InstructionFactory.getFactory().freturn() },
			{ "fstore", 0x38, InstructionFactory.getFactory().fstore(4) },
			{ "fstore_0", 0x43, InstructionFactory.getFactory().fstore_0() },
			{ "fstore_1", 0x44, InstructionFactory.getFactory().fstore_1() },
			{ "fstore_2", 0x45, InstructionFactory.getFactory().fstore_2() },
			{ "fstore_3", 0x46, InstructionFactory.getFactory().fstore_3() },
			{ "fsub", 0x66, InstructionFactory.getFactory().fsub() },
			{ "getfield", 0xb4, InstructionFactory.getFactory().getfield("I", "I", "I") },
			{ "getstatic", 0xb2, InstructionFactory.getFactory().getstatic("I", "I", "I") },
			{ "goto", 0xa7, InstructionFactory.getFactory().goto_(1) },
			{ "goto_w", 0xc8, InstructionFactory.getFactory().goto_w(1) },
			{ "i2b", 0x91, InstructionFactory.getFactory().i2b() },
			{ "i2c", 0x92, InstructionFactory.getFactory().i2c() },
			{ "i2d", 0x87, InstructionFactory.getFactory().i2d() },
			{ "i2f", 0x86, InstructionFactory.getFactory().i2f() },
			{ "i2l", 0x85, InstructionFactory.getFactory().i2l() },
			{ "i2s", 0x93, InstructionFactory.getFactory().i2s() },
			{ "iadd", 0x60, InstructionFactory.getFactory().iadd() },
			{ "iaload", 0x2e, InstructionFactory.getFactory().iaload() },
			{ "iand", 0x7e, InstructionFactory.getFactory().iand() },
			{ "iastore", 0x4f, InstructionFactory.getFactory().iastore() },
			{ "iconst_0", 0x3, InstructionFactory.getFactory().iconst_0() },
			{ "iconst_1", 0x4, InstructionFactory.getFactory().iconst_1() },
			{ "iconst_2", 0x5, InstructionFactory.getFactory().iconst_2() },
			{ "iconst_3", 0x6, InstructionFactory.getFactory().iconst_3() },
			{ "iconst_4", 0x7, InstructionFactory.getFactory().iconst_4() },
			{ "iconst_5", 0x8, InstructionFactory.getFactory().iconst_5() },
			{ "iconst_m1", 0x2, InstructionFactory.getFactory().iconst_m1() },
			{ "idiv", 0x6c, InstructionFactory.getFactory().idiv() },
			{ "if_acmpeq", 0xa5, InstructionFactory.getFactory().if_acmpeq(42) },
			{ "if_acmpne", 0xa6, InstructionFactory.getFactory().if_acmpne(42) },
			{ "if_icmpeq", 0x9f, InstructionFactory.getFactory().if_icmpeq(42) },
			{ "if_icmpge", 0xa2, InstructionFactory.getFactory().if_icmpge(42) },
			{ "if_icmpgt", 0xa3, InstructionFactory.getFactory().if_icmpgt(42) },
			{ "if_icmple", 0xa4, InstructionFactory.getFactory().if_icmple(42) },
			{ "if_icmplt", 0xa1, InstructionFactory.getFactory().if_icmplt(42) },
			{ "if_icmpne", 0xa0, InstructionFactory.getFactory().if_icmpne(42) },
			{ "ifeq", 0x99, InstructionFactory.getFactory().ifeq(42) },
			{ "ifge", 0x9c, InstructionFactory.getFactory().ifge(42) },
			{ "ifgt", 0x9d, InstructionFactory.getFactory().ifgt(42) },
			{ "ifle", 0x9e, InstructionFactory.getFactory().ifle(42) },
			{ "iflt", 0x9b, InstructionFactory.getFactory().iflt(42) },
			{ "ifne", 0x9a, InstructionFactory.getFactory().ifne(42) },
			{ "ifnonnull", 0xc7, InstructionFactory.getFactory().ifnonnull(42) },
			{ "ifnull", 0xc6, InstructionFactory.getFactory().ifnull(42) },
			{ "iinc", 0x84, InstructionFactory.getFactory().iinc(2, 2) },
			{ "iload", 0x15, InstructionFactory.getFactory().iload(4) },
			{ "iload_0", 0x1a, InstructionFactory.getFactory().iload_0() },
			{ "iload_1", 0x1b, InstructionFactory.getFactory().iload_1() },
			{ "iload_2", 0x1c, InstructionFactory.getFactory().iload_2() },
			{ "iload_3", 0x1d, InstructionFactory.getFactory().iload_3() },
	//		"impdep1", 0xfe, InstructionFactory.getFactory().impdep1()},
	//		"impdep2", 0xff, InstructionFactory.getFactory().impdep2()},
			{ "imul", 0x68, InstructionFactory.getFactory().imul() },
			{ "ineg", 0x74, InstructionFactory.getFactory().ineg() },
			{ "instanceof", 0xc1, InstructionFactory.getFactory().instanceof_("I") },
			{ "invokedynamic", 0xba, InstructionFactory.getFactory().invokedynamic(42, "()", "()") },
			{ "invokeinterface", 0xb9, InstructionFactory.getFactory().invokeinterface("I", "I", "I") },
			{ "invokespecial", 0xb7, InstructionFactory.getFactory().invokespecial("I", "I", "I") },
			{ "invokestatic", 0xb8, InstructionFactory.getFactory().invokestatic("I", "I", "I") },
			{ "invokevirtual", 0xb6, InstructionFactory.getFactory().invokevirtual("I", "I", "I") },
			{ "ior", 0x80, InstructionFactory.getFactory().ior() },
			{ "irem", 0x70, InstructionFactory.getFactory().irem() },
			{ "ireturn", 0xac, InstructionFactory.getFactory().ireturn() },
			{ "ishl", 0x78, InstructionFactory.getFactory().ishl() },
			{ "ishr", 0x7a, InstructionFactory.getFactory().ishr() },
			{ "istore", 0x36, InstructionFactory.getFactory().istore(4) },
			{ "istore_0", 0x3b, InstructionFactory.getFactory().istore_0() },
			{ "istore_1", 0x3c, InstructionFactory.getFactory().istore_1() },
			{ "istore_2", 0x3d, InstructionFactory.getFactory().istore_2() },
			{ "istore_3", 0x3e, InstructionFactory.getFactory().istore_3() },
			{ "isub", 0x64, InstructionFactory.getFactory().isub() },
			{ "iushr", 0x7c, InstructionFactory.getFactory().iushr() },
			{ "ixor", 0x82, InstructionFactory.getFactory().ixor() },
			{ "jsr", 0xa8, InstructionFactory.getFactory().jsr(4) },
			{ "jsr_w", 0xc9, InstructionFactory.getFactory().jsr_w(4) },
			{ "l2d", 0x8a, InstructionFactory.getFactory().l2d() },
			{ "l2f", 0x89, InstructionFactory.getFactory().l2f() },
			{ "l2i", 0x88, InstructionFactory.getFactory().l2i() },
			{ "ladd", 0x61, InstructionFactory.getFactory().ladd() },
			{ "laload", 0x2f, InstructionFactory.getFactory().laload() },
			{ "land", 0x7f, InstructionFactory.getFactory().land() },
			{ "lastore", 0x50, InstructionFactory.getFactory().lastore() },
			{ "lcmp", 0x94, InstructionFactory.getFactory().lcmp() },
			{ "lconst_0", 0x9, InstructionFactory.getFactory().lconst_0() },
			{ "lconst_1", 0x0a, InstructionFactory.getFactory().lconst_1() },
			{ "ldc", 0x12, InstructionFactory.getFactory().ldc(1) },
			{ "ldc2_w", 0x14, InstructionFactory.getFactory().ldc2_w(1) },
			{ "ldc_w", 0x13, InstructionFactory.getFactory().ldc_w(1) },
			{ "ldiv", 0x6d, InstructionFactory.getFactory().ldiv() },
			{ "lload", 0x16, InstructionFactory.getFactory().lload(4) },
			{ "lload_0", 0x1e, InstructionFactory.getFactory().lload_0() },
			{ "lload_1", 0x1f, InstructionFactory.getFactory().lload_1() },
			{ "lload_2", 0x20, InstructionFactory.getFactory().lload_2() },
			{ "lload_3", 0x21, InstructionFactory.getFactory().lload_3() },
			{ "lmul", 0x69, InstructionFactory.getFactory().lmul() },
			{ "lneg", 0x75, InstructionFactory.getFactory().lneg() },
			{ "lookupswitch", 0xab, InstructionFactory.getFactory().lookupswitch(4, 4) },
			{ "lor", 0x81, InstructionFactory.getFactory().lor() },
			{ "lrem", 0x71, InstructionFactory.getFactory().lrem() },
			{ "lreturn", 0xad, InstructionFactory.getFactory().lreturn() },
			{ "lshl", 0x79, InstructionFactory.getFactory().lshl() },
			{ "lshr", 0x7b, InstructionFactory.getFactory().lshr() },
			{ "lstore", 0x37, InstructionFactory.getFactory().lstore(4) },
			{ "lstore_0", 0x3f, InstructionFactory.getFactory().lstore_0() },
			{ "lstore_1", 0x40, InstructionFactory.getFactory().lstore_1() },
			{ "lstore_2", 0x41, InstructionFactory.getFactory().lstore_2() },
			{ "lstore_3", 0x42, InstructionFactory.getFactory().lstore_3() },
			{ "lsub", 0x65, InstructionFactory.getFactory().lsub() },
			{ "lushr", 0x7d, InstructionFactory.getFactory().lushr() },
			{ "lxor", 0x83, InstructionFactory.getFactory().lxor() },
			{ "monitorenter", 0xc2, InstructionFactory.getFactory().monitorenter() },
			{ "monitorexit", 0xc3, InstructionFactory.getFactory().monitorexit() },
			{ "multianewarray", 0xc5, InstructionFactory.getFactory().multianewarray("I", 4) },
			{ "new", 0xbb, InstructionFactory.getFactory().new_("I") },
			{ "newarray", 0xbc, InstructionFactory.getFactory().newarray(4) },
			{ "nop", 0x0, InstructionFactory.getFactory().nop() },
			{ "pop", 0x57, InstructionFactory.getFactory().pop() },
			{ "pop2", 0x58, InstructionFactory.getFactory().pop2() },
			{ "putfield", 0xb5, InstructionFactory.getFactory().putfield("I", "I", "I") },
			{ "putstatic", 0xb3, InstructionFactory.getFactory().putstatic("I", "I", "I") },
			{ "ret", 0xa9, InstructionFactory.getFactory().ret(4) },
			{ "return", 0xb1, InstructionFactory.getFactory().return_() },
			{ "saload", 0x35, InstructionFactory.getFactory().saload() },
			{ "sastore", 0x56, InstructionFactory.getFactory().sastore() },
			{ "sipush", 0x11, InstructionFactory.getFactory().sipush(4) },
			{ "swap", 0x5f, InstructionFactory.getFactory().swap() },
			{ "tableswitch", 0xaa, InstructionFactory.getFactory().tableswitch(1, 2, 3) },
			{ "wide", 0xc4, InstructionFactory.getFactory().wide() }});
	}

	@Parameter
	public String expectedMnemonic;

	@Parameter(1)
	public int expectedOpCode;

	@Parameter(2)
	public Instruction instr;

	@Test
	public void checkOpCode() throws Exception {
		assertEquals(expectedOpCode, instr.getByteCode());
	}

	@Test
	public void checkMnemonic() throws Exception {
		assertEquals(expectedMnemonic, instr.getMnemonic());
	}
}
