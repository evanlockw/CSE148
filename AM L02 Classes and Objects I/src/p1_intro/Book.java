package p1_intro;

public class Book {
	// Cat 1: Describe the STATE of an object
	
	// properties, attributes, instance variables, fields, instance fields
	// purpose: to store data about an object
	private String title; // noun
	private double price;
	private String[] authorNames;
	private String coverColor;
	private double weight;
	private int numberOfPages;
	private boolean isEnglish;
	
	// static variables, class variables
	// they hold values for the entire class
	private static String publisher = "Pearson";
	
	// Cat 2: Describe the BEHAVIOR of an object
	// we call them methods
	
	
	// constructor, allows to set initial values for the new object
	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}
	
	public Book() {
		title = "All time title";
		price = 200.00;
		
	}
	
	public void setTitle(String title) { // setter, mutator
		this.title = title;
	}
	
	public String getTitle() { // getter, accessor
		return title;
	}
	
	public void setPrice(double price) { // setter, mutator
		if (price < 0.0) {
			this.price = 0.0;
		} else {
			this.price = price;
		}
	}
	
	public void discountPrice(double discountRate) {
		price = price * (1.0 - discountRate);
	}
	
	public double getPrice() { // getter, accessor
		return price;
	}

	public String toString() {
		return "TITLE: " + title + ": PRICE: $" + price;
	}
}
