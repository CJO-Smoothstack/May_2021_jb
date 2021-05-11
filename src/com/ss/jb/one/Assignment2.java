/**
 * 
 */
package com.ss.jb.one;

import java.util.*;

/** Guess the random number range
 * @author chris
 *
 */
public class Assignment2 {

	/** Guess a random number within +/-10
	 * You get 5 guesses
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		Random r = new Random ();
		
		int answer = r.nextInt(100) + 1;
		
		System.out.println("Guess my number in the range: [1, 100]...");
		
		for (int i = 0; i < 5; i++)
		{
			int guess = Integer.parseInt(sc.nextLine());
			
			if (guess >= answer - 10 && guess <= answer + 10)
			{
				System.out.println(answer);
				sc.close();
				return;
			}
		
			if (i < 4)
				System.out.println("Keep guessing...");
		}
		
		System.out.println("Sorry, " + answer);
		
		sc.close();
	}

}
