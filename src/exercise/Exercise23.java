package exercise;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("����� �غ��� �������� �Է��Ͻÿ�.(����: cm): ");
		double radius = scanner.nextDouble();
		
		System.out.println("������� ���̸� �Է��Ͻÿ�.(����: cm): ");
		double height = scanner.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * height;
		
		System.out.println("����� �غ��� ���̴� " + area + "���̰�,\n" + 
		"������� ���Ǵ� "+ volume + "���̴�.");
		
		scanner.close();
	}

}
/*  System.out.printf("����� �غ��� ����:%f�� , ����: %f���̴�", area , volume); 
 *  �䷯�� ����� �ִ�. Ʈ�����!!! ����
 *  scanner.close(); <= ���ҽ� �� �ڿ��� ȥ�ڸ� ����ϴ� ���� �����Ѵ�.
 */