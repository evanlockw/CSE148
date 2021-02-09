package p4;

public class Helper {
	
	public static String getTitle(int min, int max) {
		String result = "";
		int randomNumber = min + (int) (Math.random() * (max-min+1));
		for (int i = 0; i < randomNumber; i++) {
			result += (char) (65 + (int) (Math.random() * 26));
		}
		return result;
	}
	
	public static double getPrice() {
		return (Math.random() * 100);
	}
}
