package jungsuk.exam07_17;

public class Tank extends Unit{

	@Override
	public void move(int x, int y) {
		System.out.println("������ ��ġ�� �̵�: "+ x +","+y);
		
	}
	void changeMod() {
		System.out.println("���ݸ�带 ��ȯ�Ѵ�.");
	}
}
