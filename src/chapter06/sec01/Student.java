package chapter06.sec01;

public class Student {
	//�ʵ�
	String deptId;
	String year;
	String studentId;
	String name;
	String idNumber;
	int age;
	
	//������
	public Student() {
		
	}
	
	//�޼ҵ�
	void displayStudent() {
		System.out.println(studentId +":���� " + deptId + ", �̸�-" + name);
	}

}
//���赵