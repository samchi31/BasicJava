package chapter08.exercise;

public class Poet extends Book {

	public Poet(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int lateDays) {
		return 200*lateDays;
	}
	
	@Override
	public String toString() {
		return super.toString() +"일주일 연체료 :" +this.getLateFee(7);
	}
}
