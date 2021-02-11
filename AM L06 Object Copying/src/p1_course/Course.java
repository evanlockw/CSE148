package p1_course;

public class Course {
	private String number; // CSE148
	private String title; // OOP
	private int credits; // 4
	private Instructor instructor; // "has a"
	private Textbook textbook; // "has a"

	public Course(String number, String title, int credits, Instructor instructor, Textbook textbook) {
		super();
		this.number = number;
		this.title = title;
		this.credits = credits;
		this.instructor = instructor;
		this.textbook = textbook;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public Textbook getTextbook() {
		return textbook;
	}

	public void setTextbook(Textbook textbook) {
		this.textbook = textbook;
	}

	@Override
	public String toString() {
		return "Course [number=" + number + ", title=" + title + ", credits=" + credits + "\n\t" + instructor
				+ "\n\t" + textbook + "]";
	}
	
	

}
