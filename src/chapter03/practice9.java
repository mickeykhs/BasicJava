package chapter03;

import java.util.Scanner;

public class practice9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù ��° ��:");
		double first = scanner.nextDouble();
		
		System.out.println("�� ��° ��:");
		double second = scanner.nextDouble();
		
		System.out.println("-------------");
		
		double result = first/second;
		if((second==0)||(second==0.0)) {
			System.out.println("���:���Ѵ�");
		}else
		System.out.println("���:"+result);
		scanner.close();
	}

}
