package exercise;

import java.util.Scanner;

public class Exercise24 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("500원짜리 동전의 갯수:");
		int value1 = scanner.nextInt();
		
		System.out.println("100원짜리 동전의 갯수:");
		int value2 = scanner.nextInt();
		
		System.out.println("50원짜리 동전의 갯수:");
		int value3 = scanner.nextInt();
		
		System.out.println("10원짜리 동전의 갯수:");
		int value4 = scanner.nextInt();
		
		int result = (value1*500)+(value2*100)+(value3*50)+(value4*10);
		System.out.println("저금통 안의 동전의 총 액수:"+result);
		scanner.close();
	}

}
/*
 */
