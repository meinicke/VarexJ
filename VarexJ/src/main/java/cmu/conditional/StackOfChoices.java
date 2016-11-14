package cmu.conditional;

import java.util.Map;
import java.util.function.BiConsumer;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;
import de.fosd.typechef.featureexpr.SingleFeatureExpr;

@SuppressWarnings("unchecked")
public class StackOfChoices {

	Conditional<?>[] stack = new Conditional[10];
	int size = 0;

	void push(FeatureExpr ctx, Conditional value) {
//		while (size > 0 && stack[size-1] == One.NULL) {
//			size--;
//		}
		stack[size++] = ChoiceFactory.create(ctx, value, One.NULL);
	}

	Conditional pop(FeatureExpr ctx) {
		Conditional returnValue = One.NULL;
		for (int i = size - 1; i >= 0; i--) {
			Conditional<?> ret = stack[i];
			stack[i] = ChoiceFactory.create(ctx, (Conditional<Object>) One.NULL, (Conditional<Object>) stack[i]).simplify();
			if (i == size - 1 && stack[i] == One.NULL) size--;
			returnValue = ChoiceFactory.create(ctx, ret, returnValue);
			ctx = ctx.and(getCtxOfNull(ret));
			if (ctx.isContradiction()) {
				break;
			}
		}
		return returnValue.simplify();
	}
	
	FeatureExpr ctx = null;

	FeatureExpr getCtxOfNull(Conditional value) {
		
		if (value instanceof TreeChoice) {
			ctx = FeatureExprFactory.True();
			try {
			value.mapf(FeatureExprFactory.True(), (BiConsumer<FeatureExpr, Object>) (FeatureExpr t, Object u) -> {
				if (u == null) {
					ctx = t;
					throw new RuntimeException();
				}
			});
			} catch (RuntimeException e) {
				// TODO: handle exception
			}
			return ctx;
		}
		
		Map<Object, FeatureExpr> map = value.toMap();
		FeatureExpr ctx = map.get(null);
		if (ctx == null) {
			ctx = FeatureExprFactory.False();
		}
		return ctx;
	}

	public void print() {
		System.out.println("------------------");
		System.out.println("SIZE: " + size);
		for (int i = 0; i < size; i++) {
			System.out.println(stack[i]);
		}
		System.out.println("------------------");
	}
	static SingleFeatureExpr a = FeatureExprFactory.createDefinedExternal("A");
	static SingleFeatureExpr b = FeatureExprFactory.createDefinedExternal("B");

	public static void main(String[] args) {
		StackOfChoices stack = new StackOfChoices();//100.866ms
//		IStackHandler stack = new BufferedStackHandler(a, 0, 1);//2.828ms
//		IStackHandler stack = new StackHandler(a, 0, 1);//10.586ms
//		IStackHandler stack = new HybridStackHandler(a, 0, 1);//2.513ms
		
		Conditional c = createChoice(0);
		
		// warm up
		System.out.println("WARM UP");
		int rounds = 1_000_000;
		while (rounds-- > 0) {
			stack.push(a, c);
			stack.pop(a);
		}
		
		System.out.println("START");
		long start = System.nanoTime();
		rounds = 100_000;
//		while (rounds-- > 0) {
//			stack.push(a, c);
//			stack.pop(a);
//		}
		stack.push(a, c);
		stack.pop(a);
		stack.push(b, createChoice(3));
		
		stack.print();
		
		long end = System.nanoTime();
		long ns = (end- start);
		System.out.println(ns / 1_000_000 + "." + (ns % 1_000_000) / 1_000 + "ms");
	}
	
	
	private static Conditional createChoice(int nrOfFeatures) {
		Conditional<Integer> c = new One(-1);
		for (int i = 0; i < nrOfFeatures; i++) {
			c = ChoiceFactory.create(FeatureExprFactory.createDefinedExternal("f" + i), new One<Integer>(i), c);
		}
		return c;
	}
}
