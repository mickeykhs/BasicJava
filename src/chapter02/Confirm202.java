package chapter02;

import java.util.Scanner;

public class Confirm202 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//�Է�
		System.out.println("ù��° ��:");
		String strNum1 = scanner.nextLine();
		System.out.println("�ι�° ��:");
		String strNum2 = scanner.nextLine();
		//ó��
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		//���
		System.out.println(result);
		scanner.close();
	}

}
