package gov.nasa.jpf.vm;

import gov.nasa.jpf.jvm.bytecode.extended.BiFunction;
import gov.nasa.jpf.jvm.bytecode.extended.Choice;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.Function;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

// TODO replace by interface
public class StackHandler {
	
	enum Type {
		INT, FLOAT, LONG, DOUBLE
	}
	
	enum StackInstruction {
		DUP_X1, DUP2_X2, DUP2_X1, DUP2, DUP, DUP_X2, SWAP
	}

	/** Locals are directly accessed with index **/
	private Conditional<Entry>[] locals;

	public Conditional<Stack> stack;

	public int length = 0;

	public int getStackWidth() {
		return stack.toList().size();
	}

	@Override
	public String toString() {
		StringBuilder string = new StringBuilder();
		string.append("Locals: [");

		for (int i = 0; i < locals.length; i++) {
			if (locals[i] == null) {
				string.append("null");
			} else {
				string.append(locals[i].toString());
			}
			string.append(" ");
		}
		string.append("] Stack: ");
		string.append(stack.toString());
		return string.toString();
	}

	@SuppressWarnings("unchecked")
	public StackHandler(int nLocals, int nOperands) {
		length = nLocals + nOperands;
		locals = new Conditional[nLocals];
		stack = new One<>(new Stack(nOperands));
	}

	@SuppressWarnings("unchecked")
	public StackHandler() {
		stack = new One<>(new Stack(0));
		locals = new Conditional[0];
	}

	@SuppressWarnings("unchecked")
	public StackHandler clone() {
		StackHandler clone = new StackHandler();
		clone.length = length;
		clone.locals = new Conditional[locals.length];
		for (int i = 0; i < locals.length; i++) {
			Conditional<Entry> local = locals[i];
			if (local != null) {
				clone.locals[i] = local.map(new Function<Entry, Entry>() {
	
					@Override
					public Entry apply(Entry entry) {
						return entry.copy();
					}
	
				});
			}
		}

		clone.stack = stack.map(new Function<Stack, Stack>() {

			@Override
			public Stack apply(Stack stack) {
				return stack.copy();
			}

		});
		return clone;
	}

	/*
	 * ############################################################
	 * 
	 * Handling of local variables
	 * 
	 * ############################################################
	 */

	/**
	 * Pushes the local variable at the index position to the stack.
	 * 
	 * @param index
	 *            The index of the local variable
	 */
	public <T> void pushLocal(FeatureExpr ctx, int index) {
		Conditional<Entry> value = locals[index];
		if (value == null) {
			value = new One<>(new Entry(MJIEnv.NULL, false));
		}
		value.mapf(ctx, new BiFunction<FeatureExpr, Entry, Conditional<T>>() {

			@Override
			public Conditional<T> apply(FeatureExpr ctx, Entry entry) {
				push(ctx, entry.value, entry.isRef);
				return null;
			}
		});
	}
	

	public <T> void pushLongLocal(FeatureExpr ctx, int index) {
		Conditional<Entry> value = locals[index];
		if (value == null) {
			value = new One<>(new Entry(0, false));
		}
		value.mapf(ctx, new BiFunction<FeatureExpr, Entry, Conditional<T>>() {

			@Override
			public Conditional<T> apply(FeatureExpr ctx, Entry entry) {
				push(ctx, entry.value, false);
				return null;
			}
		});
		value = locals[index + 1];
		if (value == null) {
			value = new One<>(new Entry(0, false));
		}
		value.mapf(ctx, new BiFunction<FeatureExpr, Entry, Conditional<T>>() {

			@Override
			public Conditional<T> apply(FeatureExpr ctx, Entry entry) {
				push(ctx, entry.value, false);
				return null;
			}
		});
	}

