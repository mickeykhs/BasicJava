package exercise;

public class Exercise45 {
	public static void main(String[] args) {

		for (int i = 1; i <= 4; i++) { //row . 콘솔창의 줄을 의미
			for (int j = 1; j <= i; j++) { //colunm . 콘솔창의 열을 의미

				System.out.printf("*");

			}
			System.out.println();
		}
	}
}
