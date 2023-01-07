package chapter07.exercise.practice03;

public class Customer {
	//필드
	private String firstName;		//고객 이름
	private String lastName;		//고객 성
	private BankAccount account;	//고객이 소유한 계좌
	
	//생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		//주어진 인자로 각 필드 초기화
	}
	
	//메소드
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public BankAccount getAccount() {
		return account;
	}
	
	public void setAccount(BankAccount account) {
		this.account = account;
	}

	@Override
	public String toString() {   //고객의 이름과 고객 계좌의 잔액을 문자열로 반환
//		return "고객의 이름 ," + (firstName  + lastName) + " 잔고 " + account.getBalance() +"원";
		return String.format("고객의 이름 %s , 잔고 %,d원",(firstName  + lastName),account.getBalance());
	}
	
	
}
