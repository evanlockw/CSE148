package p1_gpa_calculation;

import java.util.Arrays;

public class Student implements StudentInterface {
	private String name;
	private double gpa;
	private Course[] coursesTook;

	public Student(String name, Course[] coursesTook) {
		super();
		this.name = name;
		this.coursesTook = coursesTook;
		gpa = calculateGPA();
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + ", coursesTook=" + Arrays.toString(coursesTook) + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Course[] getCoursesTook() {
		return coursesTook;
	}

	public void setCoursesTook(Course[] coursesTook) {
		this.coursesTook = coursesTook;
	}

	@Override
	public double calculateGPA() {
		double gradePoint = 0.0;
		int totalCredits = 0;

		for (int i = 0; i < coursesTook.length; i++) {
			gradePoint = gradePoint
					+ (convertLetterGrade(coursesTook[i].getLetterGrade()) * coursesTook[i].getCredits());
			totalCredits += coursesTook[i].getCredits();
		}
		gpa = gradePoint / totalCredits;
		return gpa;
	}

	private double convertLetterGrade(String letterGrade) {
		if (letterGrade.equals("A")) {
			return 4.0;
		} else if (letterGrade.equals("B+")) {
			return 3.5;
		} else if (letterGrade.equals("B")) {
			return 3.0;
		} else if (letterGrade.equals("C+")) {
			return 2.5;
		} else if (letterGrade.equals("C")) {
			return 2.0;
		} else if (letterGrade.equals("D+")) {
			return 1.5;
		} else if (letterGrade.equals("D")) {
			return 1.0;
		} else {
			return 0.0;
		}
	}

}
