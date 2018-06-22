package cmu.conditional;

/**
 * {@link RuntimeException} thrown when trying to get the value of a choice
 * 
 * @author Jens Meinicke
 *
 */
public class GetValueOfChoiceException extends RuntimeException {

	public GetValueOfChoiceException(String msg) {
		super(msg);
	}

}
