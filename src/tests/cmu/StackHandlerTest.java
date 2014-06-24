package cmu;


import static org.junit.Assert.*;

import java.util.Random;

import gov.nasa.jpf.jvm.bytecode.extended.Conditional;
import gov.nasa.jpf.jvm.bytecode.extended.One;
import gov.nasa.jpf.vm.StackHandler;

import org.junit.Test;

import de.fosd.typechef.featureexpr.FeatureExpr;
import de.fosd.typechef.featureexpr.FeatureExprFactory;

public class StackHandlerTest {

	
	
	@SuppressWarnings("cast")
	@Test
	public void test() throws Exception {
		StackHandler stack = new StackHandler(0, 2);
		FeatureExpr feature =  FeatureExprFactory.createDefinedExternal("Feature");
		
		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
		stack.push(FeatureExprFactory.True(), n1, true);
		
		Conditional<Integer> n2 = new One<>((int) (Math.random() * 1000));
		stack.push(feature, n2, false);
		
		Conditional<Integer> peek = stack.peek(FeatureExprFactory.True());
		assertEquals(n2, peek.simplify(feature));
		assertEquals(n1, peek.simplify(feature.not()));
		assertEquals(new One<>(false), stack.isRef2(0).simplify(feature));
		assertEquals(new One<>(true), stack.isRef2(0).simplify(feature.not()));
		
		System.out.println(stack.toString());
		assertEquals(2, stack.getStackInteger());
		Conditional<Integer> pop = stack.pop(feature);
		System.out.println(stack.toString());
		assertEquals(n2, pop);
		assertEquals(1, stack.getStackInteger());
	}
	
	@SuppressWarnings("cast")
	@Test
	public void test2() throws Exception {
		StackHandler stack = new StackHandler(0, 2);
		FeatureExpr f1 =  FeatureExprFactory.createDefinedExternal("f1");
		
		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
		stack.push(FeatureExprFactory.True(), n1, true);
		assertEquals(1, stack.getStackInteger());
		Conditional<Integer> n2 = new One<>((int) (Math.random() * 1000));
		stack.push(f1, n2, false);
		assertEquals(2, stack.getStackInteger());
		stack.push(f1.not(), n2, false);
		assertEquals(1, stack.getStackInteger());
	}
	
	@Test
	public void test3() throws Exception {
		StackHandler stack = new StackHandler(0, 2);
		FeatureExpr f1 =  FeatureExprFactory.createDefinedExternal("f1");
		
		Conditional<Integer> n1 = new One<>((int) (Math.random() * 10 + 1));
		stack.push(FeatureExprFactory.True(), n1, true);
		assertEquals(1, stack.getStackInteger());
		Conditional<Integer> n2 = new One<>((int) (Math.random() * 1000));
		stack.push(f1, n2, false);
		assertEquals(2, stack.getStackInteger());
		stack.push(f1.not(), n2, true);
		assertEquals(2, stack.getStackInteger());
	}
	
	@Test
	public void getNullTestValue() throws Exception {
		StackHandler stack = new StackHandler(0, 2);
		assertEquals(-1, stack.get(FeatureExprFactory.True(), -1).getValue().intValue());
		assertEquals(0, stack.get(FeatureExprFactory.True(), 0).getValue().intValue());
	}
	
	@Test
	public void getNullTestRef() throws Exception {
		StackHandler stack = new StackHandler(0, 2);
		assertEquals(false, stack.isRefIndex(0));
	}
}
