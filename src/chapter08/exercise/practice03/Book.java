package chapter08.exercise.practice03;

public abstract class Book implements Comparable<Book>{
	//필드
	private int number;
	private String title;
	private String author;
	private static int countOfBooks = 0;
	
	//생성자
	public Book(String title, String author){
		this.title =title;
		this.author = author;
		countOfBooks++;
		this.number = countOfBooks;
	}
	
	//메소드
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
	/** <equals 방법들>
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
	 * 또는  public boolean equals(Object obj){
	 * 			return this.author.equals(book.author) && this.title.equals(book.title);
	 */
	
	
	
	public abstract int getLateFee(int lateDays);

	@Override
	public String toString() {
		return String.format("관리번호 %d번, 제목: %s, 작가: %s (일주일 연체료: %,d원)", number,title,author,getLateFee(7));
	}
	
}
