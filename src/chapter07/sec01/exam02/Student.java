package chapter07.sec01.exam02;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //부모 생성자와 형식에 맞게 써서 호출한다.
		this.studentNo = studentNo;
	}
}
