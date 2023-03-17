package org.howard.edu.ood.midterm.problem51;

import java.util.Objects;

/**
 * The class IntegerRange represents an integer range, such as 1-10 or 50701-50799. The lower and
    upper bounds of a Range are given at the time the object is created. 
 * @author Sanzv
 *
*/
public class IntegerRange implements Range {
	private int lower;
	private int upper;
	
	/**
	 * Constructor the InterRange class sets the lower and upper variable.
	 * @param l
	 * @param u
	 */
  	 public IntegerRange(int l, int u) {
 		this.lower = l;
 		this.upper = u;
  	 }
  	 
 	/**
 	 * Getter method for the private variable lower
 	 * @return lower
 	 */
     public int getLower() {
         return lower;
     }
     
 	/**
 	 * Getter method for the private variable upper
 	 * @return upper
 	 */
     public int getUpper() {
         return upper;
     }
    
 	/**
	 * Method to return the size of the range
	 * @return Number of integers that lies within the range. 
	 */
	public int size() {
		return this.getUpper() - this.getLower() + 1;
	}
	
	@Override
	/**
	 * Method to check if the value lies within the range or not inclusive to the range
	 * @param value
	 * @return boolean
	 */
	public boolean contains(int value) {
		if ((value >= this.getLower()) &&
				(value <= this.getUpper())){
			return true;
		}
		return false;
	}

    /**
	 * Method that checks for any common values in the two ranges or not
	 * @param toCompare: Other Range Object to compare with
	 * @return boolean: (true if at least one common else false)
	 * @throw EmptyRangeException: if any of received Range object is Null. 
	 */
	@Override
	public boolean overlaps(Range other) throws EmptyRangeException {
		  if (Objects.isNull(other)) {
	             throw new EmptyRangeException("Given Range is a null object.");
	         }
	         
	         if ((other.getUpper() < this.getLower()) 
	        		 || (other.getLower() > this.getUpper())){
	         	return false;
	         }
         return true;
	}
 	
 	
	
	

}
