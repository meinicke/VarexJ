//
// Copyright (C) 2006 United States Government as represented by the
// Administrator of the National Aeronautics and Space Administration
// (NASA).  All Rights Reserved.
// 
// This software is distributed under the NASA Open Source Agreement
// (NOSA), version 1.3.  The NOSA has been approved by the Open Source
// Initiative.  See the fileName NOSA-1.3-JPF at the top of the distribution
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
package gov.nasa.jpf.vm;

import gov.nasa.jpf.jvm.bytecode.extended.BiFunction;
import gov.nasa.jpf.jvm.bytecode.extended.Choice;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.Function;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.util.ObjectList;
import gov.nasa.jpf.util.Source;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

/**
 * common root of all JPF bytecode instruction classes
 * 
 */
public abstract class Instruction implements Cloneable {

	protected int insnIndex; // code[] index of instruction
	protected int position; // accumulated bytecode position (prev pos + prev
							// bc-length)
	protected MethodInfo mi; // the method this insn belongs to

	// property/mode specific attributes
	protected Object attr;

	abstract public int getByteCode();

	// to allow a classname and methodname context for each instruction
	public void setContext(String className, String methodName, int lineNumber, int offset) {
	}

	/**
	 * is this the first instruction in a method
	 */
	public boolean isFirstInstruction() {
		return (insnIndex == 0);
	}

	/**
	 * answer if this is a potential loop closing jump
	 */
	public boolean isBackJump() {
		return false;
	}

	/**
	 * is this one of our own, artificial insns?
	 */
	public boolean isExtendedInstruction() {
		return false;
	}

	public MethodInfo getMethodInfo() {
		return mi;
	}

	/**
	 * that's used for explicit construction of MethodInfos (synthetic methods)
	 */
	public void setMethodInfo(MethodInfo mi) {
		this.mi = mi;
	}

	/**
	 * this returns the instruction at the following code insnIndex within the
	 * same method, which might or might not be the next one to enter (branches,
	 * overlay calls etc.).
	 */
	public Instruction getNext() {
		return mi.getInstruction(insnIndex + 1);
	}

	public int getInstructionIndex() {
		return insnIndex;
	}

	public int getPosition() {
		return position;
	}

	public void setLocation(int insnIdx, int pos) {
		insnIndex = insnIdx;
		position = pos;
	}

	/**
	 * return the length in bytes of this instruction. override if this is not 1
	 */
	public int getLength() {
		return 1;
	}

	public Instruction getPrev() {
		if (insnIndex > 0) {
			return mi.getInstruction(insnIndex - 1);
		} else {
			return null;
		}
	}

	/**
	 * this is for listeners that process instructionExecuted(), but need to
	 * determine if there was a CG registration, an overlayed direct call (like
	 * clinit) etc. The easy case is the instruction not having been executed
	 * yet, in which case ti.getNextPC() == null There are two cases for
	 * re-execution: either nextPC was set to the same insn (which is what CG
	 * creators usually use), or somebody just pushed another stackframe that
	 * executes something which will return to the same insn (that is what
	 * automatic <clinit> calls and the like do - we call it overlays)
	 */
	public boolean isCompleted(ThreadInfo ti) {
		Instruction nextPc = ti.getNextPC().getValue();

		if (nextPc == null) {
			return ti.isTerminated();

		} else {

			return (nextPc != this) && (ti.getStackFrameExecuting(this, 1) == null);
		}

		// <2do> how do we account for exceptions?
	}

	/**
	 * this method can be overridden if instruction classes have to store
	 * information for instructionExecuted() notifications, and this information
	 * should not be stored persistent to avoid memory leaks (e.g. via traces).
	 * Called by ThreadInfo.executeInstruction
	 */
	public void cleanupTransients() {
		// nothing here
	}

	public boolean isSchedulingRelevant(SystemState ss, KernelState ks, ThreadInfo ti) {
		return false;
	}

