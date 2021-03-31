package p3_hw5_5;

public class CourseTaken {
	
	private String courseNumber;
	private String courseTitle;
	private int numberOfCredits;
	private String letterGrade;
	
	public CourseTaken(String courseNumber, String courseTitle, int numberOfCredits, String letterGrade) {
		super();
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.numberOfCredits = numberOfCredits;
		this.letterGrade = letterGrade;
	}

	public double getGradePoint() {
		return Utilities.convertLetterGrade(letterGrade);
	}
	
	public String getCourseNumber() {
		return courseNumber;
	}

	public void setCourseNumber(String courseNumber) {
		this.courseNumber = courseNumber;
	}

	public String getCourseTitle() {
		return courseTitle;
	}

	public void setCourseTitle(String courseTitle) {
		this.courseTitle = courseTitle;
	}

	public int getNumberOfCredits() {
		return numberOfCredits;
	}

	public void setNumberOfCredits(int numberOfCredits) {
		this.numberOfCredits = numberOfCredits;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	@Override
	public String toString() {
		return "CourseTaken [courseNumber=" + courseNumber + ", courseTitle=" + courseTitle + ", numberOfCredits="
				+ numberOfCredits + ", letterGrade=" + letterGrade + "]";
	}
	
	
}
