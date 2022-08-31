package chapter08.exercise;

public abstract class Book {
	private int number;
	private String title;
	private String author;
	private int countOfBooks;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		number = countOfBooks;
		countOfBooks++;
	}

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
	
	public abstract int getLateFee(int lateDays);
	
	public boolean equals(Book o) {
		if(this.getTitle().equals(o.getTitle())
				&& this.getAuthor().equals(o.getAuthor())) {
			return true;
		}
		return false;
	}
	
	public int hashCode() {
		return 0;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}
	
}
