package exercise;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("500��¥�� ������ ����:");
		int value1 = scanner.nextInt();
		
		System.out.println("100��¥�� ������ ����:");
		int value2 = scanner.nextInt();
		
		System.out.println("50��¥�� ������ ����:");
		int value3 = scanner.nextInt();
		
		System.out.println("10��¥�� ������ ����:");
		int value4 = scanner.nextInt();
		
		int result = (value1*500)+(value2*100)+(value3*50)+(value4*10);
		System.out.println("������ ���� ������ �� �׼�:"+result);
		scanner.close();
	}

}
/*
 */