	/**
	 * this is the real workhorse returns next instruction to enter in this
	 * thread
	 * 
	 * <2do> it's unfortunate we roll every side effect into this method,
	 * because it diminishes the value of the 'executeInstruction' notification:
	 * all insns that require some sort of late binding (InvokeVirtual,
	 * GetField, ..) are not yet fully analyzable (e.g. the callee of
	 * InvokeVirtuals is not known yet), putting the burden of duplicating the
	 * related code of enter() in the listener. It would be better if we factor
	 * this 'prepareExecution' out of enter()
	 * 
	 */
	public abstract Conditional<Instruction> execute(FeatureExpr ctx, ThreadInfo ti);

	public String toString() {
		return mi.getFullName() + " " + getMnemonic() + " " + getFilePos();//getPosition();
	}

	public String getMnemonic() {
		String s = getClass().getSimpleName();
		return s.toLowerCase();
	}

	public int getLineNumber() {
		return mi.getLineNumber(this);
	}

	public String getSourceLine() {
		ClassInfo ci = mi.getClassInfo();
		if (ci != null) {
			int line = mi.getLineNumber(this);
			String fileName = ci.getSourceFileName();

			Source src = Source.getSource(fileName);
			if (src != null) {
				String srcLine = src.getLine(line);
				if (srcLine != null) {
					return srcLine;
				}
			}
		}

		return null;
	}

	/**
	 * this is for debugging/logging if we always want something back telling us
	 * where this insn came from
	 */
	public String getSourceOrLocation() {
		ClassInfo ci = mi.getClassInfo();
		if (ci != null) {
			int line = mi.getLineNumber(this);
			String file = ci.getSourceFileName();

			Source src = Source.getSource(file);
			if (src != null) {
				String srcLine = src.getLine(line);
				if (srcLine != null) {
					return srcLine;
				}
			}

			return "(" + file + ':' + line + ')'; // fallback

		} else {
			return "[synthetic] " + mi.getName();
		}
	}

	/**
	 * this returns a "pathname:line" string
	 */
	public String getFileLocation() {
		ClassInfo ci = mi.getClassInfo();
		if (ci != null) {
			int line = mi.getLineNumber(this);
			String fname = ci.getSourceFileName();
			return (fname + ':' + line);
		} else {
			return "[synthetic] " + mi.getName();
		}
	}

	/**
	 * this returns a "filename:line" string
	 */
	public String getFilePos() {
		String file = null;
		int line = -1;
		ClassInfo ci = mi.getClassInfo();

		if (ci != null) {
			line = mi.getLineNumber(this);
			file = ci.getSourceFileName();
			if (file != null) {
				int i = file.lastIndexOf('/'); // ClassInfo.sourceFileName is
												// using '/'
				if (i >= 0) {
					file = file.substring(i + 1);
				}
			}
		}

		if (file != null) {
			if (line != -1) {
				return (file + ':' + line);
			} else {
				return file;
			}
		} else {
			return ("pc " + position);
		}
	}

	/**
	 * this returns a "class.method(line)" string
	 */
	public String getSourceLocation() {
		ClassInfo ci = mi.getClassInfo();

		if (ci != null) {
			String s = ci.getName() + '.' + mi.getName() + '(' + getFilePos() + ')';
			return s;

		} else {
			return null;
		}
	}

	public void init(MethodInfo mi, int offset, int position) {
		this.mi = mi;
		this.insnIndex = offset;
		this.position = position;
	}

	/**
	 * this is a misnomer - we actually push the clinit calls here in case we
	 * need some. 'causedClinitCalls' might be more appropriate, but it is used
	 * in a number of external projects
	 */
	public boolean requiresClinitExecution(ThreadInfo ti, ClassInfo ci) {
		return ci.pushRequiredClinits(ti);
	}

