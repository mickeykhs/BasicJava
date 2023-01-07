package chapter08.sec01.exam06;

import chapter08.sec01.exam03.RemoteControl;
import chapter08.sec01.exam04.Audio;
import chapter08.sec01.exam04.Television;

public class MyClass {
	RemoteControl rc = new Television();
	public MyClass() {
		
	}
	
	MyClass(RemoteControl rc){
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}
}

