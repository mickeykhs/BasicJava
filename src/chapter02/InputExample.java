package chapter02;

import java.util.Scanner;

public class InputExample {
	public static void main(String[] args) {
		//Scanner�� �̿��ؼ� ������ �Է� �ޱ�
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���:");
		int value1 = scanner.nextInt();
		System.out.println("�Ǽ��� �Է��ϼ���:");
		double value2 = scanner.nextDouble();
		System.out.println("���ڸ� �Է��ϼ���:");
		String next = scanner.next();
		System.out.println("���ڸ� �Է��ϼ���:");
		String nextLine = scanner.nextLine();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(next);
		System.out.println(nextLine);
		scanner.close();
	}
	}
	
