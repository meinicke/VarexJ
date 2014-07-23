package cmu.datastructures;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.vm.MJIEnv;
import gov.nasa.jpf.vm.StackHandler;

import org.junit.Test;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

public class StackHandlerTest {

	@Test
	public void test() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr feature = FeatureExprFactory.createDefinedExternal("Feature");

		Conditional<Integer> n1 = new One<>(20);
		stack.push(FeatureExprFactory.True(), n1, true);

		Conditional<Integer> n2 = new One<>(1000);
		stack.push(feature, n2, false);

		Conditional<Integer> peek = stack.peek(FeatureExprFactory.True());
		assertEquals(n2, peek.simplify(feature));
		assertEquals(n1, peek.simplify(feature.not()));
		assertEquals(new One<>(false), new One<>(stack.isRef(feature, 0)));
		assertEquals(new One<>(true), new One<>(stack.isRef(feature.not(), 0)));

		assertEquals(2, stack.getStackWidth());
		Conditional<Integer> pop = stack.pop(feature);
		assertEquals(n2, pop);
		assertEquals(1, stack.getStackWidth());
	}

	@Test
	public void test2() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");

		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
		stack.push(FeatureExprFactory.True(), n1, true);
		assertEquals(1, stack.getStackWidth());
		Conditional<Integer> n2 = new One<>((int) (Math.random() * 1000));
		stack.push(f1, n2, false);
		assertEquals(2, stack.getStackWidth());
		stack.push(f1.not(), n2, false);
		assertEquals(1, stack.getStackWidth());
	}

	@Test
	public void test3() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");

		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
		stack.push(FeatureExprFactory.True(), n1, true);
		assertEquals(1, stack.getStackWidth());
		Conditional<Integer> n2 = new One<>((int) (Math.random() * 1000));
		stack.push(f1, n2, false);
		assertEquals(2, stack.getStackWidth());
		stack.push(f1.not(), n2, true);
		assertEquals(2, stack.getStackWidth());
	}

	@Test
	public void isRefLocalTest() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 2, 0);
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
		stack.setLocal(f1, 0, n1, true);
		stack.setLocal(f1.not(), 0, n1, false);
		assertTrue(stack.isRefLocal(f1, 0));
		assertFalse(stack.isRefLocal(f1.not(), 0));
	}

	@Test
	public void getNullTestValue() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 2, 0);
		assertEquals(-1, stack.getLocal(FeatureExprFactory.True(), -1).getValue().intValue());
		assertEquals(MJIEnv.NULL, stack.getLocal(FeatureExprFactory.True(), 0).getValue().intValue());
	}

	@Test
	public void getNullTestRef() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 2, 0);
		assertEquals(false, stack.isRefLocal(FeatureExprFactory.True(), 0));
	}

	@Test
	public void test4() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 2, 2);
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10));
		stack.push(FeatureExprFactory.True(), n1, true);

		Conditional<Integer> n2 = new One<>((int) (Math.random() * 1000 + 10));
		stack.push(f1, n2, false);
		stack.push(f1.not(), n2, true);
		stack.storeOperand(FeatureExprFactory.True(), 1);

		assertEquals(n2, stack.getLocal(FeatureExprFactory.True(), 1));
		assertEquals(1, stack.getStackWidth());
		
		stack.storeOperand(f1, 0);
		Conditional<Integer> res1 = stack.getLocal(f1, 0);
		Conditional<Integer> res2 = stack.getLocal(f1.not(), 0);
		assertEquals(n1, res1);
		assertEquals(new One<>(MJIEnv.NULL), res2);

		stack.pushLocal(f1, 1);
		Conditional<Integer> peek = stack.peek(FeatureExprFactory.True());
		assertEquals(n2, peek.simplify(f1));
		assertEquals(n1, peek.simplify(f1.not()));
	}

	@Test
	public void hasAnyRefTest() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 1, 1);
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10));
		stack.push(f1, n1, true);

		assertTrue(stack.hasAnyRef(f1));
		stack.pop(f1);
		assertFalse(stack.hasAnyRef(f1));
		stack.push(f1, n1, false);
		assertFalse(stack.hasAnyRef(f1));
		stack.pop(f1);

		stack.push(f1, n1, false);
		stack.push(f1.not(), n1, true);
		assertFalse(stack.hasAnyRef(f1));
		assertTrue(stack.hasAnyRef(f1.not()));
		stack.pop(FeatureExprFactory.True());

		stack.setLocal(f1, 0, n1, true);
		assertTrue(stack.hasAnyRef(f1));
		stack.setLocal(f1.not(), 0, n1, false);
		assertFalse(stack.hasAnyRef(f1.not()));
	}

	@Test
	public void popTest() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 2, 2);
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
		stack.push(FeatureExprFactory.True(), n1, true);
		Conditional<Integer> res = stack.pop(f1);
		assertEquals(n1, res);
	}

	@Test
	public void popNTest() throws Exception {
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		int n = (int) (Math.random() * 10 + 1);
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, n);
		for (int i = 0; i < n; i++) {
			Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
			stack.push(f1, n1, Math.random() < 0.5);
		}
		stack.pop(f1, n);
		assertEquals(new One<>(-1), stack.getTop());
	}
	
	@Test
	public void popNTest2() throws Exception {
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		int n = (int) (Math.random() * 10 + 1);
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, n);
		for (int i = 0; i < n; i++) {
			Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
			stack.push(f1, n1, Math.random() < 0.5);
		}
		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
		stack.push(f1.not(), n1);
		
		stack.pop(f1, n);
		assertEquals(n1, stack.pop(f1.not()));
		assertEquals(new One<>(-1), stack.getTop());
	}

	@Test
	public void cloneEqualsTest() throws Exception {
		int k = 0;
		while (k++ < 100) {
			FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
			int n = (int) (Math.random() * 10 + 2);
			int m = (int) (Math.random() * 10 + 1);
			StackHandler stack = new StackHandler(FeatureExprFactory.True(), m, n);
			assertEquals(stack, stack.clone());
			for (int i = 0; i < m; i++) {
				Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
				stack.setLocal(f1, i, n1, Math.random() < 0.5);
				Conditional<Integer> n2 = new One<>((int) (Math.random() * 10 + 1));
				stack.setLocal(f1.not(), i, n2, Math.random() < 0.5);
			}
			for (int i = 0; i < n; i++) {
				Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 100));
				stack.push(f1, n1, Math.random() < 0.5);
				Conditional<Integer> n2 = new One<>((int) (Math.random() * 10 + 100));
				stack.push(f1.not(), n2, Math.random() < 0.5);
			}
			StackHandler clone = stack.clone();
			assertEquals(stack, clone);
			stack.pop(f1);
			assertNotEquals(stack, clone);

			clone = stack.clone();
			stack.storeOperand(f1, 0);
			assertNotEquals(stack, clone);
		}
	}
	
	@Test
	public void cloneEqualsTest3() throws Exception {
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		int n = 4;
		int m = 4;
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), m, n);
		assertEquals(stack, stack.clone());
		for (int i = 0; i < m; i++) {
			if (i == 2) {
				continue;
			}
			Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
			stack.setLocal(f1, i, n1, Math.random() < 0.5);
			Conditional<Integer> n2 = new One<>((int) (Math.random() * 10 + 1));
			stack.setLocal(f1.not(), i, n2, Math.random() < 0.5);
		}
		for (int i = 0; i < n; i++) {
			if (i == 3) {
				continue;
			}
			Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 100));
			stack.push(f1, n1, Math.random() < 0.5);
			Conditional<Integer> n2 = new One<>((int) (Math.random() * 10 + 100));
			stack.push(f1.not(), n2, Math.random() < 0.5);
		}
		
		StackHandler clone = stack.clone();
		assertEquals(stack, clone);
	}

	@Test
	public void cloneEqualsTest2() throws Exception {

		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		int m = 2;
		int n = 1;
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), m, n);
		assertEquals(stack, stack.clone());
		for (int i = 0; i < m; i++) {
			Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
			stack.setLocal(f1, i, n1, Math.random() < 0.5);
			Conditional<Integer> n2 = new One<>((int) (Math.random() * 10 + 1));
			stack.setLocal(f1.not(), i, n2, Math.random() < 0.5);
		}
		for (int i = 0; i < n; i++) {
			Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 100));
			stack.push(f1, n1, Math.random() < 0.5);
			Conditional<Integer> n2 = new One<>((int) (Math.random() * 10 + 100));
			System.out.println(stack);
			stack.push(f1.not(), n2, Math.random() < 0.5);
		}
		StackHandler clone = stack.clone();
		assertEquals(stack, clone);
		stack.pop(f1);
		assertNotEquals(stack, clone);

		clone = stack.clone();
		stack.storeOperand(f1.not(), 0);
		assertNotEquals(stack, clone);

	}

	@Test
	public void initTest() throws Exception {
		int nLocals = 2;
		int nOperands = 3;
		int length = nLocals + nOperands;
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), nLocals, nOperands);
		assertEquals(length, stack.length);
		assertEquals(-1, stack.getTop().getValue().intValue());
		assertEquals(stack.getStackWidth(), 1);
		int[] slots = stack.getSlots(FeatureExprFactory.True());
		assertEquals(length, slots.length);
		for (int e : slots) {
			assertEquals(0, e);
		}

		slots = stack.getSlots();
		assertEquals(length, slots.length);
		for (int e : slots) {
			assertEquals(0, e);
		}
	}

	@Test
	public void dup_x1_test() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 3);
		FeatureExpr ctx = FeatureExprFactory.True();
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);
		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);

		stack.dup_x1(ctx);
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));

		assertEquals(new One<>(-1), stack.getTop());
	}

	@Test
	public void dup_x1_test_conditional() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 3);
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);
		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);

		stack.dup_x1(f1);

		assertEquals(B, stack.pop(f1));
		assertEquals(A, stack.pop(f1));
		assertEquals(B, stack.pop(f1));

		assertEquals(B, stack.pop(f1.not()));
		assertEquals(A, stack.pop(f1.not()));

		assertEquals(new One<>(-1), stack.getTop());
	}

	@Test
	public void dup2_x2_test() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 6);
		FeatureExpr ctx = FeatureExprFactory.True();
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);
		Conditional<Integer> C = new One<>(3);
		Conditional<Integer> D = new One<>(4);
		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);
		stack.push(FeatureExprFactory.True(), C, true);
		stack.push(FeatureExprFactory.True(), D, false);

		stack.dup2_x2(ctx);

		assertEquals(D, stack.pop(ctx));
		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(D, stack.pop(ctx));
		assertEquals(C, stack.pop(ctx));

		assertEquals(new One<>(-1), stack.getTop());
	}

	@Test
	public void dup2_x2_test_conditional() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 6);
		FeatureExpr ctx = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);
		Conditional<Integer> C = new One<>(3);
		Conditional<Integer> D = new One<>(4);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);
		stack.push(FeatureExprFactory.True(), C, true);
		stack.push(FeatureExprFactory.True(), D, false);

		stack.dup2_x2(ctx);

		assertEquals(D, stack.pop(ctx));
		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(D, stack.pop(ctx));
		assertEquals(C, stack.pop(ctx));

		assertEquals(D, stack.pop(ctx.not()));
		assertEquals(C, stack.pop(ctx.not()));
		assertEquals(B, stack.pop(ctx.not()));
		assertEquals(A, stack.pop(ctx.not()));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A B C => .. B C A B C
	 */
	@Test
	public void dup2_x1_test() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 5);
		FeatureExpr ctx = FeatureExprFactory.True();
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);
		Conditional<Integer> C = new One<>(3);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);
		stack.push(FeatureExprFactory.True(), C, true);

		stack.dup2_x1(ctx);

		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A B C => .. B C A B C
	 */
	@Test
	public void dup2_x1_test_conditional() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 5);
		FeatureExpr ctx = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);
		Conditional<Integer> C = new One<>(3);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);
		stack.push(FeatureExprFactory.True(), C, true);

		stack.dup2_x1(ctx);

		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));

		assertEquals(C, stack.pop(ctx.not()));
		assertEquals(B, stack.pop(ctx.not()));
		assertEquals(A, stack.pop(ctx.not()));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A B => .. A B A B
	 */
	@Test
	public void dup2_test() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 5);
		FeatureExpr ctx = FeatureExprFactory.True();
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);

		stack.dup2(ctx);

		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A B => .. A B A B
	 */
	@Test
	public void dup2_test_conditional() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 5);
		FeatureExpr ctx = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);

		stack.dup2(ctx);

		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));

		assertEquals(B, stack.pop(ctx.not()));
		assertEquals(A, stack.pop(ctx.not()));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A => .. A A
	 */
	@Test
	public void dup_test() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr ctx = FeatureExprFactory.True();
		Conditional<Integer> A = new One<>(1);

		stack.push(FeatureExprFactory.True(), A, true);
		System.out.println(stack);
		stack.dup(ctx);

		assertEquals(A, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A => .. A A
	 */
	@Test
	public void dup_test_conditional() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr ctx = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> A = new One<>(1);

		stack.push(FeatureExprFactory.True(), A, true);
		System.out.println(stack);
		stack.dup(ctx);
		System.out.println(stack);
		assertEquals(A, stack.pop(ctx));
		System.out.println(stack);
		assertEquals(A, stack.pop(ctx));
		System.out.println(stack);
		assertEquals(A, stack.pop(ctx.not()));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A B C => .. C A B C
	 */
	@Test
	public void dup_x2_test() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 5);
		FeatureExpr ctx = FeatureExprFactory.True();
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);
		Conditional<Integer> C = new One<>(3);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);
		stack.push(FeatureExprFactory.True(), C, true);

		stack.dup2_x1(ctx);

		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A B C => .. C A B C
	 */
	@Test
	public void dup_x2_test_conditional() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 4);
		FeatureExpr ctx = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);
		Conditional<Integer> C = new One<>(3);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);
		stack.push(FeatureExprFactory.True(), C, true);

		stack.dup_x2(ctx);

		assertEquals(C, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));
		assertEquals(A, stack.pop(ctx));
		assertEquals(C, stack.pop(ctx));

		assertEquals(C, stack.pop(ctx.not()));
		assertEquals(B, stack.pop(ctx.not()));
		assertEquals(A, stack.pop(ctx.not()));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A B => .. B A
	 */
	@Test
	public void swap_test() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr ctx = FeatureExprFactory.True();
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);

		stack.swap(ctx);

		assertEquals(A, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));

		assertEquals(new One<>(-1), stack.getTop());
	}

	/**
	 * .. A B => .. B A
	 */
	@Test
	public void swap_test_conditional() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr ctx = FeatureExprFactory.createDefinedExternal("f1");
		Conditional<Integer> A = new One<>(1);
		Conditional<Integer> B = new One<>(2);

		stack.push(FeatureExprFactory.True(), A, true);
		stack.push(FeatureExprFactory.True(), B, false);

		stack.swap(ctx);

		assertEquals(A, stack.pop(ctx));
		assertEquals(B, stack.pop(ctx));

		assertEquals(B, stack.pop(ctx.not()));
		assertEquals(A, stack.pop(ctx.not()));

		assertEquals(new One<>(-1), stack.getTop());
	}

	@Test
	public void pushLongTest() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr ctx = FeatureExprFactory.True();
		long l = 12345678910L;
		Conditional<Long> n1 = new One<>(l);
		stack.push(ctx, n1, true);
		assertEquals(n1, stack.peekLong(ctx, 0));
		assertEquals(1, stack.getStackWidth());

		Conditional<Long> pop = stack.popLong(ctx);
		assertEquals(n1, pop);
		assertEquals(new One<>(-1), stack.getTop());
	}

	@Test
	public void pushDoubleTest() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr ctx = FeatureExprFactory.True();
		double d = 10.12345;
		Conditional<Double> n1 = new One<>(d);
		stack.push(ctx, n1, true);

		assertEquals(new One<>(d), stack.peekDouble(ctx, 0));
		assertEquals(1, stack.getStackWidth());

		Conditional<Double> pop = stack.popDouble(ctx);
		assertEquals(new One<>(d), pop);
		assertEquals(new One<>(-1), stack.getTop());
	}

	@Test
	public void pushFloatTest() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		FeatureExpr ctx = FeatureExprFactory.True();
		float f = 123.4f;
		Conditional<Float> n1 = new One<>(f);
		stack.push(ctx, n1, true);
		assertEquals(n1, stack.peekFloat(ctx, 0));
		assertEquals(1, stack.getStackWidth());

		Conditional<Float> pop = stack.popFloat(ctx);
		assertEquals(n1, pop);
		assertEquals(new One<>(-1), stack.getTop());
	}

	@Test
	public void doubleTest() throws Exception {
		Double d = 42.0;
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 2);
		stack.push(FeatureExprFactory.True(), new One<>(42.0), false);
		Double res = stack.popDouble(FeatureExprFactory.True()).getValue();
		assertEquals(d, res);
	}

	@Test
	public void doubleTest_2() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 4);
		stack.push(FeatureExprFactory.True(), new One<>(42.0), false);
		stack.push(FeatureExprFactory.True(), new One<>(42.0), false);
		Double res = stack.popDouble(FeatureExprFactory.True()).getValue();
		Double res2 = stack.popDouble(FeatureExprFactory.True()).getValue();
		assertEquals(res2, res);
	}

	private Double fd = 42.0;

	@Test
	public void doubleTest_3() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 0, 4);
		stack.push(FeatureExprFactory.True(), new One<>(42.0), false);
		Double res = stack.popDouble(FeatureExprFactory.True()).getValue();
		assertEquals(fd, res);
	}
	
	@Test
	public void ctxTest() throws Exception {
		
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		FeatureExpr f2 = FeatureExprFactory.createDefinedExternal("f2");
		
		StackHandler stack = new StackHandler(f1, 0, 4);
		stack.push(f1, new One<>(42), false);
		assertEquals(1, stack.getStackWidth());
		System.out.println(stack);
		stack.push(f2, new One<>(43), false);
		
		assertEquals(2, stack.getStackWidth());
		System.out.println(stack);
	}
	
	@Test
	public void ctxTest2() throws Exception {
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		StackHandler stack = new StackHandler(f1, 0, 4);
		stack.push(f1, new One<>(42), false);
		stack.push(f1, new One<>(43), true);
		assertEquals(1, stack.getStackWidth());
		
		System.out.println(stack);
		
		stack.pop(f1);
		System.out.println(stack);
		assertEquals(1, stack.getStackWidth());
	}
	
	@Test
	public void storeOperandTest() throws Exception {
		StackHandler stack = new StackHandler(FeatureExprFactory.True(), 2, 2);
		FeatureExpr f1 = FeatureExprFactory.createDefinedExternal("f1");
		stack.push(FeatureExprFactory.True(), new One<>(42), true);
		stack.storeOperand(f1, 0);
		assertEquals(new One<>(42), stack.pop(f1.not()));
		

	}

}
