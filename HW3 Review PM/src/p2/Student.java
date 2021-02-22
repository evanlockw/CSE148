package p2;

import java.util.Arrays;

public class Student {
	private Name name;
	private double gpa;
	private String major;
	private Course[] courses;

	public Student(String firstName, String lastName, double gpa, String major, Course[] courses) {
		super();
		this.name = new Name(firstName, lastName);
		this.gpa = gpa;
		this.major = major;
		this.courses = courses;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public Course[] getCourses() {
		return courses;
	}

	public void setCourses(Course[] courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student [" + name + ", gpa=" + gpa + ", major=" + major + ", courses=" + Arrays.toString(courses)
				+ "]";
	}
	
	

}
