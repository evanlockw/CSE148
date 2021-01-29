package p1_intro;

public class Demo {

	public static void main(String[] args) {
//		Book javaBook = new Book();
//		javaBook.setTitle("Java");
//		javaBook.setPrice(100.0);
//		System.out.println(javaBook.getTitle() + "\t " + javaBook.getPrice());
//		javaBook.discountPrice(0.2);
//		System.out.println(javaBook.getTitle() + "\t " + javaBook.getPrice());
		
		
		Book javascriptBook = new Book("Intro to Javascript", 99.99);
		
//		System.out.println(javascriptBook.getTitle() + "\t " + javascriptBook.getPrice());
		System.out.println(javascriptBook);
		javascriptBook.discountPrice(0.5);
//		System.out.println(javascriptBook.getTitle() + "\t " + javascriptBook.getPrice());
		System.out.println(javascriptBook);
		
		
		Book b = new Book();
		
//		System.out.println(b.getTitle() + "\t " + b.getPrice());
		System.out.println(b);
		b.discountPrice(0.5);
		System.out.println(b.getTitle() + "\t " + b.getPrice());
		System.out.println(b.toString());
	}

}
