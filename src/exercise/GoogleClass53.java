package exercise;

import java.util.Random;
import java.util.Scanner;

public class GoogleClass53 {
	public static void main(String[] args) {
		System.out.print("���� ���� ���� �Է��ϼ���: ");
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String user = scanner.nextLine();
		int computer = random.nextInt(3);
		int userNum = 0;
		
		if(user.equals("����")) {
			userNum = 0;
		} else if(user.equals("����")) {
			userNum = 1;
		} else {
			userNum = 2;
		}
		
		String scissors = "����";
		String rock = "����";
		String paper = "��";
		
		String userDecision = "none";
		String computerDecision = "none";
		//0:����,1:����,2:�� ����� �´��� ��Ī�����ֱ� ���� ���� ����
		
		if(userNum ==0) {
			userDecision = scissors;
		} else if (userNum == 1) {
			userDecision = rock;
		} else {
			userDecision = paper;
		}
		
		if (computer == 0) {
			computerDecision = scissors;
		} else if (computer == 1) {
			computerDecision = rock;
		} else {
			computerDecision = paper;
		}
		
		// � ���� �´��� ���.
		System.out.println("���̸� : " + userDecision);
		System.out.println("�ΰ����� ��ǻ��: " + computerDecision);
		
		// ���� ���θ� ������ ����� ������ִ� ����.
		if (userNum == computer) {
			System.out.println("���: �����ϴ�.");
		} else if (userNum - computer == 1) {
			System.out.println("���̸� �¸�!");
		} else if (userNum - computer == -2) {
			System.out.println("���̸� �¸�!");
		} else {
			System.out.println("��ǻ�� �¸�!");
		}
		scanner.close();
	}

}

