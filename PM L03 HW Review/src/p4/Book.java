package p4;

public class Book {
	private String title; // instance variable, holding value for the object
	private double price;

	public Book(String title, double price) { // local variable to bring in new string value
		this.title = title;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public double getPrice() {
		return price;
	}
}
