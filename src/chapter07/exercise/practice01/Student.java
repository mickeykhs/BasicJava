package chapter07.exercise.practice01;

public class Student extends Human {
	//�ʵ�
	private String major;		//����
	
	//������
	public Student(String name, int age, String major) {
		super(name, age);
		this.major= major;
	}
	
	//�޼ҵ�
	public void setMajor(String major) {
		this.major = major;
	}
	public String getMajor() {
		return major;
	}

	@Override
	public String toString() {
		return   super.toString() +" ����: " + major ;
	}
	
}
