package exercise;

import java.util.Random;

public class GoogleClass54 {
	public static void main(String[] args) {
		Random random = new Random();
		int count[] = new int[6];
		for (int i = 0; i < 10000; i++) {
			count[random.nextInt(6)]++;
		}
		for (int i = 0; i < count.length; i++) {
			System.out.println(" " +(i+1) + " " +count[i]);
		}
	}
}
/*int size = 6;
		Random random = new Random();
		int freq []  = new int [size];
		
		for(int i=0; i<10000; i++) {
			++freq[random.nextInt(size)];
		}
		System.out.println("============");
		System.out.println(" ��   ��");
		System.out.println("============");
		
		for(int i=0;i<size;i++) {
			System.out.println(" "+(i+1)+" "+freq[i]);
		}
 */
//�ֻ����� ������ �� ���� ������ Ƚ���� ����ϴ� ���α׷��� ����� ����. 
//�ֻ����� ������ ������ 1���� 6������ ���Ƿ� ������ ���� �߻���(Random ��ü)�� ����Ѵ�.
//���� �߻��⸦ 10,000�� ȣ���Ͽ� �� ���� ��Ÿ���� Ƚ���� ����Ͽ� �迭�� �����Ѵ�. 
//Ȯ�� �̷п� ���ϸ� �ֻ����� ������ ����� ���� ������ Ƚ���� ���;� �Ѵ�.
//�Ʒ� �׸��� �Ȱ��� ���� ������ �ʰ� ��ǻ�͸��� ���� �ٸ��� ������ ���� �����̴�
/* Random random = new Random();
 * int count[] = new int [6];
 * 
 * for(int i = 0; i<10000; i++){
 * int number = random.nextInt(6)+1;
 * if(number ==1){
 * count[0]++;
 * }else if(number==2){
 * count[1]++;
 * }else if(number==3){
 * count[2]++;
 * }else if(number==4){
 * count[3]++;
 * }else if(number==5){
 * count[4]++;
 * }else{
 * count[5]++;
 * }
 * }
 * for(int i=0; i<count.length;i++){
 * syso(count[i] +" ");
 * }
 * }
 * }
 */
