/**
 * 
 */
package com.ss.jb.four;

/** Producer and Consumer Example
 * @author chris
 *
 */
public class Assignment3 {

	volatile public static int[] myLittleArray = new int [10];
	volatile public static int index = -1; //Producer increments
	
	/** Uses a bounded int buffer as shared resource
	 * @param args
	 */
	public static void main(String[] args) {
		
		Thread producer = new Thread () {
			@Override
			public void run () {
				
				int data = 0;
				
				while (true) {
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					synchronized (myLittleArray) {
						index++;
						
						if (index == myLittleArray.length) {
							index--;
							continue;
						}
						
						myLittleArray[index] = data;
						data++;
					}
				}
			}
		};
		
		Thread consumer = new Thread () {
			@Override
			public void run () {
				
				while (true) {
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					
					int data;
					
					synchronized (myLittleArray) {
						
						if (index < 0)
							continue;
						
						data = myLittleArray[index];
						System.out.println(data + " at index: " + index);
						
						index--;
					}
				}
			}
		};
		
		producer.start();
		consumer.start();

	}

}
