package chapter08.exercise;

import java.util.Objects;

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

//	public boolean equals(Book o) {
//		if(this.getTitle().equals(o.getTitle())
//				&& this.getAuthor().equals(o.getAuthor())) {
//			return true;
//		}
//		return false;
//	}

//	public boolean equals(Object o) {
////		Book book = (Book)o;
////		if (this.getTitle().equals(book.title) && this.getAuthor().equals(book.getAuthor())) {
////			return true;
////		}
//		Book book = (Book)o;
//		if (this.getTitle().equals(((Book)o).title) && this.getAuthor().equals(((Book)o).getAuthor())) {
//			return true;
//		}
//		return false;
//	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Book)) {
			return false;
		}
		Book book = (Book) obj;
		
		return Objects.equals(author, book.author) && Objects.equals(title, book.title);
	}

	public int hashCode() {
		return 0;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + "]";
	}

}
