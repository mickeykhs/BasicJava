package chapter03;

import java.util.Scanner;

public class practice11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���̵�:");
		String name = scanner.next();
		
		System.out.println("�н�����");
		String strPassword = scanner.next();
		int password = Integer.parseInt(strPassword);
		
		scanner.close();
		
		if(name.equals("java")) {       //���ڿ� �񱳴� �������� �񱳿����ڷ� ���Ҽ� ����.
			if(password==12345) {
				System.out.println("�α��� ����");
			} else {
			System.out.println("�α��� ����:�н����尡 Ʋ��");
		}
	}	else {
		System.out.println("�α��� ����: ���̵� �������� ����");
	
	}
	}
}

