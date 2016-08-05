//
// Copyright (C) 2010 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
//
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the file NOSA-1.3-JPF at the top of the distribution
// directory tree for the complete NOSA document.
//
// THE SUBJECT SOFTWARE IS PROVIDED "AS IS" WITHOUT ANY WARRANTY OF ANY
// KIND, EITHER EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT
// LIMITED TO, ANY WARRANTY THAT THE SUBJECT SOFTWARE WILL CONFORM TO
// SPECIFICATIONS, ANY IMPLIED WARRANTIES OF MERCHANTABILITY, FITNESS FOR
// A PARTICULAR PURPOSE, OR FREEDOM FROM INFRINGEMENT, ANY WARRANTY THAT
// THE SUBJECT SOFTWARE WILL BE ERROR FREE, OR ANY WARRANTY THAT
// DOCUMENTATION, IF PROVIDED, WILL CONFORM TO THE SUBJECT SOFTWARE.
//

package gov.nasa.jpf.jvm.bytecode;

import cmu.conditional.Conditional;
import cmu.conditional.Function;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.vm.Instruction;
import gov.nasa.jpf.vm.NativeStackFrame;
import gov.nasa.jpf.vm.StackFrame;
import gov.nasa.jpf.vm.ThreadInfo;
import gov.nasa.jpf.vm.Types;

/**
 * synthetic return instruction for native method invocations, so that
 * we don't have to do special provisions to copy the caller args in case
 * a post exec listener wants them.
 */
public class NATIVERETURN extends ReturnInstruction {

	Object ret;
	Object retAttr;
	Byte retType;

	// this is more simple than a normal ReturnInstruction because NativeMethodInfos
	// are not synchronized, and NativeStackFrames are never the first frame in a thread
	@Override
	public Conditional<Instruction> execute(FeatureExpr ctx, ThreadInfo ti) {
		if (!ti.isFirstStepInsn()) {
			ti.leave(); // takes care of unlocking before potentially creating a CG
			// NativeMethodInfo is never synchronized, so no thread CG here
		}

		StackFrame frame = ti.getModifiableTopFrame();
		getAndSaveReturnValue(frame, ctx);

		// NativeStackFrame can never can be the first stack frame, so no thread CG

		frame = ti.popAndGetModifiableTopFrame(ctx);

		// remove args, push return value and continue with next insn

		frame.removeArguments(ctx, mi);
		pushReturnValue(ctx, frame);

		if (retAttr != null) {
			setReturnAttr(ti, retAttr);
		}

		return getNext(ctx, ti);
	}

	@Override
	public void cleanupTransients() {
		ret = null;
		retAttr = null;
		returnFrame = null;
	}

	@Override
	public boolean isExtendedInstruction() {
		return true;
	}

	public static final int OPCODE = 260;

	@Override
	public int getByteCode() {
		return OPCODE;
	}

	@Override
	public void accept(InstructionVisitor insVisitor) {
		insVisitor.visit(this);
	}

	@Override
	protected void getAndSaveReturnValue(StackFrame frame, FeatureExpr ctx) {
		// it's got to be a NativeStackFrame since this insn is created by JPF
		NativeStackFrame nativeFrame = (NativeStackFrame) frame;

		returnFrame = nativeFrame;

		ret = nativeFrame.getReturnValue();
		retAttr = nativeFrame.getReturnAttr();
		retType = nativeFrame.getMethodInfo().getReturnTypeCode();
	}

	public int getReturnTypeSize() {
		switch (retType) {
		case Types.T_BOOLEAN:
		case Types.T_BYTE:
		case Types.T_CHAR:
		case Types.T_SHORT:
		case Types.T_INT:
		case Types.T_FLOAT:
			return 1;

		case Types.T_LONG:
		case Types.T_DOUBLE:
			return 2;

		default:
			return 1;
		}
	}

	// this is only called internally right before we return
	protected Object getReturnedOperandAttr(FeatureExpr ctx, StackFrame frame) {
		return retAttr;
	}

