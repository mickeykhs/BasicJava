package jungsuk.exam07_17;

public class Dropship extends Unit{
	@Override
	public void move(int x, int y) {
		System.out.println("������ ��ġ�� �̵�");
		
	}
	void load() {
		System.out.println("���õ� ����� �¿��.");
	}
	void unload() {
		System.out.println("���õ� ����� ������.");
	}
}
