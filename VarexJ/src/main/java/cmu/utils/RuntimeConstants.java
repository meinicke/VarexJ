package cmu.utils;

/**
 * Defines constants that can be used during runtime.
 * @author Jens Meinicke
 *
 */
public interface RuntimeConstants {
	/**
	 * Defines the maximal recursion until a {@link StackOverflowError} is thrown.
	 */
	int MAX_FRAMES = 1000;

	/**
	 * Enables debug output.
	 */
	boolean debug = true;

	/**
	 * Enables debug output.
	 */
	boolean debugGC = false;

	/**
	 * Defines weather the context is part of the console output.
	 */
	boolean ctxOutput = true;

	boolean tracing = false;
}