	// <2do> this should use the getResult..() methods of NativeStackFrame

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	protected void pushReturnValue(FeatureExpr ctx, StackFrame fr) {
		int retSize = 1;

		// in case of a return type mismatch, we get a ClassCastException, which
		// is handled in executeMethod() and reported as a InvocationTargetException
		// (not completely accurate, but we rather go with safety)
		if (ret != null) {
			switch (retType) {
			case Types.T_BOOLEAN:
				if (ret instanceof Conditional) {
					Conditional<Integer> ival = ((Conditional) ret).mapr(new Function<Object, Conditional<Integer>>() {

						@Override
						public Conditional<Integer> apply(Object ret) {
							return One.valueOf(Types.booleanToInt(((Boolean) ret).booleanValue()));
						}
						
					});
					fr.push(ctx, ival);
				} else {
					int ival = Types.booleanToInt(((Boolean) ret).booleanValue());
					fr.push(ctx, One.valueOf(ival));
				}
				break;

			case Types.T_BYTE:
				fr.push(ctx, One.valueOf((int) (((Byte) ret).byteValue())));
				break;

			case Types.T_CHAR:
				if (ret instanceof Conditional) {
					Conditional<Integer> ival = ((Conditional) ret).mapr(new Function<Object, Conditional<Integer>>() {

						@Override
						public Conditional<Integer> apply(Object ret) {
							return new One<>((int) ((Character) ret).charValue());
						}
						
					});
					fr.push(ctx, ival);
				} else {
					fr.push(ctx, One.valueOf((int) ((Character) ret).charValue()));
				}
				break;

			case Types.T_SHORT:
				fr.push(ctx, new One<>((int) ((Short) ret).shortValue()));
				break;

			case Types.T_INT:
				if (ret instanceof Conditional) {
					fr.push(ctx, (Conditional) ret);
				} else {
					fr.push(ctx, new One<>(((Integer) ret)));
				}
				break;

			case Types.T_LONG:
				if (ret instanceof Conditional) {
					fr.push(ctx, ((Conditional) ret));
				} else {
					fr.push(ctx, new One<>((Long) ret));
					retSize = 2;
				}
				retSize = 2;
				break;

			case Types.T_FLOAT:
				if (ret instanceof Conditional) {
					fr.push(ctx, ((Conditional) ret).map(new Function<Float, Integer>() {

						@Override
						public Integer apply(Float x) {
							return Types.floatToInt(x);
						}

					}));

				} else {
					fr.push(ctx, new One<>(Types.floatToInt((Float) ret)));
				}
				break;

			case Types.T_DOUBLE:
				if (ret instanceof Conditional) {
					fr.push(ctx, ((Conditional) ret).map(new Function<Double, Long>() {

						@Override
						public Long apply(Double x) {
							return Types.doubleToLong(x);
						}

					}));
				} else {
					long lval = Types.doubleToLong(((Double) ret).doubleValue());
					fr.push(ctx, new One<>(lval));
					
				}
				retSize = 2;
				break;
			case Types.T_VOID:
				return;
			default:
				// everything else is supposed to be a reference
//				System.out.println(retType);
				if (new One<>(null).equals(ret)) {
					System.out.println("RETURN");
					return;
				}
				if (ret instanceof Conditional) {
					if (((Conditional) ret).isOne()) {
						if (((Conditional) ret).getValue() == null) {
							return;
						}
					}
					fr.push(ctx, (Conditional) ret, true);
				} else {
					fr.push(ctx, ((Integer) ret).intValue(), true);
				}
			}

			if (retAttr != null) {
				if (retSize == 1) {
					fr.setOperandAttr(retAttr);
				} else {
					fr.setLongOperandAttr(retAttr);
				}
			}
		}
	}

	@Override
	public Object getReturnAttr(ThreadInfo ti) {
		if (isCompleted(ti)) {
			return retAttr;
		} else {
			NativeStackFrame nativeFrame = (NativeStackFrame) ti.getTopFrame();
			return nativeFrame.getReturnAttr();
		}
	}

	@Override
	public Object getReturnValue(FeatureExpr ctx, ThreadInfo ti) {
		if (isCompleted(ti)) {
			return ret;
		} else {
			NativeStackFrame nativeFrame = (NativeStackFrame) ti.getTopFrame();
			return nativeFrame.getReturnValue();
		}
	}

	// public String toString(){
	// StringBuilder sb = new StringBuilder();
	// sb.append(super.toString());
	// sb.append(" ");
	// sb.append(mi.getFullName());
	//
	// return sb.toString();
	// }

}
