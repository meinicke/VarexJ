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

package gov.nasa.jpf.vm;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiFunction;

import cmu.conditional.ChoiceFactory;
import cmu.conditional.Conditional;
import cmu.conditional.IChoice;
import cmu.conditional.One;
import cmu.utils.RuntimeConstants;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import gov.nasa.jpf.JPF;
import gov.nasa.jpf.JPFNativePeerException;
import gov.nasa.jpf.jvm.bytecode.EXCEPTION;
import gov.nasa.jpf.util.JPFLogger;

/**
 * a MethodInfo for a native peer executed method
 */
public class NativeMethodInfo extends MethodInfo {

	static JPFLogger logger = JPF.getLogger("gov.nasa.jpf.vm.NativePeer");

	static final int MAX_NARGS = 6;
	static Object[][] argCache;

	static {
		argCache = new Object[MAX_NARGS][];

		for (int i = 0; i < MAX_NARGS; i++) {
			argCache[i] = new Object[i];
		}
	}

	protected Method mth; // the native method to enter in lieu
	protected NativePeer peer;

	public NativeMethodInfo(MethodInfo mi, Method mth, NativePeer peer) {
		super(mi); // <2do> do we want any operands or locals?

		this.peer = peer;
		this.mth = mth;

		ci.setNativeCallCode(this);
	}

	public void replace(MethodInfo mi) {
		mthTable.set(mi.globalId, this);
		mi.ci.putDeclaredMethod(this);
	}

	@Override
	public boolean isUnresolvedNativeMethod() {
		// we are already a NativeMethodInfo
		return false;
	}

	@Override
	public boolean isMJI() {
		return true;
	}

	public boolean hasEmptyBody() {
		// how would we know
		return false;
	}

	public NativePeer getNativePeer() {
		return peer;
	}

	public Method getMethod() {
		return mth;
	}

	@Override
	public String getStackTraceSource() {
		if (peer != null) {
			return peer.getPeerClassName();
		} else {
			return "no peer";
		}
	}

	@Override
	public int getLineNumber(Instruction pc) {
		return -1; // we have no line numbers
	}
	
