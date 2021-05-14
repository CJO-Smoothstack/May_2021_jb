/**
 * 
 */
package com.ss.jb.four;

/** Deadlock between two threads
 * @author chris
 *
 */
public class Assignment2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer resourceA = 0;
		String resourceB = "Hey";
		
		Thread t1 = new Thread () {
			@Override
			public void run () {
				synchronized (resourceA) {
					try {
						Thread.sleep(69);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resourceB) {
						System.out.println("Nice.");
					}
				}
			}
		};
		
		Thread t2 = new Thread () {
			@Override
			public void run () {
				synchronized (resourceB) {
					try {
						Thread.sleep(69);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					synchronized (resourceA) {
						System.out.println("Very impressive.");
					}
				}
			}
		};
		
		t1.start();
		t2.start();
		
		System.out.println("Main thread end.");
	}

}
