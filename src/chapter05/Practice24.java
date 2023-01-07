package chapter05;

public class Practice24 {
	public static void main(String[] args) {
		//Integer.MIN_VALUE; 인트값중에 가장 최소값 Integer.MAX_VALUE; 최대값
		int max = 0; 
		int[] array = {1, 5, 3 ,8 ,2};
		int min = array[0];// array 보다 아래쪽에 선언 최대값!
		
		//작성위치
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
