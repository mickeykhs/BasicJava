package chapter08.sec02;

import java.util.Arrays;

public class StudentSortExample {
	public static void main(String[] args) {
		Student[] students = {
				new Student("�̽¿�", 20),
				new Student("�迬��", 26),
				new Student("������", 25),
				new Student("������", 22),
				new Student("�谭��", 29),
				new Student("���ٿ�", 17),
		};
		
		Arrays.sort(students);
		
		for (Student student : students) {
			System.out.println(student);
		}	
	}
}
