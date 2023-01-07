package chapter10.exercise.practice01;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("어떤 수로 나누시겠습니까?>>");
				// 'a b'가 입력되었을 때
				//next() : 공백 또는 엔터(종료) - a
				//nextLine() : 엔터만(종료) - a b
				int dividend = Integer.parseInt(scanner.nextLine());
				
				System.out.print("어떤 수로 나누시겠습니까?>>");
				int divisor = Integer.parseInt(scanner.nextLine());
				

				int result = dividend / divisor;
				
				System.out.printf("%d / %d = %d\n 나머지는: %d", dividend, divisor, result, dividend%divisor);
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
