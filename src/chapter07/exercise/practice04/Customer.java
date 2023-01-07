package chapter07.exercise.practice04;


public class Customer {
	//�ʵ�
	private String firstName;		//�� �̸�
	private String lastName;		//�� ��
	private BankAccount[] accounts;	//���� ������ ����	    �迭�� ����
	private int numberOfAccounts;	//���� ������ ���¼�(�ִ� ���� ���� ���¼� =5)
	
	//������
	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;		//�־��� ���ڷ� �� �ʵ� �ʱ�ȭ
		accounts = new BankAccount[5];
	}
	
	//�޼ҵ�
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public BankAccount getAccount(int index) {
		return accounts[index];
	}
	
	//BankAccount �迭�� ���ڷ� ���޵� ����(account)�� �߰� , numberOfAccounts���� 1��ŭ ����
	public void addAccount(BankAccount account) {
		accounts[numberOfAccounts] = account;
		numberOfAccounts++;
	}
	
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}

	@Override
	public String toString() {
		return "���� �̸�:" + (firstName + lastName) +  ", ���� ������ ���¼�" + numberOfAccounts;
	}

	

			
	
}

//, ����: " + Arrays.toString(accounts)
