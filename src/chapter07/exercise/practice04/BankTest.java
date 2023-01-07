package chapter07.exercise.practice04;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();

		Customer customer1 = new Customer("Tony", "Stark");
		SavingsAccount customer1SavingsAccount = new SavingsAccount(2000, 0.01);
		customer1.addAccount(customer1SavingsAccount);
		customer1.addAccount(new CheckingAccount(3000, customer1SavingsAccount));
		bank.addCustomer(customer1);

		Customer customer2 = new Customer("Peter", "Parker");
		customer2.addAccount(new CheckingAccount(2000));
		bank.addCustomer(customer2);

		Customer customer3 = new Customer("Steve", "Rogers");
		SavingsAccount customer3SavingsAccount = new SavingsAccount(2000, 0.03);
		customer3.addAccount(customer3SavingsAccount);
		customer3.addAccount(new CheckingAccount(1000, customer3SavingsAccount));
		bank.addCustomer(customer3);

		System.out.println(customer3.getFirstName() + "�� SavingsAccount �ܰ�: " + customer3.getAccount(0) + "��");
		System.out.println(customer3.getFirstName() + "�� CheckingAccount �ܰ�: " + customer3.getAccount(1) + "��");
		System.out.println();
		System.out.println("���ο� withdraw �޼ҵ� ����(1,400�� ����)");
		customer3.getAccount(1).withdraw(1400);
		System.out.println(customer3.getFirstName() + "�� SavingsAccount �ܰ�: " + customer3.getAccount(0) + "��");
		System.out.println(customer3.getFirstName() + "�� CheckingAccount �ܰ�: " + customer3.getAccount(1) + "��");

		System.out.println();
		printCustomers(bank.getCustomers());
		// 10���� ���� ���� ���
		for (Customer c : bank.getCustomers()) {
			if (c != null) {
				for (int i = 0; i < c.getNumberOfAccounts(); i++) {
					if (c.getAccount(i) instanceof SavingsAccount) {
						((SavingsAccount) c.getAccount(i)).updateBalance(10);
					}
				}
			}
		}
		System.out.println("10���� �� �ܾ�");
		printCustomers(bank.getCustomers());
	}

	private static void printCustomers(Customer[] customers) {
		for (Customer c : customers) {
			if (c != null) {
				System.out.println(c);
				for (int i = 0; i < c.getNumberOfAccounts(); i++) {
					System.out.println("���� ����: " + c.getAccount(i).getClass().getSimpleName() + ", �ܰ�: " + c.getAccount(i) + "��");
				}
				System.out.println();
			}
		}
	}
}