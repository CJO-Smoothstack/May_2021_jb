/**
 * 
 */
package com.ss.week1proj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

/** Double List
 * @author chris
 *
 */
public class Assignment3 {

	@Test
	public void testDoubleList () {
		List<Integer> muhList = Arrays.asList(1, 2, 3);
		muhList = doubleList(muhList);
		
		assertEquals(muhList.get(0).intValue(), 2);
		assertEquals(muhList.get(1).intValue(), 4);
		assertEquals(muhList.get(2).intValue(), 6);
	}
	
	/** Return a list that contains the double of each integer in the original
	 * 
	 * @param list
	 */
	public static List<Integer> doubleList (List<Integer> list) {
		return list.stream().map((x) -> (x * 2)).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<Integer> muhList = Arrays.asList(1, 2, 3);
		
		doubleList(muhList).forEach((num) -> System.out.println(num));

	}

}
