package p2;

public class Textbook {
	private String title;
	private String isbn;
	private double price;
	private Name authorName;
	
	public Textbook(String title, String isbn, double price, String firstName, String lastName) {
		super();
		this.title = title;
		this.isbn = isbn;
		this.price = price;
		this.authorName = new Name(firstName, lastName);
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

	public Name getAuthorName() {
		return authorName;
	}

	public void setAuthorName(Name authorName) {
		this.authorName = authorName;
	}

	@Override
	public String toString() {
		return "Textbook [" + title + ", " + isbn + ", " + price + ", " + authorName + "]";
	}
	
	
	
}
