package chapter06.exercise.practice04;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("red");
		System.out.println("myCar�� ��: "+myCar.getColor());
		System.out.println("���� �ִ� �ӷ�: "+Car.getMaxSpeed()+ "km/h");
		
		System.out.print("ù ��° speedUp(100.0km/h): ");
		if(myCar.speedUp(100.0)) {
			System.out.print("�ӵ� ���� ����,");
		} else {
			System.out.print("�ӵ� ���� �Ұ���,");
		}
		System.out.println(" ���� ���� �ӷ�: "+myCar.getSpeed() + "km/h");
		
		System.out.print("�� ��° speedUp(90.0km/h): ");
		if(myCar.speedUp(90.0)) {
			System.out.print("�ӵ� ���� ����,");
		} else {
			System.out.print("�ӵ� ���� �Ұ���,");
		}
		System.out.println(" ���� ���� �ӷ�: "+myCar.getSpeed() + "km/h");
		
		Car yourCar = new Car("blue");
		System.out.println();
		System.out.println("yourCar�� ��: "+ yourCar.getColor());
		System.out.println("���� �ִ� �ӷ�: " + Car.getMaxSpeed() + "km/h");
		
		System.out.print("ù ��° speedUp(-100.0km/h): ");
		if(yourCar.speedUp(-100.0)) {
			System.out.print("�ӵ� ���� ����,");
		} else {
			System.out.print("�ӵ� ���� �Ұ���,");
		}
		System.out.println(" ���� ���� �ӷ�: "+yourCar.getSpeed() + "km/h");
		
		System.out.print("�� ��° speedUp(210.0km/h): ");
		if(yourCar.speedUp(210.0)) {
			System.out.print("�ӵ� ���� ����,");
		} else {
			System.out.print("�ӵ� ���� �Ұ���,");
		}
		System.out.println(" ���� ���� �ӷ�: "+yourCar.getSpeed() + "km/h");
	}

}
