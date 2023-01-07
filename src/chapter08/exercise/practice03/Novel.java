package chapter08.exercise.practice03;

public class Novel extends Book{

	public Novel(String title, String author) {
		super(title, author);
	}
	public int getLateFee(int lateDays) {
		return 300*lateDays;
	}
	@Override
	public int compareTo(Book o) {
		return 0;
	}
}
