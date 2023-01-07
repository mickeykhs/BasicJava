package chapter08.sec02;

import java.util.Arrays;

public class StudentSortExample {
	public static void main(String[] args) {
		Student[] students = {
				new Student("ÀÌ½Â¿¬", 20),
				new Student("±è¿¬¼ö", 26),
				new Student("ÇãÁöÇö", 25),
				new Student("ÀÌÁØÇõ", 22),
				new Student("±è°­»ê", 29),
				new Student("À±´Ù¿µ", 17),
		};
		
		Arrays.sort(students);
		
		for (Student student : students) {
			System.out.println(student);
		}	
	}
}
