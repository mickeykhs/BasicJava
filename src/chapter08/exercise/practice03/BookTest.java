package chapter08.exercise.practice03;

public class BookTest {
	public static void main(String[] args) {
		System.out.println("<���� ���� ���>");
		Book[] books = new Book[6];
		books[0] = new Novel("Į�� �뷡", "����");
		books[1] = new Novel("Į�� �뷡", "����");
		books[2] = new Poet("�̻��� ��������", "�̻�");
		books[3] = new Poet("�ϴð� �ٶ��� ���� ��", "������");
		books[4] = new ScienceFiction("������� ��", "�Ƽ� C. Ŭ��ũ");
		books[5] = new ScienceFiction("�����̽� ������", "�Ƽ� C. Ŭ��ũ");
		for (Book b: books){
			System.out.println(b);
		}
		System.out.println("1�� å�� 2�� å�� ���� å�ΰ���?" + books[0].equals(books[1]));
	}
}
