package chapter09.sec02.exam02;

public class Anonymous {
	RemoteControl field = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("TV�� ���ϴ�.");
		}
		
	};
	
	void method1() {
	RemoteControl localVar = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("Audio�� �մϴ�.");
		}
		@Override
		public void turnOff() {
			System.out.println("Audio�� ���ϴ�.");
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
 * 33�� ���ΰ� 35,36������ ���� �ǹ��̴� . 
 * 33�� ������ �͸�ü ��ȸ��(�ֹ߼�) �ѹ����� �Ⱦ��� ���
 * 35,36�� ��ӻ���Ҷ� ���� ���� ���
 */ 
