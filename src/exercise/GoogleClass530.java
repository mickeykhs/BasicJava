package exercise;

import java.util.Random;
import java.util.Scanner;

public class GoogleClass530 {
	public static void main(String[] args) {
		String computer[] = {"����","����","��"};
		
		System.out.print("������������ �Է�: ");
		Scanner scanner = new Scanner(System.in);
		String user = scanner.nextLine();
		Random random = new Random();
		String npc = computer[random.nextInt(3)];
		
		System.out.println("���̸�: "+ user);
		System.out.println("�ΰ����� ��ǻ��: "+ computer[random.nextInt(3)]);
		System.out.print("���: "+ " ");
		
		if(user.equals(npc)) {
			System.out.println("���");
		} else if(
				(user.equals("����")&&npc.equals("��"))|| 
				(user.equals("����")&&npc.equals("����"))|| 
				(user.equals("��")&& npc.equals("����"))){
			System.out.println("���̸� �¸�!");
		} else {
			System.out.println("��ǻŸ�¸�!");
		}
		scanner.close();
	}	
}
