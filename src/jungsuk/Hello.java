package jungsuk;

public class Hello {
	public static void main(String[] args) {
		System.out.println("�ȳ�, Java!!");
		
		//������ ���
		int d = 2;
		int y = 1;
		
		while(d<10) {
			System.out.println(d+"��");
			while(y<10) {
				System.out.println(d + "*" + y +"=" +d*y);
				y += 1;
			}
			d += 1;
			y = y-9;
		}
	}
}
