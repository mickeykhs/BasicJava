package jungsuk.exam07_17;

public abstract class Unit {
	int x, y;
	abstract public void move(int x, int y);
	public void stop() {
		
	}
	public void run() {
		stop();
		move(x,y);
	}
	
}
