package chapter07.exercise.practice01;

public class Human {
	//필드
	private String name;	//이름
	private int age;		//나이
	
	//생성자
	public Human() {
		
	}
	public Human(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//메소드
	public void setName(String name) {
		this.name =name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	@Override
	public String toString() {
		return "이름: " + name + ", 나이: " + age;
	}
}
