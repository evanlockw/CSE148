package p4;

// Helper class: A toolbox storing methods (i.e. tools)
// A method: A set of instructions. It should be explicitly named for its purpose.
// It usually takes input and returns a value
// 
//  
public class Helper {  
		private static final int COLUMN1_WIDTH = 12;
		private static final int COLUMN2_WIDTH = 12;
		private static final int COLUMN3_WIDTH = 10;
		private static final int TABLE_WIDTH = COLUMN1_WIDTH + COLUMN2_WIDTH + COLUMN3_WIDTH;
		
		private static final int UPPER_PRICE_LIMIT = 100;

		// abstraction
		public static String getTitle(int min, int max) {
			String title = "";
			int randomNumber = min + (int)(Math.random() * (max - min + 1));
			for (int i = 0; i < randomNumber; i++) {
				title += (char) (65 + Math.random() * 26);
			}
			return title;
		}
		
		public static double getPrice(int upperPriceLimit) {
			return Math.random() * upperPriceLimit;
		}
		
		public static void displayBooks(Book[] books) {
			displayHeader();
			for(int i = 0; i < books.length; i++) {
				System.out.printf("%" + COLUMN1_WIDTH + "d%" + COLUMN2_WIDTH + "s%" + COLUMN3_WIDTH + ".2f%n", (i+1), books[i].getTitle(), books[i].getPrice());
			}
		}
		
		public static void displayHeader() {
			System.out.printf("%" + COLUMN1_WIDTH + "S%" + COLUMN2_WIDTH + "S%" + COLUMN3_WIDTH + "S%n", "Serial Number", "Book Title", "Book Price");
			for(int i  =0; i < TABLE_WIDTH; i++) {
				System.out.print("-");
			}
			System.out.println();
		}
		
		public static Book[] createBooks(int numberOfBooks) {
			Book[] books = new Book[numberOfBooks];
			
			for (int i = 0; i < numberOfBooks; i++) {
				Book book = new Book(Helper.getTitle(1, 5), Helper.getPrice(UPPER_PRICE_LIMIT));
				books[i] = book;
			}
			return books;
		}
}
