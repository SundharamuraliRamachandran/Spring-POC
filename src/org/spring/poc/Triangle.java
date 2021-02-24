package org.spring.poc;

import java.util.List;

public class Triangle {
	
	//private List<Point> points;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public void draw() {
		System.out.println("Point :" + pointA.toString());
		System.out.println("Point :" + pointB.toString());
		System.out.println("Point :" + pointC.toString());
	}

	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	/*
	 * private String type; private int height;
	 * 
	 * public Triangle(String type) { this.type = type; }
	 * 
	 * public Triangle(String type, int height) { this.type = type; this.height =
	 * height; }
	 * 
	 * public Triangle(int height) { this.height = height; }
	 * 
	 * public String getType() { return type; }
	 * 
	 * public int getHeight() { return height; }
	 * 
	 * public void setHeight(int height) { this.height = height; }
	 */
	/*
	 * public void setType(String type) { this.type = type; }
	 */
	
	

	

}
