/**
 * 
 */
package com.ss.jb.three;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** Count the number of occurences of character
 * @author Christopher O'Neill
 *
 */
public class Assignment3 {

	/** file name specified as args 0 in command line
	 *  character specified as args 1 in command line
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input;
		char c = args[1].toLowerCase().charAt(0);
		Integer totalCount = 0;
		
		try {
			input = new Scanner(new File(args[0]));
			
			while (input.hasNextLine()) {
	            String line = input.nextLine(); 
	            line = line.toLowerCase(); 

	            Integer lineCount = 0;

	            for (int i = 0; i < line.length(); i++) {
	                if (line.charAt(i) == c) {
	                    lineCount++;
	                }
	            }

	            totalCount += lineCount;
	        }
			
			input.close();
		}
		catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
			return;
		}
		
		System.out.println("Number of occurences of " + c + ": " + totalCount);

	}

}
