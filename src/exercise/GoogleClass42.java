package exercise;

import java.util.Scanner;

public class GoogleClass42 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1~12):");
		
		int month = scanner.nextInt();
		switch(month){
			
			case 1: case 2: case 12:
				System.out.printf("%d���� �ܿ� �Դϴ�",month);
				break;
			case 6: case 7: case 8:
				System.out.printf("%d���� ���� �Դϴ�",month);
				break;
			case 3: case 4: case 5:
				System.out.printf("%d���� �� �Դϴ�",month);
				break;
			case 9: case 10: case 11:
				System.out.printf("%d���� ���� �Դϴ�",month);
				break;
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�");
				break;
		}
		scanner.close();
	}
}

//Ư�� ���� �Է¹ް�
//�Է¹��� ���� ������ �˾Ƴ���
//3-5 �� 6-8 ���� 9-11 ���� 12-2 �ܿ�

//if(month>=3&&month<=5) {
//System.out.println("��");
//} else if (month>=6&&month<=8) {
//System.out.println("����");
//} else if (month>=9&&month<=11) {
//System.out.println("����");
//} else {
//System.out.println("�ܿ�");
//}scanner.close();