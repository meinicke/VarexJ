package cmu.conditional;
/**
 * Representation of a function that takes one parameter.
 * 
 * @author Jens Meinicke
 *
 * @param <T1> Parameter
 * @param <RETURN> Return value
 */
public interface Function<T, RETURN> {

	RETURN apply(T x);
}