package gov.nasa.jpf.jvm.bytecode.extended;
/**
 * 
 * @author Jens Meinicke
 *
 * @param <T1> First parameter
 * @param <T2> Second parameter
 * @param <RETURN> Return value
 */
public interface BiFunction<T1, T2, RETURN> {
	
	RETURN apply(T1 x, T2 y);

}
