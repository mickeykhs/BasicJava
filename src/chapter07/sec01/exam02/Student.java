package chapter07.sec01.exam02;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //�θ� �����ڿ� ���Ŀ� �°� �Ἥ ȣ���Ѵ�.
		this.studentNo = studentNo;
	}
}