	public Conditional<Instruction> executeNative(final FeatureExpr ctx, ThreadInfo ti) {
		Object ret = null;
		Object[] args = null;
		MJIEnv env = ti.getMJIEnv();

		NativeStackFrame nativeFrame = (NativeStackFrame) ti.getTopFrame();

		env.setCallEnvironment(this);

		if (isUnsatisfiedLinkError(env)) {
			return new One<>(ti.createAndThrowException(ctx, "java.lang.UnsatisfiedLinkError", "cannot find native " + ci.getName() + '.' + getName()));
		}

		try {
			args = nativeFrame.getArguments();
			if (RuntimeConstants.debug) {
				System.out.print("RUN " + name + " " + mth.toString());
				for (Object a : args) {
					System.out.print(" " + a.toString());
				}
				System.out.println();
			}

			// this is the reflection call into the native peer
			
			boolean supportsConditional = false;
			for (Class<?> t : mth.getParameterTypes()) {
				if (t.equals(Conditional.class)) {
					supportsConditional = true;
				}
			}
			
			boolean handled = false;
			if (!supportsConditional) {
				int i = 0;
				for (Object a : args) {
					if (a instanceof One) {
						args[i++] = ((One<?>) a).getValue();
					} else if (a instanceof IChoice) {
						// Entry for n-handler with conditional arguments
						Conditional<Object[]> unconditionalArgs = getUnconditionalArgs(args);
						ret = unconditionalArgs.mapf(ctx, new BiFunction<FeatureExpr, Object[], Conditional<Object>>() {

							@SuppressWarnings("unchecked")
							@Override
							public Conditional<Object> apply(FeatureExpr ctx, Object[] args) {
								try {
									Object returnValue = mth.invoke(peer, args);
									if (returnValue instanceof Conditional) {
										return (Conditional<Object>)returnValue;
									}
									return new One<>(returnValue);
								} catch (IllegalAccessException | InvocationTargetException e) {
									System.err.println(mth);
									for (Object a : args) {
										System.err.println(a.toString());
									}
									throw new RuntimeException(e);
								}
							}
							
						});
						handled = true;
						break;	
					} else {
						args[i++] = a;
					}
				}
			}
			try {
				if (!handled) {
					if (mth.getParameterTypes()[1].isPrimitive()) {
						if (args[1] instanceof One) {
							args[1] = ((One<?>)args[1]).getValue();
						}
						try {
							ret = mth.invoke(peer, args);
						} catch (IllegalArgumentException e) {
							System.err.println(mth + " - " + Arrays.toString(args));
							throw e;
						}
					} else {
						ret = mth.invoke(peer, args);
					}
				}
			} catch (IllegalAccessException e) {
				System.err.println(mth);
				for (Object a : args) {
					System.err.println(a.toString());
				}
				throw e;
			}
			
			if (env.hasException()) {
				// even though we should prefer throwing normal exceptionHandlers,
				// sometimes it might be better/required to explicitly throw
				// something that's not wrapped into a InvocationTargetException
				// (e.g. InterruptedException), which is why there still is a
				// MJIEnv.throwException()
				return new One<>(ti.throwException(ctx, env.popException()));
			}

			StackFrame top = ti.getTopFrame();
			if (top == nativeFrame) { // no roundtrips, straight return

				if (env.isInvocationRepeated()) {
					// don't advance
					return new One<>(nativeFrame.getPC().getValue());

				} else {
					// we don't have to do a ti.topClone() because the last insn left
					// is NATIVERETURN. Even if a listener creates a CG on it, it won't
					// modify its StackFrame, which is then popped anyways

					nativeFrame.setReturnValue(ret);
					nativeFrame.setReturnAttr(env.getReturnAttribute());

					return nativeFrame.getPC().mapf(ctx, new BiFunction<FeatureExpr, Instruction, Conditional<Instruction>>() {

						@Override
						public Conditional<Instruction> apply(FeatureExpr f, Instruction y) {
							if (Conditional.isContradiction(f)) {
								return new One<>(y);
							}
							if (Conditional.isTautology(f)) {
								return new One<>(y.getNext());
							}
							return ChoiceFactory.create(ctx, new One<>(y.getNext()), new One<>(y));
						}

					}).simplify();

					// return nativeFrame.getPC().getValue().getNext(); // that should be the NATIVERETURN
				}

			} else {
				// direct calls from within the native method, i.e. nativeFrame is not
				// on top anymore, but its current instruction (invoke) will be reexecuted
				// because DirectCallStackFrames don't advance the pc of the new top top upon return
				return top.getPC();
			}

		} catch (IllegalArgumentException iax) {
			logger.warning(iax.toString());
			for (StackTraceElement method : iax.getStackTrace()) {
				System.err.println(method);
			}
			return new One<>(ti.createAndThrowException(ctx, "java.lang.IllegalArgumentException", "calling " + ci.getName() + '.' + getName()));
		} catch (IllegalAccessException ilax) {
			logger.warning(ilax.toString());
			return new One<>(ti.createAndThrowException(ctx, "java.lang.IllegalAccessException", "calling " + ci.getName() + '.' + getName()));
		} catch (InvocationTargetException itx) {

			// if loading a class throws an exception
			if (itx.getTargetException() instanceof ClassInfoException) {
				ClassInfoException cie = (ClassInfoException) itx.getTargetException();
				return new One<>(new EXCEPTION(cie.getExceptionClass().toString(), cie.getMessage()));
			}

			if (itx.getTargetException() instanceof UncaughtException) { // Native methods could
				throw (UncaughtException) itx.getTargetException();
			}
			
			// this will catch all exceptionHandlers thrown by the native method execution
			// we don't try to hand them back to the application
			throw new JPFNativePeerException("exception in native method " + ci.getName() + '.' + getName(), itx.getTargetException());
		}
	}
	
	/**
	 * Transforms arguments with conditional values to unconditional values.
	 */
	public static Conditional<Object[]> getUnconditionalArgs(Object[] args) {
		List<Object[]> unconditionalArgs = new LinkedList<>();
		Object[] initialObject = new Object[args.length];
		initialObject[args.length - 1] = args[args.length - 1]; 
		unconditionalArgs.add(initialObject);
		
		int index = 0;
		for (Object arg : args) {
			unconditionalArgs = insertArgs(unconditionalArgs, arg, index++);
		}
		return toChoice(unconditionalArgs);
	}

