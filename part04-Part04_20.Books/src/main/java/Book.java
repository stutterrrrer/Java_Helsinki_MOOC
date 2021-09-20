public class Book {
	private String title;
	private int pages;
	private int year;

	public Book(String title, int pages, int year) {
		this.title = title;
		this.pages = pages;
		this.year = year;
	}

	public String toString() {
		// you can leave out "this." before the instance variables?
		return title + ", " + pages + " pages, " + year;
	}

	public String getTitle() {
		return title;
	}
}
