package chapter07.exercise.practice03;

public class Bank {
	//필드
	private Customer[] customers;		//은행의 고객 목록
	private int numberOfCustomers;		//은행의 고객 수
	
	//생성자
	public Bank() {
		customers = new Customer[10];
		//배열 크기를 10으로 초기화
	}
	
	//메소드          인자로 받은 customer를 customers 배열에 할당.
	//				이 후에 numberOfCustomer의 값을 1 증가시킨다.
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
	}			//배열의 index번째 고객(Customer) 객체를 반환


}
