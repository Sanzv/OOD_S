package org.howard.edu.ood.hw4;

/**
 * Custom Exception class for IntegerSetException that extends the default Exception class
 * @author sanzv
 *
 */
//@SuppressWarnings("serial")
class IntegerSetException extends Exception {
	
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor that calls the parent's constructor with default message.
	 */
	public IntegerSetException() {
		// TODO Auto-generated constructor stub
		super("Invalid Integerset: Empty");
	}

	/**
	 * Constructor that calls parent's constructor with the received parameter. 
	 * @param message To pass to the super class Exception
	 */
	public IntegerSetException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
