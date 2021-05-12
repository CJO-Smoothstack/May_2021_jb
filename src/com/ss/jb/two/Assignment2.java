/**
 * 
 */
package com.ss.jb.two;

/** Find 2D array max element
 * @author chris
 *
 */
public class Assignment2 {

	/** Array is hard-coded in this context,
	 *  no exception handling required.
	 *  
	 *  The code assumes a non-empty array (at least one element).
	 *  
	 * @param args
	 */
	public static void main(String[] args) {
		Double[][] array = {
							{0.0, 0.0, 3.0, 0.0, 0.0},
							{2.1, 1.3, 6.7, 4.2, 1.1},
							{3.5, 3.6, 4.1, 8.2, 9.0},
							{2.2, 2.2, 4.2, 4.2, 9.7},
							{5.6, 7.0, 7.3, 3.2, 3.1}
						   };
		
		Double maxValue = Double.MIN_VALUE;
		Integer rowIndex = -1, colIndex = -1;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] > maxValue) {
					maxValue = array[i][j];
					rowIndex = i;
					colIndex = j;
				}
			}
		}
		
		System.out.println("The max value is: " + maxValue);
		System.out.println("And it's located at array[" + rowIndex + "][" + colIndex + "]");

	}

}
