package chapter06.sec02;

public class Member {
	//�ʵ�
	String name;
	String id;
	String password;
	int age;
	
	//Default Constructor(�⺻ ������)
	Member(){
		
	}
	
	//�Ű���(�Ű�����)�� �ִ� ������
	public Member(String name, int age){
		//this. : �޸𸮿� ��ġ�� ��ü �ڽ��� ����Ų��.
		this.name = name;
		this.age = age;
	}
	
	public Member(String id, String password) {
		this.id = id;
		this.password = password;
	}
	//�żҵ�
	void display() {
		System.out.println("�̸�:"+ name + " ����:"+age);
		}
	void display1() {
		System.out.println("���̵�:"+ id + " �н�����:"+password);
	}
}
