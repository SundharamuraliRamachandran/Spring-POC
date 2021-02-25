package org.spring.poc;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;

public class Triangle implements InitializingBean, DisposableBean {
	
	//private List<Point> points;
	private Point pointA;
	private Point pointB;
	private Point pointC;
	private ApplicationContext context = null;
	
	public void myInit() {
		System.out.println("myInit method called for Triangle bean");
	}
	
	public void myDestroy() {
		System.out.println("myDestroy method called for Triangle bean");
	}
	
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

	
	  @Override public void afterPropertiesSet() throws Exception {
	  System.out.println("Init method called for Triangle bean"); }
	  
	  @Override public void destroy() throws Exception {
	  System.out.println("Triangle bean destroyed"); }
	 

//	@Override
//	public void setApplicationContext(ApplicationContext context) throws BeansException {
//		this.context = context;
//	}
//
//	@Override
//	public void setBeanName(String beanName) {
//		System.out.println("Bean name is:" + beanName);
//	}

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
