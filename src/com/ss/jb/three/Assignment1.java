/**
 * 
 */
package com.ss.jb.three;

import java.io.File;

/** Getting the files and subdirectories under a given directory recursively.
 *  Starting directory is specified as a command line argument.
 * @author Christopher O'Neill
 *
 */
public class Assignment1 {

	public static void printFileAtDepth(File f, Integer depth) {
		for (int i = 0; i < depth; i++)
			System.out.print("-");
		
		System.out.println(f.getName());
	}
	
	/** Recursive method for printing directory contents
	 * @param contents
	 */
	public static void printContents (File[] contents, Integer depth) {
		for (File f: contents) {
			printFileAtDepth(f, depth);
			
			if (f.isDirectory()) {
				printContents(f.listFiles(), depth + 1);
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(args[0]);
		
		File start = new File (args[0]);
		printContents(start.listFiles(), 1);

	}

}
