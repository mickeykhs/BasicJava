package chapter06.sec04;

public class VarableArgument {
	public static void main(String[] args) {
		VarableArgument argument = new VarableArgument();
		argument.run();
	
	}
	
	int sum(int ... array) {    // ...�� �迭�� ��� ���� []��ž����ְ� �ܺο��� �ٷ� ȣ�Ⱑ��
		int s = 0;
		for(int i=0; i<array.length; i++) {
			s += array[i];
		}
		return s;
	}
	void run() {
		int sum = sum(10,20,30);
		System.out.println(sum);
	}
}
