package exercise;


import java.util.Random;

public class GoogleClass520 {
	public static void main(String[] args) {
		Random random = new Random();
		int numbers[] = new int[45];
		System.out.print("로또번호: ");

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = i + 1;
		} // 1~45까지 넘버스 배열에 숫자를 넣음

		for (int i = 0; i < numbers.length; i++) {
			int ranNum = random.nextInt(45);
			int temp = numbers[i];
			numbers[i] = numbers[ranNum];
			numbers[ranNum] = temp;
		}
		for (int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + " ");
		}
		// System.out.println(Arrays.toString(numbers)); 배열에 있는 숫자를 나열
	}

}   //numbers[i] = x     numbers[ranNum] = y
//로또번호를 생성하는 프로그램을 작성하시오.
//(로또 번호는 1 ~ 45번까지 있으며 이 중에서 중복되지 않는 6개의 숫자를 추출하여 결과를 출력한다.)

/* 쌤의 방식 제안
 * 총 45개 배열짜리 만들어 놓고
 * 1부터 45의 숫자를 넣는다 
 * 그리고 섞는다
 * 인덱스가 0번부터 랜덤으로 나온인덱스자리랑 섞어준다.
 * 45개짜리배열이 섞여있고 앞에서 6개를 짤라서 로또번호
 */
