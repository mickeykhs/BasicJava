package lunchmenu;

import java.util.Random;

public class Menu {

	public static void main(String[] args) {
		Random random = new Random();
		int menu = random.nextInt(3);
		System.out.println("����.. ������ ���� �޴���?");
		
		switch(menu) {
		case 0 :
			System.out.print("ġŲ");
			break;
		case 1 :
			System.out.print("����");
			break;
//		case 2 :
//			System.out.print("����");
//			break;
		}
		System.out.println(" ������ ������");
	}
}
