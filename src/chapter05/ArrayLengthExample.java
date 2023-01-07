package chapter05;

public class ArrayLengthExample {
	public static void main(String[] args) {
//		int[] scores = {83, 90, 87};
//		
//		int sum = 0;
//		for(int i=0; i<3; i++) {
//			sum +=scores[i];
//		}
//		System.out.println("ÃÑÇÕ: "+ sum);
//		
//		double avg = (double) sum/scores.length;
//		System.out.println("Æò±Õ: "+ avg);
		int [] scores= {89, 93, 79};
		int sum = 0;
		for(int i=0;i<scores.length;i++) {
			sum += scores[i];
		}
		System.out.println("ÃÑÇÕ: " + sum);
		double avg = (double) sum/scores.length;
		System.out.println("Æò±Õ: "+ avg);
	}

}
//Çâ»óµÈ for¹® <for each>

//int[][] scores = {{95, 80},{92, 96,80}};
//for (int[] score : scores){
//  for(int s : score){
//     system.out.println(s);