	/**
	 * Pops the top value and saves it at the index position.
	 * 
	 * @param ctx
	 * @param index
	 *            The index of the local variable
	 */
	public <T> void storeOperand(final FeatureExpr ctx, final int index) {
		locals[index] = stack.simplify(ctx).mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Entry>>() {

			@Override
			public Conditional<Entry> apply(FeatureExpr f, Stack stack) {
				Conditional<Entry> oldValue = locals[index];
				if (oldValue == null) {
					oldValue = new One<>(new Entry(MJIEnv.NULL, false));
				}
				if (f.and(ctx).isContradiction()) {
					return oldValue;
				}
				if (f.and(ctx).isTautology()) {
					boolean isRef = stack.isRef(0);
					return new One<>(new Entry(stack.pop(), isRef));
				}
				if (f.equivalentTo(f.and(ctx))) {
					boolean isRef = stack.isRef(0);
					return new One<>(new Entry(stack.pop(), isRef));
				}
				if (f.equivalentTo(f.andNot(ctx))) {
					return oldValue;
				}
				;
				boolean isRef = stack.isRef(0);
				return new Choice<>(ctx, new One<>(new Entry(stack.pop(), isRef)), oldValue);
			}
		}).simplify();
		stack = stack.simplify();
	}
	
	public void storeLongOperand(final FeatureExpr ctx, final int index) {
		stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Entry>>() {

			@Override
			public Conditional<Entry> apply(FeatureExpr f, Stack stack) {
				locals[index + 1] = new Choice<>(ctx, new One<>(new Entry(stack.pop(), false)), locals[index + 1]).simplify();
				locals[index] = new Choice<>(ctx, new One<>(new Entry(stack.pop(), false)), locals[index]).simplify();
				return null;
			}
		});
		stack = stack.simplify();
	}

	// TODO remove
	public void setLocal(final int index, final int value, final boolean isRef) {
		locals[index] = new One<>(new Entry(value, isRef));
	}

	

	public void setLocal(FeatureExpr ctx, final int index, final Conditional<Integer> value, final boolean isRef) {
		value.mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr x, Integer value) {
				setLocal(x, index, value, isRef);
				return null;
			}

		});
	}
	
	public void setLocal(final FeatureExpr ctx, final int index, final int value, final boolean isRef) {
		locals[index] = new Choice<>(ctx, new One<>(new Entry(value, isRef)), locals[index]).simplify();
	}

	public Conditional<Integer> getLocal(FeatureExpr ctx, final int index) {
		if (index < 0) {
			return new One<>(-1);
		}
		if (index < locals.length) {
			if (locals[index] == null) {
				return new One<>(MJIEnv.NULL);
			}
			return locals[index].simplify(ctx).map(new Function<Entry, Integer>() {
	
				@Override
				public Integer apply(Entry x) {
					if (x == null) {
						return MJIEnv.NULL;
					}
					return x.value;
				}
	
			}).simplify();
		} else {
			final int i = index - locals.length;
			return stack.map(new Function<Stack, Integer>(){

				@Override
				public Integer apply(Stack stack) {
					return stack.get(i);
				}
				
			});
		}
	}

	
	// TODO remove
	public boolean isRefLocal(final int index) {
		if (index < 0) {
			return false;
		}
		
		if (index < locals.length) {
			if (locals[index] == null) {
				return false;
			}
			return locals[index].mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Entry, Conditional<Boolean>>() {
	
				@Override
				public Conditional<Boolean> apply(FeatureExpr x, Entry y) {
					return new One<>(y.isRef);
				}
			}).simplify().getValue();
		} else {
			final int i = index - locals.length;
			return stack.map(new Function<Stack, Boolean>() {

				@Override
				public Boolean apply(Stack stack) {
					return stack.isRefIndex(i);
				}
				
			}).getValue();
		}
	}

	// TODO check calls, might iterate over stack, too.
	// TODO change to conditional
	public boolean isRefLocal(FeatureExpr ctx, final int index) {
		if (index < 0) {
			return false;
		}
		
		if (index < locals.length) {
			if (locals[index] == null) {
				return false;
			}
			return locals[index].simplify(ctx).mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Entry, Conditional<Boolean>>() {
	
				@Override
				public Conditional<Boolean> apply(FeatureExpr x, Entry y) {
					return new One<>(y.isRef);
				}
			}).simplify().getValue();
		} else {
			final int i = index - locals.length;
			return stack.map(new Function<Stack, Boolean>() {

				@Override
				public Boolean apply(Stack stack) {
					return stack.isRefIndex(i);
				}
				
			}).getValue();
		}
	}

	/*
	 * #######################################################
	 * 
	 * Handling of the stack
	 * 
	 * ########################################################
	 */

	public <T> void push(final FeatureExpr ctx, final T value) {
		push(ctx, value, false);
	}
	
	/**
	 * 
	 * @param ctx
	 * @param value Can be a {@link Conditional}, or an int, double, or long. 
	 * @param isRef Sets the new value to be a reference or not.
	 */
	@SuppressWarnings("unchecked")
	public <T,U> void push(final FeatureExpr ctx, final T value, final boolean isRef) {
		if (value instanceof Conditional) {
			((Conditional<U>) value).simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, U, Conditional<U>>() {

				@Override
				public Conditional<U> apply(FeatureExpr ctx, U value) {
					push(ctx, value, isRef);
					return null;
				}

			});

			return;
		}
		
		stack = stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr f, Stack stack) {
				if (f.and(ctx).isContradiction()) {
					return new One<>(stack);
				}
				Stack clone = stack.copy();
				if (value instanceof Integer) {
					clone.push((Integer) value, isRef);
				} else if (value instanceof Long) {
					long v = ((Long) value).longValue();
					clone.push((int) (v>>32), isRef);
					clone.push((int) v, isRef);
				} else if (value instanceof Double) {
					long l = Double.doubleToLongBits((Double)value);
					clone.push((int) (l>>32), isRef);
					clone.push((int) l, isRef);
				} else if (value instanceof Float) {
					float v = (Float) value;
					clone.push(Float.floatToIntBits(v), isRef);
				} else {
					throw new RuntimeException(value + " cannot be pushed to the stack.");					
				}
				if (f.and(ctx).isTautology()) {
					return new One<>(clone);
				}
				if (f.equivalentTo(f.and(ctx))) {
					return new One<>(clone);
				}
				if (f.equivalentTo(f.andNot(ctx))) {
					return new One<>(stack);
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	public Conditional<Integer> pop(final FeatureExpr ctx) {
		return pop(ctx, Type.INT);
	}
	
	public Conditional<Long> popLong(final FeatureExpr ctx) {
		return pop(ctx, Type.LONG);
	}
	
	public Conditional<Double> popDouble(final FeatureExpr ctx) {
		return pop(ctx, Type.DOUBLE);
	}
	
	public Conditional<Float> popFloat(final FeatureExpr ctx) {
		return pop(ctx, Type.FLOAT);
	}
	
	public <T> Conditional<T> pop(final FeatureExpr ctx, final Type t) {
		Conditional<T> result = stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<T>>() {

			@SuppressWarnings("unchecked")
			@Override
			public Conditional<T> apply(FeatureExpr f, Stack s) {
				if (f.and(ctx).isContradiction()) {
					return null;
				}
				if (f.equivalentTo(f.andNot(ctx))) {
					return null;
				}
				
				Stack clone = s.copy();
				Number res = null;
				switch (t) {
				case INT:
					res = clone.pop();
					break;
				case DOUBLE:
					int lo = clone.pop();
					int hi = clone.pop();
					res = Types.intsToDouble(lo, hi);
					break;
				case FLOAT:
					int i = clone.pop();
					res = Types.intToFloat(i);
					break;
				case LONG:
					int lo2 = clone.pop();
					int hi2 = clone.pop();
					res = Types.intsToLong(lo2, hi2);
					break;
				default:
					return null;
				}
				stack = new Choice<>(f, new One<>(clone), stack);
				return (Conditional<T>) new One<>(res);
				
			}
		}).simplify();
		stack = stack.simplify();
		return result;
	}

	public void pop(final FeatureExpr ctx, final int n) {
		stack = stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr f, Stack s) {
				if (f.and(ctx).isContradiction()) {
					return null;
				}
				if (f.and(ctx).equivalentTo(f.andNot(ctx))) {
					return null;
				}
				Stack clone = s.copy();
				int i = n;
				while (i > 0) {
					clone.pop();
					i--;
				}
				return new Choice<>(f, new One<>(clone), new One<>(s));
			}
		}).simplify();
	}

	public Conditional<Integer> peek(FeatureExpr ctx) {
		return peek(ctx, 0);
	}

	public Conditional<Integer> peek(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.INT);	
	}

	public Conditional<Double> peekDouble(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.DOUBLE);	
	}

	public Conditional<Long> peekLong(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.LONG);	
	}

	public Conditional<Float> peekFloat(FeatureExpr ctx, final int offset) {
		return peek(ctx, offset, Type.FLOAT);		
	}
	
	private <T> Conditional<T> peek(FeatureExpr ctx, final int offset, final Type t) {
		return stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<T>>() {

			@SuppressWarnings("unchecked")
			@Override
			public Conditional<T> apply(FeatureExpr ctx, Stack stack) {
				switch (t) {
				case DOUBLE:
					return (Conditional<T>) new One<>(Types.intsToDouble(stack.peek(offset), stack.peek(offset + 1)));
				case FLOAT:
					return (Conditional<T>) new One<>(Types.intToFloat(stack.peek(offset)));
				case INT:
					return (Conditional<T>) new One<>(stack.peek(offset));
				case LONG:
					return (Conditional<T>) new One<>(Types.intsToLong(stack.peek(offset), stack.peek(offset + 1)));
				default:
					return null;
				}
			}

		}).simplify();
	}
	
	public boolean isRef(FeatureExpr ctx, final int offset) {// cahange to Conditional<Boolean> 
		return stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Boolean>>() {

			@Override
			public Conditional<Boolean> apply(FeatureExpr ctx, Stack y) {
				if (ctx.isSatisfiable()) {
					return new One<>(y.isRef(offset));
				}
				return new One<>(false);
			}

		}).simplify(ctx).getValue();
	}

	// TODO remove
	public void set(final int offset, final int value, final boolean isRef) {
		stack = stack.map(new Function<Stack, Stack>() {

			@Override
			public Stack apply(Stack y) {
				y.set(offset, value, isRef);
				return y;
			}
		}).simplify();
	}

	public Conditional<Integer> getTop() {
		return stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, Stack y) {
				return new One<>(y.top);
			}
		}).simplify();
	}

	public void setTop(final FeatureExpr ctx, final int i) {
		stack = stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr f, Stack stack) {
				if (f.and(ctx).isContradiction()) {
					return new One<>(stack);
				}
				Stack clone = stack.copy();
				clone.top = i;
				if (f.and(ctx).isTautology()) {
					return new One<>(clone);
				}
				if (f.equivalentTo(f.and(ctx))) {
					return new One<>(clone);
				}
				if (f.equivalentTo(f.andNot(ctx))) {
					return new One<>(stack);
				}

				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}
	
	public void clear(final FeatureExpr ctx) {
		stack = stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr f, Stack stack) {
				if (f.and(ctx).isContradiction()) {
					return new One<>(stack);
				}
				Stack clone = stack.copy();
				clone.clear();
				if (f.and(ctx).isTautology()) {
					return new One<>(clone);
				}
				if (f.equivalentTo(f.and(ctx))) {
					return new One<>(clone);
				}
				if (f.equivalentTo(f.andNot(ctx))) {
					return new One<>(stack);
				}

				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}

	public int[] getSlots() {
		return getSlots(FeatureExprFactory.True());
	}

	public int[] getSlots(FeatureExpr ctx) {
		int[] slots = new int[length];
		int i = 0;
		for (Conditional<Entry> l : locals) {
			if (l == null) {
				slots[i++] = MJIEnv.NULL;
				continue;
			}
			slots[i++] = l.getValue().value;
		}
		for (int o : stack.simplify(ctx).getValue().getSlots()) {
			slots[i++] = o;
		}

		return slots;
	}

	@Override
	public boolean equals(Object o) {
		if (o == null) {
			return false;
		}
		if (!(o instanceof StackHandler)) {
			return false;
		}
		StackHandler other = (StackHandler)o;
		for (int i = 0; i < locals.length; i++) {
			Conditional<Entry> l1 = locals[i];
			Conditional<Entry> l2 = other.locals[i];
			if (l1 == l2) {
				continue;
			}
			if (l1 == null) {
				return false;
			}
			if (!l1.equals(l2)) {
				return false;
			}
		}
		if (!other.stack.equals(stack)) {
			return false;
		}
		return true;
	}

	public boolean hasAnyRef(FeatureExpr ctx) {
		for (Conditional<Entry> local : locals) {
			if (local == null) {
				continue;
			}
			for (Entry entry : local.simplify(ctx).toList()) {
				if (entry.isRef) {
					return true;
				}
			}
		}

		for (Stack s : stack.simplify(ctx).toList()) {
			if (s.hasAnyRef()) {
				return true;
			}
		}
		return false;
	}

	/*
	 * Stack Instructions
	 */

	/**
	 * .. A B => .. B A B
	 */
	public void dup_x1(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP_X1);
	}

	/**
	 * .. A B C D => .. C D A B C D
	 */
	public void dup2_x2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2_X2);
	}

	/**
	 * .. A B C => .. B C A B C
	 */
	public void dup2_x1(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2_X1);
	}

	/**
	 * .. A B => .. A B A B
	 */
	public void dup2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP2);
	}

	/**
	 * .. A => .. A A
	 */
	public void dup(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP);
	}

	/**
	 * .. A B C => .. C A B C
	 */
	public void dup_x2(final FeatureExpr ctx) {
		function(ctx, StackInstruction.DUP_X2);
	}

	/**
	 * .. A B => .. B A
	 */
	public void swap(final FeatureExpr ctx) {
		function(ctx, StackInstruction.SWAP);
	}
	
	void function(final FeatureExpr ctx, final StackInstruction instruction) {
		stack = stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr f, Stack stack) {
				if (f.and(ctx).isContradiction()) {
					return new One<>(stack);
				}
				if (f.equivalentTo(f.andNot(ctx))) {
					return new One<>(stack);
				}
				
				Stack clone = stack.copy();
				switch (instruction) {
				case DUP_X1:
					clone.dup_x1();
					break;
				case DUP2_X2:
					clone.dup2_x2();
					break;
				case DUP:
					clone.dup();
					break;
				case DUP2:
					clone.dup2();
					break;
				case DUP2_X1:
					clone.dup2_x1();
					break;
				case DUP_X2:
					clone.dup_x2();
					break;
				case SWAP:
					clone.swap();
					break;
				default:
					throw new RuntimeException(instruction + "not supported");
				}
				
				if (f.and(ctx).isTautology()) {
					return new One<>(clone);
				}
				if (f.equivalentTo(f.and(ctx))) {
					return new One<>(clone);
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();
	}




}
