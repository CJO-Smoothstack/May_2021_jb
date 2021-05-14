package com.ss.jb.four;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/** JUnit Testing Example using Line class
 *  4 methods aree to be tested.
 * @author Christopher O'Neill
 *
 */
class Line {
	private double x0, y0, x1, y1;
	
	public Line (double x0, double y0, double x1, double y1) {
		this.x0 = x0;
		this.x1 = x1;
		this.y0 = y0;
		this.y1 = y1;
	}
	
	public double getSlope() {
		if (x0 == x1)
			throw new ArithmeticException();
		
		return (y1 - y0) / (x1 - x0);
	}
	
	public double getDistance() {
		return Math.sqrt((x1 - x0)*(x1 - x0) + (y1 - y0)*(y1 - y0));
	}
	
	public boolean parallelTo(Line l) {
		if (Math.abs(getSlope() - l.getSlope()) < 0.0001) {
			return true;
		} else {
			return false;
		}
	}
}

public class LineTest {

	public static Line a = new Line(0, 0, 4, 4);
	public static Line b = new Line(0, 1, 4, 5);
	public static Line c = new Line(0, 1, -4, 5);
	
	@Test
	public void getSlopeTest() {
		assertEquals(1.0, a.getSlope(), 0.0001);
		assertEquals(1.0, b.getSlope(), 0.0001);
		assertEquals(-1.0, c.getSlope(), 0.0001);
	}
	
	@Test
	public void getDistanceTest() {
		assertEquals(Math.sqrt(32.0), a.getDistance(), 0.0001);
		assertEquals(Math.sqrt(32.0), b.getDistance(), 0.0001);
		assertEquals(Math.sqrt(32.0), c.getDistance(), 0.0001);
	}
	
	@Test
	public void parallelToTest() {
		assertEquals(true, a.parallelTo(b));
		assertEquals(false, a.parallelTo(c));
		assertEquals(false, b.parallelTo(c));
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
