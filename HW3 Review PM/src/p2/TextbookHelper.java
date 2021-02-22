package p2;

public class TextbookHelper {
	private static String[] firstNames = {"Alan", "Bill", "Cathy", "Dave", "Frankie", "Ellen", "Gary"};
	private static String[] lastNames = {"Joyce", "Kirkpatrick", "Zhang", "Hudson","Simpson",
			"Cannon", "Silva","Sweeney","Cochran","Ellwood","Henderson","Mcmillan","Craft","Stokes", "Jimenez", "Hale"};
	
	public static String getRandomFirstName() {
		return firstNames[(int)(Math.random() * firstNames.length)];
	}

	public static String getRandomLastName() {
		return lastNames[(int)(Math.random() * lastNames.length)];
	}
	
	public static Textbook getRandomTextbook() {
		return new Textbook(getRandomTitle(30), getRandomISBN(13), getRandomPrice(200), getRandomFirstName(), getRandomLastName() );
	}

	public static String getRandomTitle(int titleLength) {
		String randomTitle = "";
		for (int i = 0; i < titleLength; i++) {
			randomTitle += (char) (97 + (int)(Math.random() * 26)); // 97 -- 122
		}
		return randomTitle;
	}
	
	public static String getRandomISBN(int isbnLength) {
		String randomISBN = "";
		for (int i = 0; i < isbnLength; i++) {
			randomISBN += (char) (48 + (int)(Math.random() * 10)); // 97 -- 122
		}
		return randomISBN;
	}
	
	public static double getRandomPrice(int priceCap) {
		return 1 + Math.random() * (priceCap-1);
	}
}
