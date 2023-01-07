package chapter08.sec02;

import java.util.Arrays;

public class SortExample {
	public static void main(String[] args) {
		int[] numbers = { 4, 1, 9, 2, 6, 7, 8, 3 };
		String[] strings = {"가", "나", "바", "하", "차"};
		
		Arrays.sort(strings);
		System.out.println(Arrays.toString(strings));

		for (int i = 1; i < numbers.length; i++) {
			for (int j = i; j >= 1; j--) {

				if (numbers[j] < numbers[j - 1]) { // 한 칸씩 왼쪽으로 이동
					int tmp = numbers[j];
					numbers[j] = numbers[j - 1];
					numbers[j - 1] = tmp;
				} else
					break; // 자기보다 작은 데이터를 만나면 그 위치에서 멈춤

			}
		}
//		System.out.println(Arrays.toString(numbers));
	}
}
