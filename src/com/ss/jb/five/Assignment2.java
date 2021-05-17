/**
 * 
 */
package com.ss.jb.five;

import java.util.stream.Collectors;
import java.util.List;
import java.util.Arrays;

/** Using java 8 features to format a list as a string
 * @author chris
 *
 */
public class Assignment2 {

	/** Using Java 8 features write a method that returns a comma
	 *  separated string based on a given list of integers.
	 *  Each element should be preceded by the letter 'e' if the number is even,
	 *  and preceded by the letter 'o' if the number is odd. 
	 *  For example, if the input list is (3,44), the output should be 'o3,e44'.
	 * @param args
	 */
	public static String getFormattedList (List<Integer> list) {
		return list.stream().map(i -> i % 2 == 0 ? "e" + i : "o" + i).collect(Collectors.joining(","));
	}
	
	public static void main(String[] args) {
		
		List<Integer> muhList = Arrays.asList(22, 45, 5, 67, 9, 10, 134);
		
		System.out.println(getFormattedList(muhList));
		
	}

}
