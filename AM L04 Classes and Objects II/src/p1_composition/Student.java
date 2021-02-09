package p1_composition;

public class Student {
	// instance variables, fields: holding data for objects
	private Name name; // package (default) access
	private double gpa;

	public Student(Name name, double gpa) {
		super();
		this.name = name;
		this.gpa = gpa;
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

	@Override
	public String toString() {
		return "Student [name=" + name + ", gpa=" + gpa + "]";
	}

}
