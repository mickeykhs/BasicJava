package chapter10.exercise.practice02;

public class BankExample {
	public static void main(String[] args) {
		CheckingAccount tonyAccount = new CheckingAccount(3000);
		CheckingAccount steveAccount = new CheckingAccount(4000);
		try {
			tonyAccount.transfer(5000, steveAccount);
			System.out.println("�۱� �Ϸ�");
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
//			System.out.println("�ش��ϴ� ���°� �����ϴ�.");
			System.out.println("�۱� ����");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
//			System.out.println("�ش��ϴ� �ݾ��� ���� �� �����ϴ�.");
			System.out.println("�۱� ����");

		}
		try {
			tonyAccount.transfer(2000, null);
			System.out.println("�۱� �Ϸ�");

		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
//			System.out.println("�ش��ϴ� ���°� �����ϴ�.");
			System.out.println("�۱� ����");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
//			System.out.println("�ش��ϴ� �ݾ��� ���� �� �����ϴ�.");
			System.out.println("�۱� ����");
		}
	}
}
