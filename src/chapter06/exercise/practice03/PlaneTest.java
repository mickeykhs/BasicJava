package chapter06.exercise.practice03;

public class PlaneTest {
	public static void main(String[] args) {
		Plane plane1 = new Plane("����","���� 747", 450);
		System.out.println("������: "+plane1.getManufacturer());
		System.out.println("�𵨸�: "+plane1.getModel());
		System.out.println("�ִ� �°���: "+plane1.getMaxNumberOfPassengers());
		System.out.println();
		
		Plane plane2 = new Plane("����","���� 777", 500);
		System.out.println("������: "+plane2.getManufacturer());
		System.out.println("�𵨸�: "+plane2.getModel());
		System.out.println("�ִ� �°���: "+plane2.getMaxNumberOfPassengers());
		System.out.println();
		
		Plane plane3 = new Plane();
		plane3.setManufacturer("������ ��ƾ");
		plane3.setModel("F-22");
		plane3.setMaxNumberOfPassengers(-10);
		
		System.out.println("������: "+plane3.getManufacturer());
		System.out.println("�𵨸�: "+plane3.getModel());
		System.out.println("�ִ� �°���: "+plane3.getMaxNumberOfPassengers());
		System.out.println();
		
		System.out.println("����� ������� ��: "+ Plane.getNumberOfPlanes());
		
	}
}
