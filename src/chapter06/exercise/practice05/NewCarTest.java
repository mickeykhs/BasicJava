package chapter06.exercise.practice05;

import chapter06.exercise.practice04.Car;

public class NewCarTest {
	public static void main(String[] args) {
		NewCar myCar = new NewCar("red");
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
		
		NewCar yourCar = new NewCar("blue");
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
