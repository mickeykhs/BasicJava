package chapter08.exercise.practice01;

public class Triangle extends Shape {
	//�ʵ�
	private double side;
	
	//������
	public Triangle(double side) {
		this.side = side;
	}
	
	//�޼ҵ�
	public double area() {
//		return 1.7320508075/4*side*side;  ��Ʈ3 = 1.7~~~~
		return Math.sqrt(3)/4*side*side;
	}
	
	public double perimeter() {
		return side + side + side;
	}

	@Override		//������ ����, �ѷ�, ���̸� ���ڿ��� ��ȯ�Ѵ�.
	public String toString() {
		return String.format("������ ����: �ﰢ��, �ѷ�: %2.2f��, ����: %2.2f��",perimeter(), area());
	}
	
}
