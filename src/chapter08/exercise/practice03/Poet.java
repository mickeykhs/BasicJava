package chapter08.exercise.practice03;

public class Poet extends Book{

	public Poet(String title, String author) {
		super(title, author);
	}
	public int getLateFee(int lateDays) {
		return 200*lateDays;
	}
	@Override
	public int compareTo(Book o) {
		return 0;
	}
}
