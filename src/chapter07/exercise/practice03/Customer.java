package chapter07.exercise.practice03;

public class Customer {
	//�ʵ�
	private String firstName;		//�� �̸�
	private String lastName;		//�� ��
	private BankAccount account;	//���� ������ ����
	
	//������
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		//�־��� ���ڷ� �� �ʵ� �ʱ�ȭ
	}
	
	//�޼ҵ�
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
	public String toString() {   //���� �̸��� �� ������ �ܾ��� ���ڿ��� ��ȯ
//		return "���� �̸� ," + (firstName  + lastName) + " �ܰ� " + account.getBalance() +"��";
		return String.format("���� �̸� %s , �ܰ� %,d��",(firstName  + lastName),account.getBalance());
	}
	
	
}
