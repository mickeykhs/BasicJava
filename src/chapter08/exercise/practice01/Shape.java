package chapter08.exercise.practice01;

public abstract class Shape implements Comparable<Shape>{
	//메소드
	public abstract double area(); 
	public abstract double perimeter();
	@Override
	public int compareTo(Shape o) {
//		return area().compareTo(o.area()); 더블타입안됨..
		if(area()>o.area()) {
			return 1;
		} else if (area()< o.area()) {
			return -1;
		} else {
			return 0;
		}
	}
	@Override
	public String toString() {
		return String.format("둘레: %2.2f㎝, 넓이: %2.2f㎠", perimeter() ,area());
	}
	
}
