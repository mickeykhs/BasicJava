package chapter03;

import java.util.Scanner;

public class practice9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 수:");
		double first = scanner.nextDouble();
		
		System.out.println("두 번째 수:");
		double second = scanner.nextDouble();
		
		System.out.println("-------------");
		
		double result = first/second;
		if((second==0)||(second==0.0)) {
			System.out.println("결과:무한대");
		}else
		System.out.println("결과:"+result);
		scanner.close();
	}

}
