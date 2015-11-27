package cmu.conditional;
/**
 * Representation of a function that takes two parameter.
 * 
 * @author Jens Meinicke
 *
 * @param <T1> First parameter
 * @param <T2> Second parameter
 */
public interface VoidBiFunction<T1, T2> {
	
	void apply(T1 x, T2 y);

}
