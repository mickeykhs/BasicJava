package chapter04;

import java.util.Random;

public class SwitchExample {
	public static void main(String[] args) {
		//int num= (int) (Math.random()*6)+1;
		Random random = new Random();
		int num = random.nextInt(6) + 1;
		
		switch(num) {
		case 1:
			System.out.println("1���� ���Խ��ϴ�.");
			break;
		case 2:
			System.out.println("2���� ���Խ��ϴ�.");
			break;
		case 3:
			System.out.println("3���� ���Խ��ϴ�.");
			break;
		case 4:
			System.out.println("4���� ���Խ��ϴ�.");
			break;
		case 5:
			System.out.println("5���� ���Խ��ϴ�.");
			break;
			default:
				System.out.println("6���� ���Խ��ϴ�.");
				break;
		}
	}

}
/*
* ���� ���� �����
*
* 1. ���� ���� ���
* int randomNum = (int) (Mathe.random() * �Ѱ���) + ���ۼ���;
*
* 2. ���� ���
* Random random = new Random();
* int randomNum = random.nextInt(�Ѱ���) + ���ۼ���;
*
* 3. ���� ����
* SecureRandom secureRandom = new SecureRandom();
* int randomNum = secureRandom.nextInt(�Ѱ���) + ���ۼ���;
*/