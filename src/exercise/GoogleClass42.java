package exercise;

import java.util.Scanner;

public class GoogleClass42 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12):");
		
		int month = scanner.nextInt();
		switch(month){
			
			case 1: case 2: case 12:
				System.out.printf("%d월은 겨울 입니다",month);
				break;
			case 6: case 7: case 8:
				System.out.printf("%d월은 여름 입니다",month);
				break;
			case 3: case 4: case 5:
				System.out.printf("%d월은 봄 입니다",month);
				break;
			case 9: case 10: case 11:
				System.out.printf("%d월은 가을 입니다",month);
				break;
			default:
				System.out.println("잘못 입력하셨습니다");
				break;
		}
		scanner.close();
	}
}

//특정 월을 입력받고
//입력받은 월의 계절을 알아내자
//3-5 봄 6-8 여름 9-11 가을 12-2 겨울

//if(month>=3&&month<=5) {
//System.out.println("봄");
//} else if (month>=6&&month<=8) {
//System.out.println("여름");
//} else if (month>=9&&month<=11) {
//System.out.println("가을");
//} else {
//System.out.println("겨울");
//}scanner.close();