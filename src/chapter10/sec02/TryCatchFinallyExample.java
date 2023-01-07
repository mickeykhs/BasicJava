package chapter10.sec02;

public class TryCatchFinallyExample {
	public static void main(String[] args) throws ClassNotFoundException {
		//1. try catch  (가독성이 떨어진다)
		try {
			Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.err.println("클래스가 존재하지 않습니다.");
		}
		
		
		//2. throws exception  라인 4의 throws ClassNotFoundException
		Class.forName("java.lang.String2");
	}
}
