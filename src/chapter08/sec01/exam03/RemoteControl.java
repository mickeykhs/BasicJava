package chapter08.sec01.exam03;

public interface RemoteControl {
	int MAX_VOLUME = 10;			//�ʵ�� ������� (�ʱ�ȭ��) ��� ����
	int MIN_VOLUME = 0;
	
	public abstract void turnOn();    //�������̽��� �ִ� ���� public abstract ��
	void turnOff();					  // �⺻������ �������ִ�. ���� �Ⱦ��°� ����.
	void setVolume(int volume);
}
