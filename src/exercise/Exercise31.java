package exercise;

import java.util.Scanner;

public class Exercise31 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ù ��° ���ڸ� �Է��ϼ���:");
		int a = scanner.nextInt();
		
		System.out.println("�� ��° ���ڸ� �Է��ϼ���:");
		int b = scanner.nextInt();
		
		int c = ((a + b) + Math.abs(a-b))/2;
		int d = ((a + b) - Math.abs(a-b))/2;
		
		scanner.close();
		
		if (c==0||d==0) {
			System.out.println("�������� �ʴ´�");
		}
		else {
		System.out.printf("ū ���� ���� ���� ���� ���� %d�̰�, �������� %d�̴�",c/d,c%d );
	}

}
}
//���밪�� ��ȯ�ϴ� �޼ҵ�� Math.abs(����)�̴�.