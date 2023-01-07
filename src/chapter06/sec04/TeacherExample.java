package chapter06.sec04;

public class TeacherExample {
	public static void main(String[] args) {
		Teacher t1 = new Teacher();
		t1.salary = 100;
		Teacher.balance = 200;
		Teacher t2 = new Teacher();
		t2.salary = 200;
		Teacher.balance = 600;
		Teacher t3 = new Teacher();
		t3.salary = 300;
		Teacher.balance = 900;
		System.out.println(t1.salary); //개별
		System.out.println(Teacher.balance); //공유 (마지막으로 입력된 값)
	}
}
