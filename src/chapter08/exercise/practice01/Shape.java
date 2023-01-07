package chapter08.exercise.practice01;

public abstract class Shape implements Comparable<Shape>{
	//�޼ҵ�
	public abstract double area(); 
	public abstract double perimeter();
	@Override
	public int compareTo(Shape o) {
//		return area().compareTo(o.area()); ����Ÿ�Ծȵ�..
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
		return String.format("�ѷ�: %2.2f��, ����: %2.2f��", perimeter() ,area());
	}
	
}
