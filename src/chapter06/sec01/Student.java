package chapter06.sec01;

public class Student {
	//필드
	String deptId;
	String year;
	String studentId;
	String name;
	String idNumber;
	int age;
	
	//생성자
	public Student() {
		
	}
	
	//메소드
	void displayStudent() {
		System.out.println(studentId +":전공 " + deptId + ", 이름-" + name);
	}

}
//설계도