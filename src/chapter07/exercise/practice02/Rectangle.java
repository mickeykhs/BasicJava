package chapter07.exercise.practice02;

public class Rectangle extends Shape{
	//�ʵ�
	private double width;
	private double height;
	
	//������
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	//�޼ҵ�
	public double area() {
		return width * height;
	}
	public double perimeter() {
		return 2*(width + height);
	}

	@Override			//������ ����, �ѷ�, ���̸� ���ڿ��� ��ȯ�Ѵ�.
	public String toString() {
		return "������ ����: �簢��, �ѷ�: " +perimeter() + "cm, ����: " + area()+"��";
	}
	
}
