package exercise;

import java.util.Scanner;

public class Exercise22 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double distance = 40e12;
		double speed = 300000;
		double time = 31536000;
		//�������� ��Ÿ������ 1������ 3156���� �̱⶧����
		
		double result = distance/speed/time;
		System.out.println("���� �ӵ��� ���Ͻø� ���Ϳ츮 ������ ���µ� \n"
				+ "�ɸ��� �ð��� " +result+"�����̴�");
		scanner.close();
	}

}
/*double distance = 40e12;
  double speed = 300000;
  double result = distance/speed/60/60/24/365;
*/