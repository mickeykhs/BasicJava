package exercise;

public class Exercise46 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 4; j > 0; j--) {
				if (j > i) {
					System.out.printf(" ");
				} else {
					System.out.printf("*");
				}
			}
			System.out.println();
		}
	}
}
