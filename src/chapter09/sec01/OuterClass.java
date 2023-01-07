package chapter09.sec01;

public class OuterClass {
	String name;
    static class InnerClass{
		int age;
		
		public InnerClass(int age) {
			this.age = age;
		}

		void innerMethod() {
			
		}
	}
}

class OutsideClass{
	
}