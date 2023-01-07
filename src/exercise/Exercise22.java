package exercise;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double distance = 40e12;
		double speed = 300000;
		double time = 31536000;
		//광년으로 나타내려면 1광년은 3156만초 이기때문에
		
		double result = distance/speed/time;
		System.out.println("빛의 속도로 프록시마 센터우리 별까지 가는데 \n"
				+ "걸리는 시간은 " +result+"광년이다");
		scanner.close();
	}

}
/*double distance = 40e12;
  double speed = 300000;
  double result = distance/speed/60/60/24/365;
*/