package exercise;

import java.util.Scanner;

public class Exercise47 {
	public static void main(String[] args) {
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------");
			System.out.println("1.���� | 2.��� | 3.�ܰ� | 4.����");
			System.out.println("-------------------------");
			System.out.print("����> ");
			int menu = scanner.nextInt();
			switch (menu) {
			case 1:
				System.out.print("���ݾ�>");
				balance +=scanner.nextInt();
				break;
			case 2:
				System.out.print("��ݾ�>");
				balance -=scanner.nextInt();
				break;
			case 3:
				System.out.println("�ܰ�>" + balance);
				break;
			case 4:
				run = false;
				break;
			}
		}
		System.out.println("���α׷� ����");
		scanner.close();
	}
}
//String inputData;
//inputData = scanner.nextLine();
//
//if (inputData.equals("4")) {
//	break;
//} else if (inputData.equals("1")) {
//	System.out.println("���ݾ�>10000");
//} else if (inputData.equals("2")) {
//	System.out.println("��ݾ�>2000");
//} else if (inputData.equals("3")) {
//	System.out.println("�ܰ�>8000");
//}