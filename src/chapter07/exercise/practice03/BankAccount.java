package chapter07.exercise.practice03;

public class BankAccount {
	//필드
	private int balance; //잔액
	
	//생성자
	public BankAccount(int balance) {
		this.balance = balance;		//인자로 전달되는 값으로 필드의 balance 초기화
	}   
	
	//메소드
	public int getBalance() {		//현재 계좌의 잔액
		return balance;
	}
	
	public void deposit(int amount) {  		//입금 메소드
		balance += amount;
	}
	public boolean withdraw(int amount) {        //출금메소드
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
		//현재 계좌에서 amount 만큼 다른 계좌로 송금하는 메소드
	}
	
}
