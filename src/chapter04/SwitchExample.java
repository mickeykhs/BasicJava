package chapter04;

import java.util.Random;

public class SwitchExample {
	public static void main(String[] args) {
		//int num= (int) (Math.random()*6)+1;
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1번이 나왔습니다.");
			break;
		case 2:
			System.out.println("2번이 나왔습니다.");
			break;
		case 3:
			System.out.println("3번이 나왔습니다.");
			break;
		case 4:
			System.out.println("4번이 나왔습니다.");
			break;
		case 5:
			System.out.println("5번이 나왔습니다.");
			break;
			default:
				System.out.println("6번이 나왔습니다.");
				break;
		}
	}

}
/*
* 랜덤 숫자 만들기
*
* 1. 좋지 않은 방식
* int randomNum = (int) (Mathe.random() * 총개수) + 시작숫자;
*
* 2. 좋은 방식
* Random random = new Random();
* int randomNum = random.nextInt(총개수) + 시작숫자;
*
* 3. 보안 적용
* SecureRandom secureRandom = new SecureRandom();
* int randomNum = secureRandom.nextInt(총개수) + 시작숫자;
*/