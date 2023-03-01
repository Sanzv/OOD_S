package org.howard.edu.ood.hw4;

import java.util.ArrayList;
import java.util.Arrays;

public class Driver {

	public static void main(String[] args) throws IntegerSetException {
		
		IntegerSet set1 = new IntegerSet();
		System.out.println("Set1 initialized");

		System.out.println("Adding 1 to the set.");
		set1.add(1);
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length() + "\n");
		
		System.out.println("Adding 2 to the set.");
		set1.add(2);
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length() + "\n");

		
		System.out.println("Adding 3 to the set.");
		set1.add(3);
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length() + "\n");
		
		System.out.println("Adding 3 to the set.");
		set1.add(3);
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length() + "\n");
		
		System.out.println("Adding 4 to the set.");
		set1.add(4);
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length() + "\n");

		try {
			System.out.println("Smallest value in Set1 is:\t" + set1.smallest());
			System.out.println("Largest value in Set1 is:\t" + set1.largest() + "\n");
		}catch(IntegerSetException e) {
			System.out.println(e);
		}

		IntegerSet set2 = new IntegerSet();
		System.out.println("Set 2 initialized.");

		System.out.println("Adding 3 to the set2.");
		set2.add(3);
		System.out.println("Set2 = {" + set2.toString() + "} with size " + set2.length() + "\n");
		
		System.out.println("Adding 5 to the set2.");
		set2.add(5);
		System.out.println("Set2 = {" + set2.toString() + "} with size " + set2.length() + "\n");
		
		System.out.println("Adding 10 to the set2.");
		set2.add(10);
		System.out.println("Set2 = {" + set2.toString() + "} with size " + set2.length() + "\n");

		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length());
		System.out.println("Set2 = {" + set2.toString() + "} with size " + set2.length());		
		
		try {
			System.out.println("Smallest value in Set2 is:\t" + set2.smallest());
			System.out.println("Largest value in Set2 is:\t" + set2.largest() + "\n");
		}catch(IntegerSetException e) {
			System.out.println(e);
		}
		
		System.out.println("Union of Set1 and Set2. ");
		set1.union(set2);	// union of set1 and set2
		System.out.println("Result of union of Set1 and Set2");
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length() + "\n");
		
		System.out.println("Removing element 1 from set1");
		set1.remove(1);
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length() + "\n");
		
		System.out.println("Removing element 6 from set1");
		set1.remove(6);
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length() + "\n");
		
		try {
			System.out.println("Smallest value in Set1 is:\t" + set1.smallest());
			System.out.println("Largest value in Set1 is:\t" + set1.largest() + "\n");
		}catch(IntegerSetException e) {
			System.out.println(e);
		}
		
		ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(3,5,10,3,5));
		
		System.out.println("Set 3 initialized through default constructor with elements {3,5,10,3,5} .");
		IntegerSet set3 = new IntegerSet(arr);
		System.out.println("Set3 = {" + set3.toString() + "} with size " + set3.length() + "\n");
		

		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length());
		System.out.println("Set2 = {" + set2.toString() + "} with size " + set2.length());
		System.out.println("Set3 = {" + set3.toString() + "} with size " + set3.length() + "\n");
		System.out.println("Comparing sets ");
		
		System.out.println("Is Set1 equal to set2 -> " + set1.equals(set2));
		System.out.println("Is Set2 equal to set3 -> " + set2.equals(set3));
		System.out.println("Is Set1 equal to set3 -> " + set1.equals(set3));
		System.out.println("Is Set2 equal to set1 -> " + set2.equals(set1));
		System.out.println("Is Set3 equal to set2 -> " + set3.equals(set2));
		System.out.println("Is Set3 equal to set1 -> " + set3.equals(set1));

		
		System.out.println("\nClearing set2.");
		set2.clear();
		
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length());
		System.out.println("Set2 = {" + set2.toString() + "} with size " + set2.length());
		System.out.println("Set3 = {" + set3.toString() + "} with size " + set3.length() + "\n");
		
		try {
			System.out.println("Smallest value in Set2 is:\t" + set2.smallest());
			System.out.println("Largest value in Set2 is:\t" + set2.largest() + "\n");			
		}catch(IntegerSetException e) {
			System.out.println(e);
		}
		
		System.out.println("Intersection of Set1 and Set3. ");
		set1.intersect(set3);
		System.out.println("Result of intercestion of Set1 and Set3");
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length());
		System.out.println("Set2 = {" + set2.toString() + "} with size " + set2.length());
		System.out.println("Set3 = {" + set3.toString() + "} with size " + set3.length() + "\n");		
		
		
		System.out.println("Difference of set3 with set1.");
		set3.diff(set1);
		System.out.println("Result of difference of Set3 with Set1: Set3 - Set1");
		System.out.println("Set1 = {" + set1.toString() + "} with size " + set1.length());
		System.out.println("Set2 = {" + set2.toString() + "} with size " + set2.length());
		System.out.println("Set3 = {" + set3.toString() + "} with size " + set3.length() + "\n");
		
		

	}

}
