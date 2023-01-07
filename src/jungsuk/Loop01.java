package jungsuk;

public class Loop01 {
	public static void main(String[] args) {
		int[] jumsu = {85,90,70,75,100,95,95,80,75,85};
		
		//jumsu의 평균을 구해보자(while문으로 처리해보자)
		int x = 0;
		int sum = 0;
		
		while(x < jumsu.length) {
			sum = sum+ jumsu[x];
			x = x+1;
		}
		int avg = sum/jumsu.length;
		System.out.println("평균: " + avg);
		
	}
}
