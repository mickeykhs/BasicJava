package exercise;

import java.util.Scanner;

public class GoogleClass44_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
//		String a = "����";
//		String b = "����";
//		String c = "��";
		System.out.println("���� ���� �� ����");
		
		
		System.out.print("ö��: ");
		String ö�� = scanner.next();
		
		System.out.print("����: ");
		String ���� = scanner.next();
		
		String result = "";
		
		if (ö��.equals(����)) {
			result = "���";
		} else if(ö��.equals("����") &&����.equals("��") || 
				ö��.equals("����") &&����.equals("����") || 
						ö��.equals("��") &&����.equals("����")) {
			result = "ö���¸�!";
		} else{
			result = "����¸�!";
		}	System.out.println("���: " + result);
		    scanner.close();
	}
}


