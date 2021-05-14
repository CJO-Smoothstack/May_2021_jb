/**
 * 
 */
package com.ss.jb.four;

/** Singleton with locking and two threads
 * @author Christopher O'Neill
 *
 */
public class Assignment1 {
	
	public static Integer lock = 0;
	volatile public static Assignment1 myLittleInstance = null;
	
	private Assignment1 () {
		System.out.println("Will always be in my heart.");
	}

	/**
	 * @param args
	 */
	public static void main (String[] args) {
		// TODO Auto-generated method stub
		
		Thread t1 = new Thread () {
			@Override
			public void run () {
				getInstance();
			}
		};
		
		Thread t2 = new Thread () {
			@Override
			public void run () {
				getInstance();
			}
		};
		
		t1.start();
		t2.start();

	}
	
	public static Assignment1 getInstance () {
		synchronized (lock) {
			if (myLittleInstance == null)
				myLittleInstance = new Assignment1 ();
		}
		
		return myLittleInstance;
	}

}
