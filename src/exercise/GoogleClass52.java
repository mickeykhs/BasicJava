package exercise;

import java.util.Arrays;
import java.util.Random;

public class GoogleClass52 {
	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		Random random = new Random();
		
		System.out.print("�ζ� ��ȣ: ");
		for(int i=0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			for(int j= 0 ; j<i; j++) {
				if(lotto[i] ==lotto[j]) {
					i--;
					break;
				}
			}
		}
		
			System.out.print(Arrays.toString(lotto));
	}
}
//�ζǹ�ȣ�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//(�ζ� ��ȣ�� 1 ~ 45������ ������ �� �߿��� �ߺ����� �ʴ� 6���� ���ڸ� �����Ͽ� ����� ����Ѵ�.)