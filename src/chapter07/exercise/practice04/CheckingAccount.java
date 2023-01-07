package chapter07.exercise.practice04;

public class CheckingAccount extends BankAccount {
	// �ʵ�
	private SavingsAccount protectedBy;		//SavingsAccount ��ü�� ����
//	SavingsAccount protectedBy = new SavingsAccount();

	// ������
	CheckingAccount(int balance) {			//����Ŭ������ �����ڸ� �̿��Ͽ� �ܾ� �ʱ�ȭ
		super(balance);
	}

	CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);			//����Ŭ������ �����ڸ� �̿��Ͽ� �ܾ� �ʱ�ȭ
		this.protectedBy = protectedBy;		//���ڷ� ���޵� SavingsAccount�� protectedBy�� �ʱ�ȭ
	}
	/**
	 * �ܾ�
	 * SavingsAccount: 5000��
	 * CheckingAccount: 10000��
	 * 1. ������ǥ�� 7,000��¥�� ������ ������ ���
	 * 
	 * 2. ������ǥ�� 13,000��¥�� ������ ������ ���
	 * CheckingAccount�� 0������ �����.
	 * SavingsAccount - (amount - CheckingAccount)
	 */
	// �޼ҵ� ���� �ܾ׺��� �� ���� ���� �����Ϸ��� �ϸ� �ʰ��Ǵ� ��ŭ�� ���� �����ϰ� �ִ�
	// SavingsAccount ��ü���� ����
	public boolean withdraw(int amount) {
		if (protectedBy.balance + balance < amount) {
			return false;
		} else if (balance < amount) {
			protectedBy.withdraw(amount - balance);
			balance -= balance;
			return true;
		} else {
			super.withdraw(amount);
			return true;
		}
	}

}
