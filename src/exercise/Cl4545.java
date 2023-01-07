package exercise;

import java.util.Scanner;

public class Cl4545 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요");
		
		System.out.print("프로그래밍 기초:");
		double a = scanner.nextDouble();
		System.out.print("데이터베이스:");
		double b = scanner.nextDouble();
		System.out.print("화면 구현:");
		double c = scanner.nextDouble();
		System.out.print("애플리케이션 구현:");
		double d = scanner.nextDouble();
		System.out.print("머신러닝:");
		double e = scanner.nextDouble();
		
		double average =((a+b+c+d+e)/5);
		int total = (int) (a+b+c+d+e);
		
			System.out.println("총점: " + total);
			System.out.printf("평균: %-10.2f\n" , average);
		if(average>=90) {
			System.out.println("A");
		} else if (average < 90 && average >=80) {
			System.out.println("B");
		} else if (average < 80 && average >=70) {
			System.out.println("C");
		} else if (average < 70 && average >=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
			
		}scanner.close();
		
	}
}