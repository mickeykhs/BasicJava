package lunchmenu;

import java.util.Random;

public class Menu {

	public static void main(String[] args) {
		Random random = new Random();
		int menu = random.nextInt(3);
		System.out.println("과연.. 오늘의 점심 메뉴는?");
		
		switch(menu) {
		case 0 :
			System.out.print("치킨");
			break;
		case 1 :
			System.out.print("삼겹살");
			break;
//		case 2 :
//			System.out.print("둘중");
//			break;
		}
		System.out.println(" 먹으러 가세요");
	}
}
