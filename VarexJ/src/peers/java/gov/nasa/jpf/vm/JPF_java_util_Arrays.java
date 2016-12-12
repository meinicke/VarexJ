package gov.nasa.jpf.vm;

import cmu.conditional.Conditional;
import cmu.conditional.One;
import de.fosd.typechef.featureexpr.FeatureExpr;
import gov.nasa.jpf.annotation.MJI;

/**
 * Shortcut for java.util.Arrays
 * 
 * @author Jens Meinicke
 *
 */
public class JPF_java_util_Arrays extends NativePeer {

	@MJI
	public void fill___3II__V(MJIEnv env, int __, Conditional<Integer> arrayRef, Conditional<Integer> value, FeatureExpr ctx) {
		final int reference = arrayRef.getValue();
		((ArrayFields) env.heap.getModifiable(reference).fields).fill(ctx, value);
	}

	@MJI
	public void fill___3BIIB__V(MJIEnv env, int __, int arrayRef, int fromIndex, int toIndex, byte value, FeatureExpr ctx) {
		if (fromIndex > toIndex) {
			throw new IllegalArgumentException("fromIndex(" + fromIndex + ") > toIndex(" + toIndex + ")");
		}
		if (fromIndex < 0) {
			throw new ArrayIndexOutOfBoundsException(fromIndex);
		}
		if (toIndex > env.getArrayLengthOld(ctx, arrayRef)) {
			throw new ArrayIndexOutOfBoundsException(toIndex);
		}
		((ArrayFields) env.heap.getModifiable(arrayRef).fields).fill(ctx, fromIndex, toIndex, One.valueOf(value));
	}

	@MJI
	public void fill___3CC__V(MJIEnv env, int __, Conditional<Integer> arrayRef, Conditional<Character> value, FeatureExpr ctx) {
		final int reference = arrayRef.getValue();
		((ArrayFields) env.heap.getModifiable(reference).fields).fill(ctx, value);
	}

	@MJI
	public void fill___3Ljava_lang_Object_2Ljava_lang_Object_2__V(MJIEnv env, int __, int arrayRef, int val, FeatureExpr ctx) {
		((ArrayFields) env.heap.getModifiable(arrayRef).fields).fill(ctx, One.valueOf(val));
	}
	
	@MJI
	public void fill___3ZZ__V(MJIEnv env, int __, Conditional<Integer> arrayRef, Conditional<Boolean> value, FeatureExpr ctx) {
		final int reference = arrayRef.getValue();
		((ArrayFields) env.heap.getModifiable(reference).fields).fill(ctx, value);
	}

}
