package exercise;

import java.util.Arrays;
import java.util.Random;

public class GoogleClass52 {
	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		Random random = new Random();
		
		System.out.print("로또 번호: ");
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
//로또번호를 생성하는 프로그램을 작성하시오.
//(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)