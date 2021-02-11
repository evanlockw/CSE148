package p1_course;

public class Textbook {
	private String title;
	private String isbn;
	private double price;

	public Textbook(String title, String isbn, double price) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
	}
	
	// deep copy constructor
	public Textbook(Textbook textbook) {
		this.title = textbook.title;
		this.isbn = textbook.isbn;
		this.price = textbook.price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Textbook [title=" + title + ", isbn=" + isbn + ", price=" + price + "]";
	}

}