	/**
	 * this is returning the next Instruction to enter, to be called to obtain
	 * the return value of enter() if this is not a branch insn
	 *
	 * Be aware of that we might have had exceptions caused by our execution (->
	 * lower frame), or we might have had overlaid calls (-> higher frame), i.e.
	 * we can't simply assume it's the following insn. We have to acquire this
	 * through the top frame of the ThreadInfo.
	 *
	 * note: the System.exit() problem should be gone, now that it is
	 * implemented as ThreadInfo state (TERMINATED), rather than purged stacks
	 */
	public Conditional<Instruction> getNext(final FeatureExpr ctx, ThreadInfo ti) {
		return ti.getPC().mapf(ctx, new BiFunction<FeatureExpr, Instruction, Conditional<Instruction>>() {

			@Override
			public Conditional<Instruction> apply(FeatureExpr f, Instruction y) {
				if (f.isContradiction()) {
					return new One<>(y);
				}
				if (f.isTautology()) {
					return new One<>(y.getNext());
				}
//				if (f.equivalentTo(f.and(ctx))) {
//					return new One<>(y.getNext());
//				}
//				if (f.equivalentTo(f.andNot(ctx))) {
//					return new One<>(y);
//				}
				return new Choice<>(f, new One<>(y.getNext()), new One<>(y));
			}

		}).simplify();
	}

	// --- the generic attribute API

	public boolean hasAttr() {
		return (attr != null);
	}

	public boolean hasAttr(Class<?> attrType) {
		return ObjectList.containsType(attr, attrType);
	}

	/**
	 * this returns all of them - use either if you know there will be only one
	 * attribute at a time, or check/process result with ObjectList
	 */
	public Object getAttr() {
		return attr;
	}

	/**
	 * this replaces all of them - use only if you know - there will be only one
	 * attribute at a time - you obtained the value you set by a previous
	 * getXAttr() - you constructed a multi value list with
	 * ObjectList.createList()
	 */
	public void setAttr(Object a) {
		attr = ObjectList.set(attr, a);
	}

	public void addAttr(Object a) {
		attr = ObjectList.add(attr, a);
	}

	public void removeAttr(Object a) {
		attr = ObjectList.remove(attr, a);
	}

	public void replaceAttr(Object oldAttr, Object newAttr) {
		attr = ObjectList.replace(attr, oldAttr, newAttr);
	}

	/**
	 * this only returns the first attr of this type, there can be more if you
	 * don't use client private types or the provided type is too general
	 */
	public <T> T getAttr(Class<T> attrType) {
		return ObjectList.getFirst(attr, attrType);
	}

	public <T> T getNextAttr(Class<T> attrType, Object prev) {
		return ObjectList.getNext(attr, attrType, prev);
	}

	public ObjectList.Iterator attrIterator() {
		return ObjectList.iterator(attr);
	}

	public <T> ObjectList.TypedIterator<T> attrIterator(Class<T> attrType) {
		return ObjectList.typedIterator(attr, attrType);
	}

	// -- end attrs --

	/**
	 * this is overridden by any Instruction that use a cache for class or
	 * method to provide a type safe cloning
	 */
	public Instruction typeSafeClone(MethodInfo mi) {
		Instruction clone = null;

		try {
			clone = (Instruction) super.clone();

			// reset the method that this insn belongs to
			clone.mi = mi;
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		return clone;
	}

	protected <T, U> Conditional<T> mapr(final Conditional<T> v1, final Conditional<U> v2) {
		return v2.mapr(new Function<U, Conditional<T>>() {

			@Override
			public Conditional<T> apply(final U x2) {
				return mapr2(v1, x2);
			}

		}).simplify();
	}

	protected <T, U> Conditional<T> mapr2(final Conditional<T> v1, final U v2) {
		return v1.mapr(new Function<T, Conditional<T>>() {

			@SuppressWarnings("unchecked")
			@Override
			public Conditional<T> apply(final T x1) {
				return new One<>((T) instruction((Number)x1, (Number)v2));
			}

		}).simplify();
	}

	protected Number instruction(Number v1, Number v2) {
		throw new RuntimeException("apply not implemented");
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (o == this) {
			return true;
		}
		
//		if (o.getClass().equals(getClass()) && o instanceof Instruction) {
//			if (insnIndex == ((Instruction)o).insnIndex &&
//					position == ((Instruction)o).position  &&
//					mi == ((Instruction)o).mi) {
//				return true;
//			}
//		}
		
		return false;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = hash * 31 + insnIndex;
		hash = hash * 31 + position;
		return hash * 31;
	}
}
