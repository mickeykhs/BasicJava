package jungsuk.exam07_17;

public class Dropship extends Unit{
	@Override
	public void move(int x, int y) {
		System.out.println("지정된 위치로 이동");
		
	}
	void load() {
		System.out.println("선택된 대상을 태운다.");
	}
	void unload() {
		System.out.println("선택된 대상을 내린다.");
	}
}
