package exercise;

import java.util.Scanner;

public class Exercise32 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���� �Դϱ�? (����: 1, �����ƴ�: 0)");
		int num = scanner.nextInt();
		
		System.out.println("�� �α���?(����: ��)");
		int people = scanner.nextInt();
		
		System.out.println("�� �ҵ��� 1�� �̻��� �α���?(����:��)");
		int people2 = scanner.nextInt();
		
		scanner.close();
		
		String result = (num==1 && people >=100|| people2 >= 50) ? "�� ���ô� ��Ʈ���������Դϴ�.":
			"�� ���ô� ��Ʈ���������� �ƴմϴ�.";
		System.out.println(result);
			

	} 
}
//if�� ����Ѵٸ�..
//if((num==1 && people >=100) || people2 >=50) {
//System.out.println("�� ���ô� ��Ʈ���������Դϴ�.");
//}else {
//System.out.println("�� ���ô� ��Ʈ���������� �ƴմϴ�");
//}
