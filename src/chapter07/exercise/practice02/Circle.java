package chapter07.exercise.practice02;

public class Circle extends Shape{
	//�ʵ�
	private double radius;
	
	//������
	public Circle(double radius){
		this.radius = radius;
	}
	
	//�޼ҵ�
	public double area() {
		return Math.PI * radius *radius;
	}
	
	public double perimeter() {
		return Math.PI * 2 * radius;
	}

	@Override        //������ ����, �ѷ�, ���̸� ���ڿ��� ��ȯ�Ѵ�.
	public String toString() {
		return "������ ����: ��, �ѷ�: " +perimeter() + "cm, ����: " +  area() +"��";
	}
	
}
