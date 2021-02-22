package p2;

public class StudentHelper {
	
	private static String[] majors = {"ENG", "SOC", "ART", "ANT", "PED", "PHY", "CHE", "BIO", "CSE", "ENS", "MAT"};
	private static String[] firstNames = {"Alan", "Bill", "Cathy", "Dave", "Frankie", "Ellen", "Gary"};
	private static String[] lastNames = {"Joyce", "Kirkpatrick", "Zhang", "Hudson","Simpson",
			"Cannon", "Silva","Sweeney","Cochran","Ellwood","Henderson","Mcmillan","Craft","Stokes", "Jimenez", "Hale"};
	
	public static String getRandomFirstName() {
		return firstNames[(int)(Math.random() * firstNames.length)];
	}

	public static String getRandomLastName() {
		return lastNames[(int)(Math.random() * lastNames.length)];
	}

	public static double getRandomGPA() {
		return Math.random() * 4.0;
	}

	public static String getRandomMajor() {
		return majors[(int)(Math.random() * majors.length)];
	}

	public static Course[] getRandomCourseArr() {
		int randomNumber = 1 + (int)(Math.random() * 4);
		Course[] randomCourses = new Course[randomNumber];
		for(int i = 0; i < randomNumber; i++) {
			randomCourses[i] = new Course(CourseHelper.getRandomCourseNumber(), 
					CourseHelper.getRandomCourseTitle(30), 
					CourseHelper.getRandomDescription(100), 
					CourseHelper.getRandomCredits(4), 
					TextbookHelper.getRandomTextbook());
		}
		return randomCourses;
	}
	
	public static Student getRandomStudent() {
		Student s1 = new Student(StudentHelper.getRandomFirstName(), 
				StudentHelper.getRandomLastName(), StudentHelper.getRandomGPA(), 
				StudentHelper.getRandomMajor(), StudentHelper.getRandomCourseArr());
		return s1;
	}
}
