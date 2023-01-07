package chapter07.sec01.practice05;

public class Child extends Parent{
	@SuppressWarnings("unused")
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("Child() call");
		
	}
	public Child(String name) {
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
