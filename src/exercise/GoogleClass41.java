package exercise;

import java.util.Scanner;

public class GoogleClass41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�ﰢ���� ù��° ���� ���̸� �Է��ϼ���:");
		int num1 = scanner.nextInt();
		System.out.print("�ﰢ���� �ι�° ���� ���̸� �Է��ϼ���:");
		int num2 = scanner.nextInt();
		System.out.print("�ﰢ���� �ι�° ���� ���̸� �Է��ϼ���:");
		int num3 = scanner.nextInt();
		
		scanner.close();
		if((num1+num2<num3)||(num2+num3<num1)||(num1+num3<num2)) {
			System.out.println("�ﰢ���� ���� �� �����ϴ�.");
		} else {
			System.out.println("�ﰢ���� ���� �� �ֽ��ϴ�.");
		}
	}
}
// ����ڷκ��� �� ���� ���̸� �Է¹ް�, �ﰢ���� ���� �� �ִ��� �Ǻ��ϴ� ���α׷�
// ���� �亯�� ���̰� �ٸ� �� ���� ������ �պ��� ������ �ﰢ���� ���� �� �ִ�.