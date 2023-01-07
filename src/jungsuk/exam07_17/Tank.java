package jungsuk.exam07_17;

public class Tank extends Unit{

	@Override
	public void move(int x, int y) {
		System.out.println("지정된 위치로 이동: "+ x +","+y);
		
	}
	void changeMod() {
		System.out.println("공격모드를 변환한다.");
	}
}
