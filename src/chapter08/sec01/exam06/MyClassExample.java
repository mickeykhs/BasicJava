package chapter08.sec01.exam06;

import chapter08.sec01.exam04.Audio;


public class MyClassExample {

	public static void main(String[] args) {
		System.out.println("1)--------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		System.out.println("2)--------------");
		
		MyClass myClass2 = new MyClass(new Audio());
		myClass2.rc.turnOff();
		
		System.out.println("3)--------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
	}
}
