package com.ss.week1proj;
/**
 * 
 */

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/** Group Sum Clump
 * @author chris
 *
 */
public class Assignment5 {

	@Test
	public void testGroupSumClump () {
		assertEquals(groupSumClump(0, Arrays.asList(2, 4, 8), 10), true);
		assertEquals(groupSumClump(0, Arrays.asList(1, 2, 4, 8, 1), 14), true);
		assertEquals(groupSumClump(0, Arrays.asList(2, 4, 4, 8), 14), false);
	}
	
	public static boolean groupSumClump(int runningSum, List<Integer> list, int expectedSum) {
		
		if (runningSum == 0) {
			List<Integer> trimmedList = new ArrayList<>();
			
			for (int i = 0; i < list.size(); i++) {
				
				Integer element = list.get(i);
				Integer multiplier = 1;
				
				while (i + 1 < list.size()) {
					
					if (list.get(i + 1) != element)
						break;
					
					multiplier++;
					i++;
				}
				
				trimmedList.add(element * multiplier);
			}
			
			list = trimmedList;
			
		}
		
		if (runningSum > expectedSum)
			return false;
		
		if (runningSum == expectedSum)
			return true;
		
		for (int i = 0; i < list.size(); i++) {
			
			List<Integer> subList = new ArrayList<>(list);
			subList.remove(i);
			
			if (groupSumClump(runningSum + list.get(i), subList, expectedSum))
				return true;
		}
		
		return false;
	}
	
	
	/** Find out if a sum of some elements contained in a list can
	 *  add up to an expected sum.
	 *  Adjacent elements in the list are required to be summed together as a group.
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(groupSumClump(0, Arrays.asList(2, 4, 8), 10));
		System.out.println(groupSumClump(0, Arrays.asList(1, 2, 4, 8, 1), 14));
		System.out.println(groupSumClump(0, Arrays.asList(2, 4, 4, 8), 14));
	}

}
