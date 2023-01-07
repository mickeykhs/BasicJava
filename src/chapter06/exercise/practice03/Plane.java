package chapter06.exercise.practice03;

public class Plane {
	//필드
	private String manufacturer; //제작사
	private String model;	//모델명
	private int maxNumberOfPassengers;  //최대 승객의 수
	private static int numberOfPlanes ;  
	//지금까지 생성된 비행기 객체의 수, 정적(static)변수로 선언, 객체가 생성될때마다
	//생성자에서 증가시켜줌
	
	//생성자
	public Plane() {
		numberOfPlanes++;
	}
	public Plane(String manufacturer,String model,int maxNumberOfPassengers) {
		this.manufacturer =manufacturer;
		this.model=model;
		this.maxNumberOfPassengers=maxNumberOfPassengers;
		numberOfPlanes++;
	}
		
	//Shift+Alt+s 로 편하게 생성자 메소드 만들수잇음
	
	//매소드
	//각 필드(numberOfPlanes제외)에 대한 getter와 setter를 만든다.
	//int getNumberOfPlanes(): numberOfPlanes의 값 반환하는 정적메소드
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
