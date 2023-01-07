package chapter07.exercise.practice04;

public class BankAccount {
	//�ʵ�
	protected int balance; //�ܾ�      �ʵ��� ���� �����ڸ� private���� protected�� ����
	
	//������
	public BankAccount(int balance) {
		this.balance = balance;		//���ڷ� ���޵Ǵ� ������ �ʵ��� balance �ʱ�ȭ
	}   
	

	//�޼ҵ�
	public int getBalance() {		//���� ������ �ܾ�
		return balance;
	}
	
	public void deposit(int amount) {  		//�Ա� �޼ҵ�
		balance += amount;
	}
	public boolean withdraw(int amount) {        //��ݸ޼ҵ�
		if(balance>=amount) {
			balance -= amount;
			return true;
		} else {
			return false;
		}
		
	}
	public boolean transfer(int amount, BankAccount otherAccount) {
		if(withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
		//���� ���¿��� amount ��ŭ �ٸ� ���·� �۱��ϴ� �޼ҵ�
	}

	@Override
	public String toString() {
		return "���� �ܾ�: " + balance;
	}


	
}