	/**
	 * Inserts all entries of the probably conditional argument arg at the given index position.
	 * 
	 */
	private static List<Object[]> insertArgs(List<Object[]> unconditionalArgs, Object arg, int index) {
		final List<Object[]> newArgs = new LinkedList<>();
		if (arg instanceof Conditional) {
			Map<?, FeatureExpr> map = ((Conditional<?>) arg).toMap();
			for (Entry<?, FeatureExpr> e : map.entrySet()) {
				for (Object[] args : unconditionalArgs) {
					FeatureExpr ctx = ((FeatureExpr)args[args.length - 1]).and(e.getValue());
					if (!Conditional.isContradiction(ctx)) {
						Object[] copy = copy(args);
						copy[index] = e.getKey();
						copy[copy.length -1] = ctx;
						newArgs.add(copy);
					}
				}
			}
		} else if (arg instanceof FeatureExpr) {
			return unconditionalArgs;
		} else {
			for (Object[] args : unconditionalArgs) {
				Object[] copy = copy(args);
				copy[index] = arg;
				newArgs.add(copy);
			}
		}
		return newArgs;
	}
	
	/**
	 * Transforms the list of arguments to a choice of unconditional arguments.<br>
	 * The last argument is used as context.
	 */
	private static Conditional<Object[]> toChoice(final List<Object[]> unconditionalArgs) {
		Conditional<Object[]> result = null;
		for (Object[] args : unconditionalArgs) {
			if (result == null) {
				result = new One<>(args);
			} else {
				result = ChoiceFactory.create((FeatureExpr)args[args.length - 1], new One<>(args), result);
			}
		}
		return result;
	}

	private static Object[] copy(Object[] args) {
		Object[] copy = new Object[args.length];
		System.arraycopy(args, 0, copy, 0, args.length);
		return copy;
	}

	protected boolean isUnsatisfiedLinkError(MJIEnv env) {
		return (mth == null);
	}

	/**
	 * Get and convert the native method parameters off the ThreadInfo stack.
	 * Use the MethodInfo parameter type info for this (not the reflect.Method
	 * type array), or otherwise we won't have any type check
	 */
	protected Object[] getArguments(ThreadInfo ti) {
		// these are just local refs to speed up
		int nArgs = getNumberOfArguments();
		byte[] argTypes = getArgumentTypes();

		// Object[] a = getArgArray(nArgs + 2);
		Object[] a = new Object[nArgs + 2];

		int stackOffset;
		int i, j, k;
		int ival;
		long lval;
		StackFrame caller = ti.getTopFrame();

		for (i = 0, stackOffset = 0, j = nArgs + 1, k = nArgs - 1; i < nArgs; i++, j--, k--) {
			switch (argTypes[k]) {
			case Types.T_BOOLEAN:
				ival = caller.peek(FeatureExprFactory.True(), stackOffset).getValue();
				a[j] = Boolean.valueOf(Types.intToBoolean(ival));

				break;

			case Types.T_BYTE:
				ival = caller.peek(FeatureExprFactory.True(), stackOffset).getValue();
				a[j] = Byte.valueOf((byte) ival);

				break;

			case Types.T_CHAR:
				ival = caller.peek(FeatureExprFactory.True(), stackOffset).getValue();
				a[j] = Character.valueOf((char) ival);

				break;

			case Types.T_SHORT:
				ival = caller.peek(FeatureExprFactory.True(), stackOffset).getValue();
				a[j] = new Short((short) ival);

				break;

			case Types.T_INT:
				ival = caller.peek(FeatureExprFactory.True(), stackOffset).getValue();
				a[j] = new Integer(ival);

				break;

			case Types.T_LONG:
				lval = caller.peekLong(FeatureExprFactory.True(), stackOffset).getValue();
				stackOffset++; // 2 stack words
				a[j] = new Long(lval);

				break;

			case Types.T_FLOAT:
				ival = caller.peek(FeatureExprFactory.True(), stackOffset).getValue();
				a[j] = new Float(Types.intToFloat(ival));

				break;

			case Types.T_DOUBLE:
				lval = caller.peekLong(FeatureExprFactory.True(), stackOffset).getValue();
				stackOffset++; // 2 stack words
				a[j] = Double.valueOf(Types.longToDouble(lval));

				break;

			default:
				// NOTE - we have to store T_REFERENCE as an Integer, because
				// it shows up in our native method as an 'int'
				ival = caller.peek(FeatureExprFactory.True(), stackOffset).getValue();
				a[j] = new Integer(ival);
			}

			stackOffset++;
		}

		// --- set our standard MJI header arguments
		if (isStatic()) {
			a[1] = new Integer(ci.getClassObjectRef());
		} else {
			a[1] = new Integer(ti.getCalleeThis(this));
		}

		a[0] = ti.getMJIEnv();

		return a;
	}
}
