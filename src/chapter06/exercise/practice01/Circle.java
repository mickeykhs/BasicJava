package chapter06.exercise.practice01;

public class Circle {
	static final double PI = 3.1415;
	private double radius;
	private double x;
	private double y;
	private double area;
	
	//¸Å¼Òµå
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		if(radius<0) {
			this.radius = 0;
			
		} else {
			this.radius = radius;
		}
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {	
		this.x=x;
		
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y=y;
	
	}
	public double getArea() {
		area = PI*radius*radius;
		return area;
	}
	public void setArea(double Area) {
		this.area = Area;
		
	}
}
