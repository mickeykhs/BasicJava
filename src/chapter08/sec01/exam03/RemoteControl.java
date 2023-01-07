package chapter08.sec01.exam03;

public interface RemoteControl {
	int MAX_VOLUME = 10;			//필드는 상수값만 (초기화된) 사용 가능
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();    //인터페이스에 있는 것은 public abstract 는
	void turnOff();					  // 기본적으로 생략되있다. 따라서 안쓰는게 좋다.
	void setVolume(int volume);
}
