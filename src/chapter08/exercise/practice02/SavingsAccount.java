package chapter08.exercise.practice02;

public class SavingsAccount extends BankAccount {
	// �ʵ�
	private double interestRate; // ������

	// ������
	SavingsAccount(int balance, double interestRate) {
		super(balance);				//�ܾװ� ������ �ʵ带 �ʱ�ȭ
		this.interestRate = interestRate;
		this.balance = balance;		//balance�ʵ�� ����Ŭ������ �����ڸ� ȣ���ؼ� �ʱ�ȭ
	}

	// �޼ҵ�							//�ܸ������� = ����*����*�Ⱓ+����
	public void updateBalance(int period) {
		balance = (int) (period * interestRate * balance + balance);
	}
	@Override
	public String getAccountType() {
		return "���࿹��";
	}

}
