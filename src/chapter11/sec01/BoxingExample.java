package chapter11.sec01;

public class BoxingExample {
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		Integer sum = 0;
		for(int i=1;i<=1000; i++) {
			sum +=i;
		}
		long endTime = System.nanoTime();
		System.out.println("��ü ���: " +sum);
		System.out.println("��ü ���: " + (endTime - startTime));
		
		long startTime2 = System.nanoTime();
		int sum2 = 0;
		for(int i=1;i<=1000; i++) {
			sum2 +=i;
		}
		long endTime2 = System.nanoTime();
		System.out.println("�⺻Ÿ�� ���: " +sum2);
		System.out.println("�⺻Ÿ�� ���: " + (endTime2 - startTime2));
		
	}
}
