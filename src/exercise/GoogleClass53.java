package exercise;

import java.util.Random;
import java.util.Scanner;

public class GoogleClass53 {
	public static void main(String[] args) {
		System.out.print("가위 바위 보를 입력하세요: ");
		
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		String user = scanner.nextLine();
		int computer = random.nextInt(3);
		int userNum = 0;
		
		if(user.equals("가위")) {
			userNum = 0;
		} else if(user.equals("바위")) {
			userNum = 1;
		} else {
			userNum = 2;
		}
		
		String scissors = "가위";
		String rock = "바위";
		String paper = "보";
		
		String userDecision = "none";
		String computerDecision = "none";
		//0:가위,1:바위,2:보 어떤것을 냈는지 매칭시켜주기 위한 변수 선언
		
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
		
		// 어떤 것을 냈는지 출력.
		System.out.println("게이머 : " + userDecision);
		System.out.println("인공지능 컴퓨터: " + computerDecision);
		
		// 승패 여부를 가려서 결과를 출력해주는 로직.
		if (userNum == computer) {
			System.out.println("결과: 비겼습니다.");
		} else if (userNum - computer == 1) {
			System.out.println("게이머 승리!");
		} else if (userNum - computer == -2) {
			System.out.println("게이머 승리!");
		} else {
			System.out.println("컴퓨터 승리!");
		}
		scanner.close();
	}

}

