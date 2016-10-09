package game.exceptions;

public class NotEnoughShieldsException extends Exception {

	public NotEnoughShieldsException(int value) {
		super("Don't have " + Integer.toString(value) + " shields");
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = -6036840389989782934L;

}
