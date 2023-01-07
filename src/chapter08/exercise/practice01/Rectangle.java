package chapter08.exercise.practice01;

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
		return String.format("������ ����: �簢��, �ѷ�: %2.2f��, ����: %2.2f��", perimeter(),area());
	}
	
}
