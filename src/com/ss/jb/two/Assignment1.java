/**
 * 
 */
package com.ss.jb.two;

/** Sum 3 command line arguments - implies numerical constraints
 * @author chris
 *
 */
public class Assignment1 {

	/** Includes appropriate exception handling for:
	 *  Number parsing by data type: double
	 *  Checking the number of arguments
	 *  
	 *  Assumes the numerical storage limits of data type: double
	 *  for arguments and sum.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		if (args.length < 3) {
			System.out.println("Not enough arguments, need 3 numbers to sum...");
			return;
		}
		
		Double sum = 0.0;
		
		try {
			for (String s: args)
				sum += Double.parseDouble(s);
		}
		catch (NumberFormatException nfe) {
			System.out.println("Illegal argument detected, must be parsable double...");
			return;
		}
		
		System.out.println("Sum: " + sum);

	}

}
