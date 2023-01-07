package chapter06.sec02;

public class Member {
	//필드
	String name;
	String id;
	String password;
	int age;
	
	//Default Constructor(기본 생성자)
	Member(){
		
	}
	
	//매개값(매개변수)이 있는 생성자
	public Member(String name, int age){
		//this. : 메모리에 위치한 객체 자신을 가리킨다.
		this.name = name;
		this.age = age;
	}
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	//매소드
	void display() {
		System.out.println("이름:"+ name + " 나이:"+age);
		}
	void display1() {
		System.out.println("아이디:"+ id + " 패스워드:"+password);
	}
}
