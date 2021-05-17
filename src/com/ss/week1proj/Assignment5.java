package com.ss.week1proj;
/**
 * 
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Group Sum Clump
 * @author chris
 *
 */
public class Assignment5 {

	public static boolean groupSumClump(int runningSum, List<Integer> list, int expectedSum) {
		
		if (runningSum == 0) {
			List<Integer> trimmedList = new ArrayList<>();
			
			for (int i = 0; i < list.size(); i++) {
				
				Integer element = list.get(i);
				Integer multiplier = 0;
				
				do
				{
					multiplier++;
					i++;
				}
				while (i < list.size() && list.get(i) == element);
				
				trimmedList.add(element * multiplier);
				
			}
			
			list = trimmedList;
		}
		
		if (runningSum > expectedSum)
			return false;
		
		if (runningSum == expectedSum)
			return true;
		
		boolean feasible = false;
		
		for (int i = 0; i < list.size(); i++) {
			
			List<Integer> subList = list;
			subList.remove(i);
			
			feasible |= groupSumClump(runningSum + list.get(i), subList, expectedSum);
		}
		
		return feasible;
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
