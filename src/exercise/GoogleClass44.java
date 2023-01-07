package exercise;

import java.util.Scanner;

public class GoogleClass44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = "가위";
		String b = "바위";
		String c = "보";
		System.out.println("가위 바위 보 게임");
		
		String result = "";
		
		
		System.out.print("철수: ");
		String cheolsu = scanner.next();
		
		System.out.print("영희: ");
		String yeonghee = scanner.next();
		
		if (cheolsu.equals(yeonghee)) {
			result = "비김";
		} else if(cheolsu.equals(a) ==yeonghee.equals(c) && 
				cheolsu.equals(b) ==yeonghee.equals(a) && 
				cheolsu.equals(c) ==yeonghee.equals(b)) {
			result = "철수승리!";
		} else{
			result = "영희승리!";
		} scanner.close();
			System.out.println("결과: " + result);
	}
}


// 가위바위보 게임
//두사람이 입력한 문자열을 비교 누가 이겼는지 출력
//Scanner 클래스의 next() 이용  String 타입 변수와 문자열 비교는 equals() 메소드로 비교
//가위 바위 보 게임
//철수: 가위
//영희: 바위
//결과: 영희 승리!

// 시험!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		System.out.println("가위 바위 보 게임");
//		
//		Scanner scanner = new Scanner(System.in);
//		 System.out.print("철수: ");
//		 String man = scanner.nextLine();
//		 int soo ;
//		 System.out.print("영희: ");
//		 String women = scanner.nextLine();
//		 int hee ;
//		 
//		 if(man.equals("가위")) {
//		 soo = 0;
//		 } else if(man.equals("바위")) {
//		 soo = 1;
//		 } else {
//		 soo =2;
//		 }
//		 if(women.equals("가위")) {
//		 hee = 0;
//		 } else if(women.equals("바위")) {
//		 hee = 1;
//		 } else {
//		 hee =2;
//		 }
//		 switch(soo-hee) {
//		 case -2 :    // -2인경우 soo :0(가위) hee: 2(보)
//			System.out.println("결과: 철수 승리!");
//		 	break;
//		 case -1 :   // -1인경우 soo : 1(바위) hee: 2(보)/ soo:0 (가위) hee:1(바위)
//			System.out.println("결과: 영희 승리!");
//			break;
//		 case 0 :   // 0인경우 soo=hee
//			System.out.println("결과: 무승부!");
//			break;
//		 case 1 :   //1인경우 soo: 2(보)
//			System.out.println("결과: 철수 승리!");
//			break;
//		 case 2 :
//			System.out.println("결과: 영희 승리!");
//			break;
//		 }
//		 scanner.close();