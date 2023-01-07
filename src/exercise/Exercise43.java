package exercise;

import java.util.Random;

public class Exercise43 {
	public static void main(String[] args) {

		while (true) {
			Random random = new Random();
			int num = random.nextInt(6) + 1;
			int num2 = random.nextInt(6) + 1;
			System.out.println("(" + num + "," + num2 + ")");

			if (num + num2 == 5) {
				break;
			}
		}
		System.out.println("프로그램 종료");
	}
}