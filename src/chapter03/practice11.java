package chapter03;

import java.util.Scanner;

public class practice11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("아이디:");
		String name = scanner.next();
		
		System.out.println("패스워드");
		String strPassword = scanner.next();
		int password = Integer.parseInt(strPassword);
		
		scanner.close();
		
		if(name.equals("java")) {       //문자열 비교는 참조형을 비교연산자로 비교할수 없다.
			if(password==12345) {
				System.out.println("로그인 성공");
			} else {
			System.out.println("로그인 실패:패스워드가 틀림");
		}
	}	else {
		System.out.println("로그인 실패: 아이디 존재하지 않음");
	
	}
	}
}

