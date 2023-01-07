package chapter08.exercise.practice03;

public abstract class Book implements Comparable<Book>{
	//�ʵ�
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 0;
	
	//������
	public Book(String title, String author){
		this.title =title;
		this.author = author;
		countOfBooks++;
		this.number = countOfBooks;
	}
	
	//�޼ҵ�
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	public boolean equals(Book o) {
		if(title.equals(o.title) && author.equals(o.author)) {
			return true;
		} else {
			return false;
		}
	}
	/** <equals �����>
	 * public boolean equals(Object obj){
	 * 	Book book = null;
	 * 	if(obj instanceof Book){
	 * 		Book book =(Book)obj;
	 * 	}
	 * 	else if(this.author.equals(book.author)&& this.title.equals(book.titlr)){
	 *      return true;
	 * 	} else {
	 * 		return false;
	 * 	}
	 * }
	 * 
	 * �Ǵ�  public boolean equals(Object obj){
	 * 			return this.author.equals(book.author) && this.title.equals(book.title);
	 */
	
	
	
	public abstract int getLateFee(int lateDays);

	@Override
	public String toString() {
		return String.format("������ȣ %d��, ����: %s, �۰�: %s (������ ��ü��: %,d��)", number,title,author,getLateFee(7));
	}
	
}
