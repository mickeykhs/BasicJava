package exercise;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요:");
		int a = scanner.nextInt();
		
		System.out.println("두 번째 숫자를 입력하세요:");
		int b = scanner.nextInt();
		
		int c = ((a + b) + Math.abs(a-b))/2;
		int d = ((a + b) - Math.abs(a-b))/2;
		
		scanner.close();
		
		if (c==0||d==0) {
			System.out.println("성립하지 않는다");
		}
		else {
		System.out.printf("큰 수를 작은 수로 나눈 몫은 %d이고, 나머지는 %d이다",c/d,c%d );
	}

}
}
//절대값을 반환하는 메소드는 Math.abs(숫자)이다.