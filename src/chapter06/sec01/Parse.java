package chapter06.sec01;

public class Parse {
	public static void main(String[] args) {
		String str = "3";
		int value = Integer.parseInt(str);
		int count =3;
		for(int i = 0; i<value; i++) {
			count++;
		}
		System.out.println(value+count);
	}
}
