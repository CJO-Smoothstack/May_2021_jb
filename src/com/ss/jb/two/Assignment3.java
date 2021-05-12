/**
 * 
 */
package com.ss.jb.two;

/** Geometry
 *  Demonstration of interfaces to implement geometrical properties
 *  Below is interface for basic shape property "behaviors"
 * @author chris
 *
 */
interface Shape {
	public void calculateArea();
	public void display();
}

// Class for implementing Rectangle shape properties
class Rectangle implements Shape {
	
	protected Double base, height;
	protected Double area;
	
	public Rectangle (Double base, Double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		area = base * height;
	}

	@Override
	public void display() {
		System.out.println("Area: " + area);
	}
	
}

//Class for implementing Circle shape properties
class Circle implements Shape {
	
	protected Double radius;
	protected Double area;
	
	public Circle (Double radius) {
		this.radius = radius;
	}
	
	@Override
	public void calculateArea() {
		area = Math.PI * radius * radius;
	}

	@Override
	public void display() {
		System.out.println("Area: " + area);
	}
	
}

//Class for implementing Triangle shape properties
class Triangle implements Shape {
	
	protected Double base, height;
	protected Double area;
	
	public Triangle (Double base, Double height) {
		this.base = base;
		this.height = height;
	}

	@Override
	public void calculateArea() {
		area = 0.5 * base * height;
	}

	@Override
	public void display() {
		System.out.println("Area: " + area);
	}
	
}

public class Assignment3 {

	/** Demonstration of shapes
	 * @param args
	 */
	public static void main(String[] args) {
		
		Shape a = new Rectangle (20.0, 40.0);
		Shape b = new Circle (5.0);
		Shape c = new Triangle (3.0, 4.0);
		
		a.calculateArea();
		b.calculateArea();
		c.calculateArea();
		
		a.display();
		b.display();
		c.display();

	}

}
