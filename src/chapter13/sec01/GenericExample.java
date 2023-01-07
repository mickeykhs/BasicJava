package chapter13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		/**
		 * Generic(제네릭, 지네릭)
		 * 표현 방법: < >를 이용
		 * JDK 1.5부터 도입
		 */
		IntValue value = new IntValue(10);
		System.out.println(value.getValue());
		StringValue value2 = new StringValue("10");
		System.out.println(value2.getValue());		//너무 불편한 코드
		
		
		Value value3 = new Value(10);
		System.out.println(value3.getValue());
		Value value4 = new Value("길동이");
		System.out.println(value4.getValue());		//타입이 어떤건지 불명확하다 
		
		
//		Value value5 = new Value("a");
//		int value5 = (int) value5.getValue();
//		Value value6 = new Value(100);
//		String value6 =(String) value6.getValue();
		
		Box<Integer> box = new Box<Integer>(100);
		@SuppressWarnings("unused")
		int integer = box.getValue();
		
	}
}
