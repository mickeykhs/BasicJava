package chapter13.sec01;

public class GenericExample {
	public static void main(String[] args) {
		/**
		 * Generic(���׸�, ���׸�)
		 * ǥ�� ���: < >�� �̿�
		 * JDK 1.5���� ����
		 */
		IntValue value = new IntValue(10);
		System.out.println(value.getValue());
		StringValue value2 = new StringValue("10");
		System.out.println(value2.getValue());		//�ʹ� ������ �ڵ�
		
		
		Value value3 = new Value(10);
		System.out.println(value3.getValue());
		Value value4 = new Value("�浿��");
		System.out.println(value4.getValue());		//Ÿ���� ����� �Ҹ�Ȯ�ϴ� 
		
		
//		Value value5 = new Value("a");
//		int value5 = (int) value5.getValue();
//		Value value6 = new Value(100);
//		String value6 =(String) value6.getValue();
		
		Box<Integer> box = new Box<Integer>(100);
		@SuppressWarnings("unused")
		int integer = box.getValue();
		
	}
}
