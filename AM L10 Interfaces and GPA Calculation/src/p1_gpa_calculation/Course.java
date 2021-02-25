package p1_gpa_calculation;

public class Course {
	private String number;
	private int credits;
	private String letterGrade;

	public Course(String number, int credits, String letterGrade) {
		super();
		this.number = number;
		this.credits = credits;
		this.letterGrade = letterGrade;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getLetterGrade() {
		return letterGrade;
	}

	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}

	@Override
	public String toString() {
		return "Course [number=" + number + ", credits=" + credits + ", letterGrade=" + letterGrade + ", getNumber()="
				+ getNumber() + ", getCredits()=" + getCredits() + ", getLetterGrade()=" + getLetterGrade()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
