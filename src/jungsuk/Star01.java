package jungsuk;

public class Star01 {
	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
		int x = 1;
		int y = 1;
		while(x<11) {
			
			while(y<=x) {
				System.out.print("*");
				y +=1;
			}
			System.out.println();
			x +=1;
			y =1;
		}
	}
}
