package jungsuk.bank1;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		
	}
	
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {  //�Ա�
		balance += amount;
	}
	public boolean withdraw(int amount) {   //���
		if(balance <0) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	public boolean transfer(int amount, BankAccount otherAccount) { //�۱�
		if(withdraw(amount)== true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
	
}
