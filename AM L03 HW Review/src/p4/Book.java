package p4;

public class Book {
	private String title; // instance variable holding value for objects
	private double price;
	
	public Book(String title, double price) { // local variables bringing values to instance variables
		this.title = title;
		this.price = price;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getTitle() {
		return title;
	}
	
	public double getPrice() {
		return price;
	}
	
	
}
