package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("��ȣ\t�̸�\t����");   //    \t -> �Ǹ�ŭ ���
		System.out.println("�� ���� ���\n");   //   \n -> �� �ٲ�
		System.out.println("�� ���� ���\n");   
		System.out.println("�츮�� \"������\" �Դϴ�.");    //    \" ->  "���
		System.out.println("��\\����\\����\\�ܿ�\n");    //  \\ ->  \���
		
		String str = ("���� \"�ڹ�\"�� �����մϴ�");
		System.out.println(str);
	}

}
