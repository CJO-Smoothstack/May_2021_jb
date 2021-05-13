/**
 * 
 */
package com.ss.jb.three;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/** Append text to existing file (or create if necessary)
 * @author Christopher O'Neill
 *
 */
public class Assignment2 {

	/** File path is passed as args 0
	 *  Text to be appended is args 1
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File start = new File (args[0]);
		
		try {
			OutputStream os = new BufferedOutputStream (new FileOutputStream (start, true));
			os.write(args[1].getBytes());
			os.close();
		}
		catch (IOException ioe) {
			ioe.printStackTrace();
		}
		
	}

}
