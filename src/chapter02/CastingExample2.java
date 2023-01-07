package chapter02;

public class CastingExample2 {
	public static void main(String[] args) {
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		int intValue2 = (int) longValue;
		System.out.println(intValue2);
		System.out.println(intValue);
		
		
		double doubleValue = 3.14;
		int intValue3 = (int) doubleValue;
		System.out.println(intValue3);
		
		System.out.println(intValue2 + intValue3);
		
	}
}
