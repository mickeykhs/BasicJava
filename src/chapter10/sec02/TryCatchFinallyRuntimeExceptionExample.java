package chapter10.sec02;

import java.util.Scanner;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ù��° ���ڸ� �Է��ϼ���>");
		String data1 = scanner.nextLine();
		System.out.print("�ι�° ���ڸ� �Է��ϼ���>");
		String data2 = scanner.nextLine();
		
		int value1 = 0;
		try {
			value1 = Integer.parseInt(data1);
		} catch (NumberFormatException e) {
//			e.printStackTrace();
		}
		int value2 = 0;
		try {
			value2 = Integer.parseInt(data2);
		} catch (NumberFormatException e) {
//			e.printStackTrace();
		}
		int result = value1 + value2;
		System.out.printf("%d + %d = %d\n", value1 , value2, result);
		
		scanner.close();
	}
}
