/**
 * 
 */
package com.ss.jb.five;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/** Basic Lambdas
 * @author chris
 *
 */
public class Assignment1 {

	/** Sort an array of strings by:
	 *  1) length
	 *  2) reverse length
	 *  3) alphabetically
	 *  4) "e..." strings first, everything else second
	 *  5) Previous but with helper method
	 *  
	 * @param args
	 */
	
	//Static helper method for Part 5
	public static int eSortCompare (String w1, String w2) {
		
		if (w1.charAt(0) == 'e' && w1.charAt(0) == w2.charAt(0))
			return 0;
		
		if (w1.charAt(0) == 'e')
			return -1;
		
		return 1;
	}
	
	public static void main(String[] args) {
		
		List<String> words = new ArrayList<> ();
		words.add("ccc");
		words.add("aa");
		words.add("b");
		words.add("dddd");
		words.add("fffff");
		words.add("eeeee");
		words.add("egads");
		words.add("snu");
		
		//1
		System.out.println("---Sort 1---");
		Collections.sort(words, (w1, w2) -> (w1.length() - w2.length()));
		words.forEach((w) -> System.out.println(w));
		
		System.out.println();
		
		//2
		System.out.println("---Sort 2---");
		Collections.sort(words, (w1, w2) -> (w2.length() - w1.length()));
		words.forEach((w) -> System.out.println(w));
		
		System.out.println();
		
		//3
		System.out.println("---Sort 3---");
		Collections.sort(words, (w1, w2) -> (w1.compareTo(w2)));
		words.forEach((w) -> System.out.println(w));
		
		System.out.println();
		
		//4
		System.out.println("---Sort 4---");
		Collections.sort(words, (w1, w2) -> {
			
			if (w1.charAt(0) == 'e' && w1.charAt(0) == w2.charAt(0))
				return 0;
			
			if (w1.charAt(0) == 'e')
				return -1;
			
			return 1;
			
		});
		words.forEach((w) -> System.out.println(w));
		
		System.out.println();
		
		//5
		System.out.println("---Sort 5---");
		Collections.sort(words, (w1, w2) -> Assignment1.eSortCompare(w1, w2));
		words.forEach((w) -> System.out.println(w));
		
	}

}
