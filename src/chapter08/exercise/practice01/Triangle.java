package chapter08.exercise.practice01;

public class Triangle extends Shape {
	//필드
	private double side;
	
	//생성자
	public Triangle(double side) {
		this.side = side;
	}
	
	//메소드
	public double area() {
//		return 1.7320508075/4*side*side;  루트3 = 1.7~~~~
		return Math.sqrt(3)/4*side*side;
	}
	
	public double perimeter() {
		return side + side + side;
	}

	@Override		//도형의 종류, 둘레, 넓이를 문자열로 반환한다.
	public String toString() {
		return String.format("도형의 종류: 삼각형, 둘레: %2.2f㎝, 넓이: %2.2f㎠",perimeter(), area());
	}
	
}
