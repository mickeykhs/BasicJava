package chapter06.sec01;

public class StudentExample {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.deptId = "컴공";
		s1.year = "3";
		s1.studentId = "C1601";
		s1.name = "한영삼";
		s1.idNumber = "000708-3******";
		s1.displayStudent();
		
		Student s2 = new Student();
		s2.deptId = "컴공";
		s2.year = "3";
		s2.studentId = "C1602";
		s2.name = "서희경";
		s2.idNumber = "9902005-2******";
		s2.displayStudent();
	}

}
//new라는 명령어로 필드의 값을 저장