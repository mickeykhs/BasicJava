package exercise;

import java.util.Scanner;

public class GoogleClass41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요:");
		int num1 = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요:");
		int num2 = scanner.nextInt();
		System.out.print("삼각형의 두번째 변의 길이를 입력하세요:");
		int num3 = scanner.nextInt();
		
		scanner.close();
		if((num1+num2<num3)||(num2+num3<num1)||(num1+num3<num2)) {
			System.out.println("삼각형을 만들 수 없습니다.");
		} else {
			System.out.println("삼각형을 만들 수 있습니다.");
		}
	}
}
// 사용자로부터 세 변의 길이를 입력받고, 삼각형을 만들 수 있는지 판별하는 프로그램
// 가장 긴변의 길이가 다른 두 변의 길이의 합보다 작으면 삼각형을 만들 수 있다.