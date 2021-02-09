package p4;

public class Demo {
	private static final int NUMBER_OF_BOOKS = 1000;
	private static final int TITLE_MIN_LETTERS = 5;
	private static final int TITLE_MAX_LETTERS = 10;

	public static void main(String[] args) {
//		Book[] books = createBookArray();
//		displayBooks(books);
		displayBooks(createBookArray());
	}

	public static Book[] createBookArray() {
		Book[] books = new Book[NUMBER_OF_BOOKS];
		for (int i = 0; i < NUMBER_OF_BOOKS; i++) {
			books[i] = new Book(Helper.getTitle(TITLE_MIN_LETTERS, TITLE_MAX_LETTERS), Helper.getPrice());
		}
		return books;
	}

	public static void displayBooks(Book[] books) {
		final int COLUMN1_WIDTH = 10;
		final int COLUMN2_WIDTH = 20;
		final int COLUMN3_WIDTH = 10;
		final int TABLE_WIDTH = COLUMN1_WIDTH + COLUMN2_WIDTH + COLUMN3_WIDTH;

		final String COLUMN1_HEADER = "SN";
		final String COLUMN2_HEADER = "TITLE";
		final String COLUMN3_HEADER = "PRICE";

		System.out.printf("%" + COLUMN1_WIDTH + "s%" + COLUMN2_WIDTH + "s%" + COLUMN3_WIDTH + "s%n", COLUMN1_HEADER,
				COLUMN2_HEADER, COLUMN3_HEADER);
		for (int i = 0; i < TABLE_WIDTH; i++) {
			System.out.print("-");
		}
		System.out.println();
		for (int i = 0; i < NUMBER_OF_BOOKS; i++) {
			System.out.printf("%" + COLUMN1_WIDTH + "d%" + COLUMN2_WIDTH + "s%" + COLUMN3_WIDTH + ".2f%n", (i + 1),
					books[i].getTitle(), books[i].getPrice());

		}
	}

}
