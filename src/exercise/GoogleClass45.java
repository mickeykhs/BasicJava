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
			System.out.print("1부터 100 사이의 정수 중 하나를 선택하세요: ");
			int input = scanner.nextInt();
			count++;
			if (input > ran) {
				System.out.println("정답은 더 작은 수 입니다");
			} else if (input < ran) {
				System.out.println("정답은 더 큰 수 입니다");
			} else {
				break;
			}
		}
		System.out.printf("%d번만에 정답입니다.\n게임을 종료합니다.", count);
		scanner.close();
	}
}


//컴퓨터가 1~100사이 임의의 정수 생성  / 그수를 맞추는 게임
//사용자가 추측한 수를 입력 ,  컴퓨터가 생성한 수보다 큰지 작은지를 알려줌
//사용자가 추측한 수가 컴퓨터가 생성한 수와 같을때까지 반복.
//new Random().nextInt(100)+1 로 구할 수 있다.

//1부터 100 사이의 정수 중 하나를 선택하세요:50
//정답은 더 큰 수 입니다.
//1부터 100 사이의 정수 중 하나를 선택하세요:88
//정답은 더 작은 수 입니다.
//1부터 100 사이의 정수 중 하나를 선택하세요:82
//정답입니다.
//게임을 종료합니다.
