package org.howard.edu.ood.hw4;
import java.util.*;


/**
 * The class IntegerSet is implemented to contain only Integer values without duplicates.
 * The class implements the concept of Set that contains only Integer values.
 * There are common methods as add, remove, contains, clear, length etc. 
 * It has other different methods associated with set such as union, intersection and set difference.
 * @author Sanzv
 *
*/
public class IntegerSet {
	private ArrayList<Integer>  setList;
	
	/**
	 * A default constructor for IntegerSet class. Initializes IntegerSet to initial state. 
	 */
	public IntegerSet() {
		this.setList = new ArrayList<>(); 	
	}

	/**
	 * Constructor that takes in ArrayList as a parameter and initializes IntegerSet with the elements in given ArrayList.
	 * @param s A ArrayList of integer type to initilaize the IntegerSet
	 */
	public IntegerSet(ArrayList<Integer> s) {
		this.setList = new ArrayList<>();
		for(int i =0;  i < s.size(); i++) {
			this.add(s.get(i));
		}
	}
	
	/**
	 * A Getter Method for the set
	 * Returns the current state of the set
	 * @return Current state of the set of ArrayList type.
	 */
	public ArrayList<Integer> getSet() {
		return this.setList;
	}
	
	
	/**
	 * This method clears the internal representation of the set. Removes all the elements from the set and initialize set to initial state. 
	 */
	public void clear() {
		this.setList.clear();
	}
	
	/**
	 * This method returns the number of elements or length of integer set 
	 * @return Current length of the IntegerSet - Integer
	 */
	public int length() {
		return this.setList.size();
	}
	
	/**
     * This method takes in another instance of IntegerSet and checks if two sets are equal. Two sets are equal if they contain all of the same values in ANY order.
	 * @param b : is a instance of IntegerSet to be checked whether is equal with the current IntegerSet or not.
	 * @throws IntegerSetException from the largest and smallest methods of the IntegerSet class.
	 * @return Boolean
	 */
	public boolean equals(IntegerSet b) throws IntegerSetException {
		if(b instanceof IntegerSet) {
			if(this.length() == b.length()) {	
				for(int i = 0; i < this.length(); i++) {
					int temp_num = this.setList.get(i);
					if(!b.contains(temp_num)) {
						return false;
					}
				}
				return true;
			}			
		}
		return false;
	}
	
	/**
	 * This method checks if the given value is a member of the set. Returns True if the value is a member else False.
	 * @param value: Integer value that is to be checked whether it is a member of the IntegerSet or not.
	 * @return Boolean
	 */
	public boolean contains(int value) {
		if(this.setList.isEmpty()) {
			return false;
		}
		for (int i=0; i<this.length(); i++) {
			if(this.setList.get(i) == value) {
				return true;
			};
		}
		return false;
	}
	
	/**
	 * Finds the largest element in the given set and returns the value. 
	 * Throws IntegerSetException if the set is empty. 
	 * @return The greatest element in the IntegerSet - Integer
	 * @throws IntegerSetException if IntegerSet do not have any member
	 */
	public int largest() throws IntegerSetException  {
		if(this.isEmpty()) {
			throw new IntegerSetException("The set is Empty to fins the largest number.");
		}
		ArrayList<Integer> temp = this.setList;
		
		Collections.sort(temp);
		
		return temp.get(this.length() -1);
	}
	
	/**
	 * Finds the smallest element in the given set and returns the value. 
	 * Throws IntegerSetException if the set is empty. 
 	 * @return The smallest element in the IntegerSet - Integer
	 * @throws IntegerSetException if IntegerSet do not have any member
	 */
	public int smallest() throws IntegerSetException  {
		if(this.isEmpty()) {
			throw new IntegerSetException("The set is Empty to find the smallest number.");
		}
		ArrayList<Integer> temp = this.setList;
		
		Collections.sort(temp);
		
		return temp.get(0);
	}
	
 	/**
 	 * This methods appends or adds the item as the member to the set if the item is not already a member 
 	 * else it does nothing. 
 	 * @param item: Integer value to insert to the IntegerSet
 	 */
 	public void add(int item) {
 		if(!this.contains(item)) {
 			this.setList.add(item);
 		}
 	}

 	/**
 	 * This methods removes the item from the set if it is a member of the set
 	 * else it does nothing. 
 	 * @param item: Integer value to remove from the IntegerSet
 	 */	public void remove(int item) {
 		if(this.contains(item)) {
 			this.setList.remove(Integer.valueOf(item));
 		}
 
 	 }

	/**
	 * The method takes in other IntegerSet and merges/unions its member to the current IntegerSet.
	 * @param intSetb - is a instance of IntegerSet that is to be merged with the current IntegerSet.
	 */
	public void union(IntegerSet intSetb) {
//		if(intSetb instanceof IntegerSet) {
//			
//		}
		ArrayList<Integer> temp = this.getSet();
		ArrayList<Integer> set2 = intSetb.getSet();

		temp.removeAll(set2);
		temp.addAll(set2);
		this.setList = temp;
		
	};

	/**
	 * The method takes in other IntegerSet and finds the common elements between two sets and modifies the current IntegerSet.
	 * @param intSetb - is a instance of IntegerSet with which intersection needs to be found with the current IntegerSet
	 */
	public void intersect(IntegerSet intSetb) {
		this.setList.retainAll(intSetb.getSet());		
	}; 

	/**
	 * The method takes in other IntegerSet and finds the difference between two sets. i.e. Set Difference.
	 * @param intSetb - is a instance of IntegerSet with which set difference is calculated.
	 */
	public void diff(IntegerSet intSetb){
		this.setList.removeAll(intSetb.getSet());
	}

	/**
	 * This method checks if the IntegerSet is empty or not.
	 * Returns True if empty else False
	 * @return Boolean
	 */
	public boolean isEmpty() {
		return this.length() == 0;
 		
	}; 

	/**
	 * This method returns the string representation of the IntegerSet.
	 * @return String
	 */
	public String toString() {
		ArrayList<String> temp = new ArrayList<>();
		for(int i=0; i<this.length(); i++) {
			temp.add(this.setList.get(i).toString());
		}
		return String.join(", ", temp);
	};	



}
