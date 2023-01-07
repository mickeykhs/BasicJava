package chapter11.sec01;

public class MemberExample {
	public static void main(String[] args) {
		Member member1 = new Member("a001","±Ë¿∫¥Î" ,1000 );
		Member member2 = new Member("b001","¿Ãª€¿Ã" ,2000 );
		Member member3 = new Member("c001","Ω≈øÎ»Ø" ,3000 );
		
		Member member4 = new Member("b001","¿Ãª€¿Ã" ,1000 );
		System.out.println(member1.equals(member3));
		System.out.println(member2.equals(member4));
		System.out.println(member1);
	}
}
