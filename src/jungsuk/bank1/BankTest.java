package jungsuk.bank1;

import chapter07.exercise.practice03.Bank;
import chapter07.exercise.practice03.BankAccount;
import chapter07.exercise.practice03.Customer;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank();

		Customer customer1 = new Customer("Tony", "Stark");
		customer1.setAccount(new BankAccount(100_000));
		bank.addCustomer(customer1);

		Customer customer2 = new Customer("Peter", "Parker");
		customer2.setAccount(new BankAccount(100));
		bank.addCustomer(customer2);

		Customer customer3 = new Customer("Thor", "Odinson");
		customer3.setAccount(new BankAccount(30_000));
		bank.addCustomer(customer3);

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		Customer maxBalanceCustomer = null;
		Customer minBalanceCustomer = null;
		for (int i = 0; i < bank.getNumberOfCustomers(); i++) {
			Customer account = bank.getCustomer(i);
			if (account.getAccount().getBalance() > max) {
				max = account.getAccount().getBalance();
				maxBalanceCustomer = account;
			}
			if (account.getAccount().getBalance() < min) {
				min = account.getAccount().getBalance();
				minBalanceCustomer = account;
			}
		}
		System.out.println("�ܰ� ���� ���� ���");
		System.out.println(maxBalanceCustomer);
		System.out.println("�ܰ� ���� ���� ���");
		System.out.println(minBalanceCustomer);
		if (maxBalanceCustomer.getAccount().transfer(max / 2, minBalanceCustomer.getAccount())) {
			System.out.println(
					maxBalanceCustomer.getFirstName() + "�� " + minBalanceCustomer.getFirstName() + "���� �ܰ��� ���� �۱�");
		} else {
			System.out.println("�۱ݵ��� �ʾҽ��ϴ�.");
		}
		System.out.println("�۱� �� ��� ���� ����");
		for (Customer c : bank.getCustomers()) {
			if (c != null) {
				System.out.println(c);
			}
		}
	}
}
