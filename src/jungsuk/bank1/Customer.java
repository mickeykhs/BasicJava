package jungsuk.bank1;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount account;
	
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
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
	public String toString() {
		return String.format("ÀÌ¸§: %s, ÀÜ°í: %,d¿ø",firstName,account.getBalance());
	}
	
}
