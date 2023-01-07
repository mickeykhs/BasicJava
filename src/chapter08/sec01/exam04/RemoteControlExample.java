package chapter08.sec01.exam04;

import chapter08.sec01.exam03.RemoteControl;

public class RemoteControlExample {
	public static void main(String[] args) {
		RemoteControl rc = new Television();	
		rc.turnOn();
		rc.setVolume(8);
		rc.setVolume(11);
		rc.setVolume(-1);
		rc.turnOff();
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(8);
		rc.setVolume(11);
		rc.setVolume(-1);
		rc.turnOff();
		
	}
}
