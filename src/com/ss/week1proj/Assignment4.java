/**
 * 
 */
package com.ss.week1proj;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/** Remove X's
 * @author chris
 *
 */
public class Assignment4 {

	/** Return a list of the rightmost digits of each nonnegative integer.
	 * 
	 * @param list
	 */
	public static List<String> removeXs (List<String> list) {
		return list.stream().map((x) -> x.replaceAll("x", "")).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		//List<String> muhList = Arrays.asList("x");
		List<String> muhList = Arrays.asList("ax", "bb", "cx");
		
		removeXs(muhList).forEach((str) -> System.out.println(str));

	}

}