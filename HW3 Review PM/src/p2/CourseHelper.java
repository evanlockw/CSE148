package p2;

public class CourseHelper {

	public static String getRandomCourseNumber() {
		return StudentHelper.getRandomMajor() + (100 + (int)(Math.random() * 200));
	}
	
	public static String getRandomCourseTitle(int titleLength) {
		String randomTitle = "";
		for (int i = 0; i < titleLength; i++) {
			randomTitle += (char) (97 + (int)(Math.random() * 26)); // 97 -- 122
		}
		return randomTitle;
	}
	
	public static String getRandomDescription(int descriptionLength) {
		String description = "";
		for (int i = 0; i < descriptionLength; i++) {
			description += (char) (97 + (int)(Math.random() * 26)); // 97 -- 122
		}
		return description;
	}
	
	public static int getRandomCredits(int creditCap) {
		return 1 + (int)(Math.random() * (creditCap));
	}
	
}
