package chapter10.exercise.practice02;

public abstract class BankAccount {
	// 필드
	protected int balance; // 잔액 필드의 접근 제한자를 private에서 protected로 변경

	// 생성자
	public BankAccount(int balance) {
		this.balance = balance; // 인자로 전달되는 값으로 필드의 balance 초기화
	}

	// 메소드
	public abstract String getAccountType();

	public int getBalance() { // 현재 계좌의 잔액
		return balance;
	}

	public void deposit(int amount) { // 입금 메소드
		balance += amount;
	}

	public boolean withdraw(int amount) { // 출금메소드
		if (balance >= amount) {
			balance -= amount;
			return true;
		} else {
			return false;
		}

	}

	public boolean transfer(int amount, BankAccount otherAccount) {
		if (amount < 0 || amount > balance) {
			throw new IllegalArgumentException("해당하는 금액을 보낼 수 없습니다.");
		} else if (otherAccount == null) {
			throw new NullPointerException("해당하는 계좌가 없습니다.");
		} else if (withdraw(amount) == true) {
			otherAccount.deposit(amount);
			return true;
		} else {
			return false;
		}
		// 현재 계좌에서 amount 만큼 다른 계좌로 송금하는 메소드
	}

	@Override
	public String toString() {
		return "현재 잔액: " + balance;
	}
}
