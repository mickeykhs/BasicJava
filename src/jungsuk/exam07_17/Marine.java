package jungsuk.exam07_17;

public class Marine extends Unit{
	@Override
	public void move(int x, int y) {
		System.out.println("������ ��ġ�� �̵�: "+ x +","+y);
		
	}
	void stimPack() {
		System.out.println("�������� ����Ѵ�.");
	}
}
