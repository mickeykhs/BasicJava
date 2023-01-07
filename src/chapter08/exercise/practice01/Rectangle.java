package chapter08.exercise.practice01;

public class Rectangle extends Shape{
	//필드
	private double width;
	private double height;
	
	//생성자
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//메소드
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return 2*(width + height);
	}

	@Override			//도형의 종류, 둘레, 넓이를 문자열로 반환한다.
	public String toString() {
		return String.format("도형의 종류: 사각형, 둘레: %2.2f㎝, 넓이: %2.2f㎠", perimeter(),area());
	}
	
}
