package exercise;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		int lotto[] = new int[45];
		Random random = new Random();
		System.out.print("�ζǹ�ȣ: ");
		for(int i=0;i<lotto.length;i++) {
			lotto[i]= i+1;
		}
		for(int i=0;i<lotto.length;i++) {
			int num = random.nextInt();
			int temp= lotto[i];
			lotto[i]=lotto[num];
			lotto[num]= temp;
		}
		for(int i=0;i<6;i++) {
			System.out.print(lotto[i] + " ");
		}
	}
}
//�ζǹ�ȣ�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//(�ζ� ��ȣ�� 1 ~ 45������ ������ �� �߿��� �ߺ����� �ʴ� 6���� ���ڸ� �����Ͽ� ����� ����Ѵ�.)
/* ���� ��� ����
 * �� 45�� �迭¥�� ����� ����
 * 1���� 45�� ���ڸ� �ִ´� 
 * �׸��� ���´�
 * �ε����� 0������ �������� �����ε����ڸ��� �����ش�.
 * 45��¥���迭�� �����ְ� �տ��� 6���� ©�� �ζǹ�ȣ
 */