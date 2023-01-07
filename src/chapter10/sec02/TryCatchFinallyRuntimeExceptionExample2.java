package chapter10.sec02;

import java.util.Scanner;

public class TryCatchFinallyRuntimeExceptionExample2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("ù��° ���ڸ� �Է��ϼ���>");
				String data1 = scanner.nextLine();
				System.out.print("�ι�° ���ڸ� �Է��ϼ���>");
				String data2 = scanner.nextLine();
				int value1 = Integer.parseInt(data1);
				int value2 = Integer.parseInt(data2);
				int result = value1 + value2;
				System.out.printf("%d + %d = %d\n", value1, value2, result);
				break;
			} catch (NumberFormatException e) {
				System.out.println("���ڸ� �Է��ϼ���.");
//				scanner.next();
			} 
		}
		scanner.close();
	}
}
