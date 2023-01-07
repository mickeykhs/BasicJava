package exercise;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		int lotto[] = new int[45];
		Random random = new Random();
		System.out.print("로또번호: ");
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
//로또번호를 생성하는 프로그램을 작성하시오.
//(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)
/* 쌤의 방식 제안
 * 총 45개 배열짜리 만들어 놓고
 * 1부터 45의 숫자를 넣는다 
 * 그리고 섞는다
 * 인덱스가 0번부터 랜덤으로 나온인덱스자리랑 섞어준다.
 * 45개짜리배열이 섞여있고 앞에서 6개를 짤라서 로또번호
 */