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
	
	public Conditional<Stack> stack;
	public int length = 0;
	
	public int getStackInteger() {
		return stack.toList().size();
	}
	
	@Override
	public String toString() {
		return stack.toString();
//		StringBuilder string = new StringBuilder();
//		for (Stack s : stack.toList()) {
//			string.append(s);
//		}
//		return string.toString();
	}
	
	public StackHandler(int nLocals, int nOperands) {
		length = nLocals + nOperands;
		stack = new One<>(new Stack(nLocals, nOperands));
	}
	
	public StackHandler() {
		stack = new One<>(new Stack(0));
	}
	
	public StackHandler clone() {
		StackHandler clone = new StackHandler();
		clone.length = length;
		
		clone.stack = stack.map(new Function<Stack, Stack>() {

			@Override
			public Stack apply(Stack stack) {
				return stack.copy();
			}
			
		});		
		return clone;
	}
	
	public void push(Integer value) {
		push(FeatureExprFactory.True(), value, false);
	}
	
	public <T> void push(FeatureExpr ctx, Conditional<Integer> value, final boolean isRef) {
		value.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<T>>() {

			@Override
			public Conditional<T> apply(FeatureExpr ctx, Integer value) {
				push(ctx, value, isRef);
				return null;
			}
			
		});
	}

	public void push(FeatureExpr ctx, final Integer value, final boolean isRef) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr ctx, Stack y) {
				if (ctx.isContradiction()) {
					return new One<>(y);
				}
				Stack clone = y.copy();
				clone.push(value, isRef);
				if (ctx.isTautology()) {
					return new One<>(clone);
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(y));
			}
		}).simplify();
	}

	public Conditional<Integer> pop(FeatureExpr ctx) {
		Conditional<Integer> result = stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, Stack y) {
				return new One<>(y.pop());
			}
		}).simplify();
		stack = stack.simplify();
		return result;
	}
	
	public Conditional<Integer> peek(FeatureExpr ctx) {
		return peek(ctx, 0);
	}

	public Conditional<Integer> peek(FeatureExpr ctx, final int offset) {
		return stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, Stack y) {
				return new One<>(y.peek(offset));
			}
		}).simplify(ctx);
	}
	
	public boolean isRef(FeatureExpr ctx, final int offset) {// change return type to Conditional<Boolean>
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

	
	public Conditional<Boolean> isRef2(final int offset) {
		return stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Boolean>>() {

			@Override
			public Conditional<Boolean> apply(FeatureExpr ctx, Stack y) {
				return new One<>(y.isRef(offset));
			}
		});
	}

	// TODO remove
	public boolean isRefIndex(final int index) {
		return stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Boolean>>() {

			@Override
			public Conditional<Boolean> apply(FeatureExpr ctx, Stack y) {
				return new One<>(y.isRefIndex(index));
			}
		}).simplify().getValue();
	}
	
	public boolean isRefIndex(FeatureExpr ctx, final int index) {
		return stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Boolean>>() {

			@Override
			public Conditional<Boolean> apply(FeatureExpr ctx, Stack y) {
				return new One<>(y.isRefIndex(index));
			}
		}).simplify().getValue();
	}

	// TODO remove
	public void set(final int offset, final int value, final boolean isRef) {
		stack = stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr ctx, Stack y) {
				if (ctx.isContradiction()) {
					return new One<>(y);
				}
				Stack clone = y.copy();
				clone.set(offset, value, isRef);
				if (ctx.isTautology()) {
					return new One<>(clone);
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(y));
			}
		}).simplify();
	}
	
	// TODO remove
	public void setIndex(final int index, final int value, final boolean isRef) {
		setIndex(FeatureExprFactory.True(), index, value, isRef);
	}
	
	public void setIndex(FeatureExpr ctx, final int index, final int value, final boolean isRef) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr ctx, Stack y) {
				if (ctx.isContradiction()) {
					return new One<>(y);
				}
				Stack clone = y.copy();
				clone.setIndex(index, value, isRef);
				if (ctx.isTautology()) {
					return new One<>(clone);
				}
				return new Choice<>(ctx, new One<>(clone), new One<>(y));
			}
		}).simplify();
	}
	
	// TODO revise
	public void setIndex(FeatureExpr ctx, final int index, final Conditional<Integer> value, final boolean isRef) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr ctx, final Stack y) {
				return value.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Integer, Conditional<Stack>>() {

					@Override
					public Conditional<Stack> apply(FeatureExpr ctx, Integer v) {
						if (ctx.isContradiction()) {
							return new One<>(y);
						}
						Stack clone = y.copy();
						clone.setIndex(index, v, isRef);
						if (ctx.isTautology()) {
							return new One<>(clone);
						}
						return new Choice<>(ctx, new One<>(clone), new One<>(y));
					}
				});
				
			}
		}).simplify();
	}
	
	public Conditional<Integer> get(FeatureExpr ctx, final int index) {
		return stack.simplify(ctx).mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, Stack y) {
				return new One<>(y.get(index));
			}
		}).simplify(ctx);
	}

	public Conditional<Integer> getTop() {
		return stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, Stack y) {
				return new One<>(y.top);
			}
		}).simplify();
	}

	public void setTop(FeatureExpr ctx, final int i) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr ctx, Stack stack) {
				if (ctx.isContradiction()) {
					return new One<>(stack); 
				}
				Stack clone = stack.copy();
				clone.top = i;
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();		
	}

	public void duplicate(final int sourceOffset, final int targetOffset) {
		duplicate(FeatureExprFactory.True(), sourceOffset, targetOffset);
	}
	
	public void duplicate(FeatureExpr ctx, final int sourceOffset, final int targetOffset) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr ctx, Stack stack) {
				if (ctx.isContradiction()) {
					return new One<>(stack); 
				}
				Stack clone = stack.copy();
				clone.duplicate(sourceOffset, targetOffset);
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();		
	}

	public void incrTop(final int i) {
		incrTop(FeatureExprFactory.True(), i);
	}
	
	public void incrTop(FeatureExpr ctx, final int i) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr ctx, Stack stack) {
				if (ctx.isContradiction()) {
					return new One<>(stack); 
				}
				Stack clone = stack.copy();
				clone.top += i;
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();	
	}

	/**
	 * 
	 * @param ctx
	 * @param index stack[index]
	 * @param offset stack[top - offset] 
	 * @param direction <code>True</code>:  slots[top + offset] = slots[index]<br>
	 * 					<code>False</code>: slots[index] = slots[top - offset];
	 */
	public void duplicateIndex(FeatureExpr ctx, final int index, final int offset, final boolean direction) {
		stack = stack.mapf(ctx, new BiFunction<FeatureExpr, Stack, Conditional<Stack>>() {

			@Override
			public Conditional<Stack> apply(FeatureExpr ctx, Stack stack) {
				if (ctx.isContradiction()) {
					return new One<>(stack); 
				}
				Stack clone = stack.copy();
				clone.duplicateIndex(index, offset, direction);
				return new Choice<>(ctx, new One<>(clone), new One<>(stack));
			}
		}).simplify();		
	}

	public int[] getSlots() {
		return stack.getValue().getSlots();
	}
	
	public int[] getSlots(FeatureExpr ctx) {
		return stack.simplify(ctx).getValue().getSlots();
	}
	
	@Override
	public boolean equals(Object o) {
		// TODO implement
		throw new RuntimeException("Equals not implemented");
	}

	public boolean hasAnyRef(FeatureExpr ctx) {// TODO change return type to Conditional<Boolean>
		for (Stack s : stack.simplify(ctx).toList()) {
			if (s.hasAnyRef()) {
				return true;
			}
		}
		return false;
	}

	public void setRef(final int index, final boolean ref) {
		stack.mapf(FeatureExprFactory.True(), new BiFunction<FeatureExpr, Stack, Conditional<Integer>>() {

			@Override
			public Conditional<Integer> apply(FeatureExpr ctx, Stack stack) {
				stack.setRef(index, ref);
				return null;
			}
		});		
	}

}


