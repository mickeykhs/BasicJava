package exercise;

import java.util.Scanner;

public class Exercise21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//�Է�
		System.out.println("������ ���̴�? (����: m)");
		double width = scanner.nextDouble();
		
		System.out.println("������ ���̴�? (����: m)");
		double height = scanner.nextDouble();
		//ó��
		double area = width * height;
		System.out.println("���簢���� ����: " +area);
		double perimeter = (width + height) *2;
		//���
		System.out.println("���簢���� �ѷ�: " +perimeter);
		scanner.close();
	}

}
/*�Ǽ� �ڷ����� �̿��Ͽ� ���簢���� �ѷ��� ������ ���ϴ� ���α׷��� ������.
 *  �Ǽ��� ���� width(����), height(����), area(����),
 *   perimeter(�ѷ�)�� �����ϰ�, Scanner Ŭ������ �̿��Ͽ� ����ڷκ��� 
 *   ���簢���� ����, ���� ���̸� �Է¹޾� ������ ���� ���̿� �ѷ��� ����Ѵ�.
*/