package org.howard.edu.ood.hw2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.HashMap;

import org.howard.edu.ood.utils.*;

// Author: Sanjeev Roka (@03028036)

public class WordCounter {
	public static void main(String[] args) {
	        // File path
	        String fileName = "resources/input.txt";
	        // Create a HashMap to store the word count

	        
	        try {	        	
//	        	String readText = fr.readToString(fileName);
		        FileReader fr = new FileReader();

		        HashMap<String, Integer> wordCount = new HashMap<>();

	        	 // Create a Scanner to read the text file
//	            Scanner input = new Scanner(new File(fileName));

	            // Read each line of the file
//	            while (input.hasNextLine()) {
//	                String line = input.nextLine();

	                // Split the line into words
//	                String[] words = line.split(" ");
	                
		            String[] words = fr.readToString(fileName).split(" ");       

	                // Iterate through the words
	                for (String word : words) {
	                	if(word.length() > 3){
	                		// Remove any punctuation from the word
	                		word = word.replaceAll("[^a-zA-Z ]", "").toLowerCase();
	                		// Check the length of the word. 
	                		
	                		// Check if the word is already in the HashMap
	                		if (wordCount.containsKey(word)) {
	                			// If it is, increment the count
	                			wordCount.put(word, wordCount.get(word) + 1);
	                		} else {
	                			// If it isn't, add it to the HashMap with a count of 1
	                			wordCount.put(word, 1);
	                		}
	                		
	                	}
	                }
//	            }

	            // Print the word count
	            for (String word : wordCount.keySet()) {
	                System.out.println(word + ": " + wordCount.get(word));
	            }
	            
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + fileName);
	        }
	    }

}
