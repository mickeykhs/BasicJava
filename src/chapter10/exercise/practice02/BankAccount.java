package chapter10.exercise.practice02;

public abstract class BankAccount {
	// �ʵ�
	protected int balance; // �ܾ� �ʵ��� ���� �����ڸ� private���� protected�� ����

	// ������
	public BankAccount(int balance) {
		this.balance = balance; // ���ڷ� ���޵Ǵ� ������ �ʵ��� balance �ʱ�ȭ
	}

	// �޼ҵ�
	public abstract String getAccountType();

	public int getBalance() { // ���� ������ �ܾ�
		return balance;
	}

	public void deposit(int amount) { // �Ա� �޼ҵ�
		balance += amount;
	}

	public boolean withdraw(int amount) { // ��ݸ޼ҵ�
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (amount < 0 || amount > balance) {
			throw new IllegalArgumentException("�ش��ϴ� �ݾ��� ���� �� �����ϴ�.");
		} else if (otherAccount == null) {
			throw new NullPointerException("�ش��ϴ� ���°� �����ϴ�.");
		} else if (withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
		// ���� ���¿��� amount ��ŭ �ٸ� ���·� �۱��ϴ� �޼ҵ�
	}

	@Override
	public String toString() {
		return "���� �ܾ�: " + balance;
	}
}
