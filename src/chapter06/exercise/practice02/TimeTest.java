package chapter06.exercise.practice02;

public class TimeTest {

	public static void main(String[] args) {
		Time time1 = new Time();
		System.out.println("�⺻ ������ ȣ�� �� �ð�: " + time1);
		Time time2 = new Time(22, 15, 48);
		System.out.println("�� ��° ������ ȣ�� �� �ð�: "+ time2);
		Time time3 = new Time(15, 66, 77);
		System.out.println("�ùٸ��� ���� �ð� ���� �� �ð�: "+ time3);
	}

}
