package chapter10.exercise.practice02;

public class Bank {
	//�ʵ�
		private Customer[] customers;		//������ �� ���
		private int numberOfCustomers;		//������ �� ��
		
		//������
		public Bank() {
			customers = new Customer[3];
			
		}
		
		//�޼ҵ�          ���ڷ� ���� customer�� customers �迭�� �Ҵ�.
		//				�� �Ŀ� numberOfCustomer�� ���� 1 ������Ų��.
		public void addCustomer(Customer customer) {
			customers[numberOfCustomers]= customer;
			numberOfCustomers++;
		}
		public int getNumberOfCustomers() {
			return numberOfCustomers;
		}
		public Customer[] getCustomers() {
			return customers;
		}
		
		public Customer getCustomer(int index) {
			return customers[index];
		}			//�迭�� index��° ��(Customer) ��ü�� ��ȯ
	
}
