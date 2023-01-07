package exercise;

import java.util.Scanner;

public class Exercise23 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("원기둥 밑변의 반지름을 입력하시오.(단위: cm): ");
		double radius = scanner.nextDouble();
		
		System.out.println("원기둥의 높이를 입력하시오.(단위: cm): ");
		double height = scanner.nextDouble();
		
		double area = radius * radius * Math.PI;
		double volume = area * height;
		
		System.out.println("원기둥 밑변의 넓이는 " + area + "㎠이고,\n" + 
		"원기둥의 부피는 "+ volume + "㎤이다.");
		
		scanner.close();
	}

}
/*  System.out.printf("원기둥 밑변의 넓이:%f㎠ , 부피: %f㎤이다", area , volume); 
 *  요러한 방법도 있다. 트렌드다!!! ㅋㅋ
 *  scanner.close(); <= 리소스 즉 자원을 혼자만 사용하는 것을 방지한다.
 */