package chapter06.exercise.practice04;

public class Car {
	//�ʵ�
		private double speed;
		private String color;
		private static final double MAX_SPEED = 200.0;
		
		//������
		public Car() {
			
		}
		public Car(String color) {
			this.color = color;
		}
		
		//�޼ҵ�
		public double getSpeed() {
			return speed;
		}
		
		public void setSpeed(double speed) {
			this.speed = speed;
		}
		
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		
		public boolean speedUp(double speed) {
			if(speed + this.speed >=0 && speed + this.speed<=MAX_SPEED) {
				this.speed += speed;
				return true;
			} else {
				return false;
			}
		}
		
		public static double getMaxSpeed() {
			return MAX_SPEED;
		}
		@Override
		public String toString() {
			return "Car [speed=" + speed + ", color=" + color + "]";
		}
		
	
}
