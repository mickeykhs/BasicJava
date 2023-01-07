package exercise;

import java.util.Scanner;

public class Exercise47 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------");
			System.out.print("선택> ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.print("예금액>");
				balance +=scanner.nextInt();
				break;
			case 2:
				System.out.print("출금액>");
				balance -=scanner.nextInt();
				break;
			case 3:
				System.out.println("잔고>" + balance);
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("프로그램 종료");
		scanner.close();
	}
}
//String inputData;
//inputData = scanner.nextLine();
//
//if (inputData.equals("4")) {
//	break;
//} else if (inputData.equals("1")) {
//	System.out.println("예금액>10000");
//} else if (inputData.equals("2")) {
//	System.out.println("출금액>2000");
//} else if (inputData.equals("3")) {
//	System.out.println("잔고>8000");
//}