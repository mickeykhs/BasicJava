package chapter08.sec01.exam05;

import chapter08.sec01.exam03.RemoteControl;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		rc.turnOn();
		Searchable searchable = tv;
		searchable.search("aa");
	}

}
