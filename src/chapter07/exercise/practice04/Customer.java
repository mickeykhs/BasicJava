package chapter07.exercise.practice04;


public class Customer {
	//필드
	private String firstName;		//고객 이름
	private String lastName;		//고객 성
	private BankAccount[] accounts;	//고객이 소유한 계좌	    배열로 변경
	private int numberOfAccounts;	//고객이 소유한 계좌수(최대 보유 가능 계좌수 =5)
	
	//생성자
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		//주어진 인자로 각 필드 초기화
		accounts = new BankAccount[5];
	}
	
	//메소드
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	
	//BankAccount 배열에 인자로 전달된 계좌(account)를 추가 , numberOfAccounts값을 1만큼 증가
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return "고객의 이름:" + (firstName + lastName) +  ", 고객이 소유한 계좌수" + numberOfAccounts;
	}

	

			
	
}

//, 계좌: " + Arrays.toString(accounts)
