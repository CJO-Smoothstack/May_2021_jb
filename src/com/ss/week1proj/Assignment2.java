/**
 * 
 */
package com.ss.week1proj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Rightmost Digit method
 * @author chris
 *
 */
public class Assignment2 {

	/** Return a list of the rightmost digits of each nonnegative integer.
	 * 
	 * @param list
	 */
	public static List<Integer> rightDigit (List<Integer> list) {
		return list.stream().map((x) -> (x % 10)).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Integer> muhList = Arrays.asList(1, 22, 93);
		
		rightDigit(muhList).forEach((num) -> System.out.println(num));

	}

}
