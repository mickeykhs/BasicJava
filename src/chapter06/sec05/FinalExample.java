package chapter06.sec05;

public class FinalExample {
	String str;
	
	public FinalExample(String str) {
		this.str = str;
	}
	public static void main(String[] args) {
		
	
		FinalExample example = new FinalExample("a");
		System.out.println(example.str);
		FinalExample example1 = new FinalExample("b");
		System.out.println(example1.str);
	}
	
}
