package chapter07.exercise.practice04;

public class CheckingAccount extends BankAccount {
	// 필드
	private SavingsAccount protectedBy;		//SavingsAccount 객체를 선언
//	SavingsAccount protectedBy = new SavingsAccount();

	// 생성자
	CheckingAccount(int balance) {			//슈퍼클래스의 생성자를 이용하여 잔액 초기화
		super(balance);
	}

	CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);			//슈퍼클래스의 생성자를 이용하여 잔액 초기화
		this.protectedBy = protectedBy;		//인자로 전달된 SavingsAccount로 protectedBy를 초기화
	}
	/**
	 * 잔액
	 * SavingsAccount: 5000원
	 * CheckingAccount: 10000원
	 * 1. 백지수표로 7,000원짜리 물건을 구매한 경우
	 * 
	 * 2. 백지수표로 13,000원짜리 물건을 구매한 경우
	 * CheckingAccount는 0원으로 만든다.
	 * SavingsAccount - (amount - CheckingAccount)
	 */
	// 메소드 만약 잔액보다 더 많은 값을 인출하려고 하면 초과되는 만큼의 돈을 참조하고 있는
	// SavingsAccount 객체에서 인출
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
