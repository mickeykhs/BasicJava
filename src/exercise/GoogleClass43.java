package exercise;

import java.util.Scanner;

public class GoogleClass43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("�������Է��ϼ���.");
		 System.out.print("���α׷��� ����: ");
		 int score1 = scanner.nextInt();
		 System.out.print("�����ͺ��̽�: ");
		 int score2 = scanner.nextInt();
		 System.out.print("ȭ�� ����: ");
		 int score3 = scanner.nextInt();
		 System.out.print("���ø����̼� ����: ");
		 int score4 = scanner.nextInt();
		 System.out.print("�ӽŷ���: ");
		 int score5 = scanner.nextInt();
		
		 int total = (score1 + score2 + score3 + score4 +
		score5);
		 double average = (double) (score1 + score2 +score3 + score4 + score5)/5;
		 int grade = total/5;
		
		 System.out.printf("����: %d\n", total);
		 System.out.printf("���: %-10.2f\n", average);
		 switch(grade/10) {
		 case 10 : case 9 :
		 System.out.println("����: A");
		 	break;
		 case 8 :
		 System.out.println("����: B");
			break;
		 case 7 :
		 System.out.println("����: C");
		 	break;
		  case 6 :
		  System.out.println("����: D");
		  	break;
		  default :
		  System.out.println("����: F");
		  }
		  scanner.close();
	}
}
//		System.out.println("������ �Է��ϼ���");
//		
//		System.out.print("���α׷��� ����:");
//		double a = scanner.nextDouble();
//		System.out.print("�����ͺ��̽�:");
//		double b = scanner.nextDouble();
//		System.out.print("ȭ�� ����:");
//		double c = scanner.nextDouble();
//		System.out.print("���ø����̼� ����:");
//		double d = scanner.nextDouble();
//		System.out.print("�ӽŷ���:");
//		double e = scanner.nextDouble();
//		
//		double average =((a+b+c+d+e)/5);
//		int total = (int) (a+b+c+d+e);
//		
//			System.out.println("����: " + total);
//			System.out.printf("���: %-10.2f\n" , average);
//		if(average>=90) {
//			System.out.println("A");
//		} else if (average < 90 && average >=80) {
//			System.out.println("B");
//		} else if (average < 80 && average >=70) {
//			System.out.println("C");
//		} else if (average < 70 && average >=60) {
//			System.out.println("D");
//		} else {
//			System.out.println("F");
//			
//		}scanner.close();
// 5������ ������ �Է¹޾� ����� ���ϴ� ���α׷�
// ��������� ������ ����Ͽ� ��� ( ��������� �Ҽ��� 2�ڸ������� ���)
// 90 �̻�=A 80-89=B 70-79=C 60-69=D 59����=F
// ���α׷��� ����   �����ͺ��̽�   ȭ�� ����   ���ø����̼� ����   �ӽŷ���