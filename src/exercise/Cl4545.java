package exercise;

import java.util.Scanner;

public class Cl4545 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		
		System.out.print("���α׷��� ����:");
		double a = scanner.nextDouble();
		System.out.print("�����ͺ��̽�:");
		double b = scanner.nextDouble();
		System.out.print("ȭ�� ����:");
		double c = scanner.nextDouble();
		System.out.print("���ø����̼� ����:");
		double d = scanner.nextDouble();
		System.out.print("�ӽŷ���:");
		double e = scanner.nextDouble();
		
		double average =((a+b+c+d+e)/5);
		int total = (int) (a+b+c+d+e);
		
			System.out.println("����: " + total);
			System.out.printf("���: %-10.2f\n" , average);
		if(average>=90) {
			System.out.println("A");
		} else if (average < 90 && average >=80) {
			System.out.println("B");
		} else if (average < 80 && average >=70) {
			System.out.println("C");
		} else if (average < 70 && average >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
			
		}scanner.close();
		
	}
}