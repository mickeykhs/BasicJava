package chapter06.sec06.exam06;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	
	public int getSpeed(){
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed<0) {
			this.speed = 0;
			return;
		} else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
//	public static void main(String[] args) {
//		Car myCar = new Car();
//		myCar.setSpeed(-150);
//		
//		System.out.println("현재속도: "+myCar.getSpeed());
//		
//	}
}
