package exercise;

import java.util.Random;
import java.util.Scanner;

public class GoogleClass45 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int ran = random.nextInt(100) + 1;
		int count = 0;

		while (true) {
			System.out.print("1���� 100 ������ ���� �� �ϳ��� �����ϼ���: ");
			int input = scanner.nextInt();
			count++;
			if (input > ran) {
				System.out.println("������ �� ���� �� �Դϴ�");
			} else if (input < ran) {
				System.out.println("������ �� ū �� �Դϴ�");
			} else {
				break;
			}
		}
		System.out.printf("%d������ �����Դϴ�.\n������ �����մϴ�.", count);
		scanner.close();
	}
}


//��ǻ�Ͱ� 1~100���� ������ ���� ����  / �׼��� ���ߴ� ����
//����ڰ� ������ ���� �Է� ,  ��ǻ�Ͱ� ������ ������ ū�� �������� �˷���
//����ڰ� ������ ���� ��ǻ�Ͱ� ������ ���� ���������� �ݺ�.
//new Random().nextInt(100)+1 �� ���� �� �ִ�.

//1���� 100 ������ ���� �� �ϳ��� �����ϼ���:50
//������ �� ū �� �Դϴ�.
//1���� 100 ������ ���� �� �ϳ��� �����ϼ���:88
//������ �� ���� �� �Դϴ�.
//1���� 100 ������ ���� �� �ϳ��� �����ϼ���:82
//�����Դϴ�.
//������ �����մϴ�.
