package chapter08.exercise.practice01;

public class Circle extends Shape{
	//필드
	private double radius;
	
	//생성자
	public Circle(double radius){
		this.radius = radius;
	}
	
	//메소드
	public double area() {
		return Math.PI * radius *radius;
	}
	
	public double perimeter() {
		return Math.PI * 2 * radius;
	}

	@Override        //도형의 종류, 둘레, 넓이를 문자열로 반환한다.
	public String toString() {
		return String.format("도형의 종류: 원, 둘레: %2.2f㎝, 넓이: %2.2f㎠",perimeter() ,area());
	}
	
}
