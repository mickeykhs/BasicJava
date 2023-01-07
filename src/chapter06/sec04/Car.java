package chapter06.sec04;

public class Car {
	int speed;
	
	void run() {
		
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		System.out.println("현재 속도: "+ myCar.speed);
		
	}
}
