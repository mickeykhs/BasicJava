package chapter09.sec01;

public class OuterClassExample {
	public static void main(String[] args) {
//		첫번째 방법
//		OuterClass class1 = new OuterClass();
//		class1.name = "홍길동";
//		class1.new InnerClass(0);
		
//		두번째 방법
//		InnerClass innerClass =new OuterClass().new InnerClass(0);
//		innerClass.innerMethod();
//		innerClass.age = 10;
		
		new OuterClass.InnerClass(10);
	}
}
