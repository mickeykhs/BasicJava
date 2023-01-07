package chapter02;

public class EscapeExample {
	public static void main(String[] args) {
		System.out.println("번호\t이름\t직업");   //    \t -> 탭만큼 띄움
		System.out.println("행 단위 출력\n");   //   \n -> 줄 바꿈
		System.out.println("행 단위 출력\n");   
		System.out.println("우리는 \"개발자\" 입니다.");    //    \" ->  "출력
		System.out.println("봄\\여름\\가을\\겨울\n");    //  \\ ->  \출력
		
		String str = ("나는 \"자바\"를 좋아합니다");
		System.out.println(str);
	}

}
