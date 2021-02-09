package p1_review;

public class Student {
	// instance variables
	private String name; // reference variable: a memory location
	private double gpa;  // primitive variable: a memory location: 0.0 stored in 8 bytes directly
	
	
	public Student(String name, double gpa) {
		this.name = name;
		this.gpa = gpa;
	}

	public Student(String name) {
		this.name = name;
	}

	public Student() {
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

	@Override
	public String toString() {
		return "name=" + name + ", gpa=" + gpa + "]";
	}

	
}
