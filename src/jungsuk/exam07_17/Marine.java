package jungsuk.exam07_17;

public class Marine extends Unit{
	@Override
	public void move(int x, int y) {
		System.out.println("지정된 위치로 이동: "+ x +","+y);
		
	}
	void stimPack() {
		System.out.println("스팀팩을 사용한다.");
	}
}
