/**
 * 
 */
package com.ss.week1proj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

/** Remove X's
 * @author chris
 *
 */
public class Assignment4 {

	@Test
	public void testRemoveXs() {
		List<String> muhList = Arrays.asList("ax", "bb", "cx");
		muhList = removeXs(muhList);
		
		assertEquals(muhList.get(0).equals("a"), true);
		assertEquals(muhList.get(1).equals("bb"), true);
		assertEquals(muhList.get(2).equals("c"), true);
	}
	
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