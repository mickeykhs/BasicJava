package chapter09.sec02.exam02;

public class SearchableExample {
	public static void main(String[] args) {
		new Searchable() {
			public void search(String url) {
				System.out.println(url);
			}
		}.search("홍길동");
	}
}
//이런 방식도 가능하다 변수없이 메소드 호출하여 출력..