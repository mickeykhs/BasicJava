package chapter08.exercise.practice03;

public class ScienceFiction extends Book{

	public ScienceFiction(String title, String author) {
		super(title, author);
	}
	public int getLateFee(int lateDays) {
		return 600*lateDays;
	}
	@Override
	public int compareTo(Book o) {
		return 0;
	}
}
