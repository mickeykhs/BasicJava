package chapter08.exercise.practice02;

public class SavingsAccount extends BankAccount {
	// 필드
	private double interestRate; // 이자율

	// 생성자
	SavingsAccount(int balance, double interestRate) {
		super(balance);				//잔액과 이자율 필드를 초기화
		this.interestRate = interestRate;
		this.balance = balance;		//balance필드는 슈퍼클래스의 생성자를 호출해서 초기화
	}

	// 메소드							//단리원리금 = 원금*이율*기간+원금
	public void updateBalance(int period) {
		balance = (int) (period * interestRate * balance + balance);
	}
	@Override
	public String getAccountType() {
		return "저축예금";
	}

}
