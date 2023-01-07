package chapter09.sec02.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다.");
		}
		
	};
	
	void method1() {
	RemoteControl localVar = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Audio를 켭니다.");
		}
		@Override
		public void turnOff() {
			System.out.println("Audio를 끕니다.");
		}
	};
		localVar.turnOn();
	}
	void method2(RemoteControl rc) {
		
	}
}

/*
 * Anonymous.rc.turnOn();
 * 
 * Anonymous anonymous = new Anonymous();
 * anonymous.rc.turnOn();
 * 
 * 33번 라인과 35,36라인은 같은 의미이다 . 
 * 33번 라인은 익명객체 일회용(휘발성) 한번쓰고 안쓸때 사용
 * 35,36은 계속사용할때 직접 만들어서 사용
 */ 
