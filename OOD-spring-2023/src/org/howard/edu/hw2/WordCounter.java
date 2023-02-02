package org.howard.edu.hw2;

//import java.io.File;
import java.io.FileNotFoundException;
//import java.util.Scanner;

import org.howard.edu.utils.*;

import java.util.HashMap;

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
		        
		        // Read strings from the given file and print it.
		        String fileContent = fr.readToString(fileName);
		        System.out.println("The content of the file is: " + fileContent);
	                
//		        Convert it to array of strings by splitting on spaces. 
	            String[] words = fileContent.split(" ");     
	            
                // Iterate through the words
                for (String word : words) {
                	// Check the length of the word and if it contains only alphabets
                	if(word.length() > 3 && word.matches("^[a-zA-Z]*$")){
                		
                		// Convert to Lower Case
                		word = word.toLowerCase();
                		
                		// Check if the word is already in the HashMap
                		if (wordCount.containsKey(word)) {
                			// If it is, increment the count by 1
                			wordCount.put(word, wordCount.get(word) + 1);
                		} else {
                			// If it isn't, add it to the HashMap with the initial count of 1
                			wordCount.put(word, 1);
                		}
                		
                	}
                }
//	            }
	            // Print the word count
	            for (String word : wordCount.keySet()) {
	                System.out.println(word + "\t" + wordCount.get(word));
	            }
	            
	        } catch (FileNotFoundException e) {
	            System.out.println("File not found: " + fileName);
	        }
	    }

}
