package chapter10.exercise.practice01;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("� ���� �����ðڽ��ϱ�?>>");
				String data1 = scanner.nextLine();
				int value1 = Integer.parseInt(data1);
				System.out.print("� ���� �����ðڽ��ϱ�?>>");
				String data2 = scanner.nextLine();
				int value2 = Integer.parseInt(data2);
				int result = value1 / value2;
				System.out.printf("%d / %d = %d\n ��������: %d", value1, value2, result, value1%value2);
				break;
			} catch (NumberFormatException e) {
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է����ּ���.");
			} catch (ArithmeticException e) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
			} 
		}
		scanner.close();
	}
}
