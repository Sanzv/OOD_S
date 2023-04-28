package org.howard.edu.ood.finals.problem;


/**
 * Custom Exception class for EmptySetException that extends the default Exception class
 * @author sanzv
 *
 */
public class EmptySongDatabaseException extends Exception {

	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor that calls the parent's constructor with default message.
	 */
	public EmptySongDatabaseException() {
		// TODO Auto-generated constructor stub
		super("No Genre");
	}

	/**
	 * Constructor that calls parent's constructor with the received parameter. 
	 * @param message To pass to the super class Exception
	 */
	public EmptySongDatabaseException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
