package jungsuk.bank1;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {
		
	}
	
	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) {  //입금
		balance += amount;
	}
	public boolean withdraw(int amount) {   //출금
		if(balance <0) {
			return false;
		} else {
			balance -= amount;
			return true;
		}
	}
	public boolean transfer(int amount, BankAccount otherAccount) { //송금
		if(withdraw(amount)== true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
	}
	
}
