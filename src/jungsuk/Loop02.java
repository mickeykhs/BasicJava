package jungsuk;

public class Loop02 {
	public static void main(String[] args) {
		//과목 : kor,eng
		int [][] jumsuArr= {
				{90,80}, //[0][0]  [0][1]
				{95,75}, //[1][0]  [0][2]
				{100,90},//[2][0]  [0][3]
				{95,85}, //[3][0]  [0][4]
				{80,100} //[4][0]  [0][5]
		};				 // i  j    i  j
		
		//while문을 사용하여 다음과 같이 출력해보자
		//kor의 평균 : 90
		//eng의 평균 : 90
		int sum =0;
		int sum2 = 0;
		int i = 0;
		int j = 0;

		while(i<1) {
			while(j<jumsuArr.length) {
				sum = sum + jumsuArr[j][i];
				j++;
			}
			i++;
			System.out.println("kor의 평균 : " + (double)sum/jumsuArr.length);
		}
		i=1;
		j=0;
		while(i<2) {
			while(j<jumsuArr.length) {
				sum2 = sum2 + jumsuArr[j][i];
				j++;
			}
			i++;
			System.out.println("eng의 평균 : " + (double)sum2/jumsuArr.length);
		}
	}
}
