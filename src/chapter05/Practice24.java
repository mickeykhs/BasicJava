package chapter05;

public class Practice24 {
	public static void main(String[] args) {
		//Integer.MIN_VALUE; ��Ʈ���߿� ���� �ּҰ� Integer.MAX_VALUE; �ִ밪
		int max = 0; 
		int[] array = {1, 5, 3 ,8 ,2};
		int min = array[0];// array ���� �Ʒ��ʿ� ���� �ִ밪!
		
		//�ۼ���ġ
		for(int i= 0; i<array.length; i++) {
				if(max<array[i]) {
					max = array[i];
				}
				if(min>array[i]) {
					min = array[i];
				}
			}
//		int min = max;
//		for(int j=0; j<array.length; j++) {
//			if(min>array[j]) {
//				min=array[j];
//			}
//		}
		System.out.println("max: "+ max);
		System.out.println("min: "+ min);
	}

}
