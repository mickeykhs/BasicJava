package exercise;


import java.util.Random;

public class GoogleClass520 {
	public static void main(String[] args) {
		Random random = new Random();
		int numbers[] = new int[45];
		System.out.print("�ζǹ�ȣ: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		} // 1~45���� �ѹ��� �迭�� ���ڸ� ����

		for (int i = 0; i < numbers.length; i++) {
			int ranNum = random.nextInt(45);
			int temp = numbers[i];
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + " ");
		}
		// System.out.println(Arrays.toString(numbers)); �迭�� �ִ� ���ڸ� ����
	}

}   //numbers[i] = x     numbers[ranNum] = y
//�ζǹ�ȣ�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//(�ζ� ��ȣ�� 1 ~ 45������ ������ �� �߿��� �ߺ����� �ʴ� 6���� ���ڸ� �����Ͽ� ����� ����Ѵ�.)

/* ���� ��� ����
 * �� 45�� �迭¥�� ����� ����
 * 1���� 45�� ���ڸ� �ִ´� 
 * �׸��� ���´�
 * �ε����� 0������ �������� �����ε����ڸ��� �����ش�.
 * 45��¥���迭�� �����ְ� �տ��� 6���� ©�� �ζǹ�ȣ
 */
