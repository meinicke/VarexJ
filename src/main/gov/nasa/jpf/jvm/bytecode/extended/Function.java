package gov.nasa.jpf.jvm.bytecode.extended;
/**
 * 
 * @author Jens Meinicke
 *
 * @param <T1> Parameter
 * @param <RETURN> Return value
 */
public interface Function<T, RETURN> {

	RETURN apply(T x);
}