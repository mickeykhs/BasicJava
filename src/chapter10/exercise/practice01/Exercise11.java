package chapter10.exercise.practice01;

import java.util.Scanner;

public class Exercise11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			try {
				System.out.print("어떤 수를 나누시겠습니까?>>");
				String data1 = scanner.nextLine();
				int value1 = Integer.parseInt(data1);
				System.out.print("어떤 수로 나누시겠습니까?>>");
				String data2 = scanner.nextLine();
				int value2 = Integer.parseInt(data2);
				int result = value1 / value2;
				System.out.printf("%d / %d = %d\n 나머지는: %d", value1, value2, result, value1%value2);
				break;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다. 다시 입력해주세요.");
			} 
		}
		scanner.close();
	}
}
