package chapter06.sec02;

public class MemberExample {
	public static void main(String[] args) {
//		Member member = new Member();
//		member.name = "���Ͼ�";
//		member.age = 23;
		
		Member member = new Member("���Ͼ�", 23);
		member.display();
		Member member1 = new Member("ȫ�浿", 20);
		member1.display();
		Member member2 = new Member("�ŵ���", 30);
		member2.display();
		
		Member member3 = new Member("id", "password");
		member3.display1();
	}
}
