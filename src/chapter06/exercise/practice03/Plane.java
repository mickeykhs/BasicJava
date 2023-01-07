package chapter06.exercise.practice03;

public class Plane {
	//�ʵ�
	private String manufacturer; //���ۻ�
	private String model;	//�𵨸�
	private int maxNumberOfPassengers;  //�ִ� �°��� ��
	private static int numberOfPlanes ;  
	//���ݱ��� ������ ����� ��ü�� ��, ����(static)������ ����, ��ü�� �����ɶ�����
	//�����ڿ��� ����������
	
	//������
	public Plane() {
		numberOfPlanes++;
	}
	public Plane(String manufacturer,String model,int maxNumberOfPassengers) {
		this.manufacturer =manufacturer;
		this.model=model;
		this.maxNumberOfPassengers=maxNumberOfPassengers;
		numberOfPlanes++;
	}
		
	//Shift+Alt+s �� ���ϰ� ������ �޼ҵ� ���������
	
	//�żҵ�
	//�� �ʵ�(numberOfPlanes����)�� ���� getter�� setter�� �����.
	//int getNumberOfPlanes(): numberOfPlanes�� �� ��ȯ�ϴ� �����޼ҵ�
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
		
	}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}	
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		if(maxNumberOfPassengers<0) {
			this.maxNumberOfPassengers = 0;
		} else {
			
			this.maxNumberOfPassengers = maxNumberOfPassengers;
		}
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	public String toString() {
		return String.format("%d",numberOfPlanes);
	}
}
