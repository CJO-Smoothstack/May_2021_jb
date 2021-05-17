/**
 * 
 */
package com.ss.week1proj;

import java.util.NoSuchElementException;
import java.util.Scanner;

//Used for lambda implementation
interface PerformOperation {
	boolean check(int a);
}

/** Lambda tests
 * @author chris
 *
 */
public class Assignment1 {

	public static boolean checker (PerformOperation p, int num) {
		return p.check(num);
	}
	
	public static PerformOperation isOdd () { return (x) -> (x % 2 == 1); }
	
	public static PerformOperation isPrime () {
		
		return (i) -> {
			for (int x = 2; x < i; x++)
				if (i % x == 0)
					return false;
			
			return true;
		};
	}
	
	public static PerformOperation isPalindrome () {
		
		return (i) -> {
			StringBuilder sb = new StringBuilder ();
			sb.append(i);
			
			for (int x = 0; x < sb.length() / 2; x++)
				if (sb.charAt(x) != sb.charAt(sb.length() - x - 1))
					return false;
			
			return true;
		};
	}
	
	/** Check test cases using lambda functionality
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);
		
		Integer numTests;
		
		try {
			numTests = Integer.parseInt(sc.nextLine());
		}
		catch (NumberFormatException nfe) {
			System.out.println("Invalid argument, must enter number of test cases.");
			sc.close();
			return;
		}
		
		for (int i = 0; i < numTests; i++) {
			String ln = sc.nextLine();
			
			Scanner lnsc = new Scanner (ln);
			Integer method = null, number = null;
			PerformOperation p;
			
			try {
				method = lnsc.nextInt();
				number = lnsc.nextInt();
			} catch (NoSuchElementException ime) {
				System.out.println("Line must be <int><whitespace><int> format!");
				System.exit(1);
			}
			
			switch (method) {
				case 1:
					p = Assignment1.isOdd();
					System.out.println(p.check(number) ? "ODD" : "EVEN");
					break;
				case 2:
					p = Assignment1.isPrime();
					System.out.println(p.check(number) ? "PRIME" : "COMPOSITE");
					break;
				case 3:
					p = Assignment1.isPalindrome();
					System.out.println(p.check(number) ? "PALINDROME" : "NOT PALINDROME");
					break;
				
				default:
					System.out.println("Undefined method id.");
			}
			
			lnsc.close();
		}
		
		sc.close();

	}

}
