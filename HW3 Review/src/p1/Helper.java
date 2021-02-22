package p1;

public class Helper {
	
	private static String[] firstNames = {"A", "B", "C", "D", "E", "F"};
	private static String[] lastNames = {"a", "b", "c", "d", "e", "f"};
	private static String[] ranks = {"Assistant Professor", "Associate Professor", "Professor", "Instructor"};
	
	public static String getRandomFirstName() {
		return firstNames[(int)(Math.random() * firstNames.length)];
	}
	
	public static String getRandomLastName() {
		return lastNames[(int)(Math.random() * lastNames.length)];
	}
	
	public static double getRandomGPA() {
		return Math.random() * 4.0;
	}
	
	public static String getRandomRank() {
		return ranks[(int)(Math.random() * ranks.length)];
	}
}
