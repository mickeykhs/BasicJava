package exercise;

import java.util.Scanner;

public class GoogleClass43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		 System.out.println("점수를입력하세요.");
		 System.out.print("프로그래밍 기초: ");
		 int score1 = scanner.nextInt();
		 System.out.print("데이터베이스: ");
		 int score2 = scanner.nextInt();
		 System.out.print("화면 구현: ");
		 int score3 = scanner.nextInt();
		 System.out.print("애플리케이션 구현: ");
		 int score4 = scanner.nextInt();
		 System.out.print("머신러닝: ");
		 int score5 = scanner.nextInt();
		
		 int total = (score1 + score2 + score3 + score4 +
		score5);
		 double average = (double) (score1 + score2 +score3 + score4 + score5)/5;
		 int grade = total/5;
		
		 System.out.printf("총점: %d\n", total);
		 System.out.printf("평균: %-10.2f\n", average);
		 switch(grade/10) {
		 case 10 : case 9 :
		 System.out.println("학점: A");
		 	break;
		 case 8 :
		 System.out.println("학점: B");
			break;
		 case 7 :
		 System.out.println("학점: C");
		 	break;
		  case 6 :
		  System.out.println("학점: D");
		  	break;
		  default :
		  System.out.println("학점: F");
		  }
		  scanner.close();
	}
}
//		System.out.println("점수를 입력하세요");
//		
//		System.out.print("프로그래밍 기초:");
//		double a = scanner.nextDouble();
//		System.out.print("데이터베이스:");
//		double b = scanner.nextDouble();
//		System.out.print("화면 구현:");
//		double c = scanner.nextDouble();
//		System.out.print("애플리케이션 구현:");
//		double d = scanner.nextDouble();
//		System.out.print("머신러닝:");
//		double e = scanner.nextDouble();
//		
//		double average =((a+b+c+d+e)/5);
//		int total = (int) (a+b+c+d+e);
//		
//			System.out.println("총점: " + total);
//			System.out.printf("평균: %-10.2f\n" , average);
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
// 5과목의 점수를 입력받아 평균을 구하는 프로그램
// 평균점수로 학점을 계산하여 출력 ( 평균점수는 소수점 2자리까지만 출력)
// 90 이상=A 80-89=B 70-79=C 60-69=D 59이하=F
// 프로그래밍 기초   데이터베이스   화면 구현   애플리케이션 구현   머신러닝