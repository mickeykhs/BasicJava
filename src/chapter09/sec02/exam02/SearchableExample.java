package chapter09.sec02.exam02;

public class SearchableExample {
	public static void main(String[] args) {
		new Searchable() {
			public void search(String url) {
				System.out.println(url);
			}
		}.search("ȫ�浿");
	}
}
//�̷� ��ĵ� �����ϴ� �������� �޼ҵ� ȣ���Ͽ� ���..