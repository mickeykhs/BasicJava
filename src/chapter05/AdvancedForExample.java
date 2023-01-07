package chapter05;

public class AdvancedForExample {
	public static void main(String[] args) {
		int[] scores = {95,71,84,93,87};
		int sum = 0;
		for (int figure : scores) {
			sum = sum + figure;
		}
		System.out.println("Á¡¼ö ÃÑÇÕ = " +sum);
		
		double avg = (double) sum/scores.length;
		System.out.println("Æò±Õ Á¡¼ö = "+ avg);
	}

}

