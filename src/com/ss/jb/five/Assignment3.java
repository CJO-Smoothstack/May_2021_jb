/**
 * 
 */
package com.ss.jb.five;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Get three letter strings that start with a
 * @author chris
 *
 */
public class Assignment3 {

	/** Given a list of Strings, write a method that returns a list of all strings
	 *  that start with the letter 'a' (lower case) and have exactly 3 letters. 
	 *  TIP: Use Java 8 Lambdas and Streams API's.
	 * @param args
	 */
	public static List<String> getFilteredList (List<String> list) {
		return list.stream()
				  .filter(s -> s.startsWith("a") && s.length() == 3)
				  .collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<String> muhList = Arrays.asList("test", "aaa", "ape", "abs", "attention", "hi");
		
		getFilteredList(muhList).forEach((w) -> System.out.println(w));
	}

}
