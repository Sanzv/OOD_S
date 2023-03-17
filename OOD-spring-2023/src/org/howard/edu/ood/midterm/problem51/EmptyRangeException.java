package org.howard.edu.ood.midterm.problem51;

public class EmptyRangeException extends Exception {
	/**
	 * Default constructor that calls the parent's constructor with default message.
	 */
	public EmptyRangeException() {
		// TODO Auto-generated constructor stub
		super("The given IntegerRange is Empty.");
	}

	/**
	 * Constructor that calls parent's constructor with the received parameter. 
	 * @param message To pass to the super class Exception
	 */
	public EmptyRangeException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}

}
