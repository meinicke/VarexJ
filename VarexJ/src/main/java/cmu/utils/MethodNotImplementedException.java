package cmu.utils;

/**
 * Throw an exception for method that are not yet suported.
 * 
 * @author Jens Meinicke
 *
 */
public class MethodNotImplementedException extends RuntimeException {

	public MethodNotImplementedException() {
		super(Thread.currentThread().getStackTrace()[2] + " not implemented");
	}
	
}
