package exercise;

import java.util.Random;
import java.util.Scanner;

public class GoogleClass530 {
	public static void main(String[] args) {
		String computer[] = {"가위","바위","보"};
		
		System.out.print("가위바위보를 입력: ");
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine();
		Random random = new Random();
		String npc = computer[random.nextInt(3)];
		
		System.out.println("게이머: "+ user);
		System.out.println("인공지능 컴퓨터: "+ computer[random.nextInt(3)]);
		System.out.print("결과: "+ " ");
		
		if(user.equals(npc)) {
			System.out.println("비김");
		} else if(
				(user.equals("가위")&&npc.equals("보"))|| 
				(user.equals("바위")&&npc.equals("가위"))|| 
				(user.equals("보")&& npc.equals("바위"))){
			System.out.println("게이머 승리!");
		} else {
			System.out.println("콤퓨타승리!");
		}
		scanner.close();
	}	
}
