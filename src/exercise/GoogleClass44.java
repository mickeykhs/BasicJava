package exercise;

import java.util.Scanner;

public class GoogleClass44 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String a = "����";
		String b = "����";
		String c = "��";
		System.out.println("���� ���� �� ����");
		
		String result = "";
		
		
		System.out.print("ö��: ");
		String cheolsu = scanner.next();
		
		System.out.print("����: ");
		String yeonghee = scanner.next();
		
		if (cheolsu.equals(yeonghee)) {
			result = "���";
		} else if(cheolsu.equals(a) ==yeonghee.equals(c) && 
				cheolsu.equals(b) ==yeonghee.equals(a) && 
				cheolsu.equals(c) ==yeonghee.equals(b)) {
			result = "ö���¸�!";
		} else{
			result = "����¸�!";
		} scanner.close();
			System.out.println("���: " + result);
	}
}


// ���������� ����
//�λ���� �Է��� ���ڿ��� �� ���� �̰���� ���
//Scanner Ŭ������ next() �̿�  String Ÿ�� ������ ���ڿ� �񱳴� equals() �޼ҵ�� ��
//���� ���� �� ����
//ö��: ����
//����: ����
//���: ���� �¸�!

// ����!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//		System.out.println("���� ���� �� ����");
//		
//		Scanner scanner = new Scanner(System.in);
//		 System.out.print("ö��: ");
//		 String man = scanner.nextLine();
//		 int soo ;
//		 System.out.print("����: ");
//		 String women = scanner.nextLine();
//		 int hee ;
//		 
//		 if(man.equals("����")) {
//		 soo = 0;
//		 } else if(man.equals("����")) {
//		 soo = 1;
//		 } else {
//		 soo =2;
//		 }
//		 if(women.equals("����")) {
//		 hee = 0;
//		 } else if(women.equals("����")) {
//		 hee = 1;
//		 } else {
//		 hee =2;
//		 }
//		 switch(soo-hee) {
//		 case -2 :    // -2�ΰ�� soo :0(����) hee: 2(��)
//			System.out.println("���: ö�� �¸�!");
//		 	break;
//		 case -1 :   // -1�ΰ�� soo : 1(����) hee: 2(��)/ soo:0 (����) hee:1(����)
//			System.out.println("���: ���� �¸�!");
//			break;
//		 case 0 :   // 0�ΰ�� soo=hee
//			System.out.println("���: ���º�!");
//			break;
//		 case 1 :   //1�ΰ�� soo: 2(��)
//			System.out.println("���: ö�� �¸�!");
//			break;
//		 case 2 :
//			System.out.println("���: ���� �¸�!");
//			break;
//		 }
//		 scanner.close();