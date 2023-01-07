package chapter10.exercise.practice01;

import java.util.Scanner;

public class Exercise12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			try {
				System.out.print("� ���� �����ðڽ��ϱ�?>>");
				// 'a b'�� �ԷµǾ��� ��
				//next() : ���� �Ǵ� ����(����) - a
				//nextLine() : ���͸�(����) - a b
				int dividend = Integer.parseInt(scanner.nextLine());
				
				System.out.print("� ���� �����ðڽ��ϱ�?>>");
				int divisor = Integer.parseInt(scanner.nextLine());
				

				int result = dividend / divisor;
				
				System.out.printf("%d / %d = %d\n ��������: %d", dividend, divisor, result, dividend%divisor);
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
