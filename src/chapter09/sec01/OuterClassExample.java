package chapter09.sec01;

public class OuterClassExample {
	public static void main(String[] args) {
//		ù��° ���
//		OuterClass class1 = new OuterClass();
//		class1.name = "ȫ�浿";
//		class1.new InnerClass(0);
		
//		�ι�° ���
//		InnerClass innerClass =new OuterClass().new InnerClass(0);
//		innerClass.innerMethod();
//		innerClass.age = 10;
		
		new OuterClass.InnerClass(10);
	}
}
