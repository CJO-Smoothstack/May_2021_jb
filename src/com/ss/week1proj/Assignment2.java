/**
 * 
 */
package com.ss.week1proj;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

/** Rightmost Digit method
 * @author chris
 *
 */
public class Assignment2 {

	
	@Test
	public void testRightDigit() {
		List<Integer> muhList = Arrays.asList(1, 22, 93);
		muhList = rightDigit(muhList);
	
		assertEquals(muhList.get(0).intValue(), 1);
		assertEquals(muhList.get(1).intValue(), 2);
		assertEquals(muhList.get(2).intValue(), 3);
	}
	
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
