package exercise;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("수도 입니까? (수도: 1, 수도아님: 0)");
		int num = scanner.nextInt();
		
		System.out.println("총 인구는?(단위: 만)");
		int people = scanner.nextInt();
		
		System.out.println("연 소득이 1억 이상인 인구는?(단위:만)");
		int people2 = scanner.nextInt();
		
		scanner.close();
		
		String result = (num==1 && people >=100|| people2 >= 50) ? "이 도시는 메트로폴리스입니다.":
			"이 도시는 메트로폴리스가 아닙니다.";
		System.out.println(result);
			

	} 
}
//if를 사용한다면..
//if((num==1 && people >=100) || people2 >=50) {
//System.out.println("이 도시는 메트로폴리스입니다.");
//}else {
//System.out.println("이 도시는 메트로폴리스가 아닙니다");
//}
