package org.howard.edu.ood.midterm.problem51;

public interface Range {
	
	/**
	 * Returns true if v is ≥ lower bound and ≤ upper bound else False
	 * @param value
	 * @return
	 */
	public boolean contains( int value );  
	
	/**
	 * returns true if the receiver contains at least one value in common with other,
	 *  and false otherwise  
	 *  EmptyRangeException is thrown when a null Range object is passed to the method

	 * @param other
	 * @return
	 * @throws EmptyRangeException
	 */
   	public boolean overlaps( Range other ) throws EmptyRangeException; 
   	
   	/**
   	 * returns the number of integers in the range
   	 * @return the number of integers in the range
   	 */
	public int size(); 

	public int getUpper();
	public int getLower();
}
