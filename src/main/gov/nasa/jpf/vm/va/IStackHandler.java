package gov.nasa.jpf.vm.va;

import gov.nasa.jpf.vm.va.StackHandler.Type;

import java.util.Collection;

import cmu.conditional.Conditional;
import de.fosd.typechef.featureexpr.FeatureExpr;

/**
 * Interface for variability-aware implementations of a method stack.
 * 
 * @author Jens Meinicke
 *
 */
public interface IStackHandler {
	
	public abstract FeatureExpr getCtx();

	public abstract int getStackWidth();

	public abstract String toString();

	public abstract IStackHandler clone();
	
	public abstract int getLength();
	
	public abstract Conditional<Stack> getStack();

	/**
	 * Pushes the local variable at the index position to the stack.
	 * 
	 * @param index
	 *            The index of the local variable
	 */
	public abstract void pushLocal(FeatureExpr ctx, int index);

	public abstract void pushLongLocal(FeatureExpr ctx, int index);

	/**
	 * Pops the top value and saves it at the index position.
	 * 
	 * @param ctx
	 * @param index
	 *            The index of the local variable
	 */
	public abstract void storeOperand(FeatureExpr ctx, int index);

	public abstract void storeLongOperand(FeatureExpr ctx, int index);

	public abstract void setLocal(FeatureExpr ctx, int index, Conditional<Integer> value, boolean isRef);

	public abstract void setLocal(FeatureExpr ctx, int index, int value, boolean isRef);

	public abstract Conditional<Integer> getLocal(FeatureExpr ctx, int index);

	// TODO change to conditional
	public abstract boolean isRefLocal(FeatureExpr ctx, int index);

	public abstract <T> void push(FeatureExpr ctx, T value);

	/**
	 * 
	 * @param ctx
	 * @param value Can be a {@link Conditional}, or an int, double, or long.
	 * @param isRef Sets the new value to be a reference or not.
	 */
	public abstract void push(FeatureExpr ctx, Object value, boolean isRef);

	public abstract Conditional<Integer> pop(FeatureExpr ctx);

	public abstract Conditional<Long> popLong(FeatureExpr ctx);

	public abstract Conditional<Double> popDouble(FeatureExpr ctx);

	public abstract Conditional<Float> popFloat(FeatureExpr ctx);

	public abstract <T> Conditional<T> pop(FeatureExpr ctx, Type t);

	public abstract void pop(FeatureExpr ctx, int n);

	public abstract Conditional<Integer> peek(FeatureExpr ctx);

	public abstract Conditional<Integer> peek(FeatureExpr ctx, int offset);

	public abstract Conditional<Double> peekDouble(FeatureExpr ctx, int offset);

	public abstract Conditional<Long> peekLong(FeatureExpr ctx, int offset);

	public abstract Conditional<Float> peekFloat(FeatureExpr ctx, int offset);

	public abstract boolean isRef(FeatureExpr ctx, int offset);

	public abstract void set(FeatureExpr ctx, int offset, int value, boolean isRef);

	public abstract Conditional<Integer> getTop();

	public abstract void setTop(FeatureExpr ctx, int i);

	public abstract void clear(FeatureExpr ctx);

	public abstract int[] getSlots();

	public abstract int[] getSlots(FeatureExpr ctx);

	public abstract boolean equals(Object o);

	public abstract int hashCode();

	public abstract boolean hasAnyRef(FeatureExpr ctx);

	/**
	 * .. A B => .. B A B
	 */
	public abstract void dup_x1(FeatureExpr ctx);

	/**
	 * .. A B C D => .. C D A B C D
	 */
	public abstract void dup2_x2(FeatureExpr ctx);

	/**
	 * .. A B C => .. B C A B C
	 */
	public abstract void dup2_x1(FeatureExpr ctx);

	/**
	 * .. A B => .. A B A B
	 */
	public abstract void dup2(FeatureExpr ctx);

	/**
	 * .. A => .. A A
	 */
	public abstract void dup(FeatureExpr ctx);

	/**
	 * .. A B C => .. C A B C
	 */
	public abstract void dup_x2(FeatureExpr ctx);

	/**
	 * .. A B => .. B A
	 */
	public abstract void swap(FeatureExpr ctx);

	public abstract void setCtx(FeatureExpr ctx);
	
	public abstract Collection<Integer> getAllReferences();

}