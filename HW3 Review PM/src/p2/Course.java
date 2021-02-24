package p2;

public class Course {
	private String courseNumber;
	private String courseTitle;
	private String description;
	private double credits;
	private Textbook textbook;

	public Course(String courseNumber, String courseTitle, String description, double credits, Textbook textbook) {
		super();
		this.courseNumber = courseNumber;
		this.courseTitle = courseTitle;
		this.description = description;
		this.credits = credits;
		this.textbook = textbook;
	}

	@Override
	public String toString() {
		return "Course [courseNumber=" + courseNumber + ", courseTitle=" + courseTitle + ", description=" + description
				+ ", credits=" + credits + ", textbook=" + textbook + "]";
	}

}
