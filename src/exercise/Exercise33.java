package exercise;

import java.util.Scanner;

public class Exercise33 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("���������� Ȯ���� ������ �Է��ϼ���: ");
		int year = scanner.nextInt();
		scanner.close();
		String result = ((year%4==0 && year%100!=0)||year%400==0) ? year + "���� �����Դϴ�." 
				: year + "���� ������ �ƴմϴ�";
		
		System.out.println(result);

			}
	}


/*������ 4�� ������� �ϰ� 100�� ����� �ƴϾ�� �Ѵ�.
 400�� ����� ������ ������ �ȴ�.
if((year%4==0 && year%100!=0)||year%400==0) { 
System.out.println(year + "���� �����Դϴ�.");
} else {
System.out.println(year + "���� ������ �ƴմϴ�.");
*/